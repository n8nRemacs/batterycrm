package com.avito.android.user_advert.advert.items.safe_deal_services.switcher;

import Y41.l;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import com.avito.android.user_advert.advert.items.safe_deal_services.c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SafeDealServiceSwitcherItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class d extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f310067l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c.b f310068m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, c.b bVar) {
        super(1);
        this.f310067l = hVar;
        this.f310068m = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        MyAdvertDetailsActivity myAdvertDetailsActivity = this.f310067l.f310073b;
        if (myAdvertDetailsActivity != null) {
            myAdvertDetailsActivity.l2((c.b.a) this.f310068m, zBooleanValue);
        }
        return G0.f406611a;
    }
}
