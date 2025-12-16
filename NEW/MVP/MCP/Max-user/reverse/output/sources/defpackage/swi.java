package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class swi {
    public static final long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        long j = 0;
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            j += i;
            i = inputStream.read(bArr);
        }
        return j;
    }

    public static dq0 b(bz9 bz9Var) throws IOException {
        long jH;
        bz9Var.v(4);
        int unsignedShort = bz9Var.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        bz9Var.v(6);
        int i = 0;
        while (true) {
            if (i >= unsignedShort) {
                jH = -1;
                break;
            }
            int iC = bz9Var.c();
            bz9Var.v(4);
            jH = bz9Var.h();
            bz9Var.v(4);
            if (1835365473 == iC) {
                break;
            }
            i++;
        }
        if (jH != -1) {
            bz9Var.v((int) (jH - bz9Var.getPosition()));
            bz9Var.v(12);
            long jH2 = bz9Var.h();
            for (int i2 = 0; i2 < jH2; i2++) {
                int iC2 = bz9Var.c();
                long jH3 = bz9Var.h();
                long jH4 = bz9Var.h();
                if (1164798569 == iC2 || 1701669481 == iC2) {
                    return new dq0(5, jH3 + jH, jH4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static az9 c(FileInputStream fileInputStream) throws IOException {
        z95 z95Var = new z95(fileInputStream);
        dq0 dq0VarB = b(z95Var);
        z95Var.v((int) (dq0VarB.b - z95Var.a));
        long j = dq0VarB.c;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) j);
        int i = fileInputStream.read(byteBufferAllocate.array());
        if (i != j) {
            throw new IOException("Needed " + j + " bytes, got " + i);
        }
        az9 az9Var = new az9();
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        int iPosition = byteBufferAllocate.position() + byteBufferAllocate.getInt(byteBufferAllocate.position());
        az9Var.d = byteBufferAllocate;
        az9Var.a = iPosition;
        int i2 = iPosition - byteBufferAllocate.getInt(iPosition);
        az9Var.b = i2;
        az9Var.c = ((ByteBuffer) az9Var.d).getShort(i2);
        return az9Var;
    }
}
