package Vf;

import Y61.k;
import com.avito.android.autoteka.items.waitingForPaymentResponseItem.WaitingForPaymentResponseItem;
import com.avito.android.autoteka.presentation.waitingForPayment.mvi.entity.AutotekaWaitingForPaymentInternalAction;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AutotekaWaitingForPaymentResultMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVf/a;", "", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C15672a {
    @k
    public static AutotekaWaitingForPaymentInternalAction a(@k TypedResult typedResult) {
        if (typedResult instanceof TypedResult.Success) {
            return new AutotekaWaitingForPaymentInternalAction.Response((WaitingForPaymentResponseItem) ((TypedResult.Success) typedResult).getResult());
        }
        if (typedResult instanceof TypedResult.Error) {
            return new AutotekaWaitingForPaymentInternalAction.Error(((TypedResult.Error) typedResult).getError());
        }
        throw new NoWhenBranchMatchedException();
    }
}
