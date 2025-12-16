package com.avito.android.messenger.support;

import com.avito.android.remote.model.StartSupportChatResponse;
import kotlin.Metadata;
import ru.avito.messenger.G0;

/* compiled from: SupportChatFormInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/StartSupportChatResponse;", "response", "Lio/reactivex/rxjava3/core/O;", "Lkotlin/Q;", "Lru/avito/messenger/MessengerUserHashInfo;", "apply", "(Lcom/avito/android/remote/model/StartSupportChatResponse;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f197382b;

    public e(h hVar) {
        this.f197382b = hVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return G0.a(this.f197382b.f197387b).r(new d((StartSupportChatResponse) obj));
    }
}
