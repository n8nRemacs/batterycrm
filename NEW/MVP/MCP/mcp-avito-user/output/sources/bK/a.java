package BK;

import AK.b;
import JK.j;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.media_service.OnMediaServiceDestroyedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.media_service.OnMediaServiceStartedAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.init.media_service.OnMediaServiceStartingErrorAction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: IacMediaServiceDialerMediatorAction_To_IacAction_Mapper.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LBK/a;", "LJK/j;", "LAK/b;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements j<b, IacAction> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f1348b = new a();

    @Override // JK.j
    public final IacAction b(b bVar) {
        b bVar2 = bVar;
        if (bVar2 instanceof b.c) {
            b.c cVar = (b.c) bVar2;
            return new OnMediaServiceStartedAction(cVar.f287a, cVar.f288b);
        }
        if (bVar2 instanceof b.C0016b) {
            return new OnMediaServiceDestroyedAction(((b.C0016b) bVar2).f286a);
        }
        if (bVar2 instanceof b.a) {
            return new OnMediaServiceStartingErrorAction(((b.a) bVar2).f285a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
