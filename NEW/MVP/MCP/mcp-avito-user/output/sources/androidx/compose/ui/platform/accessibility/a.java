package androidx.compose.ui.platform.accessibility;

import E0.d;
import Y61.k;
import androidx.compose.ui.semantics.C22554b;
import androidx.compose.ui.semantics.C22555c;
import androidx.compose.ui.semantics.l;
import androidx.compose.ui.semantics.m;
import androidx.compose.ui.semantics.u;
import androidx.compose.ui.semantics.y;
import androidx.core.view.accessibility.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l0.g;

/* compiled from: CollectionInfo.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* compiled from: CollectionInfo.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.accessibility.a$a, reason: collision with other inner class name */
    public static final class C1675a extends N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final C1675a f41379l = new C1675a();

        public C1675a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final boolean a(ArrayList arrayList) {
        List list;
        long j12;
        if (arrayList.size() < 2) {
            return true;
        }
        if (arrayList.size() <= 1) {
            list = C42784z0.f406748b;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Object obj = arrayList.get(0);
            int size = arrayList.size() - 1;
            int i12 = 0;
            while (i12 < size) {
                i12++;
                Object obj2 = arrayList.get(i12);
                u uVar = (u) obj2;
                u uVar2 = (u) obj;
                arrayList2.add(g.a((Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (uVar2.e().f() >> 32)) - Float.intBitsToFloat((int) (uVar.e().f() >> 32)))) << 32) | (Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (uVar2.e().f() & 4294967295L)) - Float.intBitsToFloat((int) (uVar.e().f() & 4294967295L)))) & 4294967295L)));
                obj = obj2;
            }
            list = arrayList2;
        }
        if (list.size() == 1) {
            j12 = ((g) C42745f0.E(list)).f413387a;
        } else {
            if (list.isEmpty()) {
                d.d("Empty collection can't be reduced.");
            }
            Object objE = C42745f0.E(list);
            int size2 = list.size() - 1;
            if (1 <= size2) {
                int i13 = 1;
                while (true) {
                    objE = g.a(g.j(((g) objE).f413387a, ((g) list.get(i13)).f413387a));
                    if (i13 == size2) {
                        break;
                    }
                    i13++;
                }
            }
            j12 = ((g) objE).f413387a;
        }
        return Float.intBitsToFloat((int) (4294967295L & j12)) < Float.intBitsToFloat((int) (j12 >> 32));
    }

    public static final boolean b(@k u uVar) {
        l lVarI = uVar.i();
        y.f41820a.getClass();
        return (m.a(lVarI, y.f41826g) == null && m.a(uVar.i(), y.f41825f) == null) ? false : true;
    }

    public static final void c(@k u uVar, @k f fVar) {
        l lVarI = uVar.i();
        y.f41820a.getClass();
        if (((C22555c) m.a(lVarI, y.f41827h)) != null) {
            fVar.n(f.g.a(0, 0, 0, 0, ((Boolean) uVar.i().e(y.f41813H, b.f41380l)).booleanValue()));
        }
        u uVarJ = uVar.j();
        if (uVarJ == null || m.a(uVarJ.i(), y.f41825f) == null) {
            return;
        }
        C22554b c22554b = (C22554b) m.a(uVarJ.i(), y.f41826g);
        if (c22554b == null || (c22554b.f41729a >= 0 && c22554b.f41730b >= 0)) {
            if (uVar.i().f41786b.c(y.f41813H)) {
                ArrayList arrayList = new ArrayList();
                List listH = u.h(4, uVarJ);
                int size = listH.size();
                int i12 = 0;
                for (int i13 = 0; i13 < size; i13++) {
                    u uVar2 = (u) listH.get(i13);
                    l lVarI2 = uVar2.i();
                    y.f41820a.getClass();
                    if (lVarI2.f41786b.c(y.f41813H)) {
                        arrayList.add(uVar2);
                        if (uVar2.f41796c.L() < uVar.f41796c.L()) {
                            i12++;
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                boolean zA2 = a(arrayList);
                int i14 = zA2 ? 0 : i12;
                int i15 = zA2 ? i12 : 0;
                l lVarI3 = uVar.i();
                y.f41820a.getClass();
                fVar.n(f.g.a(i14, 1, i15, 1, ((Boolean) lVarI3.e(y.f41813H, C1675a.f41379l)).booleanValue()));
            }
        }
    }
}
