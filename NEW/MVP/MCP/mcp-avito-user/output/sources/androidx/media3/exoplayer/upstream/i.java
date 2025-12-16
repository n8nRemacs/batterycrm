package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.v;
import com.google.common.collect.AbstractC37401r1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements v.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f50127b;

    public /* synthetic */ i(Object obj, int i12) {
        this.f50126a = i12;
        this.f50127b = obj;
    }

    @Override // androidx.media3.common.util.v.c
    public final void a(int i12) {
        switch (this.f50126a) {
            case 0:
                j jVar = (j) this.f50127b;
                AbstractC37401r1<Long> abstractC37401r1 = j.f50128n;
                synchronized (jVar) {
                    int i13 = jVar.f50143i;
                    if (i13 == 0 || jVar.f50139e) {
                        if (i13 == i12) {
                            return;
                        }
                        jVar.f50143i = i12;
                        if (i12 != 1 && i12 != 0 && i12 != 8) {
                            jVar.f50146l = jVar.i(i12);
                            long jA2 = jVar.f50138d.a();
                            int i14 = jVar.f50140f > 0 ? (int) (jA2 - jVar.f50141g) : 0;
                            long j12 = jVar.f50142h;
                            long j13 = jVar.f50146l;
                            if (i14 != 0 || j12 != 0 || j13 != jVar.f50147m) {
                                jVar.f50147m = j13;
                                jVar.f50136b.b(i14, j12, j13);
                            }
                            jVar.f50141g = jA2;
                            jVar.f50142h = 0L;
                            jVar.f50145k = 0L;
                            jVar.f50144j = 0L;
                            p pVar = jVar.f50137c;
                            pVar.f50159b.clear();
                            pVar.f50161d = -1;
                            pVar.f50162e = 0;
                            pVar.f50163f = 0;
                            return;
                        }
                        return;
                    }
                    return;
                }
            default:
                androidx.media3.exoplayer.upstream.experimental.d dVar = (androidx.media3.exoplayer.upstream.experimental.d) this.f50127b;
                int i15 = androidx.media3.exoplayer.upstream.experimental.d.f50085f;
                synchronized (dVar) {
                    int i16 = dVar.f50090e;
                    if (i16 == 0 || dVar.f50089d) {
                        if (i16 == i12) {
                            return;
                        }
                        dVar.f50090e = i12;
                        if (i12 != 1 && i12 != 0 && i12 != 8) {
                            dVar.f50088c.f(dVar.h(i12));
                            dVar.f50087b.reset();
                            return;
                        }
                        return;
                    }
                    return;
                }
        }
    }
}
