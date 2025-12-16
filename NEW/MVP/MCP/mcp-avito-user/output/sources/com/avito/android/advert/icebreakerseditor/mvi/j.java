package com.avito.android.advert.icebreakerseditor.mvi;

import androidx.compose.runtime.internal.P;
import b4.C25408d;
import b4.InterfaceC25406b;
import com.avito.android.arch.mvi.u;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: IcebreakersEditorReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/icebreakerseditor/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lb4/b;", "Lb4/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements u<InterfaceC25406b, C25408d> {

    /* renamed from: b, reason: collision with root package name */
    public final int f71263b;

    @Inject
    public j(int i12) {
        this.f71263b = i12;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C25408d a(InterfaceC25406b interfaceC25406b, C25408d c25408d) {
        InterfaceC25406b interfaceC25406b2 = interfaceC25406b;
        C25408d c25408d2 = c25408d;
        if (interfaceC25406b2 instanceof InterfaceC25406b.i) {
            return C25408d.a(c25408d2, ((InterfaceC25406b.i) interfaceC25406b2).f56886a, null, false, false, 62);
        }
        boolean z12 = interfaceC25406b2 instanceof InterfaceC25406b.h;
        List<C25408d.c> list = c25408d2.f56891a;
        if (z12) {
            ArrayList arrayList = new ArrayList(list);
            ((InterfaceC25406b.h) interfaceC25406b2).getClass();
            arrayList.add(0, (C25408d.c) arrayList.remove(0));
            return C25408d.a(c25408d2, arrayList, null, false, false, 62);
        }
        boolean z13 = interfaceC25406b2 instanceof InterfaceC25406b.e;
        int i12 = this.f71263b;
        if (z13) {
            InterfaceC25406b.e eVar = (InterfaceC25406b.e) interfaceC25406b2;
            ArrayList arrayListI0 = C42745f0.i0(new C25408d.c(eVar.f56876a, eVar.f56877b), list);
            return C25408d.a(c25408d2, arrayListI0, null, arrayListI0.size() < i12, false, 58);
        }
        if (interfaceC25406b2 instanceof InterfaceC25406b.f) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((C25408d.c) obj).f56901a != ((InterfaceC25406b.f) interfaceC25406b2).f56880a) {
                    arrayList2.add(obj);
                }
            }
            return C25408d.a(c25408d2, arrayList2, null, arrayList2.size() < i12, arrayList2.size() > 1, 50);
        }
        boolean z14 = interfaceC25406b2 instanceof InterfaceC25406b.g;
        C25408d.b bVar = c25408d2.f56892b;
        if (!z14) {
            if (!(interfaceC25406b2 instanceof InterfaceC25406b.C1990b)) {
                return interfaceC25406b2 instanceof InterfaceC25406b.a ? C25408d.a(c25408d2, null, C25408d.b.a(bVar, null, 7), false, false, 61) : interfaceC25406b2 instanceof InterfaceC25406b.c ? C25408d.a(c25408d2, null, C25408d.b.a(bVar, ((InterfaceC25406b.c) interfaceC25406b2).f56874a, 11), false, false, 61) : c25408d2;
            }
            InterfaceC25406b.C1990b c1990b = (InterfaceC25406b.C1990b) interfaceC25406b2;
            return C25408d.a(c25408d2, null, new C25408d.b(c1990b.f56870a, c1990b.f56871b, c1990b.f56872c, true), false, c1990b.f56873d && list.size() > 1, 53);
        }
        List<C25408d.c> list2 = list;
        ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
        for (C25408d.c cVar : list2) {
            InterfaceC25406b.g gVar = (InterfaceC25406b.g) interfaceC25406b2;
            if (cVar.f56901a == gVar.f56881a) {
                cVar = new C25408d.c(gVar.f56882b, gVar.f56883c);
            }
            arrayList3.add(cVar);
        }
        return C25408d.a(c25408d2, arrayList3, C25408d.b.a(bVar, null, 7), false, false, 60);
    }
}
