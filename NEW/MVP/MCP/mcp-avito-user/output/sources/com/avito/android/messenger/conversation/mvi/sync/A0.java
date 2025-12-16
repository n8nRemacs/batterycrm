package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.C32293v0;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MissingUsersSyncAgent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/v0$c;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/messenger/conversation/mvi/sync/v0$c;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class A0<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f194579b;

    public A0(MessengerUserHashInfo messengerUserHashInfo) {
        this.f194579b = messengerUserHashInfo;
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        return kotlin.jvm.internal.L.f(((C32293v0.c) obj).f194859a, this.f194579b);
    }
}
