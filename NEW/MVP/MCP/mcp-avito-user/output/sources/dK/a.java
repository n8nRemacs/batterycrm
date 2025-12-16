package DK;

import CK.b;
import JK.j;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.socket.OnSocketMessageAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.incoming.init.OnCallDeliveredBySocketAction;
import com.avito.android.iac_dialer.impl_module.socket_subscription.app_startup_task.CallDeliveredBySocketMessage;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: IacSocketSubscriptionDialerMediatorAction_To_IacAction_Mapper.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LDK/a;", "LJK/j;", "LCK/b;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements j<b, IacAction> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f3156b = new a();

    @Override // JK.j
    public final IacAction b(b bVar) {
        b bVar2 = bVar;
        if (bVar2 instanceof b.a) {
            CallDeliveredBySocketMessage callDeliveredBySocketMessage = ((b.a) bVar2).f2081a;
            return new OnCallDeliveredBySocketAction(callDeliveredBySocketMessage.getCallId(), callDeliveredBySocketMessage.isVideo(), callDeliveredBySocketMessage.getTags(), callDeliveredBySocketMessage.getJson());
        }
        if (bVar2 instanceof b.C0102b) {
            return new OnSocketMessageAction(((b.C0102b) bVar2).f2082a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
