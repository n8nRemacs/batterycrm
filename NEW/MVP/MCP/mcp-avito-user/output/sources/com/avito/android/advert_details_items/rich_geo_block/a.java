package com.avito.android.advert_details_items.rich_geo_block;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsRichGeoBlockBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/rich_geo_block/a;", "LTV0/b;", "Lcom/avito/android/advert_details_items/rich_geo_block/l;", "Lcom/avito/android/advert_details_items/rich_geo_block/AdvertDetailsRichGeoBlockItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<l, AdvertDetailsRichGeoBlockItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f85413a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<n> f85414b = new g.a<>(R.layout.advert_details_items_rich_geo_block, C2544a.f85415l);

    /* compiled from: AdvertDetailsRichGeoBlockBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "viewGroup", "Landroid/view/View;", "view", "Lcom/avito/android/advert_details_items/rich_geo_block/n;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_details_items/rich_geo_block/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_details_items.rich_geo_block.a$a, reason: collision with other inner class name */
    public static final class C2544a extends N implements Y41.p<ViewGroup, View, n> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2544a f85415l = new C2544a();

        public C2544a() {
            super(2);
        }

        @Override // Y41.p
        public final n invoke(ViewGroup viewGroup, View view) {
            return new n(view, D6.s(viewGroup));
        }
    }

    @Inject
    public a(@Y61.k e eVar) {
        this.f85413a = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f85413a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<n> b() {
        return this.f85414b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof AdvertDetailsRichGeoBlockItem;
    }
}
