package defpackage;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class yr3 extends n2 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yr3(int i, y65 y65Var) {
        super(y65Var);
        this.d = i;
    }

    @Override // defpackage.n2
    public final long d0() {
        switch (this.d) {
        }
        return SystemClock.elapsedRealtime();
    }
}
