package androidx.recyclerview.widget;

import androidx.core.util.y;
import androidx.recyclerview.widget.H;
import com.avito.android.remote.model.ServiceTypeKt;
import java.util.ArrayList;

/* compiled from: AdapterHelper.java */
/* renamed from: androidx.recyclerview.widget.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C23410a implements H.a {

    /* renamed from: d, reason: collision with root package name */
    public final L f53974d;

    /* renamed from: a, reason: collision with root package name */
    public final y.b f53971a = new y.b(30);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f53972b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<b> f53973c = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    public int f53976f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final H f53975e = new H(this);

    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public interface InterfaceC1911a {
    }

    /* compiled from: AdapterHelper.java */
    /* renamed from: androidx.recyclerview.widget.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f53977a;

        /* renamed from: b, reason: collision with root package name */
        public int f53978b;

        /* renamed from: c, reason: collision with root package name */
        public Object f53979c;

        /* renamed from: d, reason: collision with root package name */
        public int f53980d;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i12 = this.f53977a;
            if (i12 != bVar.f53977a) {
                return false;
            }
            if (i12 == 8 && Math.abs(this.f53980d - this.f53978b) == 1 && this.f53980d == bVar.f53978b && this.f53978b == bVar.f53980d) {
                return true;
            }
            if (this.f53980d != bVar.f53980d || this.f53978b != bVar.f53978b) {
                return false;
            }
            Object obj2 = this.f53979c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f53979c)) {
                    return false;
                }
            } else if (bVar.f53979c != null) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (((this.f53977a * 31) + this.f53978b) * 31) + this.f53980d;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append("[");
            int i12 = this.f53977a;
            sb2.append(i12 != 1 ? i12 != 2 ? i12 != 4 ? i12 != 8 ? "??" : "mv" : ServiceTypeKt.SERVICE_PUSHUP : "rm" : "add");
            sb2.append(",s:");
            sb2.append(this.f53978b);
            sb2.append("c:");
            sb2.append(this.f53980d);
            sb2.append(",p:");
            return androidx.appcompat.app.r.o(this.f53979c, "]", sb2);
        }
    }

    public C23410a(L l12) {
        this.f53974d = l12;
    }

    public final boolean a(int i12) {
        ArrayList<b> arrayList = this.f53973c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            b bVar = arrayList.get(i13);
            int i14 = bVar.f53977a;
            if (i14 == 8) {
                if (f(bVar.f53980d, i13 + 1) == i12) {
                    return true;
                }
            } else if (i14 == 1) {
                int i15 = bVar.f53978b;
                int i16 = bVar.f53980d + i15;
                while (i15 < i16) {
                    if (f(i15, i13 + 1) == i12) {
                        return true;
                    }
                    i15++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList<b> arrayList = this.f53973c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            this.f53974d.a(arrayList.get(i12));
        }
        k(arrayList);
        this.f53976f = 0;
    }

    public final void c() {
        b();
        ArrayList<b> arrayList = this.f53972b;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = arrayList.get(i12);
            int i13 = bVar.f53977a;
            L l12 = this.f53974d;
            if (i13 == 1) {
                l12.a(bVar);
                l12.d(bVar.f53978b, bVar.f53980d);
            } else if (i13 == 2) {
                l12.a(bVar);
                l12.f(bVar.f53978b, bVar.f53980d);
            } else if (i13 == 4) {
                l12.a(bVar);
                l12.c(bVar.f53978b, bVar.f53980d, bVar.f53979c);
            } else if (i13 == 8) {
                l12.a(bVar);
                l12.e(bVar.f53978b, bVar.f53980d);
            }
        }
        k(arrayList);
        this.f53976f = 0;
    }

    public final void d(b bVar) {
        int i12;
        int i13 = bVar.f53977a;
        if (i13 == 1 || i13 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iL2 = l(bVar.f53978b, i13);
        int i14 = bVar.f53978b;
        int i15 = bVar.f53977a;
        if (i15 == 2) {
            i12 = 0;
        } else {
            if (i15 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i12 = 1;
        }
        int i16 = 1;
        for (int i17 = 1; i17 < bVar.f53980d; i17++) {
            int iL3 = l((i12 * i17) + bVar.f53978b, bVar.f53977a);
            int i18 = bVar.f53977a;
            if (i18 == 2 ? iL3 != iL2 : !(i18 == 4 && iL3 == iL2 + 1)) {
                b bVarH = h(bVar.f53979c, i18, iL2, i16);
                e(bVarH, i14);
                bVarH.f53979c = null;
                this.f53971a.a(bVarH);
                if (bVar.f53977a == 4) {
                    i14 += i16;
                }
                i16 = 1;
                iL2 = iL3;
            } else {
                i16++;
            }
        }
        Object obj = bVar.f53979c;
        bVar.f53979c = null;
        this.f53971a.a(bVar);
        if (i16 > 0) {
            b bVarH2 = h(obj, bVar.f53977a, iL2, i16);
            e(bVarH2, i14);
            bVarH2.f53979c = null;
            this.f53971a.a(bVarH2);
        }
    }

    public final void e(b bVar, int i12) {
        L l12 = this.f53974d;
        l12.a(bVar);
        int i13 = bVar.f53977a;
        if (i13 == 2) {
            l12.f(i12, bVar.f53980d);
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            l12.c(i12, bVar.f53980d, bVar.f53979c);
        }
    }

    public final int f(int i12, int i13) {
        ArrayList<b> arrayList = this.f53973c;
        int size = arrayList.size();
        while (i13 < size) {
            b bVar = arrayList.get(i13);
            int i14 = bVar.f53977a;
            if (i14 == 8) {
                int i15 = bVar.f53978b;
                if (i15 == i12) {
                    i12 = bVar.f53980d;
                } else {
                    if (i15 < i12) {
                        i12--;
                    }
                    if (bVar.f53980d <= i12) {
                        i12++;
                    }
                }
            } else {
                int i16 = bVar.f53978b;
                if (i16 > i12) {
                    continue;
                } else if (i14 == 2) {
                    int i17 = bVar.f53980d;
                    if (i12 < i16 + i17) {
                        return -1;
                    }
                    i12 -= i17;
                } else if (i14 == 1) {
                    i12 += bVar.f53980d;
                }
            }
            i13++;
        }
        return i12;
    }

    public final boolean g() {
        return this.f53972b.size() > 0;
    }

    public final b h(Object obj, int i12, int i13, int i14) {
        b bVar = (b) this.f53971a.b();
        if (bVar != null) {
            bVar.f53977a = i12;
            bVar.f53978b = i13;
            bVar.f53980d = i14;
            bVar.f53979c = obj;
            return bVar;
        }
        b bVar2 = new b();
        bVar2.f53977a = i12;
        bVar2.f53978b = i13;
        bVar2.f53980d = i14;
        bVar2.f53979c = obj;
        return bVar2;
    }

    public final void i(b bVar) {
        this.f53973c.add(bVar);
        int i12 = bVar.f53977a;
        L l12 = this.f53974d;
        if (i12 == 1) {
            l12.d(bVar.f53978b, bVar.f53980d);
            return;
        }
        if (i12 == 2) {
            int i13 = bVar.f53978b;
            int i14 = bVar.f53980d;
            RecyclerView recyclerView = l12.f53683a;
            recyclerView.g0(i13, i14, false);
            recyclerView.f53784l0 = true;
            return;
        }
        if (i12 == 4) {
            l12.c(bVar.f53978b, bVar.f53980d, bVar.f53979c);
        } else if (i12 == 8) {
            l12.e(bVar.f53978b, bVar.f53980d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C23410a.j():void");
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            b bVar = (b) arrayList.get(i12);
            bVar.f53979c = null;
            this.f53971a.a(bVar);
        }
        arrayList.clear();
    }

    public final int l(int i12, int i13) {
        int i14;
        int i15;
        ArrayList<b> arrayList = this.f53973c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = arrayList.get(size);
            int i16 = bVar.f53977a;
            if (i16 == 8) {
                int i17 = bVar.f53978b;
                int i18 = bVar.f53980d;
                if (i17 < i18) {
                    i15 = i17;
                    i14 = i18;
                } else {
                    i14 = i17;
                    i15 = i18;
                }
                if (i12 < i15 || i12 > i14) {
                    if (i12 < i17) {
                        if (i13 == 1) {
                            bVar.f53978b = i17 + 1;
                            bVar.f53980d = i18 + 1;
                        } else if (i13 == 2) {
                            bVar.f53978b = i17 - 1;
                            bVar.f53980d = i18 - 1;
                        }
                    }
                } else if (i15 == i17) {
                    if (i13 == 1) {
                        bVar.f53980d = i18 + 1;
                    } else if (i13 == 2) {
                        bVar.f53980d = i18 - 1;
                    }
                    i12++;
                } else {
                    if (i13 == 1) {
                        bVar.f53978b = i17 + 1;
                    } else if (i13 == 2) {
                        bVar.f53978b = i17 - 1;
                    }
                    i12--;
                }
            } else {
                int i19 = bVar.f53978b;
                if (i19 <= i12) {
                    if (i16 == 1) {
                        i12 -= bVar.f53980d;
                    } else if (i16 == 2) {
                        i12 += bVar.f53980d;
                    }
                } else if (i13 == 1) {
                    bVar.f53978b = i19 + 1;
                } else if (i13 == 2) {
                    bVar.f53978b = i19 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            b bVar2 = arrayList.get(size2);
            if (bVar2.f53977a == 8) {
                int i22 = bVar2.f53980d;
                if (i22 == bVar2.f53978b || i22 < 0) {
                    arrayList.remove(size2);
                    bVar2.f53979c = null;
                    this.f53971a.a(bVar2);
                }
            } else if (bVar2.f53980d <= 0) {
                arrayList.remove(size2);
                bVar2.f53979c = null;
                this.f53971a.a(bVar2);
            }
        }
        return i12;
    }
}
