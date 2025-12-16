package com.avito.android.messenger.channels.mvi.sync;

import arrow.core.C23703n1;
import arrow.core.Y0;
import com.avito.android.remote.model.messenger.Channel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: Singles.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Larrow/core/Y0;", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/g;", "com/avito/android/util/rx3/M0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.channels.mvi.sync.g0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31836g0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31834f0 f188483b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188484c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Channel f188485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Channel f188486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188487f;

    public C31836g0(C31834f0 c31834f0, MessengerUserHashInfo messengerUserHashInfo, Channel channel, Channel channel2, MessengerUserHashInfo messengerUserHashInfo2) {
        this.f188483b = c31834f0;
        this.f188484c = messengerUserHashInfo;
        this.f188485d = channel;
        this.f188486e = channel2;
        this.f188487f = messengerUserHashInfo2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Y0 y02 = (Y0) obj;
        boolean z12 = y02 instanceof arrow.core.X0;
        C31834f0 c31834f0 = this.f188483b;
        if (z12) {
            return c31834f0.f188473b.j(this.f188484c, this.f188485d).q(c31834f0.f188472a.c());
        }
        if (y02 instanceof C23703n1) {
            return new io.reactivex.rxjava3.internal.operators.single.G(new CallableC31838h0(c31834f0, (Channel) ((C23703n1) y02).f56288b, this.f188486e)).o(new C31840i0(c31834f0, this.f188487f));
        }
        throw new NoWhenBranchMatchedException();
    }
}
