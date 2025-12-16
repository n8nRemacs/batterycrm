package com.avito.android.messenger.conversation.mvi.context;

import arrow.core.C23703n1;
import arrow.core.X0;
import arrow.core.Y0;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.mvi.b;
import com.avito.android.remote.model.messenger.Channel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: Singles.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "", "R", "Larrow/core/Y0;", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/O;", "com/avito/android/util/rx3/P0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class P<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190188b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C31988b f190189c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC31987a.C5631a f190190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190191e;

    public P(MessengerUserHashInfo messengerUserHashInfo, C31988b c31988b, InterfaceC31987a.C5631a c5631a, MessengerUserHashInfo messengerUserHashInfo2) {
        this.f190188b = messengerUserHashInfo;
        this.f190189c = c31988b;
        this.f190190d = c5631a;
        this.f190191e = messengerUserHashInfo2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Y0 y02 = (Y0) obj;
        if (!(y02 instanceof X0)) {
            if (!(y02 instanceof C23703n1)) {
                throw new NoWhenBranchMatchedException();
            }
            return io.reactivex.rxjava3.core.I.q(InterfaceC31987a.C5631a.a(this.f190190d, this.f190191e, new b.d((Channel) ((C23703n1) y02).f56288b), null, false, 12));
        }
        return io.reactivex.rxjava3.core.I.l(new RuntimeException("Channel is not in DB after channelSyncAgent.syncChat(): userInfo = (" + com.avito.android.messenger.util.i.b(this.f190188b, new kotlin.Q[0]) + "), channelId = " + this.f190189c.f190241V));
    }
}
