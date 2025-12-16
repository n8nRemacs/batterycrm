package com.avito.android.serp.adapter.rich_snippets.realty;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.serp.adapter.SerpViewType;
import javax.inject.Inject;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: DevelopmentRichItemBlueprint.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/realty/h;", "LTV0/b;", "Lcom/avito/android/serp/adapter/rich_snippets/realty/w;", "Lcom/avito/android/serp/adapter/rich_snippets/realty/DevelopmentItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.rich_snippets.realty.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34763h implements TV0.b<InterfaceC34777w, DevelopmentItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34765j f270981a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecyclerView.t f270982b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.rich_snippets.p f270983c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.pinch_to_zoom.b f270984d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final g.a<x> f270985e = new g.a<>(R.layout.development_item_rich, new a());

    /* compiled from: DevelopmentRichItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/rich_snippets/realty/x;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/rich_snippets/realty/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.rich_snippets.realty.h$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, x> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final x invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            com.avito.android.cyclic_gallery_widget.image_carousel.m mVar = new com.avito.android.cyclic_gallery_widget.image_carousel.m(view2.getResources().getConfiguration().orientation == 2 ? 0.32f : 0.56f, 1.3333334f, 0.0f, 0.0f, 12, null);
            C34763h c34763h = C34763h.this;
            return new x(view2, mVar, c34763h.f270982b, c34763h.f270983c.b(), AsyncViewportTracker.ViewContext.f430423m, c34763h.f270984d);
        }
    }

    @Inject
    public C34763h(@Y61.k InterfaceC34765j interfaceC34765j, @Y61.k RecyclerView.t tVar, @Y61.k com.avito.android.serp.adapter.rich_snippets.p pVar, @Y61.k com.avito.android.pinch_to_zoom.b bVar) {
        this.f270981a = interfaceC34765j;
        this.f270982b = tVar;
        this.f270983c = pVar;
        this.f270984d = bVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f270981a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<x> b() {
        return this.f270985e;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof DevelopmentItem) {
            DevelopmentItem developmentItem = (DevelopmentItem) aVar;
            if (developmentItem.f270900i == SerpViewType.f268582b && developmentItem.f270901j.isRich()) {
                return true;
            }
        }
        return false;
    }
}
