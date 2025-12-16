package com.avito.android.messenger.conversation.create;

import com.avito.android.messenger.conversation.create.CreateChannelPresenter;
import com.avito.android.messenger.conversation.create.o;
import kotlin.Metadata;

/* compiled from: CreateChannelPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/create/CreateChannelPresenter$State;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class q<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o.c f189616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CreateChannelPresenter.State f189617c;

    public q(o.c cVar, CreateChannelPresenter.State state) {
        this.f189616b = cVar;
        this.f189617c = state;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f189616b.f189603e.invoke(((CreateChannelPresenter.State.Waiting.PhoneVerification) this.f189617c).f189520b);
    }
}
