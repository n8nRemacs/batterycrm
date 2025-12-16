package net.bytebuddy.implementation.bind;

import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class DeclaringTypeResolver implements MethodDelegationBinder.AmbiguityResolver {

    /* renamed from: b, reason: collision with root package name */
    public static final DeclaringTypeResolver f417602b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ DeclaringTypeResolver[] f417603c;

    static {
        DeclaringTypeResolver declaringTypeResolver = new DeclaringTypeResolver("INSTANCE", 0);
        f417602b = declaringTypeResolver;
        f417603c = new DeclaringTypeResolver[]{declaringTypeResolver};
    }

    public DeclaringTypeResolver() {
        throw null;
    }

    public static DeclaringTypeResolver valueOf(String str) {
        return (DeclaringTypeResolver) Enum.valueOf(DeclaringTypeResolver.class, str);
    }

    public static DeclaringTypeResolver[] values() {
        return (DeclaringTypeResolver[]) f417603c.clone();
    }

    @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
    public final MethodDelegationBinder.AmbiguityResolver.Resolution a(net.bytebuddy.description.method.a aVar, MethodDelegationBinder.MethodBinding methodBinding, MethodDelegationBinder.MethodBinding methodBinding2) {
        TypeDescription typeDescriptionF5 = methodBinding.b().n().f5();
        TypeDescription typeDescriptionF52 = methodBinding2.b().n().f5();
        boolean zEquals = typeDescriptionF5.equals(typeDescriptionF52);
        MethodDelegationBinder.AmbiguityResolver.Resolution resolution = MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS;
        return zEquals ? resolution : typeDescriptionF5.Z5(typeDescriptionF52) ? MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT : typeDescriptionF5.m5(typeDescriptionF52) ? MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT : resolution;
    }
}
