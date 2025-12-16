package com.avito.android.advert.item.autoteka.teaser_v2;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsAutotekaTeaserV2Blueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser_v2/a;", "LTV0/b;", "Lcom/avito/android/advert/item/autoteka/teaser/v2/a;", "Lcom/avito/android/advert/item/autoteka/teaser_v2/AdvertDetailsAutotekaTeaserV2Item;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<com.avito.android.advert.item.autoteka.teaser.v2.a, AdvertDetailsAutotekaTeaserV2Item> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f73108a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.android.advert.item.autoteka.teaser.v2.d> f73109b = new g.a<>(R.layout.advert_details_autoteka_teaser_v2, C2198a.f73110l);

    /* compiled from: AdvertDetailsAutotekaTeaserV2Blueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/autoteka/teaser/v2/d;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/autoteka/teaser/v2/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.autoteka.teaser_v2.a$a, reason: collision with other inner class name */
    public static final class C2198a extends N implements p<ViewGroup, View, com.avito.android.advert.item.autoteka.teaser.v2.d> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2198a f73110l = new C2198a();

        public C2198a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.advert.item.autoteka.teaser.v2.d invoke(ViewGroup viewGroup, View view) {
            return new com.avito.android.advert.item.autoteka.teaser.v2.d(view);
        }
    }

    @Inject
    public a(@k c cVar) {
        this.f73108a = cVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f73108a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.android.advert.item.autoteka.teaser.v2.d> b() {
        return this.f73109b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof AdvertDetailsAutotekaTeaserV2Item;
    }
}
