package com.avito.android.photo_list_view.re23.viewholders;

import Y61.l;
import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.photo_list_view.G;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.photo_list_view.re23.image.content.PublishImageContent;
import com.avito.android.photo_list_view_groups.analytics.ClickArea;
import com.avito.android.remote.model.category_parameters.ImageAction;
import com.avito.android.remote.model.category_parameters.Purpose;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ImageContentViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/re23/viewholders/c;", "Lcom/avito/android/photo_list_view/re23/viewholders/a;", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends com.avito.android.photo_list_view.re23.viewholders.a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f218282i = 0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.photo_list_view.re23.h f218283c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<ImageAction> f218284d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final g80.d f218285e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f218286f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final PublishImageContent f218287g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.bottom_sheet.d f218288h;

    /* compiled from: ImageContentViewHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f218289a;

        static {
            int[] iArr = new int[Purpose.values().length];
            try {
                iArr[Purpose.MAKE_FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Purpose.EDIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Purpose.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f218289a = iArr;
        }
    }

    /* compiled from: ImageContentViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33208b f218291m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC33208b interfaceC33208b) {
            super(0);
            this.f218291m = interfaceC33208b;
        }

        @Override // Y41.a
        public final G0 invoke() {
            c.this.f218285e.b(((G) this.f218291m).f218072e, ClickArea.f218472d);
            return G0.f406611a;
        }
    }

    /* compiled from: ImageContentViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.photo_list_view.re23.viewholders.c$c, reason: collision with other inner class name */
    public static final class C6551c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33208b f218293m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ G f218294n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6551c(InterfaceC33208b interfaceC33208b, G g12) {
            super(0);
            this.f218293m = interfaceC33208b;
            this.f218294n = g12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            c cVar = c.this;
            cVar.f218285e.b(((G) this.f218293m).f218072e, ClickArea.f218471c);
            c.C80(cVar, this.f218294n, cVar.f218284d);
            return G0.f406611a;
        }
    }

    /* compiled from: ImageContentViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33208b f218296m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ G f218297n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC33208b interfaceC33208b, G g12) {
            super(0);
            this.f218296m = interfaceC33208b;
            this.f218297n = g12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            c cVar = c.this;
            cVar.f218285e.b(((G) this.f218296m).f218072e, ClickArea.f218473e);
            c.C80(cVar, this.f218297n, cVar.f218284d);
            return G0.f406611a;
        }
    }

    public c(@Y61.k View view, @Y61.k com.avito.android.photo_list_view.re23.a aVar, @Y61.k com.avito.android.photo_list_view.re23.h hVar, @Y61.k List list, @Y61.k g80.d dVar) {
        super(view, aVar);
        this.f218283c = hVar;
        this.f218284d = list;
        this.f218285e = dVar;
        this.f218286f = view.getContext();
        this.f218287g = (PublishImageContent) view.findViewById(R.id.image);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void C80(c cVar, G g12, List list) {
        com.avito.android.photo_list_view.re23.j jVar = new com.avito.android.photo_list_view.re23.j(cVar.f218286f, new com.avito.android.photo_list_view.re23.viewholders.d(cVar, g12));
        if (cVar.getBindingAdapterPosition() == 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ImageAction) obj).getPurpose() != Purpose.MAKE_FIRST) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        com.avito.android.lib.design.bottom_sheet.d dVar = cVar.f218288h;
        if (dVar != null) {
            dVar.dismiss();
        }
        cVar.f218288h = jVar.a(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    @Override // com.avito.android.photo_list_view.re23.viewholders.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B80(@Y61.k com.avito.android.photo_list_view.InterfaceC33208b r10) {
        /*
            r9 = this;
            r0 = r10
            com.avito.android.photo_list_view.G r0 = (com.avito.android.photo_list_view.G) r0
            com.avito.android.photo_list_view.b$b r1 = r10.getF218094c()
            boolean r1 = r1 instanceof com.avito.android.photo_list_view.InterfaceC33208b.InterfaceC6540b.a
            if (r1 == 0) goto L8e
            java.util.List r1 = r10.a()
            java.lang.Object r1 = kotlin.collections.C42745f0.G(r1)
            com.avito.android.photo_list_view.b$a r1 = (com.avito.android.photo_list_view.InterfaceC33208b.a) r1
            r2 = 0
            if (r1 == 0) goto L2e
            com.avito.android.printable_text.PrintableText r1 = r1.f218110a
            if (r1 == 0) goto L23
            android.content.Context r3 = r9.f218286f
            java.lang.String r1 = r1.k0(r3)
            goto L24
        L23:
            r1 = r2
        L24:
            if (r1 == 0) goto L2e
            com.avito.android.photo_list_view.c$d r3 = new com.avito.android.photo_list_view.c$d
            java.lang.String r4 = "white"
            r3.<init>(r1, r4)
            goto L30
        L2e:
            com.avito.android.photo_list_view.c$b r3 = com.avito.android.photo_list_view.AbstractC33209c.b.f218156a
        L30:
            com.avito.android.photo_list_view.re23.image.content.a r1 = new com.avito.android.photo_list_view.re23.image.content.a
            com.avito.android.photo_list_view.re23.image.content.a$c r4 = new com.avito.android.photo_list_view.re23.image.content.a$c
            android.net.Uri r5 = r10.getF218093b()
            com.avito.android.photo_list_view.re23.viewholders.c$b r6 = new com.avito.android.photo_list_view.re23.viewholders.c$b
            r6.<init>(r10)
            r4.<init>(r5, r6)
            com.avito.android.photo_list_view.re23.viewholders.c$c r5 = new com.avito.android.photo_list_view.re23.viewholders.c$c
            r5.<init>(r10, r0)
            boolean r6 = r3 instanceof com.avito.android.photo_list_view.AbstractC33209c.e
            if (r6 == 0) goto L4c
            com.avito.android.photo_list_view.re23.image.content.a$d$c r5 = com.avito.android.photo_list_view.re23.image.content.a.d.c.f218235a
            goto L5e
        L4c:
            boolean r6 = r3 instanceof com.avito.android.photo_list_view.AbstractC33209c.d
            if (r6 == 0) goto L5c
            com.avito.android.photo_list_view.re23.image.content.a$d$a r6 = new com.avito.android.photo_list_view.re23.image.content.a$d$a
            r7 = r3
            com.avito.android.photo_list_view.c$d r7 = (com.avito.android.photo_list_view.AbstractC33209c.d) r7
            java.lang.String r7 = r7.f218158a
            r6.<init>(r7, r5)
            r5 = r6
            goto L5e
        L5c:
            com.avito.android.photo_list_view.re23.image.content.a$d$b r5 = com.avito.android.photo_list_view.re23.image.content.a.d.b.f218234a
        L5e:
            com.avito.android.photo_list_view.re23.image.content.a$b r6 = new com.avito.android.photo_list_view.re23.image.content.a$b
            com.avito.android.photo_list_view.re23.image.content.a$a r7 = new com.avito.android.photo_list_view.re23.image.content.a$a
            com.avito.android.photo_list_view.re23.viewholders.c$d r8 = new com.avito.android.photo_list_view.re23.viewholders.c$d
            r8.<init>(r10, r0)
            r7.<init>(r8)
            java.util.List r10 = java.util.Collections.singletonList(r7)
            r6.<init>(r10)
            r1.<init>(r4, r5, r6)
            com.avito.android.photo_list_view.re23.image.content.PublishImageContent r10 = r9.f218287g
            r10.setState(r1)
            b80.c r0 = new b80.c
            boolean r1 = r3 instanceof com.avito.android.photo_list_view.AbstractC33209c.d
            if (r1 == 0) goto L82
            com.avito.android.photo_list_view.c$d r3 = (com.avito.android.photo_list_view.AbstractC33209c.d) r3
            goto L83
        L82:
            r3 = r2
        L83:
            if (r3 == 0) goto L87
            java.lang.String r2 = r3.f218159b
        L87:
            r0.<init>(r2)
            r10.setStyle(r0)
            return
        L8e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Image state should be COMPLETED, but was "
            r1.<init>(r2)
            com.avito.android.photo_list_view.b$b r10 = r10.getF218094c()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.photo_list_view.re23.viewholders.c.B80(com.avito.android.photo_list_view.b):void");
    }

    @Override // com.avito.android.photo_list_view.InterfaceC33207a
    public final boolean isDraggable() {
        return true;
    }
}
