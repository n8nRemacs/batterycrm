package com.avito.android.messenger.channels.mvi.sync;

import IY.a;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import io.reactivex.rxjava3.internal.operators.completable.C41828t;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessengerReadStatusSyncAgent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LX81/h;", "event", "Lio/reactivex/rxjava3/core/g;", "apply", "(LX81/h;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class R0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U0 f188388b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188389c;

    public R0(U0 u02, MessengerUserHashInfo messengerUserHashInfo) {
        this.f188388b = u02;
        this.f188389c = messengerUserHashInfo;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        AbstractC41768a vVar;
        X81.h hVar = (X81.h) obj;
        boolean z12 = hVar instanceof X81.o;
        MessengerUserHashInfo messengerUserHashInfo = this.f188389c;
        U0 u02 = this.f188388b;
        if (z12) {
            X81.o oVar = (X81.o) hVar;
            u02.getClass();
            boolean zF2 = kotlin.jvm.internal.L.f(oVar.getFromId(), messengerUserHashInfo.f430682d);
            InterfaceC32024m interfaceC32024m = u02.f188393a;
            if (zF2) {
                C41828t c41828tH0 = interfaceC32024m.h0(oVar.timeStamp, oVar.getChannelId(), messengerUserHashInfo);
                AbstractC41768a abstractC41768aO = u02.f188394b.o(oVar.getChannelId(), messengerUserHashInfo);
                Set<? extends IY.a> setSingleton = Collections.singleton(new a.b(oVar.getChannelId()));
                vVar = c41828tH0.g(new io.reactivex.rxjava3.internal.operators.completable.v(u02.f188402j.t(abstractC41768aO.B(kotlin.G0.f406611a), "handleReadEvent", setSingleton, u02.f188403k)));
            } else {
                vVar = interfaceC32024m.P(oVar.timeStamp, oVar.getChannelId(), messengerUserHashInfo);
            }
        } else if (hVar instanceof X81.t) {
            X81.t tVar = (X81.t) hVar;
            u02.getClass();
            if (kotlin.jvm.internal.L.f(tVar.getUid(), messengerUserHashInfo.f430682d)) {
                AbstractC41768a abstractC41768aI = u02.f188394b.i(tVar.getChannelId(), messengerUserHashInfo);
                Set<? extends IY.a> setSingleton2 = Collections.singleton(new a.b(tVar.getChannelId()));
                vVar = new io.reactivex.rxjava3.internal.operators.completable.v(u02.f188402j.t(abstractC41768aI.B(kotlin.G0.f406611a), "handleUnreadEvent", setSingleton2, u02.f188403k));
            } else {
                vVar = C41823n.f402260b;
            }
        } else {
            vVar = C41823n.f402260b;
        }
        return vVar.l(new Q0(u02, hVar));
    }
}
