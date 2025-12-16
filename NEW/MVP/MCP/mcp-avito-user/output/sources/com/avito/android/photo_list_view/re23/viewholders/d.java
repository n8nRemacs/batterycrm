package com.avito.android.photo_list_view.re23.viewholders;

import Y41.l;
import com.avito.android.photo_list_view.G;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.photo_list_view.re23.viewholders.c;
import com.avito.android.remote.model.category_parameters.Purpose;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ImageContentViewHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/Purpose;", "purpose", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/Purpose;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d extends N implements l<Purpose, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f218298l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ G f218299m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, G g12) {
        super(1);
        this.f218298l = cVar;
        this.f218299m = g12;
    }

    @Override // Y41.l
    public final G0 invoke(Purpose purpose) {
        Object next;
        Purpose purpose2 = purpose;
        int i12 = c.f218282i;
        c cVar = this.f218298l;
        cVar.getClass();
        int i13 = c.a.f218289a[purpose2.ordinal()];
        G g12 = this.f218299m;
        if (i13 != 1) {
            com.avito.android.photo_list_view.re23.a aVar = cVar.f218279b;
            if (i13 == 2) {
                aVar.b(g12.f218068a);
            } else if (i13 == 3) {
                aVar.o(g12.f218068a);
            }
        } else {
            String str = g12.f218072e;
            com.avito.android.photo_list_view.re23.h hVar = cVar.f218283c;
            List<? extends InterfaceC33208b> list = hVar.f218212h;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof G) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((G) next).f218072e, str)) {
                    break;
                }
            }
            G g13 = (G) next;
            if (g13 != null) {
                int iIndexOf = hVar.f218212h.indexOf(g13);
                com.avito.android.photo_list_view.re23.a aVar2 = hVar.f218208d;
                aVar2.u(iIndexOf, 0);
                aVar2.r();
            }
        }
        cVar.f218285e.a(purpose2, g12.f218072e);
        com.avito.android.lib.design.bottom_sheet.d dVar = cVar.f218288h;
        if (dVar != null) {
            dVar.dismiss();
        }
        return G0.f406611a;
    }
}
