package com.avito.android.extended_profile_ui_components.search_input;

import Y61.k;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.K2;
import kotlin.Metadata;

/* compiled from: ProfileSearchInputView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/search_input/b;", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends RecyclerView.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProfileSearchInputView f153418b;

    public b(ProfileSearchInputView profileSearchInputView) {
        this.f153418b = profileSearchInputView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public final void i(int i12, @k RecyclerView recyclerView) {
        if (i12 == 1) {
            K2.d(this.f153418b, false);
        }
    }
}
