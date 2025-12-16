package com.avito.android.advert.item.teaser;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.teaser.TeaserInsightGeneral;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ReportTeaserInsightListViewImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001R\u001b\u0010\u0006\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/teaser/ReportTeaserInsightListViewImpl;", "Landroid/widget/LinearLayout;", "b", "Lkotlin/C;", "getResultInsightsColumn1", "()Landroid/widget/LinearLayout;", "resultInsightsColumn1", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ReportTeaserInsightListViewImpl extends LinearLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC42726C resultInsightsColumn1;

    @X41.j
    public ReportTeaserInsightListViewImpl(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final LinearLayout getResultInsightsColumn1() {
        return (LinearLayout) this.resultInsightsColumn1.getValue();
    }

    public final void a() {
        getResultInsightsColumn1().removeAllViews();
    }

    public final void b(@Y61.k List list, int i12, @Y61.k Y41.l lVar) {
        a();
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            TeaserInsightGeneral teaserInsightGeneral = (TeaserInsightGeneral) obj;
            Drawable drawable = (Drawable) lVar.invoke(teaserInsightGeneral);
            LinearLayout resultInsightsColumn1 = getResultInsightsColumn1();
            View viewInflate = LayoutInflater.from(getContext()).inflate(i12, (ViewGroup) resultInsightsColumn1, false);
            View viewFindViewById = viewInflate.findViewById(R.id.text);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            ((TextView) viewFindViewById).setText(teaserInsightGeneral.getText());
            TextView textView = (TextView) viewInflate.findViewById(R.id.description);
            if (textView != null) {
                I5.a(textView, teaserInsightGeneral.getDescription(), false);
            }
            View viewFindViewById2 = viewInflate.findViewById(R.id.icon);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ((ImageView) viewFindViewById2).setImageDrawable(drawable);
            resultInsightsColumn1.addView(viewInflate);
            i13 = i14;
        }
    }

    public ReportTeaserInsightListViewImpl(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.resultInsightsColumn1 = C42727D.c(new l(this));
        View.inflate(context, R.layout.advert_details_default_teaser_insights_container, this);
    }
}
