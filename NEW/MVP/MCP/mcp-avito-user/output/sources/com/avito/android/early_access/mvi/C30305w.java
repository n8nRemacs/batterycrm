package com.avito.android.early_access.mvi;

import Mx.InterfaceC14539b;
import com.avito.android.deep_linking.links.ToastMessageLink;
import com.avito.android.early_access.mvi.entity.EarlyAccessInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EarlyAccessOneTimeEventProducer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/early_access/mvi/w;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "LMx/b;", "<init>", "()V", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.early_access.mvi.w, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30305w implements com.avito.android.arch.mvi.t<EarlyAccessInternalAction, InterfaceC14539b> {
    @Inject
    public C30305w() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC14539b b(EarlyAccessInternalAction earlyAccessInternalAction) {
        InterfaceC14539b cVar;
        EarlyAccessInternalAction earlyAccessInternalAction2 = earlyAccessInternalAction;
        if (earlyAccessInternalAction2.equals(EarlyAccessInternalAction.CloseDialog.f145458b)) {
            return InterfaceC14539b.a.f11110a;
        }
        if (earlyAccessInternalAction2 instanceof EarlyAccessInternalAction.LoadingError) {
            cVar = new InterfaceC14539b.d(((EarlyAccessInternalAction.LoadingError) earlyAccessInternalAction2).f145460b.getMessage(), ToastMessageLink.ToastType.f133736e, ToastMessageLink.ToastBarPosition.f133725c);
        } else if (earlyAccessInternalAction2 instanceof EarlyAccessInternalAction.ShowError) {
            cVar = new InterfaceC14539b.d(((EarlyAccessInternalAction.ShowError) earlyAccessInternalAction2).f145468b, ToastMessageLink.ToastType.f133736e, ToastMessageLink.ToastBarPosition.f133725c);
        } else if (earlyAccessInternalAction2 instanceof EarlyAccessInternalAction.ShowBottomToast) {
            cVar = new InterfaceC14539b.d(null, ToastMessageLink.ToastType.f133735d, ToastMessageLink.ToastBarPosition.f133726d);
        } else if (earlyAccessInternalAction2 instanceof EarlyAccessInternalAction.ShowTopToast) {
            cVar = new InterfaceC14539b.d(((EarlyAccessInternalAction.ShowTopToast) earlyAccessInternalAction2).f145471b, ToastMessageLink.ToastType.f133735d, ToastMessageLink.ToastBarPosition.f133725c);
        } else {
            if (!(earlyAccessInternalAction2 instanceof EarlyAccessInternalAction.OpenScreen)) {
                if (earlyAccessInternalAction2 instanceof EarlyAccessInternalAction.PaymentCompleted) {
                    return InterfaceC14539b.C0710b.f11111a;
                }
                return null;
            }
            EarlyAccessInternalAction.OpenScreen openScreen = (EarlyAccessInternalAction.OpenScreen) earlyAccessInternalAction2;
            cVar = new InterfaceC14539b.c(openScreen.f145463b, openScreen.f145464c);
        }
        return cVar;
    }
}
