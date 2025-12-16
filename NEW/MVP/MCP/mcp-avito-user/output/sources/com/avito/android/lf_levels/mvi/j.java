package com.avito.android.lf_levels.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lf_levels.mvi.entity.LfLevelsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import wR.b;

/* compiled from: LfLevelsOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lf_levels/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/lf_levels/mvi/entity/LfLevelsInternalAction;", "LwR/b;", "<init>", "()V", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements t<LfLevelsInternalAction, wR.b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final wR.b b(LfLevelsInternalAction lfLevelsInternalAction) {
        DeepLink deepLink;
        LfLevelsInternalAction lfLevelsInternalAction2 = lfLevelsInternalAction;
        if (!(lfLevelsInternalAction2 instanceof LfLevelsInternalAction.HandleDeeplink) || (deepLink = ((LfLevelsInternalAction.HandleDeeplink) lfLevelsInternalAction2).f175381b) == null) {
            return null;
        }
        return new b.a(deepLink);
    }
}
