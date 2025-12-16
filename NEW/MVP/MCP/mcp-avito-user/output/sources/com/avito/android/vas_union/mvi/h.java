package com.avito.android.vas_union.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.vas_union.mvi.entity.VasUnionV2InternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import qM0.InterfaceC47321b;

/* compiled from: VasUnionV2OneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_union/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction;", "LqM0/b;", "<init>", "()V", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements t<VasUnionV2InternalAction, InterfaceC47321b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC47321b b(VasUnionV2InternalAction vasUnionV2InternalAction) {
        VasUnionV2InternalAction vasUnionV2InternalAction2 = vasUnionV2InternalAction;
        if (vasUnionV2InternalAction2 instanceof VasUnionV2InternalAction.Close) {
            return InterfaceC47321b.a.f429217a;
        }
        if (vasUnionV2InternalAction2 instanceof VasUnionV2InternalAction.FinishFlow) {
            return InterfaceC47321b.C12324b.f429218a;
        }
        if (!(vasUnionV2InternalAction2 instanceof VasUnionV2InternalAction.HandleDeeplink)) {
            return null;
        }
        VasUnionV2InternalAction.HandleDeeplink handleDeeplink = (VasUnionV2InternalAction.HandleDeeplink) vasUnionV2InternalAction2;
        return new InterfaceC47321b.c(handleDeeplink.f323223b, handleDeeplink.f323224c, handleDeeplink.f323225d, handleDeeplink.f323226e);
    }
}
