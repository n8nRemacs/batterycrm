package com.avito.android.vas_autoprolong.screens.autoprolong.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_autoprolong.screens.autoprolong.mvi.entity.AutoprolongInternalAction;
import jL0.InterfaceC42281b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AutoprolongOneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/vas_autoprolong/screens/autoprolong/mvi/entity/AutoprolongInternalAction;", "LjL0/b;", "<init>", "()V", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements t<AutoprolongInternalAction, InterfaceC42281b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC42281b b(AutoprolongInternalAction autoprolongInternalAction) {
        InterfaceC42281b c11560b;
        AutoprolongInternalAction autoprolongInternalAction2 = autoprolongInternalAction;
        if (autoprolongInternalAction2 instanceof AutoprolongInternalAction.CloseScreen) {
            return InterfaceC42281b.a.f405560a;
        }
        if (!(autoprolongInternalAction2 instanceof AutoprolongInternalAction.PostError)) {
            if (!(autoprolongInternalAction2 instanceof AutoprolongInternalAction.HandleDeeplink)) {
                if (autoprolongInternalAction2 instanceof AutoprolongInternalAction.PostContent) {
                    c11560b = new InterfaceC42281b.C11560b(((AutoprolongInternalAction.PostContent) autoprolongInternalAction2).f319541b);
                }
                return null;
            }
            DeepLink deepLink = ((AutoprolongInternalAction.HandleDeeplink) autoprolongInternalAction2).f319537b;
            if (deepLink != null) {
                c11560b = new InterfaceC42281b.C11560b(deepLink);
            }
            return null;
        }
        c11560b = new InterfaceC42281b.c(((AutoprolongInternalAction.PostError) autoprolongInternalAction2).f319542b);
        return c11560b;
    }
}
