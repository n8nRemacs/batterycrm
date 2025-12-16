package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.messenger.analytics.MessageType;
import com.avito.android.messenger.analytics.d0;
import kotlin.Metadata;

/* compiled from: SendMessagePresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "it", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class V<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f194456b;

    public V(D d12) {
        this.f194456b = d12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        D d12 = this.f194456b;
        d12.f194199b0.c(new d0.b(d12.f194201d0, MessageType.f186201e, false));
    }
}
