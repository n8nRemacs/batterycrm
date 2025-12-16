package com.avito.android.messenger.support;

import com.avito.android.remote.model.StartSupportChatResponse;
import kotlin.Metadata;
import kotlin.Q;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: SupportChatFormInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lkotlin/Q;", "Lcom/avito/android/remote/model/StartSupportChatResponse;", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartSupportChatResponse f197360b;

    public d(StartSupportChatResponse startSupportChatResponse) {
        this.f197360b = startSupportChatResponse;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return new Q((MessengerUserHashInfo) obj, this.f197360b);
    }
}
