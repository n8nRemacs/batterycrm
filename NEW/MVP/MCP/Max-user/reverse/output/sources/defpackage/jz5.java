package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class jz5 extends qbj {
    public static boolean b(File file) {
        ay5 ay5Var = new ay5(new cy5(file));
        while (true) {
            boolean z = true;
            while (ay5Var.hasNext()) {
                File file2 = (File) ay5Var.next();
                if (!file2.delete() && file2.exists()) {
                    z = false;
                } else {
                    if (z) {
                        break;
                    }
                    z = false;
                }
            }
            return z;
        }
    }

    public static String c(File file) {
        String name = file.getName();
        int iG = vmf.G(name, '.', 0, 6);
        return iG == -1 ? "" : name.substring(iG + 1, name.length());
    }

    public static byte[] d(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int i4 = fileInputStream.read(bArrCopyOf, i3, i2);
                if (i4 < 0) {
                    break;
                }
                i2 -= i4;
                i3 += i4;
            }
            if (i2 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i3);
            } else {
                int i5 = fileInputStream.read();
                if (i5 != -1) {
                    on5 on5Var = new on5(8193);
                    on5Var.write(i5);
                    swi.a(fileInputStream, on5Var);
                    int size = on5Var.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrL = on5Var.l();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    System.arraycopy(bArrL, 0, bArrCopyOf, i, on5Var.size());
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                r4j.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static ArrayList e(File file) throws IOException {
        Charset charset = lb2.a;
        ArrayList arrayList = new ArrayList();
        i0 i0Var = new i0(2, arrayList);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        try {
            Iterator it = new et3(new at(3, bufferedReader)).iterator();
            while (it.hasNext()) {
                i0Var.invoke(it.next());
            }
            bufferedReader.close();
            return arrayList;
        } finally {
        }
    }

    public static String f(File file) {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), lb2.a);
        try {
            String strT = guf.t(inputStreamReader);
            inputStreamReader.close();
            return strT;
        } finally {
        }
    }

    public static File g(File file, String str) {
        int length;
        int iC;
        File file2 = new File(str);
        String path = file2.getPath();
        char c = File.separatorChar;
        int iC2 = vmf.C(path, c, 0, 4);
        if (iC2 != 0) {
            length = (iC2 <= 0 || path.charAt(iC2 + (-1)) != ':') ? (iC2 == -1 && vmf.v(path, ':')) ? path.length() : 0 : iC2 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c || (iC = vmf.C(path, c, 2, 4)) < 0) {
            length = 1;
        } else {
            int iC3 = vmf.C(path, c, iC + 1, 4);
            length = iC3 >= 0 ? iC3 + 1 : path.length();
        }
        if (length > 0) {
            return file2;
        }
        String string = file.toString();
        if ((string.length() == 0) || vmf.v(string, c)) {
            return new File(string + file2);
        }
        return new File(string + c + file2);
    }

    public static void h(File file, String str) {
        Charset charset = lb2.a;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            i(fileOutputStream, str, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    public static final void i(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        if (str.length() < 16384) {
            fileOutputStream.write(str.getBytes(charset));
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            str.getChars(i, i3, charBufferAllocate.array(), i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }
}
