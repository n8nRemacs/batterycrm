package net.bytebuddy.matcher;

import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.a;
import net.bytebuddy.matcher.InterfaceC44410t;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes7.dex */
public class MethodSortMatcher<T extends net.bytebuddy.description.method.a> extends InterfaceC44410t.a.d<T> {

    /* renamed from: b, reason: collision with root package name */
    public final Sort f418385b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class Sort {

        /* renamed from: d, reason: collision with root package name */
        public static final Sort f418386d;

        /* renamed from: e, reason: collision with root package name */
        public static final Sort f418387e;

        /* renamed from: f, reason: collision with root package name */
        public static final Sort f418388f;

        /* renamed from: g, reason: collision with root package name */
        public static final Sort f418389g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ Sort[] f418390h;

        /* renamed from: b, reason: collision with root package name */
        public final String f418391b;

        /* renamed from: c, reason: collision with root package name */
        public final MethodSortMatcher<?> f418392c;

        public enum a extends Sort {
            @Override // net.bytebuddy.matcher.MethodSortMatcher.Sort
            public final boolean a(net.bytebuddy.description.method.a aVar) {
                return aVar.C();
            }
        }

        public enum b extends Sort {
            @Override // net.bytebuddy.matcher.MethodSortMatcher.Sort
            public final boolean a(net.bytebuddy.description.method.a aVar) {
                return aVar.v0();
            }
        }

        public enum c extends Sort {
            @Override // net.bytebuddy.matcher.MethodSortMatcher.Sort
            public final boolean a(net.bytebuddy.description.method.a aVar) {
                return aVar.d0();
            }
        }

        public enum d extends Sort {
            @Override // net.bytebuddy.matcher.MethodSortMatcher.Sort
            public final boolean a(net.bytebuddy.description.method.a aVar) {
                return aVar.q0();
            }
        }

        public enum e extends Sort {
            @Override // net.bytebuddy.matcher.MethodSortMatcher.Sort
            public final boolean a(net.bytebuddy.description.method.a aVar) {
                return aVar.i0();
            }
        }

        static {
            a aVar = new a("METHOD", 0, "isMethod()", null);
            f418386d = aVar;
            b bVar = new b("CONSTRUCTOR", 1, "isConstructor()", null);
            f418387e = bVar;
            c cVar = new c("TYPE_INITIALIZER", 2, "isTypeInitializer()", null);
            f418388f = cVar;
            d dVar = new d("VIRTUAL", 3, "isVirtual()", null);
            f418389g = dVar;
            f418390h = new Sort[]{aVar, bVar, cVar, dVar, new e("DEFAULT_METHOD", 4, "isDefaultMethod()", null)};
        }

        public Sort() {
            throw null;
        }

        public Sort(String str, int i12, String str2, a aVar) {
            this.f418391b = str2;
            this.f418392c = new MethodSortMatcher<>(this);
        }

        public static Sort valueOf(String str) {
            return (Sort) Enum.valueOf(Sort.class, str);
        }

        public static Sort[] values() {
            return (Sort[]) f418390h.clone();
        }

        public abstract boolean a(net.bytebuddy.description.method.a aVar);
    }

    public MethodSortMatcher(Sort sort) {
        this.f418385b = sort;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final boolean c(Object obj) {
        return this.f418385b.a((net.bytebuddy.description.method.a) obj);
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
            return this.f418385b.equals(((MethodSortMatcher) obj).f418385b);
        }
        return false;
    }

    @Override // net.bytebuddy.matcher.InterfaceC44410t.a.d
    public final int hashCode() {
        return this.f418385b.hashCode() + (super.hashCode() * 31);
    }

    public final String toString() {
        return this.f418385b.f418391b;
    }
}
