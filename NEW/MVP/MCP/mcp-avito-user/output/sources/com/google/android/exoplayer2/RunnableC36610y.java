package com.google.android.exoplayer2;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.G;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36605v;
import java.util.Arrays;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class RunnableC36610y implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f348412b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f348413c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f348414d;

    public /* synthetic */ RunnableC36610y(int i12, Object obj, Object obj2) {
        this.f348412b = i12;
        this.f348413c = obj;
        this.f348414d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j12;
        boolean z12;
        long j13;
        switch (this.f348412b) {
            case 0:
                C c12 = (C) this.f348413c;
                G.d dVar = (G.d) this.f348414d;
                int i12 = c12.f343316H - dVar.f343440c;
                c12.f343316H = i12;
                boolean z13 = true;
                if (dVar.f343441d) {
                    c12.f343317I = dVar.f343442e;
                    c12.f343318J = true;
                }
                if (dVar.f343443f) {
                    c12.f343319K = dVar.f343444g;
                }
                if (i12 == 0) {
                    s0 s0Var = dVar.f343439b.f344158a;
                    if (!c12.f343355k0.f344158a.p() && s0Var.p()) {
                        c12.f343357l0 = -1;
                        c12.f343359m0 = 0L;
                    }
                    if (!s0Var.p()) {
                        List listAsList = Arrays.asList(((f0) s0Var).f345412j);
                        C36585a.d(listAsList.size() == c12.f343361o.size());
                        for (int i13 = 0; i13 < listAsList.size(); i13++) {
                            ((C.e) c12.f343361o.get(i13)).f343379b = (s0) listAsList.get(i13);
                        }
                    }
                    if (c12.f343318J) {
                        if (dVar.f343439b.f344159b.equals(c12.f343355k0.f344159b) && dVar.f343439b.f344161d == c12.f343355k0.f344176s) {
                            z13 = false;
                        }
                        if (z13) {
                            if (s0Var.p() || dVar.f343439b.f344159b.a()) {
                                j13 = dVar.f343439b.f344161d;
                            } else {
                                b0 b0Var = dVar.f343439b;
                                y.b bVar = b0Var.f344159b;
                                long j14 = b0Var.f344161d;
                                Object obj = bVar.f346696a;
                                s0.b bVar2 = c12.f343360n;
                                s0Var.g(obj, bVar2);
                                j13 = j14 + bVar2.f345874f;
                            }
                            z12 = z13;
                            j12 = j13;
                        } else {
                            j12 = -9223372036854775807L;
                            z12 = z13;
                        }
                    } else {
                        j12 = -9223372036854775807L;
                        z12 = false;
                    }
                    c12.f343318J = false;
                    c12.m0(dVar.f343439b, 1, c12.f343319K, false, z12, c12.f343317I, j12, -1);
                    return;
                }
                return;
            default:
                e0 e0Var = (e0) this.f348414d;
                ((G) this.f348413c).getClass();
                try {
                    synchronized (e0Var) {
                    }
                    try {
                        e0Var.f344363a.b(e0Var.f344366d, e0Var.f344367e);
                        return;
                    } finally {
                        e0Var.b(true);
                    }
                } catch (ExoPlaybackException e12) {
                    C36605v.a("Unexpected error delivering message on external thread.", e12);
                    throw new RuntimeException(e12);
                }
        }
    }
}
