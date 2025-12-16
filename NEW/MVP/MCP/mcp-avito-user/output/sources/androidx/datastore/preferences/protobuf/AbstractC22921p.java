package androidx.datastore.preferences.protobuf;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.datastore.preferences.protobuf.C22914m0;
import androidx.datastore.preferences.protobuf.C22939y0;
import androidx.datastore.preferences.protobuf.L1;
import androidx.datastore.preferences.protobuf.WireFormat;
import androidx.datastore.preferences.protobuf.Writer;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Http2;

/* compiled from: BinaryWriter.java */
/* renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC22921p extends AbstractC22932v implements Writer {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC22928t f45883a;

    /* renamed from: b, reason: collision with root package name */
    public final int f45884b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque<AbstractC22892f> f45885c = new ArrayDeque<>(4);

    /* renamed from: d, reason: collision with root package name */
    public int f45886d;

    /* compiled from: BinaryWriter.java */
    /* renamed from: androidx.datastore.preferences.protobuf.p$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45887a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f45887a = iArr;
            try {
                iArr[WireFormat.FieldType.f45765k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45887a[WireFormat.FieldType.f45764j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45887a[WireFormat.FieldType.f45763i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45887a[WireFormat.FieldType.f45762h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f45887a[WireFormat.FieldType.f45760f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f45887a[WireFormat.FieldType.f45772r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f45887a[WireFormat.FieldType.f45773s.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f45887a[WireFormat.FieldType.f45774t.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f45887a[WireFormat.FieldType.f45775u.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f45887a[WireFormat.FieldType.f45766l.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f45887a[WireFormat.FieldType.f45770p.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f45887a[WireFormat.FieldType.f45761g.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f45887a[WireFormat.FieldType.f45759e.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f45887a[WireFormat.FieldType.f45758d.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f45887a[WireFormat.FieldType.f45768n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f45887a[WireFormat.FieldType.f45769o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f45887a[WireFormat.FieldType.f45771q.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* compiled from: BinaryWriter.java */
    /* renamed from: androidx.datastore.preferences.protobuf.p$b */
    public static final class b extends AbstractC22921p {

        /* renamed from: e, reason: collision with root package name */
        public ByteBuffer f45888e;

        /* renamed from: f, reason: collision with root package name */
        public int f45889f;

        /* renamed from: g, reason: collision with root package name */
        public int f45890g;

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void a(int i12, Object obj, InterfaceC22897g1 interfaceC22897g1) {
            int iJ2 = j();
            interfaceC22897g1.c(obj, this);
            int iJ3 = j() - iJ2;
            k(10);
            t(iJ3);
            s(i12, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void b(int i12, AbstractC22934w abstractC22934w) {
            try {
                abstractC22934w.K(this);
                k(10);
                t(abstractC22934w.size());
                s(i12, 2);
            } catch (IOException e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void e(int i12, Object obj, InterfaceC22897g1 interfaceC22897g1) {
            s(i12, 4);
            interfaceC22897g1.c(obj, this);
            s(i12, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22932v
        public final void g(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            int i12 = this.f45890g;
            if (i12 + 1 < iRemaining) {
                this.f45886d += iRemaining;
                this.f45885c.addFirst(AbstractC22892f.i(byteBuffer));
                v(this.f45883a.a(this.f45884b));
            } else {
                int i13 = i12 - iRemaining;
                this.f45890g = i13;
                this.f45888e.position(i13 + 1);
                this.f45888e.put(byteBuffer);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22932v
        public final void h(byte[] bArr, int i12, int i13) {
            int i14 = this.f45890g;
            if (i14 + 1 < i13) {
                this.f45886d += i13;
                this.f45885c.addFirst(AbstractC22892f.j(i12, i13, bArr));
                v(this.f45883a.a(this.f45884b));
            } else {
                int i15 = i14 - i13;
                this.f45890g = i15;
                this.f45888e.position(i15 + 1);
                this.f45888e.put(bArr, i12, i13);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final int j() {
            return (this.f45889f - this.f45890g) + this.f45886d;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void k(int i12) {
            if (this.f45890g + 1 < i12) {
                v(this.f45883a.a(Math.max(i12, this.f45884b)));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void l(boolean z12) {
            byte b12 = z12 ? (byte) 1 : (byte) 0;
            ByteBuffer byteBuffer = this.f45888e;
            int i12 = this.f45890g;
            this.f45890g = i12 - 1;
            byteBuffer.put(i12, b12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void m(int i12) {
            int i13 = this.f45890g;
            this.f45890g = i13 - 4;
            this.f45888e.putInt(i13 - 3, i12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void n(long j12) {
            int i12 = this.f45890g;
            this.f45890g = i12 - 8;
            this.f45888e.putLong(i12 - 7, j12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void o(int i12) {
            if (i12 >= 0) {
                t(i12);
            } else {
                u(i12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void q(int i12) {
            t(CodedOutputStream.G(i12));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void r(long j12) {
            u(CodedOutputStream.H(j12));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void s(int i12, int i13) {
            t((i12 << 3) | i13);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void t(int i12) {
            if ((i12 & (-128)) == 0) {
                ByteBuffer byteBuffer = this.f45888e;
                int i13 = this.f45890g;
                this.f45890g = i13 - 1;
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
            ByteBuffer byteBuffer2 = this.f45888e;
            int i14 = this.f45890g;
            this.f45890g = i14 - 1;
            byteBuffer2.put(i14, (byte) (i12 >>> 28));
            int i15 = this.f45890g;
            this.f45890g = i15 - 4;
            this.f45888e.putInt(i15 - 3, (i12 & 127) | 128 | ((((i12 >>> 21) & 127) | 128) << 24) | ((((i12 >>> 14) & 127) | 128) << 16) | ((((i12 >>> 7) & 127) | 128) << 8));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void u(long j12) {
            switch (AbstractC22921p.i(j12)) {
                case 1:
                    ByteBuffer byteBuffer = this.f45888e;
                    int i12 = this.f45890g;
                    this.f45890g = i12 - 1;
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
                    int i13 = this.f45890g;
                    this.f45890g = i13 - 5;
                    this.f45888e.putLong(i13 - 7, (((j12 & 127) | 128) << 24) | ((j12 & 34091302912L) << 28) | (((j12 & 266338304) | 268435456) << 27) | (((j12 & 2080768) | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 26) | (((j12 & 16256) | 16384) << 25));
                    break;
                case 6:
                    int i14 = this.f45890g;
                    this.f45890g = i14 - 6;
                    this.f45888e.putLong(i14 - 7, (((j12 & 127) | 128) << 16) | ((j12 & 4363686772736L) << 21) | (((j12 & 34091302912L) | 34359738368L) << 20) | (((j12 & 266338304) | 268435456) << 19) | (((j12 & 2080768) | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 18) | (((j12 & 16256) | 16384) << 17));
                    break;
                case 7:
                    int i15 = this.f45890g - 7;
                    this.f45890g = i15;
                    this.f45888e.putLong(i15, (((j12 & 127) | 128) << 8) | ((4398046511104L | (j12 & 4363686772736L)) << 13) | ((558551906910208L & j12) << 14) | (((j12 & 34091302912L) | 34359738368L) << 12) | (((j12 & 266338304) | 268435456) << 11) | (((j12 & 2080768) | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 10) | (((j12 & 16256) | 16384) << 9));
                    break;
                case 8:
                    int i16 = this.f45890g;
                    this.f45890g = i16 - 8;
                    this.f45888e.putLong(i16 - 7, (j12 & 127) | 128 | ((4398046511104L | (j12 & 4363686772736L)) << 5) | (((558551906910208L & j12) | 562949953421312L) << 6) | ((71494644084506624L & j12) << 7) | (((j12 & 34091302912L) | 34359738368L) << 4) | (((j12 & 266338304) | 268435456) << 3) | (((j12 & 2080768) | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 2) | (((j12 & 16256) | 16384) << 1));
                    break;
                case 9:
                    ByteBuffer byteBuffer2 = this.f45888e;
                    int i17 = this.f45890g;
                    this.f45890g = i17 - 1;
                    byteBuffer2.put(i17, (byte) (j12 >>> 56));
                    z(j12 & 72057594037927935L);
                    break;
                case 10:
                    ByteBuffer byteBuffer3 = this.f45888e;
                    int i18 = this.f45890g;
                    this.f45890g = i18 - 1;
                    byteBuffer3.put(i18, (byte) (j12 >>> 63));
                    ByteBuffer byteBuffer4 = this.f45888e;
                    int i19 = this.f45890g;
                    this.f45890g = i19 - 1;
                    byteBuffer4.put(i19, (byte) (((j12 >>> 56) & 127) | 128));
                    z(j12 & 72057594037927935L);
                    break;
            }
        }

        public final void v(AbstractC22892f abstractC22892f) {
            if (!abstractC22892f.d()) {
                throw new RuntimeException("Allocated buffer does not have NIO buffer");
            }
            ByteBuffer byteBufferF = abstractC22892f.f();
            if (!byteBufferF.isDirect()) {
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            ByteBuffer byteBuffer = this.f45888e;
            if (byteBuffer != null) {
                int i12 = this.f45886d;
                int i13 = this.f45889f;
                int i14 = this.f45890g;
                this.f45886d = (i13 - i14) + i12;
                byteBuffer.position(i14 + 1);
                this.f45888e = null;
                this.f45890g = 0;
                this.f45889f = 0;
            }
            this.f45885c.addFirst(abstractC22892f);
            this.f45888e = byteBufferF;
            byteBufferF.limit(byteBufferF.capacity());
            this.f45888e.position(0);
            this.f45888e.order(ByteOrder.LITTLE_ENDIAN);
            int iLimit = this.f45888e.limit() - 1;
            this.f45889f = iLimit;
            this.f45890g = iLimit;
        }

        public final void w(int i12) {
            int i13 = this.f45890g;
            this.f45890g = i13 - 4;
            this.f45888e.putInt(i13 - 3, (i12 & 127) | 128 | ((266338304 & i12) << 3) | (((2080768 & i12) | 2097152) << 2) | (((i12 & 16256) | Http2.INITIAL_MAX_FRAME_SIZE) << 1));
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeBool(int i12, boolean z12) {
            k(6);
            byte b12 = z12 ? (byte) 1 : (byte) 0;
            ByteBuffer byteBuffer = this.f45888e;
            int i13 = this.f45890g;
            this.f45890g = i13 - 1;
            byteBuffer.put(i13, b12);
            s(i12, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeEndGroup(int i12) {
            s(i12, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeFixed32(int i12, int i13) {
            k(9);
            m(i13);
            s(i12, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeFixed64(int i12, long j12) {
            k(13);
            n(j12);
            s(i12, 1);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeInt32(int i12, int i13) {
            k(15);
            o(i13);
            s(i12, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeMessage(int i12, Object obj) {
            int iJ2 = j();
            Z0 z02 = Z0.f45797c;
            z02.getClass();
            z02.a(obj.getClass()).c(obj, this);
            int iJ3 = j() - iJ2;
            k(10);
            t(iJ3);
            s(i12, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeSInt32(int i12, int i13) {
            k(10);
            q(i13);
            s(i12, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeSInt64(int i12, long j12) {
            k(15);
            r(j12);
            s(i12, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeStartGroup(int i12) {
            s(i12, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeString(int i12, String str) {
            int i13;
            int i14;
            int i15;
            char cCharAt;
            int iJ2 = j();
            k(str.length());
            int length = str.length() - 1;
            this.f45890g -= length;
            while (length >= 0 && (cCharAt = str.charAt(length)) < 128) {
                this.f45888e.put(this.f45890g + length, (byte) cCharAt);
                length--;
            }
            if (length == -1) {
                this.f45890g--;
            } else {
                this.f45890g += length;
                while (length >= 0) {
                    char cCharAt2 = str.charAt(length);
                    if (cCharAt2 < 128 && (i15 = this.f45890g) >= 0) {
                        ByteBuffer byteBuffer = this.f45888e;
                        this.f45890g = i15 - 1;
                        byteBuffer.put(i15, (byte) cCharAt2);
                    } else if (cCharAt2 < 2048 && (i14 = this.f45890g) > 0) {
                        ByteBuffer byteBuffer2 = this.f45888e;
                        this.f45890g = i14 - 1;
                        byteBuffer2.put(i14, (byte) ((cCharAt2 & '?') | 128));
                        ByteBuffer byteBuffer3 = this.f45888e;
                        int i16 = this.f45890g;
                        this.f45890g = i16 - 1;
                        byteBuffer3.put(i16, (byte) ((cCharAt2 >>> 6) | 960));
                    } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i13 = this.f45890g) > 1) {
                        ByteBuffer byteBuffer4 = this.f45888e;
                        this.f45890g = i13 - 1;
                        byteBuffer4.put(i13, (byte) ((cCharAt2 & '?') | 128));
                        ByteBuffer byteBuffer5 = this.f45888e;
                        int i17 = this.f45890g;
                        this.f45890g = i17 - 1;
                        byteBuffer5.put(i17, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                        ByteBuffer byteBuffer6 = this.f45888e;
                        int i18 = this.f45890g;
                        this.f45890g = i18 - 1;
                        byteBuffer6.put(i18, (byte) ((cCharAt2 >>> '\f') | 480));
                    } else {
                        if (this.f45890g > 2) {
                            if (length != 0) {
                                char cCharAt3 = str.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                    length--;
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                    ByteBuffer byteBuffer7 = this.f45888e;
                                    int i19 = this.f45890g;
                                    this.f45890g = i19 - 1;
                                    byteBuffer7.put(i19, (byte) ((codePoint & 63) | 128));
                                    ByteBuffer byteBuffer8 = this.f45888e;
                                    int i22 = this.f45890g;
                                    this.f45890g = i22 - 1;
                                    byteBuffer8.put(i22, (byte) (((codePoint >>> 6) & 63) | 128));
                                    ByteBuffer byteBuffer9 = this.f45888e;
                                    int i23 = this.f45890g;
                                    this.f45890g = i23 - 1;
                                    byteBuffer9.put(i23, (byte) (((codePoint >>> 12) & 63) | 128));
                                    ByteBuffer byteBuffer10 = this.f45888e;
                                    int i24 = this.f45890g;
                                    this.f45890g = i24 - 1;
                                    byteBuffer10.put(i24, (byte) ((codePoint >>> 18) | 240));
                                }
                            }
                            throw new L1.d(length - 1, length);
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

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeUInt32(int i12, int i13) {
            k(10);
            t(i13);
            s(i12, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeUInt64(int i12, long j12) {
            k(15);
            u(j12);
            s(i12, 0);
        }

        public final void x(int i12) {
            int i13 = this.f45890g - 3;
            this.f45890g = i13;
            this.f45888e.putInt(i13, (((i12 & 127) | 128) << 8) | ((2080768 & i12) << 10) | (((i12 & 16256) | Http2.INITIAL_MAX_FRAME_SIZE) << 9));
        }

        public final void y(int i12) {
            int i13 = this.f45890g;
            this.f45890g = i13 - 2;
            this.f45888e.putShort(i13 - 1, (short) ((i12 & 127) | 128 | ((i12 & 16256) << 1)));
        }

        public final void z(long j12) {
            int i12 = this.f45890g;
            this.f45890g = i12 - 8;
            this.f45888e.putLong(i12 - 7, (j12 & 127) | 128 | (((71494644084506624L & j12) | 72057594037927936L) << 7) | (((558551906910208L & j12) | 562949953421312L) << 6) | (((4363686772736L & j12) | 4398046511104L) << 5) | (((34091302912L & j12) | 34359738368L) << 4) | (((266338304 & j12) | 268435456) << 3) | (((2080768 & j12) | PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) << 2) | (((16256 & j12) | 16384) << 1));
        }
    }

    /* compiled from: BinaryWriter.java */
    /* renamed from: androidx.datastore.preferences.protobuf.p$c */
    public static final class c extends AbstractC22921p {

        /* renamed from: e, reason: collision with root package name */
        public AbstractC22892f f45891e;

        /* renamed from: f, reason: collision with root package name */
        public byte[] f45892f;

        /* renamed from: g, reason: collision with root package name */
        public int f45893g;

        /* renamed from: h, reason: collision with root package name */
        public int f45894h;

        /* renamed from: i, reason: collision with root package name */
        public int f45895i;

        /* renamed from: j, reason: collision with root package name */
        public int f45896j;

        /* renamed from: k, reason: collision with root package name */
        public int f45897k;

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void a(int i12, Object obj, InterfaceC22897g1 interfaceC22897g1) {
            int iJ2 = j();
            interfaceC22897g1.c(obj, this);
            int iJ3 = j() - iJ2;
            k(10);
            t(iJ3);
            s(i12, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void b(int i12, AbstractC22934w abstractC22934w) {
            try {
                abstractC22934w.K(this);
                k(10);
                t(abstractC22934w.size());
                s(i12, 2);
            } catch (IOException e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void e(int i12, Object obj, InterfaceC22897g1 interfaceC22897g1) {
            s(i12, 4);
            interfaceC22897g1.c(obj, this);
            s(i12, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22932v
        public final void g(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (this.f45897k - this.f45895i < iRemaining) {
                this.f45886d += iRemaining;
                this.f45885c.addFirst(AbstractC22892f.i(byteBuffer));
                v(this.f45883a.b(this.f45884b));
            }
            int i12 = this.f45897k - iRemaining;
            this.f45897k = i12;
            byteBuffer.get(this.f45892f, i12 + 1, iRemaining);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22932v
        public final void h(byte[] bArr, int i12, int i13) {
            int i14 = this.f45897k;
            if (i14 - this.f45895i < i13) {
                this.f45886d += i13;
                this.f45885c.addFirst(AbstractC22892f.j(i12, i13, bArr));
                v(this.f45883a.b(this.f45884b));
            } else {
                int i15 = i14 - i13;
                this.f45897k = i15;
                System.arraycopy(bArr, i12, this.f45892f, i15 + 1, i13);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final int j() {
            return (this.f45896j - this.f45897k) + this.f45886d;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void k(int i12) {
            if (this.f45897k - this.f45895i < i12) {
                v(this.f45883a.b(Math.max(i12, this.f45884b)));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void l(boolean z12) {
            byte b12 = z12 ? (byte) 1 : (byte) 0;
            byte[] bArr = this.f45892f;
            int i12 = this.f45897k;
            this.f45897k = i12 - 1;
            bArr[i12] = b12;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void m(int i12) {
            byte[] bArr = this.f45892f;
            int i13 = this.f45897k;
            int i14 = i13 - 1;
            this.f45897k = i14;
            bArr[i13] = (byte) ((i12 >> 24) & 255);
            int i15 = i13 - 2;
            this.f45897k = i15;
            bArr[i14] = (byte) ((i12 >> 16) & 255);
            int i16 = i13 - 3;
            this.f45897k = i16;
            bArr[i15] = (byte) ((i12 >> 8) & 255);
            this.f45897k = i13 - 4;
            bArr[i16] = (byte) (i12 & 255);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void n(long j12) {
            byte[] bArr = this.f45892f;
            int i12 = this.f45897k;
            int i13 = i12 - 1;
            this.f45897k = i13;
            bArr[i12] = (byte) (((int) (j12 >> 56)) & 255);
            int i14 = i12 - 2;
            this.f45897k = i14;
            bArr[i13] = (byte) (((int) (j12 >> 48)) & 255);
            int i15 = i12 - 3;
            this.f45897k = i15;
            bArr[i14] = (byte) (((int) (j12 >> 40)) & 255);
            int i16 = i12 - 4;
            this.f45897k = i16;
            bArr[i15] = (byte) (((int) (j12 >> 32)) & 255);
            int i17 = i12 - 5;
            this.f45897k = i17;
            bArr[i16] = (byte) (((int) (j12 >> 24)) & 255);
            int i18 = i12 - 6;
            this.f45897k = i18;
            bArr[i17] = (byte) (((int) (j12 >> 16)) & 255);
            int i19 = i12 - 7;
            this.f45897k = i19;
            bArr[i18] = (byte) (((int) (j12 >> 8)) & 255);
            this.f45897k = i12 - 8;
            bArr[i19] = (byte) (((int) j12) & 255);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void o(int i12) {
            if (i12 >= 0) {
                t(i12);
            } else {
                u(i12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void q(int i12) {
            t(CodedOutputStream.G(i12));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void r(long j12) {
            u(CodedOutputStream.H(j12));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void s(int i12, int i13) {
            t((i12 << 3) | i13);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void t(int i12) {
            if ((i12 & (-128)) == 0) {
                byte[] bArr = this.f45892f;
                int i13 = this.f45897k;
                this.f45897k = i13 - 1;
                bArr[i13] = (byte) i12;
                return;
            }
            if ((i12 & (-16384)) == 0) {
                byte[] bArr2 = this.f45892f;
                int i14 = this.f45897k;
                int i15 = i14 - 1;
                this.f45897k = i15;
                bArr2[i14] = (byte) (i12 >>> 7);
                this.f45897k = i14 - 2;
                bArr2[i15] = (byte) ((i12 & 127) | 128);
                return;
            }
            if (((-2097152) & i12) == 0) {
                byte[] bArr3 = this.f45892f;
                int i16 = this.f45897k;
                int i17 = i16 - 1;
                this.f45897k = i17;
                bArr3[i16] = (byte) (i12 >>> 14);
                int i18 = i16 - 2;
                this.f45897k = i18;
                bArr3[i17] = (byte) (((i12 >>> 7) & 127) | 128);
                this.f45897k = i16 - 3;
                bArr3[i18] = (byte) ((i12 & 127) | 128);
                return;
            }
            if (((-268435456) & i12) == 0) {
                byte[] bArr4 = this.f45892f;
                int i19 = this.f45897k;
                int i22 = i19 - 1;
                this.f45897k = i22;
                bArr4[i19] = (byte) (i12 >>> 21);
                int i23 = i19 - 2;
                this.f45897k = i23;
                bArr4[i22] = (byte) (((i12 >>> 14) & 127) | 128);
                int i24 = i19 - 3;
                this.f45897k = i24;
                bArr4[i23] = (byte) (((i12 >>> 7) & 127) | 128);
                this.f45897k = i19 - 4;
                bArr4[i24] = (byte) ((i12 & 127) | 128);
                return;
            }
            byte[] bArr5 = this.f45892f;
            int i25 = this.f45897k;
            int i26 = i25 - 1;
            this.f45897k = i26;
            bArr5[i25] = (byte) (i12 >>> 28);
            int i27 = i25 - 2;
            this.f45897k = i27;
            bArr5[i26] = (byte) (((i12 >>> 21) & 127) | 128);
            int i28 = i25 - 3;
            this.f45897k = i28;
            bArr5[i27] = (byte) (((i12 >>> 14) & 127) | 128);
            int i29 = i25 - 4;
            this.f45897k = i29;
            bArr5[i28] = (byte) (((i12 >>> 7) & 127) | 128);
            this.f45897k = i25 - 5;
            bArr5[i29] = (byte) ((i12 & 127) | 128);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void u(long j12) {
            switch (AbstractC22921p.i(j12)) {
                case 1:
                    byte[] bArr = this.f45892f;
                    int i12 = this.f45897k;
                    this.f45897k = i12 - 1;
                    bArr[i12] = (byte) j12;
                    break;
                case 2:
                    byte[] bArr2 = this.f45892f;
                    int i13 = this.f45897k;
                    int i14 = i13 - 1;
                    this.f45897k = i14;
                    bArr2[i13] = (byte) (j12 >>> 7);
                    this.f45897k = i13 - 2;
                    bArr2[i14] = (byte) ((((int) j12) & 127) | 128);
                    break;
                case 3:
                    byte[] bArr3 = this.f45892f;
                    int i15 = this.f45897k;
                    int i16 = i15 - 1;
                    this.f45897k = i16;
                    bArr3[i15] = (byte) (((int) j12) >>> 14);
                    int i17 = i15 - 2;
                    this.f45897k = i17;
                    bArr3[i16] = (byte) (((j12 >>> 7) & 127) | 128);
                    this.f45897k = i15 - 3;
                    bArr3[i17] = (byte) ((j12 & 127) | 128);
                    break;
                case 4:
                    byte[] bArr4 = this.f45892f;
                    int i18 = this.f45897k;
                    int i19 = i18 - 1;
                    this.f45897k = i19;
                    bArr4[i18] = (byte) (j12 >>> 21);
                    int i22 = i18 - 2;
                    this.f45897k = i22;
                    bArr4[i19] = (byte) (((j12 >>> 14) & 127) | 128);
                    int i23 = i18 - 3;
                    this.f45897k = i23;
                    bArr4[i22] = (byte) (((j12 >>> 7) & 127) | 128);
                    this.f45897k = i18 - 4;
                    bArr4[i23] = (byte) ((j12 & 127) | 128);
                    break;
                case 5:
                    byte[] bArr5 = this.f45892f;
                    int i24 = this.f45897k;
                    int i25 = i24 - 1;
                    this.f45897k = i25;
                    bArr5[i24] = (byte) (j12 >>> 28);
                    int i26 = i24 - 2;
                    this.f45897k = i26;
                    bArr5[i25] = (byte) (((j12 >>> 21) & 127) | 128);
                    int i27 = i24 - 3;
                    this.f45897k = i27;
                    bArr5[i26] = (byte) (((j12 >>> 14) & 127) | 128);
                    int i28 = i24 - 4;
                    this.f45897k = i28;
                    bArr5[i27] = (byte) (((j12 >>> 7) & 127) | 128);
                    this.f45897k = i24 - 5;
                    bArr5[i28] = (byte) ((j12 & 127) | 128);
                    break;
                case 6:
                    byte[] bArr6 = this.f45892f;
                    int i29 = this.f45897k;
                    int i32 = i29 - 1;
                    this.f45897k = i32;
                    bArr6[i29] = (byte) (j12 >>> 35);
                    int i33 = i29 - 2;
                    this.f45897k = i33;
                    bArr6[i32] = (byte) (((j12 >>> 28) & 127) | 128);
                    int i34 = i29 - 3;
                    this.f45897k = i34;
                    bArr6[i33] = (byte) (((j12 >>> 21) & 127) | 128);
                    int i35 = i29 - 4;
                    this.f45897k = i35;
                    bArr6[i34] = (byte) (((j12 >>> 14) & 127) | 128);
                    int i36 = i29 - 5;
                    this.f45897k = i36;
                    bArr6[i35] = (byte) (((j12 >>> 7) & 127) | 128);
                    this.f45897k = i29 - 6;
                    bArr6[i36] = (byte) ((j12 & 127) | 128);
                    break;
                case 7:
                    byte[] bArr7 = this.f45892f;
                    int i37 = this.f45897k;
                    int i38 = i37 - 1;
                    this.f45897k = i38;
                    bArr7[i37] = (byte) (j12 >>> 42);
                    int i39 = i37 - 2;
                    this.f45897k = i39;
                    bArr7[i38] = (byte) (((j12 >>> 35) & 127) | 128);
                    int i42 = i37 - 3;
                    this.f45897k = i42;
                    bArr7[i39] = (byte) (((j12 >>> 28) & 127) | 128);
                    int i43 = i37 - 4;
                    this.f45897k = i43;
                    bArr7[i42] = (byte) (((j12 >>> 21) & 127) | 128);
                    int i44 = i37 - 5;
                    this.f45897k = i44;
                    bArr7[i43] = (byte) (((j12 >>> 14) & 127) | 128);
                    int i45 = i37 - 6;
                    this.f45897k = i45;
                    bArr7[i44] = (byte) (((j12 >>> 7) & 127) | 128);
                    this.f45897k = i37 - 7;
                    bArr7[i45] = (byte) ((j12 & 127) | 128);
                    break;
                case 8:
                    byte[] bArr8 = this.f45892f;
                    int i46 = this.f45897k;
                    int i47 = i46 - 1;
                    this.f45897k = i47;
                    bArr8[i46] = (byte) (j12 >>> 49);
                    int i48 = i46 - 2;
                    this.f45897k = i48;
                    bArr8[i47] = (byte) (((j12 >>> 42) & 127) | 128);
                    int i49 = i46 - 3;
                    this.f45897k = i49;
                    bArr8[i48] = (byte) (((j12 >>> 35) & 127) | 128);
                    int i52 = i46 - 4;
                    this.f45897k = i52;
                    bArr8[i49] = (byte) (((j12 >>> 28) & 127) | 128);
                    int i53 = i46 - 5;
                    this.f45897k = i53;
                    bArr8[i52] = (byte) (((j12 >>> 21) & 127) | 128);
                    int i54 = i46 - 6;
                    this.f45897k = i54;
                    bArr8[i53] = (byte) (((j12 >>> 14) & 127) | 128);
                    int i55 = i46 - 7;
                    this.f45897k = i55;
                    bArr8[i54] = (byte) (((j12 >>> 7) & 127) | 128);
                    this.f45897k = i46 - 8;
                    bArr8[i55] = (byte) ((j12 & 127) | 128);
                    break;
                case 9:
                    byte[] bArr9 = this.f45892f;
                    int i56 = this.f45897k;
                    int i57 = i56 - 1;
                    this.f45897k = i57;
                    bArr9[i56] = (byte) (j12 >>> 56);
                    int i58 = i56 - 2;
                    this.f45897k = i58;
                    bArr9[i57] = (byte) (((j12 >>> 49) & 127) | 128);
                    int i59 = i56 - 3;
                    this.f45897k = i59;
                    bArr9[i58] = (byte) (((j12 >>> 42) & 127) | 128);
                    int i62 = i56 - 4;
                    this.f45897k = i62;
                    bArr9[i59] = (byte) (((j12 >>> 35) & 127) | 128);
                    int i63 = i56 - 5;
                    this.f45897k = i63;
                    bArr9[i62] = (byte) (((j12 >>> 28) & 127) | 128);
                    int i64 = i56 - 6;
                    this.f45897k = i64;
                    bArr9[i63] = (byte) (((j12 >>> 21) & 127) | 128);
                    int i65 = i56 - 7;
                    this.f45897k = i65;
                    bArr9[i64] = (byte) (((j12 >>> 14) & 127) | 128);
                    int i66 = i56 - 8;
                    this.f45897k = i66;
                    bArr9[i65] = (byte) (((j12 >>> 7) & 127) | 128);
                    this.f45897k = i56 - 9;
                    bArr9[i66] = (byte) ((j12 & 127) | 128);
                    break;
                case 10:
                    byte[] bArr10 = this.f45892f;
                    int i67 = this.f45897k;
                    int i68 = i67 - 1;
                    this.f45897k = i68;
                    bArr10[i67] = (byte) (j12 >>> 63);
                    int i69 = i67 - 2;
                    this.f45897k = i69;
                    bArr10[i68] = (byte) (((j12 >>> 56) & 127) | 128);
                    int i72 = i67 - 3;
                    this.f45897k = i72;
                    bArr10[i69] = (byte) (((j12 >>> 49) & 127) | 128);
                    int i73 = i67 - 4;
                    this.f45897k = i73;
                    bArr10[i72] = (byte) (((j12 >>> 42) & 127) | 128);
                    int i74 = i67 - 5;
                    this.f45897k = i74;
                    bArr10[i73] = (byte) (((j12 >>> 35) & 127) | 128);
                    int i75 = i67 - 6;
                    this.f45897k = i75;
                    bArr10[i74] = (byte) (((j12 >>> 28) & 127) | 128);
                    int i76 = i67 - 7;
                    this.f45897k = i76;
                    bArr10[i75] = (byte) (((j12 >>> 21) & 127) | 128);
                    int i77 = i67 - 8;
                    this.f45897k = i77;
                    bArr10[i76] = (byte) (((j12 >>> 14) & 127) | 128);
                    int i78 = i67 - 9;
                    this.f45897k = i78;
                    bArr10[i77] = (byte) (((j12 >>> 7) & 127) | 128);
                    this.f45897k = i67 - 10;
                    bArr10[i78] = (byte) ((j12 & 127) | 128);
                    break;
            }
        }

        public final void v(AbstractC22892f abstractC22892f) {
            if (!abstractC22892f.c()) {
                throw new RuntimeException("Allocator returned non-heap buffer");
            }
            AbstractC22892f abstractC22892f2 = this.f45891e;
            if (abstractC22892f2 != null) {
                int i12 = this.f45886d;
                int i13 = this.f45896j;
                int i14 = this.f45897k;
                this.f45886d = (i13 - i14) + i12;
                abstractC22892f2.h((i14 - abstractC22892f2.b()) + 1);
                this.f45891e = null;
                this.f45897k = 0;
                this.f45896j = 0;
            }
            this.f45885c.addFirst(abstractC22892f);
            this.f45891e = abstractC22892f;
            this.f45892f = abstractC22892f.a();
            int iB2 = abstractC22892f.b();
            this.f45894h = abstractC22892f.e() + iB2;
            int iG2 = iB2 + abstractC22892f.g();
            this.f45893g = iG2;
            this.f45895i = iG2 - 1;
            int i15 = this.f45894h - 1;
            this.f45896j = i15;
            this.f45897k = i15;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeBool(int i12, boolean z12) {
            k(6);
            byte b12 = z12 ? (byte) 1 : (byte) 0;
            byte[] bArr = this.f45892f;
            int i13 = this.f45897k;
            this.f45897k = i13 - 1;
            bArr[i13] = b12;
            s(i12, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeEndGroup(int i12) {
            s(i12, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeFixed32(int i12, int i13) {
            k(9);
            m(i13);
            s(i12, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeFixed64(int i12, long j12) {
            k(13);
            n(j12);
            s(i12, 1);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeInt32(int i12, int i13) {
            k(15);
            o(i13);
            s(i12, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeMessage(int i12, Object obj) {
            int iJ2 = j();
            Z0 z02 = Z0.f45797c;
            z02.getClass();
            z02.a(obj.getClass()).c(obj, this);
            int iJ3 = j() - iJ2;
            k(10);
            t(iJ3);
            s(i12, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeSInt32(int i12, int i13) {
            k(10);
            q(i13);
            s(i12, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeSInt64(int i12, long j12) {
            k(15);
            r(j12);
            s(i12, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeStartGroup(int i12) {
            s(i12, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeString(int i12, String str) {
            int i13;
            int i14;
            int i15;
            char cCharAt;
            int iJ2 = j();
            k(str.length());
            int length = str.length() - 1;
            this.f45897k -= length;
            while (length >= 0 && (cCharAt = str.charAt(length)) < 128) {
                this.f45892f[this.f45897k + length] = (byte) cCharAt;
                length--;
            }
            if (length == -1) {
                this.f45897k--;
            } else {
                this.f45897k += length;
                while (length >= 0) {
                    char cCharAt2 = str.charAt(length);
                    if (cCharAt2 < 128 && (i15 = this.f45897k) > this.f45895i) {
                        byte[] bArr = this.f45892f;
                        this.f45897k = i15 - 1;
                        bArr[i15] = (byte) cCharAt2;
                    } else if (cCharAt2 < 2048 && (i14 = this.f45897k) > this.f45893g) {
                        byte[] bArr2 = this.f45892f;
                        int i16 = i14 - 1;
                        this.f45897k = i16;
                        bArr2[i14] = (byte) ((cCharAt2 & '?') | 128);
                        this.f45897k = i14 - 2;
                        bArr2[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                    } else if ((cCharAt2 < 55296 || 57343 < cCharAt2) && (i13 = this.f45897k) > this.f45893g + 1) {
                        byte[] bArr3 = this.f45892f;
                        int i17 = i13 - 1;
                        this.f45897k = i17;
                        bArr3[i13] = (byte) ((cCharAt2 & '?') | 128);
                        int i18 = i13 - 2;
                        this.f45897k = i18;
                        bArr3[i17] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                        this.f45897k = i13 - 3;
                        bArr3[i18] = (byte) ((cCharAt2 >>> '\f') | 480);
                    } else {
                        if (this.f45897k > this.f45893g + 2) {
                            if (length != 0) {
                                char cCharAt3 = str.charAt(length - 1);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt2)) {
                                    length--;
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt2);
                                    byte[] bArr4 = this.f45892f;
                                    int i19 = this.f45897k;
                                    int i22 = i19 - 1;
                                    this.f45897k = i22;
                                    bArr4[i19] = (byte) ((codePoint & 63) | 128);
                                    int i23 = i19 - 2;
                                    this.f45897k = i23;
                                    bArr4[i22] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    int i24 = i19 - 3;
                                    this.f45897k = i24;
                                    bArr4[i23] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    this.f45897k = i19 - 4;
                                    bArr4[i24] = (byte) ((codePoint >>> 18) | 240);
                                }
                            }
                            throw new L1.d(length - 1, length);
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

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeUInt32(int i12, int i13) {
            k(10);
            t(i13);
            s(i12, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeUInt64(int i12, long j12) {
            k(15);
            u(j12);
            s(i12, 0);
        }
    }

    /* compiled from: BinaryWriter.java */
    /* renamed from: androidx.datastore.preferences.protobuf.p$d */
    public static final class d extends AbstractC22921p {

        /* renamed from: e, reason: collision with root package name */
        public ByteBuffer f45898e;

        /* renamed from: f, reason: collision with root package name */
        public long f45899f;

        /* renamed from: g, reason: collision with root package name */
        public long f45900g;

        /* renamed from: h, reason: collision with root package name */
        public long f45901h;

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void a(int i12, Object obj, InterfaceC22897g1 interfaceC22897g1) {
            int iJ2 = j();
            interfaceC22897g1.c(obj, this);
            int iJ3 = j() - iJ2;
            k(10);
            t(iJ3);
            s(i12, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void b(int i12, AbstractC22934w abstractC22934w) {
            try {
                abstractC22934w.K(this);
                k(10);
                t(abstractC22934w.size());
                s(i12, 2);
            } catch (IOException e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void e(int i12, Object obj, InterfaceC22897g1 interfaceC22897g1) {
            s(i12, 4);
            interfaceC22897g1.c(obj, this);
            s(i12, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22932v
        public final void g(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            long j12 = this.f45901h;
            long j13 = this.f45899f;
            if (((int) (j12 - j13)) + 1 < iRemaining) {
                this.f45886d += iRemaining;
                this.f45885c.addFirst(AbstractC22892f.i(byteBuffer));
                v(this.f45883a.a(this.f45884b));
            } else {
                long j14 = j12 - iRemaining;
                this.f45901h = j14;
                this.f45898e.position(((int) (j14 - j13)) + 1);
                this.f45898e.put(byteBuffer);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22932v
        public final void h(byte[] bArr, int i12, int i13) {
            long j12 = this.f45901h;
            long j13 = this.f45899f;
            if (((int) (j12 - j13)) + 1 < i13) {
                this.f45886d += i13;
                this.f45885c.addFirst(AbstractC22892f.j(i12, i13, bArr));
                v(this.f45883a.a(this.f45884b));
            } else {
                long j14 = j12 - i13;
                this.f45901h = j14;
                this.f45898e.position(((int) (j14 - j13)) + 1);
                this.f45898e.put(bArr, i12, i13);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final int j() {
            return this.f45886d + ((int) (this.f45900g - this.f45901h));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void k(int i12) {
            if (((int) (this.f45901h - this.f45899f)) + 1 < i12) {
                v(this.f45883a.a(Math.max(i12, this.f45884b)));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void l(boolean z12) {
            byte b12 = z12 ? (byte) 1 : (byte) 0;
            long j12 = this.f45901h;
            this.f45901h = j12 - 1;
            K1.o(j12, b12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void m(int i12) {
            long j12 = this.f45901h;
            this.f45901h = j12 - 1;
            K1.o(j12, (byte) ((i12 >> 24) & 255));
            long j13 = this.f45901h;
            this.f45901h = j13 - 1;
            K1.o(j13, (byte) ((i12 >> 16) & 255));
            long j14 = this.f45901h;
            this.f45901h = j14 - 1;
            K1.o(j14, (byte) ((i12 >> 8) & 255));
            long j15 = this.f45901h;
            this.f45901h = j15 - 1;
            K1.o(j15, (byte) (i12 & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void n(long j12) {
            long j13 = this.f45901h;
            this.f45901h = j13 - 1;
            K1.o(j13, (byte) (((int) (j12 >> 56)) & 255));
            long j14 = this.f45901h;
            this.f45901h = j14 - 1;
            K1.o(j14, (byte) (((int) (j12 >> 48)) & 255));
            long j15 = this.f45901h;
            this.f45901h = j15 - 1;
            K1.o(j15, (byte) (((int) (j12 >> 40)) & 255));
            long j16 = this.f45901h;
            this.f45901h = j16 - 1;
            K1.o(j16, (byte) (((int) (j12 >> 32)) & 255));
            long j17 = this.f45901h;
            this.f45901h = j17 - 1;
            K1.o(j17, (byte) (((int) (j12 >> 24)) & 255));
            long j18 = this.f45901h;
            this.f45901h = j18 - 1;
            K1.o(j18, (byte) (((int) (j12 >> 16)) & 255));
            long j19 = this.f45901h;
            this.f45901h = j19 - 1;
            K1.o(j19, (byte) (((int) (j12 >> 8)) & 255));
            long j22 = this.f45901h;
            this.f45901h = j22 - 1;
            K1.o(j22, (byte) (((int) j12) & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void o(int i12) {
            if (i12 >= 0) {
                t(i12);
            } else {
                u(i12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void q(int i12) {
            t(CodedOutputStream.G(i12));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void r(long j12) {
            u(CodedOutputStream.H(j12));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void s(int i12, int i13) {
            t((i12 << 3) | i13);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void t(int i12) {
            if ((i12 & (-128)) == 0) {
                long j12 = this.f45901h;
                this.f45901h = j12 - 1;
                K1.o(j12, (byte) i12);
                return;
            }
            if ((i12 & (-16384)) == 0) {
                long j13 = this.f45901h;
                this.f45901h = j13 - 1;
                K1.o(j13, (byte) (i12 >>> 7));
                long j14 = this.f45901h;
                this.f45901h = j14 - 1;
                K1.o(j14, (byte) ((i12 & 127) | 128));
                return;
            }
            if (((-2097152) & i12) == 0) {
                long j15 = this.f45901h;
                this.f45901h = j15 - 1;
                K1.o(j15, (byte) (i12 >>> 14));
                long j16 = this.f45901h;
                this.f45901h = j16 - 1;
                K1.o(j16, (byte) (((i12 >>> 7) & 127) | 128));
                long j17 = this.f45901h;
                this.f45901h = j17 - 1;
                K1.o(j17, (byte) ((i12 & 127) | 128));
                return;
            }
            if (((-268435456) & i12) == 0) {
                long j18 = this.f45901h;
                this.f45901h = j18 - 1;
                K1.o(j18, (byte) (i12 >>> 21));
                long j19 = this.f45901h;
                this.f45901h = j19 - 1;
                K1.o(j19, (byte) (((i12 >>> 14) & 127) | 128));
                long j22 = this.f45901h;
                this.f45901h = j22 - 1;
                K1.o(j22, (byte) (((i12 >>> 7) & 127) | 128));
                long j23 = this.f45901h;
                this.f45901h = j23 - 1;
                K1.o(j23, (byte) ((i12 & 127) | 128));
                return;
            }
            long j24 = this.f45901h;
            this.f45901h = j24 - 1;
            K1.o(j24, (byte) (i12 >>> 28));
            long j25 = this.f45901h;
            this.f45901h = j25 - 1;
            K1.o(j25, (byte) (((i12 >>> 21) & 127) | 128));
            long j26 = this.f45901h;
            this.f45901h = j26 - 1;
            K1.o(j26, (byte) (((i12 >>> 14) & 127) | 128));
            long j27 = this.f45901h;
            this.f45901h = j27 - 1;
            K1.o(j27, (byte) (((i12 >>> 7) & 127) | 128));
            long j28 = this.f45901h;
            this.f45901h = j28 - 1;
            K1.o(j28, (byte) ((i12 & 127) | 128));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void u(long j12) {
            switch (AbstractC22921p.i(j12)) {
                case 1:
                    long j13 = this.f45901h;
                    this.f45901h = j13 - 1;
                    K1.o(j13, (byte) j12);
                    break;
                case 2:
                    long j14 = this.f45901h;
                    this.f45901h = j14 - 1;
                    K1.o(j14, (byte) (j12 >>> 7));
                    long j15 = this.f45901h;
                    this.f45901h = j15 - 1;
                    K1.o(j15, (byte) ((((int) j12) & 127) | 128));
                    break;
                case 3:
                    long j16 = this.f45901h;
                    this.f45901h = j16 - 1;
                    K1.o(j16, (byte) (((int) j12) >>> 14));
                    long j17 = this.f45901h;
                    this.f45901h = j17 - 1;
                    K1.o(j17, (byte) (((j12 >>> 7) & 127) | 128));
                    long j18 = this.f45901h;
                    this.f45901h = j18 - 1;
                    K1.o(j18, (byte) ((j12 & 127) | 128));
                    break;
                case 4:
                    long j19 = this.f45901h;
                    this.f45901h = j19 - 1;
                    K1.o(j19, (byte) (j12 >>> 21));
                    long j22 = this.f45901h;
                    this.f45901h = j22 - 1;
                    K1.o(j22, (byte) (((j12 >>> 14) & 127) | 128));
                    long j23 = this.f45901h;
                    this.f45901h = j23 - 1;
                    K1.o(j23, (byte) (((j12 >>> 7) & 127) | 128));
                    long j24 = this.f45901h;
                    this.f45901h = j24 - 1;
                    K1.o(j24, (byte) ((j12 & 127) | 128));
                    break;
                case 5:
                    long j25 = this.f45901h;
                    this.f45901h = j25 - 1;
                    K1.o(j25, (byte) (j12 >>> 28));
                    long j26 = this.f45901h;
                    this.f45901h = j26 - 1;
                    K1.o(j26, (byte) (((j12 >>> 21) & 127) | 128));
                    long j27 = this.f45901h;
                    this.f45901h = j27 - 1;
                    K1.o(j27, (byte) (((j12 >>> 14) & 127) | 128));
                    long j28 = this.f45901h;
                    this.f45901h = j28 - 1;
                    K1.o(j28, (byte) (((j12 >>> 7) & 127) | 128));
                    long j29 = this.f45901h;
                    this.f45901h = j29 - 1;
                    K1.o(j29, (byte) ((j12 & 127) | 128));
                    break;
                case 6:
                    long j32 = this.f45901h;
                    this.f45901h = j32 - 1;
                    K1.o(j32, (byte) (j12 >>> 35));
                    long j33 = this.f45901h;
                    this.f45901h = j33 - 1;
                    K1.o(j33, (byte) (((j12 >>> 28) & 127) | 128));
                    long j34 = this.f45901h;
                    this.f45901h = j34 - 1;
                    K1.o(j34, (byte) (((j12 >>> 21) & 127) | 128));
                    long j35 = this.f45901h;
                    this.f45901h = j35 - 1;
                    K1.o(j35, (byte) (((j12 >>> 14) & 127) | 128));
                    long j36 = this.f45901h;
                    this.f45901h = j36 - 1;
                    K1.o(j36, (byte) (((j12 >>> 7) & 127) | 128));
                    long j37 = this.f45901h;
                    this.f45901h = j37 - 1;
                    K1.o(j37, (byte) ((j12 & 127) | 128));
                    break;
                case 7:
                    long j38 = this.f45901h;
                    this.f45901h = j38 - 1;
                    K1.o(j38, (byte) (j12 >>> 42));
                    long j39 = this.f45901h;
                    this.f45901h = j39 - 1;
                    K1.o(j39, (byte) (((j12 >>> 35) & 127) | 128));
                    long j42 = this.f45901h;
                    this.f45901h = j42 - 1;
                    K1.o(j42, (byte) (((j12 >>> 28) & 127) | 128));
                    long j43 = this.f45901h;
                    this.f45901h = j43 - 1;
                    K1.o(j43, (byte) (((j12 >>> 21) & 127) | 128));
                    long j44 = this.f45901h;
                    this.f45901h = j44 - 1;
                    K1.o(j44, (byte) (((j12 >>> 14) & 127) | 128));
                    long j45 = this.f45901h;
                    this.f45901h = j45 - 1;
                    K1.o(j45, (byte) (((j12 >>> 7) & 127) | 128));
                    long j46 = this.f45901h;
                    this.f45901h = j46 - 1;
                    K1.o(j46, (byte) ((j12 & 127) | 128));
                    break;
                case 8:
                    long j47 = this.f45901h;
                    this.f45901h = j47 - 1;
                    K1.o(j47, (byte) (j12 >>> 49));
                    long j48 = this.f45901h;
                    this.f45901h = j48 - 1;
                    K1.o(j48, (byte) (((j12 >>> 42) & 127) | 128));
                    long j49 = this.f45901h;
                    this.f45901h = j49 - 1;
                    K1.o(j49, (byte) (((j12 >>> 35) & 127) | 128));
                    long j52 = this.f45901h;
                    this.f45901h = j52 - 1;
                    K1.o(j52, (byte) (((j12 >>> 28) & 127) | 128));
                    long j53 = this.f45901h;
                    this.f45901h = j53 - 1;
                    K1.o(j53, (byte) (((j12 >>> 21) & 127) | 128));
                    long j54 = this.f45901h;
                    this.f45901h = j54 - 1;
                    K1.o(j54, (byte) (((j12 >>> 14) & 127) | 128));
                    long j55 = this.f45901h;
                    this.f45901h = j55 - 1;
                    K1.o(j55, (byte) (((j12 >>> 7) & 127) | 128));
                    long j56 = this.f45901h;
                    this.f45901h = j56 - 1;
                    K1.o(j56, (byte) ((j12 & 127) | 128));
                    break;
                case 9:
                    long j57 = this.f45901h;
                    this.f45901h = j57 - 1;
                    K1.o(j57, (byte) (j12 >>> 56));
                    long j58 = this.f45901h;
                    this.f45901h = j58 - 1;
                    K1.o(j58, (byte) (((j12 >>> 49) & 127) | 128));
                    long j59 = this.f45901h;
                    this.f45901h = j59 - 1;
                    K1.o(j59, (byte) (((j12 >>> 42) & 127) | 128));
                    long j62 = this.f45901h;
                    this.f45901h = j62 - 1;
                    K1.o(j62, (byte) (((j12 >>> 35) & 127) | 128));
                    long j63 = this.f45901h;
                    this.f45901h = j63 - 1;
                    K1.o(j63, (byte) (((j12 >>> 28) & 127) | 128));
                    long j64 = this.f45901h;
                    this.f45901h = j64 - 1;
                    K1.o(j64, (byte) (((j12 >>> 21) & 127) | 128));
                    long j65 = this.f45901h;
                    this.f45901h = j65 - 1;
                    K1.o(j65, (byte) (((j12 >>> 14) & 127) | 128));
                    long j66 = this.f45901h;
                    this.f45901h = j66 - 1;
                    K1.o(j66, (byte) (((j12 >>> 7) & 127) | 128));
                    long j67 = this.f45901h;
                    this.f45901h = j67 - 1;
                    K1.o(j67, (byte) ((j12 & 127) | 128));
                    break;
                case 10:
                    long j68 = this.f45901h;
                    this.f45901h = j68 - 1;
                    K1.o(j68, (byte) (j12 >>> 63));
                    long j69 = this.f45901h;
                    this.f45901h = j69 - 1;
                    K1.o(j69, (byte) (((j12 >>> 56) & 127) | 128));
                    long j72 = this.f45901h;
                    this.f45901h = j72 - 1;
                    K1.o(j72, (byte) (((j12 >>> 49) & 127) | 128));
                    long j73 = this.f45901h;
                    this.f45901h = j73 - 1;
                    K1.o(j73, (byte) (((j12 >>> 42) & 127) | 128));
                    long j74 = this.f45901h;
                    this.f45901h = j74 - 1;
                    K1.o(j74, (byte) (((j12 >>> 35) & 127) | 128));
                    long j75 = this.f45901h;
                    this.f45901h = j75 - 1;
                    K1.o(j75, (byte) (((j12 >>> 28) & 127) | 128));
                    long j76 = this.f45901h;
                    this.f45901h = j76 - 1;
                    K1.o(j76, (byte) (((j12 >>> 21) & 127) | 128));
                    long j77 = this.f45901h;
                    this.f45901h = j77 - 1;
                    K1.o(j77, (byte) (((j12 >>> 14) & 127) | 128));
                    long j78 = this.f45901h;
                    this.f45901h = j78 - 1;
                    K1.o(j78, (byte) (((j12 >>> 7) & 127) | 128));
                    long j79 = this.f45901h;
                    this.f45901h = j79 - 1;
                    K1.o(j79, (byte) ((j12 & 127) | 128));
                    break;
            }
        }

        public final void v(AbstractC22892f abstractC22892f) {
            if (!abstractC22892f.d()) {
                throw new RuntimeException("Allocated buffer does not have NIO buffer");
            }
            ByteBuffer byteBufferF = abstractC22892f.f();
            if (!byteBufferF.isDirect()) {
                throw new RuntimeException("Allocator returned non-direct buffer");
            }
            ByteBuffer byteBuffer = this.f45898e;
            if (byteBuffer != null) {
                int i12 = this.f45886d;
                long j12 = this.f45900g;
                long j13 = this.f45901h;
                this.f45886d = i12 + ((int) (j12 - j13));
                byteBuffer.position(((int) (j13 - this.f45899f)) + 1);
                this.f45898e = null;
                this.f45901h = 0L;
                this.f45900g = 0L;
            }
            this.f45885c.addFirst(abstractC22892f);
            this.f45898e = byteBufferF;
            byteBufferF.limit(byteBufferF.capacity());
            this.f45898e.position(0);
            long jA2 = K1.a(this.f45898e);
            this.f45899f = jA2;
            long jLimit = jA2 + (this.f45898e.limit() - 1);
            this.f45900g = jLimit;
            this.f45901h = jLimit;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeBool(int i12, boolean z12) {
            k(6);
            byte b12 = z12 ? (byte) 1 : (byte) 0;
            long j12 = this.f45901h;
            this.f45901h = j12 - 1;
            K1.o(j12, b12);
            s(i12, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeEndGroup(int i12) {
            s(i12, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeFixed32(int i12, int i13) {
            k(9);
            m(i13);
            s(i12, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeFixed64(int i12, long j12) {
            k(13);
            n(j12);
            s(i12, 1);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeInt32(int i12, int i13) {
            k(15);
            o(i13);
            s(i12, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeMessage(int i12, Object obj) {
            int iJ2 = j();
            Z0 z02 = Z0.f45797c;
            z02.getClass();
            z02.a(obj.getClass()).c(obj, this);
            int iJ3 = j() - iJ2;
            k(10);
            t(iJ3);
            s(i12, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeSInt32(int i12, int i13) {
            k(10);
            q(i13);
            s(i12, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeSInt64(int i12, long j12) {
            k(15);
            r(j12);
            s(i12, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeStartGroup(int i12) {
            s(i12, 3);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
        @Override // androidx.datastore.preferences.protobuf.Writer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void writeString(int r14, java.lang.String r15) {
            /*
                Method dump skipped, instructions count: 295
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC22921p.d.writeString(int, java.lang.String):void");
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeUInt32(int i12, int i13) {
            k(10);
            t(i13);
            s(i12, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeUInt64(int i12, long j12) {
            k(15);
            u(j12);
            s(i12, 0);
        }
    }

    /* compiled from: BinaryWriter.java */
    /* renamed from: androidx.datastore.preferences.protobuf.p$e */
    public static final class e extends AbstractC22921p {

        /* renamed from: e, reason: collision with root package name */
        public AbstractC22892f f45902e;

        /* renamed from: f, reason: collision with root package name */
        public byte[] f45903f;

        /* renamed from: g, reason: collision with root package name */
        public long f45904g;

        /* renamed from: h, reason: collision with root package name */
        public long f45905h;

        /* renamed from: i, reason: collision with root package name */
        public long f45906i;

        /* renamed from: j, reason: collision with root package name */
        public long f45907j;

        /* renamed from: k, reason: collision with root package name */
        public long f45908k;

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void a(int i12, Object obj, InterfaceC22897g1 interfaceC22897g1) {
            int iJ2 = j();
            interfaceC22897g1.c(obj, this);
            int iJ3 = j() - iJ2;
            k(10);
            t(iJ3);
            s(i12, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void b(int i12, AbstractC22934w abstractC22934w) {
            try {
                abstractC22934w.K(this);
                k(10);
                t(abstractC22934w.size());
                s(i12, 2);
            } catch (IOException e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void e(int i12, Object obj, InterfaceC22897g1 interfaceC22897g1) {
            s(i12, 4);
            interfaceC22897g1.c(obj, this);
            s(i12, 3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22932v
        public final void g(ByteBuffer byteBuffer) {
            int iRemaining = byteBuffer.remaining();
            if (((int) (this.f45908k - this.f45906i)) < iRemaining) {
                this.f45886d += iRemaining;
                this.f45885c.addFirst(AbstractC22892f.i(byteBuffer));
                v(this.f45883a.b(this.f45884b));
            }
            long j12 = this.f45908k - iRemaining;
            this.f45908k = j12;
            byteBuffer.get(this.f45903f, ((int) j12) + 1, iRemaining);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22932v
        public final void h(byte[] bArr, int i12, int i13) {
            if (i12 < 0 || i12 + i13 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("value.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i12), Integer.valueOf(i13)));
            }
            long j12 = this.f45908k;
            if (((int) (j12 - this.f45906i)) < i13) {
                this.f45886d += i13;
                this.f45885c.addFirst(AbstractC22892f.j(i12, i13, bArr));
                v(this.f45883a.b(this.f45884b));
            } else {
                long j13 = j12 - i13;
                this.f45908k = j13;
                System.arraycopy(bArr, i12, this.f45903f, ((int) j13) + 1, i13);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final int j() {
            return this.f45886d + ((int) (this.f45907j - this.f45908k));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void k(int i12) {
            if (((int) (this.f45908k - this.f45906i)) < i12) {
                v(this.f45883a.b(Math.max(i12, this.f45884b)));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void l(boolean z12) {
            byte b12 = z12 ? (byte) 1 : (byte) 0;
            byte[] bArr = this.f45903f;
            long j12 = this.f45908k;
            this.f45908k = j12 - 1;
            K1.p(bArr, j12, b12);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void m(int i12) {
            byte[] bArr = this.f45903f;
            long j12 = this.f45908k;
            this.f45908k = j12 - 1;
            K1.p(bArr, j12, (byte) ((i12 >> 24) & 255));
            byte[] bArr2 = this.f45903f;
            long j13 = this.f45908k;
            this.f45908k = j13 - 1;
            K1.p(bArr2, j13, (byte) ((i12 >> 16) & 255));
            byte[] bArr3 = this.f45903f;
            long j14 = this.f45908k;
            this.f45908k = j14 - 1;
            K1.p(bArr3, j14, (byte) ((i12 >> 8) & 255));
            byte[] bArr4 = this.f45903f;
            long j15 = this.f45908k;
            this.f45908k = j15 - 1;
            K1.p(bArr4, j15, (byte) (i12 & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void n(long j12) {
            byte[] bArr = this.f45903f;
            long j13 = this.f45908k;
            this.f45908k = j13 - 1;
            K1.p(bArr, j13, (byte) (((int) (j12 >> 56)) & 255));
            byte[] bArr2 = this.f45903f;
            long j14 = this.f45908k;
            this.f45908k = j14 - 1;
            K1.p(bArr2, j14, (byte) (((int) (j12 >> 48)) & 255));
            byte[] bArr3 = this.f45903f;
            long j15 = this.f45908k;
            this.f45908k = j15 - 1;
            K1.p(bArr3, j15, (byte) (((int) (j12 >> 40)) & 255));
            byte[] bArr4 = this.f45903f;
            long j16 = this.f45908k;
            this.f45908k = j16 - 1;
            K1.p(bArr4, j16, (byte) (((int) (j12 >> 32)) & 255));
            byte[] bArr5 = this.f45903f;
            long j17 = this.f45908k;
            this.f45908k = j17 - 1;
            K1.p(bArr5, j17, (byte) (((int) (j12 >> 24)) & 255));
            byte[] bArr6 = this.f45903f;
            long j18 = this.f45908k;
            this.f45908k = j18 - 1;
            K1.p(bArr6, j18, (byte) (((int) (j12 >> 16)) & 255));
            byte[] bArr7 = this.f45903f;
            long j19 = this.f45908k;
            this.f45908k = j19 - 1;
            K1.p(bArr7, j19, (byte) (((int) (j12 >> 8)) & 255));
            byte[] bArr8 = this.f45903f;
            long j22 = this.f45908k;
            this.f45908k = j22 - 1;
            K1.p(bArr8, j22, (byte) (((int) j12) & 255));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void o(int i12) {
            if (i12 >= 0) {
                t(i12);
            } else {
                u(i12);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void q(int i12) {
            t(CodedOutputStream.G(i12));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void r(long j12) {
            u(CodedOutputStream.H(j12));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void s(int i12, int i13) {
            t((i12 << 3) | i13);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void t(int i12) {
            if ((i12 & (-128)) == 0) {
                byte[] bArr = this.f45903f;
                long j12 = this.f45908k;
                this.f45908k = j12 - 1;
                K1.p(bArr, j12, (byte) i12);
                return;
            }
            if ((i12 & (-16384)) == 0) {
                byte[] bArr2 = this.f45903f;
                long j13 = this.f45908k;
                this.f45908k = j13 - 1;
                K1.p(bArr2, j13, (byte) (i12 >>> 7));
                byte[] bArr3 = this.f45903f;
                long j14 = this.f45908k;
                this.f45908k = j14 - 1;
                K1.p(bArr3, j14, (byte) ((i12 & 127) | 128));
                return;
            }
            if (((-2097152) & i12) == 0) {
                byte[] bArr4 = this.f45903f;
                long j15 = this.f45908k;
                this.f45908k = j15 - 1;
                K1.p(bArr4, j15, (byte) (i12 >>> 14));
                byte[] bArr5 = this.f45903f;
                long j16 = this.f45908k;
                this.f45908k = j16 - 1;
                K1.p(bArr5, j16, (byte) (((i12 >>> 7) & 127) | 128));
                byte[] bArr6 = this.f45903f;
                long j17 = this.f45908k;
                this.f45908k = j17 - 1;
                K1.p(bArr6, j17, (byte) ((i12 & 127) | 128));
                return;
            }
            if (((-268435456) & i12) == 0) {
                byte[] bArr7 = this.f45903f;
                long j18 = this.f45908k;
                this.f45908k = j18 - 1;
                K1.p(bArr7, j18, (byte) (i12 >>> 21));
                byte[] bArr8 = this.f45903f;
                long j19 = this.f45908k;
                this.f45908k = j19 - 1;
                K1.p(bArr8, j19, (byte) (((i12 >>> 14) & 127) | 128));
                byte[] bArr9 = this.f45903f;
                long j22 = this.f45908k;
                this.f45908k = j22 - 1;
                K1.p(bArr9, j22, (byte) (((i12 >>> 7) & 127) | 128));
                byte[] bArr10 = this.f45903f;
                long j23 = this.f45908k;
                this.f45908k = j23 - 1;
                K1.p(bArr10, j23, (byte) ((i12 & 127) | 128));
                return;
            }
            byte[] bArr11 = this.f45903f;
            long j24 = this.f45908k;
            this.f45908k = j24 - 1;
            K1.p(bArr11, j24, (byte) (i12 >>> 28));
            byte[] bArr12 = this.f45903f;
            long j25 = this.f45908k;
            this.f45908k = j25 - 1;
            K1.p(bArr12, j25, (byte) (((i12 >>> 21) & 127) | 128));
            byte[] bArr13 = this.f45903f;
            long j26 = this.f45908k;
            this.f45908k = j26 - 1;
            K1.p(bArr13, j26, (byte) (((i12 >>> 14) & 127) | 128));
            byte[] bArr14 = this.f45903f;
            long j27 = this.f45908k;
            this.f45908k = j27 - 1;
            K1.p(bArr14, j27, (byte) (((i12 >>> 7) & 127) | 128));
            byte[] bArr15 = this.f45903f;
            long j28 = this.f45908k;
            this.f45908k = j28 - 1;
            K1.p(bArr15, j28, (byte) ((i12 & 127) | 128));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC22921p
        public final void u(long j12) {
            switch (AbstractC22921p.i(j12)) {
                case 1:
                    byte[] bArr = this.f45903f;
                    long j13 = this.f45908k;
                    this.f45908k = j13 - 1;
                    K1.p(bArr, j13, (byte) j12);
                    break;
                case 2:
                    byte[] bArr2 = this.f45903f;
                    long j14 = this.f45908k;
                    this.f45908k = j14 - 1;
                    K1.p(bArr2, j14, (byte) (j12 >>> 7));
                    byte[] bArr3 = this.f45903f;
                    long j15 = this.f45908k;
                    this.f45908k = j15 - 1;
                    K1.p(bArr3, j15, (byte) ((((int) j12) & 127) | 128));
                    break;
                case 3:
                    byte[] bArr4 = this.f45903f;
                    long j16 = this.f45908k;
                    this.f45908k = j16 - 1;
                    K1.p(bArr4, j16, (byte) (((int) j12) >>> 14));
                    byte[] bArr5 = this.f45903f;
                    long j17 = this.f45908k;
                    this.f45908k = j17 - 1;
                    K1.p(bArr5, j17, (byte) (((j12 >>> 7) & 127) | 128));
                    byte[] bArr6 = this.f45903f;
                    long j18 = this.f45908k;
                    this.f45908k = j18 - 1;
                    K1.p(bArr6, j18, (byte) ((j12 & 127) | 128));
                    break;
                case 4:
                    byte[] bArr7 = this.f45903f;
                    long j19 = this.f45908k;
                    this.f45908k = j19 - 1;
                    K1.p(bArr7, j19, (byte) (j12 >>> 21));
                    byte[] bArr8 = this.f45903f;
                    long j22 = this.f45908k;
                    this.f45908k = j22 - 1;
                    K1.p(bArr8, j22, (byte) (((j12 >>> 14) & 127) | 128));
                    byte[] bArr9 = this.f45903f;
                    long j23 = this.f45908k;
                    this.f45908k = j23 - 1;
                    K1.p(bArr9, j23, (byte) (((j12 >>> 7) & 127) | 128));
                    byte[] bArr10 = this.f45903f;
                    long j24 = this.f45908k;
                    this.f45908k = j24 - 1;
                    K1.p(bArr10, j24, (byte) ((j12 & 127) | 128));
                    break;
                case 5:
                    byte[] bArr11 = this.f45903f;
                    long j25 = this.f45908k;
                    this.f45908k = j25 - 1;
                    K1.p(bArr11, j25, (byte) (j12 >>> 28));
                    byte[] bArr12 = this.f45903f;
                    long j26 = this.f45908k;
                    this.f45908k = j26 - 1;
                    K1.p(bArr12, j26, (byte) (((j12 >>> 21) & 127) | 128));
                    byte[] bArr13 = this.f45903f;
                    long j27 = this.f45908k;
                    this.f45908k = j27 - 1;
                    K1.p(bArr13, j27, (byte) (((j12 >>> 14) & 127) | 128));
                    byte[] bArr14 = this.f45903f;
                    long j28 = this.f45908k;
                    this.f45908k = j28 - 1;
                    K1.p(bArr14, j28, (byte) (((j12 >>> 7) & 127) | 128));
                    byte[] bArr15 = this.f45903f;
                    long j29 = this.f45908k;
                    this.f45908k = j29 - 1;
                    K1.p(bArr15, j29, (byte) ((j12 & 127) | 128));
                    break;
                case 6:
                    byte[] bArr16 = this.f45903f;
                    long j32 = this.f45908k;
                    this.f45908k = j32 - 1;
                    K1.p(bArr16, j32, (byte) (j12 >>> 35));
                    byte[] bArr17 = this.f45903f;
                    long j33 = this.f45908k;
                    this.f45908k = j33 - 1;
                    K1.p(bArr17, j33, (byte) (((j12 >>> 28) & 127) | 128));
                    byte[] bArr18 = this.f45903f;
                    long j34 = this.f45908k;
                    this.f45908k = j34 - 1;
                    K1.p(bArr18, j34, (byte) (((j12 >>> 21) & 127) | 128));
                    byte[] bArr19 = this.f45903f;
                    long j35 = this.f45908k;
                    this.f45908k = j35 - 1;
                    K1.p(bArr19, j35, (byte) (((j12 >>> 14) & 127) | 128));
                    byte[] bArr20 = this.f45903f;
                    long j36 = this.f45908k;
                    this.f45908k = j36 - 1;
                    K1.p(bArr20, j36, (byte) (((j12 >>> 7) & 127) | 128));
                    byte[] bArr21 = this.f45903f;
                    long j37 = this.f45908k;
                    this.f45908k = j37 - 1;
                    K1.p(bArr21, j37, (byte) ((j12 & 127) | 128));
                    break;
                case 7:
                    byte[] bArr22 = this.f45903f;
                    long j38 = this.f45908k;
                    this.f45908k = j38 - 1;
                    K1.p(bArr22, j38, (byte) (j12 >>> 42));
                    byte[] bArr23 = this.f45903f;
                    long j39 = this.f45908k;
                    this.f45908k = j39 - 1;
                    K1.p(bArr23, j39, (byte) (((j12 >>> 35) & 127) | 128));
                    byte[] bArr24 = this.f45903f;
                    long j42 = this.f45908k;
                    this.f45908k = j42 - 1;
                    K1.p(bArr24, j42, (byte) (((j12 >>> 28) & 127) | 128));
                    byte[] bArr25 = this.f45903f;
                    long j43 = this.f45908k;
                    this.f45908k = j43 - 1;
                    K1.p(bArr25, j43, (byte) (((j12 >>> 21) & 127) | 128));
                    byte[] bArr26 = this.f45903f;
                    long j44 = this.f45908k;
                    this.f45908k = j44 - 1;
                    K1.p(bArr26, j44, (byte) (((j12 >>> 14) & 127) | 128));
                    byte[] bArr27 = this.f45903f;
                    long j45 = this.f45908k;
                    this.f45908k = j45 - 1;
                    K1.p(bArr27, j45, (byte) (((j12 >>> 7) & 127) | 128));
                    byte[] bArr28 = this.f45903f;
                    long j46 = this.f45908k;
                    this.f45908k = j46 - 1;
                    K1.p(bArr28, j46, (byte) ((j12 & 127) | 128));
                    break;
                case 8:
                    byte[] bArr29 = this.f45903f;
                    long j47 = this.f45908k;
                    this.f45908k = j47 - 1;
                    K1.p(bArr29, j47, (byte) (j12 >>> 49));
                    byte[] bArr30 = this.f45903f;
                    long j48 = this.f45908k;
                    this.f45908k = j48 - 1;
                    K1.p(bArr30, j48, (byte) (((j12 >>> 42) & 127) | 128));
                    byte[] bArr31 = this.f45903f;
                    long j49 = this.f45908k;
                    this.f45908k = j49 - 1;
                    K1.p(bArr31, j49, (byte) (((j12 >>> 35) & 127) | 128));
                    byte[] bArr32 = this.f45903f;
                    long j52 = this.f45908k;
                    this.f45908k = j52 - 1;
                    K1.p(bArr32, j52, (byte) (((j12 >>> 28) & 127) | 128));
                    byte[] bArr33 = this.f45903f;
                    long j53 = this.f45908k;
                    this.f45908k = j53 - 1;
                    K1.p(bArr33, j53, (byte) (((j12 >>> 21) & 127) | 128));
                    byte[] bArr34 = this.f45903f;
                    long j54 = this.f45908k;
                    this.f45908k = j54 - 1;
                    K1.p(bArr34, j54, (byte) (((j12 >>> 14) & 127) | 128));
                    byte[] bArr35 = this.f45903f;
                    long j55 = this.f45908k;
                    this.f45908k = j55 - 1;
                    K1.p(bArr35, j55, (byte) (((j12 >>> 7) & 127) | 128));
                    byte[] bArr36 = this.f45903f;
                    long j56 = this.f45908k;
                    this.f45908k = j56 - 1;
                    K1.p(bArr36, j56, (byte) ((j12 & 127) | 128));
                    break;
                case 9:
                    byte[] bArr37 = this.f45903f;
                    long j57 = this.f45908k;
                    this.f45908k = j57 - 1;
                    K1.p(bArr37, j57, (byte) (j12 >>> 56));
                    byte[] bArr38 = this.f45903f;
                    long j58 = this.f45908k;
                    this.f45908k = j58 - 1;
                    K1.p(bArr38, j58, (byte) (((j12 >>> 49) & 127) | 128));
                    byte[] bArr39 = this.f45903f;
                    long j59 = this.f45908k;
                    this.f45908k = j59 - 1;
                    K1.p(bArr39, j59, (byte) (((j12 >>> 42) & 127) | 128));
                    byte[] bArr40 = this.f45903f;
                    long j62 = this.f45908k;
                    this.f45908k = j62 - 1;
                    K1.p(bArr40, j62, (byte) (((j12 >>> 35) & 127) | 128));
                    byte[] bArr41 = this.f45903f;
                    long j63 = this.f45908k;
                    this.f45908k = j63 - 1;
                    K1.p(bArr41, j63, (byte) (((j12 >>> 28) & 127) | 128));
                    byte[] bArr42 = this.f45903f;
                    long j64 = this.f45908k;
                    this.f45908k = j64 - 1;
                    K1.p(bArr42, j64, (byte) (((j12 >>> 21) & 127) | 128));
                    byte[] bArr43 = this.f45903f;
                    long j65 = this.f45908k;
                    this.f45908k = j65 - 1;
                    K1.p(bArr43, j65, (byte) (((j12 >>> 14) & 127) | 128));
                    byte[] bArr44 = this.f45903f;
                    long j66 = this.f45908k;
                    this.f45908k = j66 - 1;
                    K1.p(bArr44, j66, (byte) (((j12 >>> 7) & 127) | 128));
                    byte[] bArr45 = this.f45903f;
                    long j67 = this.f45908k;
                    this.f45908k = j67 - 1;
                    K1.p(bArr45, j67, (byte) ((j12 & 127) | 128));
                    break;
                case 10:
                    byte[] bArr46 = this.f45903f;
                    long j68 = this.f45908k;
                    this.f45908k = j68 - 1;
                    K1.p(bArr46, j68, (byte) (j12 >>> 63));
                    byte[] bArr47 = this.f45903f;
                    long j69 = this.f45908k;
                    this.f45908k = j69 - 1;
                    K1.p(bArr47, j69, (byte) (((j12 >>> 56) & 127) | 128));
                    byte[] bArr48 = this.f45903f;
                    long j72 = this.f45908k;
                    this.f45908k = j72 - 1;
                    K1.p(bArr48, j72, (byte) (((j12 >>> 49) & 127) | 128));
                    byte[] bArr49 = this.f45903f;
                    long j73 = this.f45908k;
                    this.f45908k = j73 - 1;
                    K1.p(bArr49, j73, (byte) (((j12 >>> 42) & 127) | 128));
                    byte[] bArr50 = this.f45903f;
                    long j74 = this.f45908k;
                    this.f45908k = j74 - 1;
                    K1.p(bArr50, j74, (byte) (((j12 >>> 35) & 127) | 128));
                    byte[] bArr51 = this.f45903f;
                    long j75 = this.f45908k;
                    this.f45908k = j75 - 1;
                    K1.p(bArr51, j75, (byte) (((j12 >>> 28) & 127) | 128));
                    byte[] bArr52 = this.f45903f;
                    long j76 = this.f45908k;
                    this.f45908k = j76 - 1;
                    K1.p(bArr52, j76, (byte) (((j12 >>> 21) & 127) | 128));
                    byte[] bArr53 = this.f45903f;
                    long j77 = this.f45908k;
                    this.f45908k = j77 - 1;
                    K1.p(bArr53, j77, (byte) (((j12 >>> 14) & 127) | 128));
                    byte[] bArr54 = this.f45903f;
                    long j78 = this.f45908k;
                    this.f45908k = j78 - 1;
                    K1.p(bArr54, j78, (byte) (((j12 >>> 7) & 127) | 128));
                    byte[] bArr55 = this.f45903f;
                    long j79 = this.f45908k;
                    this.f45908k = j79 - 1;
                    K1.p(bArr55, j79, (byte) ((j12 & 127) | 128));
                    break;
            }
        }

        public final void v(AbstractC22892f abstractC22892f) {
            if (!abstractC22892f.c()) {
                throw new RuntimeException("Allocator returned non-heap buffer");
            }
            AbstractC22892f abstractC22892f2 = this.f45902e;
            if (abstractC22892f2 != null) {
                int i12 = this.f45886d;
                long j12 = this.f45907j;
                long j13 = this.f45908k;
                this.f45886d = i12 + ((int) (j12 - j13));
                abstractC22892f2.h((((int) j13) - abstractC22892f2.b()) + 1);
                this.f45902e = null;
                this.f45908k = 0L;
                this.f45907j = 0L;
            }
            this.f45885c.addFirst(abstractC22892f);
            this.f45902e = abstractC22892f;
            this.f45903f = abstractC22892f.a();
            int iB2 = abstractC22892f.b();
            this.f45905h = abstractC22892f.e() + iB2;
            long jG2 = iB2 + abstractC22892f.g();
            this.f45904g = jG2;
            this.f45906i = jG2 - 1;
            long j14 = this.f45905h - 1;
            this.f45907j = j14;
            this.f45908k = j14;
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeBool(int i12, boolean z12) {
            k(6);
            byte b12 = z12 ? (byte) 1 : (byte) 0;
            byte[] bArr = this.f45903f;
            long j12 = this.f45908k;
            this.f45908k = j12 - 1;
            K1.p(bArr, j12, b12);
            s(i12, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeEndGroup(int i12) {
            s(i12, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeFixed32(int i12, int i13) {
            k(9);
            m(i13);
            s(i12, 5);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeFixed64(int i12, long j12) {
            k(13);
            n(j12);
            s(i12, 1);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeInt32(int i12, int i13) {
            k(15);
            o(i13);
            s(i12, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeMessage(int i12, Object obj) {
            int iJ2 = j();
            Z0 z02 = Z0.f45797c;
            z02.getClass();
            z02.a(obj.getClass()).c(obj, this);
            int iJ3 = j() - iJ2;
            k(10);
            t(iJ3);
            s(i12, 2);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeSInt32(int i12, int i13) {
            k(10);
            q(i13);
            s(i12, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeSInt64(int i12, long j12) {
            k(15);
            r(j12);
            s(i12, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeStartGroup(int i12) {
            s(i12, 3);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
        @Override // androidx.datastore.preferences.protobuf.Writer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void writeString(int r14, java.lang.String r15) {
            /*
                Method dump skipped, instructions count: 317
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.AbstractC22921p.e.writeString(int, java.lang.String):void");
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeUInt32(int i12, int i13) {
            k(10);
            t(i13);
            s(i12, 0);
        }

        @Override // androidx.datastore.preferences.protobuf.Writer
        public final void writeUInt64(int i12, long j12) {
            k(15);
            u(j12);
            s(i12, 0);
        }
    }

    public AbstractC22921p(AbstractC22928t abstractC22928t, int i12, a aVar) {
        if (i12 <= 0) {
            throw new IllegalArgumentException("chunkSize must be > 0");
        }
        C22914m0.a(abstractC22928t, "alloc");
        this.f45883a = abstractC22928t;
        this.f45884b = i12;
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

    public static final void p(AbstractC22921p abstractC22921p, int i12, WireFormat.FieldType fieldType, Object obj) {
        switch (a.f45887a[fieldType.ordinal()]) {
            case 1:
                abstractC22921p.writeBool(i12, ((Boolean) obj).booleanValue());
                return;
            case 2:
                abstractC22921p.writeFixed32(i12, ((Integer) obj).intValue());
                return;
            case 3:
                abstractC22921p.writeFixed64(i12, ((Long) obj).longValue());
                return;
            case 4:
                abstractC22921p.writeInt32(i12, ((Integer) obj).intValue());
                return;
            case 5:
                abstractC22921p.writeUInt64(i12, ((Long) obj).longValue());
                return;
            case 6:
                abstractC22921p.writeFixed32(i12, ((Integer) obj).intValue());
                return;
            case 7:
                abstractC22921p.writeFixed64(i12, ((Long) obj).longValue());
                return;
            case 8:
                abstractC22921p.writeSInt32(i12, ((Integer) obj).intValue());
                return;
            case 9:
                abstractC22921p.writeSInt64(i12, ((Long) obj).longValue());
                return;
            case 10:
                abstractC22921p.writeString(i12, (String) obj);
                return;
            case 11:
                abstractC22921p.writeUInt32(i12, ((Integer) obj).intValue());
                return;
            case 12:
                abstractC22921p.writeUInt64(i12, ((Long) obj).longValue());
                return;
            case 13:
                abstractC22921p.writeFloat(i12, ((Float) obj).floatValue());
                return;
            case 14:
                abstractC22921p.writeDouble(i12, ((Double) obj).doubleValue());
                return;
            case 15:
                abstractC22921p.writeMessage(i12, obj);
                return;
            case 16:
                abstractC22921p.b(i12, (AbstractC22934w) obj);
                return;
            case 17:
                if (obj instanceof C22914m0.c) {
                    abstractC22921p.writeInt32(i12, ((C22914m0.c) obj).getNumber());
                    return;
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Unexpected type for enum in map.");
                    }
                    abstractC22921p.writeInt32(i12, ((Integer) obj).intValue());
                    return;
                }
            default:
                throw new IllegalArgumentException("Unsupported map value type for: " + fieldType);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final <K, V> void c(int i12, C22939y0.b<K, V> bVar, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int iJ2 = j();
            p(this, 2, bVar.f45946b, entry.getValue());
            p(this, 1, bVar.f45945a, entry.getKey());
            t(j() - iJ2);
            s(i12, 2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void d(int i12, List<?> list, InterfaceC22897g1 interfaceC22897g1) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e(i12, list.get(size), interfaceC22897g1);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void f(int i12, List<?> list, InterfaceC22897g1 interfaceC22897g1) {
        for (int size = list.size() - 1; size >= 0; size--) {
            a(i12, list.get(size), interfaceC22897g1);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final Writer.FieldOrder fieldOrder() {
        return Writer.FieldOrder.f45793c;
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

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeBoolList(int i12, List<Boolean> list, boolean z12) {
        if (!(list instanceof C22926s)) {
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
        C22926s c22926s = (C22926s) list;
        if (!z12) {
            for (int i13 = c22926s.f45919d - 1; i13 >= 0; i13--) {
                c22926s.d(i13);
                writeBool(i12, c22926s.f45918c[i13]);
            }
            return;
        }
        k(c22926s.f45919d + 10);
        int iJ3 = j();
        for (int i14 = c22926s.f45919d - 1; i14 >= 0; i14--) {
            c22926s.d(i14);
            l(c22926s.f45918c[i14]);
        }
        t(j() - iJ3);
        s(i12, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeBytesList(int i12, List<AbstractC22934w> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            b(i12, list.get(size));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeDouble(int i12, double d12) {
        writeFixed64(i12, Double.doubleToRawLongBits(d12));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeDoubleList(int i12, List<Double> list, boolean z12) {
        if (!(list instanceof C)) {
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
        C c12 = (C) list;
        if (!z12) {
            for (int i13 = c12.f45594d - 1; i13 >= 0; i13--) {
                c12.d(i13);
                writeDouble(i12, c12.f45593c[i13]);
            }
            return;
        }
        k((c12.f45594d * 8) + 10);
        int iJ3 = j();
        for (int i14 = c12.f45594d - 1; i14 >= 0; i14--) {
            c12.d(i14);
            n(Double.doubleToRawLongBits(c12.f45593c[i14]));
        }
        t(j() - iJ3);
        s(i12, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeEnum(int i12, int i13) {
        writeInt32(i12, i13);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeEnumList(int i12, List<Integer> list, boolean z12) {
        writeInt32List(i12, list, z12);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed32List(int i12, List<Integer> list, boolean z12) {
        if (!(list instanceof C22911l0)) {
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
        C22911l0 c22911l0 = (C22911l0) list;
        if (!z12) {
            for (int i13 = c22911l0.f45872d - 1; i13 >= 0; i13--) {
                writeFixed32(i12, c22911l0.getInt(i13));
            }
            return;
        }
        k((c22911l0.f45872d * 4) + 10);
        int iJ3 = j();
        for (int i14 = c22911l0.f45872d - 1; i14 >= 0; i14--) {
            m(c22911l0.getInt(i14));
        }
        t(j() - iJ3);
        s(i12, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFixed64List(int i12, List<Long> list, boolean z12) {
        if (!(list instanceof C22935w0)) {
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
        C22935w0 c22935w0 = (C22935w0) list;
        if (!z12) {
            for (int i13 = c22935w0.f45937d - 1; i13 >= 0; i13--) {
                writeFixed64(i12, c22935w0.getLong(i13));
            }
            return;
        }
        k((c22935w0.f45937d * 8) + 10);
        int iJ3 = j();
        for (int i14 = c22935w0.f45937d - 1; i14 >= 0; i14--) {
            n(c22935w0.getLong(i14));
        }
        t(j() - iJ3);
        s(i12, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFloat(int i12, float f12) {
        writeFixed32(i12, Float.floatToRawIntBits(f12));
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeFloatList(int i12, List<Float> list, boolean z12) {
        if (!(list instanceof C22887d0)) {
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
        C22887d0 c22887d0 = (C22887d0) list;
        if (!z12) {
            for (int i13 = c22887d0.f45813d - 1; i13 >= 0; i13--) {
                c22887d0.d(i13);
                writeFloat(i12, c22887d0.f45812c[i13]);
            }
            return;
        }
        k((c22887d0.f45813d * 4) + 10);
        int iJ3 = j();
        for (int i14 = c22887d0.f45813d - 1; i14 >= 0; i14--) {
            c22887d0.d(i14);
            m(Float.floatToRawIntBits(c22887d0.f45812c[i14]));
        }
        t(j() - iJ3);
        s(i12, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt32List(int i12, List<Integer> list, boolean z12) {
        if (!(list instanceof C22911l0)) {
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
        C22911l0 c22911l0 = (C22911l0) list;
        if (!z12) {
            for (int i13 = c22911l0.f45872d - 1; i13 >= 0; i13--) {
                writeInt32(i12, c22911l0.getInt(i13));
            }
            return;
        }
        k((c22911l0.f45872d * 10) + 10);
        int iJ3 = j();
        for (int i14 = c22911l0.f45872d - 1; i14 >= 0; i14--) {
            o(c22911l0.getInt(i14));
        }
        t(j() - iJ3);
        s(i12, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt64(int i12, long j12) {
        writeUInt64(i12, j12);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeInt64List(int i12, List<Long> list, boolean z12) {
        writeUInt64List(i12, list, z12);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeMessageSetItem(int i12, Object obj) {
        s(1, 4);
        if (obj instanceof AbstractC22934w) {
            b(3, (AbstractC22934w) obj);
        } else {
            writeMessage(3, obj);
        }
        writeUInt32(2, i12);
        s(1, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed32(int i12, int i13) {
        writeFixed32(i12, i13);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed32List(int i12, List<Integer> list, boolean z12) {
        writeFixed32List(i12, list, z12);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed64(int i12, long j12) {
        writeFixed64(i12, j12);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSFixed64List(int i12, List<Long> list, boolean z12) {
        writeFixed64List(i12, list, z12);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt32List(int i12, List<Integer> list, boolean z12) {
        if (!(list instanceof C22911l0)) {
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
        C22911l0 c22911l0 = (C22911l0) list;
        if (!z12) {
            for (int i13 = c22911l0.f45872d - 1; i13 >= 0; i13--) {
                writeSInt32(i12, c22911l0.getInt(i13));
            }
            return;
        }
        k((c22911l0.f45872d * 5) + 10);
        int iJ3 = j();
        for (int i14 = c22911l0.f45872d - 1; i14 >= 0; i14--) {
            q(c22911l0.getInt(i14));
        }
        t(j() - iJ3);
        s(i12, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeSInt64List(int i12, List<Long> list, boolean z12) {
        if (!(list instanceof C22935w0)) {
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
        C22935w0 c22935w0 = (C22935w0) list;
        if (!z12) {
            for (int i13 = c22935w0.f45937d - 1; i13 >= 0; i13--) {
                writeSInt64(i12, c22935w0.getLong(i13));
            }
            return;
        }
        k((c22935w0.f45937d * 10) + 10);
        int iJ3 = j();
        for (int i14 = c22935w0.f45937d - 1; i14 >= 0; i14--) {
            r(c22935w0.getLong(i14));
        }
        t(j() - iJ3);
        s(i12, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeStringList(int i12, List<String> list) {
        if (!(list instanceof InterfaceC22927s0)) {
            for (int size = list.size() - 1; size >= 0; size--) {
                writeString(i12, list.get(size));
            }
            return;
        }
        InterfaceC22927s0 interfaceC22927s0 = (InterfaceC22927s0) list;
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Object raw = interfaceC22927s0.getRaw(size2);
            if (raw instanceof String) {
                writeString(i12, (String) raw);
            } else {
                b(i12, (AbstractC22934w) raw);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt32List(int i12, List<Integer> list, boolean z12) {
        if (!(list instanceof C22911l0)) {
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
        C22911l0 c22911l0 = (C22911l0) list;
        if (!z12) {
            for (int i13 = c22911l0.f45872d - 1; i13 >= 0; i13--) {
                writeUInt32(i12, c22911l0.getInt(i13));
            }
            return;
        }
        k((c22911l0.f45872d * 5) + 10);
        int iJ3 = j();
        for (int i14 = c22911l0.f45872d - 1; i14 >= 0; i14--) {
            t(c22911l0.getInt(i14));
        }
        t(j() - iJ3);
        s(i12, 2);
    }

    @Override // androidx.datastore.preferences.protobuf.Writer
    public final void writeUInt64List(int i12, List<Long> list, boolean z12) {
        if (!(list instanceof C22935w0)) {
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
        C22935w0 c22935w0 = (C22935w0) list;
        if (!z12) {
            for (int i13 = c22935w0.f45937d - 1; i13 >= 0; i13--) {
                writeUInt64(i12, c22935w0.getLong(i13));
            }
            return;
        }
        k((c22935w0.f45937d * 10) + 10);
        int iJ3 = j();
        for (int i14 = c22935w0.f45937d - 1; i14 >= 0; i14--) {
            u(c22935w0.getLong(i14));
        }
        t(j() - iJ3);
        s(i12, 2);
    }
}
