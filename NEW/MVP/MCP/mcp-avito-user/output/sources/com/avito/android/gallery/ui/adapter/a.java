package com.avito.android.gallery.ui.adapter;

import Y61.k;
import android.view.ViewGroup;
import androidx.fragment.app.F;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35966w1;
import iF.InterfaceC41279c;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: FullscreenGalleryAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gallery/ui/adapter/a;", "Landroidx/fragment/app/F;", "_avito_gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends F {

    /* renamed from: j, reason: collision with root package name */
    @k
    public final List<Image> f159258j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final InterfaceC41279c f159259k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final Y41.a<G0> f159260l;

    /* compiled from: FullscreenGalleryAdapter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.gallery.ui.adapter.a$a, reason: collision with other inner class name */
    public static final class C4656a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4656a f159261l = new C4656a();

        public C4656a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public /* synthetic */ a(FragmentManager fragmentManager, List list, InterfaceC41279c interfaceC41279c, Y41.a aVar, int i12, C42822w c42822w) {
        this(fragmentManager, list, interfaceC41279c, (i12 & 8) != 0 ? C4656a.f159261l : aVar);
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        return this.f159258j.size();
    }

    @Override // androidx.fragment.app.F, androidx.viewpager.widget.a
    public final Object f(ViewGroup viewGroup, int i12) {
        Fragment fragment = (Fragment) super.f(viewGroup, i12);
        if (fragment instanceof GalleryFragment) {
            ((GalleryFragment) fragment).f159253r0 = new b(this);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.F
    @k
    public final Fragment o(int i12) {
        Image image = this.f159258j.get(i12);
        GalleryFragment.f159248w0.getClass();
        GalleryFragment galleryFragment = new GalleryFragment();
        C35966w1.a(galleryFragment, -1, new f(image, false, null));
        return galleryFragment;
    }

    @X41.j
    public a(@k FragmentManager fragmentManager, @k List<Image> list, @k InterfaceC41279c interfaceC41279c, @k Y41.a<G0> aVar) {
        super(fragmentManager, 0);
        this.f159258j = list;
        this.f159259k = interfaceC41279c;
        this.f159260l = aVar;
    }
}
