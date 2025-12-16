package com.avito.android.iac_dialer_watcher.impl_module.logging.repository;

import android.content.res.Resources;
import android.net.Uri;
import androidx.work.F;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.messenger.blacklist_reasons.y;
import com.avito.android.messenger.blacklist_reasons.z;
import com.avito.android.messenger.conversation.mvi.platform_actions.f;
import com.avito.android.messenger.conversation.mvi.quick_replies.d;
import com.avito.android.messenger.conversation.mvi.send.D;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.messenger.conversation.mvi.sync.MessageIsReadMarkerWorker;
import com.avito.android.mvi.rx3.with_monolithic_state.C32891b;
import com.avito.android.push.impl_module.fcm.i;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.V2;
import com.avito.android.util.X2;
import iI0.C41296a;
import kotlin.G0;
import kotlin.Q;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class d implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f167905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f167906c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f167907d;

    public /* synthetic */ d(int i12, Object obj, Object obj2) {
        this.f167905b = i12;
        this.f167906c = obj;
        this.f167907d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) throws Resources.NotFoundException {
        Object obj2 = this.f167907d;
        Object obj3 = this.f167906c;
        Throwable th2 = (Throwable) obj;
        switch (this.f167905b) {
            case 0:
                e eVar = (e) obj3;
                com.avito.android.iac_dialer_watcher.impl_module.logging.q qVar = eVar.f167911c;
                qVar.getClass();
                NonFatalErrorEvent nonFatalErrorEvent = new NonFatalErrorEvent("IacLogDao error", th2, null, NonFatalErrorEvent.a.c.f147934a, 4, null);
                InterfaceC28373a interfaceC28373a = qVar.f167891a;
                interfaceC28373a.c(nonFatalErrorEvent);
                interfaceC28373a.c(new y.a(qVar.f167892b.a("calls", "logs", "{{%app_ver%}}", "daoError").f91030a, 1L));
                V2.f318762a.a("App_Call", "error in logDao", th2);
                eVar.f167913e.set(true);
                eVar.f167912d.set(300000L);
                return obj2;
            case 1:
                return new Q((Uri) obj3, (String) obj2);
            case 2:
                Throwable thA = com.avito.android.messenger.util.q.a(th2);
                com.jakewharton.rxrelay3.d<y.c> dVar = ((z) obj3).f186693W;
                y.a aVar = ((y.d.C5479d) ((y.d) obj2)).f186691a;
                dVar.accept(new y.c.a(aVar, thA));
                return new y.d.c(aVar, thA);
            case 3:
                V2.f318762a.a(((com.avito.android.messenger.conversation.mvi.platform_actions.g) obj3).f207131E, "LoadItemsListMutator error!", th2);
                f.InterfaceC5732f.b.c.C5738c c5738c = (f.InterfaceC5732f.b.c.C5738c) obj2;
                return new f.InterfaceC5732f.b.c.C5737b(c5738c.f193926a, c5738c.f193927b, c5738c.f193928c, c5738c.f193929d);
            case 4:
                com.avito.android.messenger.conversation.mvi.quick_replies.f fVar = (com.avito.android.messenger.conversation.mvi.quick_replies.f) obj3;
                fVar.f194103Z.postValue(InterfaceC35741a1.a.a(fVar.f194101X, th2, null, null, 6));
                V2.f318762a.j(fVar.f207131E, "ConfirmItemDeletionMutator failed", th2);
                return (d.a) obj2;
            case 5:
                D d12 = (D) obj3;
                d12.f194183A0.postValue(d12.f194198a0.getString(R.string.messenger_voice_message_fail_to_record));
                X2.f318778a.a(d12.f207131E, "StartRecordingMutator failed", th2);
                return (SendMessagePresenter.State) obj2;
            case 6:
                MessageIsReadMarkerWorker.a aVar2 = MessageIsReadMarkerWorker.f194619d;
                V2.f318762a.j("MsgIsReadMarkerWorker", "Failed for " + com.avito.android.messenger.util.i.b((MessengerUserHashInfo) obj3, new Q[0]) + " channelId=" + ((String) obj2), th2);
                return new F.a.b();
            case 7:
                V2.f318762a.a("BaseMviEntityWithReducerQueue", ((C32891b) obj3).f207130c, th2);
                return obj2;
            case 8:
                i.a aVar3 = com.avito.android.push.impl_module.fcm.i.f245950g;
                i.a.a(com.avito.android.push.impl_module.fcm.i.f245950g, AK.c.s(new StringBuilder("["), (String) obj3, "] Old push token deleting error"));
                ((com.avito.android.push.impl_module.fcm.i) obj2).b("token_deleting_error");
                return G0.f406611a;
            default:
                boolean z12 = th2 instanceof com.avito.android.remote.error.n;
                InterfaceC28373a interfaceC28373a2 = ((com.avito.android.user_advert.advert.service.c) obj3).f310624b;
                String str = (String) obj2;
                if (z12) {
                    com.avito.android.remote.error.n nVar = (com.avito.android.remote.error.n) th2;
                    interfaceC28373a2.c(new C41296a(str, Integer.valueOf(nVar.getF318631d().getCode()), nVar.getF318631d().getSimpleMessage()));
                } else {
                    interfaceC28373a2.c(new C41296a(str, null, th2.getMessage()));
                }
                return Boolean.FALSE;
        }
    }
}
