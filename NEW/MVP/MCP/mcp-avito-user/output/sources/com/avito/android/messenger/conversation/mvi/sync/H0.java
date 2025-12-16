package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.C32293v0;
import com.avito.android.messenger.conversation.mvi.sync.C32293v0.d;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MissingUsersSyncAgent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/sync/v0$e;", VoiceInfo.STATE, "Lcom/avito/android/messenger/conversation/mvi/sync/v0$d;", "Lcom/avito/android/messenger/conversation/mvi/sync/v0;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/sync/v0$e;)Lcom/avito/android/messenger/conversation/mvi/sync/v0$d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class H0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32293v0 f194592b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f194593c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f194594d;

    public H0(C32293v0 c32293v0, MessengerUserHashInfo messengerUserHashInfo, String str) {
        this.f194592b = c32293v0;
        this.f194593c = messengerUserHashInfo;
        this.f194594d = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f194592b.new d(this.f194593c, this.f194594d, ((C32293v0.e) obj).f194868c);
    }
}
