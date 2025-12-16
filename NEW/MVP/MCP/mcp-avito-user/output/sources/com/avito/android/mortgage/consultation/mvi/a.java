package com.avito.android.mortgage.consultation.mvi;

import XZ.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.mortgage.consultation.mvi.entity.MortgageConsultationInternalAction;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MortgageConsultationActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/consultation/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LXZ/a;", "Lcom/avito/android/mortgage/consultation/mvi/entity/MortgageConsultationInternalAction;", "LXZ/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<XZ.a, MortgageConsultationInternalAction, XZ.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.consultation.domain.c f198594a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.consultation.domain.a f198595b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final UZ.a f198596c;

    @Inject
    public a(@Y61.k com.avito.android.mortgage.consultation.domain.c cVar, @Y61.k com.avito.android.mortgage.consultation.domain.a aVar, @Y61.k UZ.a aVar2) {
        this.f198594a = cVar;
        this.f198595b = aVar;
        this.f198596c = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<MortgageConsultationInternalAction> b(XZ.a aVar, XZ.d dVar) {
        XZ.a aVar2 = aVar;
        XZ.d dVar2 = dVar;
        if (aVar2 instanceof a.d) {
            return this.f198594a.a();
        }
        if (aVar2 instanceof a.C1336a) {
            WZ.a aVar3 = dVar2.f18924m;
            String str = null;
            String str2 = aVar3 != null ? aVar3.f17941c : null;
            if (str2 == null) {
                str2 = "";
            }
            if (aVar3 != null) {
                for (WZ.b bVar : aVar3.f17942d) {
                    if (bVar.f17946d) {
                        str = bVar.f17945c;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            String str3 = str == null ? "" : str;
            this.f198596c.b(dVar2.f18913b, dVar2.f18923l, dVar2.f18921j, str2, str3);
            return this.f198595b.a(dVar2.f18913b, dVar2.f18922k, dVar2.f18914c, dVar2.f18916e, str2, str3);
        }
        if (aVar2 instanceof a.b) {
            return new C43210w(new MortgageConsultationInternalAction.FullNameUpdated(((a.b) aVar2).f18905a));
        }
        if (aVar2 instanceof a.c) {
            return new C43210w(new MortgageConsultationInternalAction.PhoneUpdated(((a.c) aVar2).f18906a));
        }
        boolean z12 = aVar2 instanceof a.e;
        String str4 = dVar2.f18921j;
        UZ.a aVar4 = this.f198596c;
        int i12 = dVar2.f18923l;
        String str5 = dVar2.f18913b;
        if (z12) {
            String str6 = ((a.e) aVar2).f18908a;
            aVar4.a(i12, str5, str4, str6);
            return new C43210w(new MortgageConsultationInternalAction.UpdateDaySlot(str6));
        }
        if (!(aVar2 instanceof a.f)) {
            throw new NoWhenBranchMatchedException();
        }
        String str7 = ((a.f) aVar2).f18909a;
        aVar4.d(i12, str5, str4, str7);
        return new C43210w(new MortgageConsultationInternalAction.UpdateTimeSlot(str7));
    }
}
