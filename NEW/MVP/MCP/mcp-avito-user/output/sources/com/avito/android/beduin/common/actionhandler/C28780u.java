package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinCancelRequestAction;
import com.avito.android.beduin_models.BeduinAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinCancelRequestActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/u;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinCancelRequestAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.beduin.common.actionhandler.u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28780u implements InterfaceC15523b<BeduinCancelRequestAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.a f100473a;

    @Inject
    public C28780u(@Y61.k com.avito.android.beduin.common.a aVar) {
        this.f100473a = aVar;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        com.avito.android.beduin.common.a aVar = this.f100473a;
        io.reactivex.rxjava3.disposables.d dVar = (io.reactivex.rxjava3.disposables.d) aVar.f99960j.remove(((BeduinCancelRequestAction) beduinAction).getRequestId());
        if (dVar != null) {
            aVar.f99959i.a(dVar);
        }
    }
}
