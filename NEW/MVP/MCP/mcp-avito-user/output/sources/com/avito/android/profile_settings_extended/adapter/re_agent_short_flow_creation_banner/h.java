package com.avito.android.profile_settings_extended.adapter.re_agent_short_flow_creation_banner;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ReAgentShortFlowCreationBannerItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/re_agent_short_flow_creation_banner/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile_settings_extended/adapter/re_agent_short_flow_creation_banner/g;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f229796f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f229797b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f229798c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f229799d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f229800e;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.ext_profile_re_agent_short_flow_creation_banner_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229797b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.ext_profile_re_agent_short_flow_creation_banner_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f229798c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.ext_profile_re_agent_short_flow_creation_banner_button_start);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f229799d = (Button) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.ext_profile_re_agent_short_flow_creation_banner_button_info);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f229800e = (Button) viewFindViewById4;
        AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(view.getContext(), R.attr.gradientLinearMixedHorizontalVioletBlue, 0, 4, null);
        c5275a.f179264a = y6.b(20);
        view.setBackground(new AvitoLinearGradientDrawable(c5275a.a()));
    }

    @Override // com.avito.android.profile_settings_extended.adapter.re_agent_short_flow_creation_banner.g
    public final void Fz(@k Y41.a<G0> aVar) {
        this.f229799d.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(19, aVar));
    }

    @Override // com.avito.android.profile_settings_extended.adapter.re_agent_short_flow_creation_banner.g
    public final void LB(@k Y41.a<G0> aVar) {
        this.f229800e.setOnClickListener(new com.avito.android.profile_phones.phones_list.phone_item.g(20, aVar));
    }

    @Override // com.avito.android.profile_settings_extended.adapter.re_agent_short_flow_creation_banner.g
    public final void b(@k String str) {
        I5.a(this.f229797b, str, false);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.re_agent_short_flow_creation_banner.g
    public final void cl(@k String str) {
        this.f229800e.setText(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f229799d.setOnClickListener(null);
        this.f229800e.setOnClickListener(null);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.re_agent_short_flow_creation_banner.g
    public final void n(@k String str) {
        I5.a(this.f229798c, str, false);
    }

    @Override // com.avito.android.profile_settings_extended.adapter.re_agent_short_flow_creation_banner.g
    public final void uI(@k String str) {
        this.f229799d.setText(str);
    }
}
