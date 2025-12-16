package com.avito.android.loyalty.ui.criteria.items.card;

import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.job.cv_info_actualization.ui.items.radio.h;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import com.avito.android.loyalty.ui.criteria.items.card.a;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import gX.C40632b;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.C43066x;

/* compiled from: CardItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/items/card/d;", "LTV0/d;", "Lcom/avito/android/loyalty/ui/criteria/items/card/f;", "Lcom/avito/android/loyalty/ui/criteria/items/card/a;", "<init>", "()V", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d implements TV0.d<f, a> {
    @Inject
    public d() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        G0 g02;
        C40632b c40632b;
        f fVar = (f) eVar;
        a aVar2 = (a) aVar;
        String str = aVar2.f183470c;
        TextView textView = fVar.f183494d;
        textView.setText(str);
        ConstraintLayout constraintLayout = fVar.f183493c;
        TextView textView2 = fVar.f183495e;
        ProgressBarRe23 progressBarRe23 = fVar.f183498h;
        Integer num = aVar2.f183474g;
        if (num != null) {
            int iIntValue = num.intValue();
            progressBarRe23.setVisibility(0);
            textView2.setVisibility(0);
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.g(constraintLayout);
            dVar.j(textView.getId(), 6, progressBarRe23.getId(), 7, (int) fVar.itemView.getResources().getDimension(R.dimen.criteria_card_title_start_margin));
            dVar.c(constraintLayout);
            progressBarRe23.setProgress(iIntValue / 100.0f);
            textView2.setText(num.toString());
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            progressBarRe23.setVisibility(4);
            textView2.setVisibility(4);
            androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
            dVar2.g(constraintLayout);
            dVar2.j(textView.getId(), 6, constraintLayout.getId(), 6, 0);
            dVar2.c(constraintLayout);
        }
        a.AbstractC5383a abstractC5383a = aVar2.f183473f;
        if (abstractC5383a != null) {
            if (abstractC5383a instanceof a.AbstractC5383a.b) {
                c40632b = new C40632b(R.color.red200, R.color.red600);
            } else if (abstractC5383a instanceof a.AbstractC5383a.c) {
                c40632b = new C40632b(R.color.orange200, R.color.orange600);
            } else {
                if (!(abstractC5383a instanceof a.AbstractC5383a.C5384a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c40632b = new C40632b(R.color.green200, R.color.green600);
            }
            progressBarRe23.setTrackColor(D6.q(fVar.itemView, c40632b.f396483a));
            progressBarRe23.setProgressColor(D6.q(fVar.itemView, c40632b.f396484b));
        }
        fVar.f183497g.setRotation(aVar2.f183477j ? -180.0f : 0.0f);
        boolean z12 = aVar2.f183477j;
        TextView textView3 = fVar.f183496f;
        D6.G(textView3, z12);
        j.c(textView3, aVar2.f183472e, null);
        fVar.itemView.setOnClickListener(new h(8, aVar2, fVar));
        String str2 = aVar2.f183475h;
        D6.G(fVar.f183499i, true ^ (str2 == null || C43066x.K(str2)));
        if (str2 == null) {
            str2 = "";
        }
        fVar.f183500j.setText(str2);
    }
}
