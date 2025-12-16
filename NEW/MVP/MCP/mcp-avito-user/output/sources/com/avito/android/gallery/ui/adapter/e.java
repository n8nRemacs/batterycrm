package com.avito.android.gallery.ui.adapter;

import android.view.View;
import com.avito.android.util.D6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f159269b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GalleryFragment f159270c;

    public /* synthetic */ e(GalleryFragment galleryFragment, int i12) {
        this.f159269b = i12;
        this.f159270c = galleryFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f159269b) {
            case 0:
                View view = this.f159270c.f159251p0;
                if (view != null) {
                    D6.w(view);
                    break;
                }
                break;
            default:
                View view2 = this.f159270c.f159251p0;
                if (view2 != null) {
                    D6.w(view2);
                    break;
                }
                break;
        }
    }
}
