package com.avito.android.advert.item.domoteka.conveyor;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.avito.android.R;
import com.avito.android.advert.item.domoteka.conveyor.n;
import com.avito.android.remote.model.teaser.TeaserInsightGeneral;
import com.avito.android.util.C35835l0;
import com.avito.android.util.V0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: AdvertDetailsDomotekaTeaserView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class o extends H implements Y41.l<TeaserInsightGeneral, Drawable> {
    @Override // Y41.l
    public final Drawable invoke(TeaserInsightGeneral teaserInsightGeneral) {
        Drawable drawableH;
        n nVar = (n) this.receiver;
        nVar.getClass();
        int i12 = n.a.f75282a[teaserInsightGeneral.getStatus().ordinal()];
        View view = nVar.f75274b;
        if (i12 == 1) {
            drawableH = C35835l0.h(R.attr.ic_checkThin20, view.getContext());
            if (drawableH == null) {
                return null;
            }
            V0.d(drawableH, C35835l0.d(R.attr.black, view.getContext()));
        } else if (i12 == 2) {
            drawableH = androidx.core.content.d.getDrawable(view.getContext(), R.drawable.ic_warning_expected);
            if (drawableH == null) {
                return null;
            }
            V0.d(drawableH, C35835l0.d(R.attr.orange700, view.getContext()));
        } else {
            if (i12 != 3 || (drawableH = C35835l0.h(R.attr.ic_attention16, view.getContext())) == null) {
                return null;
            }
            V0.d(drawableH, C35835l0.d(R.attr.gray28, view.getContext()));
        }
        return drawableH;
    }
}
