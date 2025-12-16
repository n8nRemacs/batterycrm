package com.avito.android.profile_settings_extended;

import androidx.recyclerview.widget.GridLayoutManager;
import com.avito.android.R;
import com.avito.android.lib.design.photo_uploader_appending.MaxWidthGridLayoutManager;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSettingsFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/GridLayoutManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final class r extends kotlin.jvm.internal.N implements Y41.a<GridLayoutManager> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileSettingsFragment f230816l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ExtendedProfileSettingsFragment extendedProfileSettingsFragment) {
        super(0);
        this.f230816l = extendedProfileSettingsFragment;
    }

    @Override // Y41.a
    public final GridLayoutManager invoke() {
        return new MaxWidthGridLayoutManager(this.f230816l.requireContext(), null, R.attr.photoUploaderList, R.style.Design_Widget_PhotoUploaderList);
    }
}
