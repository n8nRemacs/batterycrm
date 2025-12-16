package com.avito.android.onboarding.dialog.mvi;

import C40.a;
import Sm0.InterfaceC15202a;
import com.avito.android.arch.mvi.a;
import com.avito.android.onboarding.dialog.mvi.entity.OnboardingDialogInternalAction;
import com.avito.android.onboarding.dialog.mvi.entity.OnboardingDialogState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: OnboardingDialogActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/onboarding/dialog/mvi/h;", "Lcom/avito/android/arch/mvi/a;", "LC40/a;", "Lcom/avito/android/onboarding/dialog/mvi/entity/OnboardingDialogInternalAction;", "Lcom/avito/android/onboarding/dialog/mvi/entity/OnboardingDialogState;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements com.avito.android.arch.mvi.a<C40.a, OnboardingDialogInternalAction, OnboardingDialogState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A40.a f208927a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding.dialog.interactor.a f208928b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding.dialog.interactor.e f208929c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding.dialog.interactor.k f208930d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15202a f208931e;

    @Inject
    public h(@Y61.k A40.a aVar, @Y61.k com.avito.android.onboarding.dialog.interactor.a aVar2, @Y61.k com.avito.android.onboarding.dialog.interactor.e eVar, @Y61.k com.avito.android.onboarding.dialog.interactor.k kVar, @Y61.k InterfaceC15202a interfaceC15202a) {
        this.f208927a = aVar;
        this.f208928b = aVar2;
        this.f208929c = eVar;
        this.f208930d = kVar;
        this.f208931e = interfaceC15202a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<OnboardingDialogInternalAction> b(C40.a aVar, OnboardingDialogState onboardingDialogState) {
        C40.a aVar2 = aVar;
        OnboardingDialogState onboardingDialogState2 = onboardingDialogState;
        if (aVar2 instanceof a.d) {
            return C43175k.G(new a(this, null));
        }
        if (aVar2 instanceof a.g) {
            return C43175k.G(new b(2, null));
        }
        if (aVar2 instanceof a.C0088a) {
            return C43175k.G(new c(aVar2, this, null));
        }
        if (aVar2 instanceof a.b) {
            return C43175k.G(new d(aVar2, this, null));
        }
        if (aVar2 instanceof a.e) {
            return C43175k.G(new e(aVar2, this, null));
        }
        if (aVar2 instanceof a.f) {
            return C43175k.G(new f(aVar2, this, onboardingDialogState2, null));
        }
        if (aVar2 instanceof a.c) {
            return C43175k.G(new g(aVar2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
