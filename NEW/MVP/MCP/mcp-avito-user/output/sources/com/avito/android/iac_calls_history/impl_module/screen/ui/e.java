package com.avito.android.iac_calls_history.impl_module.screen.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.items.IacCallsHistoryItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CallsHistoryScreenUI.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class e extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CallsHistoryScreenState f164894l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f164895m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f164896n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<IacCallsHistoryItem, G0> f164897o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f164898p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f164899q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v.a f164900r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f164901s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CallsHistoryScreenState callsHistoryScreenState, Y41.a aVar, Y41.l lVar, Y41.l lVar2, Y41.a aVar2, Y41.a aVar3, v.a aVar4, int i12) {
        super(2);
        this.f164894l = callsHistoryScreenState;
        this.f164895m = aVar;
        this.f164896n = lVar;
        this.f164897o = lVar2;
        this.f164898p = aVar2;
        this.f164899q = aVar3;
        this.f164900r = aVar4;
        this.f164901s = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f164901s | 1);
        Y41.l<IacCallsHistoryItem, G0> lVar = this.f164897o;
        Y41.a<G0> aVar = this.f164898p;
        r.a(this.f164894l, this.f164895m, this.f164896n, lVar, aVar, this.f164899q, this.f164900r, a12, iA2);
        return G0.f406611a;
    }
}
