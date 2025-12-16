package com.avito.android.beduin.ui.screen.fragment.bottom_sheet_w_tabs;

import androidx.view.AbstractC22991Y;
import com.avito.android.beduin.ui.screen.model.BeduinTabLayout;
import com.avito.android.lib.design.tab_layout.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: TabLayouts.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/deprecated_design/tab/g", "Lcom/avito/android/lib/design/tab_layout/c$f;", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements c.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomSheetWithTabsScreenFragment f104234a;

    public c(BottomSheetWithTabsScreenFragment bottomSheetWithTabsScreenFragment) {
        this.f104234a = bottomSheetWithTabsScreenFragment;
    }

    @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
    public final void c(@Y61.k c.i iVar) {
        j jVarQ5 = this.f104234a.q5();
        int i12 = iVar.f180895d;
        AbstractC22991Y abstractC22991Y = jVarQ5.f104253K;
        com.avito.android.beduin.ui.screen.fragment.i iVar2 = (com.avito.android.beduin.ui.screen.fragment.i) abstractC22991Y.getValue();
        i iVarA = null;
        if (iVar2 != null) {
            i iVar3 = (i) iVar2;
            List list = iVar3.f104243d;
            if (list == null) {
                list = C42784z0.f406748b;
            }
            com.avito.android.beduin_shared.model.utils.j.b(jVarQ5.f104244R, "extraContent", list);
            BeduinTabLayout beduinTabLayout = iVar3.f104242c;
            iVarA = i.a(iVar3, null, new BeduinTabLayout(i12, beduinTabLayout.f104410b, beduinTabLayout.f104411c), 11);
        }
        abstractC22991Y.setValue(iVarA);
    }

    @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
    public final void b() {
    }

    @Override // com.avito.android.lib.design.tab_layout.c.InterfaceC5322c
    public final void a(@Y61.k c.i iVar) {
    }
}
