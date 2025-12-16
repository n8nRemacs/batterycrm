package androidx.media3.exoplayer;

import androidx.media3.common.P;
import androidx.media3.common.util.C23110a;
import androidx.media3.exoplayer.A;
import androidx.media3.exoplayer.E;
import androidx.media3.exoplayer.source.A;
import java.util.Arrays;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.media3.exoplayer.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC23176u implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f50042b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f50043c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f50044d;

    public /* synthetic */ RunnableC23176u(int i12, Object obj, Object obj2) {
        this.f50042b = i12;
        this.f50043c = obj;
        this.f50044d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j12;
        boolean z12;
        switch (this.f50042b) {
            case 0:
                A a12 = (A) this.f50043c;
                E.d dVar = (E.d) this.f50044d;
                int i12 = a12.f48363F - dVar.f48478c;
                a12.f48363F = i12;
                boolean z13 = true;
                if (dVar.f48479d) {
                    a12.f48364G = dVar.f48480e;
                    a12.f48365H = true;
                }
                if (dVar.f48481f) {
                    a12.f48366I = dVar.f48482g;
                }
                if (i12 == 0) {
                    androidx.media3.common.P p12 = dVar.f48477b.f48593a;
                    if (!a12.f48392e0.f48593a.x() && p12.x()) {
                        a12.f48394f0 = -1;
                        a12.f48396g0 = 0L;
                    }
                    if (!p12.x()) {
                        List listAsList = Arrays.asList(((a0) p12).f48629n);
                        C23110a.g(listAsList.size() == a12.f48404o.size());
                        for (int i13 = 0; i13 < listAsList.size(); i13++) {
                            ((A.e) a12.f48404o.get(i13)).f48422b = (androidx.media3.common.P) listAsList.get(i13);
                        }
                    }
                    if (a12.f48365H) {
                        if (dVar.f48477b.f48594b.equals(a12.f48392e0.f48594b) && dVar.f48477b.f48596d == a12.f48392e0.f48610r) {
                            z13 = false;
                        }
                        if (!z13) {
                            j12 = -9223372036854775807L;
                        } else if (p12.x() || dVar.f48477b.f48594b.a()) {
                            j12 = dVar.f48477b.f48596d;
                        } else {
                            X x12 = dVar.f48477b;
                            A.b bVar = x12.f48594b;
                            long j13 = x12.f48596d;
                            Object obj = bVar.f47212a;
                            P.b bVar2 = a12.f48403n;
                            p12.o(obj, bVar2);
                            j12 = j13 + bVar2.f47383f;
                        }
                        z12 = z13;
                    } else {
                        j12 = -9223372036854775807L;
                        z12 = false;
                    }
                    a12.f48365H = false;
                    a12.w0(dVar.f48477b, 1, a12.f48366I, z12, a12.f48364G, j12, -1, false);
                    return;
                }
                return;
            default:
                Y y12 = (Y) this.f50044d;
                ((E) this.f50043c).getClass();
                try {
                    synchronized (y12) {
                    }
                    try {
                        y12.f48612a.b(y12.f48615d, y12.f48616e);
                        return;
                    } finally {
                        y12.b(true);
                    }
                } catch (ExoPlaybackException e12) {
                    androidx.media3.common.util.s.d("Unexpected error delivering message on external thread.", e12);
                    throw new RuntimeException(e12);
                }
        }
    }
}
