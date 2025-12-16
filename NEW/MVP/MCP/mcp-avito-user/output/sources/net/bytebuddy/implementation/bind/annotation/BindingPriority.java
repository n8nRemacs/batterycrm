package net.bytebuddy.implementation.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import net.bytebuddy.description.annotation.AnnotationDescription;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import net.bytebuddy.matcher.C44411u;

@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface BindingPriority {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Resolver implements MethodDelegationBinder.AmbiguityResolver {

        /* renamed from: b, reason: collision with root package name */
        public static final Resolver f417665b;

        /* renamed from: c, reason: collision with root package name */
        public static final a.d f417666c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Resolver[] f417667d;

        static {
            Resolver resolver = new Resolver("INSTANCE", 0);
            f417665b = resolver;
            f417667d = new Resolver[]{resolver};
            f417666c = (a.d) TypeDescription.d.A0(BindingPriority.class).q().P1(C44411u.x("value")).M2();
        }

        public Resolver() {
            throw null;
        }

        public static Resolver valueOf(String str) {
            return (Resolver) Enum.valueOf(Resolver.class, str);
        }

        public static Resolver[] values() {
            return (Resolver[]) f417667d.clone();
        }

        @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
        public final MethodDelegationBinder.AmbiguityResolver.Resolution a(net.bytebuddy.description.method.a aVar, MethodDelegationBinder.MethodBinding methodBinding, MethodDelegationBinder.MethodBinding methodBinding2) {
            AnnotationDescription.g gVarM6 = methodBinding.b().getDeclaredAnnotations().m6(BindingPriority.class);
            a.d dVar = f417666c;
            int iIntValue = gVarM6 == null ? 1 : ((Integer) gVarM6.d(dVar).b(Integer.class)).intValue();
            AnnotationDescription.g gVarM62 = methodBinding2.b().getDeclaredAnnotations().m6(BindingPriority.class);
            int iIntValue2 = gVarM62 != null ? ((Integer) gVarM62.d(dVar).b(Integer.class)).intValue() : 1;
            return iIntValue == iIntValue2 ? MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS : iIntValue < iIntValue2 ? MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT : MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT;
        }
    }
}
