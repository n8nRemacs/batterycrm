package com.avito.android.str_insurance.screen.mvi;

import Xy0.AbstractC17061a;
import Zy0.InterfaceC19623b;
import com.avito.android.remote.error.ApiError;
import com.avito.android.str_insurance.screen.mvi.entity.StrInsuranceInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StrInsuranceOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_insurance/screen/mvi/t;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction;", "LZy0/b;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class t implements com.avito.android.arch.mvi.t<StrInsuranceInternalAction, InterfaceC19623b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x f288784b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AbstractC17061a f288785c;

    @Inject
    public t(@Y61.k x xVar, @Y61.k AbstractC17061a abstractC17061a) {
        this.f288784b = xVar;
        this.f288785c = abstractC17061a;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC19623b b(StrInsuranceInternalAction strInsuranceInternalAction) {
        StrInsuranceInternalAction strInsuranceInternalAction2 = strInsuranceInternalAction;
        if (strInsuranceInternalAction2 instanceof StrInsuranceInternalAction.OpenDeeplink) {
            return new InterfaceC19623b.c(((StrInsuranceInternalAction.OpenDeeplink) strInsuranceInternalAction2).f288734b);
        }
        if (strInsuranceInternalAction2 instanceof StrInsuranceInternalAction.OpenFlatFormScreen) {
            return InterfaceC19623b.d.f20603a;
        }
        if (strInsuranceInternalAction2 instanceof StrInsuranceInternalAction.OpenConfirmationScreen) {
            return InterfaceC19623b.C1474b.f20601a;
        }
        if (strInsuranceInternalAction2 instanceof StrInsuranceInternalAction.CloseScreen) {
            return new InterfaceC19623b.a(this.f288785c instanceof AbstractC17061a.b ? -1 : 0);
        }
        if (!(strInsuranceInternalAction2 instanceof StrInsuranceInternalAction.ShowFlatFormError)) {
            return null;
        }
        ApiError apiError = ((StrInsuranceInternalAction.ShowFlatFormError) strInsuranceInternalAction2).f288737b;
        return new InterfaceC19623b.e(apiError, apiError instanceof ApiError.NetworkIOError ? ((ApiError.NetworkIOError) apiError).getMessage() : this.f288784b.getF288790a());
    }
}
