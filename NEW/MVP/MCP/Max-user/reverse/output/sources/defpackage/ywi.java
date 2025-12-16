package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedByInterruptException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class ywi {
    public static String[] a(da5 da5Var) throws ClosedByInterruptException {
        if (!(da5Var instanceof ea5)) {
            return b(da5Var);
        }
        ea5 ea5Var = (ea5) da5Var;
        int i = 0;
        while (true) {
            try {
                return b(ea5Var);
            } catch (ClosedByInterruptException e) {
                i++;
                if (i > 4) {
                    throw e;
                }
                Thread.interrupted();
                Log.e("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e);
                FileInputStream fileInputStream = new FileInputStream(ea5Var.a);
                ea5Var.b = fileInputStream;
                ea5Var.c = fileInputStream.getChannel();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0242 A[LOOP:1: B:50:0x00f4->B:134:0x0242, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] b(defpackage.da5 r37) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ywi.b(da5):java.lang.String[]");
    }

    public static final ArrayList c(ty0 ty0Var) throws NoSuchAlgorithmException {
        String strEncodeToString;
        try {
            ArrayList arrayList = new ArrayList(1);
            if (ty0Var.a()) {
                strEncodeToString = ty0Var.b();
            } else {
                byte[] bytes = ty0Var.b().getBytes(Charset.forName("UTF-8"));
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    messageDigest.update(bytes, 0, bytes.length);
                    strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
            }
            arrayList.add(strEncodeToString);
            return arrayList;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static long d(da5 da5Var, ByteBuffer byteBuffer, long j) {
        e(da5Var, byteBuffer, 4, j);
        return byteBuffer.getInt() & 4294967295L;
    }

    public static void e(da5 da5Var, ByteBuffer byteBuffer, int i, long j) {
        int iA;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (iA = da5Var.a(j, byteBuffer)) != -1) {
            j += iA;
        }
        if (byteBuffer.remaining() > 0) {
            throw new yz9("ELF file truncated");
        }
        byteBuffer.position(0);
    }
}
