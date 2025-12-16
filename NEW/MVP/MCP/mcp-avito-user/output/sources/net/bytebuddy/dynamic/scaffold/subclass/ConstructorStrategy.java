package net.bytebuddy.dynamic.scaffold.subclass;

import java.util.Collections;
import java.util.List;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.method.b;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.scaffold.MethodRegistry;
import net.bytebuddy.implementation.SuperMethodCall;
import net.bytebuddy.implementation.attribute.MethodAttributeAppender;
import net.bytebuddy.matcher.C44396e;
import net.bytebuddy.matcher.C44411u;
import net.bytebuddy.matcher.LatentMatcher;
import net.bytebuddy.matcher.MethodSortMatcher;
import net.bytebuddy.matcher.ModifierMatcher;
import net.bytebuddy.matcher.W;

/* loaded from: classes8.dex */
public interface ConstructorStrategy {

    @HashCodeAndEqualsPlugin.Enhance
    public static class b implements ConstructorStrategy {

        /* renamed from: b, reason: collision with root package name */
        public final C44396e f417166b;

        /* renamed from: c, reason: collision with root package name */
        public final MethodAttributeAppender.NoOp f417167c;

        public b() {
            C44396e<?> c44396e = C44396e.f418422c;
            MethodAttributeAppender.NoOp noOp = MethodAttributeAppender.NoOp.f417502b;
            this.f417166b = c44396e;
            this.f417167c = noOp;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f417166b.equals(bVar.f417166b) && this.f417167c.equals(bVar.f417167c);
        }

        public final int hashCode() {
            return this.f417167c.hashCode() + ((this.f417166b.hashCode() + (getClass().hashCode() * 31)) * 31);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class Default implements ConstructorStrategy {

        /* renamed from: b, reason: collision with root package name */
        public static final Default f417163b;

        /* renamed from: c, reason: collision with root package name */
        public static final Default f417164c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Default[] f417165d;

        public enum b extends Default {
            @Override // net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            public final List<a.h> a(TypeDescription typeDescription) {
                TypeDescription.Generic genericC3 = typeDescription.C3();
                if ((genericC3 == null ? new b.C11978b() : (net.bytebuddy.description.method.b) genericC3.q().P1(MethodSortMatcher.Sort.f418387e.f418392c.a(C44411u.z(0)).a(new W(typeDescription)))).size() == 1) {
                    return Collections.singletonList(new a.h(1));
                }
                throw new IllegalArgumentException(typeDescription.C3() + " declares no constructor that is visible to " + typeDescription);
            }

            @Override // net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            public final MethodRegistry b(MethodRegistry methodRegistry) {
                return methodRegistry.a(new LatentMatcher.f(MethodSortMatcher.Sort.f418387e.f418392c), new MethodRegistry.Handler.c(SuperMethodCall.f417447b), MethodAttributeAppender.NoOp.f417502b);
            }
        }

        public enum c extends Default {
            @Override // net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            public final List<a.h> a(TypeDescription typeDescription) {
                TypeDescription.Generic genericC3 = typeDescription.C3();
                return (genericC3 == null ? new b.C11978b() : genericC3.q().P1(MethodSortMatcher.Sort.f418387e.f418392c.a(new W(typeDescription)))).c(C44411u.f(typeDescription));
            }

            @Override // net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            public final MethodRegistry b(MethodRegistry methodRegistry) {
                return methodRegistry.a(new LatentMatcher.f(MethodSortMatcher.Sort.f418387e.f418392c), new MethodRegistry.Handler.c(SuperMethodCall.f417447b), MethodAttributeAppender.NoOp.f417502b);
            }
        }

        public enum d extends Default {
            @Override // net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            public final List<a.h> a(TypeDescription typeDescription) {
                TypeDescription.Generic genericC3 = typeDescription.C3();
                return (genericC3 == null ? new b.C11978b() : genericC3.q().P1(ModifierMatcher.Mode.PUBLIC.f418407d.a(MethodSortMatcher.Sort.f418387e.f418392c))).c(C44411u.f(typeDescription));
            }

            @Override // net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            public final MethodRegistry b(MethodRegistry methodRegistry) {
                return methodRegistry.a(new LatentMatcher.f(MethodSortMatcher.Sort.f418387e.f418392c), new MethodRegistry.Handler.c(SuperMethodCall.f417447b), MethodAttributeAppender.NoOp.f417502b);
            }
        }

        public enum e extends Default {
            @Override // net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            public final List<a.h> a(TypeDescription typeDescription) {
                TypeDescription.Generic genericC3 = typeDescription.C3();
                return (genericC3 == null ? new b.C11978b() : genericC3.q().P1(MethodSortMatcher.Sort.f418387e.f418392c.a(new W(typeDescription)))).c(C44411u.f(typeDescription));
            }

            @Override // net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            public final MethodRegistry b(MethodRegistry methodRegistry) {
                return methodRegistry.a(new LatentMatcher.f(MethodSortMatcher.Sort.f418387e.f418392c), new MethodRegistry.Handler.c(SuperMethodCall.f417447b), MethodAttributeAppender.NoOp.f417502b);
            }

            @Override // net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            public final int c(int i12) {
                return 1;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class f implements ConstructorStrategy {
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

        static {
            a aVar = new a("NO_CONSTRUCTORS", 0, null);
            f417163b = aVar;
            b bVar = new b("DEFAULT_CONSTRUCTOR", 1, null);
            c cVar = new c("IMITATE_SUPER_CLASS", 2, null);
            d dVar = new d("IMITATE_SUPER_CLASS_PUBLIC", 3, null);
            e eVar = new e("IMITATE_SUPER_CLASS_OPENING", 4, null);
            f417164c = eVar;
            f417165d = new Default[]{aVar, bVar, cVar, dVar, eVar};
        }

        public Default() {
            throw null;
        }

        public Default(String str, int i12, a aVar) {
        }

        public static Default valueOf(String str) {
            return (Default) Enum.valueOf(Default.class, str);
        }

        public static Default[] values() {
            return (Default[]) f417165d.clone();
        }

        public abstract List<a.h> a(TypeDescription typeDescription);

        public abstract MethodRegistry b(MethodRegistry methodRegistry);

        public enum a extends Default {
            @Override // net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            public final List<a.h> a(TypeDescription typeDescription) {
                return Collections.emptyList();
            }

            @Override // net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default
            public final MethodRegistry b(MethodRegistry methodRegistry) {
                return methodRegistry;
            }
        }

        public int c(int i12) {
            return i12;
        }
    }
}
