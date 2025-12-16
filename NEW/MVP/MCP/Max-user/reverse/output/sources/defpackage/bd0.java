package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final /* synthetic */ class bd0 implements gu3, usa, frf, pa8, fu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    public /* synthetic */ bd0(int i, id idVar, t3c t3cVar, t3c t3cVar2) {
        this.a = 3;
        this.o = idVar;
        this.c = i;
        this.b = t3cVar;
        this.d = t3cVar2;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                Canvas canvas = (Canvas) this.o;
                Drawable drawableC = ((ed0) this.b).c((Context) this.d);
                int i = this.c;
                drawableC.setBounds(0, 0, i, i);
                drawableC.draw(canvas);
                break;
            default:
                lk6 lk6Var = (lk6) this.o;
                ((n99) obj).b(lk6Var.b, (d99) lk6Var.c, (ub8) this.b, (g19) this.d, this.c);
                break;
        }
    }

    @Override // defpackage.usa
    public void e(ira iraVar) {
        ed0 ed0Var = (ed0) this.b;
        String str = (String) this.o;
        Context context = (Context) this.d;
        sf7 sf7VarD = sf7.d(ed0Var.b(str));
        int i = this.c;
        sf7VarD.d = i <= 0 ? null : new ynd(i, i);
        sf7VarD.g = pf7.a;
        sf7VarD.k = new qkb();
        pe4 pe4VarB = zk6.e().b(sf7VarD.a(), null);
        ((r0) pe4VarB).l(new dd0(iraVar, ed0Var, context, pe4VarB), yu1.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ff A[Catch: all -> 0x00bd, TryCatch #0 {all -> 0x00bd, blocks: (B:3:0x006b, B:4:0x0097, B:6:0x009f, B:8:0x00a9, B:12:0x00c0, B:20:0x00ff, B:22:0x010e, B:27:0x0119, B:29:0x0121, B:34:0x0136, B:36:0x013e, B:37:0x0141, B:48:0x018d, B:50:0x019c, B:52:0x01a2, B:56:0x01b0, B:58:0x01ba, B:60:0x01c4, B:64:0x01d3, B:69:0x01e8, B:71:0x01f2, B:76:0x020d, B:78:0x023e, B:80:0x0244, B:82:0x0248, B:84:0x0252, B:86:0x0263, B:68:0x01df, B:38:0x015b, B:40:0x0170, B:45:0x0179, B:15:0x00c7, B:18:0x00d5, B:90:0x0278), top: B:142:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0136 A[Catch: all -> 0x00bd, TryCatch #0 {all -> 0x00bd, blocks: (B:3:0x006b, B:4:0x0097, B:6:0x009f, B:8:0x00a9, B:12:0x00c0, B:20:0x00ff, B:22:0x010e, B:27:0x0119, B:29:0x0121, B:34:0x0136, B:36:0x013e, B:37:0x0141, B:48:0x018d, B:50:0x019c, B:52:0x01a2, B:56:0x01b0, B:58:0x01ba, B:60:0x01c4, B:64:0x01d3, B:69:0x01e8, B:71:0x01f2, B:76:0x020d, B:78:0x023e, B:80:0x0244, B:82:0x0248, B:84:0x0252, B:86:0x0263, B:68:0x01df, B:38:0x015b, B:40:0x0170, B:45:0x0179, B:15:0x00c7, B:18:0x00d5, B:90:0x0278), top: B:142:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015b A[Catch: all -> 0x00bd, TryCatch #0 {all -> 0x00bd, blocks: (B:3:0x006b, B:4:0x0097, B:6:0x009f, B:8:0x00a9, B:12:0x00c0, B:20:0x00ff, B:22:0x010e, B:27:0x0119, B:29:0x0121, B:34:0x0136, B:36:0x013e, B:37:0x0141, B:48:0x018d, B:50:0x019c, B:52:0x01a2, B:56:0x01b0, B:58:0x01ba, B:60:0x01c4, B:64:0x01d3, B:69:0x01e8, B:71:0x01f2, B:76:0x020d, B:78:0x023e, B:80:0x0244, B:82:0x0248, B:84:0x0252, B:86:0x0263, B:68:0x01df, B:38:0x015b, B:40:0x0170, B:45:0x0179, B:15:0x00c7, B:18:0x00d5, B:90:0x0278), top: B:142:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018d A[Catch: all -> 0x00bd, TryCatch #0 {all -> 0x00bd, blocks: (B:3:0x006b, B:4:0x0097, B:6:0x009f, B:8:0x00a9, B:12:0x00c0, B:20:0x00ff, B:22:0x010e, B:27:0x0119, B:29:0x0121, B:34:0x0136, B:36:0x013e, B:37:0x0141, B:48:0x018d, B:50:0x019c, B:52:0x01a2, B:56:0x01b0, B:58:0x01ba, B:60:0x01c4, B:64:0x01d3, B:69:0x01e8, B:71:0x01f2, B:76:0x020d, B:78:0x023e, B:80:0x0244, B:82:0x0248, B:84:0x0252, B:86:0x0263, B:68:0x01df, B:38:0x015b, B:40:0x0170, B:45:0x0179, B:15:0x00c7, B:18:0x00d5, B:90:0x0278), top: B:142:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a2 A[Catch: all -> 0x00bd, TryCatch #0 {all -> 0x00bd, blocks: (B:3:0x006b, B:4:0x0097, B:6:0x009f, B:8:0x00a9, B:12:0x00c0, B:20:0x00ff, B:22:0x010e, B:27:0x0119, B:29:0x0121, B:34:0x0136, B:36:0x013e, B:37:0x0141, B:48:0x018d, B:50:0x019c, B:52:0x01a2, B:56:0x01b0, B:58:0x01ba, B:60:0x01c4, B:64:0x01d3, B:69:0x01e8, B:71:0x01f2, B:76:0x020d, B:78:0x023e, B:80:0x0244, B:82:0x0248, B:84:0x0252, B:86:0x0263, B:68:0x01df, B:38:0x015b, B:40:0x0170, B:45:0x0179, B:15:0x00c7, B:18:0x00d5, B:90:0x0278), top: B:142:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d3 A[Catch: all -> 0x00bd, TryCatch #0 {all -> 0x00bd, blocks: (B:3:0x006b, B:4:0x0097, B:6:0x009f, B:8:0x00a9, B:12:0x00c0, B:20:0x00ff, B:22:0x010e, B:27:0x0119, B:29:0x0121, B:34:0x0136, B:36:0x013e, B:37:0x0141, B:48:0x018d, B:50:0x019c, B:52:0x01a2, B:56:0x01b0, B:58:0x01ba, B:60:0x01c4, B:64:0x01d3, B:69:0x01e8, B:71:0x01f2, B:76:0x020d, B:78:0x023e, B:80:0x0244, B:82:0x0248, B:84:0x0252, B:86:0x0263, B:68:0x01df, B:38:0x015b, B:40:0x0170, B:45:0x0179, B:15:0x00c7, B:18:0x00d5, B:90:0x0278), top: B:142:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x026b  */
    @Override // defpackage.frf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object get() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bd0.get():java.lang.Object");
    }

    @Override // defpackage.pa8, defpackage.oa8
    public void invoke(Object obj) {
        id idVar = (id) this.o;
        t3c t3cVar = (t3c) this.b;
        t3c t3cVar2 = (t3c) this.d;
        jd jdVar = (jd) obj;
        jdVar.getClass();
        jdVar.H0(this.c, idVar, t3cVar, t3cVar2);
    }

    public /* synthetic */ bd0(ed0 ed0Var, String str, int i, Context context) {
        this.a = 1;
        this.b = ed0Var;
        this.o = str;
        this.c = i;
        this.d = context;
    }

    public /* synthetic */ bd0(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.a = i2;
        this.o = obj;
        this.b = obj2;
        this.d = obj3;
        this.c = i;
    }
}
