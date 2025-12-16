package scout.exception;

import defpackage.a1e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lscout/exception/ObjectCreationFailedException;", "Lscout/exception/ScoutException;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ObjectCreationFailedException extends ScoutException {
    public final int a;
    public final a1e b;
    public final Exception c;

    public ObjectCreationFailedException(int i, a1e a1eVar, Exception exc) {
        super(0);
        this.a = i;
        this.b = a1eVar;
        this.c = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    @Override // java.lang.Throwable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getMessage() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "An error occurred during instance creation of "
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Object(type="
            r1.<init>(r2)
            ej3 r2 = defpackage.ks4.a()
            int r3 = r5.a
            if (r2 == 0) goto L27
            r2.a()
            java.util.HashMap r2 = r2.b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L2b
        L27:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
        L2b:
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            a1e r1 = r5.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: scout.exception.ObjectCreationFailedException.getMessage():java.lang.String");
    }
}
