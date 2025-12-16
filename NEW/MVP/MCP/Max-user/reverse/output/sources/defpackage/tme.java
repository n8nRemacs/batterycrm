package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class tme extends xfh {
    public static final /* synthetic */ yy7[] z0;
    public final k18 X;
    public final k18 Y;
    public final t9f Z;
    public final dna b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final tcf s0;
    public final hbd t0;
    public final ci5 u0;
    public final ConcurrentHashMap v0;
    public final bwf w0;
    public Integer x0;
    public final Object y0;

    static {
        z8a z8aVar = new z8a(tme.class, "updateRingtoneJob", "getUpdateRingtoneJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        z0 = new yy7[]{z8aVar};
    }

    public tme(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, dna dnaVar) {
        bwf bwfVarD = ire.a.getAccessor().d(156);
        this.b = dnaVar;
        this.c = k18Var;
        this.d = k18Var2;
        this.o = k18Var3;
        this.X = bwfVarD;
        this.Y = k18Var4;
        this.Z = c7j.c();
        tcf tcfVarA = ucf.a(hd5.a);
        this.s0 = tcfVarA;
        this.t0 = new hbd(tcfVarA);
        this.u0 = new ci5(0);
        this.v0 = new ConcurrentHashMap();
        this.w0 = new bwf(new lme(this, 0));
        this.y0 = ipi.b(3, new efd(18));
        xfh.o(this, ((q2b) ((lzf) k18Var.getValue())).b(), new mme(this, null), 2);
    }

    public static final Object t(tme tmeVar, dtf dtfVar) {
        Object objI = svi.i(((q2b) ((lzf) tmeVar.c.getValue())).a(), new qme(tmeVar, null), dtfVar);
        return objI == g84.a ? objI : qqg.a;
    }

    public final q34 u(Uri uri) throws Throwable {
        k18 k18Var = this.o;
        q34 q34VarD = xpi.d((Context) k18Var.getValue(), uri.toString(), ((iz5) this.d.getValue()).b);
        if (q34VarD == null) {
            x();
            return null;
        }
        long j = q34VarD.b;
        ci5 ci5Var = this.u0;
        if (j > 52428800) {
            xfh.r(ci5Var, new ore(ivd.i1, new n5g(sbb.g)));
            return null;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            if (mediaMetadataRetriever instanceof AutoCloseable) {
                MediaMetadataRetriever mediaMetadataRetriever2 = mediaMetadataRetriever;
                try {
                    MediaMetadataRetriever mediaMetadataRetriever3 = mediaMetadataRetriever2;
                    mediaMetadataRetriever3.setDataSource((Context) k18Var.getValue(), uri);
                    String strExtractMetadata = mediaMetadataRetriever3.extractMetadata(16);
                    String strExtractMetadata2 = mediaMetadataRetriever3.extractMetadata(9);
                    Long lValueOf = strExtractMetadata2 != null ? Long.valueOf(Long.parseLong(strExtractMetadata2)) : null;
                    if (strExtractMetadata != null && !vmf.F(strExtractMetadata) && lValueOf != null) {
                        if (lValueOf.longValue() <= 900000) {
                            bui.a(mediaMetadataRetriever2, null);
                            return q34VarD;
                        }
                        xfh.r(ci5Var, new ore(ivd.i1, new n5g(sbb.e)));
                        bui.a(mediaMetadataRetriever2, null);
                        return null;
                    }
                    x();
                    mediaMetadataRetriever3.release();
                    bui.a(mediaMetadataRetriever2, null);
                    return null;
                } finally {
                }
            } else {
                try {
                    mediaMetadataRetriever.setDataSource((Context) k18Var.getValue(), uri);
                    String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(16);
                    String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(9);
                    Long lValueOf2 = strExtractMetadata4 != null ? Long.valueOf(Long.parseLong(strExtractMetadata4)) : null;
                    if (strExtractMetadata3 == null || vmf.F(strExtractMetadata3) || lValueOf2 == null) {
                        x();
                        mediaMetadataRetriever.release();
                    } else {
                        if (lValueOf2.longValue() <= 900000) {
                            mediaMetadataRetriever.release();
                            return q34VarD;
                        }
                        xfh.r(ci5Var, new ore(ivd.i1, new n5g(sbb.e)));
                    }
                    mediaMetadataRetriever.release();
                    return null;
                } finally {
                }
            }
        } catch (Exception e) {
            x();
            wqi.p(tme.class.getName(), "failed to copy ringtone, e:", e);
            return null;
        }
        x();
        wqi.p(tme.class.getName(), "failed to copy ringtone, e:", e);
        return null;
    }

    public final z1f v() {
        return (z1f) this.Y.getValue();
    }

    public final void w() {
        bwf bwfVar = this.w0;
        boolean zIsStreamMute = ((AudioManager) bwfVar.getValue()).isStreamMute(3);
        boolean z = ((AudioManager) bwfVar.getValue()).getStreamVolume(3) == 0;
        if (zIsStreamMute || z) {
            xfh.r(this.u0, new ore(ivd.O0, new n5g(sbb.i)));
        }
    }

    public final void x() {
        xfh.r(this.u0, new ore(ivd.i1, new n5g(sbb.f)));
    }

    public final void y(nqd nqdVar) {
        x9f x9fVarO = xfh.o(this, null, new sme(this, nqdVar, null), 1);
        this.Z.O(this, z0[0], x9fVarO);
    }
}
