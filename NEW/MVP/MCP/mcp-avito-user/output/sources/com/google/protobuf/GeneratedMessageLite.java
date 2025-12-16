package com.google.protobuf;

import com.google.protobuf.AbstractC37663a;
import com.google.protobuf.C37670d0;
import com.google.protobuf.C37685l;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.b;
import com.google.protobuf.InterfaceC37707w0;
import com.google.protobuf.V;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends AbstractC37663a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected n1 unknownFields = n1.f362921f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MethodToInvoke {

        /* renamed from: b, reason: collision with root package name */
        public static final MethodToInvoke f362671b;

        /* renamed from: c, reason: collision with root package name */
        public static final MethodToInvoke f362672c;

        /* renamed from: d, reason: collision with root package name */
        public static final MethodToInvoke f362673d;

        /* renamed from: e, reason: collision with root package name */
        public static final MethodToInvoke f362674e;

        /* renamed from: f, reason: collision with root package name */
        public static final MethodToInvoke f362675f;

        /* renamed from: g, reason: collision with root package name */
        public static final MethodToInvoke f362676g;

        /* renamed from: h, reason: collision with root package name */
        public static final MethodToInvoke f362677h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ MethodToInvoke[] f362678i;

        static {
            MethodToInvoke methodToInvoke = new MethodToInvoke("GET_MEMOIZED_IS_INITIALIZED", 0);
            f362671b = methodToInvoke;
            MethodToInvoke methodToInvoke2 = new MethodToInvoke("SET_MEMOIZED_IS_INITIALIZED", 1);
            f362672c = methodToInvoke2;
            MethodToInvoke methodToInvoke3 = new MethodToInvoke("BUILD_MESSAGE_INFO", 2);
            f362673d = methodToInvoke3;
            MethodToInvoke methodToInvoke4 = new MethodToInvoke("NEW_MUTABLE_INSTANCE", 3);
            f362674e = methodToInvoke4;
            MethodToInvoke methodToInvoke5 = new MethodToInvoke("NEW_BUILDER", 4);
            f362675f = methodToInvoke5;
            MethodToInvoke methodToInvoke6 = new MethodToInvoke("GET_DEFAULT_INSTANCE", 5);
            f362676g = methodToInvoke6;
            MethodToInvoke methodToInvoke7 = new MethodToInvoke("GET_PARSER", 6);
            f362677h = methodToInvoke7;
            f362678i = new MethodToInvoke[]{methodToInvoke, methodToInvoke2, methodToInvoke3, methodToInvoke4, methodToInvoke5, methodToInvoke6, methodToInvoke7};
        }

        public MethodToInvoke() {
            throw null;
        }

        public static MethodToInvoke valueOf(String str) {
            return (MethodToInvoke) java.lang.Enum.valueOf(MethodToInvoke.class, str);
        }

        public static MethodToInvoke[] values() {
            return (MethodToInvoke[]) f362678i.clone();
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362679a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f362679a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362679a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class b<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends AbstractC37663a.AbstractC10747a<MessageType, BuilderType> {

        /* renamed from: b, reason: collision with root package name */
        public final MessageType f362680b;

        /* renamed from: c, reason: collision with root package name */
        public MessageType f362681c;

        public b(MessageType messagetype) {
            this.f362680b = messagetype;
            if (messagetype.isMutable()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f362681c = (MessageType) messagetype.newMutableInstance();
        }

        public static <MessageType> void r(MessageType messagetype, MessageType messagetype2) {
            N0.f362717c.b(messagetype).mergeFrom(messagetype, messagetype2);
        }

        @Override // com.google.protobuf.AbstractC37663a.AbstractC10747a
        public final b g(AbstractC37663a abstractC37663a) {
            p((GeneratedMessageLite) abstractC37663a);
            return this;
        }

        @Override // com.google.protobuf.AbstractC37663a.AbstractC10747a
        public final AbstractC37663a.AbstractC10747a i(int i12, byte[] bArr) throws InvalidProtocolBufferException {
            M mB2 = M.b();
            n();
            try {
                N0.f362717c.b(this.f362681c).d(this.f362681c, bArr, 0, i12, new C37685l.b(mB2));
                return this;
            } catch (InvalidProtocolBufferException e12) {
                throw e12;
            } catch (IOException e13) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e13);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.h();
            }
        }

        @Override // com.google.protobuf.InterfaceC37709x0
        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.f362681c, false);
        }

        @Override // com.google.protobuf.AbstractC37663a.AbstractC10747a
        /* renamed from: j */
        public final /* bridge */ /* synthetic */ b m2(AbstractC37708x abstractC37708x, M m12) throws IOException {
            q(abstractC37708x, m12);
            return this;
        }

        @Override // com.google.protobuf.InterfaceC37707w0.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public final MessageType c5() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new UninitializedMessageException();
        }

        @Override // com.google.protobuf.InterfaceC37707w0.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public MessageType buildPartial() {
            if (!this.f362681c.isMutable()) {
                return this.f362681c;
            }
            this.f362681c.makeImmutable();
            return this.f362681c;
        }

        @Override // com.google.protobuf.AbstractC37663a.AbstractC10747a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public final BuilderType clone() {
            BuilderType buildertype = (BuilderType) this.f362680b.newBuilderForType();
            buildertype.f362681c = (MessageType) buildPartial();
            return buildertype;
        }

        @Override // com.google.protobuf.AbstractC37663a.AbstractC10747a, com.google.protobuf.InterfaceC37707w0.a
        public final /* bridge */ /* synthetic */ InterfaceC37707w0.a m2(AbstractC37708x abstractC37708x, M m12) throws IOException {
            q(abstractC37708x, m12);
            return this;
        }

        public final void n() {
            if (this.f362681c.isMutable()) {
                return;
            }
            o();
        }

        public void o() {
            MessageType messagetype = (MessageType) this.f362680b.newMutableInstance();
            r(messagetype, this.f362681c);
            this.f362681c = messagetype;
        }

        public final void p(GeneratedMessageLite generatedMessageLite) {
            if (this.f362680b.equals(generatedMessageLite)) {
                return;
            }
            n();
            r(this.f362681c, generatedMessageLite);
        }

        public final BuilderType q(AbstractC37708x abstractC37708x, M m12) throws IOException {
            n();
            try {
                T0 t0B = N0.f362717c.b(this.f362681c);
                MessageType messagetype = this.f362681c;
                C37710y c37710y = abstractC37708x.f362970d;
                if (c37710y == null) {
                    c37710y = new C37710y(abstractC37708x);
                }
                t0B.e(messagetype, c37710y, m12);
                return this;
            } catch (RuntimeException e12) {
                if (e12.getCause() instanceof IOException) {
                    throw ((IOException) e12.getCause());
                }
                throw e12;
            }
        }
    }

    public static class c<T extends GeneratedMessageLite<T, ?>> extends AbstractC37665b<T> {

        /* renamed from: b, reason: collision with root package name */
        public final T f362682b;

        public c(T t12) {
            this.f362682b = t12;
        }
    }

    public static abstract class d<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements e<MessageType, BuilderType> {
        @Override // com.google.protobuf.GeneratedMessageLite.b
        public final void o() {
            super.o();
            MessageType messagetype = this.f362681c;
            if (((ExtendableMessage) messagetype).extensions != V.f362768d) {
                ((ExtendableMessage) messagetype).extensions = ((ExtendableMessage) messagetype).extensions.clone();
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite.b
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public final MessageType buildPartial() {
            if (!((ExtendableMessage) this.f362681c).isMutable()) {
                return (MessageType) this.f362681c;
            }
            ((ExtendableMessage) this.f362681c).extensions.n();
            return (MessageType) super.buildPartial();
        }
    }

    public interface e<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends InterfaceC37709x0 {
    }

    public static final class f implements V.c<f> {

        /* renamed from: b, reason: collision with root package name */
        public final C37670d0.d<?> f362683b;

        /* renamed from: c, reason: collision with root package name */
        public final int f362684c;

        /* renamed from: d, reason: collision with root package name */
        public final WireFormat.FieldType f362685d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f362686e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f362687f;

        public f(C37670d0.d<?> dVar, int i12, WireFormat.FieldType fieldType, boolean z12, boolean z13) {
            this.f362683b = dVar;
            this.f362684c = i12;
            this.f362685d = fieldType;
            this.f362686e = z12;
            this.f362687f = z13;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f362684c - ((f) obj).f362684c;
        }

        @Override // com.google.protobuf.V.c
        public final WireFormat.JavaType getLiteJavaType() {
            return this.f362685d.f362808b;
        }

        @Override // com.google.protobuf.V.c
        public final WireFormat.FieldType getLiteType() {
            return this.f362685d;
        }

        @Override // com.google.protobuf.V.c
        public final int getNumber() {
            return this.f362684c;
        }

        @Override // com.google.protobuf.V.c
        public final boolean isPacked() {
            return this.f362687f;
        }

        @Override // com.google.protobuf.V.c
        public final boolean isRepeated() {
            return this.f362686e;
        }

        @Override // com.google.protobuf.V.c
        public final b x0(InterfaceC37707w0.a aVar, InterfaceC37707w0 interfaceC37707w0) {
            b bVar = (b) aVar;
            bVar.p((GeneratedMessageLite) interfaceC37707w0);
            return bVar;
        }
    }

    public static class g<ContainingType extends InterfaceC37707w0, Type> extends K<ContainingType, Type> {

        /* renamed from: a, reason: collision with root package name */
        public final ContainingType f362688a;

        /* renamed from: b, reason: collision with root package name */
        public final Type f362689b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC37707w0 f362690c;

        /* renamed from: d, reason: collision with root package name */
        public final f f362691d;

        /* JADX WARN: Multi-variable type inference failed */
        public g(InterfaceC37707w0 interfaceC37707w0, Object obj, InterfaceC37707w0 interfaceC37707w02, f fVar) {
            if (interfaceC37707w0 == 0) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (fVar.f362685d == WireFormat.FieldType.f362799n && interfaceC37707w02 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f362688a = interfaceC37707w0;
            this.f362689b = obj;
            this.f362690c = interfaceC37707w02;
            this.f362691d = fVar;
        }

        public final Object a(Object obj) {
            f fVar = this.f362691d;
            if (fVar.f362685d.f362808b != WireFormat.JavaType.ENUM) {
                return obj;
            }
            return fVar.f362683b.findValueByNumber(((Integer) obj).intValue());
        }

        public final Object b(Object obj) {
            return this.f362691d.f362685d.f362808b == WireFormat.JavaType.ENUM ? Integer.valueOf(((C37670d0.c) obj).getNumber()) : obj;
        }
    }

    public static final class h implements Serializable {
        private static final long serialVersionUID = 0;

        public Object readResolve() throws NoSuchFieldException, SecurityException {
            try {
                try {
                    java.lang.reflect.Field declaredField = Class.forName(null).getDeclaredField("DEFAULT_INSTANCE");
                    declaredField.setAccessible(true);
                    ((InterfaceC37707w0) declaredField.get(null)).newBuilderForType().mergeFrom(null);
                    throw null;
                } catch (InvalidProtocolBufferException e12) {
                    throw new RuntimeException("Unable to understand proto buffer", e12);
                } catch (ClassNotFoundException e13) {
                    throw new RuntimeException("Unable to find proto buffer class: null", e13);
                } catch (IllegalAccessException e14) {
                    throw new RuntimeException("Unable to call parsePartialFrom", e14);
                } catch (NoSuchFieldException unused) {
                    java.lang.reflect.Field declaredField2 = Class.forName(null).getDeclaredField("defaultInstance");
                    declaredField2.setAccessible(true);
                    ((InterfaceC37707w0) declaredField2.get(null)).newBuilderForType().mergeFrom(null);
                    throw null;
                } catch (SecurityException e15) {
                    throw new RuntimeException("Unable to call DEFAULT_INSTANCE in null", e15);
                }
            } catch (InvalidProtocolBufferException e16) {
                throw new RuntimeException("Unable to understand proto buffer", e16);
            } catch (ClassNotFoundException e17) {
                throw new RuntimeException("Unable to find proto buffer class: null", e17);
            } catch (IllegalAccessException e18) {
                throw new RuntimeException("Unable to call parsePartialFrom", e18);
            } catch (NoSuchFieldException e19) {
                throw new RuntimeException("Unable to find defaultInstance in null", e19);
            } catch (SecurityException e22) {
                throw new RuntimeException("Unable to call defaultInstance in null", e22);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>, T> g<MessageType, T> checkIsLite(K<MessageType, T> k12) {
        k12.getClass();
        return (g) k12;
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t12) throws InvalidProtocolBufferException {
        if (t12 == null || t12.isInitialized()) {
            return t12;
        }
        UninitializedMessageException uninitializedMessageExceptionNewUninitializedMessageException = t12.newUninitializedMessageException();
        uninitializedMessageExceptionNewUninitializedMessageException.getClass();
        throw new InvalidProtocolBufferException(uninitializedMessageExceptionNewUninitializedMessageException.getMessage());
    }

    private int computeSerializedSize(T0<?> t02) {
        if (t02 != null) {
            return t02.c(this);
        }
        N0 n02 = N0.f362717c;
        n02.getClass();
        return n02.a(getClass()).c(this);
    }

    public static C37670d0.a emptyBooleanList() {
        return C37693p.f362930e;
    }

    public static C37670d0.b emptyDoubleList() {
        return B.f362598e;
    }

    public static C37670d0.f emptyFloatList() {
        return W.f362786e;
    }

    public static C37670d0.g emptyIntList() {
        return C37668c0.f362853e;
    }

    public static C37670d0.i emptyLongList() {
        return C37690n0.f362918e;
    }

    public static <E> C37670d0.k<E> emptyProtobufList() {
        return O0.f362725e;
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == n1.f362921f) {
            this.unknownFields = new n1();
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> T getDefaultInstance(Class<T> cls) throws ClassNotFoundException {
        GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e12) {
                throw new IllegalStateException("Class initialization cannot fail.", e12);
            }
        }
        if (generatedMessageLite == null) {
            generatedMessageLite = (T) ((GeneratedMessageLite) r1.c(cls)).getDefaultInstanceForType();
            if (generatedMessageLite == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, generatedMessageLite);
        }
        return (T) generatedMessageLite;
    }

    public static java.lang.reflect.Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e12);
        }
    }

    public static Object invokeOrDie(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e12) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e12);
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.d0$g] */
    public static C37670d0.g mutableCopy(C37670d0.g gVar) {
        int size = gVar.size();
        return gVar.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static Object newMessageInfo(InterfaceC37707w0 interfaceC37707w0, String str, Object[] objArr) {
        return new Q0(interfaceC37707w0, str, objArr);
    }

    public static <ContainingType extends InterfaceC37707w0, Type> g<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, InterfaceC37707w0 interfaceC37707w0, C37670d0.d<?> dVar, int i12, WireFormat.FieldType fieldType, boolean z12, Class cls) {
        return new g<>(containingtype, Collections.emptyList(), interfaceC37707w0, new f(dVar, i12, fieldType, true, z12));
    }

    public static <ContainingType extends InterfaceC37707w0, Type> g<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, InterfaceC37707w0 interfaceC37707w0, C37670d0.d<?> dVar, int i12, WireFormat.FieldType fieldType, Class cls) {
        return new g<>(containingtype, type, interfaceC37707w0, new f(dVar, i12, fieldType, false, false));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t12, InputStream inputStream) {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t12, inputStream, M.b()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t12, ByteBuffer byteBuffer, M m12) {
        return (T) checkMessageInitialized(parseFrom(t12, AbstractC37708x.i(byteBuffer, false), m12));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t12, InputStream inputStream, M m12) throws IOException {
        try {
            int i12 = inputStream.read();
            if (i12 == -1) {
                return null;
            }
            AbstractC37708x abstractC37708xH = AbstractC37708x.h(new AbstractC37663a.AbstractC10747a.C10748a(inputStream, AbstractC37708x.y(i12, inputStream)));
            T t13 = (T) parsePartialFrom(t12, abstractC37708xH, m12);
            abstractC37708xH.a(0);
            return t13;
        } catch (InvalidProtocolBufferException e12) {
            if (e12.f362695b) {
                throw new InvalidProtocolBufferException(e12.getMessage(), e12);
            }
            throw e12;
        } catch (IOException e13) {
            throw new InvalidProtocolBufferException(e13.getMessage(), e13);
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t12, AbstractC37708x abstractC37708x, M m12) throws InvalidProtocolBufferException {
        T t13 = (T) t12.newMutableInstance();
        try {
            T0 t0B = N0.f362717c.b(t13);
            C37710y c37710y = abstractC37708x.f362970d;
            if (c37710y == null) {
                c37710y = new C37710y(abstractC37708x);
            }
            t0B.e(t13, c37710y, m12);
            t0B.makeImmutable(t13);
            return t13;
        } catch (InvalidProtocolBufferException e12) {
            if (e12.f362695b) {
                throw new InvalidProtocolBufferException(e12.getMessage(), e12);
            }
            throw e12;
        } catch (UninitializedMessageException e13) {
            throw new InvalidProtocolBufferException(e13.getMessage());
        } catch (IOException e14) {
            if (e14.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e14.getCause());
            }
            throw new InvalidProtocolBufferException(e14.getMessage(), e14);
        } catch (RuntimeException e15) {
            if (e15.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e15.getCause());
            }
            throw e15;
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> cls, T t12) {
        t12.markImmutable();
        defaultInstanceMap.put(cls, t12);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(MethodToInvoke.f362673d);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        N0 n02 = N0.f362717c;
        n02.getClass();
        return n02.a(getClass()).a(this);
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(MethodToInvoke.f362675f);
    }

    @InterfaceC37704v
    public Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj) {
        return dynamicMethod(methodToInvoke, obj, null);
    }

    public abstract Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        N0 n02 = N0.f362717c;
        n02.getClass();
        return n02.a(getClass()).f(this, (GeneratedMessageLite) obj);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.AbstractC37663a
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public final L0<MessageType> getParserForType() {
        return (L0) dynamicMethod(MethodToInvoke.f362677h);
    }

    @Override // com.google.protobuf.AbstractC37663a
    public int getSerializedSize(T0 t02) {
        if (isMutable()) {
            int iComputeSerializedSize = computeSerializedSize(t02);
            if (iComputeSerializedSize >= 0) {
                return iComputeSerializedSize;
            }
            throw new IllegalStateException(AK.c.g(iComputeSerializedSize, "serialized size must be non-negative, was "));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int iComputeSerializedSize2 = computeSerializedSize(t02);
        setMemoizedSerializedSize(iComputeSerializedSize2);
        return iComputeSerializedSize2;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    @Override // com.google.protobuf.InterfaceC37709x0
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public void makeImmutable() {
        N0 n02 = N0.f362717c;
        n02.getClass();
        n02.a(getClass()).makeImmutable(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i12, AbstractC37700t abstractC37700t) {
        ensureUnknownFieldsInitialized();
        n1 n1Var = this.unknownFields;
        n1Var.a();
        if (i12 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        n1Var.f((i12 << 3) | 2, abstractC37700t);
    }

    public final void mergeUnknownFields(n1 n1Var) {
        this.unknownFields = n1.e(this.unknownFields, n1Var);
    }

    public void mergeVarintField(int i12, int i13) {
        ensureUnknownFieldsInitialized();
        n1 n1Var = this.unknownFields;
        n1Var.a();
        if (i12 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        n1Var.f(i12 << 3, Long.valueOf(i13));
    }

    public MessageType newMutableInstance() {
        return (MessageType) dynamicMethod(MethodToInvoke.f362674e);
    }

    public boolean parseUnknownField(int i12, AbstractC37708x abstractC37708x) {
        if ((i12 & 7) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.d(i12, abstractC37708x);
    }

    public void setMemoizedHashCode(int i12) {
        this.memoizedHashCode = i12;
    }

    @Override // com.google.protobuf.AbstractC37663a
    public void setMemoizedSerializedSize(int i12) {
        if (i12 < 0) {
            throw new IllegalStateException(AK.c.g(i12, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i12 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = C37711y0.f363010a;
        StringBuilder sbZ = androidx.appcompat.app.r.z("# ", string);
        C37711y0.c(this, sbZ, 0);
        return sbZ.toString();
    }

    @Override // com.google.protobuf.InterfaceC37707w0
    public void writeTo(CodedOutputStream codedOutputStream) {
        N0 n02 = N0.f362717c;
        n02.getClass();
        T0 t0A = n02.a(getClass());
        C37712z c37712z = codedOutputStream.f362605a;
        if (c37712z == null) {
            c37712z = new C37712z(codedOutputStream);
        }
        t0A.b(this, c37712z);
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t12, boolean z12) {
        byte bByteValue = ((Byte) t12.dynamicMethod(MethodToInvoke.f362671b)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        N0 n02 = N0.f362717c;
        n02.getClass();
        boolean zIsInitialized = n02.a(t12.getClass()).isInitialized(t12);
        if (z12) {
            t12.dynamicMethod(MethodToInvoke.f362672c, zIsInitialized ? t12 : null);
        }
        return zIsInitialized;
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        BuilderType buildertype = (BuilderType) createBuilder();
        buildertype.p(messagetype);
        return buildertype;
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke) {
        return dynamicMethod(methodToInvoke, null, null);
    }

    @Override // com.google.protobuf.InterfaceC37709x0
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(MethodToInvoke.f362676g);
    }

    @Override // com.google.protobuf.InterfaceC37707w0
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(MethodToInvoke.f362675f);
    }

    @Override // com.google.protobuf.InterfaceC37707w0
    public final BuilderType toBuilder() {
        BuilderType buildertype = (BuilderType) dynamicMethod(MethodToInvoke.f362675f);
        buildertype.p(this);
        return buildertype;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.d0$i] */
    public static C37670d0.i mutableCopy(C37670d0.i iVar) {
        int size = iVar.size();
        return iVar.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t12, InputStream inputStream, M m12) {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t12, inputStream, m12));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t12, ByteBuffer byteBuffer) {
        return (T) parseFrom(t12, byteBuffer, M.b());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.d0$f] */
    public static C37670d0.f mutableCopy(C37670d0.f fVar) {
        int size = fVar.size();
        return fVar.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t12, AbstractC37700t abstractC37700t) {
        return (T) checkMessageInitialized(parseFrom(t12, abstractC37700t, M.b()));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.d0$b] */
    public static C37670d0.b mutableCopy(C37670d0.b bVar) {
        int size = bVar.size();
        return bVar.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t12, AbstractC37700t abstractC37700t, M m12) {
        return (T) checkMessageInitialized(parsePartialFrom(t12, abstractC37700t, m12));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t12, byte[] bArr) {
        return (T) checkMessageInitialized(parsePartialFrom(t12, bArr, 0, bArr.length, M.b()));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.d0$a] */
    public static C37670d0.a mutableCopy(C37670d0.a aVar) {
        int size = aVar.size();
        return aVar.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static <E> C37670d0.k<E> mutableCopy(C37670d0.k<E> kVar) {
        int size = kVar.size();
        return kVar.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t12, byte[] bArr, M m12) {
        return (T) checkMessageInitialized(parsePartialFrom(t12, bArr, 0, bArr.length, m12));
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements e<MessageType, BuilderType> {
        protected V<f> extensions = V.f362768d;

        public class a {

            /* renamed from: a, reason: collision with root package name */
            public final Iterator<Map.Entry<f, Object>> f362670a;

            public a(ExtendableMessage extendableMessage, boolean z12, a aVar) {
                Iterator itM = extendableMessage.extensions.m();
                this.f362670a = itM;
                if (itM.hasNext()) {
                }
            }
        }

        private void eagerlyMergeMessageSetExtension(AbstractC37708x abstractC37708x, g<?, ?> gVar, M m12, int i12) {
            parseExtension(abstractC37708x, m12, gVar, (i12 << 3) | 2, i12);
        }

        private void mergeMessageSetExtensionFromBytes(AbstractC37700t abstractC37700t, M m12, g<?, ?> gVar) {
            InterfaceC37707w0 interfaceC37707w0 = (InterfaceC37707w0) this.extensions.f(gVar.f362691d);
            InterfaceC37707w0.a builder = interfaceC37707w0 != null ? interfaceC37707w0.toBuilder() : null;
            if (builder == null) {
                builder = gVar.f362690c.newBuilderForType();
            }
            builder.I2(abstractC37700t, m12);
            ensureExtensionsAreMutable().q(gVar.f362691d, gVar.b(((b) builder).c5()));
        }

        private <MessageType extends InterfaceC37707w0> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, AbstractC37708x abstractC37708x, M m12) {
            int iG2 = 0;
            AbstractC37700t abstractC37700tN = null;
            g gVarA = null;
            while (true) {
                int iF2 = abstractC37708x.F();
                if (iF2 == 0) {
                    break;
                }
                if (iF2 == 16) {
                    iG2 = abstractC37708x.G();
                    if (iG2 != 0) {
                        gVarA = m12.a(iG2, messagetype);
                    }
                } else if (iF2 == 26) {
                    if (iG2 == 0 || gVarA == null) {
                        abstractC37700tN = abstractC37708x.n();
                    } else {
                        eagerlyMergeMessageSetExtension(abstractC37708x, gVarA, m12, iG2);
                        abstractC37700tN = null;
                    }
                } else if (!abstractC37708x.I(iF2)) {
                    break;
                }
            }
            abstractC37708x.a(12);
            if (abstractC37700tN == null || iG2 == 0) {
                return;
            }
            if (gVarA != null) {
                mergeMessageSetExtensionFromBytes(abstractC37700tN, m12, gVarA);
            } else {
                mergeLengthDelimitedField(iG2, abstractC37700tN);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean parseExtension(com.google.protobuf.AbstractC37708x r8, com.google.protobuf.M r9, com.google.protobuf.GeneratedMessageLite.g<?, ?> r10, int r11, int r12) {
            /*
                Method dump skipped, instructions count: 238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessageLite.ExtendableMessage.parseExtension(com.google.protobuf.x, com.google.protobuf.M, com.google.protobuf.GeneratedMessageLite$g, int, int):boolean");
        }

        private void verifyExtensionContainingType(g<MessageType, ?> gVar) {
            if (gVar.f362688a != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @InterfaceC37704v
        public V<f> ensureExtensionsAreMutable() {
            V<f> v12 = this.extensions;
            if (v12.f362770b) {
                this.extensions = v12.clone();
            }
            return this.extensions;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.k();
        }

        public int extensionsSerializedSize() {
            return this.extensions.i();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.g();
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [Type, java.util.ArrayList] */
        public final <Type> Type getExtension(K<MessageType, Type> k12) {
            g<MessageType, ?> gVarCheckIsLite = GeneratedMessageLite.checkIsLite(k12);
            verifyExtensionContainingType(gVarCheckIsLite);
            Type type = (Type) this.extensions.f(gVarCheckIsLite.f362691d);
            if (type == null) {
                return gVarCheckIsLite.f362689b;
            }
            f fVar = gVarCheckIsLite.f362691d;
            if (!fVar.f362686e) {
                return (Type) gVarCheckIsLite.a(type);
            }
            if (fVar.f362685d.f362808b != WireFormat.JavaType.ENUM) {
                return type;
            }
            ?? r12 = (Type) new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                r12.add(gVarCheckIsLite.a(it.next()));
            }
            return r12;
        }

        public final <Type> int getExtensionCount(K<MessageType, List<Type>> k12) {
            g<MessageType, ?> gVarCheckIsLite = GeneratedMessageLite.checkIsLite(k12);
            verifyExtensionContainingType(gVarCheckIsLite);
            V<f> v12 = this.extensions;
            f fVar = gVarCheckIsLite.f362691d;
            v12.getClass();
            if (!fVar.f362686e) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objF = v12.f(fVar);
            if (objF == null) {
                return 0;
            }
            return ((List) objF).size();
        }

        public final <Type> boolean hasExtension(K<MessageType, Type> k12) {
            g<MessageType, ?> gVarCheckIsLite = GeneratedMessageLite.checkIsLite(k12);
            verifyExtensionContainingType(gVarCheckIsLite);
            V<f> v12 = this.extensions;
            f fVar = gVarCheckIsLite.f362691d;
            v12.getClass();
            if (fVar.f362686e) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return v12.f362769a.get(fVar) != null;
        }

        public final void mergeExtensionFields(MessageType messagetype) {
            V<f> v12 = this.extensions;
            if (v12.f362770b) {
                this.extensions = v12.clone();
            }
            this.extensions.o(messagetype.extensions);
        }

        public ExtendableMessage<MessageType, BuilderType>.a newExtensionWriter() {
            return new a(this, false, null);
        }

        public ExtendableMessage<MessageType, BuilderType>.a newMessageSetExtensionWriter() {
            return new a(this, true, null);
        }

        public <MessageType extends InterfaceC37707w0> boolean parseUnknownField(MessageType messagetype, AbstractC37708x abstractC37708x, M m12, int i12) {
            int i13 = i12 >>> 3;
            return parseExtension(abstractC37708x, m12, m12.a(i13, messagetype), i12, i13);
        }

        public <MessageType extends InterfaceC37707w0> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, AbstractC37708x abstractC37708x, M m12, int i12) {
            if (i12 != 11) {
                return (i12 & 7) == 2 ? parseUnknownField(messagetype, abstractC37708x, m12, i12) : abstractC37708x.I(i12);
            }
            mergeMessageSetExtensionFromCodedStream(messagetype, abstractC37708x, m12);
            return true;
        }

        public final <Type> Type getExtension(K<MessageType, List<Type>> k12, int i12) {
            g<MessageType, ?> gVarCheckIsLite = GeneratedMessageLite.checkIsLite(k12);
            verifyExtensionContainingType(gVarCheckIsLite);
            V<f> v12 = this.extensions;
            f fVar = gVarCheckIsLite.f362691d;
            v12.getClass();
            if (fVar.f362686e) {
                Object objF = v12.f(fVar);
                if (objF != null) {
                    return (Type) gVarCheckIsLite.a(((List) objF).get(i12));
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t12, InputStream inputStream) {
        return (T) checkMessageInitialized(parsePartialFrom(t12, AbstractC37708x.h(inputStream), M.b()));
    }

    @Override // com.google.protobuf.InterfaceC37707w0
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t12, InputStream inputStream, M m12) {
        return (T) checkMessageInitialized(parsePartialFrom(t12, AbstractC37708x.h(inputStream), m12));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t12, AbstractC37708x abstractC37708x) {
        return (T) parseFrom(t12, abstractC37708x, M.b());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t12, AbstractC37708x abstractC37708x, M m12) {
        return (T) checkMessageInitialized(parsePartialFrom(t12, abstractC37708x, m12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t12, byte[] bArr, int i12, int i13, M m12) throws InvalidProtocolBufferException {
        T t13 = (T) t12.newMutableInstance();
        try {
            T0 t0B = N0.f362717c.b(t13);
            t0B.d(t13, bArr, i12, i12 + i13, new C37685l.b(m12));
            t0B.makeImmutable(t13);
            return t13;
        } catch (InvalidProtocolBufferException e12) {
            if (e12.f362695b) {
                throw new InvalidProtocolBufferException(e12.getMessage(), e12);
            }
            throw e12;
        } catch (UninitializedMessageException e13) {
            throw new InvalidProtocolBufferException(e13.getMessage());
        } catch (IOException e14) {
            if (e14.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e14.getCause());
            }
            throw new InvalidProtocolBufferException(e14.getMessage(), e14);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t12, AbstractC37708x abstractC37708x) {
        return (T) parsePartialFrom(t12, abstractC37708x, M.b());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t12, AbstractC37700t abstractC37700t, M m12) {
        AbstractC37708x abstractC37708xW = abstractC37700t.w();
        T t13 = (T) parsePartialFrom(t12, abstractC37708xW, m12);
        abstractC37708xW.a(0);
        return t13;
    }
}
