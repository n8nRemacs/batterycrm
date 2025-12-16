package e70;

import androidx.fragment.app.FragmentManager;
import com.avito.android.personal_filters.filters_change_dialog.PersonalFiltersChangeDialogFragment;
import com.avito.android.personal_filters.filters_change_dialog.e;
import com.avito.android.personal_filters.filters_change_dialog.ui.PersonalFiltersChangeDialogData;
import com.avito.android.personal_filters.filters_change_dialog.ui.PersonalFiltersChangeDialogOpenParams;
import com.avito.android.remote.model.search.Filter;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PersonalFiltersRouterImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le70/k;", "Le70/j;", "_avito_personal-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.personal_filters.filters_change_dialog.e f394970a;

    @Inject
    public k(@Y61.k com.avito.android.personal_filters.filters_change_dialog.e eVar) {
        this.f394970a = eVar;
    }

    @Override // e70.j
    public final void a(@Y61.k FragmentManager fragmentManager, @Y61.k Filter.AutoShowPresetFiltersDialog autoShowPresetFiltersDialog) {
        com.avito.android.personal_filters.filters_change_dialog.e eVar = this.f394970a;
        if (eVar.f215731a.f215732a) {
            return;
        }
        PersonalFiltersChangeDialogFragment.a aVar = PersonalFiltersChangeDialogFragment.f215702o0;
        PersonalFiltersChangeDialogData personalFiltersChangeDialogData = new PersonalFiltersChangeDialogData(autoShowPresetFiltersDialog.getTitle(), autoShowPresetFiltersDialog.getSubtitle(), new PersonalFiltersChangeDialogData.ApplyButton(autoShowPresetFiltersDialog.getApplyButton().getTitle(), autoShowPresetFiltersDialog.getApplyButton().getParams(), autoShowPresetFiltersDialog.getApplyButton().getDeeplink()), autoShowPresetFiltersDialog.getCheckboxTitle(), autoShowPresetFiltersDialog.getDeclineButtonTitle());
        aVar.getClass();
        PersonalFiltersChangeDialogFragment personalFiltersChangeDialogFragment = new PersonalFiltersChangeDialogFragment();
        PersonalFiltersChangeDialogOpenParams personalFiltersChangeDialogOpenParams = new PersonalFiltersChangeDialogOpenParams(personalFiltersChangeDialogData);
        personalFiltersChangeDialogFragment.f215704h0.setValue(personalFiltersChangeDialogFragment, PersonalFiltersChangeDialogFragment.f215703p0[0], personalFiltersChangeDialogOpenParams);
        personalFiltersChangeDialogFragment.show(fragmentManager, "PersonalFiltersChangeDialogFragment");
        eVar.f215731a.getClass();
        eVar.f215731a = new e.a(true);
    }
}
