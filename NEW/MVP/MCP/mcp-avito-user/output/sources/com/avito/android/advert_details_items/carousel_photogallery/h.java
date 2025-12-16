package com.avito.android.advert_details_items.carousel_photogallery;

import Y41.q;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.cyclic_gallery_widget.image_carousel.p;
import com.avito.android.cyclic_gallery_widget.image_carousel.r;
import com.avito.android.cyclic_gallery_widget.image_carousel.u;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Video;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: CarouselPhotoGalleryView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/carousel_photogallery/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/carousel_photogallery/g;", "a", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f84556b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f84557c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f84558d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final p f84559e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.cyclic_gallery_widget.image_carousel.i> f84560f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public y f84561g;

    /* compiled from: CarouselPhotoGalleryView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert_details_items/carousel_photogallery/h$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f84562b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ RecyclerView f84563c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q f84564d;

        public b(View view, RecyclerView recyclerView, q qVar) {
            this.f84562b = view;
            this.f84563c = recyclerView;
            this.f84564d = qVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            View childAt = this.f84563c.getChildAt(0);
            if (childAt != null) {
                this.f84564d.invoke(Integer.valueOf(childAt.getWidth()), Integer.valueOf(childAt.getHeight()), AsyncViewportTracker.ViewContext.f430410A);
            }
            this.f84562b.removeOnLayoutChangeListener(this);
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(View view, InterfaceC35845m2 interfaceC35845m2, InterfaceC28373a interfaceC28373a, boolean z12, Integer num, int i12, C42822w c42822w) throws BlueprintCollisionException {
        super(view);
        boolean z13 = (i12 & 8) != 0 ? false : z12;
        Integer num2 = (i12 & 16) != 0 ? null : num;
        this.f84556b = interfaceC35845m2;
        this.f84557c = interfaceC28373a;
        this.f84558d = view.getContext();
        com.jakewharton.rxrelay3.c<com.avito.android.cyclic_gallery_widget.image_carousel.i> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f84560f = cVar;
        View viewFindViewById = view.findViewById(R.id.photo_carousel);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        r rVar = new r(new u(1.3333334f, cVar), null, null, null, null, null, 62, null);
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(rVar);
        com.avito.konveyor.a aVarA = c10493a.a();
        this.f84559e = new p(viewFindViewById, new com.avito.konveyor.adapter.h(aVarA, aVarA, null, 4, null), aVarA, null, z13, null, num2, false, 160, null);
    }

    @Override // ru.avito.component.serp.AsyncViewportTracker
    public final void Z70(@Y61.k q<? super Integer, ? super Integer, ? super AsyncViewportTracker.ViewContext, G0> qVar) {
        RecyclerView recyclerView = this.f84559e.f132070e;
        if (D6.y(recyclerView)) {
            recyclerView.addOnLayoutChangeListener(new b(recyclerView, recyclerView, qVar));
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        p pVar = this.f84559e;
        pVar.f132081p = null;
        C42784z0 c42784z0 = C42784z0.f406748b;
        pVar.g(c42784z0, false);
        if (!L.f(pVar.f132075j, c42784z0)) {
            pVar.f132075j = c42784z0;
            pVar.h();
        }
        y yVar = this.f84561g;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f84561g = null;
    }

    @Override // com.avito.android.advert_details_items.carousel_photogallery.g
    public final void xB(@Y61.l List list, @Y61.l Video video, long j12, @Y61.l e eVar, @Y61.l e eVar2, int i12, boolean z12) {
        List<? extends com.avito.android.image_loader.k> listM0;
        p pVar = this.f84559e;
        pVar.f132082q = z12;
        if (list == null) {
            listM0 = C42784z0.f406748b;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.avito.android.image_loader.b.b((Image) it.next()));
            }
            listM0 = C42745f0.M0(arrayList);
        }
        pVar.g(listM0, false);
        List<Video> listSingletonList = video != null ? Collections.singletonList(video) : C42784z0.f406748b;
        if (!L.f(pVar.f132075j, listSingletonList)) {
            pVar.f132075j = listSingletonList;
            pVar.h();
        }
        pVar.f132081p = new i(eVar, j12);
        y yVar = this.f84561g;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f84561g = null;
        this.f84561g = (y) this.f84560f.N(j.f84567b).v0(new k(eVar2, this), l.f84570b, io.reactivex.rxjava3.internal.functions.a.f401993c);
        if (i12 >= 0) {
            pVar.f132070e.A0(i12);
        } else {
            pVar.f132070e.A0(0);
        }
    }
}
