package com.avito.android.extended_profile_adverts.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.extended_profile_adverts.di.n;
import java.util.ArrayList;
import java.util.Collection;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import pA.b;
import qA.InterfaceC47264a;

/* compiled from: ProfileAdvertsReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_adverts/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "LpA/b;", "LpA/d;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n implements u<pA.b, pA.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f150949b;

    /* renamed from: c, reason: collision with root package name */
    public final int f150950c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47264a f150951d;

    @Inject
    public n(@n.e @Y61.l String str, @n.b int i12, @Y61.k InterfaceC47264a interfaceC47264a) {
        this.f150949b = str;
        this.f150950c = i12;
        this.f150951d = interfaceC47264a;
    }

    @Override // com.avito.android.arch.mvi.u
    public final pA.d a(pA.b bVar, pA.d dVar) {
        Collection collectionH0;
        pA.b bVar2 = bVar;
        pA.d dVar2 = dVar;
        boolean z12 = bVar2 instanceof b.C12256b;
        Object obj = dVar2.f428243a;
        int i12 = this.f150950c;
        if (z12) {
            Collection collection = (Collection) obj;
            ArrayList arrayList = new ArrayList(collection);
            C42745f0.l0(m.f150948l, arrayList);
            if (!collection.isEmpty()) {
                arrayList.add(new com.avito.android.extended_profile_adverts.adapter.loading_item.a(i12, null, 2, null));
            }
            return pA.d.a(dVar2, arrayList, true, null, null, 94);
        }
        if (bVar2 instanceof b.a) {
            if (dVar2.f428246d == 0) {
                collectionH0 = ((b.a) bVar2).f428234b;
            } else {
                ArrayList arrayList2 = new ArrayList((Collection) obj);
                C42745f0.l0(m.f150948l, arrayList2);
                collectionH0 = C42745f0.h0(((b.a) bVar2).f428234b, arrayList2);
            }
            ArrayList arrayList3 = new ArrayList(collectionH0);
            b.a aVar = (b.a) bVar2;
            boolean zIsEmpty = aVar.f428234b.isEmpty();
            boolean z13 = !zIsEmpty;
            ArrayList arrayList4 = new ArrayList();
            C42745f0.h(arrayList3, arrayList4);
            b(aVar.f428233a, arrayList4, z13);
            if (!zIsEmpty) {
                arrayList4.add(new com.avito.android.extended_profile_adverts.adapter.loading_item.a(i12, null, 2, null));
            }
            return new pA.d(arrayList4, C42745f0.h0(aVar.f428235c, (Collection) dVar2.f428244b), aVar.f428233a, arrayList3.size(), aVar.f428236d, false, z13, null, null);
        }
        if (bVar2 instanceof b.d) {
            ArrayList arrayList5 = new ArrayList();
            C42745f0.h(((b.d) bVar2).f428240a, arrayList5);
            boolean z14 = dVar2.f428249g;
            b(dVar2.f428245c, arrayList5, z14);
            if (dVar2.f428250h != null) {
                arrayList5.add(new com.avito.android.extended_profile_adverts.adapter.error_snippet.a(dVar2.f428250h, this.f150950c, null, 4, null));
            } else if (z14) {
                arrayList5.add(new com.avito.android.extended_profile_adverts.adapter.loading_item.a(i12, null, 2, null));
            }
            return pA.d.a(dVar2, arrayList5, false, null, null, 510);
        }
        if (!(bVar2 instanceof b.c)) {
            throw new NoWhenBranchMatchedException();
        }
        b.c cVar = (b.c) bVar2;
        this.f150951d.i(cVar.f428239b);
        ArrayList arrayList6 = new ArrayList((Collection) obj);
        C42745f0.l0(m.f150948l, arrayList6);
        String str = cVar.f428238a;
        arrayList6.add(new com.avito.android.extended_profile_adverts.adapter.error_snippet.a(str, this.f150950c, null, 4, null));
        return pA.d.a(dVar2, arrayList6, false, str, cVar.f428239b, 94);
    }

    public final void b(String str, ArrayList arrayList, boolean z12) {
        if (!z12 && str != null) {
            arrayList.add(new com.avito.android.extended_profile_adverts.adapter.placeholder.a(str, this.f150950c, null, 4, null));
        }
        if (z12 || this.f150949b == null) {
            return;
        }
        arrayList.add(new com.avito.android.public_profile.disclaimer.a(this.f150949b, this.f150950c, null, null, 12, null));
    }
}
