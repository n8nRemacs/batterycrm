package com.avito.android.messenger.conversation.mvi.context;

import arrow.core.C23703n1;
import arrow.core.X0;
import arrow.core.Y0;
import com.avito.android.C30277e1;
import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import com.avito.android.messenger.conversation.mvi.context.C31988b;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.mvi.b;
import com.avito.android.remote.model.messenger.Channel;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: Singles.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "", "R", "Larrow/core/Y0;", "it", "Lio/reactivex/rxjava3/core/O;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/O;", "com/avito/android/util/rx3/P0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.context.g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31993g<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31988b f190377b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190378c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC31987a.C5631a f190379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C31988b.f.a f190380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC31987a.C5631a f190381f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190382g;

    public C31993g(C31988b c31988b, MessengerUserHashInfo messengerUserHashInfo, InterfaceC31987a.C5631a c5631a, C31988b.f.a aVar, InterfaceC31987a.C5631a c5631a2, MessengerUserHashInfo messengerUserHashInfo2) {
        this.f190377b = c31988b;
        this.f190378c = messengerUserHashInfo;
        this.f190379d = c5631a;
        this.f190380e = aVar;
        this.f190381f = c5631a2;
        this.f190382g = messengerUserHashInfo2;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Y0 y02 = (Y0) obj;
        if (!(y02 instanceof X0)) {
            if (!(y02 instanceof C23703n1)) {
                throw new NoWhenBranchMatchedException();
            }
            return io.reactivex.rxjava3.core.I.q(InterfaceC31987a.C5631a.a(this.f190381f, this.f190382g, new b.d((Channel) ((C23703n1) y02).f56288b), null, false, 12)).h(new C31994h(C31988b.this));
        }
        C31988b c31988b = this.f190377b;
        C30277e1 c30277e1 = c31988b.f190252g0;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[22];
        boolean zBooleanValue = ((Boolean) c30277e1.f145047x.a().invoke()).booleanValue();
        hu.akarnokd.rxjava3.schedulers.c cVar = c31988b.f207140R;
        String str = c31988b.f190241V;
        ChannelSyncAgent channelSyncAgent = c31988b.f190251f0;
        MessengerUserHashInfo messengerUserHashInfo = this.f190378c;
        return zBooleanValue ? channelSyncAgent.i(str, messengerUserHashInfo).q(cVar).B(InterfaceC31987a.C5631a.a(this.f190379d, this.f190378c, null, null, false, 14)) : channelSyncAgent.i(str, messengerUserHashInfo).q(cVar).B(G0.f406611a).n(new Q(c31988b, messengerUserHashInfo)).n(new P(messengerUserHashInfo, c31988b, this.f190379d, messengerUserHashInfo));
    }
}
