package com.avito.android.mortgage.person_form.mvi.domain;

import JZ.u;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlinx.coroutines.AbstractC43075a;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: MortgageFormPollingInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/domain/g;", "Lcom/avito/android/mortgage/person_form/mvi/domain/e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f201064a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f201065b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e2 f201066c = f2.b(0, 0, null, 7);

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public A1.a f201067d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public N0 f201068e;

    @Inject
    public g(@Y61.k R0 r02, @Y61.k a aVar) {
        this.f201064a = r02;
        this.f201065b = aVar;
    }

    @Override // com.avito.android.mortgage.person_form.mvi.domain.e
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final e2 getF201066c() {
        return this.f201066c;
    }

    @Override // com.avito.android.mortgage.person_form.mvi.domain.e
    public final void b(@Y61.k A1.a aVar) {
        this.f201067d = aVar;
    }

    @Override // com.avito.android.mortgage.person_form.mvi.domain.e
    public final void c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k PersonFormInternalAction personFormInternalAction) {
        if (personFormInternalAction instanceof PersonFormInternalAction.UpdateVerificationBanner) {
            u uVar = ((PersonFormInternalAction.UpdateVerificationBanner) personFormInternalAction).f201217b;
            d(str, str2, str3, uVar != null ? uVar.getStatus() : null);
            return;
        }
        if (personFormInternalAction instanceof PersonFormInternalAction.UpdateContent) {
            u verificationBanner = ((PersonFormInternalAction.UpdateContent) personFormInternalAction).f201211b.getVerificationBanner();
            d(str, str2, str3, verificationBanner != null ? verificationBanner.getStatus() : null);
        } else if (personFormInternalAction instanceof PersonFormInternalAction.LoadingCompleted) {
            u verificationBanner2 = ((PersonFormInternalAction.LoadingCompleted) personFormInternalAction).f201191b.getVerificationBanner();
            d(str, str2, str3, verificationBanner2 != null ? verificationBanner2.getStatus() : null);
        } else if (personFormInternalAction instanceof PersonFormInternalAction.ReloadingCompleted) {
            u verificationBanner3 = ((PersonFormInternalAction.ReloadingCompleted) personFormInternalAction).f201203b.getVerificationBanner();
            d(str, str2, str3, verificationBanner3 != null ? verificationBanner3.getStatus() : null);
        }
    }

    public final void d(String str, String str2, String str3, String str4) {
        if (!C42745f0.r(i.f201071a, str4)) {
            N0 n02 = this.f201068e;
            if (n02 != null) {
                ((V0) n02).c(null);
                return;
            }
            return;
        }
        N0 n03 = this.f201068e;
        if (n03 == null || !((AbstractC43075a) n03).isActive()) {
            N0 n04 = this.f201068e;
            if (n04 != null) {
                ((V0) n04).c(null);
            }
            A1.a aVar = this.f201067d;
            this.f201068e = aVar != null ? C43259k.d(aVar, this.f201064a.a(), null, new f(this, str, str2, str3, null), 2) : null;
        }
    }
}
