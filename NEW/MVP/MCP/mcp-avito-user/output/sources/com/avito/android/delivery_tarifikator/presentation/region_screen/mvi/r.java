package com.avito.android.delivery_tarifikator.presentation.region_screen.mvi;

import Xv.InterfaceC17051b;
import com.avito.android.R;
import com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.entity.TarifikatorRegionInternalAction;
import com.avito.android.printable_text.PrintableText;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TarifikatorRegionOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/r;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "LXv/b;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r implements com.avito.android.arch.mvi.t<TarifikatorRegionInternalAction, InterfaceC17051b> {
    @Inject
    public r() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC17051b b(TarifikatorRegionInternalAction tarifikatorRegionInternalAction) {
        TarifikatorRegionInternalAction tarifikatorRegionInternalAction2 = tarifikatorRegionInternalAction;
        if (tarifikatorRegionInternalAction2.equals(TarifikatorRegionInternalAction.CloseScreen.f135810b)) {
            return InterfaceC17051b.a.f19144a;
        }
        if (tarifikatorRegionInternalAction2 instanceof TarifikatorRegionInternalAction.TermsSavingSuccess) {
            PrintableText printableTextA = ((TarifikatorRegionInternalAction.TermsSavingSuccess) tarifikatorRegionInternalAction2).f135819b;
            if (printableTextA == null) {
                printableTextA = com.avito.android.printable_text.a.a(R.string.save_settings_success_toast_text);
            }
            return InterfaceC17051b.c.a(printableTextA);
        }
        if (!(tarifikatorRegionInternalAction2 instanceof TarifikatorRegionInternalAction.TermsSavingFailed)) {
            return null;
        }
        PrintableText printableTextA2 = ((TarifikatorRegionInternalAction.TermsSavingFailed) tarifikatorRegionInternalAction2).f135817c;
        if (printableTextA2 == null) {
            printableTextA2 = com.avito.android.printable_text.a.a(R.string.save_settings_failed_toast_text);
        }
        return InterfaceC17051b.C1355b.a(printableTextA2);
    }
}
