package com.avito.android.re_agent_landing.landing.items.top_block;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.animation.AnimationView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: TopBlockView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/items/top_block/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/re_agent_landing/landing/items/top_block/h;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f250803g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f250804b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AnimationView f250805c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f250806d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f250807e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Button f250808f;

    public i(@k View view) {
        super(view);
        this.f250804b = view.getContext();
        this.f250805c = (AnimationView) view.findViewById(R.id.re_agent_profile_create_landing_top_animation);
        this.f250806d = (TextView) view.findViewById(R.id.re_agent_profile_create_landing_top_title);
        this.f250807e = (TextView) view.findViewById(R.id.re_agent_profile_create_landing_top_description);
        this.f250808f = (Button) view.findViewById(R.id.re_agent_profile_create_landing_top_button);
    }

    @Override // com.avito.android.re_agent_landing.landing.items.top_block.h
    public final void Y(@k Y41.a<G0> aVar) {
        this.f250808f.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(23, aVar));
    }

    @Override // com.avito.android.re_agent_landing.landing.items.top_block.h
    public final void c1(@l String str) {
        com.avito.android.lib.design.button.b.a(this.f250808f, str, false);
    }

    @Override // com.avito.android.re_agent_landing.landing.items.top_block.h
    public final void fS(@k String str, @l String str2) {
        this.f250805c.setAnimationData(new AnimationView.a.e((!com.avito.android.lib.util.darkTheme.c.a(this.f250804b) || str2 == null || C43066x.K(str2)) ? str : str2, null, null, 6, null));
    }

    @Override // com.avito.android.re_agent_landing.landing.items.top_block.h
    public final void h(@k String str) {
        I5.a(this.f250807e, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f250808f.setOnClickListener(null);
    }

    @Override // com.avito.android.re_agent_landing.landing.items.top_block.h
    public final void setTitle(@k String str) {
        I5.a(this.f250806d, str, false);
    }
}
