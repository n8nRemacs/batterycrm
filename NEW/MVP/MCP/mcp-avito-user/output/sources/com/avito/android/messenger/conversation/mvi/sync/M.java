package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.C30277e1;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.ChatMessage;
import ru.avito.messenger.api.entity.ChatMessageUpdate;

/* compiled from: MessageSyncAgent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LX81/h;", "event", "Lio/reactivex/rxjava3/core/g;", "apply", "(LX81/h;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class M<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f194612b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f194613c;

    public M(P p12, MessengerUserHashInfo messengerUserHashInfo) {
        this.f194612b = p12;
        this.f194613c = messengerUserHashInfo;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        AbstractC41768a abstractC41768aP;
        X81.h hVar = (X81.h) obj;
        boolean z12 = hVar instanceof ChatMessage;
        MessengerUserHashInfo messengerUserHashInfo = this.f194613c;
        P p12 = this.f194612b;
        if (z12) {
            C30277e1 c30277e1 = p12.f194645m;
            c30277e1.getClass();
            kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[106];
            abstractC41768aP = !((Boolean) c30277e1.f145000a1.a().invoke()).booleanValue() ? p12.c((ChatMessage) hVar, messengerUserHashInfo, true) : C41823n.f402260b;
        } else if (hVar instanceof ChatMessageUpdate) {
            C30277e1 c30277e12 = p12.f194645m;
            c30277e12.getClass();
            kotlin.reflect.n<Object> nVar2 = C30277e1.f144946d1[106];
            abstractC41768aP = !((Boolean) c30277e12.f145000a1.a().invoke()).booleanValue() ? p12.c(((ChatMessageUpdate) hVar).getMessage(), messengerUserHashInfo, false) : C41823n.f402260b;
        } else if (hVar instanceof X81.q) {
            X81.q qVar = (X81.q) hVar;
            p12.getClass();
            abstractC41768aP = p12.f194634b.b0(messengerUserHashInfo, qVar.b(), qVar.getTimeStamp()).g(p12.f194646n.d(qVar.getInitActionTimestamp()));
        } else if (hVar instanceof X81.j) {
            X81.j jVar = (X81.j) hVar;
            p12.getClass();
            if (jVar.a().isEmpty() || C43066x.K(jVar.getChannelId())) {
                abstractC41768aP = C41823n.f402260b;
            } else {
                List<String> listA = jVar.a();
                ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
                Iterator<T> it = listA.iterator();
                while (it.hasNext()) {
                    arrayList.add(new io.reactivex.rxjava3.internal.operators.completable.v(p12.f194644l.b(jVar.getChannelId(), (String) it.next(), messengerUserHashInfo)));
                }
                abstractC41768aP = AbstractC41768a.p(arrayList);
            }
        } else {
            abstractC41768aP = C41823n.f402260b;
        }
        return abstractC41768aP.l(new L(p12, messengerUserHashInfo, hVar));
    }
}
