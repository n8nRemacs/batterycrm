package defpackage;

import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class wnd extends ws4 {
    public final boolean c;
    public final uf7 d;
    public final oac e;
    public boolean f;
    public final gu7 g;
    public final /* synthetic */ xnd h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnd(xnd xndVar, hj0 hj0Var, oac oacVar, boolean z, uf7 uf7Var) {
        super(hj0Var);
        this.h = xndVar;
        this.f = false;
        this.e = oacVar;
        mk0 mk0Var = (mk0) oacVar;
        Boolean bool = mk0Var.a.q;
        this.c = bool != null ? bool.booleanValue() : z;
        this.d = uf7Var;
        this.g = new gu7(xndVar.a, new x6i(28, this));
        mk0Var.a(new ia7(this, hj0Var, false, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    @Override // defpackage.hj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r17, java.lang.Object r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wnd.h(int, java.lang.Object):void");
    }

    public final bh7 m(ce5 ce5Var, ynd yndVar, l16 l16Var, String str) throws IOException {
        String str2;
        long j;
        oac oacVar = this.e;
        if (!((mk0) oacVar).c.i(oacVar, "ResizeAndRotateProducer")) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ce5Var.i0();
        sb.append(ce5Var.o);
        sb.append("x");
        ce5Var.i0();
        sb.append(ce5Var.X);
        String string = sb.toString();
        if (yndVar != null) {
            str2 = yndVar.a + "x" + yndVar.b;
        } else {
            str2 = "Unspecified";
        }
        HashMap map = new HashMap();
        ce5Var.i0();
        map.put("Image format", String.valueOf(ce5Var.b));
        map.put("Original size", string);
        map.put("Requested size", str2);
        gu7 gu7Var = this.g;
        synchronized (gu7Var) {
            j = gu7Var.i - gu7Var.h;
        }
        map.put("queueTime", String.valueOf(j));
        map.put("Transcoder id", str);
        map.put("Transcoding result", String.valueOf(l16Var));
        return new bh7(map);
    }
}
