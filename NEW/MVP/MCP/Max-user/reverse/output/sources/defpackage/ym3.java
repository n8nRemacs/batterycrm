package defpackage;

/* loaded from: classes.dex */
public final class ym3 implements tf7 {
    public static final ym3 c = new ym3(true, (int) (1 == true ? 1 : 0));
    public final boolean a;
    public final int b;

    public /* synthetic */ ym3(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // defpackage.tf7
    public String a() {
        return "SimpleImageTranscoder";
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.tf7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.l16 b(defpackage.ce5 r20, defpackage.of9 r21, defpackage.ysd r22, defpackage.ynd r23, android.graphics.ColorSpace r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ym3.b(ce5, of9, ysd, ynd, android.graphics.ColorSpace):l16");
    }

    @Override // defpackage.tf7
    public boolean c(me7 me7Var) {
        return me7Var == mn4.k || me7Var == mn4.a;
    }

    @Override // defpackage.tf7
    public boolean d(ce5 ce5Var, ysd ysdVar, ynd yndVar) {
        if (ysdVar == null) {
            ysdVar = ysd.c;
        }
        return this.a && n9j.a(ysdVar, yndVar, ce5Var, this.b) > 1;
    }

    public ym3(int i, boolean z) {
        this.b = i;
        this.a = z;
    }
}
