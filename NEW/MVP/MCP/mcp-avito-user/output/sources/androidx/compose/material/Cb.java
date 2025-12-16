package androidx.compose.material;

import kotlin.Metadata;

/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Cb extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f32498l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f32499m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f32500n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f32501o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f32502p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Cb(float f12, long j12, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar, boolean z12, long j13) {
        super(2);
        this.f32498l = f12;
        this.f32499m = j12;
        this.f32500n = pVar;
        this.f32501o = z12;
        this.f32502p = j13;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
            C21365u5.f34242a.getClass();
            androidx.compose.ui.text.x0 x0VarA = androidx.compose.ui.text.y0.a(C21365u5.c(a13).f34339g, C21365u5.c(a13).f34344l, this.f32498l);
            Bb.b(this.f32499m, this.f32501o ? androidx.compose.ui.text.x0.b(x0VarA, this.f32502p, 0L, null, null, 0L, 0, 0L, null, null, 16777214) : x0VarA, this.f32500n, a13, 384, 0);
        } else {
            a13.f();
        }
        return kotlin.G0.f406611a;
    }
}
