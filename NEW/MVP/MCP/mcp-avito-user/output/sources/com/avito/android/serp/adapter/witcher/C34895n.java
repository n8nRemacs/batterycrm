package com.avito.android.serp.adapter.witcher;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.di.InterfaceC30264p;
import com.avito.android.di.module.ia;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.L0;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: WitcherItemBlueprint.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/n;", "LTV0/b;", "Lcom/avito/android/serp/adapter/witcher/D;", "Lcom/avito/android/serp/adapter/witcher/WitcherItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.witcher.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34895n implements TV0.b<D, WitcherItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f273870a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.a f273871b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.d f273872c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f273873d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f273874e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f273875f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final r f273876g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final L0 f273877h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final M f273878i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f273879j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final g.a<J> f273880k = new g.a<>(R.layout.advert_item_witcher, new a());

    /* compiled from: WitcherItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/witcher/J;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/witcher/J;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.witcher.n$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, J> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final J invoke(ViewGroup viewGroup, View view) {
            C34895n c34895n = C34895n.this;
            com.avito.android.favorite.h hVar = c34895n.f273870a;
            String str = c34895n.f273879j;
            InterfaceC35745a5 interfaceC35745a5 = c34895n.f273874e;
            com.avito.android.favorite.p pVar = new com.avito.android.favorite.p(hVar, interfaceC35745a5, str);
            com.avito.android.advert.viewed.g gVar = new com.avito.android.advert.viewed.g(c34895n.f273871b, c34895n.f273872c, c34895n.f273873d, interfaceC35745a5);
            com.avito.konveyor.a aVar = c34895n.f273875f;
            com.avito.konveyor.adapter.h hVar2 = new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
            M m12 = c34895n.f273878i;
            r rVar = c34895n.f273876g;
            return new J(pVar, gVar, hVar2, c34895n.f273877h, c34895n.f273875f, m12, view, rVar);
        }
    }

    @Inject
    public C34895n(@Y61.k com.avito.android.favorite.h hVar, @Y61.k com.avito.android.advert.viewed.a aVar, @Y61.k com.avito.android.advert.viewed.d dVar, @Y61.k R0 r02, @Y61.k InterfaceC35745a5 interfaceC35745a5, @ia @Y61.k com.avito.konveyor.a aVar2, @Y61.k r rVar, @Y61.k L0 l02, @Y61.k M m12, @Y61.l @InterfaceC30264p String str) {
        this.f273870a = hVar;
        this.f273871b = aVar;
        this.f273872c = dVar;
        this.f273873d = r02;
        this.f273874e = interfaceC35745a5;
        this.f273875f = aVar2;
        this.f273876g = rVar;
        this.f273877h = l02;
        this.f273878i = m12;
        this.f273879j = str;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f273876g;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<J> b() {
        return this.f273880k;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof WitcherItem;
    }
}
