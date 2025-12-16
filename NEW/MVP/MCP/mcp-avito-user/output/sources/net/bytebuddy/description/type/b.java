package net.bytebuddy.description.type;

import c61.AbstractC26949b;
import c61.C26950c;
import com.yandex.div2.D8;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.Type;
import net.bytebuddy.build.k;
import net.bytebuddy.description.TypeVariableSource;
import net.bytebuddy.description.a;
import net.bytebuddy.description.annotation.AnnotationSource;
import net.bytebuddy.description.annotation.a;
import net.bytebuddy.description.b;
import net.bytebuddy.description.d;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.matcher.InterfaceC44410t;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;

/* compiled from: RecordComponentDescription.java */
/* loaded from: classes8.dex */
public interface b extends b.a, d.a, AnnotationSource, a.b<c, f> {

    /* compiled from: RecordComponentDescription.java */
    public static abstract class a implements b {
        @Override // net.bytebuddy.description.type.b, net.bytebuddy.description.a.b
        public final f a(InterfaceC44410t.a.AbstractC12113a abstractC12113a) {
            return new f(R(), (TypeDescription.Generic) getType().h0(new TypeDescription.Generic.Visitor.d.b(abstractC12113a)), getDeclaredAnnotations());
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return R().equals(((b) obj).R());
            }
            return false;
        }

        @Override // net.bytebuddy.description.d.a
        public final String getDescriptor() {
            return getType().f5().getDescriptor();
        }

        @Override // net.bytebuddy.description.d.a
        @net.bytebuddy.utility.nullability.b
        public String h() {
            TypeDescription.Generic type = getType();
            try {
                if (type.o().b()) {
                    return null;
                }
                return ((AbstractC26949b) type.h0(new TypeDescription.Generic.Visitor.b(new C26950c()))).toString();
            } catch (GenericSignatureFormatError unused) {
                return null;
            }
        }

        public final int hashCode() {
            return R().hashCode();
        }

