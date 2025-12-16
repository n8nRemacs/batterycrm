package com.avito.android.messenger.channels.mvi.interactor;

import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: LocallyDeletedChannelsInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/MessengerUserHashInfo;", "userInfo", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/persistence/messenger/Z;", "apply", "(Lru/avito/messenger/MessengerUserHashInfo;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class D<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f187624b;

    public D(H h12) {
        this.f187624b = h12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        H h12 = this.f187624b;
        return com.avito.android.util.rx3.arrow.b.a(h12.f187628a.d((MessengerUserHashInfo) obj).x0(h12.f187631d.a())).B(C.f187623a);
    }
}
