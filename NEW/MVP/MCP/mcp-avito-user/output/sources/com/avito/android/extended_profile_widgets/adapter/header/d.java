package com.avito.android.extended_profile_widgets.adapter.header;

import com.avito.android.remote.model.ProfileRatingAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import oB.y;

/* compiled from: HeaderItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f154436l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ProfileRatingAction f154437m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ HeaderItem f154438n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, ProfileRatingAction profileRatingAction, HeaderItem headerItem) {
        super(0);
        this.f154436l = hVar;
        this.f154437m = profileRatingAction;
        this.f154438n = headerItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f154436l.f154443b.invoke(new y(this.f154437m, this.f154438n.f154424i.getAnalytics()));
        return G0.f406611a;
    }
}
