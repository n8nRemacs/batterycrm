package net.bytebuddy.utility;

import androidx.camera.view.k;
import androidx.compose.foundation.H;
import com.yandex.div2.D8;
import java.security.AccessController;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.description.type.d;
import net.bytebuddy.jar.asm.B;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;

/* loaded from: classes7.dex */
public interface JavaConstant {

    public static class MethodHandle implements JavaConstant {

        /* renamed from: f, reason: collision with root package name */
        public static final a f418865f;

        /* renamed from: g, reason: collision with root package name */
        public static final c f418866g;

        /* renamed from: h, reason: collision with root package name */
        public static final b f418867h;

        /* renamed from: i, reason: collision with root package name */
        public static final b.a f418868i;

        /* renamed from: j, reason: collision with root package name */
        public static final boolean f418869j;

        /* renamed from: a, reason: collision with root package name */
        public final HandleType f418870a;

        /* renamed from: b, reason: collision with root package name */
        public final TypeDescription f418871b;

        /* renamed from: c, reason: collision with root package name */
        public final String f418872c;

        /* renamed from: d, reason: collision with root package name */
        public final TypeDescription f418873d;

        /* renamed from: e, reason: collision with root package name */
        public final List<? extends TypeDescription> f418874e;

        public enum HandleType {
            f418875d("INVOKE_VIRTUAL", false),
            f418876e("INVOKE_STATIC", false),
            f418877f("INVOKE_SPECIAL", false),
            f418878g("INVOKE_INTERFACE", false),
            f418879h("INVOKE_SPECIAL_CONSTRUCTOR", false),
            /* JADX INFO: Fake field, exist only in values array */
            EF12("PUT_FIELD", true),
            f418880i("GET_FIELD", true),
            /* JADX INFO: Fake field, exist only in values array */
            EF15("PUT_STATIC_FIELD", true),
            f418881j("GET_STATIC_FIELD", true);


            /* renamed from: b, reason: collision with root package name */
            public final int f418883b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f418884c;

            HandleType(String str, boolean z12) {
                this.f418883b = i;
                this.f418884c = z12;
            }
        }

        @JavaDispatcher.i("java.lang.invoke.MethodHandleInfo")
        public interface a {
            @JavaDispatcher.i("revealDirect")
            @JavaDispatcher.g
            Object a();

            @JavaDispatcher.i("getMethodType")
            Object b();

            @JavaDispatcher.i("getReferenceKind")
            int c();

            @JavaDispatcher.i("getDeclaringClass")
            Class getDeclaringClass();

            @JavaDispatcher.i("getName")
            String getName();
        }

        @JavaDispatcher.i("java.lang.invoke.MethodHandles")
        public interface b {

            @JavaDispatcher.i("java.lang.invoke.MethodHandles$Lookup")
            public interface a {
                @JavaDispatcher.i("revealDirect")
                Object a();
            }

            @JavaDispatcher.i("publicLookup")
            @JavaDispatcher.h
            Object a();
        }

        @JavaDispatcher.i("java.lang.invoke.MethodType")
        public interface c {
            @JavaDispatcher.i("returnType")
            Class a();

