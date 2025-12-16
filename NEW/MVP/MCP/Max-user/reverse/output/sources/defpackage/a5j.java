package defpackage;

import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class a5j {
    public static final String a(Long l, Long l2) {
        int iCompareTo = l2.compareTo(l);
        return iCompareTo > 0 ? "<" : iCompareTo < 0 ? ">" : "=";
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String b(java.io.DataInputStream r10, defpackage.py0 r11) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a5j.b(java.io.DataInputStream, py0):java.lang.String");
    }

    public static final void c(DataOutputStream dataOutputStream, String str, tog togVar) throws IOException {
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeByte(togVar.a);
    }

    public static final void d(DataOutputStream dataOutputStream, String str, tog togVar, tog togVar2, String str2, py0 py0Var) throws IOException {
        int i;
        if (str2.length() < 21845) {
            c(dataOutputStream, str, togVar);
            dataOutputStream.writeUTF(str2);
            return;
        }
        c(dataOutputStream, str, togVar2);
        int length = str2.length();
        char[] cArr = (char[]) py0Var.b;
        int length2 = cArr.length;
        if (length2 < length) {
            do {
                length2 <<= 1;
            } while (length2 < length);
            cArr = new char[length2];
            py0Var.b = cArr;
        }
        str2.getChars(0, length, cArr, 0);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = 3;
            if (i2 >= length) {
                break;
            }
            char c = cArr[i2];
            if (c <= 127) {
                i = 1;
            } else if (c <= 2047) {
                i = 2;
            }
            i3 += i;
            i2++;
        }
        int iA = togVar2.a();
        byte[] bArr = (byte[]) py0Var.c;
        if (i3 <= 127) {
            bArr[0] = (byte) (iA | 8);
            bArr[1] = (byte) i3;
            i = 2;
        } else if (i3 <= 32767) {
            bArr[0] = (byte) (iA | 9);
            bArr[1] = (byte) (i3 >> 8);
            bArr[2] = (byte) i3;
        } else {
            bArr[0] = (byte) (iA | 10);
            bArr[1] = (byte) (i3 >> 24);
            bArr[2] = (byte) ((i3 >> 16) & 255);
            bArr[3] = (byte) ((i3 >> 8) & 255);
            bArr[4] = (byte) i3;
            i = 5;
        }
        dataOutputStream.write(bArr, 0, i);
        byte[] bArr2 = (byte[]) py0Var.c;
        int length3 = bArr2.length;
        if (length3 < i3) {
            do {
                length3 <<= 1;
            } while (length3 < i3);
            bArr2 = new byte[length3];
            py0Var.c = bArr2;
        }
        if (length == i3) {
            for (int i4 = 0; i4 < length; i4++) {
                bArr2[i4] = (byte) cArr[i4];
            }
        } else {
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                char c2 = cArr[i6];
                if (c2 <= 127) {
                    bArr2[i5] = (byte) c2;
                    i5++;
                } else if (c2 <= 2047) {
                    int i7 = i5 + 1;
                    bArr2[i5] = (byte) ((c2 >> 6) | 192);
                    i5 += 2;
                    bArr2[i7] = (byte) ((c2 & '?') | 128);
                } else {
                    bArr2[i5] = (byte) ((c2 >> '\f') | 224);
                    int i8 = i5 + 2;
                    bArr2[i5 + 1] = (byte) (((c2 >> 6) & 63) | 128);
                    i5 += 3;
                    bArr2[i8] = (byte) ((c2 & '?') | 128);
                }
            }
        }
        dataOutputStream.write(bArr2, 0, i3);
    }
}
