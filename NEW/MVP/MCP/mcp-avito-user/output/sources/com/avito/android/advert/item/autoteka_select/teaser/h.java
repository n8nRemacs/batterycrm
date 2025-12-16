package com.avito.android.advert.item.autoteka_select.teaser;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.autotekateaser.AutotekaReportLink;
import com.avito.android.remote.model.teaser.ReportLink;
import com.avito.android.util.D6;
import kotlin.Metadata;
import x4.c;

/* compiled from: AdvertDetailsAutotekaSelectTeaserView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/autoteka_select/teaser/h;", "Lx4/c;", "Lcom/avito/android/advert/item/autoteka_select/teaser/j;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends x4.c implements j {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f73169f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final c.a f73170g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i f73171h;

    public h(@k View view, @l c.a aVar) {
        super(view, aVar, new i(view, aVar));
        this.f73169f = view;
        this.f73170g = aVar;
        this.f73171h = new i(view, aVar);
    }

    public final void C80(@l ReportLink reportLink) {
        if (reportLink == null) {
            return;
        }
        TextView textView = (TextView) this.f73169f.findViewById(R.id.teaser_example);
        textView.setText(reportLink.getTitle());
        textView.setOnClickListener(new com.avito.android.advert.closed.b(8, this, (AutotekaReportLink) reportLink));
        D6.H(textView);
        FV.a.f4720a.getClass();
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }
}
