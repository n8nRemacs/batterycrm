package com.avito.android.messenger.conversation.mvi.sync;

import androidx.compose.runtime.C22026a;
import com.avito.android.util.X2;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageSyncAgent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class O<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f194632b;

    public O(MessengerUserHashInfo messengerUserHashInfo) {
        this.f194632b = messengerUserHashInfo;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        X2.f318778a.a("MessageSyncAgent", C22026a.c(new StringBuilder("Subscription to ChatEvent stream encountered an error ("), com.avito.android.messenger.util.i.b(this.f194632b, new kotlin.Q[0]), ')'), (Throwable) obj);
    }
}
