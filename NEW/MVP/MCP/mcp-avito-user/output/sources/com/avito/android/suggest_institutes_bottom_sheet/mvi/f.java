package com.avito.android.suggest_institutes_bottom_sheet.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.suggest_institutes_bottom_sheet.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SuggestInstitutesActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/a;", "Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/m;", "Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/s;", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements com.avito.android.arch.mvi.a<a, m, s> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.suggest_institutes_bottom_sheet.domain.a f292052a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f292053b;

    @Inject
    public f(@Y61.k com.avito.android.suggest_institutes_bottom_sheet.domain.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f292052a = aVar;
        this.f292053b = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<m> b(a aVar, s sVar) {
        InterfaceC43160i<m> bVar;
        a aVar2 = aVar;
        s sVar2 = sVar;
        boolean z12 = aVar2 instanceof a.C8852a;
        com.avito.android.suggest_institutes_bottom_sheet.domain.a aVar3 = this.f292052a;
        if (z12) {
            String str = ((a.C8852a) aVar2).f292029a;
            if (!C43066x.K(str) && str.length() < 2) {
                return C43175k.w();
            }
            bVar = C43066x.K(str) ? new c(aVar3.a()) : new d(aVar3.b(str));
        } else {
            if (aVar2 instanceof a.c) {
                return C43175k.G(new e(sVar2, (a.c) aVar2, this, null));
            }
            if (!(aVar2 instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new b(aVar3.a());
        }
        return bVar;
    }
}
