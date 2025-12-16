package com.avito.android.saved_searches.deeplinks;

import androidx.fragment.app.DialogFragment;
import com.avito.android.libs.saved_searches.domain.SavedSearchParams;
import com.avito.android.saved_searches.presentation.core.SavedSearchDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SavedSearchDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/DialogFragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class a extends N implements Y41.a<DialogFragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SavedSearchParams f258267l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SavedSearchParams savedSearchParams) {
        super(0);
        this.f258267l = savedSearchParams;
    }

    @Override // Y41.a
    public final DialogFragment invoke() {
        SavedSearchDialogFragment.f258384m0.getClass();
        SavedSearchDialogFragment savedSearchDialogFragment = new SavedSearchDialogFragment();
        savedSearchDialogFragment.f258390l0.setValue(savedSearchDialogFragment, SavedSearchDialogFragment.f258385n0[0], this.f258267l);
        return savedSearchDialogFragment;
    }
}
