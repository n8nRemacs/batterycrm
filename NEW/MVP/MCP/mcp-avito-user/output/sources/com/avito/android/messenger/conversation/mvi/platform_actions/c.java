package com.avito.android.messenger.conversation.mvi.platform_actions;

import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: PlatformActionsInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "it", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lcom/avito/android/remote/model/messenger/message/LocalMessage;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f193872b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f193873c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f193874d;

    public c(b bVar, MessengerUserHashInfo messengerUserHashInfo, String str) {
        this.f193872b = bVar;
        this.f193873c = messengerUserHashInfo;
        this.f193874d = str;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f193872b.f193825b.e(this.f193874d, this.f193873c);
    }
}
