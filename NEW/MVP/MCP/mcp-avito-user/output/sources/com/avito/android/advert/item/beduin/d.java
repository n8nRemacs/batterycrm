package com.avito.android.advert.item.beduin;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsBeduinItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/beduin/d;", "LTV0/b;", "Lcom/avito/android/advert/item/beduin/i;", "Lcom/avito/android/advert/item/beduin/AdvertDetailsBeduinItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements TV0.b<i, AdvertDetailsBeduinItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f73225a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25659b f73226b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final k f73227c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.advert.l f73228d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f73229e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f73230f = new g.a<>(R.layout.advert_details_beduin_items, new a());

    /* compiled from: AdvertDetailsBeduinItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/advert/item/beduin/AdvertDetailsBeduinItemViewImpl;", "<anonymous parameter 0>", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<ViewGroup, View, AdvertDetailsBeduinItemViewImpl> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final AdvertDetailsBeduinItemViewImpl invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            d dVar = d.this;
            com.avito.android.beduin.common.component.adapter.a aVarB = dVar.f73226b.b(null);
            k kVar = dVar.f73227c;
            return new AdvertDetailsBeduinItemViewImpl(view2, kVar.getF73241K().B0(), aVarB, kVar, dVar.f73228d, kVar.getF73241K(), dVar.f73229e);
        }
    }

    @Inject
    public d(@Y61.k f fVar, @Y61.k InterfaceC25659b interfaceC25659b, @Y61.k k kVar, @Y61.k com.avito.android.advert_core.advert.l lVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f73225a = fVar;
        this.f73226b = interfaceC25659b;
        this.f73227c = kVar;
        this.f73228d = lVar;
        this.f73229e = interfaceC35745a5;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f73225a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f73230f;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof AdvertDetailsBeduinItem;
    }
}
