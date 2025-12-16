package com.avito.android.gallery.ui.adapter;

import Y61.k;
import android.view.ViewGroup;
import androidx.fragment.app.F;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.gallery.ui.GalleryView;
import com.avito.android.gallery.ui.adapter.GalleryFragment;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35966w1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gallery/ui/adapter/d;", "Landroidx/fragment/app/F;", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d extends F {

    /* renamed from: j, reason: collision with root package name */
    @k
    public List<Image> f159265j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final GalleryView f159266k;

    /* renamed from: l, reason: collision with root package name */
    public final int f159267l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final ArrayList f159268m;

    public d(@k FragmentManager fragmentManager, @k List list, @k GalleryView galleryView, int i12) {
        super(fragmentManager, 1);
        this.f159265j = list;
        this.f159266k = galleryView;
        this.f159267l = i12;
        this.f159268m = new ArrayList();
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        return this.f159265j.size();
    }

    @Override // androidx.fragment.app.F, androidx.viewpager.widget.a
    public final Object f(ViewGroup viewGroup, int i12) {
        GalleryFragment galleryFragment = (GalleryFragment) super.f(viewGroup, i12);
        galleryFragment.f159253r0 = new c((ViewPager) viewGroup, this);
        return galleryFragment;
    }

    @Override // androidx.fragment.app.F
    public final Fragment o(int i12) {
        Image image = this.f159265j.get(i12);
        GalleryFragment.a aVar = GalleryFragment.f159248w0;
        Integer numValueOf = Integer.valueOf(this.f159267l);
        aVar.getClass();
        GalleryFragment galleryFragment = new GalleryFragment();
        C35966w1.a(galleryFragment, -1, new f(image, true, numValueOf));
        this.f159268m.add(galleryFragment);
        return galleryFragment;
    }
}
