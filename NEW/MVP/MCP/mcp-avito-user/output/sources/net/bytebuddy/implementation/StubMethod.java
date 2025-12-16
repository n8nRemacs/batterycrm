package net.bytebuddy.implementation;

import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.implementation.bytecode.constant.DefaultValue;
import net.bytebuddy.implementation.bytecode.member.MethodReturn;
import net.bytebuddy.jar.asm.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class StubMethod implements Implementation.b, net.bytebuddy.implementation.bytecode.a {

    /* renamed from: b, reason: collision with root package name */
    public static final StubMethod f417445b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ StubMethod[] f417446c;

    static {
        StubMethod stubMethod = new StubMethod("INSTANCE", 0);
        f417445b = stubMethod;
        f417446c = new StubMethod[]{stubMethod};
    }

    public StubMethod() {
        throw null;
    }

    public static StubMethod valueOf(String str) {
        return (StubMethod) Enum.valueOf(StubMethod.class, str);
    }

    public static StubMethod[] values() {
        return (StubMethod[]) f417446c.clone();
    }

    @Override // net.bytebuddy.implementation.bytecode.a
    public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
        return new a.c(new StackManipulation.b(DefaultValue.c(aVar.getReturnType()), MethodReturn.c(aVar.getReturnType())).n(sVar, context).f417834b, aVar.p());
    }

    @Override // net.bytebuddy.implementation.Implementation.b
    public final Implementation.b c(Implementation.b bVar) {
        return bVar;
    }

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public final InstrumentedType e(InstrumentedType instrumentedType) {
        return instrumentedType;
    }

    @Override // net.bytebuddy.implementation.Implementation
    public final net.bytebuddy.implementation.bytecode.a i(Implementation.Target target) {
        return this;
    }
}
