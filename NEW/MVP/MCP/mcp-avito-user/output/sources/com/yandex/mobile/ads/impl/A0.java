package com.yandex.mobile.ads.impl;

import android.view.View;
import com.avito.android.R;
import com.avito.android.photo_gallery.LegacyPhotoGalleryActivity;
import com.yandex.mobile.ads.impl.k9;
import com.yandex.mobile.ads.impl.m90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class A0 implements m90.a, androidx.core.view.M {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f383165b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f383166c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f383167d;

    public /* synthetic */ A0(int i12, k9.a aVar, boolean z12) {
        this.f383165b = i12;
        this.f383166c = aVar;
        this.f383167d = z12;
    }

    @Override // androidx.core.view.M
    public androidx.core.view.J0 h(View view, androidx.core.view.J0 j02) {
        LegacyPhotoGalleryActivity.a aVar = LegacyPhotoGalleryActivity.f216531m0;
        int i12 = j02.e(7).f44776b;
        int i13 = j02.e(7).f44778d;
        LegacyPhotoGalleryActivity legacyPhotoGalleryActivity = (LegacyPhotoGalleryActivity) this.f383166c;
        if (!this.f383167d) {
            View view2 = legacyPhotoGalleryActivity.f216572o;
            if (view2 != null) {
                view2.setPadding(view2.getPaddingLeft(), i12, view2.getPaddingRight(), view2.getPaddingBottom());
            }
            View view3 = legacyPhotoGalleryActivity.f216572o;
            if (view3 != null) {
                view3.setMinimumHeight(com.avito.android.util.y6.b(52) + i12);
            }
            View view4 = legacyPhotoGalleryActivity.f216571n;
            if (view4 != null) {
                view4.setPadding(view4.getPaddingLeft(), i12, view4.getPaddingRight(), view4.getPaddingBottom());
            }
            View view5 = legacyPhotoGalleryActivity.f216571n;
            if (view5 != null) {
                view5.setMinimumHeight(com.avito.android.util.y6.b(64) + i12);
            }
            i12 = 0;
        }
        View viewFindViewById = legacyPhotoGalleryActivity.findViewById(R.id.photo_gallery_root);
        viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), i12, viewFindViewById.getPaddingRight(), i13);
        return androidx.core.view.J0.f44939b;
    }

    @Override // com.yandex.mobile.ads.impl.m90.a
    public void invoke(Object obj) {
        k9 k9Var = (k9) obj;
        switch (this.f383165b) {
            case 0:
                boolean z12 = this.f383167d;
                k9Var.getClass();
                break;
            case 1:
                boolean z13 = this.f383167d;
                k9Var.getClass();
                break;
            default:
                boolean z14 = this.f383167d;
                k9Var.getClass();
                break;
        }
    }

    public /* synthetic */ A0(boolean z12, LegacyPhotoGalleryActivity legacyPhotoGalleryActivity) {
        this.f383165b = 3;
        this.f383167d = z12;
        this.f383166c = legacyPhotoGalleryActivity;
    }
}
