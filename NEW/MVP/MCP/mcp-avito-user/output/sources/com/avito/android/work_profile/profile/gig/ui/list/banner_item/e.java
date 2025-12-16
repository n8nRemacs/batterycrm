package com.avito.android.work_profile.profile.gig.ui.list.banner_item;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GigBannerItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/gig/ui/list/banner_item/e;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f331186e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f331187b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f331188c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f331189d;

    public e(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.gig_banner_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f331187b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.gig_banner_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f331188c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.gig_banner_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f331189d = (Button) viewFindViewById3;
    }
}
