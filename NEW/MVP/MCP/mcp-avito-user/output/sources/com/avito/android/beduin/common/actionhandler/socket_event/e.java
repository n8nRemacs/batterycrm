package com.avito.android.beduin.common.actionhandler.socket_event;

import com.avito.android.beduin.common.action.BeduinSocketEventAction;
import com.avito.android.clientEventBus.ConnectionState;
import io.reactivex.rxjava3.internal.operators.observable.U;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import l41.o;
import mx0.InterfaceC44149a;

/* compiled from: BeduinSocketEventsHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/clientEventBus/ConnectionState;", "connectionState", "Lio/reactivex/rxjava3/core/E;", "Lmx0/a;", "apply", "(Lcom/avito/android/clientEventBus/ConnectionState;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.actionhandler.socket_event.a f100397b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BeduinSocketEventAction.Subscribe f100398c;

    /* compiled from: BeduinSocketEventsHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ConnectionState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ConnectionState connectionState = ConnectionState.f118528b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public e(BeduinSocketEventAction.Subscribe subscribe, com.avito.android.beduin.common.actionhandler.socket_event.a aVar) {
        this.f100397b = aVar;
        this.f100398c = subscribe;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        int iOrdinal = ((ConnectionState) obj).ordinal();
        com.avito.android.beduin.common.actionhandler.socket_event.a aVar = this.f100397b;
        BeduinSocketEventAction.Subscribe subscribe = this.f100398c;
        if (iOrdinal == 0) {
            return aVar.f100385a.b(InterfaceC44149a.class, new mx0.e(subscribe.getType(), subscribe.getSubType(), false, 4, null)).l0(c.f100394b).D0(100L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).K(new d(subscribe, aVar));
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        com.avito.android.beduin_shared.model.utils.a.a(aVar.f100386b.get(), subscribe.getOnDisconnectActions());
        return U.f403867b;
    }
}
