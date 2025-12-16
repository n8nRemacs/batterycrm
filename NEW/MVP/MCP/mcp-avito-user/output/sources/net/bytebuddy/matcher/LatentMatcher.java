package net.bytebuddy.matcher;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.field.a;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.matcher.InterfaceC44410t;

/* loaded from: classes7.dex */
public interface LatentMatcher<T> {

    public enum ForSelfDeclaredMethod implements LatentMatcher<net.bytebuddy.description.method.a> {
        /* JADX INFO: Fake field, exist only in values array */
        DECLARED(false),
        /* JADX INFO: Fake field, exist only in values array */
        NOT_DECLARED(true);


        /* renamed from: b, reason: collision with root package name */
        public final boolean f418377b;

        ForSelfDeclaredMethod(boolean z12) {
            this.f418377b = z12;
        }

        @Override // net.bytebuddy.matcher.LatentMatcher
        public final InterfaceC44410t<? super net.bytebuddy.description.method.a> a(TypeDescription typeDescription) {
            return this.f418377b ? new M(C44411u.k(typeDescription)) : C44411u.k(typeDescription);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class a<S> implements LatentMatcher<S> {
        @Override // net.bytebuddy.matcher.LatentMatcher
        public final InterfaceC44410t<? super S> a(TypeDescription typeDescription) {
            C44396e<?> c44396e = C44396e.f418422c;
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
            getClass().hashCode();
            throw null;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class b<S> implements LatentMatcher<S> {

        /* renamed from: b, reason: collision with root package name */
        public final List<? extends LatentMatcher<? super S>> f418378b;

        public b() {
            throw null;
        }

        public b(LatentMatcher<? super S>... latentMatcherArr) {
            this.f418378b = Arrays.asList(latentMatcherArr);
        }

        @Override // net.bytebuddy.matcher.LatentMatcher
        public final InterfaceC44410t<? super S> a(TypeDescription typeDescription) {
            InterfaceC44410t.a aVarD = C44396e.f418423d;
            Iterator<? extends LatentMatcher<? super S>> it = this.f418378b.iterator();
            while (it.hasNext()) {
                aVarD = aVarD.d(it.next().a(typeDescription));
            }
            return aVarD;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f418378b.equals(((b) obj).f418378b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f418378b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class c implements LatentMatcher<net.bytebuddy.description.field.a> {

        /* renamed from: b, reason: collision with root package name */
        public final a.g f418379b;

        @HashCodeAndEqualsPlugin.Enhance
        public static class a extends InterfaceC44410t.a.d<net.bytebuddy.description.field.a> {

            /* renamed from: b, reason: collision with root package name */
            public final a.f f418380b;

            public a(a.f fVar) {
                this.f418380b = fVar;
            }

            @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
            public final boolean c(net.bytebuddy.description.field.a aVar) {
                return aVar.e().equals(this.f418380b);
            }

            @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f418380b.equals(((a) obj).f418380b);
                }
                return false;
            }

            @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
            public final int hashCode() {
                return this.f418380b.hashCode() + (super.hashCode() * 31);
            }
        }

        public c(a.g gVar) {
            this.f418379b = gVar;
        }

        @Override // net.bytebuddy.matcher.LatentMatcher
        public final InterfaceC44410t<? super net.bytebuddy.description.field.a> a(TypeDescription typeDescription) {
            a.g gVar = this.f418379b;
            gVar.getClass();
            return new a(new a.f(gVar.f416153a, (TypeDescription) gVar.f416155c.h0(new TypeDescription.Generic.Visitor.c(typeDescription, Arrays.asList(new net.bytebuddy.description.type.e[0])))));
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f418379b.equals(((c) obj).f418379b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f418379b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class d implements LatentMatcher<net.bytebuddy.description.method.a> {

        /* renamed from: b, reason: collision with root package name */
        public final a.h f418381b;

        @HashCodeAndEqualsPlugin.Enhance
        public static class a extends InterfaceC44410t.a.d<net.bytebuddy.description.method.a> {

            /* renamed from: b, reason: collision with root package name */
            public final a.g f418382b;

            public a(a.g gVar) {
                this.f418382b = gVar;
            }

            @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
            public final boolean c(net.bytebuddy.description.method.a aVar) {
                return aVar.e().equals(this.f418382b);
            }

            @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (!super.equals(obj)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f418382b.equals(((a) obj).f418382b);
                }
                return false;
            }

            @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
            public final int hashCode() {
                return this.f418382b.hashCode() + (super.hashCode() * 31);
            }
        }

        public d(a.h hVar) {
            this.f418381b = hVar;
        }

        @Override // net.bytebuddy.matcher.LatentMatcher
        public final InterfaceC44410t<? super net.bytebuddy.description.method.a> a(TypeDescription typeDescription) {
            return new a(this.f418381b.c(typeDescription));
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f418381b.equals(((d) obj).f418381b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f418381b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class e implements LatentMatcher<net.bytebuddy.description.type.b> {
        @Override // net.bytebuddy.matcher.LatentMatcher
        public final InterfaceC44410t<? super net.bytebuddy.description.type.b> a(TypeDescription typeDescription) {
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
            getClass().hashCode();
            throw null;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class f<S> implements LatentMatcher<S> {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC44410t<? super S> f418383b;

        public f(InterfaceC44410t<? super S> interfaceC44410t) {
            this.f418383b = interfaceC44410t;
        }

        @Override // net.bytebuddy.matcher.LatentMatcher
        public final InterfaceC44410t<? super S> a(TypeDescription typeDescription) {
            return this.f418383b;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f418383b.equals(((f) obj).f418383b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f418383b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    InterfaceC44410t<? super T> a(TypeDescription typeDescription);
}
