package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: DateRangePicker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/D6;", "mode", "Lkotlin/G0;", "invoke-QujVXRc", "(ILandroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.f6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21559f6 extends kotlin.jvm.internal.N implements Y41.q<D6, androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Long f36315l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Long f36316m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f36317n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.p<Long, Long, kotlin.G0> f36318o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Long, kotlin.G0> f36319p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC21692l2 f36320q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ kotlin.ranges.l f36321r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21648j4 f36322s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Ce f36323t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y3 f36324u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21559f6(Long l12, Long l13, long j12, Y41.p<? super Long, ? super Long, kotlin.G0> pVar, Y41.l<? super Long, kotlin.G0> lVar, AbstractC21692l2 abstractC21692l2, kotlin.ranges.l lVar2, InterfaceC21648j4 interfaceC21648j4, Ce ce2, Y3 y32) {
        super(3);
        this.f36315l = l12;
        this.f36316m = l13;
        this.f36317n = j12;
        this.f36318o = pVar;
        this.f36319p = lVar;
        this.f36320q = abstractC21692l2;
        this.f36321r = lVar2;
        this.f36322s = interfaceC21648j4;
        this.f36323t = ce2;
        this.f36324u = y32;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(D6 d62, androidx.compose.runtime.A a12, Integer num) {
        int i12 = d62.f34622a;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= a13.m(i12) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && a13.c()) {
            a13.f();
        } else {
            D6.f34620b.getClass();
            if (D6.b(i12, 0)) {
                a13.I(-1168744807);
                C21811q6.b(this.f36315l, this.f36316m, this.f36317n, this.f36318o, this.f36319p, this.f36320q, this.f36321r, this.f36322s, this.f36323t, this.f36324u, a13, 0);
                a13.O();
            } else if (D6.b(i12, D6.f34621c)) {
                a13.I(-1168744198);
                J5.a(this.f36315l, this.f36316m, this.f36318o, this.f36320q, this.f36321r, this.f36322s, this.f36323t, this.f36324u, a13, 0);
                a13.O();
            } else {
                a13.I(-1168743741);
                a13.O();
            }
        }
        return kotlin.G0.f406611a;
    }
}
