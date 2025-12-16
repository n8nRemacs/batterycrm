package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: TextFieldImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Ri extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f35383l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f35384m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f35385n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f35386o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f35387p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Ri(float f12, long j12, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar, boolean z12, long j13) {
        super(2);
        this.f35383l = f12;
        this.f35384m = j12;
        this.f35385n = pVar;
        this.f35386o = z12;
        this.f35387p = j13;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 3) == 2 && a13.c()) {
            a13.f();
        } else {
            C21859s9.f37272a.getClass();
            androidx.compose.ui.text.x0 x0VarA = androidx.compose.ui.text.y0.a(C21859s9.b(a13).f35316j, C21859s9.b(a13).f35318l, this.f35383l);
            C21457aj.b(this.f35384m, this.f35386o ? androidx.compose.ui.text.x0.b(x0VarA, this.f35387p, 0L, null, null, 0L, 0, 0L, null, null, 16777214) : x0VarA, this.f35385n, a13, 0, 0);
        }
        return kotlin.G0.f406611a;
    }
}
