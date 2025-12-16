package com.avito.security;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes5.dex */
public final class u2 {
    public static final long a(Reader reader, Writer writer, int i12) throws IOException {
        y0.b(reader, "$this$copyTo");
        y0.b(writer, "out");
        char[] cArr = new char[i12];
        int i13 = reader.read(cArr);
        long j12 = 0;
        while (i13 >= 0) {
            writer.write(cArr, 0, i13);
            j12 += i13;
            i13 = reader.read(cArr);
        }
        return j12;
    }

    public static /* synthetic */ long a(Reader reader, Writer writer, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 8192;
        }
        return a(reader, writer, i12);
    }

    public static final String a(Reader reader) {
        y0.b(reader, "$this$readText");
        StringWriter stringWriter = new StringWriter();
        a(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        y0.a((Object) string, "buffer.toString()");
        return string;
    }
}
