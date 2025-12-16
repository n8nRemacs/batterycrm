package com.avito.android.serp.adapter.advert_xl;

import TV0.g;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: AdvertXlWithNormalizedPriceItemBlueprint.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/advert_xl/A;", "LTV0/b;", "Lcom/avito/android/serp/adapter/advert_xl/x;", "Lcom/avito/android/serp/adapter/advert_xl/AdvertXlItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class A implements TV0.b<x, AdvertXlItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h f268743a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.video_snippets.g f268744b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<y> f268745c = new g.a<>(R.layout.advert_xl_item_with_normalized_price, new a());

    /* renamed from: d, reason: collision with root package name */
    public final boolean f268746d;

    /* compiled from: AdvertXlWithNormalizedPriceItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/advert_xl/y;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/advert_xl/y;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, y> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final y invoke(ViewGroup viewGroup, View view) {
            AsyncViewportTracker.ViewContext viewContext = AsyncViewportTracker.ViewContext.f430413c;
            return new y(view, A.this.f268744b);
        }
    }

    @Inject
    public A(@Y61.k h hVar, @Y61.l com.avito.android.video_snippets.g gVar, @Y61.k Resources resources) {
        this.f268743a = hVar;
        this.f268744b = gVar;
        this.f268746d = resources.getBoolean(R.bool.is_tablet);
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f268743a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<y> b() {
        return this.f268745c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (!(aVar instanceof AdvertXlItem)) {
            return false;
        }
        AdvertXlItem advertXlItem = (AdvertXlItem) aVar;
        if ((!advertXlItem.f268789i.isGrid() && !advertXlItem.f268789i.isList()) || this.f268746d) {
            return false;
        }
        String str = advertXlItem.f268809u;
        return !(str == null || C43066x.K(str));
    }
}
