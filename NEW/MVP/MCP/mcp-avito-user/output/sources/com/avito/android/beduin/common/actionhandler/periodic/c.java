package com.avito.android.beduin.common.actionhandler.periodic;

import Ui.InterfaceC15523b;
import Y61.k;
import com.avito.android.beduin.common.action.BeduinExecutePeriodicAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinExecutePeriodicActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/periodic/c;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinExecutePeriodicAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements InterfaceC15523b<BeduinExecutePeriodicAction> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f100349a;

    @Inject
    public c(@k h hVar) {
        this.f100349a = hVar;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        BeduinExecutePeriodicAction beduinExecutePeriodicAction = (BeduinExecutePeriodicAction) beduinAction;
        h hVar = this.f100349a;
        hVar.getClass();
        if (beduinExecutePeriodicAction.getActions().isEmpty()) {
            return;
        }
        BeduinExecutePeriodicAction.Timer timer = beduinExecutePeriodicAction.getTimer();
        Long duration = timer.getDuration();
        InterfaceC35745a5 interfaceC35745a5 = hVar.f100356b;
        y yVar = (y) (duration != null ? z.b0(timer.getDuration().longValue() / timer.getStep(), timer.getStep(), timer.getStep(), TimeUnit.MILLISECONDS, interfaceC35745a5.c()) : z.a0(timer.getStep(), timer.getStep(), TimeUnit.MILLISECONDS, interfaceC35745a5.c())).j0(interfaceC35745a5.e()).v0(A1.a(new g(beduinExecutePeriodicAction, hVar)), A1.c(new e(1, V2.f318762a, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0)), A1.b(new f(beduinExecutePeriodicAction, hVar)));
        h31.e<io.reactivex.rxjava3.disposables.c> eVar = hVar.f100357c;
        eVar.get().b(yVar);
        String id2 = beduinExecutePeriodicAction.getId();
        if (id2 != null) {
            LinkedHashMap linkedHashMap = hVar.f100358d;
            io.reactivex.rxjava3.disposables.d dVar = (io.reactivex.rxjava3.disposables.d) linkedHashMap.remove(id2);
            if (dVar != null) {
                eVar.get().a(dVar);
            }
            linkedHashMap.put(id2, yVar);
        }
    }
}
