package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class fl4 implements bd3 {
    public final Context a;
    public final ej4 b;
    public final int c;
    public final zb8 d;

    public fl4(pea peaVar) {
        this.a = (Context) peaVar.c;
        this.b = (ej4) peaVar.d;
        this.c = peaVar.a;
        this.d = (zb8) peaVar.b;
    }

    public static ExportException c(hf6 hf6Var, String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
        String string = hf6Var.toString();
        String str2 = hf6Var.n;
        str2.getClass();
        return ExportException.c(illegalArgumentException, 3003, new i21(string, null, xz9.m(str2), true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (android.os.Build.MODEL.startsWith("SM-F936") != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    @Override // defpackage.bd3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.sk4 a(defpackage.hf6 r11, android.view.Surface r12, boolean r13, android.media.metrics.LogSessionId r14) throws androidx.media3.transformer.ExportException {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fl4.a(hf6, android.view.Surface, boolean, android.media.metrics.LogSessionId):sk4");
    }

    public final sk4 b(MediaFormat mediaFormat, hf6 hf6Var, Surface surface, boolean z, LogSessionId logSessionId) throws ExportException {
        MediaFormat mediaFormat2;
        hf6 hf6Var2;
        Surface surface2;
        t76 t76Var = wg7.b;
        zjd zjdVar = zjd.o;
        hf6Var.n.getClass();
        try {
            ArrayList arrayList = new ArrayList(dx8.f(this.d, hf6Var, false, false));
            Collections.sort(arrayList, new dj3(8, new vw8(0, hf6Var)));
            if (arrayList.isEmpty()) {
                throw c(hf6Var, "No decoders for format");
            }
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    pw8 pw8Var = (pw8) arrayList.get(i);
                    if (!pw8Var.h) {
                        arrayList2.add(pw8Var);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList = arrayList2;
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31 && ((pw8) arrayList.get(0)).c.equals("video/dolby-vision")) {
                mediaFormat.setInteger("color-transfer-request", 7);
            }
            if (i2 >= 35 && logSessionId != null) {
                sfi.k(mediaFormat, logSessionId);
            }
            ArrayList arrayList3 = new ArrayList();
            Context context = this.a;
            for (pw8 pw8Var2 : arrayList.subList(0, 1)) {
                mediaFormat.setString("mime", pw8Var2.c);
                try {
                    mediaFormat2 = mediaFormat;
                    hf6Var2 = hf6Var;
                    surface2 = surface;
                } catch (ExportException e) {
                    e = e;
                    mediaFormat2 = mediaFormat;
                    hf6Var2 = hf6Var;
                    surface2 = surface;
                }
                try {
                    sk4 sk4Var = new sk4(context, hf6Var2, mediaFormat2, pw8Var2.a, true, surface2);
                    sk4Var.c();
                    this.b.getClass();
                    return sk4Var;
                } catch (ExportException e2) {
                    e = e2;
                    arrayList3.add(e);
                    hf6Var = hf6Var2;
                    mediaFormat = mediaFormat2;
                    surface = surface2;
                }
            }
            throw ((ExportException) arrayList3.get(0));
        } catch (MediaCodecUtil$DecoderQueryException e3) {
            a8i.h("DefaultDecoderFactory", "Error querying decoders", e3);
            throw c(hf6Var, "Querying codecs failed");
        }
    }

    @Override // defpackage.bd3
    public final sk4 d(hf6 hf6Var, LogSessionId logSessionId) {
        return b(vui.c(hf6Var), hf6Var, null, false, logSessionId);
    }
}
