package Cq0;

import Jd0.C14188a;
import Jf0.InterfaceC14192a;
import com.avito.android.C32949p0;
import com.avito.android.advert.C28234n;
import com.avito.android.app.task.PublishDraftsSyncTask;
import com.avito.android.brandspace.interactor.e;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.remote.notification.S;
import com.avito.android.util.Y5;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.maybe.C41928w;
import kotlin.collections.P0;
import l41.s;
import vq0.C49369b;

/* compiled from: R8$$SyntheticClass */
/* renamed from: Cq0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C13343b implements s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2714b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2715c;

    public /* synthetic */ C13343b(Object obj, int i12) {
        this.f2714b = i12;
        this.f2715c = obj;
    }

    @Override // l41.s
    public final Object get() {
        Object obj = this.f2715c;
        switch (this.f2714b) {
            case 0:
                return ((C13344c) obj).f2716a.get().e("list");
            case 1:
                return ((C32949p0) obj).f210564a.get().h();
            case 2:
                C28234n c28234n = (C28234n) obj;
                return c28234n.f80789b.get().d(c28234n.f80788a);
            case 3:
                return ((PublishDraftsSyncTask) obj).draftSyncDelegate.a();
            case 4:
                int i12 = com.avito.android.async_phone.impl_module.phone_request_interactor.a.f92130h;
                return (z) obj;
            case 5:
                e eVar = (e) obj;
                return eVar.f107753d.get().a("contract=Avito; platform=Android; version=26.0", ZS.d.a(eVar.f107755f), eVar.f107750a, eVar.f107751b, eVar.f107752c);
            case 6:
                return ((ZC.c) ((h31.e) obj).get()).g(null, P0.c(), P0.c(), null, null);
            case 7:
                return SendMessagePresenter.State.a((SendMessagePresenter.State) obj, null, null, null, null, null, false, false, false, false, false, false, false, false, false, null, null, false, null, false, null, null, null, null, null, null, null, null, null, SendMessagePresenter.VoiceRecorderState.Empty.f194447b, false, null, null, 1744830463, 7);
            case 8:
                com.avito.android.publish.category_edit.b bVar = (com.avito.android.publish.category_edit.b) obj;
                C14188a c14188a = bVar.f232340a;
                com.avito.android.publish.category_edit.di.c cVar = com.avito.android.publish.category_edit.di.c.f232350a;
                return ((InterfaceC14192a) c14188a.f9070b).a(bVar.f232341b, bVar.f232343d.convertToFieldMap(bVar.f232342c), P0.c(), bVar.f232344e.b());
            case 9:
                com.avito.android.publish.draft_onboarding.c cVar2 = (com.avito.android.publish.draft_onboarding.c) obj;
                boolean zA2 = cVar2.f235304a.a();
                com.avito.android.publish.draft_onboarding.e eVar2 = cVar2.f235306c;
                return !zA2 ? q.i(new ru.avito.component.toolbar.d(eVar2.getF235310a(), eVar2.getF235311b())) : C41928w.f403335b;
            case 10:
                return Y5.a(((S) obj).f253982d.get().f());
            case 11:
                return ((com.avito.android.search.subscriptions.sync.b) obj).f264008a.get().h(null);
            default:
                return ((C49369b) obj).f440998a.get().e("widget");
        }
    }
}
