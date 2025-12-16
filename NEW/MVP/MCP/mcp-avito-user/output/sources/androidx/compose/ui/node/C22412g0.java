package androidx.compose.ui.node;

import androidx.compose.ui.layout.K0;
import kotlin.Metadata;

/* compiled from: LookaheadPassDelegate.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.ui.node.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22412g0 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22404c0 f40786l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ J0 f40787m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f40788n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22412g0(C22404c0 c22404c0, J0 j02, long j12) {
        super(0);
        this.f40786l = c22404c0;
        this.f40787m = j02;
        this.f40788n = j12;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        AbstractC22400a0 f40958u;
        C22404c0 c22404c0 = this.f40786l;
        boolean zA2 = U.a(c22404c0.f40745g.f40678a);
        T t12 = c22404c0.f40745g;
        K0.a placementScope = null;
        if (zA2 || t12.f40680c) {
            AbstractC22443w0 abstractC22443w0 = t12.a().f40913r;
            if (abstractC22443w0 != null) {
                placementScope = abstractC22443w0.f40706j;
            }
        } else {
            AbstractC22443w0 abstractC22443w02 = t12.a().f40913r;
            if (abstractC22443w02 != null && (f40958u = abstractC22443w02.getF40958U()) != null) {
                placementScope = f40958u.f40706j;
            }
        }
        if (placementScope == null) {
            placementScope = this.f40787m.getPlacementScope();
        }
        K0.a.g(placementScope, t12.a().getF40958U(), this.f40788n);
        return kotlin.G0.f406611a;
    }
}
