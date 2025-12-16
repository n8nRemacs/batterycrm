package net.bytebuddy.implementation.bind;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class MethodNameEqualityResolver implements MethodDelegationBinder.AmbiguityResolver {

    /* renamed from: b, reason: collision with root package name */
    public static final MethodNameEqualityResolver f417647b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ MethodNameEqualityResolver[] f417648c;

    static {
        MethodNameEqualityResolver methodNameEqualityResolver = new MethodNameEqualityResolver("INSTANCE", 0);
        f417647b = methodNameEqualityResolver;
        f417648c = new MethodNameEqualityResolver[]{methodNameEqualityResolver};
    }

    public MethodNameEqualityResolver() {
        throw null;
    }

    public static MethodNameEqualityResolver valueOf(String str) {
        return (MethodNameEqualityResolver) Enum.valueOf(MethodNameEqualityResolver.class, str);
    }

    public static MethodNameEqualityResolver[] values() {
        return (MethodNameEqualityResolver[]) f417648c.clone();
    }

    @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
    public final MethodDelegationBinder.AmbiguityResolver.Resolution a(net.bytebuddy.description.method.a aVar, MethodDelegationBinder.MethodBinding methodBinding, MethodDelegationBinder.MethodBinding methodBinding2) {
        boolean zEquals = methodBinding.b().getName().equals(aVar.getName());
        return methodBinding2.b().getName().equals(aVar.getName()) ^ zEquals ? zEquals ? MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT : MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT : MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS;
    }
}
