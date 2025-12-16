package xK;

import JK.j;
import Y61.k;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.IacDialer;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.screens.call_screen.dialer_mediator.IacCallScreenDialerMediatorState;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import yK.C50122a;
import yK.C50123b;
import yK.C50124c;

/* compiled from: IacCallScreenDialerMediator.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¨\u0006\u0006"}, d2 = {"LxK/d;", "LxK/a;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/mediator/b;", "LxK/b;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/dialer_mediator/IacCallScreenDialerMediatorState;", "LxK/c;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* renamed from: xK.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49854d extends com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b<InterfaceC49852b, IacCallScreenDialerMediatorState, InterfaceC49853c> implements InterfaceC49851a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h31.e<IacDialer> f442396c;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C50124c f442398e;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C50122a f442397d = C50122a.f443027b;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C50123b f442399f = C50123b.f443029b;

    @Inject
    public C49854d(@k h31.e<IacDialer> eVar, @k nt.f fVar, @k Context context) {
        this.f442396c = eVar;
        this.f442398e = new C50124c(context.getResources(), fVar);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b
    @k
    public final h31.e<IacDialer> b() {
        return this.f442396c;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b
    public final j<IacEvent, InterfaceC49853c> c() {
        return this.f442399f;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b
    public final j<IacState, IacCallScreenDialerMediatorState> d() {
        return this.f442398e;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b
    public final j<InterfaceC49852b, IacAction> e() {
        return this.f442397d;
    }
}
