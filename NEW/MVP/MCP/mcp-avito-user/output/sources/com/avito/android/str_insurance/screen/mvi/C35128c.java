package com.avito.android.str_insurance.screen.mvi;

import com.avito.android.str_insurance.InsuranceData;
import com.avito.android.str_insurance.screen.mvi.entity.StrInsuranceInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StrInsuranceBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_insurance/screen/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/str_insurance/screen/mvi/entity/StrInsuranceInternalAction;", "_avito_str-insurance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.str_insurance.screen.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35128c implements com.avito.android.arch.mvi.b<StrInsuranceInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InsuranceData f288730a;

    @Inject
    public C35128c(@Y61.k InsuranceData insuranceData) {
        this.f288730a = insuranceData;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<StrInsuranceInternalAction> a() {
        return new C43210w(new StrInsuranceInternalAction.ShowContent(this.f288730a));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
