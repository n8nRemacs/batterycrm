package com.avito.android.messenger.conversation.mvi.sync;

import Hq0.C14020b;
import com.avito.android.app.task.C28567j1;
import com.avito.android.messenger.channels.mvi.data.CallableC31710s;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageSyncAgent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "mergedMessages", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/messenger/conversation/mvi/sync/K$c;", "kotlin.jvm.PlatformType", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.j0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32270j0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f194790b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P f194791c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f194792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f194793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Long f194794f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f194795g;

    public C32270j0(int i12, P p12, MessengerUserHashInfo messengerUserHashInfo, String str, Long l12, AtomicBoolean atomicBoolean) {
        this.f194790b = i12;
        this.f194791c = p12;
        this.f194792d = messengerUserHashInfo;
        this.f194793e = str;
        this.f194794f = l12;
        this.f194795g = atomicBoolean;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        int size = list.size();
        int i12 = this.f194790b;
        io.reactivex.rxjava3.internal.operators.single.A aG2 = P.g(this.f194791c, this.f194792d, this.f194793e, (size / i12) + (list.size() % i12 > 0 ? 1 : 0), list, this.f194794f);
        P p12 = this.f194791c;
        p12.getClass();
        MessengerUserHashInfo messengerUserHashInfo = this.f194792d;
        String str = this.f194793e;
        return new io.reactivex.rxjava3.internal.operators.completable.T(aG2.g(new C41826q(new C28567j1(3, p12, messengerUserHashInfo, str)).g(new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC31710s(4, str, p12, messengerUserHashInfo, list)))), new C14020b(15, this.f194795g, list), null);
    }
}
