package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC22877a;
import androidx.datastore.preferences.protobuf.C22884c0;
import androidx.datastore.preferences.protobuf.C22914m0;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.b;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends AbstractC22877a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected H1 unknownFields = H1.f45671f;
    protected int memoizedSerializedSize = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MethodToInvoke {

        /* renamed from: b, reason: collision with root package name */
        public static final MethodToInvoke f45659b;

        /* renamed from: c, reason: collision with root package name */
        public static final MethodToInvoke f45660c;

        /* renamed from: d, reason: collision with root package name */
        public static final MethodToInvoke f45661d;

        /* renamed from: e, reason: collision with root package name */
        public static final MethodToInvoke f45662e;

        /* renamed from: f, reason: collision with root package name */
        public static final MethodToInvoke f45663f;

        /* renamed from: g, reason: collision with root package name */
        public static final MethodToInvoke f45664g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ MethodToInvoke[] f45665h;

        static {
            MethodToInvoke methodToInvoke = new MethodToInvoke("GET_MEMOIZED_IS_INITIALIZED", 0);
            f45659b = methodToInvoke;
            MethodToInvoke methodToInvoke2 = new MethodToInvoke("SET_MEMOIZED_IS_INITIALIZED", 1);
            f45660c = methodToInvoke2;
            MethodToInvoke methodToInvoke3 = new MethodToInvoke("BUILD_MESSAGE_INFO", 2);
            f45661d = methodToInvoke3;
            MethodToInvoke methodToInvoke4 = new MethodToInvoke("NEW_MUTABLE_INSTANCE", 3);
            f45662e = methodToInvoke4;
            MethodToInvoke methodToInvoke5 = new MethodToInvoke("NEW_BUILDER", 4);
            f45663f = methodToInvoke5;
            MethodToInvoke methodToInvoke6 = new MethodToInvoke("GET_DEFAULT_INSTANCE", 5);
            f45664g = methodToInvoke6;
            f45665h = new MethodToInvoke[]{methodToInvoke, methodToInvoke2, methodToInvoke3, methodToInvoke4, methodToInvoke5, methodToInvoke6, new MethodToInvoke("GET_PARSER", 6)};
        }

        public MethodToInvoke() {
            throw null;
        }

        public static MethodToInvoke valueOf(String str) {
            return (MethodToInvoke) Enum.valueOf(MethodToInvoke.class, str);
        }

        public static MethodToInvoke[] values() {
            return (MethodToInvoke[]) f45665h.clone();
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45666a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f45666a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45666a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class b<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends AbstractC22877a.AbstractC1779a<MessageType, BuilderType> {

        /* renamed from: b, reason: collision with root package name */
        public final MessageType f45667b;

        /* renamed from: c, reason: collision with root package name */
        public MessageType f45668c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f45669d = false;

        public b(MessageType messagetype) {
            this.f45667b = messagetype;
            this.f45668c = (MessageType) messagetype.h(MethodToInvoke.f45662e);
        }

        public static void l(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
            Z0 z02 = Z0.f45797c;
            z02.getClass();
            z02.a(generatedMessageLite.getClass()).e(generatedMessageLite, generatedMessageLite2);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22877a.AbstractC1779a
        public final Object clone() {
            b bVar = (b) this.f45667b.h(MethodToInvoke.f45663f);
            GeneratedMessageLite generatedMessageLiteBuildPartial = buildPartial();
            bVar.k();
            l(bVar.f45668c, generatedMessageLiteBuildPartial);
            return bVar;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22877a.AbstractC1779a
        /* renamed from: e */
        public final b clone() {
            b bVar = (b) this.f45667b.h(MethodToInvoke.f45663f);
            GeneratedMessageLite generatedMessageLiteBuildPartial = buildPartial();
            bVar.k();
            l(bVar.f45668c, generatedMessageLiteBuildPartial);
            return bVar;
        }

        public final MessageType i() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.l()) {
                return messagetype;
            }
            throw new UninitializedMessageException();
        }

        @Override // androidx.datastore.preferences.protobuf.F0.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public MessageType buildPartial() {
            if (this.f45669d) {
                return this.f45668c;
            }
            MessageType messagetype = this.f45668c;
            messagetype.getClass();
            Z0 z02 = Z0.f45797c;
            z02.getClass();
            z02.a(messagetype.getClass()).makeImmutable(messagetype);
            this.f45669d = true;
            return this.f45668c;
        }

        public void k() {
            if (this.f45669d) {
                MessageType messagetype = (MessageType) this.f45668c.h(MethodToInvoke.f45662e);
                l(messagetype, this.f45668c);
                this.f45668c = messagetype;
                this.f45669d = false;
            }
        }
    }

    public static class c<T extends GeneratedMessageLite<T, ?>> extends AbstractC22880b<T> {
    }

    public static abstract class d<MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements f<MessageType, BuilderType> {
        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.b, androidx.datastore.preferences.protobuf.F0.a
        public final F0 buildPartial() {
            if (this.f45669d) {
                return (e) this.f45668c;
            }
            ((e) this.f45668c).extensions.j();
            return (e) super.buildPartial();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.b
        /* renamed from: j */
        public final GeneratedMessageLite buildPartial() {
            if (this.f45669d) {
                return (e) this.f45668c;
            }
            ((e) this.f45668c).extensions.j();
            return (e) super.buildPartial();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.b
        public final void k() {
            if (this.f45669d) {
                super.k();
                e eVar = (e) this.f45668c;
                eVar.extensions = eVar.extensions.clone();
            }
        }
    }

    public static abstract class e<MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements f<MessageType, BuilderType> {
        protected C22884c0<g> extensions = C22884c0.f45805d;

        public class a {

            /* renamed from: a, reason: collision with root package name */
            public final Iterator<Map.Entry<g, Object>> f45670a;

            public a(e eVar, boolean z12, a aVar) {
                Iterator itI = eVar.extensions.i();
                this.f45670a = itI;
                if (itI.hasNext()) {
                }
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.G0
        public final GeneratedMessageLite a() {
            return (GeneratedMessageLite) h(MethodToInvoke.f45664g);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.F0
        public final b newBuilderForType() {
            return (b) h(MethodToInvoke.f45663f);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.F0
        public final b toBuilder() {
            b bVar = (b) h(MethodToInvoke.f45663f);
            bVar.k();
            b.l(bVar.f45668c, this);
            return bVar;
        }
    }

    public interface f<MessageType extends e<MessageType, BuilderType>, BuilderType extends d<MessageType, BuilderType>> extends G0 {
    }

    public static final class g implements C22884c0.c<g> {
        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((g) obj).getClass();
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.C22884c0.c
        public final WireFormat.JavaType getLiteJavaType() {
            throw null;
        }
    }

    public static class h<ContainingType extends F0, Type> extends Q<ContainingType, Type> {
    }

    public static final class i implements Serializable {
        private static final long serialVersionUID = 0;

        public Object readResolve() throws NoSuchFieldException, SecurityException {
            try {
                try {
                    java.lang.reflect.Field declaredField = Class.forName(null).getDeclaredField("DEFAULT_INSTANCE");
                    declaredField.setAccessible(true);
                    ((F0) declaredField.get(null)).newBuilderForType().getClass();
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
                    ((F0) declaredField2.get(null)).newBuilderForType().getClass();
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

    public static <E> C22914m0.k<E> i() {
        return C22879a1.f45801e;
    }

    public static <T extends GeneratedMessageLite<?, ?>> T j(Class<T> cls) throws ClassNotFoundException {
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
            generatedMessageLite = (T) ((GeneratedMessageLite) K1.b(cls)).h(MethodToInvoke.f45664g);
            if (generatedMessageLite == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, generatedMessageLite);
        }
        return (T) generatedMessageLite;
    }

    public static Object k(Method method, F0 f02, Object... objArr) {
        try {
            return method.invoke(f02, objArr);
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

    public static Object m(GeneratedMessageLite generatedMessageLite, String str, Object[] objArr) {
        return new C22888d1(generatedMessageLite, str, objArr);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T n(T t12, AbstractC22940z abstractC22940z, T t13) throws InvalidProtocolBufferException {
        T t14 = (T) t12.h(MethodToInvoke.f45662e);
        try {
            Z0 z02 = Z0.f45797c;
            z02.getClass();
            InterfaceC22897g1 interfaceC22897g1A = z02.a(t14.getClass());
            A a12 = abstractC22940z.f45951d;
            if (a12 == null) {
                a12 = new A(abstractC22940z);
            }
            interfaceC22897g1A.d(t14, a12, t13);
            interfaceC22897g1A.makeImmutable(t14);
            return t14;
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12.getMessage());
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw e13;
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> void o(Class<T> cls, T t12) {
        defaultInstanceMap.put(cls, t12);
    }

    @Override // androidx.datastore.preferences.protobuf.G0
    public GeneratedMessageLite a() {
        return (GeneratedMessageLite) h(MethodToInvoke.f45664g);
    }

    @Override // androidx.datastore.preferences.protobuf.F0
    public final void b(CodedOutputStream codedOutputStream) {
        Z0 z02 = Z0.f45797c;
        z02.getClass();
        InterfaceC22897g1 interfaceC22897g1A = z02.a(getClass());
        B b12 = codedOutputStream.f45600a;
        if (b12 == null) {
            b12 = new B(codedOutputStream);
        }
        interfaceC22897g1A.c(this, b12);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22877a
    public final int d() {
        return this.memoizedSerializedSize;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((GeneratedMessageLite) h(MethodToInvoke.f45664g)).getClass().isInstance(obj)) {
            return false;
        }
        Z0 z02 = Z0.f45797c;
        z02.getClass();
        return z02.a(getClass()).b(this, (GeneratedMessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC22877a
    public final void f(int i12) {
        this.memoizedSerializedSize = i12;
    }

    @Override // androidx.datastore.preferences.protobuf.F0
    public final int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            Z0 z02 = Z0.f45797c;
            z02.getClass();
            this.memoizedSerializedSize = z02.a(getClass()).a(this);
        }
        return this.memoizedSerializedSize;
    }

    public abstract Object h(MethodToInvoke methodToInvoke);

    public final int hashCode() {
        int i12 = this.memoizedHashCode;
        if (i12 != 0) {
            return i12;
        }
        Z0 z02 = Z0.f45797c;
        z02.getClass();
        int iF2 = z02.a(getClass()).f(this);
        this.memoizedHashCode = iF2;
        return iF2;
    }

    public final boolean l() {
        byte bByteValue = ((Byte) h(MethodToInvoke.f45659b)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        Z0 z02 = Z0.f45797c;
        z02.getClass();
        boolean zIsInitialized = z02.a(getClass()).isInitialized(this);
        h(MethodToInvoke.f45660c);
        return zIsInitialized;
    }

    @Override // androidx.datastore.preferences.protobuf.F0
    public b newBuilderForType() {
        return (b) h(MethodToInvoke.f45663f);
    }

    @Override // androidx.datastore.preferences.protobuf.F0
    public b toBuilder() {
        b bVar = (b) h(MethodToInvoke.f45663f);
        bVar.k();
        b.l(bVar.f45668c, this);
        return bVar;
    }

    public final String toString() {
        StringBuilder sbZ = androidx.appcompat.app.r.z("# ", super.toString());
        H0.c(this, sbZ, 0);
        return sbZ.toString();
    }
}
