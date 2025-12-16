package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.messenger.channels.mvi.sync.C31864v;
import com.avito.android.messenger.conversation.mvi.sync.K;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import io.reactivex.rxjava3.core.AbstractC41768a;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelSyncOnPushAgent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", RequestReviewResultKt.INFO_TYPE, "Lio/reactivex/rxjava3/core/g;", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.channels.mvi.sync.w, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31866w<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31864v.b f188578b;

    public C31866w(C31864v.b bVar) {
        this.f188578b = bVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
        C31864v.b bVar = this.f188578b;
        C31864v c31864v = C31864v.this;
        AbstractC41768a abstractC41768aConnect = c31864v.f188571W.get().connect();
        hu.akarnokd.rxjava3.schedulers.c cVar = c31864v.f207140R;
        return abstractC41768aConnect.q(cVar).x(cVar).g(c31864v.f188572X.get().i(bVar.f188575d, messengerUserHashInfo).x(cVar)).g(new io.reactivex.rxjava3.internal.operators.completable.v(K.a.a(c31864v.f188573Y.get(), messengerUserHashInfo, bVar.f188575d, 1, null, 24)).x(cVar));
    }
}
