package defpackage;

import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.video.exo.error.OneVideoExoPlaybackException;
import one.video.exo.error.OneVideoExoRendererException;
import one.video.exo.error.OneVideoExoSourceException;

/* loaded from: classes2.dex */
public final class ugb implements r3c {
    public final /* synthetic */ vgb a;

    public ugb(vgb vgbVar) {
        this.a = vgbVar;
    }

    @Override // defpackage.r3c
    public final void G0(k09 k09Var, int i) {
        if (i == 1 || i == 2 || i == 3) {
            vgb vgbVar = this.a;
            vgbVar.i.x(vgbVar, vgbVar.f());
        }
    }

    @Override // defpackage.r3c
    public final void L0(PlaybackException playbackException) {
        byte[] bArr;
        vgb vgbVar = this.a;
        OneVideoExoPlaybackException oneVideoExoPlaybackException = new OneVideoExoPlaybackException(playbackException.getMessage(), playbackException.getCause());
        oneVideoExoPlaybackException.a = "";
        ahb ahbVar = ahb.o;
        oneVideoExoPlaybackException.b = ahbVar;
        vsb vsbVar = x2c.a;
        oneVideoExoPlaybackException.a = playbackException.b();
        if (playbackException instanceof ExoPlaybackException) {
            vsb vsbVar2 = y2c.a;
            ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
            int i = exoPlaybackException.t0;
            ahb ahbVar2 = (ahb) y2c.a.get(Integer.valueOf(i));
            if (ahbVar2 != null) {
                ahbVar = ahbVar2;
            }
            oneVideoExoPlaybackException.b = ahbVar;
            int iOrdinal = ahbVar.ordinal();
            if (iOrdinal == 0) {
                hsi.g(exoPlaybackException.t0 == 0);
                Throwable cause = exoPlaybackException.getCause();
                cause.getClass();
                OneVideoExoSourceException oneVideoExoSourceException = new OneVideoExoSourceException((IOException) cause);
                oneVideoExoSourceException.getCause();
                Throwable cause2 = oneVideoExoSourceException.getCause();
                Object obj = null;
                HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException = cause2 instanceof HttpDataSource$InvalidResponseCodeException ? (HttpDataSource$InvalidResponseCodeException) cause2 : null;
                String str = (httpDataSource$InvalidResponseCodeException == null || (bArr = httpDataSource$InvalidResponseCodeException.X) == null) ? null : new String(bArr, lb2.a);
                if (str != null) {
                    Iterator it = rod.c.iterator();
                    while (true) {
                        f2 f2Var = (f2) it;
                        if (!f2Var.hasNext()) {
                            break;
                        }
                        Object next = f2Var.next();
                        if (fni.a(String.valueOf(((rod) next).a), str)) {
                            obj = next;
                            break;
                        }
                    }
                }
                oneVideoExoSourceException.getCause();
                oneVideoExoSourceException.getCause();
                oneVideoExoSourceException.getCause();
                oneVideoExoPlaybackException.c = oneVideoExoSourceException;
            } else if (iOrdinal == 1) {
                oneVideoExoPlaybackException.d = new OneVideoExoRendererException(exoPlaybackException);
            } else if (iOrdinal == 2) {
                hsi.g(i == 2);
                Throwable cause3 = exoPlaybackException.getCause();
                cause3.getClass();
                oneVideoExoPlaybackException.o = (RuntimeException) cause3;
            } else if (iOrdinal != 3 && iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
        }
        oneVideoExoPlaybackException.toString();
        if (vgbVar.y != 6) {
            vb9.i(6);
            int i2 = vgbVar.y;
            vgbVar.y = 6;
            vgbVar.w = oneVideoExoPlaybackException;
            vgbVar.i.s(vgbVar, i2, 6);
        }
        vgbVar.i.e(oneVideoExoPlaybackException, vgbVar.h(), vgbVar);
    }

    @Override // defpackage.r3c
    public final void c() {
        vgb vgbVar = this.a;
        vgbVar.i.f(vgbVar);
        if (vgbVar.b == null) {
            vgbVar.i.r(vgbVar);
        }
    }

    @Override // defpackage.r3c
    public final void i(int i, boolean z) {
        vgb vgbVar = this.a;
        oh6 oh6Var = vgbVar.i;
        oh6Var.n(vgbVar, z);
        if (vgbVar.M.getPlaybackState() == 3) {
            if (z) {
                rl0.c(vgbVar, 3);
            } else {
                rl0.c(vgbVar, 4);
            }
            oh6 oh6Var2 = vgbVar.i;
            if (z) {
                oh6Var2.l(vgbVar);
            } else {
                oh6Var2.u(vgbVar);
            }
        }
        if (i == 5) {
            oh6Var.a(vgbVar);
        }
    }

    @Override // defpackage.r3c
    public final void k(int i) {
        if (i == 1) {
            if (this.a.y != 6) {
                rl0.c(this.a, 1);
            }
            vgb vgbVar = this.a;
            vgbVar.i.v(vgbVar);
            return;
        }
        if (i == 2) {
            rl0.c(this.a, 2);
            vgb vgbVar2 = this.a;
            vgbVar2.H = vgbVar2.M.i();
            vgb vgbVar3 = this.a;
            vgbVar3.i.j(vgbVar3);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            rl0.c(this.a, 5);
            vgb vgbVar4 = this.a;
            vgbVar4.i.i(vgbVar4);
            return;
        }
        boolean zI = this.a.M.i();
        if (zI) {
            rl0.c(this.a, 3);
        } else {
            rl0.c(this.a, 4);
        }
        vgb vgbVar5 = this.a;
        vgbVar5.i.p(vgbVar5);
        vgb vgbVar6 = this.a;
        if (zI != vgbVar6.H) {
            if (zI) {
                vgbVar6.i.l(vgbVar6);
            } else {
                vgbVar6.i.u(vgbVar6);
            }
        }
        em5 em5Var = this.a.M;
        em5Var.A1();
        zjd zjdVar = em5Var.i1.a;
        ArrayList arrayList = new ArrayList(we3.q(zjdVar, 10));
        t76 t76VarListIterator = zjdVar.listIterator(0);
        while (t76VarListIterator.hasNext()) {
            arrayList.add(new xof((hb4) t76VarListIterator.next()));
        }
        Iterator it = this.a.m.iterator();
        if (it.hasNext()) {
            throw ctd.h(it);
        }
    }

    @Override // defpackage.r3c
    public final void n0(s9g s9gVar, int i) {
        vgb vgbVar = this.a;
        if (vgbVar.I != i) {
            vgbVar.I = i;
            if (i == 1) {
                vgbVar.j(s9gVar);
            }
        }
        vgbVar.h();
    }

    @Override // defpackage.r3c
    public final void q(boolean z) {
        vgb vgbVar = this.a;
        vgbVar.i.w(vgbVar, z);
    }

    @Override // defpackage.r3c
    public final void t(t3c t3cVar, t3c t3cVar2, int i) {
        vgb vgbVar = this.a;
        oh6 oh6Var = vgbVar.i;
        chb chbVar = (chb) kx4.a.get(Integer.valueOf(i));
        if (chbVar == null) {
            chbVar = chb.Y;
        }
        oh6Var.q(vgbVar, chbVar, vgb.e(vgbVar, t3cVar), vgb.e(vgbVar, t3cVar2));
    }
}
