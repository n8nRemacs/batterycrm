package io.ktor.util.date;

import Q31.c;
import Y61.k;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: GMTDateParser.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/util/date/b;", "", "a", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f400456a;

    /* compiled from: GMTDateParser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lio/ktor/util/date/b$a;", "", "<init>", "()V", "", "ANY", "C", "DAY_OF_MONTH", "HOURS", "MINUTES", "MONTH", "SECONDS", "YEAR", "ZONE", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public b(@k String str) {
        this.f400456a = str;
        if (str.length() <= 0) {
            throw new IllegalStateException("Date parser pattern shouldn't be empty.");
        }
    }

    public static void a(c cVar, char c12, String str) {
        Month month;
        if (c12 == 's') {
            cVar.f13458a = Integer.valueOf(Integer.parseInt(str));
            return;
        }
        if (c12 == 'm') {
            cVar.f13459b = Integer.valueOf(Integer.parseInt(str));
            return;
        }
        if (c12 == 'h') {
            cVar.f13460c = Integer.valueOf(Integer.parseInt(str));
            return;
        }
        if (c12 == 'd') {
            cVar.f13461d = Integer.valueOf(Integer.parseInt(str));
            return;
        }
        int i12 = 0;
        if (c12 == 'M') {
            Month.f400450c.getClass();
            Month[] monthArrValues = Month.values();
            int length = monthArrValues.length;
            while (true) {
                if (i12 >= length) {
                    month = null;
                    break;
                }
                month = monthArrValues[i12];
                if (month.f400452b.equals(str)) {
                    break;
                } else {
                    i12++;
                }
            }
            if (month == null) {
                throw new IllegalStateException("Invalid month: ".concat(str).toString());
            }
            cVar.f13462e = month;
            return;
        }
        if (c12 == 'Y') {
            cVar.f13463f = Integer.valueOf(Integer.parseInt(str));
            return;
        }
        if (c12 == 'z') {
            if (!str.equals("GMT")) {
                throw new IllegalStateException("Check failed.");
            }
        } else if (c12 != '*') {
            while (i12 < str.length()) {
                if (str.charAt(i12) != c12) {
                    throw new IllegalStateException("Check failed.");
                }
                i12++;
            }
        }
    }

    @k
    public final Q31.b b(@k String str) {
        c cVar = new c();
        String str2 = this.f400456a;
        char cCharAt = str2.charAt(0);
        int i12 = 0;
        int i13 = 1;
        int i14 = 0;
        while (i13 < str2.length()) {
            try {
                if (str2.charAt(i13) == cCharAt) {
                    i13++;
                } else {
                    int i15 = (i12 + i13) - i14;
                    a(cVar, cCharAt, str.substring(i12, i15));
                    try {
                        cCharAt = str2.charAt(i13);
                        i14 = i13;
                        i13++;
                        i12 = i15;
                    } catch (Throwable unused) {
                        i12 = i15;
                        StringBuilder sb2 = new StringBuilder("Failed to parse date string: \"");
                        sb2.append(str);
                        sb2.append("\" at index ");
                        sb2.append(i12);
                        sb2.append(". Pattern: \"");
                        throw new InvalidDateStringException(C22026a.c(sb2, str2, '\"'));
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        if (i12 < str.length()) {
            a(cVar, cCharAt, str.substring(i12));
        }
        int iIntValue = cVar.f13458a.intValue();
        int iIntValue2 = cVar.f13459b.intValue();
        int iIntValue3 = cVar.f13460c.intValue();
        int iIntValue4 = cVar.f13461d.intValue();
        Month month = cVar.f13462e;
        if (month == null) {
            month = null;
        }
        return io.ktor.util.date.a.a(iIntValue, iIntValue2, iIntValue3, iIntValue4, month, cVar.f13463f.intValue());
    }
}
