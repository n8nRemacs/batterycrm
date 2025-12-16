package com.avito.android.advert_details_items.toast_item_popularity;

import Y61.l;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ToastItemPopularityPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/toast_item_popularity/b;", "Lcom/avito/android/advert_details_items/toast_item_popularity/a;", "<init>", "()V", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f85758a;

    @Inject
    public b() {
    }

    @Override // com.avito.android.advert_details_items.toast_item_popularity.a
    /* renamed from: H, reason: from getter */
    public final boolean getF85758a() {
        return this.f85758a;
    }

    @Override // com.avito.android.advert_details_items.toast_item_popularity.a
    public final void a() {
        this.f85758a = true;
    }

    @Override // com.avito.android.advert_details_items.toast_item_popularity.a
    public final boolean b() {
        return !this.f85758a;
    }

    @Override // com.avito.android.advert_details_items.toast_item_popularity.a
    public final void c(@l Boolean bool) {
        this.f85758a = bool.booleanValue();
    }
}
