package com.avito.android.app.task;

import com.avito.android.analytics.NetworkType;
import com.avito.android.comparison.remote.model.ComparisonItem;
import com.avito.android.comparison.remote.model.ComparisonResponse;
import com.avito.android.messenger.analytics.MessageType;
import com.avito.android.messenger.analytics.ServerConnectionType;
import com.avito.android.messenger.channels.mvi.data.C31704l;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.util.V2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import l41.InterfaceC43543a;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.app.task.j1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C28567j1 implements InterfaceC43543a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f91635b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f91636c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f91637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Serializable f91638e;

    public /* synthetic */ C28567j1(int i12, Object obj, Object obj2, String str) {
        this.f91635b = i12;
        this.f91636c = obj;
        this.f91637d = obj2;
        this.f91638e = str;
    }

    @Override // l41.InterfaceC43543a
    public final void run() {
        Serializable serializable = this.f91638e;
        Object obj = this.f91637d;
        Object obj2 = this.f91636c;
        switch (this.f91635b) {
            case 0:
                int i12 = ((AtomicInteger) serializable).get();
                V2 v22 = V2.f318762a;
                StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "Message sent with attempt #", ": ");
                sbJ.append(((LocalMessage) obj).getLocalId());
                v22.c("PendingMessageHandler", sbJ.toString(), null);
                ((InterfaceC28598u0) obj2).b(i12, true);
                return;
            case 1:
                LinkedHashMap linkedHashMap = ((com.avito.android.comparison.data.b) obj2).f123832b;
                String str = (String) obj;
                Object obj3 = linkedHashMap.get(str);
                if (obj3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ComparisonResponse comparisonResponse = (ComparisonResponse) obj3;
                ArrayList arrayList = new ArrayList(comparisonResponse.getItems());
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!kotlin.jvm.internal.L.f(((ComparisonItem) next).getId(), (String) serializable)) {
                        arrayList2.add(next);
                    }
                }
                linkedHashMap.put(str, ComparisonResponse.a(comparisonResponse, arrayList2, null, 27));
                return;
            case 2:
                MessengerUserHashInfo messengerUserHashInfo = (MessengerUserHashInfo) obj;
                ((C31704l) obj2).f187236a.b(com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c), messengerUserHashInfo.f430682d, (String) serializable, messengerUserHashInfo.f430680b);
                return;
            case 3:
                ((com.avito.android.messenger.conversation.mvi.sync.P) obj2).f194640h.a((String) serializable, (MessengerUserHashInfo) obj);
                return;
            default:
                com.avito.android.messenger.service.direct_reply.j jVar = (com.avito.android.messenger.service.direct_reply.j) obj2;
                String strA = jVar.f197246e.a();
                MessageType messageType = MessageType.f186199c;
                NetworkType networkType = NetworkType.f89666d;
                jVar.f197245d.c(new com.avito.android.messenger.analytics.c0((String) obj, messageType, (String) serializable, !kotlin.jvm.internal.L.f(strA, "NONE"), strA, !kotlin.jvm.internal.L.f(strA, "NONE") ? ServerConnectionType.f186250e : ServerConnectionType.f186248c));
                return;
        }
    }

    public /* synthetic */ C28567j1(InterfaceC28598u0 interfaceC28598u0, C28582o1 c28582o1, LocalMessage localMessage, AtomicInteger atomicInteger) {
        this.f91635b = 0;
        this.f91636c = interfaceC28598u0;
        this.f91637d = localMessage;
        this.f91638e = atomicInteger;
    }
}
