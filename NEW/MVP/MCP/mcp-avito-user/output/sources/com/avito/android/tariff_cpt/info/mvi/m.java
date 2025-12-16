package com.avito.android.tariff_cpt.info.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff_cpt.info.mvi.entity.CptInfoV2InternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import yC0.InterfaceC50100b;

/* compiled from: CptInfoV2OneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff_cpt/info/mvi/m;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/tariff_cpt/info/mvi/entity/CptInfoV2InternalAction;", "LyC0/b;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements t<CptInfoV2InternalAction, InterfaceC50100b> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC50100b b(CptInfoV2InternalAction cptInfoV2InternalAction) {
        CptInfoV2InternalAction cptInfoV2InternalAction2 = cptInfoV2InternalAction;
        if (cptInfoV2InternalAction2 instanceof CptInfoV2InternalAction.Content) {
            DeepLink uxFeedbackUri = ((CptInfoV2InternalAction.Content) cptInfoV2InternalAction2).f298241b.getUxFeedbackUri();
            if (uxFeedbackUri != null) {
                return new InterfaceC50100b.C12893b(uxFeedbackUri);
            }
            return null;
        }
        if (cptInfoV2InternalAction2 instanceof CptInfoV2InternalAction.Back) {
            return InterfaceC50100b.a.f442975a;
        }
        if (cptInfoV2InternalAction2 instanceof CptInfoV2InternalAction.Error.OnScreen) {
            return new InterfaceC50100b.c(((CptInfoV2InternalAction.Error.OnScreen) cptInfoV2InternalAction2).f298243b);
        }
        if (cptInfoV2InternalAction2 instanceof CptInfoV2InternalAction.HandleDeeplink) {
            return new InterfaceC50100b.C12893b(((CptInfoV2InternalAction.HandleDeeplink) cptInfoV2InternalAction2).f298245b);
        }
        return null;
    }
}
