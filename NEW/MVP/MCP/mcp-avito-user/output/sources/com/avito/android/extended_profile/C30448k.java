package com.avito.android.extended_profile;

import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;

/* compiled from: ExtendedProfileFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/recyclerview/widget/GridLayoutManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30448k extends kotlin.jvm.internal.N implements Y41.a<GridLayoutManager> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileFragment f150022l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30448k(ExtendedProfileFragment extendedProfileFragment) {
        super(0);
        this.f150022l = extendedProfileFragment;
    }

    @Override // Y41.a
    public final GridLayoutManager invoke() {
        ExtendedProfileFragment extendedProfileFragment = this.f150022l;
        extendedProfileFragment.requireContext();
        return new GridLayoutManager(extendedProfileFragment.f149288E0, 1);
    }
}
