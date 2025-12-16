package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* loaded from: classes.dex */
public abstract class qvi {
    public static ByteBuffer a(ByteBuffer... byteBufferArr) {
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : byteBufferArr) {
            iRemaining += byteBuffer.remaining();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBufferAllocate.put(byteBuffer2);
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static void b(int i, int i2, int i3, int i4, int i5, int i6, oh9 oh9Var) {
        int iMin = Math.min(i, i2);
        int i7 = iMin / 2;
        float f = i4;
        float f2 = i3;
        int i8 = (int) ((f / f2) * iMin);
        if (iMin >= i7 && i8 >= i5 && i8 <= i6) {
            c(iMin, i8, i3, i4, oh9Var);
            return;
        }
        if (i8 < i5) {
            c(iMin, i5, i3, i4, oh9Var);
            return;
        }
        int i9 = (int) ((f2 / f) * i6);
        if (i9 < i7 || i6 < i5) {
            c(i7, i6, i3, i4, oh9Var);
        } else {
            c(i9, i6, i3, i4, oh9Var);
        }
    }

    public static void c(int i, int i2, int i3, int i4, oh9 oh9Var) {
        int i5;
        int i6;
        if (i3 > i4) {
            i6 = (int) ((i4 / i3) * i);
            i5 = i;
        } else {
            i5 = (int) ((i3 / i4) * i2);
            i6 = i2;
        }
        oh9Var.a = i;
        oh9Var.b = i2;
        oh9Var.c = i5;
        oh9Var.d = i6;
    }

    public static ByteBuffer d(String str, List list) {
        int iRemaining = 8;
        for (int i = 0; i < list.size(); i++) {
            iRemaining += ((ByteBuffer) list.get(i)).remaining();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iRemaining);
        byteBufferAllocate.putInt(iRemaining);
        byteBufferAllocate.put(str.getBytes(StandardCharsets.UTF_8), 0, 4);
        for (int i2 = 0; i2 < list.size(); i2++) {
            byteBufferAllocate.put((ByteBuffer) list.get(i2));
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    public static ByteBuffer e(String str, ByteBuffer byteBuffer) {
        return f(byteBuffer, str.getBytes(StandardCharsets.UTF_8));
    }

    public static ByteBuffer f(ByteBuffer byteBuffer, byte[] bArr) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining() + 8);
        byteBufferAllocate.putInt(byteBuffer.remaining() + 8);
        byteBufferAllocate.put(bArr, 0, 4);
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }
}
