package com.avito.android.photo_gallery.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.F;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.photo_gallery.C33197j;
import com.avito.android.photo_gallery.GalleryFragment;
import com.avito.android.photo_gallery.GalleryFragmentType;
import com.avito.android.photo_gallery.adapter.q;
import com.avito.android.photo_gallery.autoteka_teaser.v;
import com.avito.android.photo_gallery.teaser.GalleryTeaserFragment;
import com.avito.android.photo_gallery.teaser.GalleryTeaserOpenParams;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.util.InterfaceC35845m2;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: GalleryAdapter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery/adapter/g;", "Landroidx/fragment/app/F;", "a", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes14.dex */
public final class g extends F {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Context f216721j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final FragmentManager f216722k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public List<? extends q> f216723l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f216724m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final R70.c f216725n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f216726o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f216727p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Screen f216728q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final Float f216729r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f216730s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final ArrayList f216731t;

    /* compiled from: GalleryAdapter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/photo_gallery/adapter/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ g(Context context, FragmentManager fragmentManager, List list, String str, R70.c cVar, InterfaceC35845m2 interfaceC35845m2, boolean z12, Screen screen, Float f12, Y41.a aVar, int i12, C42822w c42822w) {
        this(context, fragmentManager, list, str, cVar, interfaceC35845m2, (i12 & 64) != 0 ? false : z12, screen, (i12 & 256) != 0 ? null : f12, aVar);
    }

    public static GalleryFragment p(g gVar, Image image, GalleryFragmentType galleryFragmentType, q.g gVar2, q.b bVar, int i12) {
        q.g gVar3 = (i12 & 4) != 0 ? null : gVar2;
        q.b bVar2 = (i12 & 8) != 0 ? null : bVar;
        String str = gVar.f216724m;
        if (str == null) {
            str = "";
        }
        GalleryFragment galleryFragmentA = C33197j.a(image, true, galleryFragmentType, gVar.f216727p, false, null, gVar.f216728q, str, gVar.f216729r, gVar3, bVar2, null, null, null, null, 30752);
        gVar.f216731t.add(galleryFragmentA);
        return galleryFragmentA;
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        return this.f216723l.size();
    }

    @Override // androidx.viewpager.widget.a
    public final int d(@Y61.k Object obj) {
        if (!this.f216727p) {
            return -2;
        }
        Fragment fragment = (Fragment) C42745f0.G(this.f216731t);
        q qVar = (q) C42745f0.G(this.f216723l);
        if (!obj.equals(fragment) || !(fragment instanceof GalleryFragment)) {
            return -2;
        }
        if (!(qVar instanceof q.c)) {
            return -1;
        }
        GalleryFragment galleryFragment = (GalleryFragment) fragment;
        galleryFragment.f216509u0 = ((q.c) qVar).f216765a;
        if (!galleryFragment.isVisible()) {
            return -1;
        }
        GalleryFragment.r5(galleryFragment);
        return -1;
    }

    @Override // androidx.fragment.app.F, androidx.viewpager.widget.a
    public final Object f(ViewGroup viewGroup, int i12) {
        AutotekaTeaserResult autotekaTeaserResult;
        GalleryFragment galleryFragment = (GalleryFragment) super.f(viewGroup, i12);
        q qVar = this.f216723l.get(i12);
        if (qVar instanceof q.c) {
            galleryFragment.f216508t0 = new i((ViewPager) viewGroup, this);
        } else if (qVar instanceof q.h) {
            galleryFragment.f216508t0 = new j((ViewPager) viewGroup, this, ((q.h) qVar).f216771a.getVideoUrl());
        } else if (qVar instanceof q.g) {
            k kVar = new k(this);
            galleryFragment.f216481A0 = kVar;
            v vVar = galleryFragment.f216514z0;
            if (vVar != null && (autotekaTeaserResult = galleryFragment.f216482B0) != null) {
                vVar.a(autotekaTeaserResult, galleryFragment.f216513y0, kVar);
            }
        } else if (!(qVar instanceof q.d) && !(qVar instanceof q.e) && !(qVar instanceof q.f) && !(qVar instanceof q.b)) {
            boolean z12 = qVar instanceof q.a;
        }
        return galleryFragment;
    }

    @Override // androidx.fragment.app.F
    @Y61.k
    public final Fragment o(int i12) {
        AutotekaTeaserResult autotekaTeaserResult;
        q qVar = this.f216723l.get(i12);
        if (qVar instanceof q.c) {
            return p(this, ((q.c) qVar).f216765a, GalleryFragmentType.f216520e, null, null, 12);
        }
        if (qVar instanceof q.e) {
            return p(this, ((q.e) qVar).f216767a, GalleryFragmentType.f216520e, null, null, 12);
        }
        if (qVar instanceof q.h) {
            Video video = ((q.h) qVar).f216771a;
            GalleryFragment galleryFragmentP = p(this, video.getPreviewImage(), GalleryFragmentType.f216522g, null, null, 12);
            galleryFragmentP.f216508t0 = new h(this, video);
            return galleryFragmentP;
        }
        if (qVar instanceof q.d) {
            return p(this, ((q.d) qVar).f216766a.getThumbnail(), GalleryFragmentType.f216522g, null, null, 12);
        }
        if (qVar instanceof q.g) {
            GalleryFragment galleryFragmentP2 = p(this, null, GalleryFragmentType.f216517b, (q.g) qVar, null, 8);
            k kVar = new k(this);
            galleryFragmentP2.f216481A0 = kVar;
            v vVar = galleryFragmentP2.f216514z0;
            if (vVar == null || (autotekaTeaserResult = galleryFragmentP2.f216482B0) == null) {
                return galleryFragmentP2;
            }
            vVar.a(autotekaTeaserResult, galleryFragmentP2.f216513y0, kVar);
            return galleryFragmentP2;
        }
        if (qVar instanceof q.f) {
            GalleryTeaserFragment.a aVar = GalleryTeaserFragment.f217659p0;
            GalleryTeaserOpenParams galleryTeaserOpenParams = new GalleryTeaserOpenParams(((q.f) qVar).f216768a);
            aVar.getClass();
            return GalleryTeaserFragment.a.a(galleryTeaserOpenParams);
        }
        if (qVar instanceof q.b) {
            return p(this, null, GalleryFragmentType.f216517b, null, (q.b) qVar, 4);
        }
        if (qVar instanceof q.a) {
            return p(this, ((q.a) qVar).f216762a, GalleryFragmentType.f216520e, null, null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }

    public g(@Y61.k Context context, @Y61.k FragmentManager fragmentManager, @Y61.k List<? extends q> list, @Y61.l String str, @Y61.k R70.c cVar, @Y61.k InterfaceC35845m2 interfaceC35845m2, boolean z12, @Y61.k Screen screen, @Y61.l Float f12, @Y61.k Y41.a<G0> aVar) {
        super(fragmentManager, 1);
        this.f216721j = context;
        this.f216722k = fragmentManager;
        this.f216723l = list;
        this.f216724m = str;
        this.f216725n = cVar;
        this.f216726o = interfaceC35845m2;
        this.f216727p = z12;
        this.f216728q = screen;
        this.f216729r = f12;
        this.f216730s = aVar;
        this.f216731t = new ArrayList();
    }
}
