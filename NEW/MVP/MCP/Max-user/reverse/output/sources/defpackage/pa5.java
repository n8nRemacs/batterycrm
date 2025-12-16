package defpackage;

/* loaded from: classes.dex */
public final class pa5 {
    public Object a;
    public volatile Object b;
    public volatile Object c;

    public /* synthetic */ pa5(Object obj) {
        this.a = obj;
    }

    public void a() {
        String strJ;
        ae4 ae4Var;
        ak akVar = (ak) this.a;
        y6d y6dVar = akVar.a.b;
        Integer num = akVar.c;
        if (((Integer) this.b) != null) {
            ozi.a(16);
            String string = Long.toString(r3.intValue() & 4294967295L, 16);
            strJ = vmf.J(string, string.length() > 6 ? 8 : 6, '0');
        } else {
            strJ = null;
        }
        ae4 ae4Var2 = ((ak) this.a).d;
        Boolean boolValueOf = ae4Var2 != null ? Boolean.valueOf(ae4Var2.b()) : null;
        y6dVar.log("AniSend", akVar + ": isReady: v=" + num + " bgColor=" + strJ + "} connected=" + boolValueOf + " senderThread=" + ((ak) this.a).e);
        Integer num2 = ((ak) this.a).c;
        if (num2 == null) {
            return;
        }
        if (num2.intValue() != 1 && (((Integer) this.b) == null || ((ak) this.a).e == null || (ae4Var = ((ak) this.a).d) == null || !ae4Var.b())) {
            return;
        }
        ((ak) this.a).g = null;
        Integer num3 = (Integer) this.b;
        if (num3 != null) {
            ((ak) this.a).e(num3.intValue());
        }
        Double[] dArr = (Double[]) this.c;
        if (dArr != null) {
            ((ak) this.a).a(dArr);
        }
    }
}
