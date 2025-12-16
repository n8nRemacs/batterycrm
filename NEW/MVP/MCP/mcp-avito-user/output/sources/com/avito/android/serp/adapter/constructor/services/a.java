package com.avito.android.serp.adapter.constructor.services;

import TV0.d;
import TV0.g;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import bj.InterfaceC25659b;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.cyclic_gallery_widget.image_carousel.m;
import com.avito.android.di.module.Z2;
import com.avito.android.serp.adapter.constructor.SerpConstructorAdvertItem;
import com.avito.android.serp.adapter.constructor.rich.C;
import com.avito.android.serp.adapter.constructor.rich.ConstructorAdvertItemRichViewImpl;
import com.avito.android.serp.adapter.constructor.rich.InterfaceC34722a;
import com.avito.android.serp.adapter.rich_snippets.p;
import com.avito.android.util.R0;
import com.avito.android.video_snippets.g;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: SerpConstructorAdvertServicesRichBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/constructor/services/a;", "LTV0/b;", "Lcom/avito/android/serp/adapter/constructor/rich/C;", "Lcom/avito/android/serp/adapter/constructor/SerpConstructorAdvertItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements TV0.b<C, SerpConstructorAdvertItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC34722a f269735a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC25659b f269736b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.constructor_advert.ui.serp.constructor.b f269737c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final p f269738d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final RecyclerView.t f269739e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C36135w2 f269740f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final RecyclerView.t f269741g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final g f269742h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.pinch_to_zoom.b f269743i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final R0 f269744j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final g.a<ConstructorAdvertItemRichViewImpl> f269745k = new g.a<>(R.layout.constructor_advert_item_services_rich, new C8044a());

    /* compiled from: SerpConstructorAdvertServicesRichBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/serp/adapter/constructor/rich/ConstructorAdvertItemRichViewImpl;", "<anonymous parameter 0>", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.adapter.constructor.services.a$a, reason: collision with other inner class name */
    public static final class C8044a extends N implements Y41.p<ViewGroup, View, ConstructorAdvertItemRichViewImpl> {
        public C8044a() {
            super(2);
        }

        @Override // Y41.p
        public final ConstructorAdvertItemRichViewImpl invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            float f12 = view2.getResources().getConfiguration().orientation == 2 ? 0.32f : 0.56f;
            a aVar = a.this;
            boolean zBooleanValue = aVar.f269740f.x().invoke().booleanValue();
            InterfaceC25659b interfaceC25659b = aVar.f269736b;
            return new ConstructorAdvertItemRichViewImpl(view2, zBooleanValue ? interfaceC25659b.c() : interfaceC25659b.a(0), aVar.f269737c, aVar.f269738d.b(), new m(f12, 1.3333334f, 0.0f, 0.0f, 12, null), aVar.f269739e, AsyncViewportTracker.ViewContext.f430422l, aVar.f269740f.x().invoke().booleanValue() ? aVar.f269741g : null, aVar.f269742h, aVar.f269744j, aVar.f269743i);
        }
    }

    @Inject
    public a(@k InterfaceC34722a interfaceC34722a, @k InterfaceC25659b interfaceC25659b, @k com.avito.android.constructor_advert.ui.serp.constructor.b bVar, @k p pVar, @k RecyclerView.t tVar, @k C36135w2 c36135w2, @Z2 @l RecyclerView.t tVar2, @k com.avito.android.video_snippets.g gVar, @k com.avito.android.pinch_to_zoom.b bVar2, @k R0 r02) {
        this.f269735a = interfaceC34722a;
        this.f269736b = interfaceC25659b;
        this.f269737c = bVar;
        this.f269738d = pVar;
        this.f269739e = tVar;
        this.f269740f = c36135w2;
        this.f269741g = tVar2;
        this.f269742h = gVar;
        this.f269743i = bVar2;
        this.f269744j = r02;
    }

    @Override // TV0.b
    public final d a() {
        return this.f269735a;
    }

    @Override // TV0.b
    @k
    public final g.a<ConstructorAdvertItemRichViewImpl> b() {
        return this.f269745k;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof SerpConstructorAdvertItem) && ((SerpConstructorAdvertItem) aVar).getDisplayType().isService();
    }
}
