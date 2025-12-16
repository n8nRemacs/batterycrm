package com.avito.android.photo_list_view_groups.view_holders;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.avito.android.R;
import com.avito.android.photo_list_view.AbstractC33209c;
import com.avito.android.photo_list_view.G;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.photo_list_view_groups.ImageGroups;
import com.avito.android.photo_list_view_groups.analytics.ClickArea;
import com.avito.android.photo_list_view_groups.image_with_group_loading.ImageWithGroupLoading;
import com.avito.android.photo_list_view_groups.image_with_group_loading.a;
import com.avito.android.photo_list_view_groups.o;
import com.avito.android.remote.model.category_parameters.ImageAction;
import com.avito.android.remote.model.category_parameters.ImageGroup;
import com.avito.android.remote.model.category_parameters.Purpose;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImageLoadingViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/view_holders/f;", "Lcom/avito/android/photo_list_view_groups/view_holders/m;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends m {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<ImageGroup> f218670c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<ImageAction> f218671d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_list_view_groups.h f218672e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final g80.d f218673f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f218674g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ImageWithGroupLoading f218675h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f218676i;

    /* compiled from: ImageLoadingViewHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f218677a;

        static {
            int[] iArr = new int[Purpose.values().length];
            try {
                iArr[Purpose.SELECT_GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Purpose.ADD_TO_LAYOUTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Purpose.REMOVE_FROM_LAYOUTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Purpose.EDIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Purpose.DELETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f218677a = iArr;
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
            f.this.f218673f.b(null, ClickArea.f218472d);
            return G0.f406611a;
        }
    }

    /* compiled from: ImageLoadingViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ G f218680m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(G g12) {
            super(0);
            this.f218680m = g12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            f fVar = f.this;
            fVar.f218673f.b(null, ClickArea.f218471c);
            int size = fVar.f218670c.size();
            G g12 = this.f218680m;
            if (size > 2) {
                f.C80(fVar, Purpose.SELECT_GROUP, g12, "tag");
            } else {
                fVar.D80(g12, fVar.f218671d);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ImageLoadingViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ G f218682m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(G g12) {
            super(0);
            this.f218682m = g12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            f fVar = f.this;
            fVar.f218673f.b(null, ClickArea.f218473e);
            fVar.D80(this.f218682m, fVar.f218671d);
            return G0.f406611a;
        }
    }

    public f(@Y61.k View view, @Y61.k com.avito.android.photo_list_view_groups.g gVar, @Y61.k List<ImageGroup> list, @Y61.k List<ImageAction> list2, @Y61.k com.avito.android.photo_list_view_groups.h hVar, @Y61.k g80.d dVar) {
        super(view, gVar);
        this.f218670c = list;
        this.f218671d = list2;
        this.f218672e = hVar;
        this.f218673f = dVar;
        this.f218674g = view.getContext();
        this.f218675h = (ImageWithGroupLoading) view.findViewById(R.id.image);
    }

    public static final void C80(f fVar, Purpose purpose, G g12, String str) {
        fVar.getClass();
        int i12 = a.f218677a[purpose.ordinal()];
        com.avito.android.photo_list_view_groups.h hVar = fVar.f218672e;
        if (i12 == 1) {
            String str2 = g12.f218068a;
            fVar.f218688b.g(str2, hVar.G7(str2), str, fVar.f218670c, false);
        } else if (i12 == 2) {
            Set setSingleton = Collections.singleton(g12.f218068a);
            ImageGroups[] imageGroupsArr = ImageGroups.f218467b;
            hVar.Nd("1", setSingleton);
        } else if (i12 != 3) {
            com.avito.android.photo_list_view_groups.g gVar = fVar.f218688b;
            if (i12 == 4) {
                String strI6 = hVar.i6(g12.f218072e);
                if (strI6 != null) {
                    hVar.h7(strI6);
                } else {
                    hVar.Yb();
                }
                gVar.b(g12.f218068a);
            } else {
                if (i12 != 5) {
                    throw new IllegalStateException("Action is not supported: " + purpose);
                }
                gVar.o(g12.f218068a);
                hVar.d7(g12.f218068a);
                hVar.td();
            }
        } else {
            Set setSingleton2 = Collections.singleton(g12.f218068a);
            ImageGroups[] imageGroupsArr2 = ImageGroups.f218467b;
            hVar.Nd("22", setSingleton2);
        }
        fVar.f218673f.a(purpose, g12.f218072e);
        com.avito.android.lib.design.bottom_sheet.d dVar = fVar.f218676i;
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    @Override // com.avito.android.photo_list_view_groups.view_holders.m
    public final void B80(@Y61.k InterfaceC33208b interfaceC33208b) throws Resources.NotFoundException {
        G g12 = (G) interfaceC33208b;
        if (!(interfaceC33208b.getF218094c() instanceof InterfaceC33208b.InterfaceC6540b.c)) {
            throw new IllegalStateException("Image state should be LOADING, but was " + interfaceC33208b.getF218094c());
        }
        a.d dVar = new a.d(interfaceC33208b.getF218093b(), new b());
        a.c cVar = new a.c();
        c cVar2 = new c(g12);
        AbstractC33209c abstractC33209c = g12.f218073f;
        com.avito.android.photo_list_view_groups.image_with_group_loading.a aVar = new com.avito.android.photo_list_view_groups.image_with_group_loading.a(dVar, cVar, abstractC33209c instanceof AbstractC33209c.C6544c ? new a.e.c(new h(this.f218673f)) : abstractC33209c instanceof AbstractC33209c.d ? new a.e.C6564a(((AbstractC33209c.d) abstractC33209c).f218158a, cVar2) : a.e.b.f218610a, new a.b(Collections.singletonList(new a.C6563a(new d(g12)))));
        ImageWithGroupLoading imageWithGroupLoading = this.f218675h;
        imageWithGroupLoading.setState(aVar);
        imageWithGroupLoading.setOnClickListener(new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j(18, this, g12));
    }

    public final void D80(G g12, List<ImageAction> list) {
        ArrayList arrayList;
        o oVar = new o(this.f218674g, new g(this, g12));
        String strG7 = this.f218672e.G7(g12.f218068a);
        ImageGroups[] imageGroupsArr = ImageGroups.f218467b;
        boolean zF2 = L.f(strG7, "1");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((ImageAction) obj).getPurpose() != Purpose.MAKE_FIRST) {
                arrayList2.add(obj);
            }
        }
        if (zF2) {
            arrayList = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((ImageAction) next).getPurpose() != Purpose.ADD_TO_LAYOUTS) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (((ImageAction) next2).getPurpose() != Purpose.REMOVE_FROM_LAYOUTS) {
                    arrayList.add(next2);
                }
            }
        }
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f218676i;
        if (dVar != null) {
            dVar.dismiss();
        }
        this.f218676i = oVar.a(arrayList);
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33207a
    public final boolean isDraggable() {
        return false;
    }
}
