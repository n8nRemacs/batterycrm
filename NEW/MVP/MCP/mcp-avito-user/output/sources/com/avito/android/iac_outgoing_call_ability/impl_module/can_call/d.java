package com.avito.android.iac_outgoing_call_ability.impl_module.can_call;

import com.avito.android.iac_dialer_models.abstract_module.IacCallInfo;
import com.avito.android.iac_dialer_models.abstract_module.IacCanCallResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l41.o;

/* compiled from: IacCanCallInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallResult;", "canCallResult", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class d<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final d<T, R> f168537b = new d<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        IacCanCallResult iacCanCallResult = (IacCanCallResult) obj;
        if (iacCanCallResult instanceof IacCanCallResult.Can) {
            IacCanCallResult.Can can = (IacCanCallResult.Can) iacCanCallResult;
            return IacCanCallResult.Can.copy$default(can, IacCallInfo.a(can.getCallInfo(), null, false, null, null, null, 8187), null, 2, null);
        }
        if (iacCanCallResult instanceof IacCanCallResult.CanNot) {
            return iacCanCallResult;
        }
        throw new NoWhenBranchMatchedException();
    }
}
