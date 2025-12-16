package com.avito.android.messenger.conversation.mvi.messages;

import kotlin.Metadata;

/* compiled from: MessageListInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LX81/k;", "event", "", "test", "(LX81/k;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class W<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32141e f192109b;

    public W(C32141e c32141e) {
        this.f192109b = c32141e;
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        return kotlin.jvm.internal.L.f(((X81.k) obj).getChannelId(), this.f192109b.f192907a0);
    }
}
