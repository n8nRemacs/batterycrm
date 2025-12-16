package defpackage;

import android.content.Intent;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tvh extends dtf implements sm6 {
    public final /* synthetic */ int X;
    public final /* synthetic */ uvh Y;
    public final /* synthetic */ Intent o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvh(Intent intent, int i, uvh uvhVar, Continuation continuation) {
        super(2, continuation);
        this.o = intent;
        this.X = i;
        this.Y = uvhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        tvh tvhVar = (tvh) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        tvhVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new tvh(this.o, this.X, this.Y, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r9) {
        /*
            r8 = this;
            uvh r0 = r8.Y
            k18 r1 = r0.C0
            defpackage.g8j.b(r9)
            android.content.Intent r9 = r8.o
            android.content.ClipData r2 = r9.getClipData()
            r3 = -1
            r4 = 0
            int r5 = r8.X
            if (r5 == r3) goto L15
            goto L99
        L15:
            r3 = 0
            if (r2 == 0) goto L65
            int r9 = r2.getItemCount()
            to7 r9 = defpackage.n7j.h(r3, r9)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r9 = r9.iterator()
        L29:
            r6 = r9
            so7 r6 = (defpackage.so7) r6
            boolean r6 = r6.c
            if (r6 == 0) goto L5b
            r6 = r9
            so7 r6 = (defpackage.so7) r6
            int r6 = r6.nextInt()
            android.content.ClipData$Item r6 = r2.getItemAt(r6)
            if (r6 == 0) goto L42
            android.net.Uri r6 = r6.getUri()
            goto L43
        L42:
            r6 = r4
        L43:
            if (r6 == 0) goto L54
            yy7[] r7 = defpackage.uvh.o1
            java.lang.Object r7 = r1.getValue()
            android.content.Context r7 = (android.content.Context) r7
            boolean r7 = defpackage.zpi.h(r7, r6)
            if (r7 == 0) goto L54
            goto L55
        L54:
            r6 = r4
        L55:
            if (r6 == 0) goto L29
            r5.add(r6)
            goto L29
        L5b:
            android.net.Uri[] r9 = new android.net.Uri[r3]
            java.lang.Object[] r9 = r5.toArray(r9)
            r4 = r9
            android.net.Uri[] r4 = (android.net.Uri[]) r4
            goto L99
        L65:
            android.net.Uri r2 = r9.getData()
            if (r2 == 0) goto L99
            android.net.Uri[] r9 = android.webkit.WebChromeClient.FileChooserParams.parseResult(r5, r9)
            if (r9 == 0) goto L99
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r4 = r9.length
            r5 = r3
        L78:
            if (r5 >= r4) goto L90
            r6 = r9[r5]
            yy7[] r7 = defpackage.uvh.o1
            java.lang.Object r7 = r1.getValue()
            android.content.Context r7 = (android.content.Context) r7
            boolean r7 = defpackage.zpi.h(r7, r6)
            if (r7 == 0) goto L8d
            r2.add(r6)
        L8d:
            int r5 = r5 + 1
            goto L78
        L90:
            android.net.Uri[] r9 = new android.net.Uri[r3]
            java.lang.Object[] r9 = r2.toArray(r9)
            r4 = r9
            android.net.Uri[] r4 = (android.net.Uri[]) r4
        L99:
            ci5 r9 = r0.Z0
            yuh r0 = new yuh
            r0.<init>(r4)
            defpackage.xfh.r(r9, r0)
            qqg r9 = defpackage.qqg.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tvh.n(java.lang.Object):java.lang.Object");
    }
}
