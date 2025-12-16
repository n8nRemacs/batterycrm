package com.avito.android.advert_details_items.flats.auto_flats_redesign;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert_details_items.flats.AdvertDetailsFlatsItem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import lD.C43617a;

/* compiled from: AdvertDetailsFlatsBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/flats/auto_flats_redesign/j;", "LTV0/b;", "Lcom/avito/android/advert_details_items/flats/f;", "Lcom/avito/android/advert_details_items/flats/AdvertDetailsFlatsItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements TV0.b<com.avito.android.advert_details_items.flats.f, AdvertDetailsFlatsItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_details_items.flats.c f84710a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.advert.k f84711b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43617a f84712c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.android.advert_details_items.flats.g> f84713d = new g.a<>(R.layout.advert_details_flats_two_column_with_dots, new a());

    /* compiled from: AdvertDetailsFlatsBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_details_items/flats/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_details_items/flats/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, com.avito.android.advert_details_items.flats.g> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.advert_details_items.flats.g invoke(ViewGroup viewGroup, View view) {
            j jVar = j.this;
            return new com.avito.android.advert_details_items.flats.g(view, false, false, true, jVar.f84711b, jVar.f84712c.x().invoke().booleanValue(), 4, null);
        }
    }

    @Inject
    public j(@Y61.k com.avito.android.advert_details_items.flats.c cVar, @Y61.k com.avito.android.advert_core.advert.k kVar, @Y61.k C43617a c43617a) {
        this.f84710a = cVar;
        this.f84711b = kVar;
        this.f84712c = c43617a;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f84710a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.android.advert_details_items.flats.g> b() {
        return this.f84713d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof AdvertDetailsFlatsItem) {
            AdvertDetailsFlatsItem advertDetailsFlatsItem = (AdvertDetailsFlatsItem) aVar;
            if (!advertDetailsFlatsItem.f84662j && !advertDetailsFlatsItem.f84667o && advertDetailsFlatsItem.f84663k) {
                return true;
            }
        }
        return false;
    }
}
