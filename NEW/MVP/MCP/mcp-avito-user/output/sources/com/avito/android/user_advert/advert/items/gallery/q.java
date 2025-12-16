package com.avito.android.user_advert.advert.items.gallery;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.R;
import com.avito.android.analytics.screens.MyAdvertDetailsScreen;
import com.avito.android.photo_gallery.adapter.q;
import com.avito.android.photo_gallery.ui.PhotoGallery2;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.Video;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L5;
import com.avito.android.util.R0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MyAdvertGalleryItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/gallery/q;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/gallery/n;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class q extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f309438b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final r f309439c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f309440d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f309441e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final PhotoGallery2 f309442f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ViewPager2 f309443g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Context f309444h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public N f309445i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f309446j;

    public q(@Y61.k View view, @Y61.k R0 r02, @Y61.k r rVar, @Y61.k InterfaceC35845m2 interfaceC35845m2) {
        super(view);
        this.f309438b = r02;
        this.f309439c = rVar;
        this.f309440d = interfaceC35845m2;
        this.f309441e = view.findViewById(R.id.photo_gallery_stub);
        PhotoGallery2 photoGallery2 = (PhotoGallery2) view.findViewById(R.id.gallery_holder);
        this.f309442f = photoGallery2;
        ViewPager2 pager = photoGallery2.getPager();
        this.f309443g = pager;
        this.f309444h = view.getContext();
        photoGallery2.b();
        pager.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.user_advert.advert.items.gallery.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                q qVar = this.f309436b;
                PhotoGallery2 photoGallery22 = qVar.f309442f;
                if (!(photoGallery22.getCurrentItem() instanceof q.c ? C35835l0.o(photoGallery22.getContext()) : true)) {
                    L5.a(qVar.f309444h, R.string.network_unavailable_message, 0);
                    return;
                }
                Y41.l<? super Integer, G0> lVar = qVar.f309446j;
                if (lVar != null) {
                    ((j) lVar).invoke(Integer.valueOf(qVar.f309443g.getCurrentItem()));
                }
            }
        });
    }

    @Override // com.avito.android.user_advert.advert.items.gallery.n
    public final void K20(int i12) {
        ViewPager2 viewPager2 = this.f309443g;
        if (i12 == viewPager2.getCurrentItem() || i12 < 0) {
            return;
        }
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        if (i12 < (adapter != null ? adapter.getItemCount() : 0)) {
            this.f309442f.setCurrentItem(i12);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.gallery.n
    public final void i10(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f309446j = lVar;
    }

    @Override // com.avito.android.user_advert.advert.items.gallery.n
    public final void iK(@Y61.k List<Image> list, @Y61.l Video video, @Y61.l NativeVideo nativeVideo) {
        boolean zIsEmpty = list.isEmpty();
        View view = this.f309441e;
        PhotoGallery2 photoGallery2 = this.f309442f;
        if (zIsEmpty && nativeVideo == null && video == null) {
            D6.w(photoGallery2);
            D6.H(view);
            return;
        }
        D6.w(view);
        D6.H(photoGallery2);
        r rVar = this.f309439c;
        FragmentManager fragmentManagerA = rVar.a();
        Lifecycle lifecycle = rVar.b().getLifecycle();
        MyAdvertDetailsScreen myAdvertDetailsScreen = MyAdvertDetailsScreen.f90434d;
        PhotoGallery2.c(this.f309442f, this.f309438b, fragmentManagerA, lifecycle, null, null, null, video, nativeVideo, list, null, this.f309440d, new p(this), null, null, null, 0, 0L, null, myAdvertDetailsScreen, null, null, null, null, null, null, null, null, null, 2019493888);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f309446j = null;
        this.f309445i = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.user_advert.advert.items.gallery.n
    public final void z10(@Y61.l Y41.l<? super Integer, G0> lVar) {
        this.f309445i = (N) lVar;
    }
}
