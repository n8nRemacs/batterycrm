package com.avito.android.beduin.common.actionhandler;

import Ui.InterfaceC15523b;
import com.avito.android.beduin.common.action.BeduinDelayAction;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinDelayActionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/O;", "LUi/b;", "Lcom/avito/android/beduin/common/action/BeduinDelayAction;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class O implements InterfaceC15523b<BeduinDelayAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC15523b<BeduinAction>> f100104a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<io.reactivex.rxjava3.disposables.c> f100105b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f100106c;

    @Inject
    public O(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k h31.e eVar, @Y61.k h31.e eVar2) {
        this.f100104a = eVar;
        this.f100105b = eVar2;
        this.f100106c = interfaceC35745a5;
    }

    @Override // Ui.InterfaceC15523b
    public final void o(BeduinAction beduinAction) {
        BeduinDelayAction beduinDelayAction = (BeduinDelayAction) beduinAction;
        io.reactivex.rxjava3.internal.operators.single.M mQ2 = io.reactivex.rxjava3.core.I.q(beduinDelayAction);
        long duration = (long) (beduinDelayAction.getDuration() * 1000);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC35745a5 interfaceC35745a5 = this.f100106c;
        this.f100105b.get().b(io.reactivex.rxjava3.kotlin.A1.e(mQ2.g(duration, timeUnit, interfaceC35745a5.c()).s(interfaceC35745a5.e()), new M(1, V2.f318762a, V2.class, "error", "error(Ljava/lang/Throwable;)V", 0), new N(this)));
    }
}
