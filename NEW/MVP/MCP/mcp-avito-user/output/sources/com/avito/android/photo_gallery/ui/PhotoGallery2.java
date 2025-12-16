package com.avito.android.photo_gallery.ui;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.R;
import com.avito.android.photo_gallery.adapter.q;
import com.avito.android.remote.model.GalleryButton;
import com.avito.android.remote.model.gallery.GalleryConfig;
import com.avito.android.util.D6;
import com.avito.android.util.L5;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;

/* compiled from: PhotoGallery2.kt */
@P
@s0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001aB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/avito/android/photo_gallery/ui/PhotoGallery2;", "Landroid/widget/FrameLayout;", "LR70/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "position", "Lkotlin/G0;", "setCurrentItem", "(I)V", "Landroidx/viewpager2/widget/ViewPager2;", "b", "Landroidx/viewpager2/widget/ViewPager2;", "getPager", "()Landroidx/viewpager2/widget/ViewPager2;", "setPager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "pager", "Lcom/avito/android/photo_gallery/adapter/q;", "getCurrentItem", "()Lcom/avito/android/photo_gallery/adapter/q;", "currentItem", "a", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PhotoGallery2 extends FrameLayout implements R70.c {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f217683t = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public ViewPager2 pager;

    /* renamed from: c, reason: collision with root package name */
    public g f217685c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Toast f217686d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public R70.c f217687e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public R70.b f217688f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f217689g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f217690h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f217691i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super GalleryButton, G0> f217692j;

    /* renamed from: k, reason: collision with root package name */
    public long f217693k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final a f217694l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public RecyclerView.j f217695m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public l f217696n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f217697o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public i f217698p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public com.avito.android.photo_gallery.ui.b f217699q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.photo_gallery.ui.d f217700r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public Boolean f217701s;

    /* compiled from: PhotoGallery2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f217703a;

        static {
            int[] iArr = new int[GalleryConfig.CounterPosition.values().length];
            try {
                iArr[GalleryConfig.CounterPosition.BOTTOM_RIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f217703a = iArr;
        }
    }

    /* compiled from: PhotoGallery2.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            Y41.a<G0> aVar = PhotoGallery2.this.f217689g;
            if (aVar != null) {
                aVar.invoke();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PhotoGallery2.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            Y41.a<G0> aVar = PhotoGallery2.this.f217690h;
            if (aVar != null) {
                aVar.invoke();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PhotoGallery2.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/GalleryButton;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/GalleryButton;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<GalleryButton, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(GalleryButton galleryButton) {
            GalleryButton galleryButton2 = galleryButton;
            Y41.l<? super GalleryButton, G0> lVar = PhotoGallery2.this.f217692j;
            if (lVar != null) {
                lVar.invoke(galleryButton2);
            }
            return G0.f406611a;
        }
    }

    public PhotoGallery2(@Y61.k Context context, @Y61.k AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f217693k = -1L;
        this.f217694l = new a();
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388691;
        linearLayout.setLayoutParams(layoutParams);
        int i12 = D6.i(16, linearLayout.getContext());
        linearLayout.setPadding(i12, i12, i12, i12);
        this.f217697o = linearLayout;
        this.f217701s = Boolean.FALSE;
    }

    public static LinkedHashMap a(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i12 = 0;
        for (Object obj : arrayList) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            q qVar = (q) obj;
            linkedHashMap.put(Integer.valueOf(i12), Boolean.valueOf((qVar instanceof q.c) || (qVar instanceof q.a)));
            i12 = i13;
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02aa A[LOOP:2: B:157:0x02a4->B:159:0x02aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x022d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(com.avito.android.photo_gallery.ui.PhotoGallery2 r33, com.avito.android.util.R0 r34, androidx.fragment.app.FragmentManager r35, androidx.view.Lifecycle r36, java.util.List r37, java.util.List r38, java.util.Map r39, com.avito.android.remote.model.Video r40, com.avito.android.remote.model.NativeVideo r41, java.util.List r42, java.lang.String r43, com.avito.android.util.InterfaceC35845m2 r44, R70.b r45, Y41.a r46, Y41.a r47, Y41.a r48, int r49, long r50, com.avito.android.remote.model.gallery.GalleryConfig r52, com.avito.android.analytics.screens.Screen r53, com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult r54, com.avito.android.remote.model.model_card.GalleryTeaser r55, com.avito.android.advert_details_items.photogallery.k r56, java.util.List r57, com.avito.android.pinch_to_zoom.b r58, com.avito.android.pinch_to_zoom.PinchToZoomSource r59, com.avito.android.advert_details_items.photogallery.e r60, Y41.l r61, java.util.List r62, int r63) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_gallery.ui.PhotoGallery2.c(com.avito.android.photo_gallery.ui.PhotoGallery2, com.avito.android.util.R0, androidx.fragment.app.FragmentManager, androidx.lifecycle.Lifecycle, java.util.List, java.util.List, java.util.Map, com.avito.android.remote.model.Video, com.avito.android.remote.model.NativeVideo, java.util.List, java.lang.String, com.avito.android.util.m2, R70.b, Y41.a, Y41.a, Y41.a, int, long, com.avito.android.remote.model.gallery.GalleryConfig, com.avito.android.analytics.screens.Screen, com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult, com.avito.android.remote.model.model_card.GalleryTeaser, com.avito.android.advert_details_items.photogallery.k, java.util.List, com.avito.android.pinch_to_zoom.b, com.avito.android.pinch_to_zoom.PinchToZoomSource, com.avito.android.advert_details_items.photogallery.e, Y41.l, java.util.List, int):void");
    }

    public final void b() {
        getPager().setAdapter(null);
        l lVar = this.f217696n;
        if (lVar != null) {
            U.b(lVar.f443859d.f443855c, null);
            getPager().i(lVar);
        }
        i iVar = this.f217698p;
        if (iVar != null) {
            iVar.f217716a = null;
        }
        this.f217698p = null;
        com.avito.android.photo_gallery.ui.b bVar = this.f217699q;
        if (bVar != null) {
            bVar.f217707a = null;
        }
        this.f217699q = null;
    }

    @Y61.k
    public final q getCurrentItem() {
        com.avito.android.photo_gallery.adapter.l lVar = (com.avito.android.photo_gallery.adapter.l) getPager().getAdapter();
        return lVar.f216743n.get(getPager().getCurrentItem());
    }

    @Y61.k
    public final ViewPager2 getPager() {
        ViewPager2 viewPager2 = this.pager;
        if (viewPager2 != null) {
            return viewPager2;
        }
        return null;
    }

    @Override // R70.c
    public final void i() {
        R70.c cVar;
        if (R70.g.a(this.f217686d)) {
            Toast toast = this.f217686d;
            if (toast != null) {
                toast.cancel();
            }
            this.f217686d = L5.a(getContext(), R.string.photo_load_error, 0);
        }
        if (L.f(this.f217687e, this) || (cVar = this.f217687e) == null) {
            return;
        }
        cVar.i();
    }

    @Override // R70.c
    public final void l() {
        R70.c cVar;
        if (L.f(this.f217687e, this) || (cVar = this.f217687e) == null) {
            return;
        }
        cVar.l();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        new Handler(Looper.getMainLooper());
        setPager((ViewPager2) findViewById(R.id.photo_pager));
        getPager().setOffscreenPageLimit(1);
        getPager().e(this.f217694l);
        View childAt = getPager().getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            this.f217695m = recyclerView.getItemAnimator();
            recyclerView.setItemAnimator(null);
        }
        this.f217685c = new g(this, null, 2, null);
        LinearLayout linearLayout = this.f217697o;
        if (linearLayout.getParent() == null) {
            addView(linearLayout);
        }
        i iVar = new i(linearLayout);
        c cVar = new c();
        View view = iVar.f217716a;
        if (view != null) {
            view.setOnClickListener(new com.avito.android.mortgage.root.list.items.legacy_status.i(25, cVar));
        }
        this.f217698p = iVar;
        com.avito.android.photo_gallery.ui.b bVar = new com.avito.android.photo_gallery.ui.b(linearLayout);
        d dVar = new d();
        View view2 = bVar.f217707a;
        if (view2 != null) {
            view2.setOnClickListener(new com.avito.android.mortgage.root.list.items.legacy_status.i(24, dVar));
        }
        this.f217699q = bVar;
        com.avito.android.photo_gallery.ui.d dVar2 = new com.avito.android.photo_gallery.ui.d(linearLayout);
        dVar2.f217712d = new e();
        this.f217700r = dVar2;
    }

    public final void setCurrentItem(int position) {
        getPager().g(position, false);
    }

    public final void setPager(@Y61.k ViewPager2 viewPager2) {
        this.pager = viewPager2;
    }

    /* compiled from: PhotoGallery2.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/ui/PhotoGallery2$a;", "Landroidx/viewpager2/widget/ViewPager2$i;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends ViewPager2.i {
        public a() {
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageSelected(int i12) {
            Y41.a<G0> aVar;
            PhotoGallery2 photoGallery2 = PhotoGallery2.this;
            g gVar = photoGallery2.f217685c;
            if (gVar == null) {
                gVar = null;
            }
            RecyclerView.Adapter adapter = photoGallery2.getPager().getAdapter();
            gVar.a(i12, adapter != null ? Integer.valueOf(adapter.getItemCount()) : null);
            i iVar = photoGallery2.f217698p;
            if (iVar != null) {
                iVar.a(i12);
            }
            com.avito.android.photo_gallery.ui.b bVar = photoGallery2.f217699q;
            if (bVar != null && bVar.a(i12) && (aVar = photoGallery2.f217691i) != null) {
                aVar.invoke();
            }
            com.avito.android.photo_gallery.ui.d dVar = photoGallery2.f217700r;
            com.avito.android.photo_gallery.ui.d dVar2 = dVar != null ? dVar : null;
            boolean zBooleanValue = ((Boolean) dVar2.f217711c.getOrDefault(Integer.valueOf(i12), Boolean.FALSE)).booleanValue();
            ViewGroup viewGroup = dVar2.f217709a;
            if (zBooleanValue) {
                D6.H(viewGroup);
            } else {
                D6.w(viewGroup);
            }
            R70.b bVar2 = photoGallery2.f217688f;
            if (bVar2 != null) {
                bVar2.O(i12, photoGallery2.f217693k);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageScrollStateChanged(int i12) {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public final void onPageScrolled(int i12, float f12, int i13) {
        }
    }
}
