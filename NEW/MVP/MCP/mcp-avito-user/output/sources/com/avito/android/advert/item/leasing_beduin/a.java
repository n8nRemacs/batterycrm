package com.avito.android.advert.item.leasing_beduin;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import bj.InterfaceC25659b;
import com.avito.android.R;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsLeasingBeduinBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/leasing_beduin/a;", "LTV0/b;", "Lcom/avito/android/advert/item/leasing_beduin/f;", "Lcom/avito/android/advert/item/leasing_beduin/AdvertDetailsLeasingBeduinItem;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<f, AdvertDetailsLeasingBeduinItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f77342a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC25659b f77343b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.beduin.k f77344c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<g> f77345d = new g.a<>(R.layout.advert_details_leasing_beduin, new C2281a());

    /* compiled from: AdvertDetailsLeasingBeduinBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert/item/leasing_beduin/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert/item/leasing_beduin/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert.item.leasing_beduin.a$a, reason: collision with other inner class name */
    public static final class C2281a extends N implements p<ViewGroup, View, g> {
        public C2281a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            InterfaceC40691b f73241k = aVar.f77344c.getF73241K();
            return new g(view, aVar.f77343b, aVar.f77344c.getF73241K().B0(), f73241k);
        }
    }

    @Inject
    public a(@k c cVar, @k InterfaceC25659b interfaceC25659b, @k com.avito.android.advert.item.beduin.k kVar) {
        this.f77342a = cVar;
        this.f77343b = interfaceC25659b;
        this.f77344c = kVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f77342a;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f77345d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof AdvertDetailsLeasingBeduinItem;
    }
}
