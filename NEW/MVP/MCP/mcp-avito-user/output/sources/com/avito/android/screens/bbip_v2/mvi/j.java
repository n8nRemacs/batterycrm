package com.avito.android.screens.bbip_v2.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.error.z;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.screens.bbip_v2.mvi.entity.BbipV2InternalAction;
import com.avito.android.util.ApiException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import vp0.InterfaceC49364a;
import vp0.InterfaceC49365b;

/* compiled from: BbipV2OneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/screens/bbip_v2/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/screens/bbip_v2/mvi/entity/BbipV2InternalAction;", "Lvp0/b;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements t<BbipV2InternalAction, InterfaceC49365b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC49365b b(BbipV2InternalAction bbipV2InternalAction) {
        PrintableText printableText;
        InterfaceC49365b dVar;
        BbipV2InternalAction bbipV2InternalAction2 = bbipV2InternalAction;
        if (bbipV2InternalAction2 instanceof BbipV2InternalAction.CloseScreen) {
            return InterfaceC49365b.a.f440980a;
        }
        InterfaceC49365b.c cVar = null;
        cVar = null;
        cVar = null;
        if (bbipV2InternalAction2 instanceof BbipV2InternalAction.HandleDeeplink) {
            DeepLink deepLink = ((BbipV2InternalAction.HandleDeeplink) bbipV2InternalAction2).f261548b;
            if (deepLink != null) {
                dVar = new InterfaceC49365b.C12793b(deepLink);
                return dVar;
            }
            return cVar;
        }
        if (!(bbipV2InternalAction2 instanceof BbipV2InternalAction.ContextContent)) {
            if (bbipV2InternalAction2 instanceof BbipV2InternalAction.ForecastError) {
                ApiException apiException = ((BbipV2InternalAction.ForecastError) bbipV2InternalAction2).f261544b;
                cVar = new InterfaceC49365b.c(apiException, z.m(apiException) instanceof ApiError.InternalError ? InterfaceC49364a.g.f440978a : InterfaceC49364a.f.f440977a);
            } else if (bbipV2InternalAction2 instanceof BbipV2InternalAction.ContextError) {
                ApiException apiException2 = ((BbipV2InternalAction.ContextError) bbipV2InternalAction2).f261539b;
                ApiError apiErrorM = z.m(apiException2);
                dVar = new InterfaceC49365b.c(apiException2, apiErrorM instanceof ApiError.InternalError ? null : apiErrorM instanceof ApiError.IncorrectData ? InterfaceC49364a.g.f440978a : InterfaceC49364a.f.f440977a);
            } else if ((bbipV2InternalAction2 instanceof BbipV2InternalAction.ShowInfo) && (printableText = ((BbipV2InternalAction.ShowInfo) bbipV2InternalAction2).f261549b) != null) {
                dVar = new InterfaceC49365b.d(printableText);
            }
            return cVar;
        }
        dVar = new InterfaceC49365b.C12793b(((BbipV2InternalAction.ContextContent) bbipV2InternalAction2).f261538b.getDeepLink());
        return dVar;
    }
}
