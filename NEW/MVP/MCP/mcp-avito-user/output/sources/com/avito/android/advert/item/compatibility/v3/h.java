package com.avito.android.advert.item.compatibility.v3;

import TV0.g;
import U4.a;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.C29640d;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GarageCompatibilityV3Blueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v3/h;", "LTV0/b;", "Lcom/avito/android/advert/item/compatibility/v3/q;", "Lcom/avito/android/advert/item/compatibility/v3/GarageCompatibilityV3Item;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements TV0.b<q, GarageCompatibilityV3Item> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k f74412a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f74413b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f74414c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final b f74415d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C29640d f74416e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final g.a<r> f74417f = new g.a<>(R.layout.garage_compatibility_item_v3, new a());

    /* compiled from: GarageCompatibilityV3Blueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/compatibility/v3/r;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/compatibility/v3/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, r> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final r invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            h hVar = h.this;
            com.avito.konveyor.a aVar = hVar.f74413b;
            com.avito.konveyor.adapter.h hVar2 = new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
            return new r(view2, new com.avito.konveyor.adapter.j(hVar2, hVar.f74413b), hVar2, hVar.f74416e, hVar.f74414c, hVar.f74415d);
        }
    }

    @Inject
    public h(@Y61.k k kVar, @a.InterfaceC1095a @Y61.k com.avito.konveyor.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k b bVar, @Y61.k C29640d c29640d) {
        this.f74412a = kVar;
        this.f74413b = aVar;
        this.f74414c = aVar2;
        this.f74415d = bVar;
        this.f74416e = c29640d;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f74412a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<r> b() {
        return this.f74417f;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof GarageCompatibilityV3Item;
    }
}
