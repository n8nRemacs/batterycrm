package com.avito.android.delivery_tarifikator.presentation.region_screen.mvi;

import Wv.InterfaceC15801a;
import Xv.C17052c;
import com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.entity.TarifikatorRegionInternalAction;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TarifikatorRegionReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/t;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "LXv/c;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class t implements com.avito.android.arch.mvi.u<TarifikatorRegionInternalAction, C17052c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15801a f135876b;

    @Inject
    public t(@Y61.k InterfaceC15801a interfaceC15801a) {
        this.f135876b = interfaceC15801a;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C17052c a(TarifikatorRegionInternalAction tarifikatorRegionInternalAction, C17052c c17052c) {
        TarifikatorRegionInternalAction tarifikatorRegionInternalAction2 = tarifikatorRegionInternalAction;
        C17052c c17052c2 = c17052c;
        if (tarifikatorRegionInternalAction2 instanceof TarifikatorRegionInternalAction.InitScreen) {
            TarifikatorRegionInternalAction.InitScreen initScreen = (TarifikatorRegionInternalAction.InitScreen) tarifikatorRegionInternalAction2;
            return C17052c.a(c17052c2, new com.avito.android.lib.design.nav_bar.a(null, null, false, initScreen.f135812b, null, null, null, 119, null), null, initScreen.f135813c, false, false, false, 58);
        }
        if (tarifikatorRegionInternalAction2 instanceof TarifikatorRegionInternalAction.ShowExitAlertDialog) {
            return C17052c.a(c17052c2, null, null, null, false, true, false, 47);
        }
        if (tarifikatorRegionInternalAction2.equals(TarifikatorRegionInternalAction.ClearAlertDialog.f135809b)) {
            return C17052c.a(c17052c2, null, null, null, false, false, false, 47);
        }
        if (tarifikatorRegionInternalAction2 instanceof TarifikatorRegionInternalAction.FooterChanged) {
            return C17052c.a(c17052c2, null, null, ((TarifikatorRegionInternalAction.FooterChanged) tarifikatorRegionInternalAction2).f135811b, false, false, false, 59);
        }
        boolean z12 = tarifikatorRegionInternalAction2 instanceof TarifikatorRegionInternalAction.SettingsChanged;
        InterfaceC15801a interfaceC15801a = this.f135876b;
        if (z12) {
            Ov.n nVar = ((TarifikatorRegionInternalAction.SettingsChanged) tarifikatorRegionInternalAction2).f135814b;
            return C17052c.a(c17052c2, null, interfaceC15801a.b(nVar), null, nVar.f12703e, false, false, 53);
        }
        boolean zEquals = tarifikatorRegionInternalAction2.equals(TarifikatorRegionInternalAction.TermsSavingStarted.f135818b);
        List<com.avito.conveyor_item.a> list = c17052c2.f19150c;
        if (zEquals) {
            return C17052c.a(c17052c2, null, interfaceC15801a.a(list, true), null, false, false, true, 29);
        }
        return tarifikatorRegionInternalAction2 instanceof TarifikatorRegionInternalAction.TermsSavingFailed ? true : tarifikatorRegionInternalAction2 instanceof TarifikatorRegionInternalAction.TermsSavingSuccess ? C17052c.a(c17052c2, null, interfaceC15801a.a(list, false), null, false, false, false, 29) : c17052c2;
    }
}
