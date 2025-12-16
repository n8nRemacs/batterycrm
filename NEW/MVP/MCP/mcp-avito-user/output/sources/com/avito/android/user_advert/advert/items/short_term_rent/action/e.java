package com.avito.android.user_advert.advert.items.short_term_rent.action;

import Y61.k;
import Y61.l;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ShortTermRentActionItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/short_term_rent/action/e;", "Lcom/avito/android/user_advert/advert/items/short_term_rent/action/c;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @l
    public MyAdvertDetailsActivity f310238b;

    @Inject
    public e() {
    }

    @Override // com.avito.android.user_advert.advert.items.short_term_rent.action.c
    public final void L5(@k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f310238b = myAdvertDetailsActivity;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        OH0.a aVar2 = (OH0.a) aVar;
        gVar.b(aVar2.f12155c.getTitle());
        gVar.S(new d(this, aVar2));
    }

    @Override // com.avito.android.user_advert.advert.items.short_term_rent.action.c
    public final void c0() {
        this.f310238b = null;
    }
}
