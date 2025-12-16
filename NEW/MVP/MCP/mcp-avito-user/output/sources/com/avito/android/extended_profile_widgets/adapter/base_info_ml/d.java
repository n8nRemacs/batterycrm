package com.avito.android.extended_profile_widgets.adapter.base_info_ml;

import com.avito.android.remote.model.ProfileRatingAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import oB.y;

/* compiled from: BaseInfoMlItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f154263l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ProfileRatingAction f154264m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ BaseInfoMlItem f154265n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, ProfileRatingAction profileRatingAction, BaseInfoMlItem baseInfoMlItem) {
        super(0);
        this.f154263l = hVar;
        this.f154264m = profileRatingAction;
        this.f154265n = baseInfoMlItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f154263l.f154270b.invoke(new y(this.f154264m, this.f154265n.f154253h.getAnalytics()));
        return G0.f406611a;
    }
}
