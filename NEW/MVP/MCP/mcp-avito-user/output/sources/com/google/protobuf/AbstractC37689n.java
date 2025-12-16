package com.google.protobuf;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.protobuf.C37670d0;
import com.google.protobuf.C37694p0;
import com.google.protobuf.WireFormat;
import com.google.protobuf.Writer;
import com.google.protobuf.s1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Http2;

/* compiled from: BinaryWriter.java */
@InterfaceC37706w
/* renamed from: com.google.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
abstract class AbstractC37689n extends AbstractC37698s implements Writer {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC37695q f362892a;

    /* renamed from: b, reason: collision with root package name */
    public final int f362893b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque<AbstractC37673f> f362894c = new ArrayDeque<>(4);

    /* renamed from: d, reason: collision with root package name */
    public int f362895d;

    /* compiled from: BinaryWriter.java */
    /* renamed from: com.google.protobuf.n$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f362896a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f362896a = iArr;
            try {
                iArr[WireFormat.FieldType.f362796k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f362896a[WireFormat.FieldType.f362795j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f362896a[WireFormat.FieldType.f362794i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f362896a[WireFormat.FieldType.f362793h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f362896a[WireFormat.FieldType.f362791f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f362896a[WireFormat.FieldType.f362803r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f362896a[WireFormat.FieldType.f362804s.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f362896a[WireFormat.FieldType.f362805t.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f362896a[WireFormat.FieldType.f362806u.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f362896a[WireFormat.FieldType.f362797l.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f362896a[WireFormat.FieldType.f362801p.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f362896a[WireFormat.FieldType.f362792g.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f362896a[WireFormat.FieldType.f362790e.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f362896a[WireFormat.FieldType.f362789d.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f362896a[WireFormat.FieldType.f362799n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f362896a[WireFormat.FieldType.f362800o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f362896a[WireFormat.FieldType.f362802q.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* compiled from: BinaryWriter.java */
    /* renamed from: com.google.protobuf.n$b */
    public static final class b extends AbstractC37689n {

        /* renamed from: e, reason: collision with root package name */
        public ByteBuffer f362897e;

        /* renamed from: f, reason: collision with root package name */
        public int f362898f;

        /* renamed from: g, reason: collision with root package name */
        public int f362899g;

        @Override // com.google.protobuf.Writer
        public final void a(int i12, AbstractC37700t abstractC37700t) {
            try {
                abstractC37700t.P(this);
                k(10);
                t(abstractC37700t.size());
                s(i12, 2);
            } catch (IOException e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // com.google.protobuf.Writer
        public final void c(int i12, Object obj, T0 t02) {
            s(i12, 4);
            t02.b(obj, this);
            s(i12, 3);
        }

        @Override // com.google.protobuf.Writer
        public final void e(int i12, Object obj, T0 t02) {
            int iJ2 = j();
            t02.b(obj, this);
            int iJ3 = j() - iJ2;
            k(10);
            t(iJ3);
            s(i12, 2);
        }

        @Override // com.google.protobuf.AbstractC37698s
        public final void g(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            int i12 = this.f362899g;
            if (i12 + 1 < iRemaining) {
                this.f362895d += iRemaining;
                this.f362894c.addFirst(AbstractC37673f.i(byteBuffer));
                v(this.f362892a.a(this.f362893b));
            } else {
                int i13 = i12 - iRemaining;
                this.f362899g = i13;
                this.f362897e.position(i13 + 1);
                this.f362897e.put(byteBuffer);
            }
        }

        @Override // com.google.protobuf.AbstractC37698s
        public final void h(byte[] bArr, int i12, int i13) {
            int i14 = this.f362899g;
            if (i14 + 1 < i13) {
                this.f362895d += i13;
                this.f362894c.addFirst(AbstractC37673f.j(i12, i13, bArr));
                v(this.f362892a.a(this.f362893b));
            } else {
                int i15 = i14 - i13;
                this.f362899g = i15;
                this.f362897e.position(i15 + 1);
                this.f362897e.put(bArr, i12, i13);
            }
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final int j() {
            return (this.f362898f - this.f362899g) + this.f362895d;
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void k(int i12) {
            if (this.f362899g + 1 < i12) {
                v(this.f362892a.a(Math.max(i12, this.f362893b)));
            }
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void l(boolean z12) {
            byte b12 = z12 ? (byte) 1 : (byte) 0;
            ByteBuffer byteBuffer = this.f362897e;
            int i12 = this.f362899g;
            this.f362899g = i12 - 1;
            byteBuffer.put(i12, b12);
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void m(int i12) {
            int i13 = this.f362899g;
            this.f362899g = i13 - 4;
            this.f362897e.putInt(i13 - 3, i12);
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void n(long j12) {
            int i12 = this.f362899g;
            this.f362899g = i12 - 8;
            this.f362897e.putLong(i12 - 7, j12);
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void o(int i12) {
            if (i12 >= 0) {
                t(i12);
            } else {
                u(i12);
            }
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void q(int i12) {
            t(CodedOutputStream.G(i12));
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void r(long j12) {
            u(CodedOutputStream.H(j12));
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void s(int i12, int i13) {
            t((i12 << 3) | i13);
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void t(int i12) {
            if ((i12 & (-128)) == 0) {
                ByteBuffer byteBuffer = this.f362897e;
                int i13 = this.f362899g;
                this.f362899g = i13 - 1;
                byteBuffer.put(i13, (byte) i12);
                return;
            }
            if ((i12 & (-16384)) == 0) {
                y(i12);
                return;
            }
            if (((-2097152) & i12) == 0) {
                x(i12);
                return;
            }
            if (((-268435456) & i12) == 0) {
                w(i12);
                return;
            }
            ByteBuffer byteBuffer2 = this.f362897e;
            int i14 = this.f362899g;
            this.f362899g = i14 - 1;
            byteBuffer2.put(i14, (byte) (i12 >>> 28));
            int i15 = this.f362899g;
            this.f362899g = i15 - 4;
            this.f362897e.putInt(i15 - 3, (i12 & 127) | 128 | ((((i12 >>> 21) & 127) | 128) << 24) | ((((i12 >>> 14) & 127) | 128) << 16) | ((((i12 >>> 7) & 127) | 128) << 8));
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void u(long j12) {
            switch (AbstractC37689n.i(j12)) {
                case 1:
                    ByteBuffer byteBuffer = this.f362897e;
                    int i12 = this.f362899g;
                    this.f362899g = i12 - 1;
                    byteBuffer.put(i12, (byte) j12);
                    break;
                case 2:
                    y((int) j12);
                    break;
                case 3:
                    x((int) j12);
                    break;
                case 4:
                    w((int) j12);
                    break;
                case 5:
                    int i13 = this.f362899g;
                    this.f362899g = i13 - 5;
                    this.f362897e.putLong(i13 - 7, (((j12 & 127) | 128) << 24) | ((j12 & 34091302912L) << 28) | (((j12 & 266338304) | 268435456) << 27) | (((j12 & 2080768) | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 26) | (((j12 & 16256) | 16384) << 25));
                    break;
                case 6:
                    int i14 = this.f362899g;
                    this.f362899g = i14 - 6;
                    this.f362897e.putLong(i14 - 7, (((j12 & 127) | 128) << 16) | ((j12 & 4363686772736L) << 21) | (((j12 & 34091302912L) | 34359738368L) << 20) | (((j12 & 266338304) | 268435456) << 19) | (((j12 & 2080768) | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 18) | (((j12 & 16256) | 16384) << 17));
                    break;
                case 7:
                    int i15 = this.f362899g - 7;
                    this.f362899g = i15;
                    this.f362897e.putLong(i15, (((j12 & 127) | 128) << 8) | ((4398046511104L | (j12 & 4363686772736L)) << 13) | ((558551906910208L & j12) << 14) | (((j12 & 34091302912L) | 34359738368L) << 12) | (((j12 & 266338304) | 268435456) << 11) | (((j12 & 2080768) | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 10) | (((j12 & 16256) | 16384) << 9));
                    break;
                case 8:
                    int i16 = this.f362899g;
                    this.f362899g = i16 - 8;
                    this.f362897e.putLong(i16 - 7, (j12 & 127) | 128 | ((4398046511104L | (j12 & 4363686772736L)) << 5) | (((558551906910208L & j12) | 562949953421312L) << 6) | ((71494644084506624L & j12) << 7) | (((j12 & 34091302912L) | 34359738368L) << 4) | (((j12 & 266338304) | 268435456) << 3) | (((j12 & 2080768) | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 2) | (((j12 & 16256) | 16384) << 1));
                    break;
                case 9:
                    ByteBuffer byteBuffer2 = this.f362897e;
                    int i17 = this.f362899g;
                    this.f362899g = i17 - 1;
                    byteBuffer2.put(i17, (byte) (j12 >>> 56));
                    z(j12 & 72057594037927935L);
                    break;
                case 10:
                    ByteBuffer byteBuffer3 = this.f362897e;
                    int i18 = this.f362899g;
                    this.f362899g = i18 - 1;
                    byteBuffer3.put(i18, (byte) (j12 >>> 63));
                    ByteBuffer byteBuffer4 = this.f362897e;
                    int i19 = this.f362899g;
                    this.f362899g = i19 - 1;
                    byteBuffer4.put(i19, (byte) (((j12 >>> 56) & 127) | 128));
                    z(j12 & 72057594037927935L);
                    break;
            }
        }

        public final void v(AbstractC37673f abstractC37673f) {
            if (!abstractC37673f.d()) {
                throw new RuntimeException("Allocated buffer does not have NIO buffer");
            }
            ByteBuffer byteBufferF = abstractC37673f.f();
            if (!byteBufferF.isDirect()) {
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            ByteBuffer byteBuffer = this.f362897e;
            if (byteBuffer != null) {
                int i12 = this.f362895d;
                int i13 = this.f362898f;
                int i14 = this.f362899g;
                this.f362895d = (i13 - i14) + i12;
                byteBuffer.position(i14 + 1);
                this.f362897e = null;
                this.f362899g = 0;
                this.f362898f = 0;
            }
            this.f362894c.addFirst(abstractC37673f);
            this.f362897e = byteBufferF;
            byteBufferF.limit(byteBufferF.capacity());
            this.f362897e.position(0);
            this.f362897e.order(ByteOrder.LITTLE_ENDIAN);
            int iLimit = this.f362897e.limit() - 1;
            this.f362898f = iLimit;
            this.f362899g = iLimit;
        }

        public final void w(int i12) {
            int i13 = this.f362899g;
            this.f362899g = i13 - 4;
            this.f362897e.putInt(i13 - 3, (i12 & 127) | 128 | ((266338304 & i12) << 3) | (((2080768 & i12) | 2097152) << 2) | (((i12 & 16256) | Http2.INITIAL_MAX_FRAME_SIZE) << 1));
        }

        @Override // com.google.protobuf.Writer
        public final void writeBool(int i12, boolean z12) {
            k(6);
            byte b12 = z12 ? (byte) 1 : (byte) 0;
            ByteBuffer byteBuffer = this.f362897e;
            int i13 = this.f362899g;
            this.f362899g = i13 - 1;
            byteBuffer.put(i13, b12);
            s(i12, 0);
        }

        @Override // com.google.protobuf.Writer
        @Deprecated
        public final void writeEndGroup(int i12) {
            s(i12, 4);
        }

        @Override // com.google.protobuf.Writer
        public final void writeFixed32(int i12, int i13) {
            k(9);
            m(i13);
            s(i12, 5);
        }

        @Override // com.google.protobuf.Writer
        public final void writeFixed64(int i12, long j12) {
            k(13);
            n(j12);
            s(i12, 1);
        }

        @Override // com.google.protobuf.Writer
        public final void writeInt32(int i12, int i13) {
            k(15);
            o(i13);
            s(i12, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeMessage(int i12, Object obj) {
            int iJ2 = j();
            N0.f362717c.b(obj).b(obj, this);
            int iJ3 = j() - iJ2;
            k(10);
            t(iJ3);
            s(i12, 2);
        }

        @Override // com.google.protobuf.Writer
        public final void writeSInt32(int i12, int i13) {
            k(10);
            q(i13);
            s(i12, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeSInt64(int i12, long j12) {
            k(15);
            r(j12);
            s(i12, 0);
        }

        @Override // com.google.protobuf.Writer
        @Deprecated
        public final void writeStartGroup(int i12) {
            s(i12, 3);
        }

        @Override // com.google.protobuf.Writer
        public final void writeString(int i12, String str) {
            int i13;
            int i14;
            int i15;
            char cCharAt;
            int iJ2 = j();
            k(str.length());
            int length = str.length() - 1;
            this.f362899g -= length;
            while (length >= 0 && (cCharAt = str.charAt(length)) < 128) {
                this.f362897e.put(this.f362899g + length, (byte) cCharAt);
                length--;
            }
            if (length == -1) {
                this.f362899g--;
            } else {
                this.f362899g += length;
                while (length >= 0) {
                    char cCharAt2 = str.charAt(length);
                    if (cCharAt2 < 128 && (i15 = this.f362899g) >= 0) {
                        ByteBuffer byteBuffer = this.f362897e;
                        this.f362899g = i15 - 1;
                        byteBuffer.put(i15, (byte) cCharAt2);
                    } else if (cCharAt2 < 2048 && (i14 = this.f362899g) > 0) {
                        ByteBuffer byteBuffer2 = this.f362897e;
                        this.f362899g = i14 - 1;
                        byteBuffer2.put(i14, (byte) ((cCharAt2 & '?') | 128));
                        ByteBuffer byteBuffer3 = this.f362897e;
                        int i16 = this.f362899g;
                        this.f362899g = i16 - 1;
                        byteBuffer3.put(i16, (byte) ((cCharAt2 >>> 6) | 960));
                    } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i13 = this.f362899g) > 1) {
                        ByteBuffer byteBuffer4 = this.f362897e;
                        this.f362899g = i13 - 1;
                        byteBuffer4.put(i13, (byte) ((cCharAt2 & '?') | 128));
                        ByteBuffer byteBuffer5 = this.f362897e;
                        int i17 = this.f362899g;
                        this.f362899g = i17 - 1;
                        byteBuffer5.put(i17, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        ByteBuffer byteBuffer6 = this.f362897e;
                        int i18 = this.f362899g;
                        this.f362899g = i18 - 1;
                        byteBuffer6.put(i18, (byte) ((cCharAt2 >>> '\f') | 480));
                    } else {
                        if (this.f362899g > 2) {
                            if (length != 0) {
                                char cCharAt3 = str.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                    length--;
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                    ByteBuffer byteBuffer7 = this.f362897e;
                                    int i19 = this.f362899g;
                                    this.f362899g = i19 - 1;
                                    byteBuffer7.put(i19, (byte) ((codePoint & 63) | 128));
                                    ByteBuffer byteBuffer8 = this.f362897e;
                                    int i22 = this.f362899g;
                                    this.f362899g = i22 - 1;
                                    byteBuffer8.put(i22, (byte) (((codePoint >>> 6) & 63) | 128));
                                    ByteBuffer byteBuffer9 = this.f362897e;
                                    int i23 = this.f362899g;
                                    this.f362899g = i23 - 1;
                                    byteBuffer9.put(i23, (byte) (((codePoint >>> 12) & 63) | 128));
                                    ByteBuffer byteBuffer10 = this.f362897e;
                                    int i24 = this.f362899g;
                                    this.f362899g = i24 - 1;
                                    byteBuffer10.put(i24, (byte) ((codePoint >>> 18) | 240));
                                }
                            }
                            throw new s1.d(length - 1, length);
                        }
                        k(length);
                        length++;
                    }
                    length--;
                }
            }
            int iJ3 = j() - iJ2;
            k(10);
            t(iJ3);
            s(i12, 2);
        }

        @Override // com.google.protobuf.Writer
        public final void writeUInt32(int i12, int i13) {
            k(10);
            t(i13);
            s(i12, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeUInt64(int i12, long j12) {
            k(15);
            u(j12);
            s(i12, 0);
        }

        public final void x(int i12) {
            int i13 = this.f362899g - 3;
            this.f362899g = i13;
            this.f362897e.putInt(i13, (((i12 & 127) | 128) << 8) | ((2080768 & i12) << 10) | (((i12 & 16256) | Http2.INITIAL_MAX_FRAME_SIZE) << 9));
        }

        public final void y(int i12) {
            int i13 = this.f362899g;
            this.f362899g = i13 - 2;
            this.f362897e.putShort(i13 - 1, (short) ((i12 & 127) | 128 | ((i12 & 16256) << 1)));
        }

        public final void z(long j12) {
            int i12 = this.f362899g;
            this.f362899g = i12 - 8;
            this.f362897e.putLong(i12 - 7, (j12 & 127) | 128 | (((71494644084506624L & j12) | 72057594037927936L) << 7) | (((558551906910208L & j12) | 562949953421312L) << 6) | (((4363686772736L & j12) | 4398046511104L) << 5) | (((34091302912L & j12) | 34359738368L) << 4) | (((266338304 & j12) | 268435456) << 3) | (((2080768 & j12) | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 2) | (((16256 & j12) | 16384) << 1));
        }
    }

    /* compiled from: BinaryWriter.java */
    /* renamed from: com.google.protobuf.n$c */
    public static final class c extends AbstractC37689n {

        /* renamed from: e, reason: collision with root package name */
        public AbstractC37673f f362900e;

        /* renamed from: f, reason: collision with root package name */
        public byte[] f362901f;

        /* renamed from: g, reason: collision with root package name */
        public int f362902g;

        /* renamed from: h, reason: collision with root package name */
        public int f362903h;

        /* renamed from: i, reason: collision with root package name */
        public int f362904i;

        /* renamed from: j, reason: collision with root package name */
        public int f362905j;

        /* renamed from: k, reason: collision with root package name */
        public int f362906k;

        @Override // com.google.protobuf.Writer
        public final void a(int i12, AbstractC37700t abstractC37700t) {
            try {
                abstractC37700t.P(this);
                k(10);
                t(abstractC37700t.size());
                s(i12, 2);
            } catch (IOException e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // com.google.protobuf.Writer
        public final void c(int i12, Object obj, T0 t02) {
            s(i12, 4);
            t02.b(obj, this);
            s(i12, 3);
        }

        @Override // com.google.protobuf.Writer
        public final void e(int i12, Object obj, T0 t02) {
            int iJ2 = j();
            t02.b(obj, this);
            int iJ3 = j() - iJ2;
            k(10);
            t(iJ3);
            s(i12, 2);
        }

        @Override // com.google.protobuf.AbstractC37698s
        public final void g(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (this.f362906k - this.f362904i < iRemaining) {
                this.f362895d += iRemaining;
                this.f362894c.addFirst(AbstractC37673f.i(byteBuffer));
                v(this.f362892a.b(this.f362893b));
            }
            int i12 = this.f362906k - iRemaining;
            this.f362906k = i12;
            byteBuffer.get(this.f362901f, i12 + 1, iRemaining);
        }

        @Override // com.google.protobuf.AbstractC37698s
        public final void h(byte[] bArr, int i12, int i13) {
            int i14 = this.f362906k;
            if (i14 - this.f362904i < i13) {
                this.f362895d += i13;
                this.f362894c.addFirst(AbstractC37673f.j(i12, i13, bArr));
                v(this.f362892a.b(this.f362893b));
            } else {
                int i15 = i14 - i13;
                this.f362906k = i15;
                System.arraycopy(bArr, i12, this.f362901f, i15 + 1, i13);
            }
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final int j() {
            return (this.f362905j - this.f362906k) + this.f362895d;
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void k(int i12) {
            if (this.f362906k - this.f362904i < i12) {
                v(this.f362892a.b(Math.max(i12, this.f362893b)));
            }
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void l(boolean z12) {
            byte b12 = z12 ? (byte) 1 : (byte) 0;
            byte[] bArr = this.f362901f;
            int i12 = this.f362906k;
            this.f362906k = i12 - 1;
            bArr[i12] = b12;
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void m(int i12) {
            byte[] bArr = this.f362901f;
            int i13 = this.f362906k;
            int i14 = i13 - 1;
            this.f362906k = i14;
            bArr[i13] = (byte) ((i12 >> 24) & 255);
            int i15 = i13 - 2;
            this.f362906k = i15;
            bArr[i14] = (byte) ((i12 >> 16) & 255);
            int i16 = i13 - 3;
            this.f362906k = i16;
            bArr[i15] = (byte) ((i12 >> 8) & 255);
            this.f362906k = i13 - 4;
            bArr[i16] = (byte) (i12 & 255);
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void n(long j12) {
            byte[] bArr = this.f362901f;
            int i12 = this.f362906k;
            int i13 = i12 - 1;
            this.f362906k = i13;
            bArr[i12] = (byte) (((int) (j12 >> 56)) & 255);
            int i14 = i12 - 2;
            this.f362906k = i14;
            bArr[i13] = (byte) (((int) (j12 >> 48)) & 255);
            int i15 = i12 - 3;
            this.f362906k = i15;
            bArr[i14] = (byte) (((int) (j12 >> 40)) & 255);
            int i16 = i12 - 4;
            this.f362906k = i16;
            bArr[i15] = (byte) (((int) (j12 >> 32)) & 255);
            int i17 = i12 - 5;
            this.f362906k = i17;
            bArr[i16] = (byte) (((int) (j12 >> 24)) & 255);
            int i18 = i12 - 6;
            this.f362906k = i18;
            bArr[i17] = (byte) (((int) (j12 >> 16)) & 255);
            int i19 = i12 - 7;
            this.f362906k = i19;
            bArr[i18] = (byte) (((int) (j12 >> 8)) & 255);
            this.f362906k = i12 - 8;
            bArr[i19] = (byte) (((int) j12) & 255);
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void o(int i12) {
            if (i12 >= 0) {
                t(i12);
            } else {
                u(i12);
            }
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void q(int i12) {
            t(CodedOutputStream.G(i12));
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void r(long j12) {
            u(CodedOutputStream.H(j12));
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void s(int i12, int i13) {
            t((i12 << 3) | i13);
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void t(int i12) {
            if ((i12 & (-128)) == 0) {
                byte[] bArr = this.f362901f;
                int i13 = this.f362906k;
                this.f362906k = i13 - 1;
                bArr[i13] = (byte) i12;
                return;
            }
            if ((i12 & (-16384)) == 0) {
                byte[] bArr2 = this.f362901f;
                int i14 = this.f362906k;
                int i15 = i14 - 1;
                this.f362906k = i15;
                bArr2[i14] = (byte) (i12 >>> 7);
                this.f362906k = i14 - 2;
                bArr2[i15] = (byte) ((i12 & 127) | 128);
                return;
            }
            if (((-2097152) & i12) == 0) {
                byte[] bArr3 = this.f362901f;
                int i16 = this.f362906k;
                int i17 = i16 - 1;
                this.f362906k = i17;
                bArr3[i16] = (byte) (i12 >>> 14);
                int i18 = i16 - 2;
                this.f362906k = i18;
                bArr3[i17] = (byte) (((i12 >>> 7) & 127) | 128);
                this.f362906k = i16 - 3;
                bArr3[i18] = (byte) ((i12 & 127) | 128);
                return;
            }
            if (((-268435456) & i12) == 0) {
                byte[] bArr4 = this.f362901f;
                int i19 = this.f362906k;
                int i22 = i19 - 1;
                this.f362906k = i22;
                bArr4[i19] = (byte) (i12 >>> 21);
                int i23 = i19 - 2;
                this.f362906k = i23;
                bArr4[i22] = (byte) (((i12 >>> 14) & 127) | 128);
                int i24 = i19 - 3;
                this.f362906k = i24;
                bArr4[i23] = (byte) (((i12 >>> 7) & 127) | 128);
                this.f362906k = i19 - 4;
                bArr4[i24] = (byte) ((i12 & 127) | 128);
                return;
            }
            byte[] bArr5 = this.f362901f;
            int i25 = this.f362906k;
            int i26 = i25 - 1;
            this.f362906k = i26;
            bArr5[i25] = (byte) (i12 >>> 28);
            int i27 = i25 - 2;
            this.f362906k = i27;
            bArr5[i26] = (byte) (((i12 >>> 21) & 127) | 128);
            int i28 = i25 - 3;
            this.f362906k = i28;
            bArr5[i27] = (byte) (((i12 >>> 14) & 127) | 128);
            int i29 = i25 - 4;
            this.f362906k = i29;
            bArr5[i28] = (byte) (((i12 >>> 7) & 127) | 128);
            this.f362906k = i25 - 5;
            bArr5[i29] = (byte) ((i12 & 127) | 128);
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void u(long j12) {
            switch (AbstractC37689n.i(j12)) {
                case 1:
                    byte[] bArr = this.f362901f;
                    int i12 = this.f362906k;
                    this.f362906k = i12 - 1;
                    bArr[i12] = (byte) j12;
                    break;
                case 2:
                    byte[] bArr2 = this.f362901f;
                    int i13 = this.f362906k;
                    int i14 = i13 - 1;
                    this.f362906k = i14;
                    bArr2[i13] = (byte) (j12 >>> 7);
                    this.f362906k = i13 - 2;
                    bArr2[i14] = (byte) ((((int) j12) & 127) | 128);
                    break;
                case 3:
                    byte[] bArr3 = this.f362901f;
                    int i15 = this.f362906k;
                    int i16 = i15 - 1;
                    this.f362906k = i16;
                    bArr3[i15] = (byte) (((int) j12) >>> 14);
                    int i17 = i15 - 2;
                    this.f362906k = i17;
                    bArr3[i16] = (byte) (((j12 >>> 7) & 127) | 128);
                    this.f362906k = i15 - 3;
                    bArr3[i17] = (byte) ((j12 & 127) | 128);
                    break;
                case 4:
                    byte[] bArr4 = this.f362901f;
                    int i18 = this.f362906k;
                    int i19 = i18 - 1;
                    this.f362906k = i19;
                    bArr4[i18] = (byte) (j12 >>> 21);
                    int i22 = i18 - 2;
                    this.f362906k = i22;
                    bArr4[i19] = (byte) (((j12 >>> 14) & 127) | 128);
                    int i23 = i18 - 3;
                    this.f362906k = i23;
                    bArr4[i22] = (byte) (((j12 >>> 7) & 127) | 128);
                    this.f362906k = i18 - 4;
                    bArr4[i23] = (byte) ((j12 & 127) | 128);
                    break;
                case 5:
                    byte[] bArr5 = this.f362901f;
                    int i24 = this.f362906k;
                    int i25 = i24 - 1;
                    this.f362906k = i25;
                    bArr5[i24] = (byte) (j12 >>> 28);
                    int i26 = i24 - 2;
                    this.f362906k = i26;
                    bArr5[i25] = (byte) (((j12 >>> 21) & 127) | 128);
                    int i27 = i24 - 3;
                    this.f362906k = i27;
                    bArr5[i26] = (byte) (((j12 >>> 14) & 127) | 128);
                    int i28 = i24 - 4;
                    this.f362906k = i28;
                    bArr5[i27] = (byte) (((j12 >>> 7) & 127) | 128);
                    this.f362906k = i24 - 5;
                    bArr5[i28] = (byte) ((j12 & 127) | 128);
                    break;
                case 6:
                    byte[] bArr6 = this.f362901f;
                    int i29 = this.f362906k;
                    int i32 = i29 - 1;
                    this.f362906k = i32;
                    bArr6[i29] = (byte) (j12 >>> 35);
                    int i33 = i29 - 2;
                    this.f362906k = i33;
                    bArr6[i32] = (byte) (((j12 >>> 28) & 127) | 128);
                    int i34 = i29 - 3;
                    this.f362906k = i34;
                    bArr6[i33] = (byte) (((j12 >>> 21) & 127) | 128);
                    int i35 = i29 - 4;
                    this.f362906k = i35;
                    bArr6[i34] = (byte) (((j12 >>> 14) & 127) | 128);
                    int i36 = i29 - 5;
                    this.f362906k = i36;
                    bArr6[i35] = (byte) (((j12 >>> 7) & 127) | 128);
                    this.f362906k = i29 - 6;
                    bArr6[i36] = (byte) ((j12 & 127) | 128);
                    break;
                case 7:
                    byte[] bArr7 = this.f362901f;
                    int i37 = this.f362906k;
                    int i38 = i37 - 1;
                    this.f362906k = i38;
                    bArr7[i37] = (byte) (j12 >>> 42);
                    int i39 = i37 - 2;
                    this.f362906k = i39;
                    bArr7[i38] = (byte) (((j12 >>> 35) & 127) | 128);
                    int i42 = i37 - 3;
                    this.f362906k = i42;
                    bArr7[i39] = (byte) (((j12 >>> 28) & 127) | 128);
                    int i43 = i37 - 4;
                    this.f362906k = i43;
                    bArr7[i42] = (byte) (((j12 >>> 21) & 127) | 128);
                    int i44 = i37 - 5;
                    this.f362906k = i44;
                    bArr7[i43] = (byte) (((j12 >>> 14) & 127) | 128);
                    int i45 = i37 - 6;
                    this.f362906k = i45;
                    bArr7[i44] = (byte) (((j12 >>> 7) & 127) | 128);
                    this.f362906k = i37 - 7;
                    bArr7[i45] = (byte) ((j12 & 127) | 128);
                    break;
                case 8:
                    byte[] bArr8 = this.f362901f;
                    int i46 = this.f362906k;
                    int i47 = i46 - 1;
                    this.f362906k = i47;
                    bArr8[i46] = (byte) (j12 >>> 49);
                    int i48 = i46 - 2;
                    this.f362906k = i48;
                    bArr8[i47] = (byte) (((j12 >>> 42) & 127) | 128);
                    int i49 = i46 - 3;
                    this.f362906k = i49;
                    bArr8[i48] = (byte) (((j12 >>> 35) & 127) | 128);
                    int i52 = i46 - 4;
                    this.f362906k = i52;
                    bArr8[i49] = (byte) (((j12 >>> 28) & 127) | 128);
                    int i53 = i46 - 5;
                    this.f362906k = i53;
                    bArr8[i52] = (byte) (((j12 >>> 21) & 127) | 128);
                    int i54 = i46 - 6;
                    this.f362906k = i54;
                    bArr8[i53] = (byte) (((j12 >>> 14) & 127) | 128);
                    int i55 = i46 - 7;
                    this.f362906k = i55;
                    bArr8[i54] = (byte) (((j12 >>> 7) & 127) | 128);
                    this.f362906k = i46 - 8;
                    bArr8[i55] = (byte) ((j12 & 127) | 128);
                    break;
                case 9:
                    byte[] bArr9 = this.f362901f;
                    int i56 = this.f362906k;
                    int i57 = i56 - 1;
                    this.f362906k = i57;
                    bArr9[i56] = (byte) (j12 >>> 56);
                    int i58 = i56 - 2;
                    this.f362906k = i58;
                    bArr9[i57] = (byte) (((j12 >>> 49) & 127) | 128);
                    int i59 = i56 - 3;
                    this.f362906k = i59;
                    bArr9[i58] = (byte) (((j12 >>> 42) & 127) | 128);
                    int i62 = i56 - 4;
                    this.f362906k = i62;
                    bArr9[i59] = (byte) (((j12 >>> 35) & 127) | 128);
                    int i63 = i56 - 5;
                    this.f362906k = i63;
                    bArr9[i62] = (byte) (((j12 >>> 28) & 127) | 128);
                    int i64 = i56 - 6;
                    this.f362906k = i64;
                    bArr9[i63] = (byte) (((j12 >>> 21) & 127) | 128);
                    int i65 = i56 - 7;
                    this.f362906k = i65;
                    bArr9[i64] = (byte) (((j12 >>> 14) & 127) | 128);
                    int i66 = i56 - 8;
                    this.f362906k = i66;
                    bArr9[i65] = (byte) (((j12 >>> 7) & 127) | 128);
                    this.f362906k = i56 - 9;
                    bArr9[i66] = (byte) ((j12 & 127) | 128);
                    break;
                case 10:
                    byte[] bArr10 = this.f362901f;
                    int i67 = this.f362906k;
                    int i68 = i67 - 1;
                    this.f362906k = i68;
                    bArr10[i67] = (byte) (j12 >>> 63);
                    int i69 = i67 - 2;
                    this.f362906k = i69;
                    bArr10[i68] = (byte) (((j12 >>> 56) & 127) | 128);
                    int i72 = i67 - 3;
                    this.f362906k = i72;
                    bArr10[i69] = (byte) (((j12 >>> 49) & 127) | 128);
                    int i73 = i67 - 4;
                    this.f362906k = i73;
                    bArr10[i72] = (byte) (((j12 >>> 42) & 127) | 128);
                    int i74 = i67 - 5;
                    this.f362906k = i74;
                    bArr10[i73] = (byte) (((j12 >>> 35) & 127) | 128);
                    int i75 = i67 - 6;
                    this.f362906k = i75;
                    bArr10[i74] = (byte) (((j12 >>> 28) & 127) | 128);
                    int i76 = i67 - 7;
                    this.f362906k = i76;
                    bArr10[i75] = (byte) (((j12 >>> 21) & 127) | 128);
                    int i77 = i67 - 8;
                    this.f362906k = i77;
                    bArr10[i76] = (byte) (((j12 >>> 14) & 127) | 128);
                    int i78 = i67 - 9;
                    this.f362906k = i78;
                    bArr10[i77] = (byte) (((j12 >>> 7) & 127) | 128);
                    this.f362906k = i67 - 10;
                    bArr10[i78] = (byte) ((j12 & 127) | 128);
                    break;
            }
        }

        public final void v(AbstractC37673f abstractC37673f) {
            if (!abstractC37673f.c()) {
                throw new RuntimeException("Allocator returned non-heap buffer");
            }
            AbstractC37673f abstractC37673f2 = this.f362900e;
            if (abstractC37673f2 != null) {
                int i12 = this.f362895d;
                int i13 = this.f362905j;
                int i14 = this.f362906k;
                this.f362895d = (i13 - i14) + i12;
                abstractC37673f2.h((i14 - abstractC37673f2.b()) + 1);
                this.f362900e = null;
                this.f362906k = 0;
                this.f362905j = 0;
            }
            this.f362894c.addFirst(abstractC37673f);
            this.f362900e = abstractC37673f;
            this.f362901f = abstractC37673f.a();
            int iB2 = abstractC37673f.b();
            this.f362903h = abstractC37673f.e() + iB2;
            int iG2 = iB2 + abstractC37673f.g();
            this.f362902g = iG2;
            this.f362904i = iG2 - 1;
            int i15 = this.f362903h - 1;
            this.f362905j = i15;
            this.f362906k = i15;
        }

        @Override // com.google.protobuf.Writer
        public final void writeBool(int i12, boolean z12) {
            k(6);
            byte b12 = z12 ? (byte) 1 : (byte) 0;
            byte[] bArr = this.f362901f;
            int i13 = this.f362906k;
            this.f362906k = i13 - 1;
            bArr[i13] = b12;
            s(i12, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeEndGroup(int i12) {
            s(i12, 4);
        }

        @Override // com.google.protobuf.Writer
        public final void writeFixed32(int i12, int i13) {
            k(9);
            m(i13);
            s(i12, 5);
        }

        @Override // com.google.protobuf.Writer
        public final void writeFixed64(int i12, long j12) {
            k(13);
            n(j12);
            s(i12, 1);
        }

        @Override // com.google.protobuf.Writer
        public final void writeInt32(int i12, int i13) {
            k(15);
            o(i13);
            s(i12, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeMessage(int i12, Object obj) {
            int iJ2 = j();
            N0.f362717c.b(obj).b(obj, this);
            int iJ3 = j() - iJ2;
            k(10);
            t(iJ3);
            s(i12, 2);
        }

        @Override // com.google.protobuf.Writer
        public final void writeSInt32(int i12, int i13) {
            k(10);
            q(i13);
            s(i12, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeSInt64(int i12, long j12) {
            k(15);
            r(j12);
            s(i12, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeStartGroup(int i12) {
            s(i12, 3);
        }

        @Override // com.google.protobuf.Writer
        public final void writeString(int i12, String str) {
            int i13;
            int i14;
            int i15;
            char cCharAt;
            int iJ2 = j();
            k(str.length());
            int length = str.length() - 1;
            this.f362906k -= length;
            while (length >= 0 && (cCharAt = str.charAt(length)) < 128) {
                this.f362901f[this.f362906k + length] = (byte) cCharAt;
                length--;
            }
            if (length == -1) {
                this.f362906k--;
            } else {
                this.f362906k += length;
                while (length >= 0) {
                    char cCharAt2 = str.charAt(length);
                    if (cCharAt2 < 128 && (i15 = this.f362906k) > this.f362904i) {
                        byte[] bArr = this.f362901f;
                        this.f362906k = i15 - 1;
                        bArr[i15] = (byte) cCharAt2;
                    } else if (cCharAt2 < 2048 && (i14 = this.f362906k) > this.f362902g) {
                        byte[] bArr2 = this.f362901f;
                        int i16 = i14 - 1;
                        this.f362906k = i16;
                        bArr2[i14] = (byte) ((cCharAt2 & '?') | 128);
                        this.f362906k = i14 - 2;
                        bArr2[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                    } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i13 = this.f362906k) > this.f362902g + 1) {
                        byte[] bArr3 = this.f362901f;
                        int i17 = i13 - 1;
                        this.f362906k = i17;
                        bArr3[i13] = (byte) ((cCharAt2 & '?') | 128);
                        int i18 = i13 - 2;
                        this.f362906k = i18;
                        bArr3[i17] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                        this.f362906k = i13 - 3;
                        bArr3[i18] = (byte) ((cCharAt2 >>> '\f') | 480);
                    } else {
                        if (this.f362906k > this.f362902g + 2) {
                            if (length != 0) {
                                char cCharAt3 = str.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                    length--;
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                    byte[] bArr4 = this.f362901f;
                                    int i19 = this.f362906k;
                                    int i22 = i19 - 1;
                                    this.f362906k = i22;
                                    bArr4[i19] = (byte) ((codePoint & 63) | 128);
                                    int i23 = i19 - 2;
                                    this.f362906k = i23;
                                    bArr4[i22] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    int i24 = i19 - 3;
                                    this.f362906k = i24;
                                    bArr4[i23] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    this.f362906k = i19 - 4;
                                    bArr4[i24] = (byte) ((codePoint >>> 18) | 240);
                                }
                            }
                            throw new s1.d(length - 1, length);
                        }
                        k(length);
                        length++;
                    }
                    length--;
                }
            }
            int iJ3 = j() - iJ2;
            k(10);
            t(iJ3);
            s(i12, 2);
        }

        @Override // com.google.protobuf.Writer
        public final void writeUInt32(int i12, int i13) {
            k(10);
            t(i13);
            s(i12, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeUInt64(int i12, long j12) {
            k(15);
            u(j12);
            s(i12, 0);
        }
    }

    /* compiled from: BinaryWriter.java */
    /* renamed from: com.google.protobuf.n$d */
    public static final class d extends AbstractC37689n {

        /* renamed from: e, reason: collision with root package name */
        public ByteBuffer f362907e;

        /* renamed from: f, reason: collision with root package name */
        public long f362908f;

        /* renamed from: g, reason: collision with root package name */
        public long f362909g;

        /* renamed from: h, reason: collision with root package name */
        public long f362910h;

        @Override // com.google.protobuf.Writer
        public final void a(int i12, AbstractC37700t abstractC37700t) {
            try {
                abstractC37700t.P(this);
                k(10);
                t(abstractC37700t.size());
                s(i12, 2);
            } catch (IOException e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // com.google.protobuf.Writer
        public final void c(int i12, Object obj, T0 t02) {
            s(i12, 4);
            t02.b(obj, this);
            s(i12, 3);
        }

        @Override // com.google.protobuf.Writer
        public final void e(int i12, Object obj, T0 t02) {
            int iJ2 = j();
            t02.b(obj, this);
            int iJ3 = j() - iJ2;
            k(10);
            t(iJ3);
            s(i12, 2);
        }

        @Override // com.google.protobuf.AbstractC37698s
        public final void g(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            long j12 = this.f362910h;
            long j13 = this.f362908f;
            if (((int) (j12 - j13)) + 1 < iRemaining) {
                this.f362895d += iRemaining;
                this.f362894c.addFirst(AbstractC37673f.i(byteBuffer));
                v(this.f362892a.a(this.f362893b));
            } else {
                long j14 = j12 - iRemaining;
                this.f362910h = j14;
                this.f362907e.position(((int) (j14 - j13)) + 1);
                this.f362907e.put(byteBuffer);
            }
        }

        @Override // com.google.protobuf.AbstractC37698s
        public final void h(byte[] bArr, int i12, int i13) {
            long j12 = this.f362910h;
            long j13 = this.f362908f;
            if (((int) (j12 - j13)) + 1 < i13) {
                this.f362895d += i13;
                this.f362894c.addFirst(AbstractC37673f.j(i12, i13, bArr));
                v(this.f362892a.a(this.f362893b));
            } else {
                long j14 = j12 - i13;
                this.f362910h = j14;
                this.f362907e.position(((int) (j14 - j13)) + 1);
                this.f362907e.put(bArr, i12, i13);
            }
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final int j() {
            return this.f362895d + ((int) (this.f362909g - this.f362910h));
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void k(int i12) {
            if (((int) (this.f362910h - this.f362908f)) + 1 < i12) {
                v(this.f362892a.a(Math.max(i12, this.f362893b)));
            }
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void l(boolean z12) {
            byte b12 = z12 ? (byte) 1 : (byte) 0;
            long j12 = this.f362910h;
            this.f362910h = j12 - 1;
            r1.p(j12, b12);
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void m(int i12) {
            long j12 = this.f362910h;
            this.f362910h = j12 - 1;
            r1.p(j12, (byte) ((i12 >> 24) & 255));
            long j13 = this.f362910h;
            this.f362910h = j13 - 1;
            r1.p(j13, (byte) ((i12 >> 16) & 255));
            long j14 = this.f362910h;
            this.f362910h = j14 - 1;
            r1.p(j14, (byte) ((i12 >> 8) & 255));
            long j15 = this.f362910h;
            this.f362910h = j15 - 1;
            r1.p(j15, (byte) (i12 & 255));
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void n(long j12) {
            long j13 = this.f362910h;
            this.f362910h = j13 - 1;
            r1.p(j13, (byte) (((int) (j12 >> 56)) & 255));
            long j14 = this.f362910h;
            this.f362910h = j14 - 1;
            r1.p(j14, (byte) (((int) (j12 >> 48)) & 255));
            long j15 = this.f362910h;
            this.f362910h = j15 - 1;
            r1.p(j15, (byte) (((int) (j12 >> 40)) & 255));
            long j16 = this.f362910h;
            this.f362910h = j16 - 1;
            r1.p(j16, (byte) (((int) (j12 >> 32)) & 255));
            long j17 = this.f362910h;
            this.f362910h = j17 - 1;
            r1.p(j17, (byte) (((int) (j12 >> 24)) & 255));
            long j18 = this.f362910h;
            this.f362910h = j18 - 1;
            r1.p(j18, (byte) (((int) (j12 >> 16)) & 255));
            long j19 = this.f362910h;
            this.f362910h = j19 - 1;
            r1.p(j19, (byte) (((int) (j12 >> 8)) & 255));
            long j22 = this.f362910h;
            this.f362910h = j22 - 1;
            r1.p(j22, (byte) (((int) j12) & 255));
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void o(int i12) {
            if (i12 >= 0) {
                t(i12);
            } else {
                u(i12);
            }
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void q(int i12) {
            t(CodedOutputStream.G(i12));
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void r(long j12) {
            u(CodedOutputStream.H(j12));
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void s(int i12, int i13) {
            t((i12 << 3) | i13);
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void t(int i12) {
            if ((i12 & (-128)) == 0) {
                long j12 = this.f362910h;
                this.f362910h = j12 - 1;
                r1.p(j12, (byte) i12);
                return;
            }
            if ((i12 & (-16384)) == 0) {
                long j13 = this.f362910h;
                this.f362910h = j13 - 1;
                r1.p(j13, (byte) (i12 >>> 7));
                long j14 = this.f362910h;
                this.f362910h = j14 - 1;
                r1.p(j14, (byte) ((i12 & 127) | 128));
                return;
            }
            if (((-2097152) & i12) == 0) {
                long j15 = this.f362910h;
                this.f362910h = j15 - 1;
                r1.p(j15, (byte) (i12 >>> 14));
                long j16 = this.f362910h;
                this.f362910h = j16 - 1;
                r1.p(j16, (byte) (((i12 >>> 7) & 127) | 128));
                long j17 = this.f362910h;
                this.f362910h = j17 - 1;
                r1.p(j17, (byte) ((i12 & 127) | 128));
                return;
            }
            if (((-268435456) & i12) == 0) {
                long j18 = this.f362910h;
                this.f362910h = j18 - 1;
                r1.p(j18, (byte) (i12 >>> 21));
                long j19 = this.f362910h;
                this.f362910h = j19 - 1;
                r1.p(j19, (byte) (((i12 >>> 14) & 127) | 128));
                long j22 = this.f362910h;
                this.f362910h = j22 - 1;
                r1.p(j22, (byte) (((i12 >>> 7) & 127) | 128));
                long j23 = this.f362910h;
                this.f362910h = j23 - 1;
                r1.p(j23, (byte) ((i12 & 127) | 128));
                return;
            }
            long j24 = this.f362910h;
            this.f362910h = j24 - 1;
            r1.p(j24, (byte) (i12 >>> 28));
            long j25 = this.f362910h;
            this.f362910h = j25 - 1;
            r1.p(j25, (byte) (((i12 >>> 21) & 127) | 128));
            long j26 = this.f362910h;
            this.f362910h = j26 - 1;
            r1.p(j26, (byte) (((i12 >>> 14) & 127) | 128));
            long j27 = this.f362910h;
            this.f362910h = j27 - 1;
            r1.p(j27, (byte) (((i12 >>> 7) & 127) | 128));
            long j28 = this.f362910h;
            this.f362910h = j28 - 1;
            r1.p(j28, (byte) ((i12 & 127) | 128));
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void u(long j12) {
            switch (AbstractC37689n.i(j12)) {
                case 1:
                    long j13 = this.f362910h;
                    this.f362910h = j13 - 1;
                    r1.p(j13, (byte) j12);
                    break;
                case 2:
                    long j14 = this.f362910h;
                    this.f362910h = j14 - 1;
                    r1.p(j14, (byte) (j12 >>> 7));
                    long j15 = this.f362910h;
                    this.f362910h = j15 - 1;
                    r1.p(j15, (byte) ((((int) j12) & 127) | 128));
                    break;
                case 3:
                    long j16 = this.f362910h;
                    this.f362910h = j16 - 1;
                    r1.p(j16, (byte) (((int) j12) >>> 14));
                    long j17 = this.f362910h;
                    this.f362910h = j17 - 1;
                    r1.p(j17, (byte) (((j12 >>> 7) & 127) | 128));
                    long j18 = this.f362910h;
                    this.f362910h = j18 - 1;
                    r1.p(j18, (byte) ((j12 & 127) | 128));
                    break;
                case 4:
                    long j19 = this.f362910h;
                    this.f362910h = j19 - 1;
                    r1.p(j19, (byte) (j12 >>> 21));
                    long j22 = this.f362910h;
                    this.f362910h = j22 - 1;
                    r1.p(j22, (byte) (((j12 >>> 14) & 127) | 128));
                    long j23 = this.f362910h;
                    this.f362910h = j23 - 1;
                    r1.p(j23, (byte) (((j12 >>> 7) & 127) | 128));
                    long j24 = this.f362910h;
                    this.f362910h = j24 - 1;
                    r1.p(j24, (byte) ((j12 & 127) | 128));
                    break;
                case 5:
                    long j25 = this.f362910h;
                    this.f362910h = j25 - 1;
                    r1.p(j25, (byte) (j12 >>> 28));
                    long j26 = this.f362910h;
                    this.f362910h = j26 - 1;
                    r1.p(j26, (byte) (((j12 >>> 21) & 127) | 128));
                    long j27 = this.f362910h;
                    this.f362910h = j27 - 1;
                    r1.p(j27, (byte) (((j12 >>> 14) & 127) | 128));
                    long j28 = this.f362910h;
                    this.f362910h = j28 - 1;
                    r1.p(j28, (byte) (((j12 >>> 7) & 127) | 128));
                    long j29 = this.f362910h;
                    this.f362910h = j29 - 1;
                    r1.p(j29, (byte) ((j12 & 127) | 128));
                    break;
                case 6:
                    long j32 = this.f362910h;
                    this.f362910h = j32 - 1;
                    r1.p(j32, (byte) (j12 >>> 35));
                    long j33 = this.f362910h;
                    this.f362910h = j33 - 1;
                    r1.p(j33, (byte) (((j12 >>> 28) & 127) | 128));
                    long j34 = this.f362910h;
                    this.f362910h = j34 - 1;
                    r1.p(j34, (byte) (((j12 >>> 21) & 127) | 128));
                    long j35 = this.f362910h;
                    this.f362910h = j35 - 1;
                    r1.p(j35, (byte) (((j12 >>> 14) & 127) | 128));
                    long j36 = this.f362910h;
                    this.f362910h = j36 - 1;
                    r1.p(j36, (byte) (((j12 >>> 7) & 127) | 128));
                    long j37 = this.f362910h;
                    this.f362910h = j37 - 1;
                    r1.p(j37, (byte) ((j12 & 127) | 128));
                    break;
                case 7:
                    long j38 = this.f362910h;
                    this.f362910h = j38 - 1;
                    r1.p(j38, (byte) (j12 >>> 42));
                    long j39 = this.f362910h;
                    this.f362910h = j39 - 1;
                    r1.p(j39, (byte) (((j12 >>> 35) & 127) | 128));
                    long j42 = this.f362910h;
                    this.f362910h = j42 - 1;
                    r1.p(j42, (byte) (((j12 >>> 28) & 127) | 128));
                    long j43 = this.f362910h;
                    this.f362910h = j43 - 1;
                    r1.p(j43, (byte) (((j12 >>> 21) & 127) | 128));
                    long j44 = this.f362910h;
                    this.f362910h = j44 - 1;
                    r1.p(j44, (byte) (((j12 >>> 14) & 127) | 128));
                    long j45 = this.f362910h;
                    this.f362910h = j45 - 1;
                    r1.p(j45, (byte) (((j12 >>> 7) & 127) | 128));
                    long j46 = this.f362910h;
                    this.f362910h = j46 - 1;
                    r1.p(j46, (byte) ((j12 & 127) | 128));
                    break;
                case 8:
                    long j47 = this.f362910h;
                    this.f362910h = j47 - 1;
                    r1.p(j47, (byte) (j12 >>> 49));
                    long j48 = this.f362910h;
                    this.f362910h = j48 - 1;
                    r1.p(j48, (byte) (((j12 >>> 42) & 127) | 128));
                    long j49 = this.f362910h;
                    this.f362910h = j49 - 1;
                    r1.p(j49, (byte) (((j12 >>> 35) & 127) | 128));
                    long j52 = this.f362910h;
                    this.f362910h = j52 - 1;
                    r1.p(j52, (byte) (((j12 >>> 28) & 127) | 128));
                    long j53 = this.f362910h;
                    this.f362910h = j53 - 1;
                    r1.p(j53, (byte) (((j12 >>> 21) & 127) | 128));
                    long j54 = this.f362910h;
                    this.f362910h = j54 - 1;
                    r1.p(j54, (byte) (((j12 >>> 14) & 127) | 128));
                    long j55 = this.f362910h;
                    this.f362910h = j55 - 1;
                    r1.p(j55, (byte) (((j12 >>> 7) & 127) | 128));
                    long j56 = this.f362910h;
                    this.f362910h = j56 - 1;
                    r1.p(j56, (byte) ((j12 & 127) | 128));
                    break;
                case 9:
                    long j57 = this.f362910h;
                    this.f362910h = j57 - 1;
                    r1.p(j57, (byte) (j12 >>> 56));
                    long j58 = this.f362910h;
                    this.f362910h = j58 - 1;
                    r1.p(j58, (byte) (((j12 >>> 49) & 127) | 128));
                    long j59 = this.f362910h;
                    this.f362910h = j59 - 1;
                    r1.p(j59, (byte) (((j12 >>> 42) & 127) | 128));
                    long j62 = this.f362910h;
                    this.f362910h = j62 - 1;
                    r1.p(j62, (byte) (((j12 >>> 35) & 127) | 128));
                    long j63 = this.f362910h;
                    this.f362910h = j63 - 1;
                    r1.p(j63, (byte) (((j12 >>> 28) & 127) | 128));
                    long j64 = this.f362910h;
                    this.f362910h = j64 - 1;
                    r1.p(j64, (byte) (((j12 >>> 21) & 127) | 128));
                    long j65 = this.f362910h;
                    this.f362910h = j65 - 1;
                    r1.p(j65, (byte) (((j12 >>> 14) & 127) | 128));
                    long j66 = this.f362910h;
                    this.f362910h = j66 - 1;
                    r1.p(j66, (byte) (((j12 >>> 7) & 127) | 128));
                    long j67 = this.f362910h;
                    this.f362910h = j67 - 1;
                    r1.p(j67, (byte) ((j12 & 127) | 128));
                    break;
                case 10:
                    long j68 = this.f362910h;
                    this.f362910h = j68 - 1;
                    r1.p(j68, (byte) (j12 >>> 63));
                    long j69 = this.f362910h;
                    this.f362910h = j69 - 1;
                    r1.p(j69, (byte) (((j12 >>> 56) & 127) | 128));
                    long j72 = this.f362910h;
                    this.f362910h = j72 - 1;
                    r1.p(j72, (byte) (((j12 >>> 49) & 127) | 128));
                    long j73 = this.f362910h;
                    this.f362910h = j73 - 1;
                    r1.p(j73, (byte) (((j12 >>> 42) & 127) | 128));
                    long j74 = this.f362910h;
                    this.f362910h = j74 - 1;
                    r1.p(j74, (byte) (((j12 >>> 35) & 127) | 128));
                    long j75 = this.f362910h;
                    this.f362910h = j75 - 1;
                    r1.p(j75, (byte) (((j12 >>> 28) & 127) | 128));
                    long j76 = this.f362910h;
                    this.f362910h = j76 - 1;
                    r1.p(j76, (byte) (((j12 >>> 21) & 127) | 128));
                    long j77 = this.f362910h;
                    this.f362910h = j77 - 1;
                    r1.p(j77, (byte) (((j12 >>> 14) & 127) | 128));
                    long j78 = this.f362910h;
                    this.f362910h = j78 - 1;
                    r1.p(j78, (byte) (((j12 >>> 7) & 127) | 128));
                    long j79 = this.f362910h;
                    this.f362910h = j79 - 1;
                    r1.p(j79, (byte) ((j12 & 127) | 128));
                    break;
            }
        }

        public final void v(AbstractC37673f abstractC37673f) {
            if (!abstractC37673f.d()) {
                throw new RuntimeException("Allocated buffer does not have NIO buffer");
            }
            ByteBuffer byteBufferF = abstractC37673f.f();
            if (!byteBufferF.isDirect()) {
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            ByteBuffer byteBuffer = this.f362907e;
            if (byteBuffer != null) {
                int i12 = this.f362895d;
                long j12 = this.f362909g;
                long j13 = this.f362910h;
                this.f362895d = i12 + ((int) (j12 - j13));
                byteBuffer.position(((int) (j13 - this.f362908f)) + 1);
                this.f362907e = null;
                this.f362910h = 0L;
                this.f362909g = 0L;
            }
            this.f362894c.addFirst(abstractC37673f);
            this.f362907e = byteBufferF;
            byteBufferF.limit(byteBufferF.capacity());
            this.f362907e.position(0);
            long jB2 = r1.b(this.f362907e);
            this.f362908f = jB2;
            long jLimit = jB2 + (this.f362907e.limit() - 1);
            this.f362909g = jLimit;
            this.f362910h = jLimit;
        }

        @Override // com.google.protobuf.Writer
        public final void writeBool(int i12, boolean z12) {
            k(6);
            byte b12 = z12 ? (byte) 1 : (byte) 0;
            long j12 = this.f362910h;
            this.f362910h = j12 - 1;
            r1.p(j12, b12);
            s(i12, 0);
        }

        @Override // com.google.protobuf.Writer
        @Deprecated
        public final void writeEndGroup(int i12) {
            s(i12, 4);
        }

        @Override // com.google.protobuf.Writer
        public final void writeFixed32(int i12, int i13) {
            k(9);
            m(i13);
            s(i12, 5);
        }

        @Override // com.google.protobuf.Writer
        public final void writeFixed64(int i12, long j12) {
            k(13);
            n(j12);
            s(i12, 1);
        }

        @Override // com.google.protobuf.Writer
        public final void writeInt32(int i12, int i13) {
            k(15);
            o(i13);
            s(i12, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeMessage(int i12, Object obj) {
            int iJ2 = j();
            N0.f362717c.b(obj).b(obj, this);
            int iJ3 = j() - iJ2;
            k(10);
            t(iJ3);
            s(i12, 2);
        }

        @Override // com.google.protobuf.Writer
        public final void writeSInt32(int i12, int i13) {
            k(10);
            q(i13);
            s(i12, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeSInt64(int i12, long j12) {
            k(15);
            r(j12);
            s(i12, 0);
        }

        @Override // com.google.protobuf.Writer
        @Deprecated
        public final void writeStartGroup(int i12) {
            s(i12, 3);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
        @Override // com.google.protobuf.Writer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void writeString(int r14, java.lang.String r15) {
            /*
                Method dump skipped, instructions count: 295
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC37689n.d.writeString(int, java.lang.String):void");
        }

        @Override // com.google.protobuf.Writer
        public final void writeUInt32(int i12, int i13) {
            k(10);
            t(i13);
            s(i12, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeUInt64(int i12, long j12) {
            k(15);
            u(j12);
            s(i12, 0);
        }
    }

    /* compiled from: BinaryWriter.java */
    /* renamed from: com.google.protobuf.n$e */
    public static final class e extends AbstractC37689n {

        /* renamed from: e, reason: collision with root package name */
        public AbstractC37673f f362911e;

        /* renamed from: f, reason: collision with root package name */
        public byte[] f362912f;

        /* renamed from: g, reason: collision with root package name */
        public long f362913g;

        /* renamed from: h, reason: collision with root package name */
        public long f362914h;

        /* renamed from: i, reason: collision with root package name */
        public long f362915i;

        /* renamed from: j, reason: collision with root package name */
        public long f362916j;

        /* renamed from: k, reason: collision with root package name */
        public long f362917k;

        @Override // com.google.protobuf.Writer
        public final void a(int i12, AbstractC37700t abstractC37700t) {
            try {
                abstractC37700t.P(this);
                k(10);
                t(abstractC37700t.size());
                s(i12, 2);
            } catch (IOException e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // com.google.protobuf.Writer
        public final void c(int i12, Object obj, T0 t02) {
            s(i12, 4);
            t02.b(obj, this);
            s(i12, 3);
        }

        @Override // com.google.protobuf.Writer
        public final void e(int i12, Object obj, T0 t02) {
            int iJ2 = j();
            t02.b(obj, this);
            int iJ3 = j() - iJ2;
            k(10);
            t(iJ3);
            s(i12, 2);
        }

        @Override // com.google.protobuf.AbstractC37698s
        public final void g(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (((int) (this.f362917k - this.f362915i)) < iRemaining) {
                this.f362895d += iRemaining;
                this.f362894c.addFirst(AbstractC37673f.i(byteBuffer));
                v(this.f362892a.b(this.f362893b));
            }
            long j12 = this.f362917k - iRemaining;
            this.f362917k = j12;
            byteBuffer.get(this.f362912f, ((int) j12) + 1, iRemaining);
        }

        @Override // com.google.protobuf.AbstractC37698s
        public final void h(byte[] bArr, int i12, int i13) {
            if (i12 < 0 || i12 + i13 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i12), Integer.valueOf(i13)));
            }
            long j12 = this.f362917k;
            if (((int) (j12 - this.f362915i)) < i13) {
                this.f362895d += i13;
                this.f362894c.addFirst(AbstractC37673f.j(i12, i13, bArr));
                v(this.f362892a.b(this.f362893b));
            } else {
                long j13 = j12 - i13;
                this.f362917k = j13;
                System.arraycopy(bArr, i12, this.f362912f, ((int) j13) + 1, i13);
            }
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final int j() {
            return this.f362895d + ((int) (this.f362916j - this.f362917k));
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void k(int i12) {
            if (((int) (this.f362917k - this.f362915i)) < i12) {
                v(this.f362892a.b(Math.max(i12, this.f362893b)));
            }
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void l(boolean z12) {
            byte b12 = z12 ? (byte) 1 : (byte) 0;
            byte[] bArr = this.f362912f;
            long j12 = this.f362917k;
            this.f362917k = j12 - 1;
            r1.q(bArr, j12, b12);
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void m(int i12) {
            byte[] bArr = this.f362912f;
            long j12 = this.f362917k;
            this.f362917k = j12 - 1;
            r1.q(bArr, j12, (byte) ((i12 >> 24) & 255));
            byte[] bArr2 = this.f362912f;
            long j13 = this.f362917k;
            this.f362917k = j13 - 1;
            r1.q(bArr2, j13, (byte) ((i12 >> 16) & 255));
            byte[] bArr3 = this.f362912f;
            long j14 = this.f362917k;
            this.f362917k = j14 - 1;
            r1.q(bArr3, j14, (byte) ((i12 >> 8) & 255));
            byte[] bArr4 = this.f362912f;
            long j15 = this.f362917k;
            this.f362917k = j15 - 1;
            r1.q(bArr4, j15, (byte) (i12 & 255));
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void n(long j12) {
            byte[] bArr = this.f362912f;
            long j13 = this.f362917k;
            this.f362917k = j13 - 1;
            r1.q(bArr, j13, (byte) (((int) (j12 >> 56)) & 255));
            byte[] bArr2 = this.f362912f;
            long j14 = this.f362917k;
            this.f362917k = j14 - 1;
            r1.q(bArr2, j14, (byte) (((int) (j12 >> 48)) & 255));
            byte[] bArr3 = this.f362912f;
            long j15 = this.f362917k;
            this.f362917k = j15 - 1;
            r1.q(bArr3, j15, (byte) (((int) (j12 >> 40)) & 255));
            byte[] bArr4 = this.f362912f;
            long j16 = this.f362917k;
            this.f362917k = j16 - 1;
            r1.q(bArr4, j16, (byte) (((int) (j12 >> 32)) & 255));
            byte[] bArr5 = this.f362912f;
            long j17 = this.f362917k;
            this.f362917k = j17 - 1;
            r1.q(bArr5, j17, (byte) (((int) (j12 >> 24)) & 255));
            byte[] bArr6 = this.f362912f;
            long j18 = this.f362917k;
            this.f362917k = j18 - 1;
            r1.q(bArr6, j18, (byte) (((int) (j12 >> 16)) & 255));
            byte[] bArr7 = this.f362912f;
            long j19 = this.f362917k;
            this.f362917k = j19 - 1;
            r1.q(bArr7, j19, (byte) (((int) (j12 >> 8)) & 255));
            byte[] bArr8 = this.f362912f;
            long j22 = this.f362917k;
            this.f362917k = j22 - 1;
            r1.q(bArr8, j22, (byte) (((int) j12) & 255));
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void o(int i12) {
            if (i12 >= 0) {
                t(i12);
            } else {
                u(i12);
            }
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void q(int i12) {
            t(CodedOutputStream.G(i12));
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void r(long j12) {
            u(CodedOutputStream.H(j12));
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void s(int i12, int i13) {
            t((i12 << 3) | i13);
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void t(int i12) {
            if ((i12 & (-128)) == 0) {
                byte[] bArr = this.f362912f;
                long j12 = this.f362917k;
                this.f362917k = j12 - 1;
                r1.q(bArr, j12, (byte) i12);
                return;
            }
            if ((i12 & (-16384)) == 0) {
                byte[] bArr2 = this.f362912f;
                long j13 = this.f362917k;
                this.f362917k = j13 - 1;
                r1.q(bArr2, j13, (byte) (i12 >>> 7));
                byte[] bArr3 = this.f362912f;
                long j14 = this.f362917k;
                this.f362917k = j14 - 1;
                r1.q(bArr3, j14, (byte) ((i12 & 127) | 128));
                return;
            }
            if (((-2097152) & i12) == 0) {
                byte[] bArr4 = this.f362912f;
                long j15 = this.f362917k;
                this.f362917k = j15 - 1;
                r1.q(bArr4, j15, (byte) (i12 >>> 14));
                byte[] bArr5 = this.f362912f;
                long j16 = this.f362917k;
                this.f362917k = j16 - 1;
                r1.q(bArr5, j16, (byte) (((i12 >>> 7) & 127) | 128));
                byte[] bArr6 = this.f362912f;
                long j17 = this.f362917k;
                this.f362917k = j17 - 1;
                r1.q(bArr6, j17, (byte) ((i12 & 127) | 128));
                return;
            }
            if (((-268435456) & i12) == 0) {
                byte[] bArr7 = this.f362912f;
                long j18 = this.f362917k;
                this.f362917k = j18 - 1;
                r1.q(bArr7, j18, (byte) (i12 >>> 21));
                byte[] bArr8 = this.f362912f;
                long j19 = this.f362917k;
                this.f362917k = j19 - 1;
                r1.q(bArr8, j19, (byte) (((i12 >>> 14) & 127) | 128));
                byte[] bArr9 = this.f362912f;
                long j22 = this.f362917k;
                this.f362917k = j22 - 1;
                r1.q(bArr9, j22, (byte) (((i12 >>> 7) & 127) | 128));
                byte[] bArr10 = this.f362912f;
                long j23 = this.f362917k;
                this.f362917k = j23 - 1;
                r1.q(bArr10, j23, (byte) ((i12 & 127) | 128));
                return;
            }
            byte[] bArr11 = this.f362912f;
            long j24 = this.f362917k;
            this.f362917k = j24 - 1;
            r1.q(bArr11, j24, (byte) (i12 >>> 28));
            byte[] bArr12 = this.f362912f;
            long j25 = this.f362917k;
            this.f362917k = j25 - 1;
            r1.q(bArr12, j25, (byte) (((i12 >>> 21) & 127) | 128));
            byte[] bArr13 = this.f362912f;
            long j26 = this.f362917k;
            this.f362917k = j26 - 1;
            r1.q(bArr13, j26, (byte) (((i12 >>> 14) & 127) | 128));
            byte[] bArr14 = this.f362912f;
            long j27 = this.f362917k;
            this.f362917k = j27 - 1;
            r1.q(bArr14, j27, (byte) (((i12 >>> 7) & 127) | 128));
            byte[] bArr15 = this.f362912f;
            long j28 = this.f362917k;
            this.f362917k = j28 - 1;
            r1.q(bArr15, j28, (byte) ((i12 & 127) | 128));
        }

        @Override // com.google.protobuf.AbstractC37689n
        public final void u(long j12) {
            switch (AbstractC37689n.i(j12)) {
                case 1:
                    byte[] bArr = this.f362912f;
                    long j13 = this.f362917k;
                    this.f362917k = j13 - 1;
                    r1.q(bArr, j13, (byte) j12);
                    break;
                case 2:
                    byte[] bArr2 = this.f362912f;
                    long j14 = this.f362917k;
                    this.f362917k = j14 - 1;
                    r1.q(bArr2, j14, (byte) (j12 >>> 7));
                    byte[] bArr3 = this.f362912f;
                    long j15 = this.f362917k;
                    this.f362917k = j15 - 1;
                    r1.q(bArr3, j15, (byte) ((((int) j12) & 127) | 128));
                    break;
                case 3:
                    byte[] bArr4 = this.f362912f;
                    long j16 = this.f362917k;
                    this.f362917k = j16 - 1;
                    r1.q(bArr4, j16, (byte) (((int) j12) >>> 14));
                    byte[] bArr5 = this.f362912f;
                    long j17 = this.f362917k;
                    this.f362917k = j17 - 1;
                    r1.q(bArr5, j17, (byte) (((j12 >>> 7) & 127) | 128));
                    byte[] bArr6 = this.f362912f;
                    long j18 = this.f362917k;
                    this.f362917k = j18 - 1;
                    r1.q(bArr6, j18, (byte) ((j12 & 127) | 128));
                    break;
                case 4:
                    byte[] bArr7 = this.f362912f;
                    long j19 = this.f362917k;
                    this.f362917k = j19 - 1;
                    r1.q(bArr7, j19, (byte) (j12 >>> 21));
                    byte[] bArr8 = this.f362912f;
                    long j22 = this.f362917k;
                    this.f362917k = j22 - 1;
                    r1.q(bArr8, j22, (byte) (((j12 >>> 14) & 127) | 128));
                    byte[] bArr9 = this.f362912f;
                    long j23 = this.f362917k;
                    this.f362917k = j23 - 1;
                    r1.q(bArr9, j23, (byte) (((j12 >>> 7) & 127) | 128));
                    byte[] bArr10 = this.f362912f;
                    long j24 = this.f362917k;
                    this.f362917k = j24 - 1;
                    r1.q(bArr10, j24, (byte) ((j12 & 127) | 128));
                    break;
                case 5:
                    byte[] bArr11 = this.f362912f;
                    long j25 = this.f362917k;
                    this.f362917k = j25 - 1;
                    r1.q(bArr11, j25, (byte) (j12 >>> 28));
                    byte[] bArr12 = this.f362912f;
                    long j26 = this.f362917k;
                    this.f362917k = j26 - 1;
                    r1.q(bArr12, j26, (byte) (((j12 >>> 21) & 127) | 128));
                    byte[] bArr13 = this.f362912f;
                    long j27 = this.f362917k;
                    this.f362917k = j27 - 1;
                    r1.q(bArr13, j27, (byte) (((j12 >>> 14) & 127) | 128));
                    byte[] bArr14 = this.f362912f;
                    long j28 = this.f362917k;
                    this.f362917k = j28 - 1;
                    r1.q(bArr14, j28, (byte) (((j12 >>> 7) & 127) | 128));
                    byte[] bArr15 = this.f362912f;
                    long j29 = this.f362917k;
                    this.f362917k = j29 - 1;
                    r1.q(bArr15, j29, (byte) ((j12 & 127) | 128));
                    break;
                case 6:
                    byte[] bArr16 = this.f362912f;
                    long j32 = this.f362917k;
                    this.f362917k = j32 - 1;
                    r1.q(bArr16, j32, (byte) (j12 >>> 35));
                    byte[] bArr17 = this.f362912f;
                    long j33 = this.f362917k;
                    this.f362917k = j33 - 1;
                    r1.q(bArr17, j33, (byte) (((j12 >>> 28) & 127) | 128));
                    byte[] bArr18 = this.f362912f;
                    long j34 = this.f362917k;
                    this.f362917k = j34 - 1;
                    r1.q(bArr18, j34, (byte) (((j12 >>> 21) & 127) | 128));
                    byte[] bArr19 = this.f362912f;
                    long j35 = this.f362917k;
                    this.f362917k = j35 - 1;
                    r1.q(bArr19, j35, (byte) (((j12 >>> 14) & 127) | 128));
                    byte[] bArr20 = this.f362912f;
                    long j36 = this.f362917k;
                    this.f362917k = j36 - 1;
                    r1.q(bArr20, j36, (byte) (((j12 >>> 7) & 127) | 128));
                    byte[] bArr21 = this.f362912f;
                    long j37 = this.f362917k;
                    this.f362917k = j37 - 1;
                    r1.q(bArr21, j37, (byte) ((j12 & 127) | 128));
                    break;
                case 7:
                    byte[] bArr22 = this.f362912f;
                    long j38 = this.f362917k;
                    this.f362917k = j38 - 1;
                    r1.q(bArr22, j38, (byte) (j12 >>> 42));
                    byte[] bArr23 = this.f362912f;
                    long j39 = this.f362917k;
                    this.f362917k = j39 - 1;
                    r1.q(bArr23, j39, (byte) (((j12 >>> 35) & 127) | 128));
                    byte[] bArr24 = this.f362912f;
                    long j42 = this.f362917k;
                    this.f362917k = j42 - 1;
                    r1.q(bArr24, j42, (byte) (((j12 >>> 28) & 127) | 128));
                    byte[] bArr25 = this.f362912f;
                    long j43 = this.f362917k;
                    this.f362917k = j43 - 1;
                    r1.q(bArr25, j43, (byte) (((j12 >>> 21) & 127) | 128));
                    byte[] bArr26 = this.f362912f;
                    long j44 = this.f362917k;
                    this.f362917k = j44 - 1;
                    r1.q(bArr26, j44, (byte) (((j12 >>> 14) & 127) | 128));
                    byte[] bArr27 = this.f362912f;
                    long j45 = this.f362917k;
                    this.f362917k = j45 - 1;
                    r1.q(bArr27, j45, (byte) (((j12 >>> 7) & 127) | 128));
                    byte[] bArr28 = this.f362912f;
                    long j46 = this.f362917k;
                    this.f362917k = j46 - 1;
                    r1.q(bArr28, j46, (byte) ((j12 & 127) | 128));
                    break;
                case 8:
                    byte[] bArr29 = this.f362912f;
                    long j47 = this.f362917k;
                    this.f362917k = j47 - 1;
                    r1.q(bArr29, j47, (byte) (j12 >>> 49));
                    byte[] bArr30 = this.f362912f;
                    long j48 = this.f362917k;
                    this.f362917k = j48 - 1;
                    r1.q(bArr30, j48, (byte) (((j12 >>> 42) & 127) | 128));
                    byte[] bArr31 = this.f362912f;
                    long j49 = this.f362917k;
                    this.f362917k = j49 - 1;
                    r1.q(bArr31, j49, (byte) (((j12 >>> 35) & 127) | 128));
                    byte[] bArr32 = this.f362912f;
                    long j52 = this.f362917k;
                    this.f362917k = j52 - 1;
                    r1.q(bArr32, j52, (byte) (((j12 >>> 28) & 127) | 128));
                    byte[] bArr33 = this.f362912f;
                    long j53 = this.f362917k;
                    this.f362917k = j53 - 1;
                    r1.q(bArr33, j53, (byte) (((j12 >>> 21) & 127) | 128));
                    byte[] bArr34 = this.f362912f;
                    long j54 = this.f362917k;
                    this.f362917k = j54 - 1;
                    r1.q(bArr34, j54, (byte) (((j12 >>> 14) & 127) | 128));
                    byte[] bArr35 = this.f362912f;
                    long j55 = this.f362917k;
                    this.f362917k = j55 - 1;
                    r1.q(bArr35, j55, (byte) (((j12 >>> 7) & 127) | 128));
                    byte[] bArr36 = this.f362912f;
                    long j56 = this.f362917k;
                    this.f362917k = j56 - 1;
                    r1.q(bArr36, j56, (byte) ((j12 & 127) | 128));
                    break;
                case 9:
                    byte[] bArr37 = this.f362912f;
                    long j57 = this.f362917k;
                    this.f362917k = j57 - 1;
                    r1.q(bArr37, j57, (byte) (j12 >>> 56));
                    byte[] bArr38 = this.f362912f;
                    long j58 = this.f362917k;
                    this.f362917k = j58 - 1;
                    r1.q(bArr38, j58, (byte) (((j12 >>> 49) & 127) | 128));
                    byte[] bArr39 = this.f362912f;
                    long j59 = this.f362917k;
                    this.f362917k = j59 - 1;
                    r1.q(bArr39, j59, (byte) (((j12 >>> 42) & 127) | 128));
                    byte[] bArr40 = this.f362912f;
                    long j62 = this.f362917k;
                    this.f362917k = j62 - 1;
                    r1.q(bArr40, j62, (byte) (((j12 >>> 35) & 127) | 128));
                    byte[] bArr41 = this.f362912f;
                    long j63 = this.f362917k;
                    this.f362917k = j63 - 1;
                    r1.q(bArr41, j63, (byte) (((j12 >>> 28) & 127) | 128));
                    byte[] bArr42 = this.f362912f;
                    long j64 = this.f362917k;
                    this.f362917k = j64 - 1;
                    r1.q(bArr42, j64, (byte) (((j12 >>> 21) & 127) | 128));
                    byte[] bArr43 = this.f362912f;
                    long j65 = this.f362917k;
                    this.f362917k = j65 - 1;
                    r1.q(bArr43, j65, (byte) (((j12 >>> 14) & 127) | 128));
                    byte[] bArr44 = this.f362912f;
                    long j66 = this.f362917k;
                    this.f362917k = j66 - 1;
                    r1.q(bArr44, j66, (byte) (((j12 >>> 7) & 127) | 128));
                    byte[] bArr45 = this.f362912f;
                    long j67 = this.f362917k;
                    this.f362917k = j67 - 1;
                    r1.q(bArr45, j67, (byte) ((j12 & 127) | 128));
                    break;
                case 10:
                    byte[] bArr46 = this.f362912f;
                    long j68 = this.f362917k;
                    this.f362917k = j68 - 1;
                    r1.q(bArr46, j68, (byte) (j12 >>> 63));
                    byte[] bArr47 = this.f362912f;
                    long j69 = this.f362917k;
                    this.f362917k = j69 - 1;
                    r1.q(bArr47, j69, (byte) (((j12 >>> 56) & 127) | 128));
                    byte[] bArr48 = this.f362912f;
                    long j72 = this.f362917k;
                    this.f362917k = j72 - 1;
                    r1.q(bArr48, j72, (byte) (((j12 >>> 49) & 127) | 128));
                    byte[] bArr49 = this.f362912f;
                    long j73 = this.f362917k;
                    this.f362917k = j73 - 1;
                    r1.q(bArr49, j73, (byte) (((j12 >>> 42) & 127) | 128));
                    byte[] bArr50 = this.f362912f;
                    long j74 = this.f362917k;
                    this.f362917k = j74 - 1;
                    r1.q(bArr50, j74, (byte) (((j12 >>> 35) & 127) | 128));
                    byte[] bArr51 = this.f362912f;
                    long j75 = this.f362917k;
                    this.f362917k = j75 - 1;
                    r1.q(bArr51, j75, (byte) (((j12 >>> 28) & 127) | 128));
                    byte[] bArr52 = this.f362912f;
                    long j76 = this.f362917k;
                    this.f362917k = j76 - 1;
                    r1.q(bArr52, j76, (byte) (((j12 >>> 21) & 127) | 128));
                    byte[] bArr53 = this.f362912f;
                    long j77 = this.f362917k;
                    this.f362917k = j77 - 1;
                    r1.q(bArr53, j77, (byte) (((j12 >>> 14) & 127) | 128));
                    byte[] bArr54 = this.f362912f;
                    long j78 = this.f362917k;
                    this.f362917k = j78 - 1;
                    r1.q(bArr54, j78, (byte) (((j12 >>> 7) & 127) | 128));
                    byte[] bArr55 = this.f362912f;
                    long j79 = this.f362917k;
                    this.f362917k = j79 - 1;
                    r1.q(bArr55, j79, (byte) ((j12 & 127) | 128));
                    break;
            }
        }

        public final void v(AbstractC37673f abstractC37673f) {
            if (!abstractC37673f.c()) {
                throw new RuntimeException("Allocator returned non-heap buffer");
            }
            AbstractC37673f abstractC37673f2 = this.f362911e;
            if (abstractC37673f2 != null) {
                int i12 = this.f362895d;
                long j12 = this.f362916j;
                long j13 = this.f362917k;
                this.f362895d = i12 + ((int) (j12 - j13));
                abstractC37673f2.h((((int) j13) - abstractC37673f2.b()) + 1);
                this.f362911e = null;
                this.f362917k = 0L;
                this.f362916j = 0L;
            }
            this.f362894c.addFirst(abstractC37673f);
            this.f362911e = abstractC37673f;
            this.f362912f = abstractC37673f.a();
            long jB2 = abstractC37673f.b();
            this.f362914h = abstractC37673f.e() + jB2;
            long jG2 = jB2 + abstractC37673f.g();
            this.f362913g = jG2;
            this.f362915i = jG2 - 1;
            long j14 = this.f362914h - 1;
            this.f362916j = j14;
            this.f362917k = j14;
        }

        @Override // com.google.protobuf.Writer
        public final void writeBool(int i12, boolean z12) {
            k(6);
            byte b12 = z12 ? (byte) 1 : (byte) 0;
            byte[] bArr = this.f362912f;
            long j12 = this.f362917k;
            this.f362917k = j12 - 1;
            r1.q(bArr, j12, b12);
            s(i12, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeEndGroup(int i12) {
            s(i12, 4);
        }

        @Override // com.google.protobuf.Writer
        public final void writeFixed32(int i12, int i13) {
            k(9);
            m(i13);
            s(i12, 5);
        }

        @Override // com.google.protobuf.Writer
        public final void writeFixed64(int i12, long j12) {
            k(13);
            n(j12);
            s(i12, 1);
        }

        @Override // com.google.protobuf.Writer
        public final void writeInt32(int i12, int i13) {
            k(15);
            o(i13);
            s(i12, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeMessage(int i12, Object obj) {
            int iJ2 = j();
            N0.f362717c.b(obj).b(obj, this);
            int iJ3 = j() - iJ2;
            k(10);
            t(iJ3);
            s(i12, 2);
        }

        @Override // com.google.protobuf.Writer
        public final void writeSInt32(int i12, int i13) {
            k(10);
            q(i13);
            s(i12, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeSInt64(int i12, long j12) {
            k(15);
            r(j12);
            s(i12, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeStartGroup(int i12) {
            s(i12, 3);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
        @Override // com.google.protobuf.Writer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void writeString(int r14, java.lang.String r15) {
            /*
                Method dump skipped, instructions count: 317
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.AbstractC37689n.e.writeString(int, java.lang.String):void");
        }

        @Override // com.google.protobuf.Writer
        public final void writeUInt32(int i12, int i13) {
            k(10);
            t(i13);
            s(i12, 0);
        }

        @Override // com.google.protobuf.Writer
        public final void writeUInt64(int i12, long j12) {
            k(15);
            u(j12);
            s(i12, 0);
        }
    }

    public AbstractC37689n(AbstractC37695q abstractC37695q, int i12, a aVar) {
        if (i12 <= 0) {
            throw new IllegalArgumentException("chunkSize must be > 0");
        }
        C37670d0.a(abstractC37695q, "alloc");
        this.f362892a = abstractC37695q;
        this.f362893b = i12;
    }

    public static byte i(long j12) {
        byte b12;
        if (((-128) & j12) == 0) {
            return (byte) 1;
        }
        if (j12 < 0) {
            return (byte) 10;
        }
        if (((-34359738368L) & j12) != 0) {
            b12 = (byte) 6;
            j12 >>>= 28;
        } else {
            b12 = 2;
        }
        if (((-2097152) & j12) != 0) {
            b12 = (byte) (b12 + 2);
            j12 >>>= 14;
        }
        return (j12 & (-16384)) != 0 ? (byte) (b12 + 1) : b12;
    }

    public static final void p(AbstractC37689n abstractC37689n, int i12, WireFormat.FieldType fieldType, Object obj) {
        switch (a.f362896a[fieldType.ordinal()]) {
            case 1:
                abstractC37689n.writeBool(i12, ((Boolean) obj).booleanValue());
                return;
            case 2:
                abstractC37689n.writeFixed32(i12, ((Integer) obj).intValue());
                return;
            case 3:
                abstractC37689n.writeFixed64(i12, ((Long) obj).longValue());
                return;
            case 4:
                abstractC37689n.writeInt32(i12, ((Integer) obj).intValue());
                return;
            case 5:
                abstractC37689n.writeUInt64(i12, ((Long) obj).longValue());
                return;
            case 6:
                abstractC37689n.writeFixed32(i12, ((Integer) obj).intValue());
                return;
            case 7:
                abstractC37689n.writeFixed64(i12, ((Long) obj).longValue());
                return;
            case 8:
                abstractC37689n.writeSInt32(i12, ((Integer) obj).intValue());
                return;
            case 9:
                abstractC37689n.writeSInt64(i12, ((Long) obj).longValue());
                return;
            case 10:
                abstractC37689n.writeString(i12, (String) obj);
                return;
            case 11:
                abstractC37689n.writeUInt32(i12, ((Integer) obj).intValue());
                return;
            case 12:
                abstractC37689n.writeUInt64(i12, ((Long) obj).longValue());
                return;
            case 13:
                abstractC37689n.writeFloat(i12, ((Float) obj).floatValue());
                return;
            case 14:
                abstractC37689n.writeDouble(i12, ((Double) obj).doubleValue());
                return;
            case 15:
                abstractC37689n.writeMessage(i12, obj);
                return;
            case 16:
                abstractC37689n.a(i12, (AbstractC37700t) obj);
                return;
            case 17:
                if (obj instanceof C37670d0.c) {
                    abstractC37689n.writeInt32(i12, ((C37670d0.c) obj).getNumber());
                    return;
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Unexpected type for enum in map.");
                    }
                    abstractC37689n.writeInt32(i12, ((Integer) obj).intValue());
                    return;
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void b(int i12, List<?> list, T0 t02) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e(i12, list.get(size), t02);
        }
    }

    @Override // com.google.protobuf.Writer
    @Deprecated
    public final void d(int i12, List<?> list, T0 t02) {
        for (int size = list.size() - 1; size >= 0; size--) {
            c(i12, list.get(size), t02);
        }
    }

    @Override // com.google.protobuf.Writer
    public final <K, V> void f(int i12, C37694p0.b<K, V> bVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int iJ2 = j();
            p(this, 2, bVar.f362937b, entry.getValue());
            p(this, 1, bVar.f362936a, entry.getKey());
            t(j() - iJ2);
            s(i12, 2);
        }
    }

    @Override // com.google.protobuf.Writer
    public final Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.f362825c;
    }

    public abstract int j();

    public abstract void k(int i12);

    public abstract void l(boolean z12);

    public abstract void m(int i12);

    public abstract void n(long j12);

    public abstract void o(int i12);

    public abstract void q(int i12);

    public abstract void r(long j12);

    public abstract void s(int i12, int i13);

    public abstract void t(int i12);

    public abstract void u(long j12);

    @Override // com.google.protobuf.Writer
    public final void writeBoolList(int i12, List<Boolean> list, boolean z12) {
        if (!(list instanceof C37693p)) {
            if (!z12) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    writeBool(i12, list.get(size).booleanValue());
                }
                return;
            }
            k(list.size() + 10);
            int iJ2 = j();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                l(list.get(size2).booleanValue());
            }
            t(j() - iJ2);
            s(i12, 2);
            return;
        }
        C37693p c37693p = (C37693p) list;
        if (!z12) {
            for (int i13 = c37693p.f362932d - 1; i13 >= 0; i13--) {
                c37693p.d(i13);
                writeBool(i12, c37693p.f362931c[i13]);
            }
            return;
        }
        k(c37693p.f362932d + 10);
        int iJ3 = j();
        for (int i14 = c37693p.f362932d - 1; i14 >= 0; i14--) {
            c37693p.d(i14);
            l(c37693p.f362931c[i14]);
        }
        t(j() - iJ3);
        s(i12, 2);
    }

    @Override // com.google.protobuf.Writer
    public final void writeBytesList(int i12, List<AbstractC37700t> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            a(i12, list.get(size));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeDouble(int i12, double d12) {
        writeFixed64(i12, Double.doubleToRawLongBits(d12));
    }

    @Override // com.google.protobuf.Writer
    public final void writeDoubleList(int i12, List<Double> list, boolean z12) {
        if (!(list instanceof B)) {
            if (!z12) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    writeDouble(i12, list.get(size).doubleValue());
                }
                return;
            }
            k(androidx.compose.ui.graphics.colorspace.e.f(8, 10, list));
            int iJ2 = j();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                n(Double.doubleToRawLongBits(list.get(size2).doubleValue()));
            }
            t(j() - iJ2);
            s(i12, 2);
            return;
        }
        B b12 = (B) list;
        if (!z12) {
            for (int i13 = b12.f362600d - 1; i13 >= 0; i13--) {
                b12.d(i13);
                writeDouble(i12, b12.f362599c[i13]);
            }
            return;
        }
        k((b12.f362600d * 8) + 10);
        int iJ3 = j();
        for (int i14 = b12.f362600d - 1; i14 >= 0; i14--) {
            b12.d(i14);
            n(Double.doubleToRawLongBits(b12.f362599c[i14]));
        }
        t(j() - iJ3);
        s(i12, 2);
    }

    @Override // com.google.protobuf.Writer
    public final void writeEnum(int i12, int i13) {
        writeInt32(i12, i13);
    }

    @Override // com.google.protobuf.Writer
    public final void writeEnumList(int i12, List<Integer> list, boolean z12) {
        writeInt32List(i12, list, z12);
    }

    @Override // com.google.protobuf.Writer
    public final void writeFixed32List(int i12, List<Integer> list, boolean z12) {
        if (!(list instanceof C37668c0)) {
            if (!z12) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    writeFixed32(i12, list.get(size).intValue());
                }
                return;
            }
            k(androidx.compose.ui.graphics.colorspace.e.f(4, 10, list));
            int iJ2 = j();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                m(list.get(size2).intValue());
            }
            t(j() - iJ2);
            s(i12, 2);
            return;
        }
        C37668c0 c37668c0 = (C37668c0) list;
        if (!z12) {
            for (int i13 = c37668c0.f362855d - 1; i13 >= 0; i13--) {
                writeFixed32(i12, c37668c0.getInt(i13));
            }
            return;
        }
        k((c37668c0.f362855d * 4) + 10);
        int iJ3 = j();
        for (int i14 = c37668c0.f362855d - 1; i14 >= 0; i14--) {
            m(c37668c0.getInt(i14));
        }
        t(j() - iJ3);
        s(i12, 2);
    }

    @Override // com.google.protobuf.Writer
    public final void writeFixed64List(int i12, List<Long> list, boolean z12) {
        if (!(list instanceof C37690n0)) {
            if (!z12) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    writeFixed64(i12, list.get(size).longValue());
                }
                return;
            }
            k(androidx.compose.ui.graphics.colorspace.e.f(8, 10, list));
            int iJ2 = j();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                n(list.get(size2).longValue());
            }
            t(j() - iJ2);
            s(i12, 2);
            return;
        }
        C37690n0 c37690n0 = (C37690n0) list;
        if (!z12) {
            for (int i13 = c37690n0.f362920d - 1; i13 >= 0; i13--) {
                writeFixed64(i12, c37690n0.getLong(i13));
            }
            return;
        }
        k((c37690n0.f362920d * 8) + 10);
        int iJ3 = j();
        for (int i14 = c37690n0.f362920d - 1; i14 >= 0; i14--) {
            n(c37690n0.getLong(i14));
        }
        t(j() - iJ3);
        s(i12, 2);
    }

    @Override // com.google.protobuf.Writer
    public final void writeFloat(int i12, float f12) {
        writeFixed32(i12, Float.floatToRawIntBits(f12));
    }

    @Override // com.google.protobuf.Writer
    public final void writeFloatList(int i12, List<Float> list, boolean z12) {
        if (!(list instanceof W)) {
            if (!z12) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    writeFloat(i12, list.get(size).floatValue());
                }
                return;
            }
            k(androidx.compose.ui.graphics.colorspace.e.f(4, 10, list));
            int iJ2 = j();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                m(Float.floatToRawIntBits(list.get(size2).floatValue()));
            }
            t(j() - iJ2);
            s(i12, 2);
            return;
        }
        W w12 = (W) list;
        if (!z12) {
            for (int i13 = w12.f362788d - 1; i13 >= 0; i13--) {
                w12.d(i13);
                writeFloat(i12, w12.f362787c[i13]);
            }
            return;
        }
        k((w12.f362788d * 4) + 10);
        int iJ3 = j();
        for (int i14 = w12.f362788d - 1; i14 >= 0; i14--) {
            w12.d(i14);
            m(Float.floatToRawIntBits(w12.f362787c[i14]));
        }
        t(j() - iJ3);
        s(i12, 2);
    }

    @Override // com.google.protobuf.Writer
    public final void writeInt32List(int i12, List<Integer> list, boolean z12) {
        if (!(list instanceof C37668c0)) {
            if (!z12) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    writeInt32(i12, list.get(size).intValue());
                }
                return;
            }
            k(androidx.compose.ui.graphics.colorspace.e.f(10, 10, list));
            int iJ2 = j();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                o(list.get(size2).intValue());
            }
            t(j() - iJ2);
            s(i12, 2);
            return;
        }
        C37668c0 c37668c0 = (C37668c0) list;
        if (!z12) {
            for (int i13 = c37668c0.f362855d - 1; i13 >= 0; i13--) {
                writeInt32(i12, c37668c0.getInt(i13));
            }
            return;
        }
        k((c37668c0.f362855d * 10) + 10);
        int iJ3 = j();
        for (int i14 = c37668c0.f362855d - 1; i14 >= 0; i14--) {
            o(c37668c0.getInt(i14));
        }
        t(j() - iJ3);
        s(i12, 2);
    }

    @Override // com.google.protobuf.Writer
    public final void writeInt64(int i12, long j12) {
        writeUInt64(i12, j12);
    }

    @Override // com.google.protobuf.Writer
    public final void writeInt64List(int i12, List<Long> list, boolean z12) {
        writeUInt64List(i12, list, z12);
    }

    @Override // com.google.protobuf.Writer
    public final void writeMessageSetItem(int i12, Object obj) {
        s(1, 4);
        if (obj instanceof AbstractC37700t) {
            a(3, (AbstractC37700t) obj);
        } else {
            writeMessage(3, obj);
        }
        writeUInt32(2, i12);
        s(1, 3);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed32(int i12, int i13) {
        writeFixed32(i12, i13);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed32List(int i12, List<Integer> list, boolean z12) {
        writeFixed32List(i12, list, z12);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed64(int i12, long j12) {
        writeFixed64(i12, j12);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSFixed64List(int i12, List<Long> list, boolean z12) {
        writeFixed64List(i12, list, z12);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSInt32List(int i12, List<Integer> list, boolean z12) {
        if (!(list instanceof C37668c0)) {
            if (!z12) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    writeSInt32(i12, list.get(size).intValue());
                }
                return;
            }
            k(androidx.compose.ui.graphics.colorspace.e.f(5, 10, list));
            int iJ2 = j();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                q(list.get(size2).intValue());
            }
            t(j() - iJ2);
            s(i12, 2);
            return;
        }
        C37668c0 c37668c0 = (C37668c0) list;
        if (!z12) {
            for (int i13 = c37668c0.f362855d - 1; i13 >= 0; i13--) {
                writeSInt32(i12, c37668c0.getInt(i13));
            }
            return;
        }
        k((c37668c0.f362855d * 5) + 10);
        int iJ3 = j();
        for (int i14 = c37668c0.f362855d - 1; i14 >= 0; i14--) {
            q(c37668c0.getInt(i14));
        }
        t(j() - iJ3);
        s(i12, 2);
    }

    @Override // com.google.protobuf.Writer
    public final void writeSInt64List(int i12, List<Long> list, boolean z12) {
        if (!(list instanceof C37690n0)) {
            if (!z12) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    writeSInt64(i12, list.get(size).longValue());
                }
                return;
            }
            k(androidx.compose.ui.graphics.colorspace.e.f(10, 10, list));
            int iJ2 = j();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                r(list.get(size2).longValue());
            }
            t(j() - iJ2);
            s(i12, 2);
            return;
        }
        C37690n0 c37690n0 = (C37690n0) list;
        if (!z12) {
            for (int i13 = c37690n0.f362920d - 1; i13 >= 0; i13--) {
                writeSInt64(i12, c37690n0.getLong(i13));
            }
            return;
        }
        k((c37690n0.f362920d * 10) + 10);
        int iJ3 = j();
        for (int i14 = c37690n0.f362920d - 1; i14 >= 0; i14--) {
            r(c37690n0.getLong(i14));
        }
        t(j() - iJ3);
        s(i12, 2);
    }

    @Override // com.google.protobuf.Writer
    public final void writeStringList(int i12, List<String> list) {
        if (!(list instanceof InterfaceC37684k0)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeString(i12, list.get(size));
            }
            return;
        }
        InterfaceC37684k0 interfaceC37684k0 = (InterfaceC37684k0) list;
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Object raw = interfaceC37684k0.getRaw(size2);
            if (raw instanceof String) {
                writeString(i12, (String) raw);
            } else {
                a(i12, (AbstractC37700t) raw);
            }
        }
    }

    @Override // com.google.protobuf.Writer
    public final void writeUInt32List(int i12, List<Integer> list, boolean z12) {
        if (!(list instanceof C37668c0)) {
            if (!z12) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    writeUInt32(i12, list.get(size).intValue());
                }
                return;
            }
            k(androidx.compose.ui.graphics.colorspace.e.f(5, 10, list));
            int iJ2 = j();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                t(list.get(size2).intValue());
            }
            t(j() - iJ2);
            s(i12, 2);
            return;
        }
        C37668c0 c37668c0 = (C37668c0) list;
        if (!z12) {
            for (int i13 = c37668c0.f362855d - 1; i13 >= 0; i13--) {
                writeUInt32(i12, c37668c0.getInt(i13));
            }
            return;
        }
        k((c37668c0.f362855d * 5) + 10);
        int iJ3 = j();
        for (int i14 = c37668c0.f362855d - 1; i14 >= 0; i14--) {
            t(c37668c0.getInt(i14));
        }
        t(j() - iJ3);
        s(i12, 2);
    }

    @Override // com.google.protobuf.Writer
    public final void writeUInt64List(int i12, List<Long> list, boolean z12) {
        if (!(list instanceof C37690n0)) {
            if (!z12) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    writeUInt64(i12, list.get(size).longValue());
                }
                return;
            }
            k(androidx.compose.ui.graphics.colorspace.e.f(10, 10, list));
            int iJ2 = j();
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                u(list.get(size2).longValue());
            }
            t(j() - iJ2);
            s(i12, 2);
            return;
        }
        C37690n0 c37690n0 = (C37690n0) list;
        if (!z12) {
            for (int i13 = c37690n0.f362920d - 1; i13 >= 0; i13--) {
                writeUInt64(i12, c37690n0.getLong(i13));
            }
            return;
        }
        k((c37690n0.f362920d * 10) + 10);
        int iJ3 = j();
        for (int i14 = c37690n0.f362920d - 1; i14 >= 0; i14--) {
            u(c37690n0.getLong(i14));
        }
        t(j() - iJ3);
        s(i12, 2);
    }
}
