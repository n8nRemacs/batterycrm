package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class sz2 extends xfh {
    public static final /* synthetic */ yy7[] H0 = {new z8a(sz2.class, "createChannelJob", "getCreateChannelJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, sz2.class, "updateChannelJob", "getUpdateChannelJob()Lkotlinx/coroutines/Job;")};
    public final AtomicLong A0;
    public final t9f B0;
    public final t9f C0;
    public x9f D0;
    public volatile String E0;
    public String F0;
    public String G0;
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final long[] b;
    public final raf c;
    public final age d;
    public final k18 o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final tcf w0;
    public final hbd x0;
    public final ci5 y0;
    public final ci5 z0;

    public sz2(long[] jArr, raf rafVar) {
        paf pafVar = paf.a;
        age ageVarA = pafVar.a();
        bwf bwfVarD = pafVar.getAccessor().d(79);
        bwf bwfVarD2 = pafVar.getAccessor().d(8);
        bwf bwfVarD3 = pafVar.getAccessor().d(10);
        bwf bwfVarD4 = pafVar.getAccessor().d(111);
        bwf bwfVarD5 = pafVar.getAccessor().d(109);
        bwf bwfVar = new bwf(new z0e(pafVar.getAccessor().a, 457, false));
        bwf bwfVarD6 = pafVar.getAccessor().d(454);
        bwf bwfVarD7 = pafVar.getAccessor().d(12);
        bwf bwfVarD8 = pafVar.getAccessor().d(584);
        bwf bwfVarD9 = pafVar.getAccessor().d(48);
        this.b = jArr;
        this.c = rafVar;
        this.d = ageVarA;
        this.o = bwfVarD;
        this.X = bwfVarD3;
        this.Y = bwfVarD2;
        this.Z = bwfVarD4;
        this.s0 = bwfVarD5;
        this.t0 = bwfVar;
        this.u0 = bwfVarD6;
        this.v0 = bwfVarD7;
        tcf tcfVarA = ucf.a(new iz2(null, null, null));
        this.w0 = tcfVarA;
        this.x0 = new hbd(tcfVarA);
        this.y0 = new ci5(0);
        this.z0 = new ci5(0);
        this.A0 = new AtomicLong();
        this.B0 = c7j.c();
        this.C0 = c7j.c();
        this.F0 = "";
        this.G0 = "";
        if (rafVar == raf.c) {
            gw0.w(new g56(new gbd(((r94) bwfVarD8.getValue()).a), new kz2(this, bwfVarD2, bwfVarD9, null), 1), this.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0074 A[Catch: all -> 0x004c, TryCatch #2 {all -> 0x004c, blocks: (B:35:0x00a1, B:20:0x0048, B:29:0x006f, B:31:0x0074), top: B:53:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable t(defpackage.sz2 r8, java.lang.String r9, android.graphics.Rect r10, defpackage.q44 r11) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz2.t(sz2, java.lang.String, android.graphics.Rect, q44):java.io.Serializable");
    }

    public final lzf u() {
        return (lzf) this.Y.getValue();
    }

    public final iz5 v() {
        return (iz5) this.Z.getValue();
    }

    public final void w() {
        Object ipdVar;
        if (!((qsb) this.X.getValue()).c(qsb.m)) {
            xfh.r(this.y0, yy2.b);
            return;
        }
        try {
            this.E0 = String.valueOf(System.currentTimeMillis());
            Uri uriFromFile = Uri.fromFile(v().p(this.E0));
            if (!uriFromFile.toString().startsWith("content://")) {
                uriFromFile = v().f((Context) this.v0.getValue(), ioi.c(uriFromFile));
            }
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", uriFromFile);
            intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
            ipdVar = intent;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            x();
            wqi.e(sz2.class.getName(), "capturePhoto: failed to capture photo", thA);
        }
        if (ipdVar instanceof ipd) {
            return;
        }
        xfh.r(this.y0, new xy2((Intent) ipdVar));
    }

    public final void x() {
        this.E0 = null;
        ccb ccbVar = (ccb) this.u0.getValue();
        ccbVar.g(new n5g(mvd.r));
        ccbVar.e(new qcb(yud.J));
        ccbVar.i();
    }
}
