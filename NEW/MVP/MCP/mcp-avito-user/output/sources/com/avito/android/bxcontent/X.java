package com.avito.android.bxcontent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bY.InterfaceC25585b;
import com.avito.android.C31100l2;
import com.avito.android.R;
import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.floating_container.FloatingContainer;
import com.avito.android.lib.design.floating_container.a;
import com.avito.android.map.mvi.entity.a;
import com.avito.android.map.mvi.entity.b;
import com.avito.android.map.view.C31642f;
import com.avito.android.remote.model.PinFloatingButton;
import com.avito.android.remote.model.PinFloatingContainer;
import com.avito.android.remote.model.ToolbarConfig;
import com.avito.android.remote.model.serp_floating_container.SerpFloatingContainerState;
import com.avito.android.shortcut_navigation_bar.PinnedItem;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: BxContentFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/map/mvi/entity/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/map/mvi/entity/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class X extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.map.mvi.entity.a, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BxContentFragment f109439l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(BxContentFragment bxContentFragment) {
        super(1);
        this.f109439l = bxContentFragment;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(com.avito.android.map.mvi.entity.a aVar) {
        final C31642f c31642f;
        final PinFloatingButton secondaryButton;
        final PinFloatingButton primaryButton;
        C31642f c31642f2;
        C31642f c31642f3;
        a.C5436a c5436a;
        b.i iVar;
        com.avito.android.serp.adapter.search_bar.M m12;
        C31100l2 c31100l2;
        BxContentFragment bxContentFragment = this.f109439l;
        com.avito.android.map.mvi.entity.b bVar = aVar.f185150D;
        BxContentFragment.d1 d1Var = bxContentFragment.s5;
        com.avito.android.map.mvi.entity.b bVar2 = d1Var.f109179a;
        BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
        BxContentFragment bxContentFragment2 = BxContentFragment.this;
        boolean zF2 = kotlin.jvm.internal.L.f(bVar2 != null ? bVar2.f185207b : null, bVar.f185207b);
        b.j jVar = bVar.f185206a;
        if (!zF2 && (iVar = bVar.f185207b) != null) {
            ToolbarConfig toolbarConfig = iVar.f185248a;
            if (toolbarConfig != null) {
                bxContentFragment2.f6();
                com.avito.android.bxcontent.toolbar_helper.a aVar2 = bxContentFragment2.f108915I3;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                aVar2.G(toolbarConfig, null, false);
            }
            if (jVar.f185251b.getShouldHandleUserMovedMapSinceLastLocationUpdate() && (m12 = bxContentFragment2.f109003f5) != null && (c31100l2 = m12.f271603d) != null) {
                c31100l2.f174866f.setUserMovedMapSinceLastLocationUpdate(iVar.f185249b);
            }
        }
        PinnedItem pinnedItem = (bVar2 == null || (c5436a = bVar2.f185210e.f185212a) == null) ? null : c5436a.f185186k;
        b.a aVar3 = bVar.f185210e;
        a.C5436a c5436a2 = aVar3.f185212a;
        if (!kotlin.jvm.internal.L.f(pinnedItem, c5436a2.f185186k)) {
            bxContentFragment2.K5().w50(c5436a2.f185186k);
        }
        b.d dVar = bVar2 != null ? bVar2.f185208c : null;
        b.d dVar2 = bVar.f185208c;
        if (!kotlin.jvm.internal.L.f(dVar, dVar2) && (c31642f3 = bxContentFragment2.f109011h5) != null) {
            c31642f3.g(bVar2 != null ? bVar2.f185208c : null, dVar2, jVar);
        }
        b.g gVar = bVar2 != null ? bVar2.f185209d : null;
        b.g gVar2 = bVar.f185209d;
        if (!kotlin.jvm.internal.L.f(gVar, gVar2) && gVar2 != null && (c31642f2 = bxContentFragment2.f109011h5) != null) {
            c31642f2.h(bVar2 != null ? bVar2.f185209d : null, gVar2);
        }
        if (!kotlin.jvm.internal.L.f(bVar2 != null ? bVar2.f185210e : null, aVar3) && (c31642f = bxContentFragment2.f109011h5) != null) {
            b.a aVar4 = bVar2 != null ? bVar2.f185210e : null;
            c31642f.f185506f.st(aVar4, aVar3);
            a.C5436a c5436a3 = aVar4 != null ? aVar4.f185212a : null;
            c31642f.f185496a.f185360b = c5436a2.f185183h;
            SerpFloatingContainerState serpFloatingContainerState = c5436a3 != null ? c5436a3.f185187l : null;
            FloatingContainer floatingContainer = c31642f.f185500c;
            PinFloatingContainer pinFloatingContainer = c5436a2.f185188m;
            if (pinFloatingContainer == null || !aVar3.f185215d) {
                D6.w(floatingContainer);
            } else {
                SerpFloatingContainerState serpFloatingContainerState2 = c5436a2.f185187l;
                if (!kotlin.jvm.internal.L.f(serpFloatingContainerState, serpFloatingContainerState2)) {
                    if (serpFloatingContainerState2.isVisible()) {
                        C31642f.b(c31642f, floatingContainer, 300L, 2);
                    } else {
                        C31642f.c(floatingContainer, 300L);
                    }
                    floatingContainer.setAlpha(serpFloatingContainerState2.getAlpha());
                }
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(c31642f.f185508g);
                View viewInflate = c31642f.f185499b0;
                if (viewInflate == null) {
                    viewInflate = layoutInflaterFrom.inflate(R.layout.search_map_footer, (ViewGroup) floatingContainer, false);
                }
                c31642f.f185499b0 = viewInflate;
                View viewFindViewById = viewInflate.findViewById(R.id.search_map_floating_primary_button);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                }
                Button button = (Button) viewFindViewById;
                View viewFindViewById2 = viewInflate.findViewById(R.id.search_map_floating_secondary_button);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                }
                Button button2 = (Button) viewFindViewById2;
                boolean z12 = (pinFloatingContainer.getPrimaryButton() == null && pinFloatingContainer.getSecondaryButton() == null) ? false : true;
                boolean z13 = (pinFloatingContainer.getSecondaryButton() == null || pinFloatingContainer.getPrimaryButton() == null) ? false : true;
                D6.G(button, z12);
                D6.G(button2, z13);
                if (z12 && ((primaryButton = pinFloatingContainer.getPrimaryButton()) != null || (primaryButton = pinFloatingContainer.getSecondaryButton()) != null)) {
                    button.setAppearanceFromAttr(com.avito.android.lib.util.f.d(primaryButton.getStyle()));
                    button.setText(primaryButton.getTitle());
                    final int i12 = 0;
                    button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.map.view.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i12) {
                                case 0:
                                    c31642f.f185504e.invoke(new InterfaceC25585b.C25595k(primaryButton.getDeepLink()));
                                    break;
                                default:
                                    c31642f.f185504e.invoke(new InterfaceC25585b.C25595k(primaryButton.getDeepLink()));
                                    break;
                            }
                        }
                    });
                }
                if (z13 && (secondaryButton = pinFloatingContainer.getSecondaryButton()) != null) {
                    button2.setAppearanceFromAttr(com.avito.android.lib.util.f.d(secondaryButton.getStyle()));
                    button2.setText(secondaryButton.getTitle());
                    final int i13 = 1;
                    button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.map.view.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i13) {
                                case 0:
                                    c31642f.f185504e.invoke(new InterfaceC25585b.C25595k(secondaryButton.getDeepLink()));
                                    break;
                                default:
                                    c31642f.f185504e.invoke(new InterfaceC25585b.C25595k(secondaryButton.getDeepLink()));
                                    break;
                            }
                        }
                    });
                }
                floatingContainer.setState(new com.avito.android.lib.design.floating_container.a(new a.AbstractC5270a.C5271a(viewInflate)));
            }
        }
        C31642f c31642f4 = bxContentFragment2.f109011h5;
        if (c31642f4 != null) {
            b.C5439b c5439b = bVar2 != null ? bVar2.f185211f : null;
            InterfaceC31062w interfaceC31062w = bxContentFragment2.f108996e1;
            c31642f4.f(c5439b, bVar.f185211f, jVar, (interfaceC31062w != null ? interfaceC31062w : null).getF172426t());
        }
        d1Var.f109179a = bVar;
        return kotlin.G0.f406611a;
    }
}
