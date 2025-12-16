package com.avito.android.promo_snippet;

import X41.j;
import Y41.l;
import Y61.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.lib.util.v;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PromoSnippet.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/promo_snippet/PromoSnippet;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Lkotlin/G0;", "onClickListener", "setOnClickListener", "(LY41/l;)V", "Lcom/avito/android/promo_snippet/PromoSnippetState;", VoiceInfo.STATE, "setState", "(Lcom/avito/android/promo_snippet/PromoSnippetState;)V", "_avito_gig_promo-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PromoSnippet extends FrameLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f231694l = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ConstraintLayout f231695b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f231696c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f231697d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f231698e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageView f231699f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinearLayout f231700g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f231701h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f231702i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Button f231703j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public l<? super DeepLink, G0> f231704k;

    /* compiled from: PromoSnippet.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<DeepLink, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f231705l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(DeepLink deepLink) {
            return G0.f406611a;
        }
    }

    @j
    public PromoSnippet(@k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setOnClickListener(@k l<? super DeepLink, G0> onClickListener) {
        this.f231704k = onClickListener;
    }

    public final void setState(@k PromoSnippetState state) {
        String str = state.f231720b;
        TextView textView = this.f231696c;
        I5.a(textView, str, false);
        TextView textView2 = this.f231697d;
        String str2 = state.f231721c;
        I5.a(textView2, str2, false);
        TextView textView3 = this.f231698e;
        I5.a(textView3, state.f231722d, false);
        FooterInfo footerInfo = state.f231724f;
        String str3 = footerInfo != null ? footerInfo.f231693c : null;
        TextView textView4 = this.f231701h;
        I5.a(textView4, str3, false);
        String str4 = footerInfo != null ? footerInfo.f231692b : null;
        TextView textView5 = this.f231702i;
        I5.a(textView5, str4, false);
        ActionButton actionButton = state.f231726h;
        String str5 = actionButton != null ? actionButton.f231690b : null;
        Button button = this.f231703j;
        com.avito.android.lib.design.button.b.a(button, str5, false);
        button.setOnClickListener(new e(state, this));
        e eVar = new e(this, state);
        ConstraintLayout constraintLayout = this.f231695b;
        constraintLayout.setOnClickListener(eVar);
        constraintLayout.setBackground(state.f231728j ? D6.u(this, R.drawable.gig_promo_snippet_public_gradient_bg) : D6.u(this, R.drawable.gig_promo_snippet_public_white_bg));
        if (!state.f231730l) {
            v.a(constraintLayout, y6.b(16));
        }
        if (str2 == null) {
            D6.c(this.f231700g, null, Integer.valueOf(y6.b(11)), null, null, 13);
            textView.setMaxLines(2);
        } else {
            D6.c(this.f231700g, null, Integer.valueOf(y6.b(31)), null, null, 13);
            textView.setMaxLines(1);
        }
        boolean z12 = state.f231729k;
        boolean z13 = state.f231727i;
        int i12 = R.attr.red600;
        ImageView imageView = this.f231699f;
        if (z12) {
            textView3.setTextColor(C35835l0.d(R.attr.black, getContext()));
            imageView.setImageDrawable(C35835l0.h(R.attr.ic_lock20, getContext()));
            textView.setTextColor(C35835l0.d(R.attr.gray54, getContext()));
            textView5.setTextColor(C35835l0.d(R.attr.gray54, getContext()));
            textView4.setTextColor(C35835l0.d(R.attr.gray54, getContext()));
            textView3.setBackground(D6.u(this, R.drawable.gig_promo_snippet_public_lock_badge_bg));
            Context context = getContext();
            if (!z13) {
                i12 = R.attr.gray54;
            }
            textView2.setTextColor(C35835l0.d(i12, context));
        } else {
            textView3.setTextColor(C35835l0.d(R.attr.white, getContext()));
            imageView.setImageDrawable(C35835l0.h(R.attr.ic_arrowRight20, getContext()));
            textView.setTextColor(C35835l0.d(R.attr.black, getContext()));
            textView5.setTextColor(C35835l0.d(R.attr.black, getContext()));
            textView4.setTextColor(C35835l0.d(R.attr.black, getContext()));
            textView3.setBackground(D6.u(this, R.drawable.gig_promo_snippet_public_badge_bg));
            Context context2 = getContext();
            if (!z13) {
                i12 = R.attr.black;
            }
            textView2.setTextColor(C35835l0.d(i12, context2));
        }
        List<Double> list = state.f231723e;
        if (list != null) {
            int i13 = 0;
            for (Object obj : list) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                double dDoubleValue = ((Number) obj).doubleValue();
                boolean z14 = i13 == 0;
                ProgressBarRe23 progressBarRe23 = new ProgressBarRe23(getContext(), null, R.attr.progressBarDefaultSmall, 0, 10, null);
                progressBarRe23.setProgress((float) dDoubleValue);
                progressBarRe23.setProgressColor(D6.q(progressBarRe23, R.color.gray92));
                progressBarRe23.setTrackColor(D6.q(progressBarRe23, R.color.gray20));
                progressBarRe23.setLayoutParams(new LinearLayout.LayoutParams(0, y6.b(3), 1.0f));
                if (!z14) {
                    D6.c(progressBarRe23, Integer.valueOf(y6.b(4)), null, null, null, 14);
                }
                this.f231700g.addView(progressBarRe23);
                i13 = i14;
            }
        }
    }

    public /* synthetic */ PromoSnippet(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    @j
    public PromoSnippet(@k Context context, @Y61.l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.f231704k = a.f231705l;
        View.inflate(context, R.layout.promo_snippet_layout, this);
        this.f231695b = (ConstraintLayout) findViewById(R.id.root);
        this.f231696c = (TextView) findViewById(R.id.title);
        this.f231697d = (TextView) findViewById(R.id.subtitle);
        this.f231698e = (TextView) findViewById(R.id.price);
        this.f231699f = (ImageView) findViewById(R.id.icon);
        this.f231700g = (LinearLayout) findViewById(R.id.progress_container);
        this.f231701h = (TextView) findViewById(R.id.deadline);
        this.f231702i = (TextView) findViewById(R.id.progressText);
        this.f231703j = (Button) findViewById(R.id.button);
    }
}
