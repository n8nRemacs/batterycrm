package scout.exception;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lscout/exception/MissingCollectionElementsException;", "Lscout/exception/ScoutException;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MissingCollectionElementsException extends ScoutException {
    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
    @Override // java.lang.Throwable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getMessage() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Missing elements of collection of "
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Collection(type="
            r1.<init>(r2)
            ej3 r2 = defpackage.ks4.a()
            r3 = 0
            if (r2 == 0) goto L26
            r2.a()
            java.util.HashMap r2 = r2.c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L2a
        L26:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
        L2a:
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: scout.exception.MissingCollectionElementsException.getMessage():java.lang.String");
    }
}
