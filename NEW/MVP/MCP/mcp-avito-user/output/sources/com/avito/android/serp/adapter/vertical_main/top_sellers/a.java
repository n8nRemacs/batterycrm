package com.avito.android.serp.adapter.vertical_main.top_sellers;

import Oi0.C14700d;
import Oi0.InterfaceC14698b;
import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C;
import cs0.InterfaceC39406a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TopSellersWidgetBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/top_sellers/a;", "LTV0/b;", "Lcom/avito/android/serp/adapter/vertical_main/top_sellers/i;", "Lcom/avito/android/serp/adapter/vertical_main/top_sellers/TopSellersWidgetItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<i, TopSellersWidgetItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f273237a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f273238b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC14698b f273239c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C f273240d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f273241e = new g.a<>(R.layout.top_sellers_widget, new C8109a());

    /* compiled from: TopSellersWidgetBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/vertical_main/top_sellers/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/vertical_main/top_sellers/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.vertical_main.top_sellers.a$a, reason: collision with other inner class name */
    public static final class C8109a extends N implements p<ViewGroup, View, i> {
        public C8109a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            a aVar = a.this;
            com.avito.konveyor.a aVar2 = aVar.f273238b;
            com.avito.konveyor.adapter.h hVar = new com.avito.konveyor.adapter.h(aVar2, aVar2, null, 4, null);
            return new i(view, hVar, new C14700d(hVar, aVar.f273239c, aVar.f273240d));
        }
    }

    @Inject
    public a(@k e eVar, @InterfaceC39406a @k com.avito.konveyor.a aVar, @InterfaceC39406a @k InterfaceC14698b interfaceC14698b, @k C c12) {
        this.f273237a = eVar;
        this.f273238b = aVar;
        this.f273239c = interfaceC14698b;
        this.f273240d = c12;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f273237a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f273241e;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof TopSellersWidgetItem;
    }
}
