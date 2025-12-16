package com.avito.android.advert.item.autoteka_select.teaser;

import Xf.C16999a;
import Xf.C17000b;
import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.teaser.AutotekaSelectTeaserView;
import com.avito.android.advert.item.teaser.AutotekaSelectV2TeaserView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.teaser.TeaserIcon;
import com.avito.android.remote.model.teaser.TeaserInsightGeneral;
import com.avito.android.remote.model.teaser.TeaserInsightIcon;
import com.avito.android.remote.model.teaser.TeaserStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import x4.c;

/* compiled from: AdvertDetailsAutotekaSelectTeaserView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/autoteka_select/teaser/i;", "Lcom/avito/android/advert/item/teaser/c;", "Lcom/avito/android/advert/item/autoteka_select/teaser/j;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.android.advert.item.teaser.c implements j {

    /* renamed from: r, reason: collision with root package name */
    @k
    public final View f73172r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final AutotekaSelectTeaserView f73173s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final AutotekaSelectV2TeaserView f73174t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final Button f73175u;

    public i(@k View view, @l c.a aVar) {
        super(view, aVar);
        this.f73172r = view;
        View viewFindViewById = this.f80530d.findViewById(R.id.select_teaser);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.advert.item.teaser.AutotekaSelectTeaserView");
        }
        this.f73173s = (AutotekaSelectTeaserView) viewFindViewById;
        View viewFindViewById2 = this.f80530d.findViewById(R.id.select_v2_teaser);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.advert.item.teaser.AutotekaSelectV2TeaserView");
        }
        this.f73174t = (AutotekaSelectV2TeaserView) viewFindViewById2;
        View viewFindViewById3 = this.f80530d.findViewById(R.id.select_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f73175u = (Button) viewFindViewById3;
    }

    @Override // com.avito.android.advert.item.teaser.c, com.avito.android.advert.item.teaser.a
    public final void R1(@k String str) {
        super.R1(str);
        C17000b.a(this.f80531e, R.drawable.expected_ic_autoteka_logo_with_text);
    }

    @Override // com.avito.android.advert.item.teaser.c
    @l
    public final Drawable e0(@k TeaserInsightGeneral teaserInsightGeneral) {
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
