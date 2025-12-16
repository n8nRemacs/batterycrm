package com.avito.android.rating_form.item.header;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: HeaderItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/header/e;", "Lcom/avito/android/rating_form/item/header/d;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f248446b;

    @Inject
    public e(@com.avito.android.rating_form.di.c boolean z12) {
        this.f248446b = z12;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        iVar.setText(aVar2.f248438b);
        iVar.x00(aVar2.f248439c && this.f248446b);
    }
}
