package com.avito.android.silent_update.permissions.mvi;

import Fw0.InterfaceC13847b;
import com.avito.android.arch.mvi.t;
import com.avito.android.silent_update.permissions.mvi.entity.PermissionsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PermissionsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/silent_update/permissions/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/silent_update/permissions/mvi/entity/PermissionsInternalAction;", "LFw0/b;", "<init>", "()V", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements t<PermissionsInternalAction, InterfaceC13847b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC13847b b(PermissionsInternalAction permissionsInternalAction) {
        PermissionsInternalAction permissionsInternalAction2 = permissionsInternalAction;
        if (permissionsInternalAction2.equals(PermissionsInternalAction.RequestDozeModePermission.f283733b)) {
            return InterfaceC13847b.a.f6034a;
        }
        if (permissionsInternalAction2.equals(PermissionsInternalAction.RequestInstallPermission.f283734b)) {
            return InterfaceC13847b.C0309b.f6035a;
        }
        if (permissionsInternalAction2.equals(PermissionsInternalAction.RequestStoragePermission.f283735b)) {
            return InterfaceC13847b.c.f6036a;
        }
        if (permissionsInternalAction2 instanceof PermissionsInternalAction.SendPermissionsResultAndFinish) {
            return new InterfaceC13847b.d(((PermissionsInternalAction.SendPermissionsResultAndFinish) permissionsInternalAction2).f283736b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
