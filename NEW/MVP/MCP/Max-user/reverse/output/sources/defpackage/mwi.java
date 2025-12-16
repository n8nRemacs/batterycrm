package defpackage;

import java.io.CharConversionException;

/* loaded from: classes.dex */
public abstract class mwi {
    public static sq9 a(long j, tw0 tw0Var, lzf lzfVar) {
        return new sq9(j, 0L, tw0Var, lzfVar);
    }

    public static void b(String str) throws CharConversionException {
        throw new CharConversionException(ho7.i("Unsupported UCS-4 endianness (", str, ") detected"));
    }
}
