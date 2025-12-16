package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class y37 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ y37(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        boolean zB;
        switch (this.a) {
            case 0:
                zB = k4j.b(((j37) obj).getC(), this.b);
                break;
            default:
                zB = this.b.contains(Long.valueOf(((lc9) obj).a));
                break;
        }
        return Boolean.valueOf(zB);
    }
}
