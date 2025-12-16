package defpackage;

/* loaded from: classes.dex */
public abstract class swd extends bu7 {
    @Override // defpackage.bu7
    public wt7 dequeueWork() {
        try {
            ut7 ut7Var = this.mJobImpl;
            if (ut7Var != null) {
                return ut7Var.b();
            }
            synchronized (this.mCompatQueue) {
                try {
                    if (this.mCompatQueue.size() <= 0) {
                        return null;
                    }
                    return this.mCompatQueue.remove(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (SecurityException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // defpackage.bu7, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mJobImpl = new yt7(this);
    }
}