            @JavaDispatcher.i("parameterArray")
            Class[] b();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        static {
            /*
                r0 = 0
                java.lang.String r1 = "java.security.AccessController"
                r2 = 0
                java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                java.lang.String r1 = "net.bytebuddy.securitymanager"
                java.lang.String r2 = "true"
                java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                net.bytebuddy.utility.JavaConstant.MethodHandle.f418869j = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.utility.JavaConstant.MethodHandle.f418869j = r0
            L19:
                java.lang.Class<net.bytebuddy.utility.JavaConstant$MethodHandle$a> r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.a.class
                net.bytebuddy.utility.dispatcher.JavaDispatcher r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.a(r0)
                boolean r1 = net.bytebuddy.utility.JavaConstant.MethodHandle.f418869j
                if (r1 == 0) goto L28
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                goto L2c
            L28:
                java.lang.Object r0 = r0.run()
            L2c:
                net.bytebuddy.utility.JavaConstant$MethodHandle$a r0 = (net.bytebuddy.utility.JavaConstant.MethodHandle.a) r0
                net.bytebuddy.utility.JavaConstant.MethodHandle.f418865f = r0
                java.lang.Class<net.bytebuddy.utility.JavaConstant$MethodHandle$c> r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.c.class
                net.bytebuddy.utility.dispatcher.JavaDispatcher r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.a(r0)
                if (r1 == 0) goto L3d
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                goto L41
            L3d:
                java.lang.Object r0 = r0.run()
            L41:
                net.bytebuddy.utility.JavaConstant$MethodHandle$c r0 = (net.bytebuddy.utility.JavaConstant.MethodHandle.c) r0
                net.bytebuddy.utility.JavaConstant.MethodHandle.f418866g = r0
                java.lang.Class<net.bytebuddy.utility.JavaConstant$MethodHandle$b> r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.b.class
                net.bytebuddy.utility.dispatcher.JavaDispatcher r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.a(r0)
                if (r1 == 0) goto L52
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                goto L56
            L52:
                java.lang.Object r0 = r0.run()
            L56:
                net.bytebuddy.utility.JavaConstant$MethodHandle$b r0 = (net.bytebuddy.utility.JavaConstant.MethodHandle.b) r0
                net.bytebuddy.utility.JavaConstant.MethodHandle.f418867h = r0
                java.lang.Class<net.bytebuddy.utility.JavaConstant$MethodHandle$b$a> r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.b.a.class
                net.bytebuddy.utility.dispatcher.JavaDispatcher r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.a(r0)
                if (r1 == 0) goto L67
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                goto L6b
            L67:
                java.lang.Object r0 = r0.run()
            L6b:
                net.bytebuddy.utility.JavaConstant$MethodHandle$b$a r0 = (net.bytebuddy.utility.JavaConstant.MethodHandle.b.a) r0
                net.bytebuddy.utility.JavaConstant.MethodHandle.f418868i = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.utility.JavaConstant.MethodHandle.<clinit>():void");
        }

        public MethodHandle(HandleType handleType, TypeDescription typeDescription, String str, TypeDescription typeDescription2, List<? extends TypeDescription> list) {
            this.f418870a = handleType;
            this.f418871b = typeDescription;
            this.f418872c = str;
            this.f418873d = typeDescription2;
            this.f418874e = list;
        }

        public static MethodHandle b(Object obj) {
            Object objA = f418867h.a();
            if (!JavaType.f418902f.b(obj)) {
                throw new IllegalArgumentException(k.a(obj, "Expected method handle object: "));
            }
            if (!JavaType.f418904h.b(objA)) {
                throw new IllegalArgumentException(k.a(objA, "Expected method handle lookup object: "));
            }
            boolean z12 = ClassFileVersion.h(ClassFileVersion.f415298j).compareTo(ClassFileVersion.f415297i) < 1;
            a aVar = f418865f;
            if (z12) {
                aVar.a();
            } else {
                f418868i.a();
            }
            aVar.b();
            int iC2 = aVar.c();
            for (HandleType handleType : HandleType.values()) {
                if (handleType.f418883b == iC2) {
                    TypeDescription typeDescriptionA0 = TypeDescription.d.A0(aVar.getDeclaringClass());
                    String name = aVar.getName();
                    c cVar = f418866g;
                    return new MethodHandle(handleType, typeDescriptionA0, name, TypeDescription.d.A0(cVar.a()), new d.e(cVar.b()));
                }
            }
            throw new IllegalArgumentException(AK.c.g(iC2, "Unknown handle type: "));
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
        @Override // net.bytebuddy.utility.JavaConstant
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a() {
            /*
                r8 = this;
                net.bytebuddy.jar.asm.p r6 = new net.bytebuddy.jar.asm.p
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r0 = r8.f418870a
                net.bytebuddy.description.type.TypeDescription r1 = r8.f418871b
                java.lang.String r2 = r1.V()
                int r3 = r0.ordinal()
                r4 = 5
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r5 = r8.f418874e
                if (r3 == r4) goto L54
                r4 = 6
                net.bytebuddy.description.type.TypeDescription r7 = r8.f418873d
                if (r3 == r4) goto L4f
                r4 = 7
                if (r3 == r4) goto L54
                r4 = 8
                if (r3 == r4) goto L4f
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "("
                r3.<init>(r4)
                java.util.Iterator r4 = r5.iterator()
            L2a:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L3e
                java.lang.Object r5 = r4.next()
                net.bytebuddy.description.type.TypeDescription r5 = (net.bytebuddy.description.type.TypeDescription) r5
                java.lang.String r5 = r5.getDescriptor()
                r3.append(r5)
                goto L2a
            L3e:
                r4 = 41
                r3.append(r4)
                java.lang.String r4 = r7.getDescriptor()
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                goto L5f
            L4f:
                java.lang.String r3 = r7.getDescriptor()
                goto L5f
            L54:
                r3 = 0
                java.lang.Object r3 = r5.get(r3)
                net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                java.lang.String r3 = r3.getDescriptor()
            L5f:
                boolean r5 = r1.E()
                java.lang.String r4 = r8.f418872c
                int r7 = r0.f418883b
                r0 = r6
                r1 = r2
                r2 = r4
                r4 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.utility.JavaConstant.MethodHandle.a():java.lang.Object");
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MethodHandle)) {
                return false;
            }
            MethodHandle methodHandle = (MethodHandle) obj;
            return this.f418870a == methodHandle.f418870a && this.f418872c.equals(methodHandle.f418872c) && this.f418871b.equals(methodHandle.f418871b) && this.f418874e.equals(methodHandle.f418874e) && this.f418873d.equals(methodHandle.f418873d);
        }

        public final int hashCode() {
            return this.f418874e.hashCode() + D8.j(this.f418873d, H.d(D8.j(this.f418871b, this.f418870a.hashCode() * 31, 31), 31, this.f418872c), 31);
        }

        @Override // net.bytebuddy.utility.JavaConstant
        public final TypeDescription t() {
            return JavaType.f418902f.f418912b;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            HandleType handleType = this.f418870a;
            sb2.append(handleType.name());
            TypeDescription typeDescription = this.f418871b;
            sb2.append((!typeDescription.E() || handleType.f418884c || handleType == HandleType.f418878g) ? "" : "@interface");
            sb2.append('/');
            sb2.append(typeDescription.l0());
            sb2.append("::");
            sb2.append(this.f418872c);
            sb2.append('(');
            boolean z12 = true;
            for (TypeDescription typeDescription2 : this.f418874e) {
                if (z12) {
                    z12 = false;
                } else {
                    sb2.append(',');
                }
                sb2.append(typeDescription2.l0());
            }
            sb2.append(')');
            sb2.append(this.f418873d.l0());
            return sb2.toString();
        }
    }

    public interface Visitor<T> {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class NoOp implements Visitor<JavaConstant> {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ NoOp[] f418885b = {new NoOp("INSTANCE", 0)};

            /* JADX INFO: Fake field, exist only in values array */
            NoOp EF5;

            public NoOp() {
                throw null;
            }

            public static NoOp valueOf(String str) {
                return (NoOp) Enum.valueOf(NoOp.class, str);
            }

            public static NoOp[] values() {
                return (NoOp[]) f418885b.clone();
            }
        }
    }

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f418886a;

