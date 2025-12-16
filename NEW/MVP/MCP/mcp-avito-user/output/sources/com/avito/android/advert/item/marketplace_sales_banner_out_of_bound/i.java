package com.avito.android.advert.item.marketplace_sales_banner_out_of_bound;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.Guideline;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.sales_banner_image_out_of_bounds.WidthLayout;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: MarketplaceSalesBannerOutOfBoundsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/marketplace_sales_banner_out_of_bound/i;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f77585j = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewGroup f77586b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Banner f77587c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f77588d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f77589e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Guideline f77590f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SimpleDraweeView f77591g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Button f77592h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Guideline f77593i;

    /* compiled from: MarketplaceSalesBannerOutOfBoundsView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/advert/item/marketplace_sales_banner_out_of_bound/i$a;", "", "<init>", "()V", "", "SUBTITLE_LINES_LIMIT", "I", "TITLE_LINES_LIMIT", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public i(@k ViewGroup viewGroup) {
        super(viewGroup);
        this.f77586b = viewGroup;
        View viewFindViewById = viewGroup.findViewById(R.id.sales_banner_out_of_bound);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.banner.Banner");
        }
        this.f77587c = (Banner) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.banner_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f77588d = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.banner_subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f77589e = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.text_end_guideline);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Guideline");
        }
        this.f77590f = (Guideline) viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.sales_banner_image);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f77591g = (SimpleDraweeView) viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.banner_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f77592h = (Button) viewFindViewById6;
        View viewFindViewById7 = viewGroup.findViewById(R.id.button_end_guideline);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Guideline");
        }
        this.f77593i = (Guideline) viewFindViewById7;
    }

    public static void B80(Guideline guideline, WidthLayout widthLayout) {
        if (widthLayout.getFraction() != null) {
            guideline.setGuidelinePercent(widthLayout.getFraction().floatValue());
            guideline.setGuidelineBegin(-1);
            guideline.setGuidelineEnd(-1);
        } else if (widthLayout.getPixelsFromStart() != null) {
            guideline.setGuidelinePercent(-1.0f);
            guideline.setGuidelineBegin(y6.b(widthLayout.getPixelsFromStart().intValue()));
            guideline.setGuidelineEnd(-1);
        } else if (widthLayout.getPixelsFromEnd() != null) {
            guideline.setGuidelinePercent(-1.0f);
            guideline.setGuidelineBegin(-1);
            guideline.setGuidelineEnd(y6.b(widthLayout.getPixelsFromEnd().intValue()));
        }
    }
}
