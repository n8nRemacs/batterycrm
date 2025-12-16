package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.C32293v0;
import com.avito.android.util.V2;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MissingUsersSyncAgent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/v0$c;", "kotlin.jvm.PlatformType", "request", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/mvi/sync/v0$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.z0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32301z0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32293v0 f194880b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f194881c;

    public C32301z0(C32293v0 c32293v0, MessengerUserHashInfo messengerUserHashInfo) {
        this.f194880b = c32293v0;
        this.f194881c = messengerUserHashInfo;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C32293v0.c cVar = (C32293v0.c) obj;
        V2 v22 = V2.f318762a;
        int i12 = C32293v0.f194852a0;
        v22.c(this.f194880b.f207131E, "Asking to request users from message list " + com.avito.android.messenger.util.i.b(this.f194881c, new kotlin.Q[0]) + ", channelId = " + cVar.f194860b + ", messageListSize = " + cVar.f194861c.size() + ' ', null);
    }
}
