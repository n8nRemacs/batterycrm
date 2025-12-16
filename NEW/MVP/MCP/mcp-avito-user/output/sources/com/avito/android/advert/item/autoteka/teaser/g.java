package com.avito.android.advert.item.autoteka.teaser;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsAutotekaTeaserBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser/g;", "LTV0/b;", "Lcom/avito/android/advert/item/autoteka/teaser/m;", "Lcom/avito/android/advert/item/autoteka/teaser/AdvertDetailsAutotekaTeaserItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements TV0.b<m, AdvertDetailsAutotekaTeaserItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f73029a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f73030b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<m> f73031c = new g.a<>(R.layout.advert_details_autoteka_teaser, new a());

    /* compiled from: AdvertDetailsAutotekaTeaserBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/autoteka/teaser/m;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/autoteka/teaser/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, m> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final m invoke(ViewGroup viewGroup, View view) {
            g gVar = g.this;
            com.avito.konveyor.adapter.j jVar = gVar.f73030b;
            i iVar = gVar.f73029a;
            return new m(view, jVar, iVar, iVar);
        }
    }

    @Inject
    public g(@Y61.k i iVar, @Y61.k @y4.e com.avito.konveyor.adapter.j jVar) {
        this.f73029a = iVar;
        this.f73030b = jVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f73029a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<m> b() {
        return this.f73031c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof AdvertDetailsAutotekaTeaserItem;
    }
}
