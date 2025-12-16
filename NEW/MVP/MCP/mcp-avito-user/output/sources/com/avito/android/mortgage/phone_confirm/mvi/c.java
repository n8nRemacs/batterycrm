package com.avito.android.mortgage.phone_confirm.mvi;

import J00.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.mortgage.phone_confirm.mvi.entity.PhoneConfirmInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PhoneConfirmActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/phone_confirm/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LJ00/a;", "Lcom/avito/android/mortgage/phone_confirm/mvi/entity/PhoneConfirmInternalAction;", "LJ00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements com.avito.android.arch.mvi.a<J00.a, PhoneConfirmInternalAction, J00.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.domain.check_access.b f201608a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.phone_confirm.mvi.domain.a f201609b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.phone_confirm.mvi.domain.d f201610c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f201611d;

    @Inject
    public c(@Y61.k com.avito.android.mortgage.domain.check_access.b bVar, @Y61.k com.avito.android.mortgage.phone_confirm.mvi.domain.a aVar, @Y61.k com.avito.android.mortgage.phone_confirm.mvi.domain.d dVar, @Y61.k R0 r02) {
        this.f201608a = bVar;
        this.f201609b = aVar;
        this.f201610c = dVar;
        this.f201611d = r02;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PhoneConfirmInternalAction> b(J00.a aVar, J00.c cVar) {
        J00.a aVar2 = aVar;
        J00.c cVar2 = cVar;
        if (aVar2 instanceof a.b) {
            return C43175k.I(this.f201611d.a(), C43175k.G(new b(this, cVar2, null)));
        }
        if (aVar2 instanceof a.C0500a) {
            return C43175k.G(new a(((a.C0500a) aVar2).f8695a, cVar2, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
