package defpackage;

import java.util.function.UnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class cif implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ ahf b;

    public /* synthetic */ cif(ahf ahfVar, int i) {
        this.a = i;
        this.b = ahfVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                break;
        }
        return new gif(this.b.b, ((gif) obj).b);
    }
}
