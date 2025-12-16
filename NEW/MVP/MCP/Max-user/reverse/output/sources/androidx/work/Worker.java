package androidx.work;

import android.content.Context;
import defpackage.ha8;
import defpackage.ike;
import defpackage.la8;
import defpackage.ma8;
import defpackage.owf;
import defpackage.thg;

/* loaded from: classes.dex */
public abstract class Worker extends ma8 {
    public ike a;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract la8 a();

    @Override // defpackage.ma8
    public final ha8 getForegroundInfoAsync() {
        ike ikeVar = new ike();
        getBackgroundExecutor().execute(new owf(this, 4, ikeVar));
        return ikeVar;
    }

    @Override // defpackage.ma8
    public final ha8 startWork() {
        this.a = new ike();
        getBackgroundExecutor().execute(new thg(4, this));
        return this.a;
    }
}
