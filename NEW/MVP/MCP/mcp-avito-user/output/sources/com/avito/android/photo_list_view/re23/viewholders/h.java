package com.avito.android.photo_list_view.re23.viewholders;

import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.avito.android.R;
import com.avito.android.photo_list_view.AbstractC33209c;
import com.avito.android.photo_list_view.G;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.photo_list_view.re23.image.loading.PublishImageLoading;
import com.avito.android.photo_list_view.re23.image.loading.a;
import com.avito.android.photo_list_view_groups.analytics.ClickArea;
import com.avito.android.remote.model.category_parameters.ImageAction;
import com.avito.android.remote.model.category_parameters.Purpose;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImageLoadingViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/viewholders/h;", "Lcom/avito/android/photo_list_view/re23/viewholders/a;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends com.avito.android.photo_list_view.re23.viewholders.a {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f218308h = 0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<ImageAction> f218309c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g80.d f218310d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f218311e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final PublishImageLoading f218312f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.bottom_sheet.d f218313g;

    /* compiled from: ImageLoadingViewHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f218314a;

        static {
            int[] iArr = new int[Purpose.values().length];
            try {
                iArr[Purpose.EDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Purpose.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f218314a = iArr;
        }
    }

    /* compiled from: ImageLoadingViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            h.this.f218310d.b(null, ClickArea.f218472d);
            return G0.f406611a;
        }
    }

    /* compiled from: ImageLoadingViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ G f218317m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(G g12) {
            super(0);
            this.f218317m = g12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            h hVar = h.this;
            hVar.f218310d.b(null, ClickArea.f218471c);
            hVar.C80(this.f218317m, hVar.f218309c);
            return G0.f406611a;
        }
    }

    /* compiled from: ImageLoadingViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ G f218319m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(G g12) {
            super(0);
            this.f218319m = g12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            h hVar = h.this;
            hVar.f218310d.b(null, ClickArea.f218473e);
            hVar.C80(this.f218319m, hVar.f218309c);
            return G0.f406611a;
        }
    }

    public h(@Y61.k View view, @Y61.k com.avito.android.photo_list_view.re23.a aVar, @Y61.k List<ImageAction> list, @Y61.k g80.d dVar) {
        super(view, aVar);
        this.f218309c = list;
        this.f218310d = dVar;
        this.f218311e = view.getContext();
        this.f218312f = (PublishImageLoading) view.findViewById(R.id.image);
    }

    @Override // com.avito.android.photo_list_view.re23.viewholders.a
    public final void B80(@Y61.k InterfaceC33208b interfaceC33208b) throws Resources.NotFoundException {
        G g12 = (G) interfaceC33208b;
        if (!(interfaceC33208b.getF218094c() instanceof InterfaceC33208b.InterfaceC6540b.c)) {
            throw new IllegalStateException("Image state should be LOADING, but was " + interfaceC33208b.getF218094c());
        }
        a.d dVar = new a.d(interfaceC33208b.getF218093b(), new b());
        a.c cVar = new a.c();
        c cVar2 = new c(g12);
        AbstractC33209c abstractC33209c = g12.f218073f;
        com.avito.android.photo_list_view.re23.image.loading.a aVar = new com.avito.android.photo_list_view.re23.image.loading.a(dVar, cVar, abstractC33209c instanceof AbstractC33209c.C6544c ? new a.e.c(new j(this.f218310d)) : abstractC33209c instanceof AbstractC33209c.d ? new a.e.C6550a(((AbstractC33209c.d) abstractC33209c).f218158a, cVar2) : a.e.b.f218275a, new a.b(Collections.singletonList(new a.C6549a(new d(g12)))));
        PublishImageLoading publishImageLoading = this.f218312f;
        publishImageLoading.setState(aVar);
        publishImageLoading.setOnClickListener(new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j(15, this, g12));
    }

    public final void C80(G g12, List<ImageAction> list) {
        com.avito.android.photo_list_view.re23.j jVar = new com.avito.android.photo_list_view.re23.j(this.f218311e, new i(this, g12));
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ImageAction) obj).getPurpose() != Purpose.MAKE_FIRST) {
                arrayList.add(obj);
            }
        }
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f218313g;
        if (dVar != null) {
            dVar.dismiss();
        }
        this.f218313g = jVar.a(arrayList);
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33207a
    public final boolean isDraggable() {
        return false;
    }
}
