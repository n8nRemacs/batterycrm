package com.avito.security;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
class m0 extends l0 {
    public static final String a(File file, Charset charset) throws IOException {
        y0.b(file, "$this$readText");
        y0.b(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strA = u2.a(inputStreamReader);
            m.a(inputStreamReader, null);
            return strA;
        } finally {
        }
    }

    public static /* synthetic */ String a(File file, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            charset = l.f338590a;
        }
        return a(file, charset);
    }
}
