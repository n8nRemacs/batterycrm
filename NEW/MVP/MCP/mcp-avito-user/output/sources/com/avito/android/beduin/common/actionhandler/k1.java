package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15522a;
import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinShowAlertAction;
import com.avito.android.beduin_models.BeduinAction;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinShowAlertHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/k1;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinShowAlertAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k1 implements InterfaceC15523b<BeduinShowAlertAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15522a f100272a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15523b<BeduinAction>> f100273b;

    @Inject
    public k1(@Y61.k InterfaceC15522a interfaceC15522a, @Y61.k h31.e<InterfaceC15523b<BeduinAction>> eVar) {
        this.f100272a = interfaceC15522a;
        this.f100273b = eVar;
    }

    public static final void l(k1 k1Var, List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k1Var.f100273b.get().o((BeduinAction) it.next());
            }
        }
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        this.f100272a.b(new C28770o0(1, (BeduinShowAlertAction) beduinAction, this));
    }
}
