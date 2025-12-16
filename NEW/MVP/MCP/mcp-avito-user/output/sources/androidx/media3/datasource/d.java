package androidx.media3.datasource;

import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;
import java.util.ArrayList;

/* compiled from: BaseDataSource.java */
@J
/* loaded from: classes.dex */
public abstract class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f48226a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<B> f48227b = new ArrayList<>(1);

    /* renamed from: c, reason: collision with root package name */
    public int f48228c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public o f48229d;

    public d(boolean z12) {
        this.f48226a = z12;
    }

    @Override // androidx.media3.datasource.j
    @J
    public final void j(B b12) {
        b12.getClass();
        ArrayList<B> arrayList = this.f48227b;
        if (arrayList.contains(b12)) {
            return;
        }
        arrayList.add(b12);
        this.f48228c++;
    }

    public final void k(int i12) {
        o oVar = this.f48229d;
        int i13 = M.f47887a;
        for (int i14 = 0; i14 < this.f48228c; i14++) {
            this.f48227b.get(i14).e(this, oVar, this.f48226a, i12);
        }
    }

    public final void l() {
        o oVar = this.f48229d;
        int i12 = M.f47887a;
        for (int i13 = 0; i13 < this.f48228c; i13++) {
            this.f48227b.get(i13).g(this, oVar, this.f48226a);
        }
        this.f48229d = null;
    }

    public final void m(o oVar) {
        for (int i12 = 0; i12 < this.f48228c; i12++) {
            this.f48227b.get(i12).d(this, oVar, this.f48226a);
        }
    }

    public final void n(o oVar) {
        this.f48229d = oVar;
        for (int i12 = 0; i12 < this.f48228c; i12++) {
            this.f48227b.get(i12).f(this, oVar, this.f48226a);
        }
    }
}
