package com.avito.android.shortcut_navigation_bar;

import Aw0.InterfaceC13094a;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import cU0.InterfaceC27108f;
import com.avito.android.C36135w2;
import com.avito.android.R;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC30265q;
import com.avito.android.shortcut_navigation_bar.C34999p;
import com.avito.android.util.D6;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import zw0.C50639c;
import zw0.InterfaceC50637a;

/* compiled from: GlobalShortcutNavigationBar.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/b;", "Lcom/avito/android/shortcut_navigation_bar/p;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.shortcut_navigation_bar.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34985b extends C34999p {
    public C34985b() {
        throw null;
    }

    public C34985b(View view, com.avito.android.util.text.a aVar, com.avito.android.onboarding_manager.a aVar2, FragmentManager fragmentManager, com.avito.android.onboarding_manager.e eVar, com.avito.android.onboarding_manager.f fVar, C34999p.b bVar, com.avito.android.lib.beduin_v2.feature.item.b bVar2, Screen screen, ScreenPerformanceTracker screenPerformanceTracker, InterfaceC13094a interfaceC13094a, boolean z12, Y41.a aVar3, View view2, com.avito.beduin.v2.engine.component.z zVar, InterfaceC27108f interfaceC27108f, C36135w2 c36135w2, int i12, C42822w c42822w) {
        super(view, (i12 & 2) != 0 ? null : aVar, (i12 & 4) != 0 ? null : aVar2, fragmentManager, (i12 & 16) != 0 ? null : eVar, fVar, (i12 & 64) != 0 ? null : bVar, bVar2, screen, screenPerformanceTracker, interfaceC13094a, (i12 & 2048) != 0 ? false : z12, (i12 & 4096) != 0 ? null : aVar3, (i12 & 8192) != 0 ? null : view2, zVar, interfaceC27108f, c36135w2);
    }

    @Override // com.avito.android.shortcut_navigation_bar.C34999p
    @Y61.k
    public final com.avito.konveyor.a f() throws BlueprintCollisionException {
        com.avito.android.shortcut_navigation_bar.adapter.category_node.g gVar = new com.avito.android.shortcut_navigation_bar.adapter.category_node.g(this);
        com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.s sVar = new com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.s(this);
        com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.d dVar = new com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.d(this, this.f283477d, this.f283481f, this.f283483g);
        View view = this.f283473b;
        InterfaceC50637a interfaceC50637aA = ((InterfaceC30265q) C29972i.a(C29972i.b(view.getContext()), InterfaceC30265q.class)).Gk().orElse(new C50639c()).a(view.getContext());
        com.avito.android.shortcut_navigation_bar.adapter.skeleton.a aVar = new com.avito.android.shortcut_navigation_bar.adapter.skeleton.a(new com.avito.android.shortcut_navigation_bar.adapter.skeleton.b());
        com.avito.android.shortcut_navigation_bar.adapter.skeleton.c cVar = new com.avito.android.shortcut_navigation_bar.adapter.skeleton.c(new com.avito.android.shortcut_navigation_bar.adapter.skeleton.b());
        com.avito.android.shortcut_navigation_bar.adapter.tag.d dVar2 = new com.avito.android.shortcut_navigation_bar.adapter.tag.d(new com.avito.android.shortcut_navigation_bar.adapter.tag.g(this));
        com.avito.android.shortcut_navigation_bar.adapter.tag.a aVar2 = new com.avito.android.shortcut_navigation_bar.adapter.tag.a(new com.avito.android.shortcut_navigation_bar.adapter.tag.g(this));
        com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.a aVar3 = new com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.a(dVar, interfaceC50637aA);
        com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.p pVar = new com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.p(sVar, interfaceC50637aA);
        com.avito.android.shortcut_navigation_bar.adapter.category_node.f fVar = new com.avito.android.shortcut_navigation_bar.adapter.category_node.f(gVar);
        com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.w wVar = new com.avito.android.shortcut_navigation_bar.adapter.horizontal_chips.w(sVar, interfaceC50637aA);
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(cVar);
        c10493a.b(dVar2);
        c10493a.b(aVar2);
        c10493a.b(aVar3);
        c10493a.b(fVar);
        c10493a.b(pVar);
        c10493a.b(wVar);
        return c10493a.a();
    }

    @Override // com.avito.android.shortcut_navigation_bar.C34999p
    public final void m() {
        D6.f(this.f283473b.findViewById(R.id.global_shortcuts_container), 0, e().intValue(), 0, 0, 13);
    }
}
