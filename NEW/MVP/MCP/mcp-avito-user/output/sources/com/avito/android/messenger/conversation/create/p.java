package com.avito.android.messenger.conversation.create;

import com.avito.android.messenger.channels.mvi.sync.MessengerSuccessRateTracker;
import com.avito.android.messenger.conversation.ChannelActivityArguments;
import com.avito.android.messenger.conversation.create.CreateChannelPresenter;
import com.avito.android.messenger.conversation.create.c;
import com.avito.android.messenger.conversation.create.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CreateChannelPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/create/c$a;", "result", "Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State;", "apply", "(Lcom/avito/android/messenger/conversation/create/c$a;)Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class p<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o.b f189608b;

    public p(o.b bVar) {
        this.f189608b = bVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Object phoneVerification;
        c.a aVar = (c.a) obj;
        boolean z12 = aVar instanceof c.a.b;
        o.b bVar = this.f189608b;
        if (z12) {
            return new CreateChannelPresenter.State.Created(bVar.f189598e, ((c.a.b) aVar).f189525a);
        }
        if (aVar.equals(c.a.AbstractC5587a.C5588a.f189521a)) {
            bVar.f189599f.invoke();
            MessengerSuccessRateTracker.Result result = MessengerSuccessRateTracker.Result.f188368e;
            ChannelActivityArguments.Create create = bVar.f189598e;
            o.b.d(bVar, create, result);
            phoneVerification = new CreateChannelPresenter.State.Waiting.Auth(create);
        } else {
            if (!aVar.equals(c.a.AbstractC5587a.d.f189524a)) {
                if (aVar.equals(c.a.AbstractC5587a.b.f189522a)) {
                    o.b.d(bVar, bVar.f189598e, MessengerSuccessRateTracker.Result.f188369f);
                    return CreateChannelPresenter.State.Error.Forbidden.f189514b;
                }
                if (aVar instanceof c.a.AbstractC5587a.C5589c) {
                    o.b.d(bVar, bVar.f189598e, MessengerSuccessRateTracker.Result.f188367d);
                    return CreateChannelPresenter.State.Error.Network.f189515b;
                }
                if (!(aVar instanceof c.a.AbstractC5587a.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                o.b.d(bVar, bVar.f189598e, MessengerSuccessRateTracker.Result.f188366c);
                return CreateChannelPresenter.State.Error.Unknown.f189517b;
            }
            bVar.f189600g.invoke();
            MessengerSuccessRateTracker.Result result2 = MessengerSuccessRateTracker.Result.f188370g;
            ChannelActivityArguments.Create create2 = bVar.f189598e;
            o.b.d(bVar, create2, result2);
            phoneVerification = new CreateChannelPresenter.State.Waiting.PhoneVerification(create2);
        }
        return phoneVerification;
    }
}
