package com.avito.android.calltracking.item;

import com.avito.android.calltracking.I;
import com.avito.android.calltracking.remote.model.Call;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CalltrackingItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/calltracking/item/j;", "LTV0/d;", "Lcom/avito/android/calltracking/item/l;", "Lcom/avito/android/calltracking/item/e;", "_avito_calltracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements TV0.d<l, e> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f113726b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l41.g<I> f113727c;

    @Inject
    public j(@Y61.k a aVar, @Y61.k l41.g<I> gVar) {
        this.f113726b = aVar;
        this.f113727c = gVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((l) eVar, (e) aVar);
    }

    public final void k(@Y61.k l lVar, @Y61.k e eVar) {
        Call call = eVar.f113719b;
        lVar.u30(this.f113726b.a(call.getCallTime(), call.getType(), call.getIsMissed()));
        lVar.z4(call.getPhoneText());
        lVar.BR(call.getItemDescription());
        lVar.t9(call.getPrice());
        lVar.l(call.getImage());
        lVar.sr(call.getIsNew());
        lVar.c(new i(this, eVar));
    }
}
