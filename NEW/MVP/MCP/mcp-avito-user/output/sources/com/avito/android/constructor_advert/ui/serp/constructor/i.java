package com.avito.android.constructor_advert.ui.serp.constructor;

import android.content.res.Resources;
import com.avito.android.R;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SnippetSize;
import com.avito.android.serp.adapter.d1;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: ConstructorAdvertDimensionProviderImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/i;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/h;", "a", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Resources f125816a;

    /* renamed from: b, reason: collision with root package name */
    public final int f125817b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final HashMap f125818c;

    @Inject
    public i(@Y61.k Resources resources, @d1 int i12) {
        this.f125816a = resources;
        this.f125817b = i12;
        SnippetSize snippetSize = SnippetSize.SMALL;
        SerpDisplayType serpDisplayType = SerpDisplayType.List;
        Q q12 = new Q(new a(snippetSize, serpDisplayType, false, 4, null), new t(resources.getDimensionPixelSize(R.dimen.list_serp_image_width), resources.getDimensionPixelSize(R.dimen.list_serp_image_width), AsyncViewportTracker.ViewContext.f430418h));
        SerpDisplayType serpDisplayType2 = SerpDisplayType.Grid;
        a aVar = new a(snippetSize, serpDisplayType2, false, 4, null);
        int iE2 = e(resources);
        AsyncViewportTracker.ViewContext viewContext = AsyncViewportTracker.ViewContext.f430413c;
        Q q13 = new Q(aVar, new t(-1, iE2, viewContext));
        Q q14 = new Q(new a(snippetSize, serpDisplayType2, true), new t(-1, (e(resources) / 2) * 3, viewContext));
        SnippetSize snippetSize2 = SnippetSize.MEDIUM;
        a aVar2 = new a(snippetSize2, serpDisplayType, false, 4, null);
        int iD2 = d(resources);
        AsyncViewportTracker.ViewContext viewContext2 = AsyncViewportTracker.ViewContext.f430414d;
        Q q15 = new Q(aVar2, new t(-1, iD2, viewContext2));
        Q q16 = new Q(new a(snippetSize2, serpDisplayType2, false, 4, null), new t(-1, d(resources), viewContext2));
        Q q17 = new Q(new a(snippetSize, SerpDisplayType.AvitoBlack, false, 4, null), new t(-1, b(resources), viewContext));
        Q q18 = new Q(new a(snippetSize, SerpDisplayType.AvitoMall, false, 4, null), new t(-1, e(resources), viewContext));
        Q q19 = new Q(new a(snippetSize, SerpDisplayType.AvitoMallTall, false, 4, null), new t(-1, b(resources), viewContext));
        SnippetSize snippetSize3 = SnippetSize.LARGE;
        SerpDisplayType serpDisplayType3 = SerpDisplayType.ItemsCarouselWidgetGridXL;
        this.f125818c = P0.e(q12, q13, q14, q15, q16, q17, q18, q19, new Q(new a(snippetSize3, serpDisplayType3, false, 4, null), new t(c(), c(), viewContext2)), new Q(new a(snippetSize2, serpDisplayType3, false, 4, null), new t(c(), c(), viewContext2)), new Q(new a(snippetSize, serpDisplayType3, false, 4, null), new t(c(), c(), viewContext2)));
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.h
    @Y61.k
    public final t a(@Y61.k SnippetSize snippetSize, @Y61.k SerpDisplayType serpDisplayType, boolean z12) {
        HashMap map = this.f125818c;
        t tVar = (t) map.get(new a(snippetSize, serpDisplayType, z12));
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = (t) map.get(new a(snippetSize, serpDisplayType, false, 4, null));
        return tVar2 == null ? new t(-1, this.f125816a.getDimensionPixelSize(R.dimen.serp_card_image_height), AsyncViewportTracker.ViewContext.f430413c) : tVar2;
    }

    public final int b(Resources resources) {
        int i12 = Resources.getSystem().getDisplayMetrics().widthPixels;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding) * 2;
        return (int) ((((i12 - dimensionPixelSize) / this.f125817b) - (resources.getDimensionPixelSize(R.dimen.constructor_advert_horizontal_padding) * 2)) * 1.5f);
    }

    public final int c() {
        return this.f125816a.getDimensionPixelSize(R.dimen.carousel_grid_xl_image_width);
    }

    public final int d(Resources resources) {
        float f12;
        float f13;
        int i12 = Resources.getSystem().getDisplayMetrics().widthPixels;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding) * 2;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.list_serp_card_padding) * 2;
        int i13 = i12 - dimensionPixelSize;
        int i14 = this.f125817b;
        int i15 = (i13 / i14) - dimensionPixelSize2;
        int i16 = (i15 * 2) + dimensionPixelSize2;
        if (i14 == 2) {
            f12 = i16;
            f13 = 1.5f;
        } else {
            f12 = i15;
            f13 = 1.25f;
        }
        return (int) (f12 / f13);
    }

    public final int e(Resources resources) {
        int i12 = Resources.getSystem().getDisplayMetrics().widthPixels;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding) * 2;
        return ((i12 - dimensionPixelSize) / this.f125817b) - (resources.getDimensionPixelSize(R.dimen.list_serp_card_padding) * 2);
    }

    /* compiled from: ConstructorAdvertDimensionProviderImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/i$a;", "", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SnippetSize f125819a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SerpDisplayType f125820b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f125821c;

        public a(@Y61.k SnippetSize snippetSize, @Y61.k SerpDisplayType serpDisplayType, boolean z12) {
            this.f125819a = snippetSize;
            this.f125820b = serpDisplayType;
            this.f125821c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f125819a == aVar.f125819a && this.f125820b == aVar.f125820b && this.f125821c == aVar.f125821c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f125821c) + com.avito.android.actions_sheet.a.h(this.f125820b, this.f125819a.hashCode() * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DimensionMapKey(snippetSize=");
            sb2.append(this.f125819a);
            sb2.append(", serpDisplayType=");
            sb2.append(this.f125820b);
            sb2.append(", isExtendedGallery=");
            return androidx.appcompat.app.r.x(sb2, this.f125821c, ')');
        }

        public /* synthetic */ a(SnippetSize snippetSize, SerpDisplayType serpDisplayType, boolean z12, int i12, C42822w c42822w) {
            this(snippetSize, serpDisplayType, (i12 & 4) != 0 ? false : z12);
        }
    }
}
