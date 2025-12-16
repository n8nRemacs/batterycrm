package com.avito.android.crm_candidates.view.list_items.applications_list.enrich_profile_banner;

import PK0.n;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.banner.a;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JobCrmBannerView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/view/list_items/applications_list/enrich_profile_banner/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends com.avito.konveyor.adapter.b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f130063g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Banner f130064b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f130065c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f130066d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f130067e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TU.a f130068f;

    public g(@k View view) {
        super(view);
        Banner banner = (Banner) view;
        this.f130064b = banner;
        View viewFindViewById = view.findViewById(R.id.subtitle);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f130065c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f130066d = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f130067e = (SimpleDraweeView) viewFindViewById3;
        this.f130068f = new TU.a(null, null, R.layout.job_crm_candidates_enrich_profile_banner_content, 3, null);
        com.avito.android.lib.design.text_view.d dVar = com.avito.android.lib.design.text_view.d.f180938a;
        Context context = banner.getContext();
        int iJ2 = C35835l0.j(R.attr.textH20, banner.getContext());
        dVar.getClass();
        n nVarA = com.avito.android.lib.design.text_view.d.a(iJ2, context);
        a.C5258a c5258a = com.avito.android.lib.design.banner.a.f178448x;
        Context context2 = banner.getContext();
        int iJ3 = C35835l0.j(R.attr.bannerDefault, banner.getContext());
        c5258a.getClass();
        banner.setStyle(com.avito.android.lib.design.banner.a.a(a.C5258a.b(iJ3, context2), nVarA, null, null, 0, 0, 0, 0, false, 0.0f, false, false, 8388606));
    }
}
