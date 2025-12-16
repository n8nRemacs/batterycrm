package sK;

import JK.j;
import Y61.k;
import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.IacDialer;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider.dialer_mediator.IacOverlayState;
import com.squareup.anvil.annotations.ContributesBinding;
import h31.e;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import org.webrtc.h;
import tK.C48566a;

/* compiled from: IacOverlayDialerMediator.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0005"}, d2 = {"LsK/b;", "LsK/a;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/mediator/b;", "Lkotlin/G0;", "Lcom/avito/android/iac_dialer/impl_module/overlay/lazy_sate_provider/dialer_mediator/IacOverlayState;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class b extends com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b<G0, IacOverlayState, G0> implements InterfaceC48062a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e<IacDialer> f437600c;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C48566a f437602e;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final h f437601d = new h(4);

    /* renamed from: f, reason: collision with root package name */
    @k
    public final h f437603f = new h(5);

    @Inject
    public b(@k e<IacDialer> eVar, @k Context context) {
        this.f437600c = eVar;
        this.f437602e = new C48566a(context.getResources());
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b
    @k
    public final e<IacDialer> b() {
        return this.f437600c;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b
    @k
    public final j<IacEvent, G0> c() {
        return this.f437603f;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b
    public final j<IacState, IacOverlayState> d() {
        return this.f437602e;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.b
    @k
    public final j<G0, IacAction> e() {
        return this.f437601d;
    }
}
