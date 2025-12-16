package com.avito.android.bottom_navigation;

import BI0.a;
import android.widget.PopupWindow;
import com.avito.android.messenger.channels.mvi.view.a0;
import com.avito.android.messenger.conversation.mvi.send.Onboarding;
import com.avito.android.ui.TooltipWithCloseCause;
import com.avito.android.user_adverts.root_screen.adverts_host.C35565c;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.bottom_navigation.j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C28888j implements PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f107026b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f107027c;

    public /* synthetic */ C28888j(TooltipWithCloseCause tooltipWithCloseCause, C28890l c28890l) {
        this.f107026b = 0;
        this.f107027c = c28890l;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        Object obj = this.f107027c;
        switch (this.f107026b) {
            case 0:
                ((C28890l) obj).f107034a = null;
                break;
            case 1:
                Y41.a<G0> aVar = ((com.avito.beduin.v2.avito.component.tooltip.state.a) obj).f335431e;
                if (aVar != null) {
                    aVar.invoke();
                    break;
                }
                break;
            case 2:
                a0 a0Var = (a0) obj;
                a0Var.f188728c.setVisibility(8);
                a0Var.f188729d.D4(Onboarding.f194327f);
                a0Var.f188731f = null;
                break;
            case 3:
                int i12 = com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.e.f221018f;
                ((com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.e) obj).c();
                break;
            default:
                C35565c c35565c = ((com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.h) obj).f312822o;
                if (c35565c != null) {
                    c35565c.a(new a.l(false));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ C28888j(Object obj, int i12) {
        this.f107026b = i12;
        this.f107027c = obj;
    }
}
