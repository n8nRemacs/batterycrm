package com.avito.android.verification.verification_disclaimer.mvi;

import NM0.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.verification.verification_disclaimer.mvi.entity.DisclaimerInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: DisclaimerActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/verification/verification_disclaimer/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LNM0/a;", "Lcom/avito/android/verification/verification_disclaimer/mvi/entity/DisclaimerInternalAction;", "LNM0/c;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.arch.mvi.a<NM0.a, DisclaimerInternalAction, NM0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f325084a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.verification.verification_disclaimer.g f325085b;

    @Inject
    public b(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.verification.verification_disclaimer.g gVar) {
        this.f325084a = aVar;
        this.f325085b = gVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<DisclaimerInternalAction> b(NM0.a aVar, NM0.c cVar) {
        NM0.a aVar2 = aVar;
        if (aVar2 instanceof a.C0730a) {
            return C43175k.G(new a(this, aVar2, null));
        }
        if (aVar2.equals(a.b.f11387a)) {
            return this.f325085b.a();
        }
        throw new NoWhenBranchMatchedException();
    }
}
