package com.avito.android.select_field;

import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import com.avito.android.profile_settings_extended.adapter.select.SelectItem;
import com.avito.android.select_field.SelectFieldFragment;
import com.avito.android.select_field.model.SelectFieldArguments;
import com.avito.android.util.C35966w1;
import j.D;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SelectFieldRouter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_field/f;", "Lcom/avito/android/select_field/e;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Fragment f267150a;

    /* renamed from: b, reason: collision with root package name */
    public final int f267151b;

    @Inject
    public f(@Y61.k Fragment fragment, @D int i12) {
        this.f267150a = fragment;
        this.f267151b = i12;
    }

    @Override // com.avito.android.select_field.e
    public final void a() {
        FragmentManager childFragmentManager = this.f267150a.getChildFragmentManager();
        if (childFragmentManager.H("select_fragment_tag") != null) {
            childFragmentManager.Y();
        }
    }

    @Override // com.avito.android.select_field.e
    public final void b(@Y61.k SelectItem selectItem) {
        SelectFieldFragment.a aVar = SelectFieldFragment.f267123s0;
        SelectFieldArguments selectFieldArguments = new SelectFieldArguments(selectItem, "select_field_result_key");
        aVar.getClass();
        SelectFieldFragment selectFieldFragment = new SelectFieldFragment();
        C35966w1.a(selectFieldFragment, -1, new b(selectFieldArguments));
        FragmentManager childFragmentManager = this.f267150a.getChildFragmentManager();
        if (childFragmentManager.H("select_fragment_tag") != null) {
            return;
        }
        H hE2 = childFragmentManager.e();
        hE2.j(this.f267151b, selectFieldFragment, "select_fragment_tag", 1);
        hE2.c(null);
        hE2.e();
    }
}
