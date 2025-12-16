package com.avito.android.suggest_institutes_bottom_sheet;

import Y61.k;
import com.avito.android.suggest_institutes_bottom_sheet.ui.SuggestInstitutesDialogFragment;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SuggestInstitutesDialogFragmentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/suggest_institutes_bottom_sheet/b;", "Lcom/avito/android/suggest_institutes_bottom_sheet/a;", "<init>", "()V", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.suggest_institutes_bottom_sheet.a
    @k
    public final SuggestInstitutesDialogFragment a(@k SuggestInstituteArguments suggestInstituteArguments) {
        SuggestInstitutesDialogFragment.f292079m0.getClass();
        SuggestInstitutesDialogFragment suggestInstitutesDialogFragment = new SuggestInstitutesDialogFragment();
        suggestInstitutesDialogFragment.f292085l0.setValue(suggestInstitutesDialogFragment, SuggestInstitutesDialogFragment.f292080n0[0], suggestInstituteArguments);
        return suggestInstitutesDialogFragment;
    }
}
