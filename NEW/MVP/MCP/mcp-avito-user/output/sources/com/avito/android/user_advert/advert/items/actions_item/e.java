package com.avito.android.user_advert.advert.items.actions_item;

import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import com.avito.android.user_advert.advert.items.actions_item.ActionsItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ActionsItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f309036l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ActionsItem.Action f309037m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, ActionsItem.Action action) {
        super(0);
        this.f309036l = dVar;
        this.f309037m = action;
    }

    @Override // Y41.a
    public final G0 invoke() {
        MyAdvertDetailsActivity myAdvertDetailsActivity = this.f309036l.f309032b;
        if (myAdvertDetailsActivity != null) {
            myAdvertDetailsActivity.a2(this.f309037m);
        }
        return G0.f406611a;
    }
}
