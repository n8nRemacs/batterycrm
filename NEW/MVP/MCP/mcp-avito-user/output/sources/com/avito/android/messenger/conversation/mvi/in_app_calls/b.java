package com.avito.android.messenger.conversation.mvi.in_app_calls;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_iac_dialer.IacMakeRecallLink;
import com.avito.android.messenger.conversation.mvi.in_app_calls.ChannelIacInteractor;
import com.avito.android.messenger.conversation.mvi.in_app_calls.a;
import com.avito.android.messenger.conversation.mvi.in_app_calls.a.f;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.concurrent.Callable;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class b implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f191381b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f191382c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f191383d;

    public /* synthetic */ b(Object obj, a aVar, int i12) {
        this.f191381b = i12;
        this.f191383d = obj;
        this.f191382c = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f191381b) {
            case 0:
                ChannelIacInteractor.State state = (ChannelIacInteractor.State) this.f191383d;
                ChannelIacInteractor.State.Content content = state instanceof ChannelIacInteractor.State.Content ? (ChannelIacInteractor.State.Content) state : null;
                if (content != null) {
                    a aVar = this.f191382c;
                    aVar.f191357b0.b(A1.f(aVar.f191352W.a(content.f191345f), c.f191384l, null, 2));
                }
                break;
            default:
                DeepLink deepLink = ((a.i) this.f191383d).f191379d;
                boolean z12 = deepLink instanceof IacMakeRecallLink;
                a aVar2 = this.f191382c;
                if (!z12) {
                    V2.f318762a.d(aVar2.f207131E, "IacMakeRecallLink expected deeplink=" + deepLink);
                    break;
                } else if (aVar2.f191355Z.a() != null) {
                    aVar2.le().s(aVar2.new f("deeplink_call_back", false, null, null, (IacMakeRecallLink) deepLink));
                    break;
                } else {
                    aVar2.f191354Y.c(new NonFatalErrorEvent("Can't create outgoing call cause current userId is null", new IacChannelEmptyUserIdException(), null, NonFatalErrorEvent.a.c.f147934a, 4, null));
                    break;
                }
        }
        return G0.f406611a;
    }
}
