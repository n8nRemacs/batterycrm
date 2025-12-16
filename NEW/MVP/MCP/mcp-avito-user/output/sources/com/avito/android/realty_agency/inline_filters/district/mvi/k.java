package com.avito.android.realty_agency.inline_filters.district.mvi;

import com.avito.android.arch.mvi.u;
import ii0.C41413d;
import ii0.InterfaceC41411b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: DistrictReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/district/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lii0/b;", "Lii0/d;", "<init>", "()V", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements u<InterfaceC41411b, C41413d> {
    @Inject
    public k() {
    }

    public static ArrayList b(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (C43066x.q(((com.avito.android.inline_filters.dialog.select.adapter.i) obj).f172093d, str == null ? "" : str, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static boolean c(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (((com.avito.android.inline_filters.dialog.select.adapter.i) it.next()).f172094e) {
                return true;
            }
        }
        return false;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C41413d a(InterfaceC41411b interfaceC41411b, C41413d c41413d) {
        InterfaceC41411b interfaceC41411b2 = interfaceC41411b;
        C41413d c41413d2 = c41413d;
        if (interfaceC41411b2 instanceof InterfaceC41411b.c) {
            InterfaceC41411b.c cVar = (InterfaceC41411b.c) interfaceC41411b2;
            String str = c41413d2.f398701b;
            List<com.avito.android.inline_filters.dialog.select.adapter.i> list = cVar.f398694a;
            return C41413d.a(c41413d2, list, null, b(str, list), c(cVar.f398694a), 2);
        }
        boolean z12 = interfaceC41411b2 instanceof InterfaceC41411b.e;
        List<com.avito.android.inline_filters.dialog.select.adapter.i> list2 = c41413d2.f398700a;
        if (z12) {
            String str2 = ((InterfaceC41411b.e) interfaceC41411b2).f398696a;
            return C41413d.a(c41413d2, null, str2, b(str2, list2), false, 9);
        }
        if (!(interfaceC41411b2 instanceof InterfaceC41411b.a)) {
            return interfaceC41411b2 instanceof InterfaceC41411b.d ? C41413d.a(c41413d2, null, null, null, c(list2), 7) : c41413d2;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            ((com.avito.android.inline_filters.dialog.select.adapter.i) it.next()).f172094e = false;
        }
        return C41413d.a(c41413d2, null, null, null, false, 7);
    }
}
