package com.avito.android.advert_core.domoteka_report_teaser;

import Y61.k;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsDomotekaReportTeaserView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/domoteka_report_teaser/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f83458f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f83459b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinearLayout f83460c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FlexboxLayout f83461d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f83462e;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f83459b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.insights);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f83460c = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.buttons);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout");
        }
        this.f83461d = (FlexboxLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.hint);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f83462e = (TextView) viewFindViewById4;
    }
}
