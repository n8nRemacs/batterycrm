package com.avito.android.silent_update.permissions.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.silent_update.permissions.mvi.entity.PermissionsInternalAction;
import com.avito.android.silent_update.permissions.mvi.entity.RequestState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PermissionStorageReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/silent_update/permissions/mvi/a;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/silent_update/permissions/mvi/entity/PermissionsInternalAction;", "LFw0/c;", "<init>", "()V", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements u<PermissionsInternalAction, Fw0.c> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Fw0.c a(PermissionsInternalAction permissionsInternalAction, Fw0.c cVar) {
        PermissionsInternalAction permissionsInternalAction2 = permissionsInternalAction;
        if (permissionsInternalAction2.equals(PermissionsInternalAction.RequestStoragePermission.f283735b)) {
            return new Fw0.c(RequestState.f283738c);
        }
        if (permissionsInternalAction2.equals(PermissionsInternalAction.RequestDozeModePermission.f283733b)) {
            return new Fw0.c(RequestState.f283739d);
        }
        if (permissionsInternalAction2.equals(PermissionsInternalAction.RequestInstallPermission.f283734b)) {
            return new Fw0.c(RequestState.f283740e);
        }
        if (permissionsInternalAction2 instanceof PermissionsInternalAction.SendPermissionsResultAndFinish) {
            return new Fw0.c(RequestState.f283741f);
        }
        throw new NoWhenBranchMatchedException();
    }
}
