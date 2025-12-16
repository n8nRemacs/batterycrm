package com.avito.android.beduin.common.actionhandler.countdown_text;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.beduin.common.action.BeduinCancelCountdownTextAction;
import com.avito.android.beduin_models.BeduinAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinCancelCountdownTextActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/countdown_text/c;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinCancelCountdownTextAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements InterfaceC15523b<BeduinCancelCountdownTextAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f100209a;

    @Inject
    public c(@k h hVar) {
        this.f100209a = hVar;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        h hVar = this.f100209a;
        io.reactivex.rxjava3.disposables.d dVarRemove = hVar.f100219e.remove(((BeduinCancelCountdownTextAction) beduinAction).getId());
        if (dVarRemove != null) {
            hVar.f100218d.get().a(dVarRemove);
        }
    }
}
