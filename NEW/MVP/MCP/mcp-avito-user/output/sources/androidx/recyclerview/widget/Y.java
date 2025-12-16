package androidx.recyclerview.widget;

import androidx.collection.C20204c0;
import androidx.collection.C20210f0;
import androidx.collection.o1;
import androidx.core.util.y;
import androidx.recyclerview.widget.RecyclerView;
import j.k0;

/* compiled from: ViewInfoStore.java */
/* loaded from: classes10.dex */
class Y {

    /* renamed from: a, reason: collision with root package name */
    @k0
    public final o1<RecyclerView.C, a> f53965a = new o1<>();

    /* renamed from: b, reason: collision with root package name */
    @k0
    public final C20204c0<RecyclerView.C> f53966b = new C20204c0<>();

    /* compiled from: ViewInfoStore.java */
    public static class a {

        /* renamed from: d, reason: collision with root package name */
        public static final y.b f53967d = new y.b(20);

        /* renamed from: a, reason: collision with root package name */
        public int f53968a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public RecyclerView.j.d f53969b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public RecyclerView.j.d f53970c;

        public static a a() {
            a aVar = (a) f53967d.b();
            return aVar == null ? new a() : aVar;
        }
    }

    /* compiled from: ViewInfoStore.java */
    public interface b {
    }

    public final void a(RecyclerView.C c12, RecyclerView.j.d dVar) {
        o1<RecyclerView.C, a> o1Var = this.f53965a;
        a aVarA = o1Var.get(c12);
        if (aVarA == null) {
            aVarA = a.a();
            o1Var.put(c12, aVarA);
        }
        aVarA.f53970c = dVar;
        aVarA.f53968a |= 8;
    }

    public final RecyclerView.j.d b(RecyclerView.C c12, int i12) {
        a aVarK;
        RecyclerView.j.d dVar;
        o1<RecyclerView.C, a> o1Var = this.f53965a;
        int iD2 = o1Var.d(c12);
        if (iD2 >= 0 && (aVarK = o1Var.k(iD2)) != null) {
            int i13 = aVarK.f53968a;
            if ((i13 & i12) != 0) {
                int i14 = i13 & (~i12);
                aVarK.f53968a = i14;
                if (i12 == 4) {
                    dVar = aVarK.f53969b;
                } else {
                    if (i12 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    dVar = aVarK.f53970c;
                }
                if ((i14 & 12) == 0) {
                    o1Var.h(iD2);
                    aVarK.f53968a = 0;
                    aVarK.f53969b = null;
                    aVarK.f53970c = null;
                    a.f53967d.a(aVarK);
                }
                return dVar;
            }
        }
        return null;
    }

    public final void c(RecyclerView.C c12) {
        a aVar = this.f53965a.get(c12);
        if (aVar == null) {
            return;
        }
        aVar.f53968a &= -2;
    }

    public final void d(RecyclerView.C c12) {
        C20204c0<RecyclerView.C> c20204c0 = this.f53966b;
        int iN2 = c20204c0.n() - 1;
        while (true) {
            if (iN2 < 0) {
                break;
            }
            if (c12 == c20204c0.o(iN2)) {
                Object[] objArr = c20204c0.f25691d;
                Object obj = objArr[iN2];
                Object obj2 = C20210f0.f25703a;
                if (obj != obj2) {
                    objArr[iN2] = obj2;
                    c20204c0.f25689b = true;
                }
            } else {
                iN2--;
            }
        }
        a aVarRemove = this.f53965a.remove(c12);
        if (aVarRemove != null) {
            aVarRemove.f53968a = 0;
            aVarRemove.f53969b = null;
            aVarRemove.f53970c = null;
            a.f53967d.a(aVarRemove);
        }
    }
}