        public final String toString() {
            return getType().getTypeName() + " " + R();
        }
    }

    /* compiled from: RecordComponentDescription.java */
    /* renamed from: net.bytebuddy.description.type.b$b, reason: collision with other inner class name */
    public static class C11999b extends c.a {

        /* renamed from: c, reason: collision with root package name */
        public static final a f416514c;

        /* renamed from: d, reason: collision with root package name */
        public static final boolean f416515d;

        /* renamed from: b, reason: collision with root package name */
        public final AnnotatedElement f416516b;

        /* compiled from: RecordComponentDescription.java */
        @JavaDispatcher.i("java.lang.reflect.RecordComponent")
        /* renamed from: net.bytebuddy.description.type.b$b$a */
        public interface a {
            @JavaDispatcher.i("getAnnotatedType")
            AnnotatedElement a();

            @JavaDispatcher.i("getGenericType")
            Type b();

            @JavaDispatcher.i("getDeclaringRecord")
            Class c();

            @JavaDispatcher.i("getName")
            String getName();

            @JavaDispatcher.i("getType")
            Class getType();

            @JavaDispatcher.i("getGenericSignature")
            @net.bytebuddy.utility.nullability.b
            String h();
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
                net.bytebuddy.description.type.b.C11999b.f416515d = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.description.type.b.C11999b.f416515d = r0
            L19:
                java.lang.Class<net.bytebuddy.description.type.b$b$a> r0 = net.bytebuddy.description.type.b.C11999b.a.class
                net.bytebuddy.utility.dispatcher.JavaDispatcher r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.a(r0)
                boolean r1 = net.bytebuddy.description.type.b.C11999b.f416515d
                if (r1 == 0) goto L28
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
                goto L2c
            L28:
                java.lang.Object r0 = r0.run()
            L2c:
                net.bytebuddy.description.type.b$b$a r0 = (net.bytebuddy.description.type.b.C11999b.a) r0
                net.bytebuddy.description.type.b.C11999b.f416514c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.description.type.b.C11999b.<clinit>():void");
        }

        public C11999b(AnnotatedElement annotatedElement) {
            this.f416516b = annotatedElement;
        }

        @Override // net.bytebuddy.description.d
        public final String R() {
            return f416514c.getName();
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            return new a.d(this.f416516b.getDeclaredAnnotations());
        }

        @Override // net.bytebuddy.description.type.b
        public final TypeDescription.Generic getType() {
            return new TypeDescription.Generic.b.f(this.f416516b);
        }

        @Override // net.bytebuddy.description.type.b.a, net.bytebuddy.description.d.a
        @net.bytebuddy.utility.nullability.b
        public final String h() {
            return f416514c.h();
        }

        @Override // net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @I41.g
        public final TypeDefinition n() {
            return TypeDescription.d.A0(f416514c.c());
        }
    }

    /* compiled from: RecordComponentDescription.java */
    public interface d extends b {
    }

    /* compiled from: RecordComponentDescription.java */
    public static class e extends c.a {

        /* renamed from: b, reason: collision with root package name */
        public final InstrumentedType.b f416517b;

        /* renamed from: c, reason: collision with root package name */
        public final String f416518c;

        /* renamed from: d, reason: collision with root package name */
        public final TypeDescription.Generic f416519d;

        /* renamed from: e, reason: collision with root package name */
        public final a.c f416520e;

        public e() {
            throw null;
        }

        public e(InstrumentedType.b bVar, f fVar) {
            String str = fVar.f416521a;
            a.c cVar = new a.c(fVar.f416523c);
            this.f416517b = bVar;
            this.f416518c = str;
            this.f416519d = fVar.f416522b;
            this.f416520e = cVar;
        }

        @Override // net.bytebuddy.description.d
        public final String R() {
            return this.f416518c;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            return new a.c(this.f416520e);
        }

        @Override // net.bytebuddy.description.type.b
        public final TypeDescription.Generic getType() {
            InstrumentedType.b bVar = this.f416517b;
            bVar.getClass();
            return (TypeDescription.Generic) this.f416519d.h0(new TypeDescription.Generic.Visitor.d.a((TypeDefinition) bVar, (TypeVariableSource) bVar));
        }

        @Override // net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @I41.g
        public final TypeDefinition n() {
            return this.f416517b;
        }
    }

    /* compiled from: RecordComponentDescription.java */
    public static class f implements a.InterfaceC11963a<f> {

        /* renamed from: a, reason: collision with root package name */
        public final String f416521a;

        /* renamed from: b, reason: collision with root package name */
        public final TypeDescription.Generic f416522b;

        /* renamed from: c, reason: collision with root package name */
        public final net.bytebuddy.description.annotation.a f416523c;

        /* renamed from: d, reason: collision with root package name */
        public transient /* synthetic */ int f416524d;

        public f(String str, TypeDescription.Generic generic, net.bytebuddy.description.annotation.a aVar) {
            this.f416521a = str;
            this.f416522b = generic;
            this.f416523c = aVar;
        }

        @Override // net.bytebuddy.description.a.InterfaceC11963a
        public final a.InterfaceC11963a a(TypeDescription.Generic.Visitor.d.b bVar) {
            return new f(this.f416521a, (TypeDescription.Generic) this.f416522b.h0(bVar), this.f416523c);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            return this.f416521a.equals(fVar.f416521a) && this.f416522b.equals(fVar.f416522b) && this.f416523c.equals(fVar.f416523c);
        }

        @k.c
        public final int hashCode() {
            int i12;
            if (this.f416524d != 0) {
                i12 = 0;
            } else {
                i12 = D8.i(this.f416522b, this.f416521a.hashCode() * 31, 31) + this.f416523c.hashCode();
            }
            if (i12 == 0) {
                return this.f416524d;
            }
            this.f416524d = i12;
            return i12;
        }
    }

    /* compiled from: RecordComponentDescription.java */
    public static class g extends a implements d {
        public g() {
            throw null;
        }

        @Override // net.bytebuddy.description.d
        public final String R() {
            throw null;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public final net.bytebuddy.description.annotation.a getDeclaredAnnotations() {
            throw null;
        }

        @Override // net.bytebuddy.description.type.b
        public final TypeDescription.Generic getType() {
            throw null;
        }

        @Override // net.bytebuddy.description.a.b
        public final a.b i() {
            throw null;
        }

        @Override // net.bytebuddy.description.b, net.bytebuddy.description.field.a.c
        @I41.g
        public final TypeDefinition n() {
            return null;
        }
    }

    @Override // net.bytebuddy.description.a.b
    f a(InterfaceC44410t.a.AbstractC12113a abstractC12113a);

    TypeDescription.Generic getType();

    /* compiled from: RecordComponentDescription.java */
    public interface c extends b {

        /* compiled from: RecordComponentDescription.java */
        public static abstract class a extends a implements c {
            @Override // net.bytebuddy.description.a.b
            public final a.b i() {
                return this;
            }
        }
    }
}
