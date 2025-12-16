package androidx.core.provider;

/* compiled from: SelfDestructiveThread.java */
/* loaded from: classes.dex */
class r implements Runnable {
    /* JADX WARN: Code restructure failed: missing block: B:7:?, code lost:
    
        throw null;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r1 = this;
            r0 = 0
            throw r0     // Catch: java.lang.Exception -> L2
        L2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.r.run():void");
    }
}
