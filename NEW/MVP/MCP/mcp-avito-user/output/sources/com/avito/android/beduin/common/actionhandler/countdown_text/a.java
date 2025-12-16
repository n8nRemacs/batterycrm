package com.avito.android.beduin.common.actionhandler.countdown_text;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.beduin.common.action.BeduinApplyCountdownTextAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinApplyCountdownTextActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/countdown_text/a;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinApplyCountdownTextAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements InterfaceC15523b<BeduinApplyCountdownTextAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f100207a;

    @Inject
    public a(@k h hVar) {
        this.f100207a = hVar;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        TimeUnit timeUnit;
        BeduinApplyCountdownTextAction beduinApplyCountdownTextAction = (BeduinApplyCountdownTextAction) beduinAction;
        h hVar = this.f100207a;
        hVar.getClass();
        long duration = beduinApplyCountdownTextAction.getCountdown().getDuration() + 1;
        long step = beduinApplyCountdownTextAction.getCountdown().getStep();
        BeduinApplyCountdownTextAction.CountdownUnit unit = beduinApplyCountdownTextAction.getCountdown().getUnit();
        if (unit == null || (timeUnit = unit.getTimeUnit()) == null) {
            timeUnit = TimeUnit.SECONDS;
        }
        TimeUnit timeUnit2 = timeUnit;
        InterfaceC35745a5 interfaceC35745a5 = hVar.f100217c;
        y yVar = (y) z.b0(duration, 0L, step, timeUnit2, interfaceC35745a5.c()).j0(interfaceC35745a5.e()).v0(A1.a(new g(hVar, beduinApplyCountdownTextAction)), A1.c(new e(1, V2.f318762a, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0)), A1.b(new f(hVar, beduinApplyCountdownTextAction)));
        h31.e<io.reactivex.rxjava3.disposables.c> eVar = hVar.f100218d;
        eVar.get().b(yVar);
        String id2 = beduinApplyCountdownTextAction.getId();
        if (id2 != null) {
            HashMap<String, io.reactivex.rxjava3.disposables.d> map = hVar.f100219e;
            io.reactivex.rxjava3.disposables.d dVarRemove = map.remove(id2);
            if (dVarRemove != null) {
                eVar.get().a(dVarRemove);
            }
            map.put(id2, yVar);
        }
    }
}
