package defpackage;

import java.util.List;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.profile.screens.media.ChatMediaTabWidget;
import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public final class om2 extends yb4 {
    public static final kk4 A0 = new kk4(16);
    public final /* synthetic */ int v0 = 1;
    public final long w0;
    public List x0;
    public final Object y0;
    public final Object z0;

    public om2(ChatMediaTabWidget chatMediaTabWidget, long j) {
        super((Widget) chatMediaTabWidget);
        this.y0 = chatMediaTabWidget;
        this.w0 = j;
        this.z0 = A0;
        this.x0 = ue3.d0(dn2.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.yb4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(defpackage.ytd r11, int r12) {
        /*
            r10 = this;
            int r0 = r10.v0
            switch(r0) {
                case 0: goto L6a;
                default: goto L5;
            }
        L5:
            boolean r0 = r11.n()
            if (r0 == 0) goto Lc
            goto L69
        Lc:
            if (r12 < 0) goto L69
            java.util.List r0 = r10.x0
            int r0 = defpackage.ve3.i(r0)
            if (r12 > r0) goto L69
            java.lang.Object r0 = r10.z0
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r1 = r10.x0
            java.lang.Object r12 = r1.get(r12)
            d08 r12 = (defpackage.d08) r12
            int[] r1 = defpackage.vz7.$EnumSwitchMapping$0
            int r12 = r12.ordinal()
            r12 = r1[r12]
            r1 = 1
            b54 r2 = defpackage.b54.b
            r3 = 0
            if (r12 == r1) goto L48
            r1 = 2
            if (r12 == r1) goto L3e
            r0 = 3
            if (r12 != r0) goto L38
            r4 = r3
            goto L59
        L38:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L3e:
            one.me.keyboardmedia.emoji.KeyboardEmojiWidget r12 = new one.me.keyboardmedia.emoji.KeyboardEmojiWidget
            r12.<init>(r0, r3)
            r12.setRetainViewMode(r2)
        L46:
            r4 = r12
            goto L59
        L48:
            one.me.keyboardmedia.stickers.KeyboardStickersWidget r12 = new one.me.keyboardmedia.stickers.KeyboardStickersWidget
            long r4 = r10.w0
            r12.<init>(r4, r0, r3)
            java.lang.Object r0 = r10.y0
            qk8 r0 = (defpackage.qk8) r0
            r12.c = r0
            r12.setRetainViewMode(r2)
            goto L46
        L59:
            if (r4 != 0) goto L5c
            goto L69
        L5c:
            bud r3 = new bud
            r8 = 0
            r9 = -1
            r5 = 0
            r6 = 0
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11.S(r3)
        L69:
            return
        L6a:
            boolean r0 = r11.n()
            if (r0 == 0) goto L71
            goto La0
        L71:
            java.util.List r0 = r10.x0
            java.lang.Object r12 = r0.get(r12)
            dn2 r12 = (defpackage.dn2) r12
            java.lang.Object r0 = r10.z0
            kk4 r0 = (defpackage.kk4) r0
            r0.getClass()
            one.me.profile.screens.media.ChatMediaListWidget r2 = new one.me.profile.screens.media.ChatMediaListWidget
            long r0 = r10.w0
            r2.<init>(r0, r12)
            java.lang.Object r12 = r10.y0
            one.me.profile.screens.media.ChatMediaTabWidget r12 = (one.me.profile.screens.media.ChatMediaTabWidget) r12
            r2.setTargetController(r12)
            b54 r12 = defpackage.b54.b
            r2.setRetainViewMode(r12)
            bud r1 = new bud
            r6 = 0
            r7 = -1
            r3 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r11.S(r1)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om2.E(ytd, int):void");
    }

    @Override // defpackage.phd
    public final int j() {
        switch (this.v0) {
        }
        return this.x0.size();
    }

    @Override // defpackage.yb4, defpackage.phd
    public final long k(int i) {
        int iOrdinal;
        switch (this.v0) {
            case 0:
                iOrdinal = ((dn2) this.x0.get(i)).ordinal();
                break;
            default:
                iOrdinal = ((d08) this.x0.get(i)).c;
                break;
        }
        return iOrdinal;
    }

    public om2(MediaKeyboardWidget mediaKeyboardWidget, qk8 qk8Var, long j, String str) {
        super((Widget) mediaKeyboardWidget);
        this.y0 = qk8Var;
        this.w0 = j;
        this.z0 = str;
        this.x0 = hd5.a;
    }
}
