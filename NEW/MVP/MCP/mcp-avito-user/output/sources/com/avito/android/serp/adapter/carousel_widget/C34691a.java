package com.avito.android.serp.adapter.carousel_widget;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.di.InterfaceC30264p;
import com.avito.android.di.module.InterfaceC30177s2;
import com.avito.android.di.module.InterfaceC30221w2;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.L0;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CarouselItemBlueprint.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_widget/a;", "LTV0/b;", "Lcom/avito/android/serp/adapter/carousel_widget/h;", "Lcom/avito/android/serp/adapter/carousel_widget/CarouselWidgetItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.carousel_widget.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34691a implements TV0.b<InterfaceC34698h, CarouselWidgetItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final I f269315a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.h f269316b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.a f269317c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.d f269318d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f269319e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f269320f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.a f269321g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final RecyclerView.t f269322h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final L0 f269323i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f269324j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f269325k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f269326l = new g.a<>(R.layout.advert_item_carousel_widget, new C8040a());

    /* compiled from: CarouselItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/carousel_widget/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/carousel_widget/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.carousel_widget.a$a, reason: collision with other inner class name */
    public static final class C8040a extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, C34699i> {
        public C8040a() {
            super(2);
        }

        @Override // Y41.p
        public final C34699i invoke(ViewGroup viewGroup, View view) {
            C34691a c34691a = C34691a.this;
            com.avito.android.favorite.h hVar = c34691a.f269316b;
            String str = c34691a.f269325k;
            InterfaceC35745a5 interfaceC35745a5 = c34691a.f269320f;
            com.avito.android.favorite.p pVar = new com.avito.android.favorite.p(hVar, interfaceC35745a5, str);
            com.avito.android.advert.viewed.g gVar = new com.avito.android.advert.viewed.g(c34691a.f269317c, c34691a.f269318d, c34691a.f269319e, interfaceC35745a5);
            com.avito.konveyor.a aVar = c34691a.f269321g;
            com.avito.konveyor.adapter.h hVar2 = new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
            I i12 = c34691a.f269315a;
            com.avito.android.util.text.a aVar2 = c34691a.f269324j;
            return new C34699i(pVar, gVar, hVar2, c34691a.f269323i, c34691a.f269321g, c34691a.f269322h, view, i12, aVar2);
        }
    }

    @Inject
    public C34691a(@Y61.k I i12, @Y61.k com.avito.android.favorite.h hVar, @Y61.k com.avito.android.advert.viewed.a aVar, @Y61.k com.avito.android.advert.viewed.d dVar, @Y61.k R0 r02, @Y61.k InterfaceC35745a5 interfaceC35745a5, @InterfaceC30177s2 @Y61.k com.avito.konveyor.a aVar2, @InterfaceC30221w2 @Y61.l RecyclerView.t tVar, @Y61.k L0 l02, @Y61.k com.avito.android.util.text.a aVar3, @Y61.l @InterfaceC30264p String str) {
        this.f269315a = i12;
        this.f269316b = hVar;
        this.f269317c = aVar;
        this.f269318d = dVar;
        this.f269319e = r02;
        this.f269320f = interfaceC35745a5;
        this.f269321g = aVar2;
        this.f269322h = tVar;
        this.f269323i = l02;
        this.f269324j = aVar3;
        this.f269325k = str;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f269315a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f269326l;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof CarouselWidgetItem;
    }
}
