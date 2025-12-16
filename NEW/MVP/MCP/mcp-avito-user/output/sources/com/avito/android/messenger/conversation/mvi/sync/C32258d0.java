package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.remote.model.messenger.message.LocalMessage;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageSyncAgent.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "remoteIdsFromDb", "Lio/reactivex/rxjava3/core/g;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.sync.d0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32258d0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<LocalMessage> f194762b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f194763c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f194764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P f194765e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f194766f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f194767g;

    public C32258d0(List<LocalMessage> list, int i12, int i13, P p12, MessengerUserHashInfo messengerUserHashInfo, String str) {
        this.f194762b = list;
        this.f194763c = i12;
        this.f194764d = i13;
        this.f194765e = p12;
        this.f194766f = messengerUserHashInfo;
        this.f194767g = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        AbstractC41768a abstractC41768aP;
        AbstractC41768a abstractC41768aO;
        T next;
        List list = (List) obj;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<LocalMessage> list2 = this.f194762b;
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            String remoteId = ((LocalMessage) it.next()).getRemoteId();
            if (remoteId != null) {
                linkedHashSet.add(remoteId);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            String str = (String) it2.next();
            String str2 = linkedHashSet.contains(str) ? null : str;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        String str3 = this.f194767g;
        MessengerUserHashInfo messengerUserHashInfo = this.f194766f;
        P p12 = this.f194765e;
        if (zIsEmpty) {
            abstractC41768aP = C41823n.f402260b;
        } else {
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(new io.reactivex.rxjava3.internal.operators.completable.v(p12.f194644l.b(str3, (String) it3.next(), messengerUserHashInfo)));
            }
            abstractC41768aP = AbstractC41768a.p(arrayList2);
        }
        if (list2.size() < this.f194763c * this.f194764d) {
            Iterator<T> it4 = list2.iterator();
            if (it4.hasNext()) {
                next = it4.next();
                if (it4.hasNext()) {
                    long created = ((LocalMessage) next).getCreated();
                    do {
                        Object obj2 = (T) it4.next();
                        long created2 = ((LocalMessage) obj2).getCreated();
                        if (created > created2) {
                            next = (T) obj2;
                            created = created2;
                        }
                    } while (it4.hasNext());
                }
            } else {
                next = (T) null;
            }
            LocalMessage localMessage = next;
            Long lValueOf = localMessage != null ? Long.valueOf(localMessage.getCreated()) : null;
            abstractC41768aO = lValueOf != null ? p12.f194634b.L(lValueOf.longValue(), str3, messengerUserHashInfo).o(new C32256c0(p12, messengerUserHashInfo, str3)) : C41823n.f402260b;
        } else {
            abstractC41768aO = C41823n.f402260b;
        }
        return abstractC41768aP.g(abstractC41768aO);
    }
}
