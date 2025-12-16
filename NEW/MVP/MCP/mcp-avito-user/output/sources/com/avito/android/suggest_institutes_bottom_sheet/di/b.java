package com.avito.android.suggest_institutes_bottom_sheet.di;

import com.avito.android.di.B;
import com.avito.android.suggest_institutes_bottom_sheet.SelectedSuggestInstitute;
import com.avito.android.suggest_institutes_bottom_sheet.ui.SuggestInstitutesDialogFragment;
import h31.d;
import javax.inject.Named;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SuggestInstitutesComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/di/b;", "", "a", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: SuggestInstitutesComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/di/b$a;", "", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        b a(@Y61.k d dVar, @h31.b @Named("LIMIT") long j12, @h31.b @Y61.k Y41.l<? super Integer, G0> lVar, @h31.b @Y61.k SelectedSuggestInstitute selectedSuggestInstitute);
    }

    void a(@Y61.k SuggestInstitutesDialogFragment suggestInstitutesDialogFragment);
}
