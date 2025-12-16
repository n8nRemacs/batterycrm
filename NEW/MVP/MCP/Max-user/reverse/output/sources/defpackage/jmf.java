package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class jmf implements z94, rl3 {
    public final /* synthetic */ int a;

    public /* synthetic */ jmf(int i) {
        this.a = i;
    }

    @Override // defpackage.rl3
    public Object j(v6d v6dVar) {
        switch (this.a) {
            case 3:
                return new p1a();
            default:
                return new sve((Context) v6dVar.a(Context.class));
        }
    }

    public jmf() {
        this.a = 0;
        new bwf(new nte(22));
        new bwf(new nte(23));
    }
}
