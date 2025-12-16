package org.tensorflow.lite;

import AK.c;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.tensorflow.lite.InterpreterApi;
import org.tensorflow.lite.InterpreterImpl;
import org.tensorflow.lite.annotations.UsedByReflection;
import org.tensorflow.lite.nnapi.NnApiDelegate;

/* loaded from: classes7.dex */
class NativeInterpreterWrapper implements AutoCloseable {
    private static final int ERROR_BUFFER_SIZE = 512;
    private static final RuntimeFlavor RUNTIME_FLAVOR = RuntimeFlavor.APPLICATION;
    private long cancellationFlagHandle;
    private final List<Delegate> delegates;
    long errorHandle;

    @UsedByReflection("nativeinterpreterwrapper_jni.cc")
    private long inferenceDurationNanoseconds;
    private TensorImpl[] inputTensors;
    private Map<String, Integer> inputsIndexes;
    long interpreterHandle;
    private boolean isMemoryAllocated;
    private ByteBuffer modelByteBuffer;
    private long modelHandle;
    private boolean originalGraphHasUnresolvedFlexOp;
    private TensorImpl[] outputTensors;
    private Map<String, Integer> outputsIndexes;
    private final List<Delegate> ownedDelegates;
    private Map<String, NativeSignatureRunnerWrapper> signatureRunnerMap;

    public NativeInterpreterWrapper(String str) {
        this(str, (InterpreterImpl.Options) null);
    }

    private void addDelegates(InterpreterImpl.Options options) {
        Delegate delegateMaybeCreateFlexDelegate;
        if (this.originalGraphHasUnresolvedFlexOp && (delegateMaybeCreateFlexDelegate = maybeCreateFlexDelegate(options.getDelegates())) != null) {
            this.ownedDelegates.add(delegateMaybeCreateFlexDelegate);
            this.delegates.add(delegateMaybeCreateFlexDelegate);
        }
        addUserProvidedDelegates(options);
        Iterator<DelegateFactory> it = options.getDelegateFactories().iterator();
        while (it.hasNext()) {
            Delegate delegateCreate = it.next().create(RUNTIME_FLAVOR);
            this.ownedDelegates.add(delegateCreate);
            this.delegates.add(delegateCreate);
        }
        if (options.getUseNNAPI()) {
            NnApiDelegate nnApiDelegate = new NnApiDelegate();
            this.ownedDelegates.add(nnApiDelegate);
            this.delegates.add(nnApiDelegate);
        }
    }

    private void addUserProvidedDelegates(InterpreterImpl.Options options) {
        for (Delegate delegate : options.getDelegates()) {
            if (options.getRuntime() != InterpreterApi.Options.TfLiteRuntime.FROM_APPLICATION_ONLY && !(delegate instanceof NnApiDelegate)) {
                throw new IllegalArgumentException("Instantiated delegates (other than NnApiDelegate) are not allowed when using TF Lite from Google Play Services. Please use InterpreterApi.Options.addDelegateFactory() with an appropriate DelegateFactory instead.");
            }
            this.delegates.add(delegate);
        }
    }

    private static native long allocateTensors(long j12, long j13);

    private boolean allocateTensorsIfNeeded() {
        if (this.isMemoryAllocated) {
            return false;
        }
        this.isMemoryAllocated = true;
        allocateTensors(this.interpreterHandle, this.errorHandle);
        for (TensorImpl tensorImpl : this.outputTensors) {
            if (tensorImpl != null) {
                tensorImpl.refreshShape();
            }
        }
        return true;
    }

    private static native void allowBufferHandleOutput(long j12, boolean z12);

    private static native void allowFp16PrecisionForFp32(long j12, boolean z12);

    private static native long createCancellationFlag(long j12);

    private static native long createErrorReporter(int i12);

    private static native long createInterpreter(long j12, long j13, int i12, boolean z12, List<Long> list);

    private static native long createModel(String str, long j12);

    private static native long createModelWithBuffer(ByteBuffer byteBuffer, long j12);

    private static native void delete(long j12, long j13, long j14);

