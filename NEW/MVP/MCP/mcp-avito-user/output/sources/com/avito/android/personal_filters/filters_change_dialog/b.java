package com.avito.android.personal_filters.filters_change_dialog;

import Y41.l;
import com.avito.android.lib.design.button.Button;
import com.avito.android.personal_filters.filters_change_dialog.PersonalFiltersChangeDialogFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: PersonalFiltersChangeDialogFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class b extends H implements l<g70.d, G0> {
    @Override // Y41.l
    public final G0 invoke(g70.d dVar) {
        PersonalFiltersChangeDialogFragment personalFiltersChangeDialogFragment = (PersonalFiltersChangeDialogFragment) this.receiver;
        PersonalFiltersChangeDialogFragment.a aVar = PersonalFiltersChangeDialogFragment.f215702o0;
        personalFiltersChangeDialogFragment.getClass();
        boolean z12 = dVar.f396334a;
        personalFiltersChangeDialogFragment.f215708l0 = z12;
        Button button = personalFiltersChangeDialogFragment.f215709m0;
        if (button != null) {
            button.setLoading(z12);
        }
        return G0.f406611a;
    }
}
