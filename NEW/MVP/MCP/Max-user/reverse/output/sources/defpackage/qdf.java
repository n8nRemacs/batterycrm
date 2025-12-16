package defpackage;

import android.os.SystemClock;
import java.math.BigInteger;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import one.video.exo.error.OneVideoExoPlaybackException;
import one.video.exo.error.OneVideoExoRendererException;
import one.video.exo.error.OneVideoExoSourceException;
import ru.ok.android.onelog.OneLogDirect;

/* loaded from: classes2.dex */
public final class qdf implements jd5 {
    public boolean a;
    public final /* synthetic */ bwa b;

    public qdf(bwa bwaVar) {
        this.b = bwaVar;
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void b(ghb ghbVar) {
        y4c y4cVar = this.b.b;
        if (y4cVar != null) {
            a9i.b("first_bytes", y4cVar, new ey2(ghbVar, (Long) null), Long.valueOf(SystemClock.elapsedRealtime() - y4cVar.k));
        }
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void c(ghb ghbVar) {
        bwa bwaVar = this.b;
        bwaVar.c(ghbVar);
        bwa.a(bwaVar, ghbVar);
        this.a = false;
        y4c y4cVar = bwaVar.c;
        if (y4cVar != null) {
            bwaVar.b = y4cVar;
            bwaVar.c = null;
        }
        ((Set) bwaVar.e.b).clear();
        bwaVar.d = -1L;
        y4c y4cVar2 = bwaVar.b;
        if (y4cVar2 != null && y4cVar2.b != null) {
            ((n8i) bwaVar.g.c).a();
        }
        y4c y4cVar3 = bwaVar.b;
        if (y4cVar3 != null) {
            y4cVar3.k = SystemClock.elapsedRealtime();
        }
        y4c y4cVar4 = bwaVar.b;
        if (y4cVar4 == null || !((Set) bwaVar.e.b).add(z06.d)) {
            return;
        }
        ey2 ey2Var = new ey2(ghbVar, (Long) null);
        long j = 0 / 1000;
        if (y4cVar4.a != null) {
            OneLogDirect oneLogDirect = OneLogDirect.INSTANCE;
            oneLogDirect.flush();
            oneLogDirect.send(a9i.a("play", y4cVar4, ey2Var, Long.valueOf(j)));
        }
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void e(OneVideoExoPlaybackException oneVideoExoPlaybackException, uch uchVar, ghb ghbVar) {
        xy8 xy8Var;
        String strA;
        if6 if6Var;
        String str;
        y4c y4cVar = this.b.b;
        if (y4cVar != null) {
            ey2 ey2Var = new ey2(ghbVar, (Long) null);
            StringBuilder sb = new StringBuilder(oneVideoExoPlaybackException.a);
            sb.append(".");
            sb.append(oneVideoExoPlaybackException.b);
            int i = g8i.a[oneVideoExoPlaybackException.b.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    OneVideoExoRendererException oneVideoExoRendererException = oneVideoExoPlaybackException.d;
                    if (oneVideoExoRendererException != null && (str = oneVideoExoRendererException.a) != null) {
                        sb.append(".");
                        sb.append(str);
                    }
                    OneVideoExoRendererException oneVideoExoRendererException2 = oneVideoExoPlaybackException.d;
                    if (oneVideoExoRendererException2 != null && (if6Var = oneVideoExoRendererException2.c) != null) {
                        sb.append(".");
                        sb.append(if6Var);
                    }
                    OneVideoExoRendererException oneVideoExoRendererException3 = oneVideoExoPlaybackException.d;
                    if (oneVideoExoRendererException3 != null && (xy8Var = oneVideoExoRendererException3.b) != null && (strA = xy8Var.a()) != null) {
                        sb.append(".");
                        sb.append(strA);
                    }
                    OneVideoExoRendererException oneVideoExoRendererException4 = oneVideoExoPlaybackException.d;
                    if (oneVideoExoRendererException4 != null) {
                        sb.append(".");
                        String message = oneVideoExoRendererException4.getMessage();
                        sb.append(message != null ? message : "UNKNOWN_MESSAGE");
                    }
                } else if (i == 3) {
                    RuntimeException runtimeException = oneVideoExoPlaybackException.o;
                    if (runtimeException != null) {
                        sb.append(".");
                        String message2 = runtimeException.getMessage();
                        sb.append(message2 != null ? message2 : "UNKNOWN_MESSAGE");
                    }
                } else {
                    if (i != 4 && i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sb.append(".");
                    String message3 = oneVideoExoPlaybackException.getMessage();
                    sb.append(message3 != null ? message3 : "UNKNOWN_MESSAGE");
                }
            } else {
                OneVideoExoSourceException oneVideoExoSourceException = oneVideoExoPlaybackException.c;
                if (oneVideoExoSourceException != null) {
                    sb.append(".");
                    sb.append(oneVideoExoSourceException.getMessage());
                }
            }
            a9i.b("content_error", y4cVar, ey2Var, sb.toString());
        }
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void f(ghb ghbVar) {
        bwa bwaVar = this.b;
        y4c y4cVar = bwaVar.b;
        if (y4cVar == null || !((Set) bwaVar.e.b).add(z06.a)) {
            return;
        }
        a9i.b("first_frame", y4cVar, new ey2(ghbVar, (Long) null), Long.valueOf(SystemClock.elapsedRealtime() - y4cVar.k));
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void h(vgb vgbVar, adh adhVar) {
        bwa.b(this.b, vgbVar);
        this.a = false;
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void j(ghb ghbVar) {
        bwa bwaVar = this.b;
        if (bwaVar.b != null) {
            if (this.a) {
                bwaVar.d = SystemClock.elapsedRealtime();
            } else {
                bwaVar.d = -1L;
                this.a = true;
            }
        }
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void k(vgb vgbVar, adh adhVar) {
        v3h v3hVar;
        fk6 fk6VarB;
        hsc hscVar;
        y4c y4cVar = this.b.b;
        if (y4cVar != null) {
            hsc hscVar2 = null;
            ey2 ey2Var = new ey2(vgbVar, (Long) null);
            if (adhVar != null && (v3hVar = (v3h) ((xy8) adhVar.c)) != null && (fk6VarB = v3hVar.b()) != null) {
                switch (ayg.a[fk6VarB.ordinal()]) {
                    case 1:
                        hscVar = hsc._144p;
                        break;
                    case 2:
                        hscVar = hsc._240p;
                        break;
                    case 3:
                        hscVar = hsc._360p;
                        break;
                    case 4:
                        hscVar = hsc._480p;
                        break;
                    case 5:
                        hscVar = hsc._720p;
                        break;
                    case 6:
                        hscVar = hsc._1080p;
                        break;
                    case 7:
                        hscVar = hsc._1440p;
                        break;
                    case 8:
                        hscVar = hsc._2160p;
                        break;
                    case 9:
                        hscVar = hsc._4320p;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                hscVar2 = hscVar;
            }
            a9i.b("quality", y4cVar, ey2Var, hscVar2);
        }
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void p(ghb ghbVar) {
        bwa bwaVar = this.b;
        bwa.b(bwaVar, ghbVar);
        y4c y4cVar = bwaVar.b;
        if (y4cVar == null || !((Set) bwaVar.e.b).add(z06.c)) {
            return;
        }
        a9i.b("player_ready", y4cVar, new ey2(ghbVar, (Long) null), Long.valueOf(SystemClock.elapsedRealtime() - y4cVar.k));
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void q(ghb ghbVar, chb chbVar, c32 c32Var, c32 c32Var2) {
        bwa bwaVar = this.b;
        bwaVar.g.b();
        bwaVar.c(ghbVar);
        ey2 ey2Var = bwaVar.g;
        long j = c32Var2.c;
        ey2Var.a(j);
        bwaVar.c(ghbVar);
        y4c y4cVar = null;
        chb chbVar2 = chb.b;
        if (chbVar == chbVar2) {
            y4c y4cVar2 = bwaVar.b;
            if (y4cVar2 != null) {
                ey2 ey2Var2 = new ey2(ghbVar, (Long) null);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Long lValueOf = Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j));
                if (linkedHashMap.isEmpty()) {
                    Collections.singletonMap("time", lValueOf);
                } else {
                    new LinkedHashMap(linkedHashMap).put("time", lValueOf);
                }
                if (linkedHashMap.isEmpty()) {
                    Collections.singletonMap("param", "unknown");
                } else {
                    new LinkedHashMap(linkedHashMap).put("param", "unknown");
                }
                a9i.b("seek", y4cVar2, ey2Var2, linkedHashMap);
            }
            bwa.b(bwaVar, ghbVar);
            this.a = false;
        }
        if (c32Var.b != c32Var2.b) {
            if (chbVar == chbVar2 || chbVar == chb.a) {
                y4c y4cVar3 = bwaVar.c;
                if (y4cVar3 == null) {
                    y4c y4cVar4 = bwaVar.b;
                    if (y4cVar4 != null) {
                        j7d j7dVar = k7d.a;
                        y4cVar = new y4c(y4cVar4.a, new BigInteger(Long.toUnsignedString(k7d.b.d()), 10).toString(36), y4cVar4.c, y4cVar4.d, y4cVar4.e, y4cVar4.f, y4cVar4.g, y4cVar4.h, y4cVar4.i, y4cVar4.j);
                    }
                } else {
                    y4cVar = y4cVar3;
                }
                if (y4cVar != null) {
                    bwaVar.c = y4cVar;
                }
                c(ghbVar);
            }
        }
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void u(ghb ghbVar) {
        y4c y4cVar = this.b.b;
        if (y4cVar != null) {
            a9i.b("pause", y4cVar, new ey2(ghbVar, (Long) null), Long.valueOf(((vgb) ghbVar).g() / 1000));
        }
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void v(ghb ghbVar) {
        bwa bwaVar = this.b;
        bwa.a(bwaVar, ghbVar);
        y4c y4cVar = bwaVar.b;
        if (y4cVar != null) {
            a9i.b("stop", y4cVar, new ey2(ghbVar, (Long) null), null);
        }
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void w(ghb ghbVar, boolean z) {
        bwa bwaVar = this.b;
        y4c y4cVar = bwaVar.b;
        if (y4cVar != null) {
            if (!z) {
                bwaVar.g.b();
                bwaVar.c(ghbVar);
            } else {
                if (((Set) bwaVar.e.b).add(z06.b)) {
                    a9i.b("playing", y4cVar, new ey2(ghbVar, (Long) null), Long.valueOf(SystemClock.elapsedRealtime() - y4cVar.k));
                }
                bwaVar.g.a(((vgb) ghbVar).g());
            }
        }
    }
}
