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
import com.avito.android.photo_list_view_groups.image_with_group.ImageWithGroupContent;
import com.avito.android.photo_list_view_groups.image_with_group.a;
import com.avito.android.photo_list_view_groups.o;
import com.avito.android.remote.model.category_parameters.ImageAction;
import com.avito.android.remote.model.category_parameters.ImageGroup;
import com.avito.android.remote.model.category_parameters.Purpose;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImageContentViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view_groups/view_holders/a;", "Lcom/avito/android/photo_list_view_groups/view_holders/m;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends m {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_list_view_groups.b f218643c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<ImageGroup> f218644d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<ImageAction> f218645e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_list_view_groups.h f218646f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final g80.d f218647g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f218648h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ImageWithGroupContent f218649i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f218650j;

    /* compiled from: ImageContentViewHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_list_view_groups.view_holders.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C6565a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f218651a;

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
                iArr[Purpose.MAKE_FIRST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Purpose.EDIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Purpose.DELETE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f218651a = iArr;
        }
    }

    /* compiled from: ImageContentViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33208b f218653m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC33208b interfaceC33208b) {
            super(0);
            this.f218653m = interfaceC33208b;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a.this.f218647g.b(((G) this.f218653m).f218072e, ClickArea.f218472d);
            return G0.f406611a;
        }
    }

    /* compiled from: ImageContentViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33208b f218655m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ G f218656n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC33208b interfaceC33208b, G g12) {
            super(0);
            this.f218655m = interfaceC33208b;
            this.f218656n = g12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = a.this;
            aVar.f218647g.b(((G) this.f218655m).f218072e, ClickArea.f218471c);
            int size = aVar.f218644d.size();
            G g12 = this.f218656n;
            if (size > 2) {
                a.C80(aVar, Purpose.SELECT_GROUP, g12, "tag");
            } else {
                a.D80(aVar, g12, aVar.f218645e);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ImageContentViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33208b f218658m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ G f218659n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC33208b interfaceC33208b, G g12) {
            super(0);
            this.f218658m = interfaceC33208b;
            this.f218659n = g12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = a.this;
            aVar.f218647g.b(((G) this.f218658m).f218072e, ClickArea.f218473e);
            a.D80(aVar, this.f218659n, aVar.f218645e);
            return G0.f406611a;
        }
    }

    public a(@Y61.k View view, @Y61.k com.avito.android.photo_list_view_groups.g gVar, @Y61.k com.avito.android.photo_list_view_groups.b bVar, @Y61.k List<ImageGroup> list, @Y61.k List<ImageAction> list2, @Y61.k com.avito.android.photo_list_view_groups.h hVar, @Y61.k g80.d dVar) {
        super(view, gVar);
        this.f218643c = bVar;
        this.f218644d = list;
        this.f218645e = list2;
        this.f218646f = hVar;
        this.f218647g = dVar;
        this.f218648h = view.getContext();
        this.f218649i = (ImageWithGroupContent) view.findViewById(R.id.image);
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, java.util.List] */
    public static final void C80(a aVar, Purpose purpose, G g12, String str) {
        Object next;
        aVar.getClass();
        int i12 = C6565a.f218651a[purpose.ordinal()];
        com.avito.android.photo_list_view_groups.g gVar = aVar.f218688b;
        com.avito.android.photo_list_view_groups.h hVar = aVar.f218646f;
        switch (i12) {
            case 1:
                String str2 = g12.f218072e;
                aVar.f218688b.g(str2, hVar.i6(str2), str, aVar.f218644d, true);
                break;
            case 2:
                String str3 = g12.f218072e;
                ImageGroups[] imageGroupsArr = ImageGroups.f218467b;
                hVar.H9(str3, "1");
                break;
            case 3:
                String str4 = g12.f218072e;
                ImageGroups[] imageGroupsArr2 = ImageGroups.f218467b;
                hVar.H9(str4, "22");
                break;
            case 4:
                String str5 = g12.f218072e;
                com.avito.android.photo_list_view_groups.b bVar = aVar.f218643c;
                Iterable iterable = (Iterable) bVar.f218486l;
                ArrayList arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (obj instanceof G) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (L.f(((G) next).f218072e, str5)) {
                        }
                    } else {
                        next = null;
                    }
                }
                G g13 = (G) next;
                if (g13 != null) {
                    int iIndexOf = bVar.f218486l.indexOf(g13);
                    com.avito.android.photo_list_view_groups.g gVar2 = bVar.f218482h;
                    gVar2.u(iIndexOf, 0);
                    gVar2.r();
                    break;
                }
                break;
            case 5:
                String strI6 = hVar.i6(g12.f218072e);
                if (strI6 != null) {
                    hVar.h7(strI6);
                } else {
                    hVar.Yb();
                }
                gVar.b(g12.f218068a);
                break;
            case 6:
                gVar.o(g12.f218068a);
                hVar.p3(g12.f218072e);
                hVar.td();
                break;
        }
        aVar.f218647g.a(purpose, g12.f218072e);
        com.avito.android.lib.design.bottom_sheet.d dVar = aVar.f218650j;
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    public static final void D80(a aVar, G g12, List list) {
        ArrayList arrayList;
        o oVar = new o(aVar.f218648h, new com.avito.android.photo_list_view_groups.view_holders.b(aVar, g12));
        boolean z12 = aVar.getAdapterPosition() == 0;
        String strI6 = aVar.f218646f.i6(g12.f218072e);
        ImageGroups[] imageGroupsArr = ImageGroups.f218467b;
        boolean zF2 = L.f(strI6, "1");
        if (z12) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((ImageAction) obj).getPurpose() != Purpose.MAKE_FIRST) {
                    arrayList2.add(obj);
                }
            }
            list = arrayList2;
        }
        if (zF2) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((ImageAction) obj2).getPurpose() != Purpose.ADD_TO_LAYOUTS) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (((ImageAction) obj3).getPurpose() != Purpose.REMOVE_FROM_LAYOUTS) {
                    arrayList.add(obj3);
                }
            }
        }
        com.avito.android.lib.design.bottom_sheet.d dVar = aVar.f218650j;
        if (dVar != null) {
            dVar.dismiss();
        }
        aVar.f218650j = oVar.a(arrayList);
    }

    @Override // com.avito.android.photo_list_view_groups.view_holders.m
    public final void B80(@Y61.k InterfaceC33208b interfaceC33208b) throws Resources.NotFoundException {
        G g12 = (G) interfaceC33208b;
        if (!(interfaceC33208b.getF218094c() instanceof InterfaceC33208b.InterfaceC6540b.a)) {
            throw new IllegalStateException("Image state should be COMPLETED, but was " + interfaceC33208b.getF218094c());
        }
        a.c cVar = new a.c(interfaceC33208b.getF218093b(), new b(interfaceC33208b));
        c cVar2 = new c(interfaceC33208b, g12);
        AbstractC33209c abstractC33209c = g12.f218073f;
        com.avito.android.photo_list_view_groups.image_with_group.a aVar = new com.avito.android.photo_list_view_groups.image_with_group.a(cVar, abstractC33209c instanceof AbstractC33209c.e ? a.d.c.f218570a : abstractC33209c instanceof AbstractC33209c.d ? new a.d.C6561a(((AbstractC33209c.d) abstractC33209c).f218158a, cVar2) : a.d.b.f218569a, new a.b(Collections.singletonList(new a.C6560a(new d(interfaceC33208b, g12)))));
        ImageWithGroupContent imageWithGroupContent = this.f218649i;
        imageWithGroupContent.setState(aVar);
        AbstractC33209c.d dVar = abstractC33209c instanceof AbstractC33209c.d ? (AbstractC33209c.d) abstractC33209c : null;
        imageWithGroupContent.setStyle(new i80.b(dVar != null ? dVar.f218159b : null));
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33207a
    public final boolean isDraggable() {
        return true;
    }
}
