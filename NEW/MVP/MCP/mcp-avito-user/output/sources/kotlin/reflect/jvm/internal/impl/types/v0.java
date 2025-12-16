package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* compiled from: TypeParameterUpperBoundEraser.kt */
/* loaded from: classes8.dex */
final class v0 extends kotlin.jvm.internal.N implements Y41.a<kotlin.reflect.jvm.internal.impl.types.error.f> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u0 f410263l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(u0 u0Var) {
        super(0);
        this.f410263l = u0Var;
    }

    @Override // Y41.a
    public final kotlin.reflect.jvm.internal.impl.types.error.f invoke() {
        return kotlin.reflect.jvm.internal.impl.types.error.h.b(ErrorTypeKind.f410174z, this.f410263l.toString());
    }
}
