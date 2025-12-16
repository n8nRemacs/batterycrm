package androidx.emoji2.text;

import androidx.annotation.RestrictTo;
import j.InterfaceC42148d;
import j.N;
import j.X;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;

/* compiled from: MetadataListReader.java */
@RestrictTo
@X
@InterfaceC42148d
/* loaded from: classes.dex */
class q {

    /* compiled from: MetadataListReader.java */
    public static class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @N
        public final ByteBuffer f46146a;

        public a(@N ByteBuffer byteBuffer) {
            this.f46146a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final void a(int i12) {
            ByteBuffer byteBuffer = this.f46146a;
            byteBuffer.position(byteBuffer.position() + i12);
        }
    }

    /* compiled from: MetadataListReader.java */
    public static class b implements d {
    }

    /* compiled from: MetadataListReader.java */
    public static class c {
    }

    /* compiled from: MetadataListReader.java */
    public interface d {
    }

    public static androidx.emoji2.text.flatbuffer.o a(MappedByteBuffer mappedByteBuffer) throws IOException {
        ByteBuffer byteBuffer;
        long j12;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        a aVar = new a(byteBufferDuplicate);
        aVar.a(4);
        int i12 = byteBufferDuplicate.getShort() & 65535;
        if (i12 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        aVar.a(6);
        int i13 = 0;
        while (true) {
            byteBuffer = aVar.f46146a;
            if (i13 >= i12) {
                j12 = -1;
                break;
            }
            int i14 = byteBuffer.getInt();
            aVar.a(4);
            j12 = byteBuffer.getInt() & 4294967295L;
            aVar.a(4);
            if (1835365473 == i14) {
                break;
            }
            i13++;
        }
        if (j12 != -1) {
            aVar.a((int) (j12 - byteBuffer.position()));
            aVar.a(12);
            long j13 = byteBuffer.getInt() & 4294967295L;
            for (int i15 = 0; i15 < j13; i15++) {
                int i16 = byteBuffer.getInt();
                long j14 = byteBuffer.getInt() & 4294967295L;
                byteBuffer.getInt();
                if (1164798569 == i16 || 1701669481 == i16) {
                    byteBufferDuplicate.position((int) (j14 + j12));
                    androidx.emoji2.text.flatbuffer.o oVar = new androidx.emoji2.text.flatbuffer.o();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    oVar.f46105b = byteBufferDuplicate;
                    oVar.f46104a = iPosition;
                    int i17 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    oVar.f46106c = i17;
                    oVar.f46107d = oVar.f46105b.getShort(i17);
                    return oVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
