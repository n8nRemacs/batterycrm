package com.avito.android.autoteka.items.preview;

import Tf.C15358a;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.remote.autoteka.model.AutotekaMiniReport;
import com.avito.android.remote.autoteka.model.AutotekaReportFeatures;
import com.avito.android.remote.autoteka.model.Insight;
import com.avito.android.remote.autoteka.model.InsightState;
import com.avito.android.remote.autoteka.model.InsightStatus;
import com.avito.android.remote.autoteka.model.MiniReportInsight;
import com.avito.android.remote.autoteka.model.MiniReportLoading;
import com.avito.android.remote.autoteka.model.MiniReportNotFound;
import com.avito.android.remote.autoteka.model.MiniReportReady;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PreviewView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/items/preview/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/autoteka/items/preview/h;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f96909e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CardView f96910b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CardView f96911c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final CardView f96912d;

    /* compiled from: PreviewView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96913a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f96914b;

        static {
            int[] iArr = new int[InsightStatus.values().length];
            try {
                iArr[InsightStatus.f253296OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InsightStatus.NEUTRAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InsightStatus.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InsightStatus.CAUTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f96913a = iArr;
            int[] iArr2 = new int[InsightState.values().length];
            try {
                iArr2[InsightState.COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            f96914b = iArr2;
        }
    }

    public i(@k View view) {
        super(view);
        this.f96910b = (CardView) this.itemView.findViewById(R.id.mini_report_card);
        this.f96911c = (CardView) this.itemView.findViewById(R.id.mini_report_loading_card);
        this.f96912d = (CardView) this.itemView.findViewById(R.id.mini_report_not_found_card);
    }

    @Override // com.avito.android.autoteka.items.preview.h
    public final void M9(@k Y41.a<G0> aVar) {
        this.itemView.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(8, aVar));
    }

    @Override // com.avito.android.autoteka.items.preview.h
    @SuppressLint({"ClickableViewAccessibility"})
    public final void eW(@k PreviewItem previewItem) throws Resources.NotFoundException {
        MiniReportNotFound notFound;
        MiniReportLoading loading;
        MiniReportReady ready;
        List<Insight> items;
        ((TextView) this.itemView.findViewById(R.id.car_info_title)).setText(previewItem.f96890c);
        I5.a((TextView) this.itemView.findViewById(R.id.car_info_subtitle), previewItem.f96891d, false);
        AutotekaReportFeatures autotekaReportFeatures = previewItem.f96898k;
        if (autotekaReportFeatures != null) {
            I5.a((TextView) this.itemView.findViewById(R.id.preview_insights_item_title), autotekaReportFeatures.getTitle(), false);
        }
        LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.insights_container);
        linearLayout.removeAllViews();
        if (autotekaReportFeatures != null && (items = autotekaReportFeatures.getItems()) != null) {
            for (Insight insight : items) {
                C15358a c15358a = new C15358a(linearLayout.getContext());
                c15358a.f15782e.setText(insight.getTitle());
                I5.a(c15358a.f15783f, insight.getSubtitle(), false);
                com.avito.android.lib.design.badge.h.a(c15358a.f15781d, insight.getBadge());
                linearLayout.addView(c15358a);
            }
        }
        CardView cardView = this.f96910b;
        D6.w(cardView);
        CardView cardView2 = this.f96911c;
        D6.w(cardView2);
        CardView cardView3 = this.f96912d;
        D6.w(cardView3);
        AutotekaMiniReport autotekaMiniReport = previewItem.f96899l;
        if (autotekaMiniReport == null || (ready = autotekaMiniReport.getReady()) == null) {
            if (autotekaMiniReport != null && (loading = autotekaMiniReport.getLoading()) != null) {
                D6.H(cardView2);
                I5.a((TextView) this.itemView.findViewById(R.id.mini_report_loading_title), loading.getTitle(), false);
                I5.a((TextView) this.itemView.findViewById(R.id.mini_report_loading_description), loading.getSubtitle(), false);
                ImageView imageView = (ImageView) this.itemView.findViewById(R.id.mini_report_spinner);
                imageView.startAnimation(AnimationUtils.loadAnimation(imageView.getContext(), R.anim.autoteka_spinner_rotation));
                return;
            }
            if (autotekaMiniReport == null || (notFound = autotekaMiniReport.getNotFound()) == null) {
                return;
            }
            D6.H(cardView3);
            AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(cardView3.getRootView().getContext(), R.attr.gradientLinearMixedHorizontalRedOrange, 0, 4, null);
            c5275a.f179264a = y6.b(20);
            cardView3.setBackground(new AvitoLinearGradientDrawable(c5275a.a()));
            I5.a((TextView) this.itemView.findViewById(R.id.mini_report_not_found_title), notFound.getTitle(), false);
            return;
        }
        D6.H(cardView);
        I5.a((TextView) this.itemView.findViewById(R.id.mini_report_title), ready.getTitle(), false);
        I5.a((TextView) this.itemView.findViewById(R.id.mini_report_description), ready.getSubtitle(), false);
        LinearLayout linearLayout2 = (LinearLayout) this.itemView.findViewById(R.id.mini_report_insights_container);
        linearLayout2.removeAllViews();
        for (MiniReportInsight miniReportInsight : ready.c()) {
            C15358a c15358a2 = new C15358a(linearLayout2.getContext());
            InsightState state = miniReportInsight.getState();
            if ((state == null ? -1 : a.f96914b[state.ordinal()]) == 1) {
                InsightStatus status = miniReportInsight.getStatus();
                int i12 = status != null ? a.f96913a[status.ordinal()] : -1;
                if (i12 == 1) {
                    c15358a2.a(androidx.core.content.d.getColor(c15358a2.getContext(), R.color.common_green_800), false);
                } else if (i12 == 2) {
                    c15358a2.a(androidx.core.content.d.getColor(c15358a2.getContext(), R.color.common_gray_20), true);
                } else if (i12 == 3) {
                    c15358a2.a(androidx.core.content.d.getColor(c15358a2.getContext(), R.color.common_orange_700), false);
                } else if (i12 != 4) {
                    c15358a2.a(androidx.core.content.d.getColor(c15358a2.getContext(), R.color.common_gray_20), true);
                } else {
                    c15358a2.a(androidx.core.content.d.getColor(c15358a2.getContext(), R.color.common_red_600), false);
                }
            } else {
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(c15358a2.getContext(), R.anim.autoteka_spinner_rotation);
                D6.w(c15358a2.f15780c);
                ImageView imageView2 = c15358a2.f15779b;
                imageView2.setImageResource(R.drawable.autoteka_mini_report_mini_spinner);
                if (animationLoadAnimation != null) {
                    imageView2.startAnimation(animationLoadAnimation);
                }
            }
            c15358a2.f15782e.setText(miniReportInsight.getTitle());
            I5.a(c15358a2.f15783f, miniReportInsight.getSubtitle(), false);
            linearLayout2.addView(c15358a2);
        }
    }

    @Override // com.avito.android.autoteka.items.preview.h
    public final void x60(@l Image image, @k Y41.a<G0> aVar) {
        G0 g02;
        CardView cardView = (CardView) this.itemView.findViewById(R.id.car_image_default_container);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) this.itemView.findViewById(R.id.car_image);
        if (image != null) {
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(image), null, null, null, 14);
            D6.H(simpleDraweeView);
            D6.w(cardView);
            simpleDraweeView.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(9, aVar));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            D6.w(simpleDraweeView);
            D6.H(cardView);
            simpleDraweeView.setOnClickListener(null);
        }
    }
}
