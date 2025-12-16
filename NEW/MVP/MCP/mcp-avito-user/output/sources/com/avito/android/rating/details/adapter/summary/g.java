package com.avito.android.rating.details.adapter.summary;

import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.rating.details.adapter.summary.SummaryItem;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: SummaryView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/adapter/summary/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating/details/adapter/summary/f;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f246560b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinearLayout f246561c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f246562d;

    /* compiled from: SummaryView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SummaryItem.SummaryScore.SummaryScoreState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SummaryItem.SummaryScore.SummaryScoreState summaryScoreState = SummaryItem.SummaryScore.SummaryScoreState.f246550b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public g(@k View view) {
        super(view);
        this.f246560b = view;
        View viewFindViewById = view.findViewById(R.id.summary_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f246561c = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.summary_details_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f246562d = (Button) viewFindViewById2;
    }

    @Override // com.avito.android.rating.details.adapter.summary.f
    public final void E(@k RatingItemsMarginHorizontal ratingItemsMarginHorizontal) {
        int dimension = (int) this.itemView.getResources().getDimension(ratingItemsMarginHorizontal.H0());
        D6.c(this.itemView, Integer.valueOf(dimension), null, Integer.valueOf(dimension), null, 10);
    }

    @Override // com.avito.android.rating.details.adapter.summary.f
    public final void Sn(@k com.avito.android.publish.slots.delivery_addresses.f fVar) {
        this.f246562d.setOnClickListener(fVar);
    }

    @Override // com.avito.android.rating.details.adapter.summary.f
    public final void fC(@k String str, @k SummaryItem.SummaryScore.SummaryScoreState summaryScoreState) {
        int i12;
        View viewInflate = LayoutInflater.from(this.f246560b.getContext()).inflate(R.layout.summary_score_item, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R.id.summary_score_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.summary_score_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById2;
        textView.setText(str);
        int iOrdinal = summaryScoreState.ordinal();
        if (iOrdinal == 0) {
            i12 = R.drawable.ic_summary_score_positive_small;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = R.drawable.ic_summary_score_negative_small;
        }
        imageView.setImageDrawable(imageView.getContext().getDrawable(i12));
        this.f246561c.addView(viewInflate);
    }

    @Override // com.avito.android.rating.details.adapter.summary.f
    public final void i60(@k String str) {
        this.f246562d.setText(str);
    }

    @Override // com.avito.android.rating.details.adapter.summary.f
    public final void jK() {
        this.f246561c.removeAllViews();
    }
}
