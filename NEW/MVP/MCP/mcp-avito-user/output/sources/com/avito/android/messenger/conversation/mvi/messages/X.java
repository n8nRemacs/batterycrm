package com.avito.android.messenger.conversation.mvi.messages;

import com.avito.android.messenger.conversation.mvi.messages.C32141e.C5702e;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageListInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LX81/k;", "it", "Lkotlin/G0;", "accept", "(LX81/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class X<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32141e f192110b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f192111c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Integer f192112d;

    public X(C32141e c32141e, MessengerUserHashInfo messengerUserHashInfo, Integer num) {
        this.f192110b = c32141e;
        this.f192111c = messengerUserHashInfo;
        this.f192112d = num;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C32141e c32141e = this.f192110b;
        c32141e.le().s(c32141e.new C5702e(this.f192111c, this.f192112d));
    }
}
