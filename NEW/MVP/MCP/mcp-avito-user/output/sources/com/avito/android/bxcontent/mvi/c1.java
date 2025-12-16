package com.avito.android.bxcontent.mvi;

import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.bxcontent.mvi.entity.C29126a;
import com.avito.android.bxcontent.mvi.entity.q;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.ToolbarConfig;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import ur.InterfaceC49101b;

/* compiled from: BxContentViewStateBuilder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/c1;", "Lcom/avito/android/bxcontent/mvi/b1;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c1 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49101b f111762a;

    @Inject
    public c1(@Y61.k InterfaceC49101b interfaceC49101b) {
        this.f111762a = interfaceC49101b;
    }

    @Override // com.avito.android.bxcontent.mvi.b1
    @Y61.k
    public final com.avito.android.bxcontent.mvi.entity.l a(@Y61.k com.avito.android.bxcontent.mvi.entity.l lVar) {
        q.c bVar;
        q.i iVar;
        q.g bVar2;
        q.e eVar;
        q.f fVar;
        boolean zC2 = C35800g5.c(new C35792f5(lVar.f112304G));
        SearchParams searchParams = lVar.f112345l;
        q.h hVar = new q.h(searchParams, lVar.f112304G, lVar.f112349n, lVar.f112299B, lVar.f112341j, lVar.f112306I, lVar.f112327c, lVar.f112340i0, searchParams.isLongRequest(), lVar.f112346l0);
        C29126a c29126a = lVar.f112324a0;
        boolean z12 = c29126a.f112056a != null;
        List list = lVar.f112335g;
        PresentationType presentationType = lVar.f112306I;
        if (z12) {
            bVar = new q.c.a(list, c29126a.f112057b);
        } else {
            if (presentationType.isMapWithoutSerp()) {
                list = C42784z0.f406748b;
            }
            bVar = new q.c.b(list, !presentationType.isMapWithoutSerp() ? lVar.f().f112428e : C42784z0.f406748b, presentationType.isMap() ? lVar.f112309L : 5);
        }
        com.avito.android.bxcontent.mvi.entity.z zVar = presentationType.isMain() ? lVar.f112322Y : null;
        com.avito.android.bxcontent.mvi.entity.x xVar = presentationType.isMain() ? lVar.f112323Z : null;
        com.avito.android.bxcontent.mvi.entity.y yVar = presentationType.isMain() ? lVar.f112336g0 : null;
        com.avito.android.bxcontent.mvi.entity.w wVar = lVar.f112319V;
        q.a aVar = new q.a(!wVar.f112438b);
        if (presentationType.isSerp()) {
            iVar = new q.i(lVar.f112299B ? lVar.f112359w : null);
        } else {
            iVar = null;
        }
        ToolbarConfig toolbarConfig = lVar.f112301D;
        if (toolbarConfig != null) {
            bVar2 = new q.g.a(toolbarConfig, lVar.f112302E, wVar.f112438b);
        } else {
            NavigationBarStyle navigationBarStyle = lVar.f112303F;
            bVar2 = navigationBarStyle != null ? new q.g.b(navigationBarStyle, wVar.f112438b) : null;
        }
        q.d dVar = new q.d(new NavigationState(false, new NavigationState.NavbarBusiness360.Show(zC2 && !wVar.f112438b, !zC2 || wVar.f112438b), 1, null));
        if (presentationType.isMain() && this.f111762a.d()) {
            List list2 = lVar.f112325b;
            if (list2 == null) {
                list2 = C42784z0.f406748b;
            }
            eVar = new q.e(list2, lVar.f112307J.getWithShortcutUpperBlock());
        } else {
            eVar = null;
        }
        InlineAction.Predefined.State state = presentationType.isMain() ? null : lVar.f112360x;
        if (presentationType.isFullMap()) {
            fVar = new q.f(lVar.f112344k0, lVar.f112342j0 != null);
        } else {
            fVar = null;
        }
        return com.avito.android.bxcontent.mvi.entity.l.a(lVar, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, new com.avito.android.bxcontent.mvi.entity.q(hVar, bVar, zVar, xVar, yVar, lVar.f112334f0, aVar, wVar, lVar.f112320W, iVar, bVar2, dVar, eVar, state, lVar.f112328c0, fVar, presentationType.isFullMap() ? lVar.f112332e0 : null, lVar.f112350n0), null, -1, Integer.MAX_VALUE, 1);
    }
}
