package com.avito.android.photo_gallery.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.F;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.analytics.event.native_video.VideoEventFromPage;
import com.avito.android.analytics.screens.utils.E;
import com.avito.android.photo_gallery.C33197j;
import com.avito.android.photo_gallery.GalleryFragment;
import com.avito.android.photo_gallery.GalleryFragmentType;
import com.avito.android.photo_gallery.adapter.q;
import com.avito.android.photo_gallery.autoteka_teaser.v;
import com.avito.android.photo_gallery.teaser.GalleryTeaserFragment;
import com.avito.android.photo_gallery.teaser.GalleryTeaserOpenParams;
import com.avito.android.photo_gallery.tracker.GalleryScreen;
import com.avito.android.player.PlayerAnalyticsParameters;
import com.avito.android.player.view.PlayerGalleryFragment;
import com.avito.android.rec.ScreenSource;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.NativeVideoStatus;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.util.InterfaceC35845m2;
import java.util.List;
import java.util.UUID;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import mc.C44049b;
import okhttp3.internal.http2.Http2;

/* compiled from: FullscreenGalleryAdapter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/adapter/a;", "Landroidx/fragment/app/F;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends F {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final SparseArray<Fragment> f216685A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public Integer f216686B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f216687C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final String f216688D;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Context f216689j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final List<? extends q> f216690k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f216691l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final R70.c f216692m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f216693n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.player.router.d f216694o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final E80.c f216695p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f216696q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f216697r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f216698s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final E80.b f216699t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f216700u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.photo_gallery.autoteka_teaser.b f216701v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final String f216702w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Integer, G0> f216703x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final Y41.l<String, G0> f216704y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f216705z;

    /* compiled from: FullscreenGalleryAdapter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_gallery.adapter.a$a, reason: collision with other inner class name */
    public static final class C6493a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C6493a f216706l = new C6493a();

        public C6493a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: FullscreenGalleryAdapter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f216707l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: FullscreenGalleryAdapter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f216708l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: FullscreenGalleryAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f216709l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Integer num) {
            num.intValue();
            return G0.f406611a;
        }
    }

    /* compiled from: FullscreenGalleryAdapter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f216710l = new e();

        public e() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(String str) {
            return G0.f406611a;
        }
    }

    /* compiled from: FullscreenGalleryAdapter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f216711l = new f();

        public f() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    public /* synthetic */ a(Context context, FragmentManager fragmentManager, List list, String str, R70.c cVar, InterfaceC35845m2 interfaceC35845m2, com.avito.android.player.router.d dVar, E80.c cVar2, boolean z12, Y41.a aVar, Y41.a aVar2, E80.b bVar, Y41.a aVar3, com.avito.android.photo_gallery.autoteka_teaser.b bVar2, String str2, Y41.l lVar, Y41.l lVar2, Y41.a aVar4, int i12, C42822w c42822w) {
        this(context, fragmentManager, list, (i12 & 8) != 0 ? null : str, cVar, interfaceC35845m2, dVar, cVar2, z12, (i12 & 512) != 0 ? C6493a.f216706l : aVar, (i12 & 1024) != 0 ? b.f216707l : aVar2, (i12 & 2048) != 0 ? null : bVar, (i12 & 4096) != 0 ? c.f216708l : aVar3, (i12 & 8192) != 0 ? null : bVar2, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str2, (32768 & i12) != 0 ? d.f216709l : lVar, (65536 & i12) != 0 ? e.f216710l : lVar2, (i12 & 131072) != 0 ? f.f216711l : aVar4);
    }

    public static GalleryFragment p(a aVar, Image image, GalleryFragmentType galleryFragmentType, int i12, q.g gVar, q.b bVar, NativeVideoStatus nativeVideoStatus, Image image2, int i13) {
        q.g gVar2 = (i13 & 8) != 0 ? null : gVar;
        q.b bVar2 = (i13 & 16) != 0 ? null : bVar;
        NativeVideoStatus nativeVideoStatus2 = (i13 & 32) != 0 ? null : nativeVideoStatus;
        Image image3 = (i13 & 64) != 0 ? null : image2;
        aVar.getClass();
        boolean z12 = i12 == 0;
        GalleryScreen galleryScreen = GalleryScreen.f217664d;
        String str = aVar.f216691l;
        if (str == null) {
            str = "";
        }
        return C33197j.a(image, false, galleryFragmentType, false, z12, aVar.f216688D, galleryScreen, str, null, gVar2, bVar2, nativeVideoStatus2, null, aVar.f216702w, image3, 4360);
    }

    @Override // androidx.fragment.app.F, androidx.viewpager.widget.a
    public final void a(@Y61.k ViewPager viewPager, int i12, @Y61.k Object obj) {
        this.f216685A.put(i12, null);
        if ((this.f216690k.get(i12) instanceof q.d) && this.f216696q) {
            return;
        }
        super.a(viewPager, i12, obj);
    }

    @Override // androidx.viewpager.widget.a
    public final int c() {
        return this.f216690k.size();
    }

    @Override // androidx.fragment.app.F, androidx.viewpager.widget.a
    public final Object f(ViewGroup viewGroup, int i12) {
        AutotekaTeaserResult autotekaTeaserResult;
        Fragment fragment = (Fragment) super.f(viewGroup, i12);
        if (fragment instanceof GalleryFragment) {
            GalleryFragment galleryFragment = (GalleryFragment) fragment;
            galleryFragment.f216486F0 = this.f216700u;
            q qVar = this.f216690k.get(i12);
            if (qVar instanceof q.c) {
                galleryFragment.f216508t0 = new com.avito.android.photo_gallery.adapter.c(this);
            } else if (qVar instanceof q.h) {
                galleryFragment.f216508t0 = new com.avito.android.photo_gallery.adapter.d(this, ((q.h) qVar).f216771a.getVideoUrl());
            } else if (qVar instanceof q.d) {
                if (!this.f216696q) {
                    galleryFragment.f216508t0 = new com.avito.android.photo_gallery.adapter.e((q.d) qVar, this);
                }
            } else if (qVar instanceof q.g) {
                com.avito.android.photo_gallery.autoteka_teaser.b bVar = this.f216701v;
                if (bVar != null) {
                    galleryFragment.f216481A0 = bVar;
                    v vVar = galleryFragment.f216514z0;
                    if (vVar != null && (autotekaTeaserResult = galleryFragment.f216482B0) != null) {
                        vVar.a(autotekaTeaserResult, galleryFragment.f216513y0, bVar);
                    }
                }
            } else if (qVar instanceof q.a) {
                galleryFragment.f216508t0 = new com.avito.android.photo_gallery.adapter.f(this);
                galleryFragment.f216491K0 = new com.avito.android.photo_gallery.adapter.b(this, i12, galleryFragment);
            } else {
                if (!(qVar instanceof q.e ? true : qVar instanceof q.f)) {
                    boolean z12 = qVar instanceof q.b;
                }
            }
        }
        this.f216685A.put(i12, fragment);
        return fragment;
    }

    @Override // androidx.fragment.app.F
    @Y61.k
    public final Fragment o(int i12) {
        Fragment fragmentP;
        q qVar = this.f216690k.get(i12);
        if (qVar instanceof q.c) {
            fragmentP = p(this, ((q.c) qVar).f216765a, GalleryFragmentType.f216520e, i12, null, null, null, null, 120);
        } else if (qVar instanceof q.h) {
            fragmentP = p(this, ((q.h) qVar).f216771a.getPreviewImage(), GalleryFragmentType.f216522g, i12, null, null, null, null, 120);
        } else if (qVar instanceof q.d) {
            if (this.f216696q) {
                NativeVideo nativeVideo = ((q.d) qVar).f216766a;
                String url = nativeVideo.getUrl();
                if (url != null) {
                    ScreenSource.ADVERT advert = ScreenSource.ADVERT.f251774d;
                    String str = this.f216691l;
                    if (str == null) {
                        str = "";
                    }
                    PlayerAnalyticsParameters playerAnalyticsParameters = new PlayerAnalyticsParameters(str, C44049b.a(VideoEventFromPage.f90106b), null, 4, null);
                    boolean z12 = this.f216687C;
                    PlayerGalleryFragment playerGalleryFragmentA = this.f216695p.a(url, advert, playerAnalyticsParameters, nativeVideo.getThumbnail(), Boolean.valueOf(z12));
                    E80.b bVar = this.f216699t;
                    fragmentP = playerGalleryFragmentA;
                    if (bVar != null) {
                        playerGalleryFragmentA.B2(bVar);
                        fragmentP = playerGalleryFragmentA;
                    }
                } else {
                    fragmentP = p(this, nativeVideo.getThumbnail(), GalleryFragmentType.f216522g, i12, null, null, nativeVideo.getStatus(), null, 88);
                }
            } else {
                NativeVideo nativeVideo2 = ((q.d) qVar).f216766a;
                fragmentP = p(this, nativeVideo2.getThumbnail(), GalleryFragmentType.f216522g, i12, null, null, nativeVideo2.getStatus(), null, 88);
            }
        } else if (qVar instanceof q.g) {
            fragmentP = p(this, null, GalleryFragmentType.f216518c, i12, (q.g) qVar, null, null, null, 112);
        } else if (qVar instanceof q.e) {
            fragmentP = p(this, ((q.e) qVar).f216767a, GalleryFragmentType.f216521f, i12, null, null, null, null, 120);
        } else if (qVar instanceof q.f) {
            GalleryTeaserFragment.a aVar = GalleryTeaserFragment.f217659p0;
            GalleryTeaserOpenParams galleryTeaserOpenParams = new GalleryTeaserOpenParams(((q.f) qVar).f216768a);
            aVar.getClass();
            fragmentP = GalleryTeaserFragment.a.a(galleryTeaserOpenParams);
        } else if (qVar instanceof q.b) {
            fragmentP = p(this, null, GalleryFragmentType.f216519d, i12, null, (q.b) qVar, null, null, 104);
        } else {
            if (!(qVar instanceof q.a)) {
                throw new NoWhenBranchMatchedException();
            }
            q.a aVar2 = (q.a) qVar;
            fragmentP = p(this, aVar2.f216762a, GalleryFragmentType.f216523h, i12, null, null, null, aVar2.f216763b, 56);
        }
        this.f216687C = false;
        return fragmentP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @X41.j
    public a(@Y61.k Context context, @Y61.k FragmentManager fragmentManager, @Y61.k List<? extends q> list, @Y61.l String str, @Y61.k R70.c cVar, @Y61.k InterfaceC35845m2 interfaceC35845m2, @Y61.k com.avito.android.player.router.d dVar, @Y61.k E80.c cVar2, boolean z12, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.l E80.b bVar, @Y61.k Y41.a<G0> aVar3, @Y61.l com.avito.android.photo_gallery.autoteka_teaser.b bVar2, @Y61.l String str2, @Y61.k Y41.l<? super Integer, G0> lVar, @Y61.k Y41.l<? super String, G0> lVar2, @Y61.k Y41.a<G0> aVar4) {
        super(fragmentManager, 0);
        this.f216689j = context;
        this.f216690k = list;
        this.f216691l = str;
        this.f216692m = cVar;
        this.f216693n = interfaceC35845m2;
        this.f216694o = dVar;
        this.f216695p = cVar2;
        this.f216696q = z12;
        this.f216697r = aVar;
        this.f216698s = aVar2;
        this.f216699t = bVar;
        this.f216700u = aVar3;
        this.f216701v = bVar2;
        this.f216702w = str2;
        this.f216703x = lVar;
        this.f216704y = lVar2;
        this.f216705z = aVar4;
        this.f216685A = new SparseArray<>();
        this.f216687C = true;
        E.f90961a.getClass();
        this.f216688D = UUID.randomUUID().toString();
    }
}
