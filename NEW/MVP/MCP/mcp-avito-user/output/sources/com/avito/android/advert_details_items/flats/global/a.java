package com.avito.android.advert_details_items.flats.global;

import TV0.d;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert_details_items.flats.AdvertDetailsFlatsItem;
import com.avito.android.advert_details_items.flats.c;
import com.avito.android.advert_details_items.flats.f;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import lD.C43617a;

/* compiled from: AdvertDetailsFlatsGlobalBrandBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/flats/global/a;", "LTV0/b;", "Lcom/avito/android/advert_details_items/flats/f;", "Lcom/avito/android/advert_details_items/flats/AdvertDetailsFlatsItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<f, AdvertDetailsFlatsItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f84733a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.advert.k f84734b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C43617a f84735c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<com.avito.android.advert_details_items.flats.g> f84736d = new g.a<>(R.layout.advert_details_items_flats_global_brand, new C2515a());

    /* compiled from: AdvertDetailsFlatsGlobalBrandBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_details_items/flats/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_details_items/flats/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_details_items.flats.global.a$a, reason: collision with other inner class name */
    public static final class C2515a extends N implements p<ViewGroup, View, com.avito.android.advert_details_items.flats.g> {
        public C2515a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.advert_details_items.flats.g invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            return new com.avito.android.advert_details_items.flats.g(view, true, true, false, aVar.f84734b, aVar.f84735c.x().invoke().booleanValue(), 8, null);
        }
    }

    @Inject
    public a(@k c cVar, @k com.avito.android.advert_core.advert.k kVar, @k C43617a c43617a) {
        this.f84733a = cVar;
        this.f84734b = kVar;
        this.f84735c = c43617a;
    }

    @Override // TV0.b
    public final d a() {
        return this.f84733a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.android.advert_details_items.flats.g> b() {
        return this.f84736d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof AdvertDetailsFlatsItem;
    }
}
