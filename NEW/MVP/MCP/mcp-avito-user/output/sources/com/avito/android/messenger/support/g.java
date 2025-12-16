package com.avito.android.messenger.support;

import com.avito.android.remote.model.StartSupportChatResponse;
import kotlin.Metadata;
import kotlin.Q;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: SupportChatFormInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lru/avito/messenger/MessengerUserHashInfo;", "Lcom/avito/android/remote/model/StartSupportChatResponse;", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/O;", "", "apply", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class g<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f197384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CharSequence f197385c;

    public g(h hVar, CharSequence charSequence) {
        this.f197384b = hVar;
        this.f197385c = charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        Q q12 = (Q) obj;
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) q12.f406619b;
        String channelId = ((StartSupportChatResponse) q12.f406620c).getResult().getChannelId();
        h hVar = this.f197384b;
        return hVar.f197388c.f(messengerUserHashInfo, channelId, hVar.f197389d.a(), this.f197385c.toString(), null, null, null, null, null).r(new f(channelId));
    }
}
