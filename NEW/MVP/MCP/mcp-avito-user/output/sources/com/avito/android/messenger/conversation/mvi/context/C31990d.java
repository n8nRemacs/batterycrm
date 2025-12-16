package com.avito.android.messenger.conversation.mvi.context;

import arrow.core.C23703n1;
import arrow.core.X0;
import arrow.core.Y0;
import com.avito.android.messenger.conversation.mvi.context.C31988b;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.util.UnauthorizedException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelContextInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "R", "Larrow/core/Y0;", "Lru/avito/messenger/MessengerUserHashInfo;", "userIdOption", "Lio/reactivex/rxjava3/core/O;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/O;", "com/avito/android/messenger/conversation/mvi/context/T", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.context.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31990d<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31988b f190297b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC31987a.C5631a f190298c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C31988b.f.a f190299d;

    public C31990d(C31988b c31988b, InterfaceC31987a.C5631a c5631a, C31988b.f.a aVar) {
        this.f190297b = c31988b;
        this.f190298c = c5631a;
        this.f190299d = aVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) throws UnauthorizedException {
        Y0 y02 = (Y0) obj;
        if (y02 instanceof X0) {
            throw new UnauthorizedException(null, 1, null);
        }
        if (!(y02 instanceof C23703n1)) {
            throw new NoWhenBranchMatchedException();
        }
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) ((C23703n1) y02).f56288b;
        C31988b c31988b = this.f190297b;
        io.reactivex.rxjava3.internal.operators.observable.T tS2 = c31988b.f190250e0.b(c31988b.f190241V, messengerUserHashInfo).j0(c31988b.f207140R).S();
        C31988b c31988b2 = this.f190297b;
        InterfaceC31987a.C5631a c5631a = this.f190298c;
        return tS2.n(new C31993g(c31988b2, messengerUserHashInfo, c5631a, this.f190299d, c5631a, messengerUserHashInfo));
    }
}
