package com.avito.android.photo_gallery.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.avito.android.R;
import com.avito.android.analytics.screens.AdvertScreen;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.photo_gallery.adapter.q;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L5;
import java.util.ArrayList;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PhotoGallery.kt */
@P
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/avito/android/photo_gallery/ui/PhotoGallery;", "Landroid/widget/FrameLayout;", "Landroidx/viewpager/widget/ViewPager$i;", "LR70/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/avito/android/photo_gallery/ui/PageIndicatorType;", "type", "Lkotlin/G0;", "setPageIndicatorType", "(Lcom/avito/android/photo_gallery/ui/PageIndicatorType;)V", "Landroidx/viewpager/widget/ViewPager;", "b", "Landroidx/viewpager/widget/ViewPager;", "getPager", "()Landroidx/viewpager/widget/ViewPager;", "setPager", "(Landroidx/viewpager/widget/ViewPager;)V", "pager", "Lcom/avito/android/photo_gallery/adapter/q;", "getCurrentItem", "()Lcom/avito/android/photo_gallery/adapter/q;", "currentItem", "", "getItemCount", "()I", "itemCount", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes14.dex */
public final class PhotoGallery extends FrameLayout implements ViewPager.i, R70.c {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f217675i = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public ViewPager pager;

    /* renamed from: c, reason: collision with root package name */
    public Handler f217677c;

    /* renamed from: d, reason: collision with root package name */
    public h f217678d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Toast f217679e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public R70.c f217680f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public com.avito.android.advert_details_items.photogallery.k f217681g;

    /* renamed from: h, reason: collision with root package name */
    public long f217682h;

