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

/* compiled from: DevelopmentXlRichItemBlueprint.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/rich_snippets/realty/G;", "LTV0/b;", "Lcom/avito/android/serp/adapter/rich_snippets/realty/w;", "Lcom/avito/android/serp/adapter/rich_snippets/realty/DevelopmentXlItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class G implements TV0.b<InterfaceC34777w, DevelopmentXlItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final I f270933a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecyclerView.t f270934b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.rich_snippets.p f270935c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.pinch_to_zoom.b f270936d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final g.a<x> f270937e = new g.a<>(R.layout.development_item_rich, new a());

    /* compiled from: DevelopmentXlRichItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/rich_snippets/realty/x;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/rich_snippets/realty/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<ViewGroup, View, x> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final x invoke(ViewGroup viewGroup, View view) {
            View view2 = view;
            com.avito.android.cyclic_gallery_widget.image_carousel.m mVar = new com.avito.android.cyclic_gallery_widget.image_carousel.m(view2.getResources().getConfiguration().orientation == 2 ? 0.32f : 0.75f, 1.3333334f, 0.0f, 0.0f, 12, null);
            G g12 = G.this;
            return new x(view2, mVar, g12.f270934b, g12.f270935c.b(), AsyncViewportTracker.ViewContext.f430424n, g12.f270936d);
        }
    }

    @Inject
    public G(@Y61.k I i12, @Y61.k RecyclerView.t tVar, @Y61.k com.avito.android.serp.adapter.rich_snippets.p pVar, @Y61.k com.avito.android.pinch_to_zoom.b bVar) {
        this.f270933a = i12;
        this.f270934b = tVar;
        this.f270935c = pVar;
        this.f270936d = bVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f270933a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<x> b() {
        return this.f270937e;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof DevelopmentXlItem) {
            DevelopmentXlItem developmentXlItem = (DevelopmentXlItem) aVar;
            if (developmentXlItem.f270918h == SerpViewType.f268582b && developmentXlItem.f270919i.isRich()) {
                return true;
            }
        }
        return false;
    }
}
