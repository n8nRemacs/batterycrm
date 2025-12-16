package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinExecuteRequestAction;
import com.avito.android.beduin_models.BeduinAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinExecuteRequestActionHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/Q;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinExecuteRequestAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Q implements InterfaceC15523b<BeduinExecuteRequestAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin.common.a f100114a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15523b<BeduinAction>> f100115b;

    @Inject
    public Q(@Y61.k com.avito.android.beduin.common.a aVar, @Y61.k h31.e<InterfaceC15523b<BeduinAction>> eVar) {
        this.f100114a = aVar;
        this.f100115b = eVar;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        BeduinExecuteRequestAction beduinExecuteRequestAction = (BeduinExecuteRequestAction) beduinAction;
        this.f100114a.a(beduinExecuteRequestAction, new C28770o0(3, beduinExecuteRequestAction, this.f100115b.get()));
    }
}
