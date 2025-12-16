package com.avito.android.re_agent_landing.landing.flows_dialog;

import android.view.View;
import com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.ReAgentProfileCreateLandingFlowsState;
import com.avito.android.re_agent_landing.landing.flows_dialog.mvi.entity.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f250648b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f250649c;

    public /* synthetic */ d(e eVar, int i12) {
        this.f250648b = i12;
        this.f250649c = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f250648b) {
            case 0:
                this.f250649c.f250660a.invoke(a.C7523a.f250690a);
                break;
            case 1:
                this.f250649c.f250660a.invoke(a.d.f250693a);
                break;
            case 2:
                this.f250649c.f250660a.invoke(new a.b(ReAgentProfileCreateLandingFlowsState.FlowType.f250686b));
                break;
            default:
                this.f250649c.f250660a.invoke(new a.b(ReAgentProfileCreateLandingFlowsState.FlowType.f250687c));
                break;
        }
    }
}
