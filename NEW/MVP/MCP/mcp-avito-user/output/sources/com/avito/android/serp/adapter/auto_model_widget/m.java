package com.avito.android.serp.adapter.auto_model_widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.auto_model.AutoModelButton;
import com.avito.android.remote.model.auto_model.AutoModelRating;
import com.avito.android.remote.model.auto_model.Description;
import com.avito.android.seller_promotions.o;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AutoModelWidgetView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/auto_model_widget/m;", "Lcom/avito/android/serp/adapter/auto_model_widget/l;", "Lcom/avito/android/serp/c;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m extends com.avito.android.serp.c implements l {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f268974m = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f268975b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f268976c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f268977d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f268978e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final CardView f268979f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f268980g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f268981h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f268982i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f268983j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Button f268984k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Button f268985l;

    public m(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.auto_model_image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f268975b = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.text_model_name);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f268976c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.text_model_price_range);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f268977d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.auto_model_score_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f268978e = (LinearLayout) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.auto_model_score);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.cardview.widget.CardView");
        }
        this.f268979f = (CardView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.text_score);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f268980g = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.review_count);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f268981h = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.auto_model_details_container);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f268982i = (LinearLayout) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.auto_model_buttons_container);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f268983j = (LinearLayout) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.button_about_model);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f268984k = (Button) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.button_search_model);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f268985l = (Button) viewFindViewById11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.serp.adapter.auto_model_widget.l
    public final void AD(@Y61.l AutoModelRating autoModelRating, @Y61.k Y41.a<G0> aVar) {
        LinearLayout linearLayout = this.f268978e;
        if (autoModelRating == null || autoModelRating.getScore() == 0.0f) {
            D6.w(linearLayout);
            return;
        }
        double score = autoModelRating.getScore();
        Q q12 = (1.0d > score || score > 2.84d) ? (2.85d > score || score > 3.64d) ? (3.65d > score || score > 4.34d) ? (4.35d > score || score > 5.0d) ? new Q(Integer.valueOf(R.color.score_0), Integer.valueOf(R.color.score_caption_0)) : new Q(Integer.valueOf(R.color.score_4), Integer.valueOf(R.color.score_caption_4)) : new Q(Integer.valueOf(R.color.score_3), Integer.valueOf(R.color.score_caption_3)) : new Q(Integer.valueOf(R.color.score_2), Integer.valueOf(R.color.score_caption_2)) : new Q(Integer.valueOf(R.color.score_1), Integer.valueOf(R.color.score_caption_1));
        int iIntValue = ((Number) q12.f406619b).intValue();
        int iIntValue2 = ((Number) q12.f406620c).intValue();
        this.f268979f.setCardBackgroundColor(androidx.core.content.d.getColor(this.itemView.getContext(), iIntValue));
        int color = androidx.core.content.d.getColor(this.itemView.getContext(), iIntValue2);
        TextView textView = this.f268981h;
        textView.setTextColor(color);
        I5.a(this.f268980g, autoModelRating.getScoreString(), false);
        textView.setText(autoModelRating.getLabel());
        linearLayout.setOnClickListener(new o(8, aVar));
        D6.H(linearLayout);
    }

    @Override // com.avito.android.serp.adapter.auto_model_widget.l
    public final void M50(@Y61.l List<Description> list) {
        List<Description> list2 = list;
        LinearLayout linearLayout = this.f268982i;
        if (list2 == null || list2.isEmpty()) {
            D6.w(linearLayout);
            return;
        }
        linearLayout.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.itemView.getContext());
        for (Description description : list) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.auto_model_widget_details_row, (ViewGroup) linearLayout, false);
            LinearLayout linearLayout2 = viewInflate instanceof LinearLayout ? (LinearLayout) viewInflate : null;
            TextView textView = linearLayout2 != null ? (TextView) linearLayout2.findViewById(R.id.key) : null;
            TextView textView2 = linearLayout2 != null ? (TextView) linearLayout2.findViewById(R.id.value) : null;
            if (textView != null) {
                I5.a(textView, description.getTitle() + ": ", false);
            }
            if (textView2 != null) {
                I5.a(textView2, description.getDescription(), false);
            }
            linearLayout.addView(linearLayout2);
        }
    }

    @Override // com.avito.android.serp.adapter.auto_model_widget.l
    public final void N2(@Y61.l String str) {
        I5.a(this.f268977d, str, false);
    }

    @Override // com.avito.android.serp.adapter.auto_model_widget.l
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f268975b.setOnClickListener(new o(5, aVar));
        this.f268976c.setOnClickListener(new o(6, aVar));
        this.f268977d.setOnClickListener(new o(7, aVar));
    }

    @Override // com.avito.android.serp.adapter.auto_model_widget.l
    public final void ej(@Y61.l List<AutoModelButton> list, @Y61.l Y41.a<G0> aVar, @Y61.l Y41.a<G0> aVar2) {
        LinearLayout linearLayout = this.f268983j;
        if (list == null) {
            D6.w(linearLayout);
            return;
        }
        String title = ((AutoModelButton) C42745f0.E(list)).getTitle();
        Button button = this.f268984k;
        button.setText(title);
        button.setOnClickListener(new o(3, aVar));
        String title2 = list.get(1).getTitle();
        Button button2 = this.f268985l;
        button2.setText(title2);
        button2.setOnClickListener(new o(4, aVar2));
        D6.H(linearLayout);
    }

    @Override // com.avito.android.serp.adapter.auto_model_widget.l
    public final void l(@Y61.l Image image) {
        C35949t5.c(this.f268975b, com.avito.android.image_loader.b.b(image), null, null, null, 14);
        D6.H(this.f268975b);
    }

    @Override // com.avito.android.serp.adapter.auto_model_widget.l
    public final void setTitle(@Y61.k String str) {
        this.f268976c.setText(str);
    }
}
