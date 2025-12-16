package defpackage;

import android.content.Context;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class yk2 extends xfh {
    public final wk2 A0;
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final Context b;
    public final lzf c;
    public final sxd d;
    public final k18 o;
    public final k18 s0;
    public final k18 t0;
    public final jve u0;
    public final gbd v0;
    public final tcf w0;
    public final hbd x0;
    public x9f y0;
    public final AtomicReference z0;

    public yk2(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, Context context, lzf lzfVar, sxd sxdVar) {
        pue pueVar = pue.a;
        bwf bwfVarD = pueVar.getAccessor().d(109);
        this.b = context;
        this.c = lzfVar;
        this.d = sxdVar;
        this.o = k18Var;
        this.X = k18Var2;
        this.Y = k18Var3;
        this.Z = k18Var4;
        this.s0 = k18Var5;
        this.t0 = bwfVarD;
        jve jveVarA = kve.a(1, Integer.MAX_VALUE, 2);
        this.u0 = jveVarA;
        this.v0 = new gbd(jveVarA);
        tcf tcfVarA = ucf.a(Float.valueOf(0.0f));
        this.w0 = tcfVarA;
        this.x0 = new hbd(tcfVarA);
        this.z0 = new AtomicReference(null);
        this.A0 = new wk2(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00be, code lost:
    
        if (r5 == r11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f5, code lost:
    
        if (defpackage.svi.i(r0, r12, r4) == r11) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.yk2 r21, java.lang.String r22, defpackage.v10 r23, defpackage.si9 r24, defpackage.q44 r25) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk2.t(yk2, java.lang.String, v10, si9, q44):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(defpackage.yk2 r18, defpackage.w10 r19, final defpackage.o05 r20, defpackage.si9 r21, defpackage.q44 r22) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk2.u(yk2, w10, o05, si9, q44):java.lang.Object");
    }

    public static int y(o05 o05Var, boolean z) {
        switch (kk2.$EnumSwitchMapping$0[o05Var.ordinal()]) {
            case 1:
                return m3d.media_share_dialog_share_video_fail;
            case 2:
                return m3d.media_share_dialog_share_photo_fail;
            case 3:
                return m3d.media_share_dialog_share_gif_fail;
            case 4:
            case 5:
            case 6:
                return z ? m3d.media_share_dialog_download_media_fail_not_enough_space : m3d.media_share_dialog_download_media_fail;
            case 7:
                return m3d.media_share_dialog_share_file_fail;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void v() {
        xfh.o(this, ((q2b) this.c).b().plus(bia.a), new mk2(this, null), 2);
        x9f x9fVar = this.y0;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(java.lang.String r19, long r20, long r22, defpackage.f10 r24, defpackage.q44 r25) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk2.w(java.lang.String, long, long, f10, q44):java.lang.Object");
    }

    public final void x(boolean z) {
        jk2 jk2Var = (jk2) this.z0.get();
        if (jk2Var == null) {
            return;
        }
        v();
        this.u0.h(new s05(y(jk2Var.d, z)));
    }
}
