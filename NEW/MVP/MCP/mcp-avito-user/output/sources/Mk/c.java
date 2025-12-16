package mK;

import JK.j;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.IacDialer;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.squareup.anvil.annotations.ContributesBinding;
import com.yandex.div2.D8;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import nK.C44285a;

/* compiled from: IacCallLauncherDialerMediator.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0002¨\u0006\u0005"}, d2 = {"LmK/c;", "LmK/a;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/mediator/b;", "LmK/b;", "Lkotlin/G0;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class c extends com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b<b, G0, G0> implements InterfaceC43975a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h31.e<IacDialer> f414470c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C44285a f414471d = C44285a.f415087b;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final D8 f414472e = new D8(18);

    /* renamed from: f, reason: collision with root package name */
    @k
    public final D8 f414473f = new D8(19);

    @Inject
    public c(@k h31.e<IacDialer> eVar) {
        this.f414470c = eVar;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b
    @k
    public final h31.e<IacDialer> b() {
        return this.f414470c;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b
    @k
    public final j<IacEvent, G0> c() {
        return this.f414473f;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b
    @k
    public final j<IacState, G0> d() {
        return this.f414472e;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b
    public final j<b, IacAction> e() {
        return this.f414471d;
    }
}
