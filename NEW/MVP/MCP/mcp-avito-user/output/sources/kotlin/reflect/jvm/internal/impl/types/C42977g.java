package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42966b;

/* compiled from: AbstractTypeChecker.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42977g extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ TypeCheckerState f410203l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42966b f410204m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u51.i f410205n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u51.i f410206o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42977g(TypeCheckerState typeCheckerState, InterfaceC42966b interfaceC42966b, u51.i iVar, u51.i iVar2) {
        super(0);
        this.f410203l = typeCheckerState;
        this.f410204m = interfaceC42966b;
        this.f410205n = iVar;
        this.f410206o = iVar2;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        C42975f c42975f = C42975f.f410201a;
        u51.k kVarI = this.f410204m.I(this.f410205n);
        TypeCheckerState typeCheckerState = this.f410203l;
        c42975f.getClass();
        return Boolean.valueOf(C42975f.h(typeCheckerState, kVarI, this.f410206o));
    }
}
