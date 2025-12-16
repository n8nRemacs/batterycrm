package com.avito.android.serp.adapter.constructor.rich;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import bj.InterfaceC25659b;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.di.module.Z2;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: SerpConstructorAdvertRichBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/constructor/rich/D;", "LTV0/b;", "Lcom/avito/android/serp/adapter/constructor/rich/C;", "Lcom/avito/android/serp/adapter/constructor/SerpConstructorAdvertItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class D implements TV0.b<C, SerpConstructorAdvertItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34722a f269638a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC25659b f269639b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.constructor_advert.ui.serp.constructor.b f269640c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.rich_snippets.p f269641d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RecyclerView.t f269642e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f269643f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final RecyclerView.t f269644g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.video_snippets.g f269645h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.pinch_to_zoom.b f269646i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final R0 f269647j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final g.a<ConstructorAdvertItemRichViewImpl> f269648k = new g.a<>(R.layout.constructor_advert_item_rich, new a());

    /* compiled from: SerpConstructorAdvertRichBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/serp/adapter/constructor/rich/ConstructorAdvertItemRichViewImpl;", "<anonymous parameter 0>", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<ViewGroup, View, ConstructorAdvertItemRichViewImpl> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final ConstructorAdvertItemRichViewImpl invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            float f12 = view2.getResources().getConfiguration().orientation == 2 ? 0.32f : 0.56f;
            D d12 = D.this;
            boolean zBooleanValue = d12.f269643f.x().invoke().booleanValue();
            InterfaceC25659b interfaceC25659b = d12.f269639b;
            return new ConstructorAdvertItemRichViewImpl(view2, zBooleanValue ? interfaceC25659b.c() : interfaceC25659b.a(0), d12.f269640c, d12.f269641d.b(), new com.avito.android.cyclic_gallery_widget.image_carousel.m(f12, 1.3333334f, 0.0f, 0.0f, 12, null), d12.f269642e, AsyncViewportTracker.ViewContext.f430432v, d12.f269643f.x().invoke().booleanValue() ? d12.f269644g : null, d12.f269645h, d12.f269647j, d12.f269646i);
        }
    }

    @Inject
    public D(@Y61.k InterfaceC34722a interfaceC34722a, @Y61.k InterfaceC25659b interfaceC25659b, @Y61.k com.avito.android.constructor_advert.ui.serp.constructor.b bVar, @Y61.k com.avito.android.serp.adapter.rich_snippets.p pVar, @Y61.k RecyclerView.t tVar, @Y61.k C36135w2 c36135w2, @Z2 @Y61.l RecyclerView.t tVar2, @Y61.k com.avito.android.video_snippets.g gVar, @Y61.k com.avito.android.pinch_to_zoom.b bVar2, @Y61.k R0 r02) {
        this.f269638a = interfaceC34722a;
        this.f269639b = interfaceC25659b;
        this.f269640c = bVar;
        this.f269641d = pVar;
        this.f269642e = tVar;
        this.f269643f = c36135w2;
        this.f269644g = tVar2;
        this.f269645h = gVar;
        this.f269646i = bVar2;
        this.f269647j = r02;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f269638a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<ConstructorAdvertItemRichViewImpl> b() {
        return this.f269648k;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof SerpConstructorAdvertItem) && ((SerpConstructorAdvertItem) aVar).getDisplayType().isRich();
    }
}
