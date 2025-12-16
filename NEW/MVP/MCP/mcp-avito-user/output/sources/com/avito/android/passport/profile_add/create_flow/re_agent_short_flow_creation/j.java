package com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ReAgentShortFlowCreationView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/j;", "Lcom/avito/android/passport/profile_add/create_flow/re_agent_short_flow_creation/h;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<S50.a, G0> f211572a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public View f211573b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public View f211574c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public View f211575d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Button f211576e;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public j(@Y61.k Y41.l<? super S50.a, G0> lVar) {
        this.f211572a = lVar;
    }

    @Override // com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.h
    public final void a(@Y61.l View view) {
        Button button;
        this.f211575d = view;
        if (view != null) {
            View viewFindViewById = view.findViewById(R.id.re_agent_short_flow_creation_action_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            button = (Button) viewFindViewById;
            button.setOnClickListener(new i(this, 2));
        } else {
            button = null;
        }
        this.f211576e = button;
    }

    @Override // com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.h
    public final void b(@Y61.l View view) {
        if (view != null) {
            FV.a aVar = FV.a.f4720a;
            View viewFindViewById = view.findViewById(R.id.re_agent_short_flow_creation_description_info);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            int iB2 = y6.b(4);
            aVar.getClass();
            FV.a.j((TextView) viewFindViewById, R.attr.textIconInfo, iB2);
        } else {
            view = null;
        }
        this.f211574c = view;
    }

    @Override // com.avito.android.passport.profile_add.create_flow.re_agent_short_flow_creation.h
    public final void c(@Y61.k S50.c cVar) {
        Button button = this.f211576e;
        if (button != null) {
            button.setLoading(cVar.f14819c);
        }
    }
}
