package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.C23108t;
import androidx.media3.exoplayer.trackselection.g;
import com.google.common.collect.AbstractC37429w3;
import com.google.common.collect.S;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49901b;

    public /* synthetic */ d(int i12) {
        this.f49901b = i12;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i12 = 4;
        int i13 = 3;
        switch (this.f49901b) {
            case 0:
                return ((g.b) Collections.max((List) obj)).c((g.b) Collections.max((List) obj2));
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                return S.f359569a.c((g.j) Collections.max(list, new d(i13)), (g.j) Collections.max(list2, new d(i13)), new d(i13)).a(list.size(), list2.size()).c((g.j) Collections.max(list, new d(i12)), (g.j) Collections.max(list2, new d(i12)), new d(i12)).f();
            case 2:
                return ((g.h) ((List) obj).get(0)).c((g.h) ((List) obj2).get(0));
            case 3:
                g.j jVar = (g.j) obj;
                g.j jVar2 = (g.j) obj2;
                S sC2 = S.f359569a.d(jVar.f50014i, jVar2.f50014i).a(jVar.f50018m, jVar2.f50018m).d(jVar.f50019n, jVar2.f50019n).d(jVar.f50011f, jVar2.f50011f).d(jVar.f50013h, jVar2.f50013h).c(Integer.valueOf(jVar.f50017l), Integer.valueOf(jVar2.f50017l), AbstractC37429w3.d().h());
                boolean z12 = jVar2.f50022q;
                boolean z13 = jVar.f50022q;
                S sD2 = sC2.d(z13, z12);
                boolean z14 = jVar2.f50023r;
                boolean z15 = jVar.f50023r;
                S sD3 = sD2.d(z15, z14);
                if (z13 && z15) {
                    sD3 = sD3.a(jVar.f50024s, jVar2.f50024s);
                }
                return sD3.f();
            case 4:
                g.j jVar3 = (g.j) obj;
                g.j jVar4 = (g.j) obj2;
                Object objH = (jVar3.f50011f && jVar3.f50014i) ? g.f49906j : g.f49906j.h();
                S s5 = S.f359569a;
                int i14 = jVar3.f50015j;
                return s5.c(Integer.valueOf(i14), Integer.valueOf(jVar4.f50015j), jVar3.f50012g.f47506x ? g.f49906j.h() : g.f49907k).c(Integer.valueOf(jVar3.f50016k), Integer.valueOf(jVar4.f50016k), objH).c(Integer.valueOf(i14), Integer.valueOf(jVar4.f50015j), objH).f();
            case 5:
                return ((C23108t) obj2).f47753i - ((C23108t) obj).f47753i;
            case 6:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                AbstractC37429w3<Integer> abstractC37429w3 = g.f49906j;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            default:
                AbstractC37429w3<Integer> abstractC37429w32 = g.f49906j;
                return 0;
        }
    }
}
