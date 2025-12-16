package com.avito.android.delivery_tarifikator.presentation.main_screen.mvi;

import Tv.InterfaceC15413d;
import com.avito.android.R;
import com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction;
import com.avito.android.printable_text.PrintableText;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TarifikatorMainOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/w;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "LTv/d;", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class w implements com.avito.android.arch.mvi.t<TarifikatorMainInternalAction, InterfaceC15413d> {
    @Inject
    public w() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC15413d b(TarifikatorMainInternalAction tarifikatorMainInternalAction) {
        TarifikatorMainInternalAction tarifikatorMainInternalAction2 = tarifikatorMainInternalAction;
        if (tarifikatorMainInternalAction2.equals(TarifikatorMainInternalAction.CloseScreen.f135640b)) {
            return InterfaceC15413d.a.f16007a;
        }
        if (tarifikatorMainInternalAction2 instanceof TarifikatorMainInternalAction.LoadingFailed) {
            InterfaceC15413d.c cVarA = InterfaceC15413d.c.a(com.avito.android.printable_text.a.a(R.string.loading_error_toast_text));
            if (((TarifikatorMainInternalAction.LoadingFailed) tarifikatorMainInternalAction2).f135642c) {
                return cVarA;
            }
        } else {
            if (tarifikatorMainInternalAction2 instanceof TarifikatorMainInternalAction.TermsSavingFailed) {
                PrintableText printableTextA = ((TarifikatorMainInternalAction.TermsSavingFailed) tarifikatorMainInternalAction2).f135658c;
                if (printableTextA == null) {
                    printableTextA = com.avito.android.printable_text.a.a(R.string.save_settings_failed_toast_text);
                }
                return InterfaceC15413d.c.a(printableTextA);
            }
            if (tarifikatorMainInternalAction2 instanceof TarifikatorMainInternalAction.TermsSavingSuccess) {
                PrintableText printableTextA2 = ((TarifikatorMainInternalAction.TermsSavingSuccess) tarifikatorMainInternalAction2).f135660b;
                if (printableTextA2 == null) {
                    printableTextA2 = com.avito.android.printable_text.a.a(R.string.save_settings_success_toast_text);
                }
                return InterfaceC15413d.C1089d.a(printableTextA2);
            }
            if (tarifikatorMainInternalAction2 instanceof TarifikatorMainInternalAction.TariffDeleteFailure) {
                PrintableText printableTextA3 = ((TarifikatorMainInternalAction.TariffDeleteFailure) tarifikatorMainInternalAction2).f135653c;
                if (printableTextA3 == null) {
                    printableTextA3 = com.avito.android.printable_text.a.a(R.string.custom_tariff_delete_failed_toast_text);
                }
                return InterfaceC15413d.c.a(printableTextA3);
            }
            if (tarifikatorMainInternalAction2 instanceof TarifikatorMainInternalAction.TariffDeleteSuccess) {
                PrintableText printableTextA4 = ((TarifikatorMainInternalAction.TariffDeleteSuccess) tarifikatorMainInternalAction2).f135655b;
                if (printableTextA4 == null) {
                    printableTextA4 = com.avito.android.printable_text.a.a(R.string.custom_tariff_delete_success_toast_text);
                }
                return InterfaceC15413d.C1089d.a(printableTextA4);
            }
            if (tarifikatorMainInternalAction2.equals(TarifikatorMainInternalAction.TariffEditorSuccess.f135656b)) {
                return InterfaceC15413d.C1089d.a(com.avito.android.printable_text.a.a(R.string.custom_tariff_edit_success_toast));
            }
            if (tarifikatorMainInternalAction2 instanceof TarifikatorMainInternalAction.OpenRegionSettings) {
                return InterfaceC15413d.b.a(((TarifikatorMainInternalAction.OpenRegionSettings) tarifikatorMainInternalAction2).f135645b);
            }
        }
        return null;
    }
}
