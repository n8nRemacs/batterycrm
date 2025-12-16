package defpackage;

import android.content.Intent;

/* loaded from: classes.dex */
public final class vt7 implements wt7 {
    public final Intent a;
    public final int b;
    public final /* synthetic */ bu7 c;

    public vt7(bu7 bu7Var, Intent intent, int i) {
        this.c = bu7Var;
        this.a = intent;
        this.b = i;
    }

    @Override // defpackage.wt7
    public final void a() {
        this.c.stopSelf(this.b);
    }

    @Override // defpackage.wt7
    public final Intent getIntent() {
        return this.a;
    }
}
