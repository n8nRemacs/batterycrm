package wK;

import JK.j;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.incoming.init.OnCallDeliveredByPushAction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import vK.InterfaceC49224b;

/* compiled from: IacPushHandlerDialerMediatorAction_To_IacAction_Mapper.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LwK/a;", "LJK/j;", "LvK/b;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wK.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49525a implements j<InterfaceC49224b, IacAction> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C49525a f441375b = new C49525a();

    @Override // JK.j
    public final IacAction b(InterfaceC49224b interfaceC49224b) {
        InterfaceC49224b interfaceC49224b2 = interfaceC49224b;
        if (interfaceC49224b2 instanceof InterfaceC49224b.a) {
            return new OnCallDeliveredByPushAction(((InterfaceC49224b.a) interfaceC49224b2).f440681a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
