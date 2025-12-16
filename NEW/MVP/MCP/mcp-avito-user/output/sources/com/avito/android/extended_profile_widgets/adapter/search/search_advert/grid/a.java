package com.avito.android.extended_profile_widgets.adapter.search.search_advert.grid;

import TV0.g;
import Y41.p;
import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.design.widget.ClickableGalleryPager;
import com.avito.android.extended_profile_widgets.adapter.search.search_advert.SearchAdvertItem;
import com.avito.android.grid.GridElementType;
import com.avito.android.serp.adapter.C34731f;
import com.avito.android.serp.adapter.serp_advert_card.B;
import com.avito.android.server_time.h;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: SearchAdvertGridItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/search_advert/grid/a;", "LTV0/b;", "Lcom/avito/android/serp/adapter/video_snippet/c;", "Lcom/avito/android/extended_profile_widgets/adapter/search/search_advert/SearchAdvertItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements TV0.b<com.avito.android.serp.adapter.video_snippet.c, SearchAdvertItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f154692a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<C34731f> f154693b;

    /* compiled from: SearchAdvertGridItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "rootView", "Lcom/avito/android/serp/adapter/f;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.extended_profile_widgets.adapter.search.search_advert.grid.a$a, reason: collision with other inner class name */
    public static final class C4524a extends N implements p<ViewGroup, View, C34731f> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f154694l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Locale f154695m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.video_snippets.g f154696n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4524a(h hVar, Locale locale, com.avito.android.video_snippets.g gVar) {
            super(2);
            this.f154694l = hVar;
            this.f154695m = locale;
            this.f154696n = gVar;
        }

        @Override // Y41.p
        public final C34731f invoke(ViewGroup viewGroup, View view) {
            C34731f c34731f = new C34731f(view, this.f154694l, this.f154695m, AsyncViewportTracker.ViewContext.f430413c, this.f154696n, null, 32, null);
            B b12 = c34731f.f269948b;
            b12.f271752b0 = false;
            ClickableGalleryPager clickableGalleryPager = b12.f271759f;
            clickableGalleryPager.getLayoutParams().height = -2;
            clickableGalleryPager.setRatio(1.0f);
            return c34731f;
        }
    }

    @Inject
    public a(@k c cVar, @k h hVar, @k Locale locale, @l com.avito.android.video_snippets.g gVar) {
        this.f154692a = cVar;
        this.f154693b = new g.a<>(R.layout.advert_item_grid, new C4524a(hVar, locale, gVar));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f154692a;
    }

    @Override // TV0.b
    @k
    public final g.a<C34731f> b() {
        return this.f154693b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof SearchAdvertItem) {
            if (L.f(((SearchAdvertItem) aVar).f154690c, GridElementType.SingleSpan.f161210b)) {
                return true;
            }
        }
        return false;
    }
}
