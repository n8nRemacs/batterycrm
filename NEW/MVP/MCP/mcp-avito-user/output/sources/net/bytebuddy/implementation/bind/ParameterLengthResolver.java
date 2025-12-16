package net.bytebuddy.implementation.bind;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ParameterLengthResolver implements MethodDelegationBinder.AmbiguityResolver {

    /* renamed from: b, reason: collision with root package name */
    public static final ParameterLengthResolver f417649b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ParameterLengthResolver[] f417650c;

    static {
        ParameterLengthResolver parameterLengthResolver = new ParameterLengthResolver("INSTANCE", 0);
        f417649b = parameterLengthResolver;
        f417650c = new ParameterLengthResolver[]{parameterLengthResolver};
    }

    public ParameterLengthResolver() {
        throw null;
    }

    public static ParameterLengthResolver valueOf(String str) {
        return (ParameterLengthResolver) Enum.valueOf(ParameterLengthResolver.class, str);
    }

    public static ParameterLengthResolver[] values() {
        return (ParameterLengthResolver[]) f417650c.clone();
    }

    @Override // net.bytebuddy.implementation.bind.MethodDelegationBinder.AmbiguityResolver
    public final MethodDelegationBinder.AmbiguityResolver.Resolution a(net.bytebuddy.description.method.a aVar, MethodDelegationBinder.MethodBinding methodBinding, MethodDelegationBinder.MethodBinding methodBinding2) {
        int size = methodBinding.b().getParameters().size();
        int size2 = methodBinding2.b().getParameters().size();
        return size == size2 ? MethodDelegationBinder.AmbiguityResolver.Resolution.AMBIGUOUS : size < size2 ? MethodDelegationBinder.AmbiguityResolver.Resolution.RIGHT : MethodDelegationBinder.AmbiguityResolver.Resolution.LEFT;
    }
}
