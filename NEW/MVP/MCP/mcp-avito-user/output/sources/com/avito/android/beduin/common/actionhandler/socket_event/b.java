package com.avito.android.beduin.common.actionhandler.socket_event;

import com.avito.android.beduin.common.action.BeduinSocketEventAction;
import io.reactivex.rxjava3.internal.operators.observable.U;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l41.o;

/* compiled from: BeduinSocketEventsHandler.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinSocketEventAction;", "kotlin.jvm.PlatformType", "action", "Lio/reactivex/rxjava3/core/E;", "Lmx0/a;", "apply", "(Lcom/avito/android/beduin/common/action/BeduinSocketEventAction;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f100393b;

    public b(a aVar) {
        this.f100393b = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        BeduinSocketEventAction beduinSocketEventAction = (BeduinSocketEventAction) obj;
        if (beduinSocketEventAction instanceof BeduinSocketEventAction.Subscribe) {
            a aVar = this.f100393b;
            return aVar.f100385a.a().y0(new e((BeduinSocketEventAction.Subscribe) beduinSocketEventAction, aVar));
        }
        if (beduinSocketEventAction instanceof BeduinSocketEventAction.Unsubscribe) {
            return U.f403867b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
