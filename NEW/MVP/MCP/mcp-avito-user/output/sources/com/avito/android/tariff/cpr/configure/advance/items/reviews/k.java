package com.avito.android.tariff.cpr.configure.advance.items.reviews;

import com.avito.android.tariff.cpr.configure.advance.items.reviews.x;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.Z1;

/* compiled from: CprConfigureAdvanceReviewsItemView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class k extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f295298l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x f295299m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(u uVar, x xVar) {
        super(0);
        this.f295298l = uVar;
        this.f295299m = xVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        u uVar = this.f295298l;
        Y41.l<? super x, G0> lVar = uVar.f295314c;
        x xVar = this.f295299m;
        if (lVar != null) {
            ((e) lVar).invoke(xVar);
        }
        if (xVar instanceof x.b) {
            x.b bVar = (x.b) xVar;
            Z1<w> z12 = uVar.f295313b;
            w value = z12.getValue();
            Iterable<Object> iterable = (Iterable) z12.getValue().f295317a;
            ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
            for (Object objA : iterable) {
                boolean z13 = objA instanceof x.b;
                if (z13 && L.f(objA, bVar)) {
                    objA = x.b.a((x.b) objA, true);
                } else if (z13) {
                    objA = x.b.a((x.b) objA, false);
                }
                arrayList.add(objA);
            }
            value.getClass();
            z12.setValue(new w(arrayList, null));
        }
        return G0.f406611a;
    }
}
