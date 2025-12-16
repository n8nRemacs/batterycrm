package com.avito.android.iac_outgoing_call_ability.impl_module.can_call;

import com.avito.android.iac_dialer_models.abstract_module.IacCallContext;
import com.avito.android.iac_outgoing_call_ability.impl_module.api.remote.CanCallResult;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import nJ.C44281p;

/* compiled from: IacCanCallInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/iac_outgoing_call_ability/impl_module/api/remote/CanCallResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class a<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IacCanCallInteractorImpl f168528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f168529c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IacCallContext f168530d;

    public a(IacCanCallInteractorImpl iacCanCallInteractorImpl, String str, IacCallContext iacCallContext) {
        this.f168528b = iacCanCallInteractorImpl;
        this.f168529c = str;
        this.f168530d = iacCallContext;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        CanCallResult canCallResult;
        TypedResult typedResult = (TypedResult) obj;
        IacCallContext iacCallContext = this.f168530d;
        String str = iacCallContext.f166826d.f166858b;
        int i12 = IacCanCallInteractorImpl.f168511m;
        IacCanCallInteractorImpl iacCanCallInteractorImpl = this.f168528b;
        iacCanCallInteractorImpl.getClass();
        TypedResult.Success success = typedResult instanceof TypedResult.Success ? (TypedResult.Success) typedResult : null;
        if (success == null || (canCallResult = (CanCallResult) success.getResult()) == null) {
            return;
        }
        iacCanCallInteractorImpl.f168519h.c(new C44281p(this.f168529c, iacCallContext.f166824b, str, canCallResult.getCallAvailable(), canCallResult.getAnalyticsInfo(), canCallResult.getCannotCallReason()));
    }
}
