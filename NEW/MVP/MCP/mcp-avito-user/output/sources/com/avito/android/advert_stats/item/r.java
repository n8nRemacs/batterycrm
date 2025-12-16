package com.avito.android.advert_stats.item;

import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PlotItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isIdle", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class r extends kotlin.jvm.internal.N implements Y41.l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28339s f86791l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u f86792m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C28339s c28339s, u uVar) {
        super(1);
        this.f86791l = c28339s;
        this.f86792m = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        C28339s c28339s = this.f86791l;
        if (zBooleanValue != c28339s.f86799h) {
            c28339s.f86799h = zBooleanValue;
            Iterator it = ((Iterable) c28339s.f86798g).iterator();
            while (it.hasNext()) {
                Iterator it2 = ((O) it.next()).f86701c.iterator();
                while (it2.hasNext()) {
                    ((C28322a) it2.next()).f86720e = BarState.f86678b;
                }
            }
            ?? r12 = c28339s.f86798g;
            u uVar = this.f86792m;
            uVar.id(r12, false);
            uVar.Zq();
            if (!zBooleanValue) {
                c28339s.f86796e.accept(G0.f406611a);
            }
        }
        return G0.f406611a;
    }
}
