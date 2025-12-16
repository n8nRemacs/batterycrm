package com.avito.android.suggest_institutes_bottom_sheet.mvi;

import com.avito.android.suggest_institutes_bottom_sheet.SelectedSuggestInstitute;
import com.avito.android.suggest_institutes_bottom_sheet.mvi.m;
import com.avito.android.suggest_institutes_bottom_sheet.mvi.n;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SuggestInstitutesOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/o;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/m;", "Lcom/avito/android/suggest_institutes_bottom_sheet/mvi/n;", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o implements com.avito.android.arch.mvi.t<m, n> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SelectedSuggestInstitute f292074b;

    @Inject
    public o(@Y61.k SelectedSuggestInstitute selectedSuggestInstitute) {
        this.f292074b = selectedSuggestInstitute;
    }

    @Override // com.avito.android.arch.mvi.t
    public final n b(m mVar) {
        m mVar2 = mVar;
        if (!(mVar2 instanceof m.a)) {
            return null;
        }
        return new n.a(new SelectedSuggestInstitute(this.f292074b.f291979b, ((m.a) mVar2).f292071a.f429646b));
    }
}
