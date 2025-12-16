package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.msgpack.core.MessageInsufficientBufferException;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.MessageNeverUsedFormatException;
import org.msgpack.core.MessagePackException;
import org.msgpack.core.MessageSizeException;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.core.MessageTypeException;
import org.msgpack.core.buffer.ArrayBufferInput;
import org.msgpack.core.buffer.MessageBuffer;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class tm9 implements Closeable {
    public static final MessageBuffer y0 = MessageBuffer.wrap(new byte[0]);
    public final int X;
    public final ArrayBufferInput Y;
    public final boolean a;
    public final boolean b;
    public final CodingErrorAction c;
    public final CodingErrorAction d;
    public final int o;
    public int s0;
    public int u0;
    public StringBuilder v0;
    public CharsetDecoder w0;
    public CharBuffer x0;
    public MessageBuffer Z = y0;
    public final MessageBuffer t0 = MessageBuffer.allocate(8);

    public tm9(ArrayBufferInput arrayBufferInput, jl9 jl9Var) {
        this.Y = arrayBufferInput;
        jl9Var.getClass();
        this.a = true;
        this.b = true;
        this.c = jl9Var.a;
        this.d = jl9Var.b;
        this.o = jl9Var.c;
        this.X = jl9Var.o;
    }

    public static MessageIntegerOverflowException Q(int i) {
        return new MessageIntegerOverflowException(BigInteger.valueOf((i & Integer.MAX_VALUE) + 2147483648L));
    }

    public static MessageIntegerOverflowException Z(long j) {
        return new MessageIntegerOverflowException(BigInteger.valueOf(j - Long.MIN_VALUE).setBit(63));
    }

    public static MessagePackException m0(byte b, String str) {
        qj9 qj9Var = qj9.V0[b & 255];
        if (qj9Var == qj9.NEVER_USED) {
            return new MessageNeverUsedFormatException(ho7.i("Expected ", str, ", but encountered 0xC1 \"NEVER_USED\" byte"));
        }
        String strW = xrf.w(qj9Var.a());
        return new MessageTypeException(String.format("Expected %s, but got %s (%02x)", str, strW.substring(0, 1) + strW.substring(1).toLowerCase(), Byte.valueOf(b)));
    }

    public final void P() throws IOException {
        MessageBuffer next = this.Y.next();
        if (next == null) {
            throw new MessageInsufficientBufferException();
        }
        this.Z.size();
        this.Z = next;
        this.s0 = 0;
    }

    public final String c(int i) throws CharacterCodingException {
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        if (this.c == codingErrorAction && this.d == codingErrorAction && this.Z.hasArray()) {
            String str = new String(this.Z.array(), this.Z.arrayOffset() + this.s0, i, kl9.a);
            this.s0 += i;
            return str;
        }
        try {
            CharBuffer charBufferDecode = this.w0.decode(this.Z.sliceAsByteBuffer(this.s0, i));
            this.s0 += i;
            return charBufferDecode.toString();
        } catch (CharacterCodingException e) {
            throw new MessageStringCodingException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.Z = y0;
        this.s0 = 0;
        this.Y.close();
    }

    public final MessageBuffer h0(int i) throws IOException {
        int size = this.Z.size();
        int i2 = this.s0;
        int i3 = size - i2;
        if (i3 >= i) {
            this.u0 = i2;
            this.s0 = i2 + i;
            return this.Z;
        }
        MessageBuffer messageBuffer = this.t0;
        if (i3 > 0) {
            messageBuffer.putMessageBuffer(0, this.Z, i2, i3);
            i -= i3;
        } else {
            i3 = 0;
        }
        while (true) {
            P();
            int size2 = this.Z.size();
            if (size2 >= i) {
                messageBuffer.putMessageBuffer(i3, this.Z, 0, i);
                this.s0 = i;
                this.u0 = 0;
                return messageBuffer;
            }
            messageBuffer.putMessageBuffer(i3, this.Z, 0, size2);
            i -= size2;
            i3 += size2;
        }
    }

    public final int i0() {
        return readShort() & 65535;
    }

    public final int j0() {
        int i = readInt();
        if (i >= 0) {
            return i;
        }
        throw new MessageSizeException();
    }

    public final byte[] k0(int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            int size = this.Z.size();
            int i3 = this.s0;
            int i4 = size - i3;
            if (i4 >= i) {
                this.Z.getBytes(i3, bArr, i2, i);
                this.s0 += i;
                return bArr;
            }
            this.Z.getBytes(i3, bArr, i2, i4);
            i2 += i4;
            i -= i4;
            this.s0 += i4;
            P();
        }
    }

    public final boolean l() {
        while (this.Z.size() <= this.s0) {
            MessageBuffer next = this.Y.next();
            if (next == null) {
                return false;
            }
            this.Z.size();
            this.Z = next;
            this.s0 = 0;
        }
        return true;
    }

    public final void l0(int i) throws IOException {
        while (true) {
            int size = this.Z.size();
            int i2 = this.s0;
            int i3 = size - i2;
            if (i3 >= i) {
                this.s0 = i2 + i;
                return;
            } else {
                this.s0 = i2 + i3;
                i -= i3;
                P();
            }
        }
    }

    public final int n0() {
        byte b = readByte();
        if ((b & (-16)) == -112) {
            return b & 15;
        }
        if (b == -36) {
            return i0();
        }
        if (b == -35) {
            return j0();
        }
        throw m0(b, "Array");
    }

    public final int o0() throws IOException {
        int iI0;
        byte b = readByte();
        if ((b & (-32)) == -96) {
            return b & 31;
        }
        int iI02 = -1;
        switch (b) {
            case -60:
                iI0 = readByte() & 255;
                break;
            case -59:
                iI0 = i0();
                break;
            case -58:
                iI0 = j0();
                break;
            default:
                iI0 = -1;
                break;
        }
        if (iI0 >= 0) {
            return iI0;
        }
        if (this.a) {
            switch (b) {
                case -39:
                    iI02 = readByte() & 255;
                    break;
                case -38:
                    iI02 = i0();
                    break;
                case -37:
                    iI02 = j0();
                    break;
            }
            if (iI02 >= 0) {
                return iI02;
            }
        }
        throw m0(b, "Binary");
    }

    public final boolean p0() throws IOException {
        byte b = readByte();
        if (b == -62) {
            return false;
        }
        if (b == -61) {
            return true;
        }
        throw m0(b, "boolean");
    }

    public final byte q0() throws IOException {
        long j;
        byte b = readByte();
        if (uvi.a(b)) {
            return b;
        }
        switch (b) {
            case -52:
                byte b2 = readByte();
                if (b2 >= 0) {
                    return b2;
                }
                throw new MessageIntegerOverflowException(BigInteger.valueOf(b2 & 255));
            case -51:
                short s = readShort();
                if (s < 0 || s > 127) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(s & 65535));
                }
                return (byte) s;
            case -50:
                int i = readInt();
                if (i < 0 || i > 127) {
                    throw Q(i);
                }
                return (byte) i;
            case -49:
                j = readLong();
                if (j < 0 || j > 127) {
                    throw Z(j);
                }
                break;
            case -48:
                return readByte();
            case -47:
                short s2 = readShort();
                if (s2 < -128 || s2 > 127) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(s2));
                }
                return (byte) s2;
            case -46:
                int i2 = readInt();
                if (i2 < -128 || i2 > 127) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(i2));
                }
                return (byte) i2;
            case -45:
                j = readLong();
                if (j < -128 || j > 127) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(j));
                }
                break;
            default:
                throw m0(b, "Integer");
        }
        return (byte) j;
    }

    public final float r0() throws IOException {
        byte b = readByte();
        if (b == -54) {
            return h0(4).getFloat(this.u0);
        }
        if (b == -53) {
            return (float) h0(8).getDouble(this.u0);
        }
        throw m0(b, "Float");
    }

    public final byte readByte() throws IOException {
        int size = this.Z.size();
        int i = this.s0;
        if (size > i) {
            byte b = this.Z.getByte(i);
            this.s0++;
            return b;
        }
        P();
        if (this.Z.size() <= 0) {
            return readByte();
        }
        byte b2 = this.Z.getByte(0);
        this.s0 = 1;
        return b2;
    }

    public final int readInt() {
        return h0(4).getInt(this.u0);
    }

    public final long readLong() {
        return h0(8).getLong(this.u0);
    }

    public final short readShort() {
        return h0(2).getShort(this.u0);
    }

    public final int s0() throws IOException {
        byte b = readByte();
        if (uvi.a(b)) {
            return b;
        }
        switch (b) {
            case -52:
                return readByte() & 255;
            case -51:
                return readShort() & 65535;
            case -50:
                int i = readInt();
                if (i >= 0) {
                    return i;
                }
                throw Q(i);
            case -49:
                long j = readLong();
                if (j < 0 || j > 2147483647L) {
                    throw Z(j);
                }
                return (int) j;
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                long j2 = readLong();
                if (j2 < -2147483648L || j2 > 2147483647L) {
                    throw new MessageIntegerOverflowException(BigInteger.valueOf(j2));
                }
                return (int) j2;
            default:
                throw m0(b, "Integer");
        }
    }

    public final long t0() throws IOException {
        byte b = readByte();
        if (uvi.a(b)) {
            return b;
        }
        switch (b) {
            case -52:
                return readByte() & 255;
            case -51:
                return readShort() & 65535;
            case -50:
                int i = readInt();
                return i < 0 ? (i & Integer.MAX_VALUE) + 2147483648L : i;
            case -49:
                long j = readLong();
                if (j >= 0) {
                    return j;
                }
                throw Z(j);
            case -48:
                return readByte();
            case -47:
                return readShort();
            case -46:
                return readInt();
            case -45:
                return readLong();
            default:
                throw m0(b, "Integer");
        }
    }

    public final int u0() {
        byte b = readByte();
        if ((b & (-16)) == -128) {
            return b & 15;
        }
        if (b == -34) {
            return i0();
        }
        if (b == -33) {
            return j0();
        }
        throw m0(b, "Map");
    }

    public final void v() {
        int iI0;
        int iI02;
        int i = 1;
        while (i > 0) {
            byte b = readByte();
            switch (qj9.V0[b & 255].ordinal()) {
                case 1:
                    iI0 = b & 15;
                    iI02 = iI0 * 2;
                    i += iI02;
                    i--;
                case 2:
                    i += b & 15;
                    i--;
                case 3:
                    l0(b & 31);
                    i--;
                case 4:
                case 6:
                default:
                    i--;
                case 5:
                    throw new MessageNeverUsedFormatException("Encountered 0xC1 \"NEVER_USED\" byte");
                case 7:
                case 28:
                    l0(readByte() & 255);
                    i--;
                case 8:
                case 29:
                    l0(i0());
                    i--;
                case 9:
                case 30:
                    l0(j0());
                    i--;
                case 10:
                    l0((readByte() & 255) + 1);
                    i--;
                case 11:
                    l0(i0() + 1);
                    i--;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    l0(j0() + 1);
                    i--;
                case 13:
                case LangUtils.HASH_SEED /* 17 */:
                case 21:
                    l0(4);
                    i--;
                case Protos.Attaches.Attach.LOCATION /* 14 */:
                case 18:
                case 22:
                    l0(8);
                    i--;
                case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                case 19:
                    l0(1);
                    i--;
                case 16:
                case 20:
                    l0(2);
                    i--;
                case 23:
                    l0(2);
                    i--;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                    l0(3);
                    i--;
                case 25:
                    l0(5);
                    i--;
                case 26:
                    l0(9);
                    i--;
                case 27:
                    l0(17);
                    i--;
                case 31:
                    iI02 = i0();
                    i += iI02;
                    i--;
                case 32:
                    iI02 = j0();
                    i += iI02;
                    i--;
                case 33:
                    iI0 = i0();
                    iI02 = iI0 * 2;
                    i += iI02;
                    i--;
                case 34:
                    iI0 = j0();
                    iI02 = iI0 * 2;
                    i += iI02;
                    i--;
            }
        }
    }

    public final int v0() throws IOException {
        int iI0;
        byte b = readByte();
        if ((b & (-32)) == -96) {
            return b & 31;
        }
        int iI02 = -1;
        switch (b) {
            case -39:
                iI0 = readByte() & 255;
                break;
            case -38:
                iI0 = i0();
                break;
            case -37:
                iI0 = j0();
                break;
            default:
                iI0 = -1;
                break;
        }
        if (iI0 >= 0) {
            return iI0;
        }
        if (this.b) {
            switch (b) {
                case -60:
                    iI02 = readByte() & 255;
                    break;
                case -59:
                    iI02 = i0();
                    break;
                case -58:
                    iI02 = j0();
                    break;
            }
            if (iI02 >= 0) {
                return iI02;
            }
        }
        throw m0(b, "String");
    }

    public final qj9 w() {
        if (!l()) {
            throw new MessageInsufficientBufferException();
        }
        return qj9.V0[this.Z.getByte(this.s0) & 255];
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0154, code lost:
    
        return r8.v0.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String w0() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm9.w0():java.lang.String");
    }

    public final a2 x0() throws IOException {
        BigInteger bigIntegerValueOf;
        double d;
        sn5 sn5Var;
        sn5 sn5Var2;
        qj9 qj9VarW = w();
        int i = 0;
        switch (az1.v(qj9VarW.a())) {
            case 0:
                readByte();
                return eh7.a;
            case 1:
                return p0() ? kg7.b : kg7.c;
            case 2:
                if (qj9VarW != qj9.UINT64) {
                    return new yg7(t0());
                }
                byte b = readByte();
                if (uvi.a(b)) {
                    bigIntegerValueOf = BigInteger.valueOf(b);
                } else {
                    switch (b) {
                        case -52:
                            bigIntegerValueOf = BigInteger.valueOf(readByte() & 255);
                            break;
                        case -51:
                            bigIntegerValueOf = BigInteger.valueOf(readShort() & 65535);
                            break;
                        case -50:
                            int i2 = readInt();
                            if (i2 >= 0) {
                                bigIntegerValueOf = BigInteger.valueOf(i2);
                                break;
                            } else {
                                bigIntegerValueOf = BigInteger.valueOf((i2 & Integer.MAX_VALUE) + 2147483648L);
                                break;
                            }
                        case -49:
                            long j = readLong();
                            if (j >= 0) {
                                bigIntegerValueOf = BigInteger.valueOf(j);
                                break;
                            } else {
                                bigIntegerValueOf = BigInteger.valueOf(j - Long.MIN_VALUE).setBit(63);
                                break;
                            }
                        case -48:
                            bigIntegerValueOf = BigInteger.valueOf(readByte());
                            break;
                        case -47:
                            bigIntegerValueOf = BigInteger.valueOf(readShort());
                            break;
                        case -46:
                            bigIntegerValueOf = BigInteger.valueOf(readInt());
                            break;
                        case -45:
                            bigIntegerValueOf = BigInteger.valueOf(readLong());
                            break;
                        default:
                            throw m0(b, "Integer");
                    }
                }
                return new hg7(bigIntegerValueOf);
            case 3:
                byte b2 = readByte();
                if (b2 == -54) {
                    d = h0(4).getFloat(this.u0);
                } else {
                    if (b2 != -53) {
                        throw m0(b2, "Float");
                    }
                    d = h0(8).getDouble(this.u0);
                }
                return new og7(d);
            case 4:
                return new kh7(k0(v0()));
            case 5:
                return new jg7(k0(o0()));
            case 6:
                int iN0 = n0();
                lyg[] lygVarArr = new lyg[iN0];
                while (i < iN0) {
                    lygVarArr[i] = x0();
                    i++;
                }
                return iN0 == 0 ? eg7.b : new eg7(lygVarArr);
            case 7:
                int iU0 = u0() * 2;
                lyg[] lygVarArr2 = new lyg[iU0];
                while (i < iU0) {
                    lygVarArr2[i] = x0();
                    lygVarArr2[i + 1] = x0();
                    i += 2;
                }
                return iU0 == 0 ? dh7.b : new dh7(lygVarArr2);
            case 8:
                byte b3 = readByte();
                switch (b3) {
                    case -57:
                        MessageBuffer messageBufferH0 = h0(2);
                        sn5Var = new sn5(messageBufferH0.getByte(this.u0) & 255, messageBufferH0.getByte(this.u0 + 1));
                        return new qg7(sn5Var.a, k0(sn5Var.b));
                    case -56:
                        MessageBuffer messageBufferH02 = h0(3);
                        sn5Var2 = new sn5(messageBufferH02.getShort(this.u0) & 65535, messageBufferH02.getByte(this.u0 + 2));
                        sn5Var = sn5Var2;
                        return new qg7(sn5Var.a, k0(sn5Var.b));
                    case -55:
                        MessageBuffer messageBufferH03 = h0(5);
                        int i3 = messageBufferH03.getInt(this.u0);
                        if (i3 < 0) {
                            throw new MessageSizeException();
                        }
                        sn5Var2 = new sn5(i3, messageBufferH03.getByte(this.u0 + 4));
                        sn5Var = sn5Var2;
                        return new qg7(sn5Var.a, k0(sn5Var.b));
                    default:
                        switch (b3) {
                            case -44:
                                sn5Var2 = new sn5(1, readByte());
                                sn5Var = sn5Var2;
                                return new qg7(sn5Var.a, k0(sn5Var.b));
                            case -43:
                                sn5Var = new sn5(2, readByte());
                                return new qg7(sn5Var.a, k0(sn5Var.b));
                            case -42:
                                sn5Var = new sn5(4, readByte());
                                return new qg7(sn5Var.a, k0(sn5Var.b));
                            case -41:
                                sn5Var = new sn5(8, readByte());
                                return new qg7(sn5Var.a, k0(sn5Var.b));
                            case -40:
                                sn5Var = new sn5(16, readByte());
                                return new qg7(sn5Var.a, k0(sn5Var.b));
                            default:
                                throw m0(b3, "Ext");
                        }
                }
            default:
                throw new MessageNeverUsedFormatException("Unknown value type");
        }
    }

    public final void y(CoderResult coderResult) throws CharacterCodingException {
        if ((coderResult.isMalformed() && this.c == CodingErrorAction.REPORT) || (coderResult.isUnmappable() && this.d == CodingErrorAction.REPORT)) {
            coderResult.throwException();
        }
    }
}
