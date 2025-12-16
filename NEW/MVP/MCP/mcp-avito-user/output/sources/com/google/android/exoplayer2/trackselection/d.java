package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.trackselection.g;
import com.google.common.collect.AbstractC37429w3;
import com.google.common.collect.S;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f347167b;

    public /* synthetic */ d(int i12) {
        this.f347167b = i12;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i12 = 4;
        int i13 = 3;
        switch (this.f347167b) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                return S.f359569a.c((g.j) Collections.max(list, new d(i13)), (g.j) Collections.max(list2, new d(i13)), new d(i13)).a(list.size(), list2.size()).c((g.j) Collections.max(list, new d(i12)), (g.j) Collections.max(list2, new d(i12)), new d(i12)).f();
            case 1:
                return ((g.b) Collections.max((List) obj)).c((g.b) Collections.max((List) obj2));
            case 2:
                return ((g.h) ((List) obj).get(0)).c((g.h) ((List) obj2).get(0));
            case 3:
                g.j jVar = (g.j) obj;
                g.j jVar2 = (g.j) obj2;
                S sC2 = S.f359569a.d(jVar.f347255i, jVar2.f347255i).a(jVar.f347259m, jVar2.f347259m).d(jVar.f347260n, jVar2.f347260n).d(jVar.f347252f, jVar2.f347252f).d(jVar.f347254h, jVar2.f347254h).c(Integer.valueOf(jVar.f347258l), Integer.valueOf(jVar2.f347258l), AbstractC37429w3.d().h());
                boolean z12 = jVar2.f347263q;
                boolean z13 = jVar.f347263q;
                S sD2 = sC2.d(z13, z12);
                boolean z14 = jVar2.f347264r;
                boolean z15 = jVar.f347264r;
                S sD3 = sD2.d(z15, z14);
                if (z13 && z15) {
                    sD3 = sD3.a(jVar.f347265s, jVar2.f347265s);
                }
                return sD3.f();
            case 4:
                g.j jVar3 = (g.j) obj;
                g.j jVar4 = (g.j) obj2;
                Object objH = (jVar3.f347252f && jVar3.f347255i) ? g.f347172i : g.f347172i.h();
                S s5 = S.f359569a;
                int i14 = jVar3.f347256j;
                return s5.c(Integer.valueOf(i14), Integer.valueOf(jVar4.f347256j), jVar3.f347253g.f347305x ? g.f347172i.h() : g.f347173j).c(Integer.valueOf(jVar3.f347257k), Integer.valueOf(jVar4.f347257k), objH).c(Integer.valueOf(i14), Integer.valueOf(jVar4.f347256j), objH).f();
            case 5:
                return ((I) obj2).f343472i - ((I) obj).f343472i;
            case 6:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                AbstractC37429w3<Integer> abstractC37429w3 = g.f347172i;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            default:
                AbstractC37429w3<Integer> abstractC37429w32 = g.f347172i;
                return 0;
        }
    }
}
