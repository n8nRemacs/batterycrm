package org.joda.time;

/* loaded from: classes7.dex */
public class IllegalInstantException extends IllegalArgumentException {
    private static final long serialVersionUID = 2858712538216L;

    public IllegalInstantException(long j12, String str) {
        super(AK.c.k("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ", org.joda.time.format.a.a("yyyy-MM-dd'T'HH:mm:ss.SSS").c(new C44874p(j12)), str != null ? AK.c.k(" (", str, ")") : ""));
    }
}
