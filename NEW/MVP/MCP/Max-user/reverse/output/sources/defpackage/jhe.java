package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class jhe extends fhe {
    public final /* synthetic */ int g = 0;
    public final String h;
    public boolean i;
    public final Object j;

    public jhe(long j, String str, boolean z, List list) {
        super(j);
        this.h = str;
        this.i = z;
        this.j = list;
    }

    @Override // defpackage.fhe
    public final ghe a() {
        switch (this.g) {
            case 0:
                return new khe(this);
            default:
                return new lhe(this);
        }
    }

    public jhe(long j, String str, w10 w10Var) {
        super(j);
        this.h = str;
        this.j = w10Var;
    }
}
