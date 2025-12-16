package org.joda.time.field;

import androidx.compose.foundation.H;
import androidx.compose.foundation.text.selection.C21030p;
import org.joda.time.AbstractC44864f;
import org.joda.time.AbstractC44865g;
import org.joda.time.IllegalFieldValueException;

/* compiled from: FieldUtils.java */
/* loaded from: classes7.dex */
public class j {
    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static long b(long j12, long j13) {
        long j14 = j12 + j13;
        if ((j12 ^ j14) >= 0 || (j12 ^ j13) < 0) {
            return j14;
        }
        StringBuilder sbQ = H.q(j12, "The calculation caused an overflow: ", " + ");
        sbQ.append(j13);
        throw new ArithmeticException(sbQ.toString());
    }

    public static int c(long j12) {
        if (-2147483648L > j12 || j12 > 2147483647L) {
            throw new ArithmeticException(C21030p.a(j12, "Value cannot fit in an int: "));
        }
        return (int) j12;
    }

    public static void d(AbstractC44864f abstractC44864f, int i12, int i13, int i14) {
        if (i12 < i13 || i12 > i14) {
            throw new IllegalFieldValueException(abstractC44864f.y(), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
        }
    }

    public static void e(AbstractC44865g abstractC44865g, int i12, int i13, int i14) {
        if (i12 < i13 || i12 > i14) {
            throw new IllegalFieldValueException(abstractC44865g, Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
        }
    }
}
