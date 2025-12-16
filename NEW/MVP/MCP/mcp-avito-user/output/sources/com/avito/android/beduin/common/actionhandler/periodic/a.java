package com.avito.android.beduin.common.actionhandler.periodic;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.beduin.common.action.BeduinCancelPeriodicAction;
import com.avito.android.beduin_models.BeduinAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinCancelPeriodicActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/periodic/a;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinCancelPeriodicAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements InterfaceC15523b<BeduinCancelPeriodicAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f100347a;

    @Inject
    public a(@k h hVar) {
        this.f100347a = hVar;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        h hVar = this.f100347a;
        io.reactivex.rxjava3.disposables.d dVar = (io.reactivex.rxjava3.disposables.d) hVar.f100358d.remove(((BeduinCancelPeriodicAction) beduinAction).getId());
        if (dVar != null) {
            hVar.f100357c.get().a(dVar);
        }
    }
}
