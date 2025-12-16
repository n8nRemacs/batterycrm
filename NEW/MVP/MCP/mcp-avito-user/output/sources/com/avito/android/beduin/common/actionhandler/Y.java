package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.beduin.common.action.BeduinLogFirebaseEventAction;
import com.avito.android.beduin_models.BeduinAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinLogFirebaseEventActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/Y;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinLogFirebaseEventAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Y implements InterfaceC15523b<BeduinLogFirebaseEventAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f100149a;

    @Inject
    public Y(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f100149a = interfaceC28373a;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        this.f100149a.c(new C28733a((BeduinLogFirebaseEventAction) beduinAction));
    }
}
