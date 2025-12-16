package dY0;

/* renamed from: dY0.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39669m {
    public static byte a(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? (byte) 1 : (byte) 0;
        }
        return (byte) -1;
    }

    public static Boolean b(byte b12) {
        if (b12 == 0) {
            return Boolean.FALSE;
        }
        if (b12 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
