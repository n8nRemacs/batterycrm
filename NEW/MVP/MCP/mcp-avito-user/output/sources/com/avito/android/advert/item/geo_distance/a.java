package com.avito.android.advert.item.geo_distance;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsAddressGeoDistanceBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/geo_distance/a;", "LTV0/b;", "Lcom/avito/android/advert/item/geo_distance/k;", "Lcom/avito/android/advert/item/geo_distance/AdvertDetailsAddressGeoDistanceItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<k, AdvertDetailsAddressGeoDistanceItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f75672a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<l> f75673b = new g.a<>(R.layout.advert_details_address_geo_distance, C2244a.f75674l);

    /* compiled from: AdvertDetailsAddressGeoDistanceBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/geo_distance/l;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/geo_distance/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.geo_distance.a$a, reason: collision with other inner class name */
    public static final class C2244a extends N implements p<ViewGroup, View, l> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2244a f75674l = new C2244a();

        public C2244a() {
            super(2);
        }

        @Override // Y41.p
        public final l invoke(ViewGroup viewGroup, View view) {
            return new l(view);
        }
    }

    @Inject
    public a(@Y61.k f fVar) {
        this.f75672a = fVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f75672a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<l> b() {
        return this.f75673b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof AdvertDetailsAddressGeoDistanceItem;
    }
}
