package defpackage;

import java.util.Locale;

/* loaded from: classes2.dex */
public final /* synthetic */ class s2h implements gu3, tm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2h b;

    public /* synthetic */ s2h(k2h k2hVar, int i) {
        this.a = i;
        this.b = k2hVar;
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        int i = this.a;
        k2h k2hVar = this.b;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                Locale locale = Locale.ENGLISH;
                wqi.e("u2h", "putConversionInRepository: failed, videoConversion=" + k2hVar, th);
                break;
            default:
                b6a.V(k2hVar.d);
                break;
        }
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        o2h o2hVar = (o2h) obj;
        n2h n2hVarC = j8.c(this.b);
        o2hVar.getClass();
        return new kk3(2, new jad(o2hVar, 17, n2hVarC));
    }
}
