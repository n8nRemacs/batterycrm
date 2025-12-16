package com.avito.android.edit_count_field;

import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import com.avito.android.edit_count_field.EditCountFieldFragment;
import com.avito.android.edit_count_field.model.EditCountFieldArguments;
import com.avito.android.profile_settings_extended.adapter.count.CountItem;
import com.avito.android.util.C35966w1;
import j.D;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EditCountFieldRouter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_count_field/e;", "Lcom/avito/android/edit_count_field/d;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Fragment f146596a;

    /* renamed from: b, reason: collision with root package name */
    public final int f146597b;

    @Inject
    public e(@Y61.k Fragment fragment, @D int i12) {
        this.f146596a = fragment;
        this.f146597b = i12;
    }

    @Override // com.avito.android.edit_count_field.d
    public final void a(@Y61.k CountItem countItem) {
        EditCountFieldFragment.a aVar = EditCountFieldFragment.f146568s0;
        EditCountFieldArguments editCountFieldArguments = new EditCountFieldArguments(countItem, "extended_edit_count_field_result_key");
        aVar.getClass();
        EditCountFieldFragment editCountFieldFragment = new EditCountFieldFragment();
        C35966w1.a(editCountFieldFragment, -1, new a(editCountFieldArguments));
        FragmentManager childFragmentManager = this.f146596a.getChildFragmentManager();
        if (childFragmentManager.H("edit_count_fragment_tag") != null) {
            return;
        }
        H hE2 = childFragmentManager.e();
        hE2.j(this.f146597b, editCountFieldFragment, "edit_count_fragment_tag", 1);
        hE2.c(null);
        hE2.e();
    }

    @Override // com.avito.android.edit_count_field.d
    public final boolean b() {
        FragmentManager childFragmentManager = this.f146596a.getChildFragmentManager();
        if (childFragmentManager.H("edit_count_fragment_tag") == null) {
            return false;
        }
        childFragmentManager.Y();
        return true;
    }
}
