package com.avito.android.select.sectioned_multiselect.core;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import kotlin.Metadata;

/* compiled from: SectionedMultiselectCoreFragment.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_select_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.select.sectioned_multiselect.core.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34652b {
    @Y61.k
    public static final SectionedMultiselectCoreFragment a(@Y61.l Fragment fragment, @Y61.k SectionedMultiselectParameter sectionedMultiselectParameter, @Y61.l SearchParams searchParams, boolean z12) {
        SectionedMultiselectCoreFragment sectionedMultiselectCoreFragment = new SectionedMultiselectCoreFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("arguments", sectionedMultiselectParameter);
        bundle.putParcelable("params", searchParams == null ? new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null) : searchParams);
        bundle.putBoolean("sectioned_pagination", z12);
        sectionedMultiselectCoreFragment.setArguments(bundle);
        sectionedMultiselectCoreFragment.setTargetFragment(fragment, 0);
        return sectionedMultiselectCoreFragment;
    }
}
