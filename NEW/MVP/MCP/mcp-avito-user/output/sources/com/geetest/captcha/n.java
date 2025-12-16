package com.geetest.captcha;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public class n {
    static {
        char c12 = File.separatorChar;
        try {
            StringWriter stringWriter = new StringWriter(4);
            new PrintWriter(stringWriter).println();
            stringWriter.toString();
        } catch (Exception unused) {
        }
    }

    public static String a(Reader reader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[4096];
            while (true) {
                int i12 = reader.read(cArr);
                if (-1 == i12) {
                    return stringWriter.toString();
                }
                stringWriter.write(cArr, 0, i12);
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(byte[] bArr, String str) {
        return new String(bArr, Charset.forName(str));
    }

    public static void a(String str, Writer writer) throws IOException {
        if (str != null) {
            writer.write(str);
        }
    }
}