    /* compiled from: PhotoGallery.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PageIndicatorType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PageIndicatorType pageIndicatorType = PageIndicatorType.f217671b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PhotoGallery(@Y61.k Context context, @Y61.k AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f217682h = -1L;
    }

    public static void a(PhotoGallery photoGallery, FragmentManager fragmentManager, Video video, NativeVideo nativeVideo, List list, String str, InterfaceC35845m2 interfaceC35845m2, com.avito.android.advert_details_items.photogallery.k kVar, int i12, long j12, AdvertScreen advertScreen, AutotekaTeaserResult autotekaTeaserResult, GalleryTeaser galleryTeaser, com.avito.android.advert_details_items.photogallery.k kVar2, List list2) {
        h hVar = photoGallery.f217678d;
        if (hVar == null) {
            hVar = null;
        }
        hVar.b(true);
        photoGallery.f217682h = j12;
        photoGallery.f217681g = kVar;
        photoGallery.f217680f = photoGallery;
        if ((video == null || !video.hasPreviewImage()) && ((nativeVideo == null || !nativeVideo.hasThumbnail()) && (list == null || list.isEmpty()))) {
            photoGallery.i();
            photoGallery.setVisibility(8);
            return;
        }
        androidx.viewpager.widget.a adapter = photoGallery.getPager().getAdapter();
        com.avito.android.photo_gallery.adapter.g gVar = adapter instanceof com.avito.android.photo_gallery.adapter.g ? (com.avito.android.photo_gallery.adapter.g) adapter : null;
        ArrayList arrayListB = com.avito.android.photo_gallery.adapter.p.b(video, nativeVideo, list, autotekaTeaserResult, galleryTeaser, false, null, null, null, list2, 480);
        if (gVar == null) {
            photoGallery.getPager().setAdapter(new com.avito.android.photo_gallery.adapter.g(photoGallery.getContext(), fragmentManager, arrayListB, str, photoGallery, interfaceC35845m2, true, advertScreen, null, new k(kVar2, photoGallery)));
        } else {
            Handler handler = photoGallery.f217677c;
            if (handler == null) {
                handler = null;
            }
            handler.post(new RunnableC28882d(23, gVar, arrayListB));
        }
        Handler handler2 = photoGallery.f217677c;
        (handler2 != null ? handler2 : null).post(new com.avito.android.checkable_image.d(photoGallery, arrayListB, video, i12, 1));
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void b(int i12) {
        androidx.viewpager.widget.a adapter = getPager().getAdapter();
        Integer numValueOf = adapter != null ? Integer.valueOf(adapter.c()) : null;
        h hVar = this.f217678d;
        (hVar != null ? hVar : null).a(i12, numValueOf);
        com.avito.android.advert_details_items.photogallery.k kVar = this.f217681g;
        if (kVar != null) {
            kVar.O(i12, this.f217682h);
        }
    }

    @Y61.k
    public final q getCurrentItem() {
        com.avito.android.photo_gallery.adapter.g gVar = (com.avito.android.photo_gallery.adapter.g) getPager().getAdapter();
        return gVar.f216723l.get(getPager().getCurrentItem());
    }

    public final int getItemCount() {
        androidx.viewpager.widget.a adapter;
        if (this.pager == null || (adapter = getPager().getAdapter()) == null) {
            return 0;
        }
        return adapter.c();
    }

    @Y61.k
    public final ViewPager getPager() {
        ViewPager viewPager = this.pager;
        if (viewPager != null) {
            return viewPager;
        }
        return null;
    }

    @Override // R70.c
    public final void i() {
        R70.c cVar;
        if (R70.g.a(this.f217679e)) {
            Toast toast = this.f217679e;
            if (toast != null) {
                toast.cancel();
            }
            this.f217679e = L5.a(getContext(), R.string.photo_load_error, 0);
        }
        if (L.f(this.f217680f, this) || (cVar = this.f217680f) == null) {
            return;
        }
        cVar.i();
    }

    @Override // R70.c
    public final void l() {
        R70.c cVar;
        if (L.f(this.f217680f, this) || (cVar = this.f217680f) == null) {
            return;
        }
        cVar.l();
    }

    @Override // android.view.View
    public final void onFinishInflate() throws Resources.NotFoundException {
        super.onFinishInflate();
        this.f217677c = new Handler();
        setPager((ViewPager) findViewById(R.id.photo_pager));
        getPager().setOffscreenPageLimit(1);
        getPager().c(this);
        setPageIndicatorType(PageIndicatorType.f217671b);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setPageIndicatorType(@Y61.k com.avito.android.photo_gallery.ui.PageIndicatorType r6) {
        /*
            r5 = this;
            com.avito.android.photo_gallery.ui.h r0 = r5.f217678d
            r1 = 1
            if (r0 == 0) goto L7
            r2 = r1
            goto L8
        L7:
            r2 = 0
        L8:
            r3 = 0
            if (r2 == 0) goto L17
            if (r0 != 0) goto Lf
            r4 = r3
            goto L10
        Lf:
            r4 = r0
        L10:
            boolean r4 = r4 instanceof com.avito.android.photo_gallery.ui.g
            if (r4 == 0) goto L17
            com.avito.android.photo_gallery.ui.PageIndicatorType r2 = com.avito.android.photo_gallery.ui.PageIndicatorType.f217671b
            goto L26
        L17:
            if (r2 == 0) goto L25
            if (r0 != 0) goto L1d
            r2 = r3
            goto L1e
        L1d:
            r2 = r0
        L1e:
            boolean r2 = r2 instanceof com.avito.android.photo_gallery.ui.f
            if (r2 == 0) goto L25
            com.avito.android.photo_gallery.ui.PageIndicatorType r2 = com.avito.android.photo_gallery.ui.PageIndicatorType.f217672c
            goto L26
        L25:
            r2 = r3
        L26:
            if (r2 == r6) goto L51
            if (r0 == 0) goto L31
            android.view.View r0 = r0.getView()
            com.avito.android.util.D6.z(r0)
        L31:
            int r6 = r6.ordinal()
            if (r6 == 0) goto L49
            if (r6 != r1) goto L43
            com.avito.android.photo_gallery.ui.f r6 = new com.avito.android.photo_gallery.ui.f
            androidx.viewpager.widget.ViewPager r0 = r5.getPager()
            r6.<init>(r5, r0)
            goto L4f
        L43:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L49:
            com.avito.android.photo_gallery.ui.g r6 = new com.avito.android.photo_gallery.ui.g
            r0 = 2
            r6.<init>(r5, r3, r0, r3)
        L4f:
            r5.f217678d = r6
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_gallery.ui.PhotoGallery.setPageIndicatorType(com.avito.android.photo_gallery.ui.PageIndicatorType):void");
    }

    public final void setPager(@Y61.k ViewPager viewPager) {
        this.pager = viewPager;
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void c(int i12) {
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public final void h(int i12, float f12, int i13) {
    }
}
