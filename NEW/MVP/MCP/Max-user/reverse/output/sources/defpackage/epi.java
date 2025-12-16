package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.b;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import tech.kwik.core.generic.IntegerTooLargeException;
import tech.kwik.core.generic.InvalidIntegerEncodingException;

/* loaded from: classes.dex */
public abstract class epi {
    public static int a(long j) {
        if (j <= 63) {
            return 1;
        }
        if (j <= 16383) {
            return 2;
        }
        return j <= LockFreeTaskQueueCore.HEAD_MASK ? 4 : 8;
    }

    public static int b(int i, ByteBuffer byteBuffer) {
        if (i <= 63) {
            byteBuffer.put((byte) i);
            return 1;
        }
        if (i <= 16383) {
            byteBuffer.put((byte) ((i / 256) | 64));
            byteBuffer.put((byte) (i % 256));
            return 2;
        }
        if (i <= 1073741823) {
            int iPosition = byteBuffer.position();
            byteBuffer.putInt(i);
            byteBuffer.put(iPosition, (byte) (byteBuffer.get(iPosition) | (-128)));
            return 4;
        }
        int iPosition2 = byteBuffer.position();
        byteBuffer.putLong(i);
        byteBuffer.put(iPosition2, (byte) (byteBuffer.get(iPosition2) | (-64)));
        return 8;
    }

    public static int c(long j, ByteBuffer byteBuffer) {
        if (j <= 2147483647L) {
            return b((int) j, byteBuffer);
        }
        if (j > 4611686018427387903L) {
            throw new IllegalArgumentException("value cannot be encoded in variable-length integer");
        }
        int iPosition = byteBuffer.position();
        byteBuffer.putLong(j);
        byteBuffer.put(iPosition, (byte) (byteBuffer.get(iPosition) | (-64)));
        return 8;
    }

    public static final void d(b bVar) {
        View currentFocus = bVar.getWindow().getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
            try {
                ((InputMethodManager) bVar.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            } catch (Throwable unused) {
            }
        }
    }

    public static int e(InputStream inputStream) throws IOException {
        long jH = h(inputStream);
        if (jH <= 2147483647L) {
            return (int) jH;
        }
        throw new RuntimeException("value to large for Java int");
    }

    public static int f(ByteBuffer byteBuffer) throws InvalidIntegerEncodingException {
        long jI = i(byteBuffer);
        if (jI <= 2147483647L) {
            return (int) jI;
        }
        throw new IllegalArgumentException("value to large for Java int");
    }

    public static int g(ByteBuffer byteBuffer) throws InvalidIntegerEncodingException, IntegerTooLargeException {
        long jI = i(byteBuffer);
        if (jI <= 2147483647L) {
            return (int) jI;
        }
        throw new IntegerTooLargeException();
    }

    public static long h(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            throw new EOFException();
        }
        int i2 = (i & 192) >> 6;
        if (i2 == 0) {
            return i;
        }
        if (i2 == 1) {
            if (inputStream.read() != -1) {
                return ((i & 63) << 8) | (r7 & 255);
            }
            throw new EOFException();
        }
        if (i2 == 2) {
            int i3 = inputStream.read();
            int i4 = inputStream.read();
            int i5 = inputStream.read();
            if (i3 == -1 || i4 == -1 || i5 == -1) {
                throw new EOFException();
            }
            return ((i & 63) << 24) | ((i3 & 255) << 16) | ((i4 & 255) << 8) | (i5 & 255);
        }
        if (i2 != 3) {
            throw new RuntimeException();
        }
        byte[] bArr = new byte[8];
        int i6 = 0;
        bArr[0] = (byte) (i & 63);
        while (i6 != 7) {
            int i7 = inputStream.read(bArr, i6 + 1, 7 - i6);
            if (i7 <= 0) {
                throw new EOFException();
            }
            i6 += i7;
        }
        return ByteBuffer.wrap(bArr).getLong();
    }

    public static long i(ByteBuffer byteBuffer) throws InvalidIntegerEncodingException {
        if (byteBuffer.remaining() < 1) {
            throw new InvalidIntegerEncodingException();
        }
        byte b = byteBuffer.get();
        int i = (b & 192) >> 6;
        if (i == 0) {
            return b;
        }
        if (i == 1) {
            if (byteBuffer.remaining() < 1) {
                throw new InvalidIntegerEncodingException();
            }
            return byteBuffer.getShort() & 16383;
        }
        if (i == 2) {
            if (byteBuffer.remaining() < 3) {
                throw new InvalidIntegerEncodingException();
            }
            return byteBuffer.getInt() & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
        }
        if (i != 3) {
            throw new RuntimeException();
        }
        if (byteBuffer.remaining() < 7) {
            throw new InvalidIntegerEncodingException();
        }
        return byteBuffer.getLong() & 4611686018427387903L;
    }
}
