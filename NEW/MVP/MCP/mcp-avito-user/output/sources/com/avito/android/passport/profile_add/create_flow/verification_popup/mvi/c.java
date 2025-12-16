package com.avito.android.passport.profile_add.create_flow.verification_popup.mvi;

import W50.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.passport.profile_add.analytics.AnalyticScreen;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import com.avito.android.passport.profile_add.create_flow.verification_popup.VerificationPopupArguments;
import com.avito.android.passport.profile_add.create_flow.verification_popup.mvi.entity.VerificationPopupInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: VerificationPopupActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/verification_popup/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LW50/a;", "Lcom/avito/android/passport/profile_add/create_flow/verification_popup/mvi/entity/VerificationPopupInternalAction;", "LW50/c;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements com.avito.android.arch.mvi.a<W50.a, VerificationPopupInternalAction, W50.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final M50.a f212267a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final VerificationPopupArguments f212268b;

    @Inject
    public c(@Y61.k M50.a aVar, @Y61.k VerificationPopupArguments verificationPopupArguments) {
        this.f212267a = aVar;
        this.f212268b = verificationPopupArguments;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<VerificationPopupInternalAction> b(W50.a aVar, W50.c cVar) {
        W50.a aVar2 = aVar;
        if (aVar2 instanceof a.C1250a) {
            return new C43210w(new VerificationPopupInternalAction.Navigate(Navigation.Back.f211366b));
        }
        boolean z12 = aVar2 instanceof a.b;
        VerificationPopupArguments verificationPopupArguments = this.f212268b;
        if (z12) {
            this.f212267a.d(verificationPopupArguments.f212205g, verificationPopupArguments.f212203e, AnalyticScreen.f211215h);
            return new C43210w(new VerificationPopupInternalAction.Navigate(new Navigation.Close(false, null, 3, null)));
        }
        if (aVar2 instanceof a.e) {
            Integer numValueOf = Integer.valueOf(verificationPopupArguments.f212200b);
            AnalyticScreen analyticScreen = AnalyticScreen.f211215h;
            this.f212267a.a(numValueOf, verificationPopupArguments.f212201c, verificationPopupArguments.f212205g, verificationPopupArguments.f212203e, analyticScreen);
            return C43175k.w();
        }
        if (aVar2 instanceof a.c) {
            return C43175k.G(new b(this, null));
        }
        if (!(aVar2 instanceof a.d)) {
            throw new NoWhenBranchMatchedException();
        }
        a.d dVar = (a.d) aVar2;
        return C43175k.G(new a(dVar.f17741a, dVar.f17742b, this, null));
    }
}
