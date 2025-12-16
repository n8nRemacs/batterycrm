package com.avito.android.serp.adapter.constructor;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import bj.InterfaceC25659b;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItemViewImpl;
import com.avito.android.di.module.Y2;
import com.avito.android.serp.adapter.E0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: SerpConstructorAdvertAvitoMallBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/constructor/t;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/blueprint/a;", "Lcom/avito/android/serp/adapter/constructor/SerpConstructorAdvertItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t extends com.avito.android.constructor_advert.ui.serp.constructor.blueprint.a<SerpConstructorAdvertItem> {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final g.a<ConstructorAdvertItemViewImpl> f269757h;

    /* compiled from: SerpConstructorAdvertAvitoMallBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItemViewImpl;", "<anonymous parameter 0>", "Landroid/view/ViewGroup;", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<ViewGroup, View, ConstructorAdvertItemViewImpl> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ E0 f269758l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C36135w2 f269759m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC25659b f269760n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.constructor_advert.ui.serp.constructor.b f269761o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.video_snippets.g f269762p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.t f269763q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RecyclerView.t tVar, InterfaceC25659b interfaceC25659b, C36135w2 c36135w2, com.avito.android.constructor_advert.ui.serp.constructor.b bVar, E0 e02, com.avito.android.video_snippets.g gVar) {
            super(2);
            this.f269758l = e02;
            this.f269759m = c36135w2;
            this.f269760n = interfaceC25659b;
            this.f269761o = bVar;
            this.f269762p = gVar;
            this.f269763q = tVar;
        }

        @Override // Y41.p
        public final ConstructorAdvertItemViewImpl invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            C36135w2 c36135w2 = this.f269759m;
            boolean zBooleanValue = c36135w2.x().invoke().booleanValue();
            InterfaceC25659b interfaceC25659b = this.f269760n;
            return new ConstructorAdvertItemViewImpl(view2, this.f269758l, zBooleanValue ? interfaceC25659b.c() : interfaceC25659b.a(0), this.f269761o, this.f269762p, AsyncViewportTracker.ViewContext.f430413c, null, Integer.valueOf(R.dimen.constructor_advert_image_corner_radius), c36135w2.x().invoke().booleanValue() ? this.f269763q : null, false, 64, null);
        }
    }

    @Inject
    public t(@Y61.k A a12, @Y61.k E0 e02, @Y61.k InterfaceC25659b interfaceC25659b, @Y61.k com.avito.android.constructor_advert.ui.serp.constructor.b bVar, @Y61.l com.avito.android.video_snippets.g gVar, @Y61.k C36135w2 c36135w2, @Y61.l @Y2 RecyclerView.t tVar) {
        super(a12, e02, interfaceC25659b, bVar, gVar, c36135w2, tVar);
        this.f269757h = new g.a<>(R.layout.constructor_advert_avito_mall_item, new a(tVar, interfaceC25659b, c36135w2, bVar, e02, gVar));
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.blueprint.a, TV0.b
    @Y61.k
    public final g.a<ConstructorAdvertItemViewImpl> b() {
        return this.f269757h;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.blueprint.a, TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof SerpConstructorAdvertItem) && ((SerpConstructorAdvertItem) aVar).getDisplayType().isAvitoMall();
    }
}
