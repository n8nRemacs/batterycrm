package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class hm4 implements cd3 {
    public final int X;
    public final Context a;
    public final uy0 b;
    public j3h c;
    public final u1j d;
    public boolean o;

    public hm4(Context context) {
        this.a = context.getApplicationContext();
        this.b = uy0.X;
        this.c = j3h.l;
        this.d = u1j.c;
        this.o = true;
        this.X = -2000;
    }

    public static ExportException b(hf6 hf6Var, String str) {
        return ExportException.c(new IllegalArgumentException(str), 4003, new i21(hf6Var.toString(), null, xz9.m(hf6Var.n), false));
    }

    public static ExportException c(hf6 hf6Var, boolean z) {
        String str;
        gf3 gf3Var = hf6Var.D;
        if (z && gf3.h(gf3Var)) {
            str = "No MIME type is supported by both encoder and muxer. Requested HDR colorInfo: " + gf3Var;
        } else {
            str = "No MIME type is supported by both encoder and muxer.";
        }
        return ExportException.c(new IllegalArgumentException(str), 4003, new i21(hf6Var.toString(), null, z, false));
    }

    public static wg7 d(wg7 wg7Var, im4 im4Var) {
        ArrayList arrayList = new ArrayList(wg7Var.size());
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < wg7Var.size(); i2++) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) wg7Var.get(i2);
            int iA = im4Var.a(mediaCodecInfo);
            if (iA != Integer.MAX_VALUE) {
                if (iA < i) {
                    arrayList.clear();
                    arrayList.add(mediaCodecInfo);
                    i = iA;
                } else if (iA == i) {
                    arrayList.add(mediaCodecInfo);
                }
            }
        }
        return wg7.j(arrayList);
    }

    @Override // defpackage.cd3
    public sk4 a(hf6 hf6Var, LogSessionId logSessionId) throws ExportException {
        s7c s7cVar;
        if (hf6Var.j == -1) {
            ff6 ff6VarA = hf6Var.a();
            ff6VarA.h = 131072;
            hf6Var = new hf6(ff6VarA);
        }
        String str = hf6Var.n;
        if (str == null) {
            throw c(hf6Var, false);
        }
        MediaFormat mediaFormatC = vui.c(hf6Var);
        wg7 wg7VarE = ff5.e(str);
        if (wg7VarE.isEmpty()) {
            throw b(hf6Var, "No audio media codec found");
        }
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) wg7VarE.get(0);
        this.d.getClass();
        if (this.o) {
            int i = hf6Var.G;
            if (wg7VarE.isEmpty()) {
                s7cVar = null;
            } else {
                ArrayList arrayList = new ArrayList(wg7VarE.size());
                int i2 = Integer.MAX_VALUE;
                for (int i3 = 0; i3 < wg7VarE.size(); i3++) {
                    MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) wg7VarE.get(i3);
                    int iAbs = Math.abs(ff5.c(mediaCodecInfo2, str, i) - i);
                    if (iAbs != Integer.MAX_VALUE) {
                        if (iAbs < i2) {
                            arrayList.clear();
                            arrayList.add(mediaCodecInfo2);
                            i2 = iAbs;
                        } else if (iAbs == i2) {
                            arrayList.add(mediaCodecInfo2);
                        }
                    }
                }
                MediaCodecInfo mediaCodecInfo3 = (MediaCodecInfo) wg7.j(arrayList).get(0);
                int iC = ff5.c(mediaCodecInfo3, str, i);
                ff6 ff6VarA2 = hf6Var.a();
                ff6VarA2.F = iC;
                s7cVar = new s7c(mediaCodecInfo3, new hf6(ff6VarA2));
            }
            if (s7cVar != null) {
                mediaCodecInfo = (MediaCodecInfo) s7cVar.a;
                hf6Var = (hf6) s7cVar.b;
                mediaFormatC = vui.c(hf6Var);
            }
        }
        hf6 hf6Var2 = hf6Var;
        MediaFormat mediaFormat = mediaFormatC;
        if (Build.VERSION.SDK_INT >= 35 && logSessionId != null) {
            sfi.k(mediaFormat, logSessionId);
        }
        return new sk4(this.a, hf6Var2, mediaFormat, mediaCodecInfo.getName(), false, null);
    }

    @Override // defpackage.cd3
    public boolean e() {
        return !this.c.equals(j3h.l);
    }

    @Override // defpackage.cd3
    public boolean g() {
        return !this.d.equals(u1j.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152  */
    @Override // defpackage.cd3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.sk4 k(defpackage.hf6 r37, android.media.metrics.LogSessionId r38) throws androidx.media3.transformer.ExportException {
        /*
            Method dump skipped, instructions count: 1081
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm4.k(hf6, android.media.metrics.LogSessionId):sk4");
    }

    public hm4(hm4 hm4Var) {
        this.a = hm4Var.a;
        this.b = hm4Var.b;
        this.c = hm4Var.c;
        this.d = hm4Var.d;
        this.o = hm4Var.o;
        this.X = hm4Var.X;
    }
}
