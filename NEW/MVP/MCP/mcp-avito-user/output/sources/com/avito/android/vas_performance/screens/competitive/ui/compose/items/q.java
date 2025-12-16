package com.avito.android.vas_performance.screens.competitive.ui.compose.items;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.akita.compose.component.chips.C27332a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CompetitiveVasV2Tabs.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class q extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<C27332a> f320530l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f320531m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f320532n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(int i12, Y41.l lVar, v vVar, List list) {
        super(2);
        this.f320530l = list;
        this.f320531m = vVar;
        this.f320532n = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(57);
        v vVar = this.f320531m;
        r.a(iA2, this.f320532n, a12, vVar, this.f320530l);
        return G0.f406611a;
    }
}
