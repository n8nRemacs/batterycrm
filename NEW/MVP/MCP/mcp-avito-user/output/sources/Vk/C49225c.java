package vK;

import JK.j;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.IacDialer;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import org.webrtc.h;
import wK.C49525a;

/* compiled from: IacPushHandlerDialerMediator.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0005"}, d2 = {"LvK/c;", "LvK/a;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/mediator/b;", "LvK/b;", "Lkotlin/G0;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* renamed from: vK.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49225c extends com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b<InterfaceC49224b, G0, G0> implements InterfaceC49223a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h31.e<IacDialer> f440682c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C49525a f440683d = C49525a.f441375b;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final h f440684e = new h(9);

    /* renamed from: f, reason: collision with root package name */
    @k
    public final h f440685f = new h(10);

    @Inject
    public C49225c(@k h31.e<IacDialer> eVar) {
        this.f440682c = eVar;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b
    @k
    public final h31.e<IacDialer> b() {
        return this.f440682c;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b
    @k
    public final j<IacEvent, G0> c() {
        return this.f440685f;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b
    @k
    public final j<IacState, G0> d() {
        return this.f440684e;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b
    public final j<InterfaceC49224b, IacAction> e() {
        return this.f440683d;
    }
}
