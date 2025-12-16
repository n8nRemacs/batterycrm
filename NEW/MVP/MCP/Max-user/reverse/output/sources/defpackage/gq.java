package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final /* synthetic */ class gq implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ jq c;
    public final /* synthetic */ lk4 d;

    public /* synthetic */ gq(jq jqVar, lk4 lk4Var, Context context) {
        this.a = 2;
        this.d = lk4Var;
        this.c = jqVar;
        this.b = context;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new w1c(this.b, this.c.a(), this.d);
            case 1:
                this.c.a();
                return new xf8();
            default:
                this.d.getClass();
                return new i49("ru.oneme.app.new.activeCalls", new bwf(new hq(this.c, 1)), new iq(this.b));
        }
    }

    public /* synthetic */ gq(Context context, jq jqVar, lk4 lk4Var, int i) {
        this.a = i;
        this.b = context;
        this.c = jqVar;
        this.d = lk4Var;
    }
}
