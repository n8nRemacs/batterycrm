package com.avito.android.advert.item.autoteka.teaser;

import Xf.C16999a;
import Xf.C17000b;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.teaser.TeaserIcon;
import com.avito.android.remote.model.teaser.TeaserInsightGeneral;
import com.avito.android.remote.model.teaser.TeaserInsightIcon;
import com.avito.android.remote.model.teaser.TeaserStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import x4.c;

/* compiled from: AdvertDetailsAutotekaTeaserView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser/n;", "Lcom/avito/android/advert/item/teaser/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n extends com.avito.android.advert.item.teaser.c {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final View f73047r;

    public n(@Y61.k View view, @Y61.l c.a aVar) {
        super(view, aVar);
        this.f73047r = view;
    }

    @Override // com.avito.android.advert.item.teaser.c, com.avito.android.advert.item.teaser.a
    public final void R1(@Y61.k String str) {
        super.R1(str);
        C17000b.a(this.f80531e, R.drawable.expected_ic_autoteka_logo_with_text);
    }

    @Override // com.avito.android.advert.item.teaser.c
    @Y61.l
    public final Drawable e0(@Y61.k TeaserInsightGeneral teaserInsightGeneral) {
        Integer numB;
        if (teaserInsightGeneral instanceof TeaserInsightIcon) {
            C16999a c16999a = C16999a.f18998a;
            TeaserIcon icon = ((TeaserInsightIcon) teaserInsightGeneral).getIcon();
            c16999a.getClass();
            numB = C16999a.a(icon);
            if (numB == null) {
                numB = C16999a.b(teaserInsightGeneral.getStatus());
            }
        } else {
            C16999a c16999a2 = C16999a.f18998a;
            TeaserStatus status = teaserInsightGeneral.getStatus();
            c16999a2.getClass();
            numB = C16999a.b(status);
        }
        if (numB == null) {
            return null;
        }
        return androidx.core.content.d.getDrawable(this.f80528b.getContext(), numB.intValue());
    }
}
