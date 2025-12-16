package defpackage;

import android.os.SystemClock;
import androidx.media3.common.PlaybackException;
import java.math.BigInteger;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class q0h implements abh {
    public final k18 a;
    public final k18 b;
    public boolean d;
    public g2h f;
    public bbh j;
    public final String c = q0h.class.getName();
    public long e = -1;
    public long g = -1;
    public final EnumSet h = EnumSet.noneOf(p0h.class);
    public final LinkedHashMap i = new LinkedHashMap();
    public cm6 k = k54.v0;

    public q0h(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    @Override // defpackage.abh
    public final void a(g2h g2hVar) {
        lg8 lg8Var = lg8.d;
        String str = this.c;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            g2h g2hVar2 = this.f;
            l6bVar.c(lg8Var, str, "VideoContent(" + (g2hVar2 != null ? Long.valueOf(g2hVar2.i()) : null) + "): " + ((Object) ("onPreparingNewVideo: " + g2hVar)), null);
        }
        this.f = g2hVar;
        this.h.clear();
        j();
        this.d = false;
        this.g = SystemClock.elapsedRealtime();
        Integer num = 1;
        this.i.clear();
        g2h g2hVar3 = this.f;
        if (g2hVar3 == null) {
            String str2 = this.c;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 == null) {
                return;
            }
            lg8 lg8Var2 = lg8.X;
            if (l6bVar2.b(lg8Var2)) {
                g2h g2hVar4 = this.f;
                l6bVar2.c(lg8Var2, str2, "VideoContent(" + (g2hVar4 != null ? Long.valueOf(g2hVar4.i()) : null) + "): video is empty!", null);
                return;
            }
            return;
        }
        this.i.put("at", Integer.valueOf(az1.v(g2hVar3.getType())));
        if (g2hVar3.d()) {
            this.i.put("cached_data", num);
        }
        LinkedHashMap linkedHashMap = this.i;
        j7d j7dVar = k7d.a;
        linkedHashMap.put("vsid", new BigInteger(Long.toUnsignedString(k7d.b.d()), 10).toString(36));
        long jI = g2hVar3.i();
        Long lValueOf = Long.valueOf(jI);
        if (jI <= 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            this.i.put("vid", Long.valueOf(lValueOf.longValue()));
        }
        String host = g2hVar3.a().getHost();
        if (host != null) {
            if (host.length() <= 0) {
                host = null;
            }
            if (host != null) {
                this.i.put("cdn_host", host);
            }
        }
        String contentType = g2hVar3.getContentType();
        if (fni.a(contentType, "video/hls")) {
            num = 0;
        } else if (!fni.a(contentType, "application/dash+xml")) {
            num = fni.a(contentType, "video/mp4") ? 2 : null;
        }
        if (num != null) {
            this.i.put("ct", Integer.valueOf(num.intValue()));
        }
        bbh bbhVar = this.j;
        if (bbhVar != null) {
            this.i.put("place", Integer.valueOf(bbhVar.a));
        }
        String str3 = this.c;
        l6b l6bVar3 = wqi.a;
        if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
            g2h g2hVar5 = this.f;
            Long lValueOf2 = g2hVar5 != null ? Long.valueOf(g2hVar5.i()) : null;
            l6bVar3.c(lg8Var, str3, "VideoContent(" + lValueOf2 + "): " + ((Object) ("Build new params=" + this.i)), null);
        }
    }

    @Override // defpackage.abh
    public final void b() {
        String str = this.c;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                g2h g2hVar = this.f;
                l6bVar.c(lg8Var, str, "VideoContent(" + (g2hVar != null ? Long.valueOf(g2hVar.i()) : null) + "): onRelease", null);
            }
        }
        j();
        this.e = -1L;
        this.d = false;
    }

    @Override // defpackage.abh
    public final void c() {
        int i;
        String str = this.c;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                g2h g2hVar = this.f;
                l6bVar.c(lg8Var, str, "VideoContent(" + (g2hVar != null ? Long.valueOf(g2hVar.i()) : null) + "): onRenderedFirstFrame", null);
            }
        }
        if (this.f == null) {
            String str2 = this.c;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 == null) {
                return;
            }
            lg8 lg8Var2 = lg8.X;
            if (l6bVar2.b(lg8Var2)) {
                g2h g2hVar2 = this.f;
                l6bVar2.c(lg8Var2, str2, "VideoContent(" + (g2hVar2 != null ? Long.valueOf(g2hVar2.i()) : null) + "): VideoContent is null! Skip handling", null);
                return;
            }
            return;
        }
        EnumSet enumSet = this.h;
        p0h p0hVar = p0h.b;
        if (enumSet.contains(p0hVar)) {
            return;
        }
        this.h.add(p0hVar);
        String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.g);
        nn8 nn8Var = new nn8();
        nn8Var.putAll(this.i);
        gsc gscVar = (gsc) this.k.invoke();
        if (gscVar != null) {
            switch (gscVar.ordinal()) {
                case 0:
                    i = 8;
                    break;
                case 1:
                    i = 7;
                    break;
                case 2:
                    i = 6;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 3;
                    break;
                case 6:
                    i = 2;
                    break;
                case 7:
                    i = 1;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            nn8Var.put("quality", Integer.valueOf(i));
        }
        nn8Var.put("connection_type", Integer.valueOf(((ur3) this.b.getValue()).b().a));
        nn8Var.put("param", strValueOf);
        l("first_frame", nn8Var.b());
    }

    @Override // defpackage.abh
    public final void d() {
        String str = this.c;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                g2h g2hVar = this.f;
                l6bVar.c(lg8Var, str, "VideoContent(" + (g2hVar != null ? Long.valueOf(g2hVar.i()) : null) + "): onPlaybackEnded", null);
            }
        }
        j();
        this.e = -1L;
        this.d = false;
    }

    @Override // defpackage.abh
    public final void e() {
        String str = this.c;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                g2h g2hVar = this.f;
                l6bVar.c(lg8Var, str, "VideoContent(" + (g2hVar != null ? Long.valueOf(g2hVar.i()) : null) + "): onFirstBytes", null);
            }
        }
        if (this.f != null) {
            EnumSet enumSet = this.h;
            p0h p0hVar = p0h.c;
            if (enumSet.contains(p0hVar)) {
                return;
            }
            this.h.add(p0hVar);
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.g);
            nn8 nn8Var = new nn8();
            nn8Var.putAll(this.i);
            nn8Var.put("connection_type", Integer.valueOf(((ur3) this.b.getValue()).b().a));
            nn8Var.put("param", strValueOf);
            l("first_bytes", nn8Var.b());
            return;
        }
        String str2 = this.c;
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 == null) {
            return;
        }
        lg8 lg8Var2 = lg8.X;
        if (l6bVar2.b(lg8Var2)) {
            g2h g2hVar2 = this.f;
            l6bVar2.c(lg8Var2, str2, "VideoContent(" + (g2hVar2 != null ? Long.valueOf(g2hVar2.i()) : null) + "): VideoContent is null! Skip handling", null);
        }
    }

    @Override // defpackage.abh
    public final void h(boolean z) {
        String str = this.c;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                g2h g2hVar = this.f;
                Long lValueOf = g2hVar != null ? Long.valueOf(g2hVar.i()) : null;
                l6bVar.c(lg8Var, str, "VideoContent(" + lValueOf + "): " + ((Object) xc0.f("onPlaybackPrepared, playWhenReady=", z)), null);
            }
        }
        k();
    }

    @Override // defpackage.abh
    public final void i() {
        String str = this.c;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                g2h g2hVar = this.f;
                l6bVar.c(lg8Var, str, "VideoContent(" + (g2hVar != null ? Long.valueOf(g2hVar.i()) : null) + "): onVideoSeek", null);
            }
        }
        k();
        this.d = false;
    }

    public final void j() {
        int i;
        String str = this.c;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                g2h g2hVar = this.f;
                Long lValueOf = g2hVar != null ? Long.valueOf(g2hVar.i()) : null;
                l6bVar.c(lg8Var, str, "VideoContent(" + lValueOf + "): " + ((Object) vb9.e(this.e, "Check if prev video closed with empty buffer -> bufferingStartTime=")), null);
            }
        }
        if (this.e > 0) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.e);
            nn8 nn8Var = new nn8();
            nn8Var.putAll(this.i);
            gsc gscVar = (gsc) this.k.invoke();
            if (gscVar != null) {
                switch (gscVar.ordinal()) {
                    case 0:
                        i = 8;
                        break;
                    case 1:
                        i = 7;
                        break;
                    case 2:
                        i = 6;
                        break;
                    case 3:
                        i = 5;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 3;
                        break;
                    case 6:
                        i = 2;
                        break;
                    case 7:
                        i = 1;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                nn8Var.put("quality", Integer.valueOf(i));
            }
            nn8Var.put("connection_type", Integer.valueOf(((ur3) this.b.getValue()).b().a));
            nn8Var.put("param", strValueOf);
            l("close_at_empty_buffer", nn8Var.b());
            this.e = -1L;
        }
    }

    public final void k() {
        int i;
        String str = this.c;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                g2h g2hVar = this.f;
                Long lValueOf = g2hVar != null ? Long.valueOf(g2hVar.i()) : null;
                l6bVar.c(lg8Var, str, "VideoContent(" + lValueOf + "): " + ((Object) vb9.e(this.e, "Check if cur video has empty buffer -> bufferingStartTime=")), null);
            }
        }
        if (this.e > 0) {
            String strValueOf = String.valueOf(SystemClock.elapsedRealtime() - this.e);
            nn8 nn8Var = new nn8();
            nn8Var.putAll(this.i);
            gsc gscVar = (gsc) this.k.invoke();
            if (gscVar != null) {
                switch (gscVar.ordinal()) {
                    case 0:
                        i = 8;
                        break;
                    case 1:
                        i = 7;
                        break;
                    case 2:
                        i = 6;
                        break;
                    case 3:
                        i = 5;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 3;
                        break;
                    case 6:
                        i = 2;
                        break;
                    case 7:
                        i = 1;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                nn8Var.put("quality", Integer.valueOf(i));
            }
            nn8Var.put("connection_type", Integer.valueOf(((ur3) this.b.getValue()).b().a));
            nn8Var.put("param", strValueOf);
            l("empty_buffer", nn8Var.b());
            this.e = -1L;
        }
    }

    public final void l(String str, nn8 nn8Var) {
        ((dd) this.a.getValue()).h(new hg8("VIDEO_STATS", str, 0L, 0L, nn8Var, 0L, 44));
    }

    @Override // defpackage.abh
    public final void r() {
        String str = this.c;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                g2h g2hVar = this.f;
                l6bVar.c(lg8Var, str, "VideoContent(" + (g2hVar != null ? Long.valueOf(g2hVar.i()) : null) + "): onVideoPlay", null);
            }
        }
        if (this.f != null) {
            EnumSet enumSet = this.h;
            p0h p0hVar = p0h.a;
            if (enumSet.contains(p0hVar)) {
                return;
            }
            this.h.add(p0hVar);
            nn8 nn8Var = new nn8();
            nn8Var.putAll(this.i);
            nn8Var.put("connection_type", Integer.valueOf(((ur3) this.b.getValue()).b().a));
            nn8Var.put("param", "0");
            l("action_play", nn8Var.b());
            return;
        }
        String str2 = this.c;
        l6b l6bVar2 = wqi.a;
        if (l6bVar2 == null) {
            return;
        }
        lg8 lg8Var2 = lg8.X;
        if (l6bVar2.b(lg8Var2)) {
            g2h g2hVar2 = this.f;
            l6bVar2.c(lg8Var2, str2, "VideoContent(" + (g2hVar2 != null ? Long.valueOf(g2hVar2.i()) : null) + "): VideoContent is null! Skip handling", null);
        }
    }

    @Override // defpackage.abh
    public final void w() {
        String str = this.c;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                g2h g2hVar = this.f;
                Long lValueOf = g2hVar != null ? Long.valueOf(g2hVar.i()) : null;
                l6bVar.c(lg8Var, str, "VideoContent(" + lValueOf + "): " + ((Object) ("onPlaybackBuffering, isEmptyBuffer=" + this.d + ", bufferingStartTime=" + this.e)), null);
            }
        }
        if (this.d) {
            this.e = SystemClock.elapsedRealtime();
        } else {
            this.e = -1L;
            this.d = true;
        }
    }

    @Override // defpackage.abh
    public final void z(Throwable th) {
        int i;
        lg8 lg8Var = lg8.d;
        boolean z = th instanceof PlaybackException;
        if (z) {
            String str = this.c;
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                g2h g2hVar = this.f;
                Long lValueOf = g2hVar != null ? Long.valueOf(g2hVar.i()) : null;
                PlaybackException playbackException = (PlaybackException) th;
                l6bVar.c(lg8Var, str, "VideoContent(" + lValueOf + "): " + ((Object) ("onPlaybackError: errorCodeName=" + playbackException.b() + ", errorCode=" + playbackException.a)), null);
            }
        } else {
            String str2 = this.c;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                g2h g2hVar2 = this.f;
                Long lValueOf2 = g2hVar2 != null ? Long.valueOf(g2hVar2.i()) : null;
                l6bVar2.c(lg8Var, str2, "VideoContent(" + lValueOf2 + "): " + ((Object) "onPlaybackError: ".concat(th != null ? th.getClass().getSimpleName() : "'Unknown'")), null);
            }
        }
        String strB = z ? ((PlaybackException) th).b() : th != null ? th.getClass().getSimpleName() : "Unknown";
        nn8 nn8Var = new nn8();
        nn8Var.putAll(this.i);
        gsc gscVar = (gsc) this.k.invoke();
        if (gscVar != null) {
            switch (gscVar.ordinal()) {
                case 0:
                    i = 8;
                    break;
                case 1:
                    i = 7;
                    break;
                case 2:
                    i = 6;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 3;
                    break;
                case 6:
                    i = 2;
                    break;
                case 7:
                    i = 1;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            nn8Var.put("quality", Integer.valueOf(i));
        }
        nn8Var.put("connection_type", Integer.valueOf(((ur3) this.b.getValue()).b().a));
        nn8Var.put("param", strB);
        l("content_error", nn8Var.b());
    }
}