    private static native long deleteCancellationFlag(long j12);

    private static native int getExecutionPlanLength(long j12);

    private static native int getInputCount(long j12);

    private static native String[] getInputNames(long j12);

    private static native int getInputTensorIndex(long j12, int i12);

    private static native int getOutputCount(long j12);

    private static native String[] getOutputNames(long j12);

    private static native int getOutputTensorIndex(long j12, int i12);

    private static native String[] getSignatureKeys(long j12);

    private NativeSignatureRunnerWrapper getSignatureRunnerWrapper(String str) {
        if (this.signatureRunnerMap == null) {
            this.signatureRunnerMap = new HashMap();
        }
        if (!this.signatureRunnerMap.containsKey(str)) {
            this.signatureRunnerMap.put(str, new NativeSignatureRunnerWrapper(this.interpreterHandle, this.errorHandle, str));
        }
        return this.signatureRunnerMap.get(str);
    }

    private static native boolean hasUnresolvedFlexOp(long j12);

    private void init(long j12, long j13, InterpreterImpl.Options options) {
        if (options == null) {
            options = new InterpreterImpl.Options();
        }
        if (options.getAccelerationConfig() != null) {
            options.getAccelerationConfig().apply(options);
        }
        this.errorHandle = j12;
        this.modelHandle = j13;
        ArrayList arrayList = new ArrayList();
        long jCreateInterpreter = createInterpreter(j13, j12, options.getNumThreads(), options.getUseXNNPACK(), arrayList);
        this.interpreterHandle = jCreateInterpreter;
        this.originalGraphHasUnresolvedFlexOp = hasUnresolvedFlexOp(jCreateInterpreter);
        addDelegates(options);
        initDelegatesWithInterpreterFactory();
        arrayList.ensureCapacity(this.delegates.size());
        Iterator<Delegate> it = this.delegates.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().getNativeHandle()));
        }
        if (!arrayList.isEmpty()) {
            delete(0L, 0L, this.interpreterHandle);
            this.interpreterHandle = createInterpreter(j13, j12, options.getNumThreads(), options.getUseXNNPACK(), arrayList);
        }
        Boolean bool = options.allowFp16PrecisionForFp32;
        if (bool != null) {
            allowFp16PrecisionForFp32(this.interpreterHandle, bool.booleanValue());
        }
        Boolean bool2 = options.allowBufferHandleOutput;
        if (bool2 != null) {
            allowBufferHandleOutput(this.interpreterHandle, bool2.booleanValue());
        }
        if (options.isCancellable()) {
            this.cancellationFlagHandle = createCancellationFlag(this.interpreterHandle);
        }
        this.inputTensors = new TensorImpl[getInputCount(this.interpreterHandle)];
        this.outputTensors = new TensorImpl[getOutputCount(this.interpreterHandle)];
        Boolean bool3 = options.allowFp16PrecisionForFp32;
        if (bool3 != null) {
            allowFp16PrecisionForFp32(this.interpreterHandle, bool3.booleanValue());
        }
        Boolean bool4 = options.allowBufferHandleOutput;
        if (bool4 != null) {
            allowBufferHandleOutput(this.interpreterHandle, bool4.booleanValue());
        }
        allocateTensors(this.interpreterHandle, j12);
        this.isMemoryAllocated = true;
    }

    private void initDelegatesWithInterpreterFactory() {
        InterpreterFactoryImpl interpreterFactoryImpl = new InterpreterFactoryImpl();
        for (Delegate delegate : this.delegates) {
            if (delegate instanceof NnApiDelegate) {
                ((NnApiDelegate) delegate).initWithInterpreterFactoryApi(interpreterFactoryImpl);
            }
        }
    }

    private static Delegate maybeCreateFlexDelegate(List<Delegate> list) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("org.tensorflow.lite.flex.FlexDelegate");
            Iterator<Delegate> it = list.iterator();
            while (it.hasNext()) {
                if (cls.isInstance(it.next())) {
                    return null;
                }
            }
            return (Delegate) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            return null;
        }
    }

    private static native boolean resizeInput(long j12, long j13, int i12, int[] iArr, boolean z12);

    private static native void run(long j12, long j13);

    private static native void setCancelled(long j12, long j13, boolean z12);

    public void allocateTensors() {
        allocateTensorsIfNeeded();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        int i12 = 0;
        while (true) {
            TensorImpl[] tensorImplArr = this.inputTensors;
            if (i12 >= tensorImplArr.length) {
                break;
            }
            TensorImpl tensorImpl = tensorImplArr[i12];
            if (tensorImpl != null) {
                tensorImpl.close();
                this.inputTensors[i12] = null;
            }
            i12++;
        }
        int i13 = 0;
        while (true) {
            TensorImpl[] tensorImplArr2 = this.outputTensors;
            if (i13 >= tensorImplArr2.length) {
                break;
            }
            TensorImpl tensorImpl2 = tensorImplArr2[i13];
            if (tensorImpl2 != null) {
                tensorImpl2.close();
                this.outputTensors[i13] = null;
            }
            i13++;
        }
        delete(this.errorHandle, this.modelHandle, this.interpreterHandle);
        deleteCancellationFlag(this.cancellationFlagHandle);
        this.errorHandle = 0L;
        this.modelHandle = 0L;
        this.interpreterHandle = 0L;
        this.cancellationFlagHandle = 0L;
        this.modelByteBuffer = null;
        this.inputsIndexes = null;
        this.outputsIndexes = null;
        this.isMemoryAllocated = false;
        this.delegates.clear();
        Iterator<Delegate> it = this.ownedDelegates.iterator();
        while (it.hasNext()) {
            it.next().close();
        }
        this.ownedDelegates.clear();
    }

    public int getExecutionPlanLength() {
        return getExecutionPlanLength(this.interpreterHandle);
    }

    public int getInputIndex(String str) {
        if (this.inputsIndexes == null) {
            String[] inputNames = getInputNames(this.interpreterHandle);
            this.inputsIndexes = new HashMap();
            if (inputNames != null) {
                for (int i12 = 0; i12 < inputNames.length; i12++) {
                    this.inputsIndexes.put(inputNames[i12], Integer.valueOf(i12));
                }
            }
        }
        if (this.inputsIndexes.containsKey(str)) {
            return this.inputsIndexes.get(str).intValue();
        }
        throw new IllegalArgumentException(String.format("Input error: '%s' is not a valid name for any input. Names of inputs and their indexes are %s", str, this.inputsIndexes));
    }

    public TensorImpl getInputTensor(int i12) {
        if (i12 >= 0) {
            TensorImpl[] tensorImplArr = this.inputTensors;
            if (i12 < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i12];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j12 = this.interpreterHandle;
                TensorImpl tensorImplFromIndex = TensorImpl.fromIndex(j12, getInputTensorIndex(j12, i12));
                tensorImplArr[i12] = tensorImplFromIndex;
                return tensorImplFromIndex;
            }
        }
        throw new IllegalArgumentException(c.g(i12, "Invalid input Tensor index: "));
    }

    public int getInputTensorCount() {
        return this.inputTensors.length;
    }

    public Long getLastNativeInferenceDurationNanoseconds() {
        long j12 = this.inferenceDurationNanoseconds;
        if (j12 < 0) {
            return null;
        }
        return Long.valueOf(j12);
    }

    public int getOutputIndex(String str) {
        if (this.outputsIndexes == null) {
            String[] outputNames = getOutputNames(this.interpreterHandle);
            this.outputsIndexes = new HashMap();
            if (outputNames != null) {
                for (int i12 = 0; i12 < outputNames.length; i12++) {
                    this.outputsIndexes.put(outputNames[i12], Integer.valueOf(i12));
                }
            }
        }
        if (this.outputsIndexes.containsKey(str)) {
            return this.outputsIndexes.get(str).intValue();
        }
        throw new IllegalArgumentException(String.format("Input error: '%s' is not a valid name for any output. Names of outputs and their indexes are %s", str, this.outputsIndexes));
    }

    public TensorImpl getOutputTensor(int i12) {
        if (i12 >= 0) {
            TensorImpl[] tensorImplArr = this.outputTensors;
            if (i12 < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i12];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j12 = this.interpreterHandle;
                TensorImpl tensorImplFromIndex = TensorImpl.fromIndex(j12, getOutputTensorIndex(j12, i12));
                tensorImplArr[i12] = tensorImplFromIndex;
                return tensorImplFromIndex;
            }
        }
        throw new IllegalArgumentException(c.g(i12, "Invalid output Tensor index: "));
    }

    public int getOutputTensorCount() {
        return this.outputTensors.length;
    }

    public String[] getSignatureInputs(String str) {
        return getSignatureRunnerWrapper(str).inputNames();
    }

    public String[] getSignatureKeys() {
        return getSignatureKeys(this.interpreterHandle);
    }

    public String[] getSignatureOutputs(String str) {
        return getSignatureRunnerWrapper(str).outputNames();
    }

    public void resizeInput(int i12, int[] iArr) {
        resizeInput(i12, iArr, false);
    }

    public void run(Object[] objArr, Map<Integer, Object> map) {
        this.inferenceDurationNanoseconds = -1L;
        if (objArr == null || objArr.length == 0) {
            throw new IllegalArgumentException("Input error: Inputs should not be null or empty.");
        }
        if (map == null) {
            throw new IllegalArgumentException("Input error: Outputs should not be null.");
        }
        for (int i12 = 0; i12 < objArr.length; i12++) {
            int[] inputShapeIfDifferent = getInputTensor(i12).getInputShapeIfDifferent(objArr[i12]);
            if (inputShapeIfDifferent != null) {
                resizeInput(i12, inputShapeIfDifferent);
            }
        }
        boolean zAllocateTensorsIfNeeded = allocateTensorsIfNeeded();
        for (int i13 = 0; i13 < objArr.length; i13++) {
            getInputTensor(i13).setTo(objArr[i13]);
        }
        long jNanoTime = System.nanoTime();
        run(this.interpreterHandle, this.errorHandle);
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (zAllocateTensorsIfNeeded) {
            for (TensorImpl tensorImpl : this.outputTensors) {
                if (tensorImpl != null) {
                    tensorImpl.refreshShape();
                }
            }
        }
        for (Map.Entry<Integer, Object> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                getOutputTensor(entry.getKey().intValue()).copyTo(entry.getValue());
            }
        }
        this.inferenceDurationNanoseconds = jNanoTime2;
    }

    public void runSignature(Map<String, Object> map, Map<String, Object> map2, String str) {
        this.inferenceDurationNanoseconds = -1L;
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Input error: Inputs should not be null or empty.");
        }
        if (map2 == null) {
            throw new IllegalArgumentException("Input error: Outputs should not be null.");
        }
        NativeSignatureRunnerWrapper signatureRunnerWrapper = getSignatureRunnerWrapper(str);
        if (signatureRunnerWrapper.getSubgraphIndex() == 0) {
            Object[] objArr = new Object[map.size()];
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                objArr[signatureRunnerWrapper.getInputIndex(entry.getKey())] = entry.getValue();
            }
            TreeMap treeMap = new TreeMap();
            for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                treeMap.put(Integer.valueOf(signatureRunnerWrapper.getOutputIndex(entry2.getKey())), entry2.getValue());
            }
            run(objArr, treeMap);
            return;
        }
        for (Map.Entry<String, Object> entry3 : map.entrySet()) {
            int[] inputShapeIfDifferent = getInputTensor(entry3.getKey(), str).getInputShapeIfDifferent(entry3.getValue());
            if (inputShapeIfDifferent != null) {
                try {
                    signatureRunnerWrapper.resizeInput(entry3.getKey(), inputShapeIfDifferent);
                } catch (IllegalArgumentException e12) {
                    throw ((IllegalArgumentException) new IllegalArgumentException(String.format("Tensor passed for input '%s' of signature '%s' has different shape than expected", entry3.getKey(), str)).initCause(e12));
                }
            }
        }
        signatureRunnerWrapper.allocateTensorsIfNeeded();
        for (Map.Entry<String, Object> entry4 : map.entrySet()) {
            signatureRunnerWrapper.getInputTensor(entry4.getKey()).setTo(entry4.getValue());
        }
        long jNanoTime = System.nanoTime();
        signatureRunnerWrapper.invoke();
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        for (Map.Entry<String, Object> entry5 : map2.entrySet()) {
            if (entry5.getValue() != null) {
                signatureRunnerWrapper.getOutputTensor(entry5.getKey()).copyTo(entry5.getValue());
            }
        }
        this.inferenceDurationNanoseconds = jNanoTime2;
    }

    public void setCancelled(boolean z12) {
        long j12 = this.cancellationFlagHandle;
        if (j12 == 0) {
            throw new IllegalStateException("Cannot cancel the inference. Have you called InterpreterApi.Options.setCancellable?");
        }
        setCancelled(this.interpreterHandle, j12, z12);
    }

    public NativeInterpreterWrapper(ByteBuffer byteBuffer) {
        this(byteBuffer, (InterpreterImpl.Options) null);
    }

    public void resizeInput(int i12, int[] iArr, boolean z12) {
        if (resizeInput(this.interpreterHandle, this.errorHandle, i12, iArr, z12)) {
            this.isMemoryAllocated = false;
            TensorImpl tensorImpl = this.inputTensors[i12];
            if (tensorImpl != null) {
                tensorImpl.refreshShape();
            }
        }
    }

    public NativeInterpreterWrapper(String str, InterpreterImpl.Options options) {
        this.cancellationFlagHandle = 0L;
        this.inferenceDurationNanoseconds = -1L;
        this.isMemoryAllocated = false;
        this.originalGraphHasUnresolvedFlexOp = false;
        this.delegates = new ArrayList();
        this.ownedDelegates = new ArrayList();
        TensorFlowLite.init();
        long jCreateErrorReporter = createErrorReporter(ERROR_BUFFER_SIZE);
        init(jCreateErrorReporter, createModel(str, jCreateErrorReporter), options);
    }

    public TensorImpl getInputTensor(String str, String str2) {
        if (str != null) {
            NativeSignatureRunnerWrapper signatureRunnerWrapper = getSignatureRunnerWrapper(str2);
            if (signatureRunnerWrapper.getSubgraphIndex() == 0) {
                return getInputTensor(signatureRunnerWrapper.getInputIndex(str));
            }
            return signatureRunnerWrapper.getInputTensor(str);
        }
        throw new IllegalArgumentException("Invalid input tensor name provided (null)");
    }

    public TensorImpl getOutputTensor(String str, String str2) {
        if (str != null) {
            NativeSignatureRunnerWrapper signatureRunnerWrapper = getSignatureRunnerWrapper(str2);
            if (signatureRunnerWrapper.getSubgraphIndex() == 0) {
                return getOutputTensor(signatureRunnerWrapper.getOutputIndex(str));
            }
            return signatureRunnerWrapper.getOutputTensor(str);
        }
        throw new IllegalArgumentException("Invalid output tensor name provided (null)");
    }

    public NativeInterpreterWrapper(ByteBuffer byteBuffer, InterpreterImpl.Options options) {
        this.cancellationFlagHandle = 0L;
        this.inferenceDurationNanoseconds = -1L;
        this.isMemoryAllocated = false;
        this.originalGraphHasUnresolvedFlexOp = false;
        this.delegates = new ArrayList();
        this.ownedDelegates = new ArrayList();
        TensorFlowLite.init();
        if (byteBuffer != null && ((byteBuffer instanceof MappedByteBuffer) || (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()))) {
            this.modelByteBuffer = byteBuffer;
            long jCreateErrorReporter = createErrorReporter(ERROR_BUFFER_SIZE);
            init(jCreateErrorReporter, createModelWithBuffer(this.modelByteBuffer, jCreateErrorReporter), options);
            return;
        }
        throw new IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
    }
}
