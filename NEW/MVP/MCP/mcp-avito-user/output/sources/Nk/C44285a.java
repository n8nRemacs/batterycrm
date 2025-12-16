package nK;

import JK.j;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.outgoing.init.OnNewCallInputAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.recall.OnRecallFromSystemApiInputAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.input.CallInput;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import mK.b;

/* compiled from: IacCallLauncherDialerMediatorAction_To_IacAction_Mapper.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LnK/a;", "LJK/j;", "LmK/b;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nK.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C44285a implements j<b, IacAction> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C44285a f415087b = new C44285a();

    @Override // JK.j
    public final IacAction b(b bVar) {
        b bVar2 = bVar;
        if (bVar2 instanceof b.a) {
            b.a aVar = (b.a) bVar2;
            return new OnNewCallInputAction(new CallInput.NewCall(aVar.f414458a, aVar.f414461d, aVar.f414462e, aVar.f414460c, aVar.f414459b, aVar.f414463f, aVar.f414464g, aVar.f414465h));
        }
        if (!(bVar2 instanceof b.C11825b)) {
            throw new NoWhenBranchMatchedException();
        }
        b.C11825b c11825b = (b.C11825b) bVar2;
        return new OnRecallFromSystemApiInputAction(new CallInput.RecallFromSystemApi(c11825b.f414466a, c11825b.f414467b, c11825b.f414469d, c11825b.f414468c));
    }
}
