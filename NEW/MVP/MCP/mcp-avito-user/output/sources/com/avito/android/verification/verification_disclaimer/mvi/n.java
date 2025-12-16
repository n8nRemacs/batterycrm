package com.avito.android.verification.verification_disclaimer.mvi;

import CM0.i;
import NM0.c;
import com.avito.android.arch.mvi.u;
import com.avito.android.verification.verification_disclaimer.mvi.entity.DisclaimerInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DisclaimerReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/verification_disclaimer/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction;", "LNM0/c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n implements u<DisclaimerInternalAction, NM0.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.verification_disclaimer.a f325122b;

    @Inject
    public n(@Y61.k com.avito.android.verification.verification_disclaimer.a aVar) {
        this.f325122b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final NM0.c a(DisclaimerInternalAction disclaimerInternalAction, NM0.c cVar) {
        DisclaimerInternalAction disclaimerInternalAction2 = disclaimerInternalAction;
        NM0.c cVar2 = cVar;
        if (disclaimerInternalAction2 instanceof DisclaimerInternalAction.Loading) {
            return c.C0731c.f11392b;
        }
        if (disclaimerInternalAction2 instanceof DisclaimerInternalAction.Loaded) {
            try {
                com.avito.android.verification.verification_disclaimer.a aVar = this.f325122b;
                i.a aVar2 = ((DisclaimerInternalAction.Loaded) disclaimerInternalAction2).f325100b;
                aVar.getClass();
                return new c.b(com.avito.android.verification.verification_disclaimer.a.a(aVar2));
            } catch (Throwable unused) {
                return new c.a(null, null, 3, null);
            }
        }
        if (disclaimerInternalAction2 instanceof DisclaimerInternalAction.Error) {
            return new c.a(null, null, 3, null);
        }
        if (disclaimerInternalAction2 instanceof DisclaimerInternalAction.ErrorDetails) {
            i.b bVar = ((DisclaimerInternalAction.ErrorDetails) disclaimerInternalAction2).f325099b;
            return new c.a(bVar.getPopupProps(), bVar.getErrorId());
        }
        if (disclaimerInternalAction2 instanceof DisclaimerInternalAction.ShowToast) {
            return cVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
