package com.avito.android.photo_gallery.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import androidx.view.Lifecycle;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.photo_gallery.C33197j;
import com.avito.android.photo_gallery.GalleryFragment;
import com.avito.android.photo_gallery.GalleryFragmentType;
import com.avito.android.photo_gallery.adapter.q;
import com.avito.android.photo_gallery.autoteka_teaser.v;
import com.avito.android.photo_gallery.teaser.GalleryTeaserFragment;
import com.avito.android.photo_gallery.teaser.GalleryTeaserOpenParams;
import com.avito.android.pinch_to_zoom.PinchToZoomSource;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.NativeVideoStatus;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.util.InterfaceC35845m2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: GalleryAdapter2.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery/adapter/l;", "Landroidx/viewpager2/adapter/b;", "a", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l extends androidx.viewpager2.adapter.b {

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Context f216740k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final FragmentManager f216741l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f216742m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public List<? extends q> f216743n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final String f216744o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final R70.c f216745p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f216746q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f216747r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Screen f216748s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final Float f216749t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f216750u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final Y41.l<DeepLink, G0> f216751v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final PinchToZoomSource f216752w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final z80.e f216753x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f216754y;

    /* compiled from: GalleryAdapter2.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/photo_gallery/adapter/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: GalleryAdapter2.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Integer> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ q.c f216756m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f216757n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q.c cVar, int i12) {
            super(0);
            this.f216756m = cVar;
            this.f216757n = i12;
        }

        @Override // Y41.a
        public final Integer invoke() {
            if (l.this.f216743n.indexOf(this.f216756m) == -1) {
                return null;
            }
            return Integer.valueOf(this.f216757n);
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ l(Context context, FragmentManager fragmentManager, Lifecycle lifecycle, ViewGroup viewGroup, List list, String str, R70.c cVar, InterfaceC35845m2 interfaceC35845m2, boolean z12, Screen screen, Float f12, Y41.a aVar, Y41.l lVar, PinchToZoomSource pinchToZoomSource, z80.e eVar, int i12, C42822w c42822w) {
        this(context, fragmentManager, lifecycle, viewGroup, list, str, cVar, interfaceC35845m2, (i12 & 256) != 0 ? false : z12, screen, (i12 & 1024) != 0 ? null : f12, aVar, lVar, (i12 & 8192) != 0 ? null : pinchToZoomSource, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : eVar);
    }

    public static GalleryFragment q(l lVar, Image image, GalleryFragmentType galleryFragmentType, q.g gVar, int i12) {
        q.g gVar2 = (i12 & 4) != 0 ? null : gVar;
        String str = lVar.f216744o;
        if (str == null) {
            str = "";
        }
        return C33197j.a(image, true, galleryFragmentType, lVar.f216747r, false, null, lVar.f216748s, str, lVar.f216749t, gVar2, null, null, null, null, null, 24608);
    }

    public static GalleryFragment r(l lVar, Image image, GalleryFragmentType galleryFragmentType, q.b bVar, NativeVideoStatus nativeVideoStatus, PinchToZoomSource pinchToZoomSource, int i12) {
        q.b bVar2 = (i12 & 8) != 0 ? null : bVar;
        NativeVideoStatus nativeVideoStatus2 = (i12 & 16) != 0 ? null : nativeVideoStatus;
        PinchToZoomSource pinchToZoomSource2 = (i12 & 32) != 0 ? null : pinchToZoomSource;
        String str = lVar.f216744o;
        if (str == null) {
            str = "";
        }
        GalleryFragment galleryFragmentA = C33197j.a(image, true, galleryFragmentType, lVar.f216747r, false, null, lVar.f216748s, str, lVar.f216749t, null, bVar2, nativeVideoStatus2, pinchToZoomSource2, null, null, 24608);
        galleryFragmentA.f216508t0 = new n(lVar);
        return galleryFragmentA;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f216743n.size();
    }

    @Override // androidx.viewpager2.adapter.b, androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i12) {
        return this.f216743n.get(i12).hashCode();
    }

    @Override // androidx.viewpager2.adapter.b
    public final boolean k(long j12) {
        Object next;
        Iterator<T> it = this.f216743n.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((q) next).hashCode() == j12) {
                break;
            }
        }
        return next != null;
    }

    @Override // androidx.viewpager2.adapter.b
    @Y61.k
    public final Fragment l(int i12) {
        AutotekaTeaserResult autotekaTeaserResult;
        if (!this.f216754y) {
            FragmentManager fragmentManager = this.f216741l;
            List<Fragment> listP = fragmentManager.P();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listP) {
                if (obj instanceof GalleryFragment) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                H hE2 = fragmentManager.e();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hE2.m((GalleryFragment) it.next());
                }
                hE2.f();
            }
            this.f216754y = true;
        }
        q qVar = this.f216743n.get(i12);
        if (qVar instanceof q.c) {
            GalleryFragment galleryFragmentR = r(this, ((q.c) qVar).f216765a, GalleryFragmentType.f216520e, null, null, this.f216752w, 28);
            z80.e eVar = this.f216753x;
            if (eVar != null) {
                galleryFragmentR.f216487G0.f220009d = eVar;
            }
            galleryFragmentR.f216488H0 = new b((q.c) qVar, i12);
            return galleryFragmentR;
        }
        if (qVar instanceof q.h) {
            Video video = ((q.h) qVar).f216771a;
            GalleryFragment galleryFragmentQ = q(this, video.getPreviewImage(), GalleryFragmentType.f216522g, null, 60);
            galleryFragmentQ.f216508t0 = new m(this, video);
            return galleryFragmentQ;
        }
        if (qVar instanceof q.d) {
            NativeVideo nativeVideo = ((q.d) qVar).f216766a;
            return r(this, nativeVideo.getThumbnail(), GalleryFragmentType.f216522g, null, nativeVideo.getStatus(), null, 44);
        }
        if (qVar instanceof q.g) {
            GalleryFragment galleryFragmentQ2 = q(this, null, GalleryFragmentType.f216517b, (q.g) qVar, 56);
            o oVar = new o(this);
            galleryFragmentQ2.f216481A0 = oVar;
            v vVar = galleryFragmentQ2.f216514z0;
            if (vVar == null || (autotekaTeaserResult = galleryFragmentQ2.f216482B0) == null) {
                return galleryFragmentQ2;
            }
            vVar.a(autotekaTeaserResult, galleryFragmentQ2.f216513y0, oVar);
            return galleryFragmentQ2;
        }
        if (qVar instanceof q.f) {
            GalleryTeaserFragment.a aVar = GalleryTeaserFragment.f217659p0;
            GalleryTeaserOpenParams galleryTeaserOpenParams = new GalleryTeaserOpenParams(((q.f) qVar).f216768a);
            aVar.getClass();
            return GalleryTeaserFragment.a.a(galleryTeaserOpenParams);
        }
        if (qVar instanceof q.e) {
            return r(this, ((q.e) qVar).f216767a, GalleryFragmentType.f216520e, null, null, this.f216752w, 28);
        }
        if (qVar instanceof q.b) {
            return r(this, null, GalleryFragmentType.f216519d, (q.b) qVar, null, null, 52);
        }
        if (qVar instanceof q.a) {
            return r(this, ((q.a) qVar).f216762a, GalleryFragmentType.f216520e, null, null, this.f216752w, 28);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@Y61.k Context context, @Y61.k FragmentManager fragmentManager, @Y61.k Lifecycle lifecycle, @Y61.k ViewGroup viewGroup, @Y61.k List<? extends q> list, @Y61.l String str, @Y61.k R70.c cVar, @Y61.k InterfaceC35845m2 interfaceC35845m2, boolean z12, @Y61.k Screen screen, @Y61.l Float f12, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.l<? super DeepLink, G0> lVar, @Y61.l PinchToZoomSource pinchToZoomSource, @Y61.l z80.e eVar) {
        super(fragmentManager, lifecycle);
        this.f216740k = context;
        this.f216741l = fragmentManager;
        this.f216742m = viewGroup;
        this.f216743n = list;
        this.f216744o = str;
        this.f216745p = cVar;
        this.f216746q = interfaceC35845m2;
        this.f216747r = z12;
        this.f216748s = screen;
        this.f216749t = f12;
        this.f216750u = aVar;
        this.f216751v = lVar;
        this.f216752w = pinchToZoomSource;
        this.f216753x = eVar;
    }
}
