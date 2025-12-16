package ru.cyberity.ml.docdetector;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.OkHttpClient;
import ru.cyberity.log.logger.Logger;
import ru.cyberity.ml.autocapture.a;
import ru.cyberity.ml.core.a;

/* compiled from: DocDetector.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00140\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u0015\u0010\u001dJ'\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010*\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b&\u0010'\u0012\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R'\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00130\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R\u0016\u00108\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R*\u0010@\u001a\u0002092\u0006\u0010:\u001a\u0002098\u0014@VX\u0094.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b\u0015\u0010?R\u001a\u0010E\u001a\u00020\b8\u0014X\u0094D¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0011\u0010H\u001a\u00020F8F¢\u0006\u0006\u001a\u0004\b,\u0010G\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006I"}, d2 = {"Lru/cyberity/ml/docdetector/b;", "Lru/cyberity/ml/core/b;", "Landroid/graphics/Bitmap;", "Lru/cyberity/ml/docdetector/a;", "Landroid/content/Context;", "context", "Lokhttp3/OkHttpClient;", "okHttpClient", "", "modelUrl", "Lru/cyberity/ml/autocapture/a$a;", "modelConfig", "<init>", "(Landroid/content/Context;Lokhttp3/OkHttpClient;Ljava/lang/String;Lru/cyberity/ml/autocapture/a$a;)V", "bitmap", "Lkotlin/G0;", "b", "(Landroid/graphics/Bitmap;)V", "input", "", "", "a", "(Landroid/graphics/Bitmap;)[Ljava/lang/Object;", "", "", "g", "()Ljava/util/Map;", "", "executionTimeMs", "(Landroid/graphics/Bitmap;J)Lru/cyberity/ml/docdetector/a;", "", "save", "(Landroid/graphics/Bitmap;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "i", "Landroid/content/Context;", "j", "Lru/cyberity/ml/autocapture/a$a;", "", "k", "[I", "getIntValues$annotations", "()V", "intValues", "Ljava/nio/ByteBuffer;", "l", "Ljava/nio/ByteBuffer;", "inputImageData", "m", "outputData", "", "n", "Lkotlin/C;", "()[[[F", "outputResults", "o", "I", "outputBoxSize", "Lru/cyberity/ml/core/a;", "<set-?>", "p", "Lru/cyberity/ml/core/a;", "e", "()Lru/cyberity/ml/core/a;", "(Lru/cyberity/ml/core/a;)V", "mlModel", "q", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "solutionName", "Landroid/util/Size;", "()Landroid/util/Size;", "inputSize", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b extends ru.cyberity.ml.core.b<Bitmap, ru.cyberity.ml.docdetector.a> {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @k
    private final Context context;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @k
    private final a.C12565a modelConfig;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @k
    private int[] intValues;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @k
    private ByteBuffer inputImageData;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    @k
    private ByteBuffer outputData;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int outputBoxSize;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public ru.cyberity.ml.core.a mlModel;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C outputResults = C42727D.c(new c());

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @k
    private final String solutionName = "Doc bounds detector";

    /* compiled from: Comparisons.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/d", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f436228a;

        public a(int i12) {
            this.f436228a = i12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            return kotlin.comparisons.a.b(Float.valueOf(((float[]) t13)[this.f436228a]), Float.valueOf(((float[]) t12)[this.f436228a]));
        }
    }

    /* compiled from: DocDetector.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "ru.cyberity.ml.docdetector.DocDetector", f = "DocDetector.kt", i = {0, 0}, l = {148}, m = "detect", n = {"scaledBitmap", "startTime"}, s = {"L$0", "J$0"})
    /* renamed from: ru.cyberity.ml.docdetector.b$b, reason: collision with other inner class name */
    public static final class C12574b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        long f436229a;

        /* renamed from: b, reason: collision with root package name */
        Object f436230b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f436231c;

        /* renamed from: e, reason: collision with root package name */
        int f436233e;

        public C12574b(Continuation<? super C12574b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f436231c = obj;
            this.f436233e |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.a((Bitmap) null, false, (Continuation<? super ru.cyberity.ml.docdetector.a>) this);
        }
    }

    /* compiled from: DocDetector.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "", "a", "()[[[F"}, k = 3, mv = {1, 7, 1})
    public static final class c extends N implements Y41.a<float[][][]> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final float[][][] invoke() {
            int i12 = b.this.outputBoxSize;
            float[][] fArr = new float[i12][];
            for (int i13 = 0; i13 < i12; i13++) {
                fArr[i13] = new float[5];
            }
            return new float[][][]{fArr};
        }
    }

    public b(@k Context context, @k OkHttpClient okHttpClient, @k String str, @k a.C12565a c12565a) {
        this.context = context;
        this.modelConfig = c12565a;
        this.intValues = new int[0];
        this.inputImageData = ByteBuffer.allocateDirect(0);
        this.outputData = ByteBuffer.allocateDirect(0);
        a((ru.cyberity.ml.core.a) new a.c(context, okHttpClient, str, c12565a.getAllowCache()));
        this.intValues = new int[l().getHeight() * l().getWidth()];
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(l().getHeight() * l().getWidth() * 12);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        this.inputImageData = byteBufferAllocateDirect;
        int outputSize = c12565a.getOutputSize();
        this.outputBoxSize = outputSize;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(outputSize * 20);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        this.outputData = byteBufferAllocateDirect2;
    }

    private final void b(Bitmap bitmap) throws IOException {
        File externalFilesDir = this.context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return;
        }
        File file = new File(externalFilesDir, "scaled_frame_" + System.currentTimeMillis() + ".jpg");
        ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
        Logger.v$default(aVar, "DocCapture", "saving to " + file.getAbsolutePath(), null, 4, null);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        boolean zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        if (zCompress) {
            Logger.v$default(aVar, "DocCapture", "saved!", null, 4, null);
        }
    }

    private final float[][][] n() {
        return (float[][][]) this.outputResults.getValue();
    }

    @Override // ru.cyberity.ml.core.b
    @k
    /* renamed from: e */
    public ru.cyberity.ml.core.a getMlModel() {
        ru.cyberity.ml.core.a aVar = this.mlModel;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    @Override // ru.cyberity.ml.core.b
    @k
    public Map<Integer, Object> g() {
        HashMap map = new HashMap();
        this.outputData.rewind();
        map.put(0, this.outputData);
        return map;
    }

    @Override // ru.cyberity.ml.core.b
    @k
    /* renamed from: h, reason: from getter */
    public String getSolutionName() {
        return this.solutionName;
    }

    @k
    public final Size l() {
        return this.modelConfig.getInputSize();
    }

    public void a(@k ru.cyberity.ml.core.a aVar) {
        this.mlModel = aVar;
    }

    @Override // ru.cyberity.ml.core.b
    @k
    public Object[] a(@k Bitmap input) {
        input.getPixels(this.intValues, 0, input.getWidth(), 0, 0, input.getWidth(), input.getHeight());
        this.inputImageData.rewind();
        int height = l().getHeight();
        for (int i12 = 0; i12 < height; i12++) {
            int width = l().getWidth();
            for (int i13 = 0; i13 < width; i13++) {
                int i14 = this.intValues[(l().getWidth() * i12) + i13];
                this.inputImageData.putFloat((((i14 >> 16) & 255) - 0.0f) / 255.0f);
                this.inputImageData.putFloat((((i14 >> 8) & 255) - 0.0f) / 255.0f);
                this.inputImageData.putFloat(((i14 & 255) - 0.0f) / 255.0f);
            }
        }
        return new Object[]{this.inputImageData};
    }

    @Override // ru.cyberity.ml.core.b
    @l
    public ru.cyberity.ml.docdetector.a a(@k Bitmap input, long executionTimeMs) {
        this.outputData.rewind();
        for (int i12 = 0; i12 < 5; i12++) {
            int i13 = this.outputBoxSize;
            for (int i14 = 0; i14 < i13; i14++) {
                n()[0][i14][i12] = this.outputData.getFloat();
            }
            int i15 = this.outputBoxSize;
            for (int i16 = 0; i16 < i15; i16++) {
                if (i12 < 4) {
                    if (i12 % 2 == 0) {
                        float[] fArr = n()[0][i16];
                        fArr[i12] = fArr[i12] * l().getWidth();
                    } else {
                        float[] fArr2 = n()[0][i16];
                        fArr2[i12] = fArr2[i12] * l().getHeight();
                    }
                }
            }
        }
        float[][] fArr3 = n()[0];
        ArrayList arrayList = new ArrayList();
        for (float[] fArr4 : fArr3) {
            if (fArr4[4] > this.modelConfig.getThreshold()) {
                arrayList.add(fArr4);
            }
        }
        List listB0 = C42745f0.B0(arrayList, new a(4));
        if (listB0.isEmpty()) {
            return null;
        }
        float[] fArr5 = (float[]) C42745f0.E(listB0);
        return new ru.cyberity.ml.docdetector.a((int) fArr5[0], (int) fArr5[1], (int) fArr5[2], (int) fArr5[3], fArr5[4], executionTimeMs, -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k android.graphics.Bitmap r13, boolean r14, @Y61.k kotlin.coroutines.Continuation<? super ru.cyberity.ml.docdetector.a> r15) throws java.io.IOException {
        /*
            r12 = this;
            boolean r0 = r15 instanceof ru.cyberity.ml.docdetector.b.C12574b
            if (r0 == 0) goto L13
            r0 = r15
            ru.cyberity.ml.docdetector.b$b r0 = (ru.cyberity.ml.docdetector.b.C12574b) r0
            int r1 = r0.f436233e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f436233e = r1
            goto L18
        L13:
            ru.cyberity.ml.docdetector.b$b r0 = new ru.cyberity.ml.docdetector.b$b
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f436231c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f436233e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r13 = r0.f436229a
            java.lang.Object r0 = r0.f436230b
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            kotlin.C42729a0.b(r15)
            goto L67
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L37:
            kotlin.C42729a0.b(r15)
            long r4 = java.lang.System.currentTimeMillis()
            android.util.Size r15 = r12.l()
            int r15 = r15.getWidth()
            android.util.Size r2 = r12.l()
            int r2 = r2.getHeight()
            r6 = 0
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createScaledBitmap(r13, r15, r2, r6)
            if (r14 == 0) goto L58
            r12.b(r13)
        L58:
            r0.f436230b = r13
            r0.f436229a = r4
            r0.f436233e = r3
            java.lang.Object r15 = r12.a(r13, r0)
            if (r15 != r1) goto L65
            return r1
        L65:
            r0 = r13
            r13 = r4
        L67:
            ru.cyberity.ml.core.d$a r15 = (ru.cyberity.ml.core.d.a) r15
            r0.recycle()
            boolean r0 = r15 instanceof ru.cyberity.ml.core.d.a.c
            if (r0 == 0) goto L90
            ru.cyberity.ml.core.d$a$c r15 = (ru.cyberity.ml.core.d.a.c) r15
            java.lang.Object r15 = r15.c()
            r0 = r15
            ru.cyberity.ml.docdetector.a r0 = (ru.cyberity.ml.docdetector.a) r0
            if (r0 == 0) goto L90
            long r1 = java.lang.System.currentTimeMillis()
            long r8 = r1 - r13
            r10 = 63
            r11 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            ru.cyberity.ml.docdetector.a r13 = ru.cyberity.ml.docdetector.a.a(r0, r1, r2, r3, r4, r5, r6, r8, r10, r11)
            goto L91
        L90:
            r13 = 0
        L91:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.ml.docdetector.b.a(android.graphics.Bitmap, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
