package androidx.media3.common;

import java.io.IOException;

@androidx.media3.common.util.J
/* loaded from: classes.dex */
public class ParserException extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47424b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47425c;

    public ParserException(@j.P String str, @j.P Exception exc, boolean z12, int i12) {
        super(str, exc);
        this.f47424b = z12;
        this.f47425c = i12;
    }

    public static ParserException a(@j.P String str, @j.P Exception exc) {
        return new ParserException(str, exc, true, 1);
    }

    public static ParserException b(@j.P String str) {
        return new ParserException(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    @j.P
    public final String getMessage() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.getMessage());
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f47424b);
        sb2.append(", dataType=");
        return AK.c.i(this.f47425c, "}", sb2);
    }
}
