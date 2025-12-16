package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final /* synthetic */ class hq implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jq b;

    public /* synthetic */ hq(jq jqVar, int i) {
        this.a = i;
        this.b = jqVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                jq jqVar = this.b;
                jqVar.a();
                return new r8j(22);
            case 1:
                return this.b.a();
            case 2:
                jq jqVar2 = this.b;
                return new qw5(jqVar2.a, jqVar2.a(), (q7b) jqVar2.d.getValue(), jqVar2.b);
            default:
                jq jqVar3 = this.b;
                return new eb5(jqVar3.a, jqVar3.a(), (q7b) jqVar3.d.getValue(), jqVar3.b, (db5) jqVar3.c.getValue());
        }
    }

    public /* synthetic */ hq(jq jqVar, lk4 lk4Var, Context context) {
        this.a = 0;
        this.b = jqVar;
    }
}
