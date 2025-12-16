package com.avito.android.photo_picker.gallery;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.photo_picker.gallery.GalleryPickerFragment;
import com.avito.android.util.D6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f219475b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f219476c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ GalleryPickerFragment f219477d;

    public /* synthetic */ b(View view, GalleryPickerFragment galleryPickerFragment, int i12) {
        this.f219475b = i12;
        this.f219476c = view;
        this.f219477d = galleryPickerFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorRotation;
        ViewPropertyAnimator duration;
        GalleryPickerFragment galleryPickerFragment = this.f219477d;
        View view = this.f219476c;
        switch (this.f219475b) {
            case 0:
                GalleryPickerFragment.a aVar = GalleryPickerFragment.f219444C0;
                view.setTranslationY(-view.getHeight());
                view.animate().translationY(0.0f).setDuration(200L).withStartAction(new b(view, galleryPickerFragment, 2)).start();
                TextView textView = galleryPickerFragment.f219464w0;
                if (textView != null && (viewPropertyAnimatorAnimate = textView.animate()) != null && (viewPropertyAnimatorRotation = viewPropertyAnimatorAnimate.rotation(-180.0f)) != null) {
                    ViewPropertyAnimator viewPropertyAnimatorTranslationY = viewPropertyAnimatorRotation.translationY(galleryPickerFragment.getContext() != null ? D6.i(3, r1) : 0.0f);
                    if (viewPropertyAnimatorTranslationY != null && (duration = viewPropertyAnimatorTranslationY.setDuration(200L)) != null) {
                        duration.start();
                        break;
                    }
                }
                break;
            case 1:
                GalleryPickerFragment.a aVar2 = GalleryPickerFragment.f219444C0;
                view.setVisibility(8);
                NavBar navBar = galleryPickerFragment.f219463v0;
                if (navBar != null) {
                    navBar.setElevation(0.0f);
                    break;
                }
                break;
            default:
                GalleryPickerFragment.a aVar3 = GalleryPickerFragment.f219444C0;
                view.setAlpha(1.0f);
                NavBar navBar2 = galleryPickerFragment.f219463v0;
                if (navBar2 != null) {
                    navBar2.setElevation(8.0f);
                    break;
                }
                break;
        }
    }
}
