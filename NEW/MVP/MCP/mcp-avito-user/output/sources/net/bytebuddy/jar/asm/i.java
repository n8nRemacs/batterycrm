package net.bytebuddy.jar.asm;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* compiled from: Constants.java */
/* loaded from: classes7.dex */
final class i {
    public static void a(Object obj) throws IOException {
        Class<?> cls = obj.getClass();
        String strReplace = cls.getName().replace('.', '/');
        if (strReplace.startsWith("net/bytebuddy/jar/asm/") && (strReplace.contains("Test$") || Pattern.matches("net/bytebuddy/jar/asm/util/Trace(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Visitor(\\$.*)?", strReplace) || Pattern.matches("net/bytebuddy/jar/asm/util/Check(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Adapter(\\$.*)?", strReplace))) {
            return;
        }
        InputStream resourceAsStream = cls.getClassLoader().getResourceAsStream(strReplace.concat(".class"));
        if (resourceAsStream == null) {
            throw new IllegalStateException("Bytecode not available, can't check class version");
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(resourceAsStream);
            try {
                dataInputStream.readInt();
                int unsignedShort = dataInputStream.readUnsignedShort();
                dataInputStream.close();
                if (unsignedShort != 65535) {
                    throw new IllegalStateException("ASM9_EXPERIMENTAL can only be used by classes compiled with --enable-preview");
                }
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        } catch (IOException e12) {
            throw new IllegalStateException("I/O error, can't check class version", e12);
        }
    }
}
