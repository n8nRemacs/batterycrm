package scout.exception;

import defpackage.ue3;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lscout/exception/IllegalOverridesException;", "Lscout/exception/ScoutException;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IllegalOverridesException extends ScoutException {
    public final String a;
    public final Set b;

    public IllegalOverridesException(String str, ArrayList arrayList) {
        super(0);
        this.a = str;
        this.b = ue3.h0(arrayList);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    @Override // java.lang.Throwable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getMessage() {
        /*
            r8 = this;
            java.util.Set r0 = r8.b
            int r1 = r0.size()
            r2 = 1
            java.lang.String r3 = "\")"
            java.lang.String r4 = "Scope(name=\""
            java.lang.String r5 = r8.a
            if (r1 != r2) goto L72
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Object factory for "
            r1.<init>(r2)
            java.lang.Object r0 = defpackage.ue3.F(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "Object(type="
            r2.<init>(r6)
            ej3 r6 = defpackage.ks4.a()
            if (r6 == 0) goto L3e
            r6.a()
            java.util.HashMap r6 = r6.b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L42
        L3e:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L42:
            r2.append(r6)
            r0 = 41
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.append(r0)
            java.lang.String r0 = " already exist in "
            r1.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            java.lang.String r0 = " and override is not allowed"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L72:
            java.lang.String r2 = java.lang.System.lineSeparator()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Multiple object factories already exist in "
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            r1.append(r5)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = " and overrides are not allowed:"
            r0.append(r1)
            java.lang.String r1 = java.lang.System.lineSeparator()
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            zx0 r5 = defpackage.zx0.z0
            r6 = 28
            java.util.Set r1 = r8.b
            r4 = 0
            java.lang.String r0 = defpackage.ue3.N(r1, r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: scout.exception.IllegalOverridesException.getMessage():java.lang.String");
    }
}