        static {
            int[] iArr = new int[MethodHandle.HandleType.values().length];
            f418886a = iArr;
            try {
                iArr[6] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f418886a[8] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f418886a[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f418886a[7] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b implements JavaConstant {
        @Override // net.bytebuddy.utility.JavaConstant
        public final Object a() {
            throw null;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        @Override // net.bytebuddy.utility.JavaConstant
        public final TypeDescription t() {
            return null;
        }

        public final String toString() {
            throw null;
        }
    }

    public static class c implements JavaConstant {

        /* renamed from: c, reason: collision with root package name */
        public static final a f418887c;

        /* renamed from: d, reason: collision with root package name */
        public static final boolean f418888d;

        /* renamed from: a, reason: collision with root package name */
        public final TypeDescription f418889a;

        /* renamed from: b, reason: collision with root package name */
        public final net.bytebuddy.description.type.d f418890b;

        @JavaDispatcher.i("java.lang.invoke.MethodType")
        public interface a {
            @JavaDispatcher.i("returnType")
            Class a();

            @JavaDispatcher.i("parameterArray")
            Class[] b();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        static {
            /*
                r0 = 0
                java.lang.String r1 = "java.security.AccessController"
                r2 = 0
                java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                java.lang.String r1 = "net.bytebuddy.securitymanager"
                java.lang.String r2 = "true"
                java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                net.bytebuddy.utility.JavaConstant.c.f418888d = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.utility.JavaConstant.c.f418888d = r0
            L19:
                java.lang.Class<net.bytebuddy.utility.JavaConstant$c$a> r0 = net.bytebuddy.utility.JavaConstant.c.a.class
                net.bytebuddy.utility.dispatcher.JavaDispatcher r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.a(r0)
                boolean r1 = net.bytebuddy.utility.JavaConstant.c.f418888d
                if (r1 == 0) goto L28
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                goto L2c
            L28:
                java.lang.Object r0 = r0.run()
            L2c:
                net.bytebuddy.utility.JavaConstant$c$a r0 = (net.bytebuddy.utility.JavaConstant.c.a) r0
                net.bytebuddy.utility.JavaConstant.c.f418887c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.utility.JavaConstant.c.<clinit>():void");
        }

        public c(TypeDescription typeDescription, net.bytebuddy.description.type.d dVar) {
            this.f418889a = typeDescription;
            this.f418890b = dVar;
        }

        public static c b(Object obj) {
            if (!JavaType.f418903g.b(obj)) {
                throw new IllegalArgumentException(k.a(obj, "Expected method type object: "));
            }
            a aVar = f418887c;
            return new c(TypeDescription.d.A0(aVar.a()), new d.e(aVar.b()));
        }

        @Override // net.bytebuddy.utility.JavaConstant
        public final Object a() {
            StringBuilder sb2 = new StringBuilder("(");
            Iterator<TypeDescription> it = new d.C12001d(this.f418890b).iterator();
            while (it.hasNext()) {
                sb2.append(it.next().getDescriptor());
            }
            sb2.append(')');
            sb2.append(this.f418889a.getDescriptor());
            return B.o(sb2.toString());
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f418890b.equals(cVar.f418890b) && this.f418889a.equals(cVar.f418889a);
        }

        public final int hashCode() {
            return this.f418890b.hashCode() + (this.f418889a.hashCode() * 31);
        }

        @Override // net.bytebuddy.utility.JavaConstant
        public final TypeDescription t() {
            return JavaType.f418903g.f418912b;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("(");
            boolean z12 = true;
            for (TypeDescription typeDescription : this.f418890b) {
                if (z12) {
                    z12 = false;
                } else {
                    sb2.append(',');
                }
                sb2.append(typeDescription.l0());
            }
            sb2.append(')');
            sb2.append(this.f418889a.l0());
            return sb2.toString();
        }
    }

    public static abstract class d<T> implements JavaConstant {

        /* renamed from: c, reason: collision with root package name */
        public static final a f418891c;

        /* renamed from: d, reason: collision with root package name */
        public static final a.InterfaceC12143a f418892d;

        /* renamed from: e, reason: collision with root package name */
        public static final a.e f418893e;

        /* renamed from: f, reason: collision with root package name */
        public static final a.InterfaceC12145d f418894f;

        /* renamed from: g, reason: collision with root package name */
        public static final a.b f418895g;

        /* renamed from: h, reason: collision with root package name */
        public static final a.b.InterfaceC12144a f418896h;

        /* renamed from: i, reason: collision with root package name */
        public static final a.c f418897i;

        /* renamed from: j, reason: collision with root package name */
        public static final boolean f418898j;

        /* renamed from: a, reason: collision with root package name */
        public final T f418899a;

        /* renamed from: b, reason: collision with root package name */
        public final TypeDescription f418900b;

        @JavaDispatcher.i("java.lang.constant.ConstantDesc")
        public interface a {

            @JavaDispatcher.i("java.lang.constant.ClassDesc")
            /* renamed from: net.bytebuddy.utility.JavaConstant$d$a$a, reason: collision with other inner class name */
            public interface InterfaceC12143a extends a {
            }

            @JavaDispatcher.i("java.lang.constant.DirectMethodHandleDesc")
            public interface b extends a {

                @JavaDispatcher.i("java.lang.constant.DirectMethodHandleDesc$Kind")
                /* renamed from: net.bytebuddy.utility.JavaConstant$d$a$b$a, reason: collision with other inner class name */
                public interface InterfaceC12144a {
                }
            }

            @JavaDispatcher.i("java.lang.constant.DynamicConstantDesc")
            public interface c extends a {
            }

            @JavaDispatcher.i("java.lang.constant.MethodHandleDesc")
            /* renamed from: net.bytebuddy.utility.JavaConstant$d$a$d, reason: collision with other inner class name */
            public interface InterfaceC12145d extends a {
            }

            @JavaDispatcher.i("java.lang.constant.MethodTypeDesc")
            public interface e extends a {
            }
        }

        public static class b<S> extends d<S> {
            public b() {
                throw null;
            }

            @Override // net.bytebuddy.utility.JavaConstant
            public final Object a() {
                return this.f418899a;
            }
        }

        public static class c extends d<TypeDescription> {
            @Override // net.bytebuddy.utility.JavaConstant
            public final Object a() {
                return B.v(((TypeDescription) this.f418899a).getDescriptor());
            }
        }

        static {
            boolean z12 = false;
            try {
                Class.forName("java.security.AccessController", false, null);
                f418898j = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
            } catch (ClassNotFoundException unused) {
                f418898j = z12;
                f418891c = (a) b(JavaDispatcher.a(a.class));
                f418892d = (a.InterfaceC12143a) b(JavaDispatcher.a(a.InterfaceC12143a.class));
                f418893e = (a.e) b(JavaDispatcher.a(a.e.class));
                f418894f = (a.InterfaceC12145d) b(JavaDispatcher.a(a.InterfaceC12145d.class));
                f418895g = (a.b) b(JavaDispatcher.a(a.b.class));
                f418896h = (a.b.InterfaceC12144a) b(JavaDispatcher.a(a.b.InterfaceC12144a.class));
                f418897i = (a.c) b(JavaDispatcher.a(a.c.class));
            } catch (SecurityException unused2) {
                z12 = true;
                f418898j = z12;
                f418891c = (a) b(JavaDispatcher.a(a.class));
                f418892d = (a.InterfaceC12143a) b(JavaDispatcher.a(a.InterfaceC12143a.class));
                f418893e = (a.e) b(JavaDispatcher.a(a.e.class));
                f418894f = (a.InterfaceC12145d) b(JavaDispatcher.a(a.InterfaceC12145d.class));
                f418895g = (a.b) b(JavaDispatcher.a(a.b.class));
                f418896h = (a.b.InterfaceC12144a) b(JavaDispatcher.a(a.b.InterfaceC12144a.class));
                f418897i = (a.c) b(JavaDispatcher.a(a.c.class));
            }
            f418891c = (a) b(JavaDispatcher.a(a.class));
            f418892d = (a.InterfaceC12143a) b(JavaDispatcher.a(a.InterfaceC12143a.class));
            f418893e = (a.e) b(JavaDispatcher.a(a.e.class));
            f418894f = (a.InterfaceC12145d) b(JavaDispatcher.a(a.InterfaceC12145d.class));
            f418895g = (a.b) b(JavaDispatcher.a(a.b.class));
            f418896h = (a.b.InterfaceC12144a) b(JavaDispatcher.a(a.b.InterfaceC12144a.class));
            f418897i = (a.c) b(JavaDispatcher.a(a.c.class));
        }

        public d(T t12, TypeDescription typeDescription) {
            this.f418899a = t12;
            this.f418900b = typeDescription;
        }

        @a.b
        public static Object b(JavaDispatcher javaDispatcher) {
            return f418898j ? AccessController.doPrivileged(javaDispatcher) : javaDispatcher.run();
        }

        public static c c(TypeDescription typeDescription) {
            if (typeDescription.w5()) {
                throw new IllegalArgumentException(D8.o("A primitive type cannot be represented as a type constant: ", typeDescription));
            }
            return new c(typeDescription, TypeDescription.f416319C2);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f418899a.equals(((d) obj).f418899a);
        }

        public final int hashCode() {
            return this.f418899a.hashCode();
        }

        @Override // net.bytebuddy.utility.JavaConstant
        public final TypeDescription t() {
            return this.f418900b;
        }

        public final String toString() {
            return this.f418899a.toString();
        }
    }

    Object a();

    TypeDescription t();
}
