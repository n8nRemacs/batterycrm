package org.threeten.bp.format;

import org.threeten.bp.DateTimeException;

/* loaded from: classes8.dex */
public class DateTimeParseException extends DateTimeException {
    private static final long serialVersionUID = 4304633501674722597L;

    /* renamed from: b, reason: collision with root package name */
    public final int f421951b;

    public DateTimeParseException(String str, String str2, int i12) {
        super(str);
        str2.getClass();
        this.f421951b = i12;
    }

    public DateTimeParseException(String str, String str2, RuntimeException runtimeException) {
        super(str, runtimeException);
        str2.getClass();
        this.f421951b = 0;
    }
}
