package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.msgpack.core.MessageStringCodingException;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.OutputStreamBufferOutput;

/* loaded from: classes2.dex */
public final class ll9 implements Closeable, Flushable {
    public static final boolean Z;
    public int X;
    public CharsetEncoder Y;
    public final int a;
    public final int b;
    public final boolean c;
    public final OutputStreamBufferOutput d;
    public MessageBuffer o;

    static {
        boolean z = false;
        try {
            Class<?> cls = Class.forName("android.os.Build$VERSION");
            int i = cls.getField("SDK_INT").getInt(cls.getConstructor(null).newInstance(null));
            if (i >= 14 && i < 21) {
                z = true;
            }
        } catch (ClassNotFoundException unused) {
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e2) {
            e2.printStackTrace();
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
        }
        Z = z;
    }

    public ll9(OutputStreamBufferOutput outputStreamBufferOutput, il9 il9Var) {
        this.d = outputStreamBufferOutput;
        il9Var.getClass();
        this.a = 512;
        this.b = 8192;
        this.c = true;
        this.X = 0;
    }

    public final void P(int i) {
        if (i < 32) {
            h0((byte) (i | (-96)));
            return;
        }
        if (this.c && i < 256) {
            i0((byte) -39, (byte) i);
        } else if (i < 65536) {
            l0((byte) -38, (short) i);
        } else {
            j0(i, (byte) -37);
        }
    }

    public final void Q(String str) {
        if (str.length() <= 0) {
            P(0);
            return;
        }
        if (Z || str.length() < this.a) {
            Z(str);
            return;
        }
        if (str.length() < 256) {
            d((str.length() * 6) + 3);
            int iC = c(this.X + 2, str);
            if (iC >= 0) {
                if (this.c && iC < 256) {
                    MessageBuffer messageBuffer = this.o;
                    int i = this.X;
                    this.X = i + 1;
                    messageBuffer.putByte(i, (byte) -39);
                    MessageBuffer messageBuffer2 = this.o;
                    int i2 = this.X;
                    this.X = i2 + 1;
                    messageBuffer2.putByte(i2, (byte) iC);
                    this.X += iC;
                    return;
                }
                if (iC >= 65536) {
                    throw new IllegalArgumentException("Unexpected UTF-8 encoder state");
                }
                MessageBuffer messageBuffer3 = this.o;
                int i3 = this.X;
                messageBuffer3.putMessageBuffer(i3 + 3, messageBuffer3, i3 + 2, iC);
                MessageBuffer messageBuffer4 = this.o;
                int i4 = this.X;
                this.X = i4 + 1;
                messageBuffer4.putByte(i4, (byte) -38);
                this.o.putShort(this.X, (short) iC);
                this.X = this.X + 2 + iC;
                return;
            }
        } else if (str.length() < 65536) {
            d((str.length() * 6) + 5);
            int iC2 = c(this.X + 3, str);
            if (iC2 >= 0) {
                if (iC2 < 65536) {
                    MessageBuffer messageBuffer5 = this.o;
                    int i5 = this.X;
                    this.X = i5 + 1;
                    messageBuffer5.putByte(i5, (byte) -38);
                    this.o.putShort(this.X, (short) iC2);
                    this.X = this.X + 2 + iC2;
                    return;
                }
                if (iC2 >= 4294967296L) {
                    throw new IllegalArgumentException("Unexpected UTF-8 encoder state");
                }
                MessageBuffer messageBuffer6 = this.o;
                int i6 = this.X;
                messageBuffer6.putMessageBuffer(i6 + 5, messageBuffer6, i6 + 3, iC2);
                MessageBuffer messageBuffer7 = this.o;
                int i7 = this.X;
                this.X = i7 + 1;
                messageBuffer7.putByte(i7, (byte) -37);
                this.o.putInt(this.X, iC2);
                this.X = this.X + 4 + iC2;
                return;
            }
        }
        Z(str);
    }

    public final void Z(String str) throws IOException {
        byte[] bytes = str.getBytes(kl9.a);
        P(bytes.length);
        int length = bytes.length;
        MessageBuffer messageBuffer = this.o;
        if (messageBuffer != null) {
            int size = messageBuffer.size();
            int i = this.X;
            if (size - i >= length && length <= this.b) {
                this.o.putBytes(i, bytes, 0, length);
                this.X += length;
                return;
            }
        }
        flush();
        this.d.add(bytes, 0, length);
    }

    public final int c(int i, String str) throws CharacterCodingException {
        if (this.Y == null) {
            CharsetEncoder charsetEncoderNewEncoder = kl9.a.newEncoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
            this.Y = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        }
        this.Y.reset();
        MessageBuffer messageBuffer = this.o;
        ByteBuffer byteBufferSliceAsByteBuffer = messageBuffer.sliceAsByteBuffer(i, messageBuffer.size() - i);
        int iPosition = byteBufferSliceAsByteBuffer.position();
        CoderResult coderResultEncode = this.Y.encode(CharBuffer.wrap(str), byteBufferSliceAsByteBuffer, true);
        if (coderResultEncode.isError()) {
            try {
                coderResultEncode.throwException();
            } catch (CharacterCodingException e) {
                throw new MessageStringCodingException(e);
            }
        }
        if (coderResultEncode.isUnderflow() && !coderResultEncode.isOverflow() && this.Y.flush(byteBufferSliceAsByteBuffer).isUnderflow()) {
            return byteBufferSliceAsByteBuffer.position() - iPosition;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OutputStreamBufferOutput outputStreamBufferOutput = this.d;
        try {
            flush();
        } finally {
            outputStreamBufferOutput.close();
        }
    }

    public final void d(int i) {
        MessageBuffer messageBuffer = this.o;
        OutputStreamBufferOutput outputStreamBufferOutput = this.d;
        if (messageBuffer == null) {
            this.o = outputStreamBufferOutput.next(i);
        } else if (this.X + i >= messageBuffer.size()) {
            this.d.writeBuffer(this.X);
            this.o = null;
            this.X = 0;
            this.o = outputStreamBufferOutput.next(i);
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        int i = this.X;
        if (i > 0) {
            this.d.writeBuffer(i);
            this.o = null;
            this.X = 0;
        }
        this.d.flush();
    }

    public final void h0(byte b) {
        d(1);
        MessageBuffer messageBuffer = this.o;
        int i = this.X;
        this.X = i + 1;
        messageBuffer.putByte(i, b);
    }

    public final void i(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("array size must be >= 0");
        }
        if (i < 16) {
            h0((byte) (i | (-112)));
        } else if (i < 65536) {
            l0((byte) -36, (short) i);
        } else {
            j0(i, (byte) -35);
        }
    }

    public final void i0(byte b, byte b2) {
        d(2);
        MessageBuffer messageBuffer = this.o;
        int i = this.X;
        this.X = i + 1;
        messageBuffer.putByte(i, b);
        MessageBuffer messageBuffer2 = this.o;
        int i2 = this.X;
        this.X = i2 + 1;
        messageBuffer2.putByte(i2, b2);
    }

    public final void j0(int i, byte b) {
        d(5);
        MessageBuffer messageBuffer = this.o;
        int i2 = this.X;
        this.X = i2 + 1;
        messageBuffer.putByte(i2, b);
        this.o.putInt(this.X, i);
        this.X += 4;
    }

    public final void k0(long j, byte b) {
        d(9);
        MessageBuffer messageBuffer = this.o;
        int i = this.X;
        this.X = i + 1;
        messageBuffer.putByte(i, b);
        this.o.putLong(this.X, j);
        this.X += 8;
    }

    public final void l(int i) {
        if (i < -32) {
            if (i < -32768) {
                j0(i, (byte) -46);
                return;
            } else if (i < -128) {
                l0((byte) -47, (short) i);
                return;
            } else {
                i0((byte) -48, (byte) i);
                return;
            }
        }
        if (i < 128) {
            h0((byte) i);
            return;
        }
        if (i < 256) {
            i0((byte) -52, (byte) i);
        } else if (i < 65536) {
            l0((byte) -51, (short) i);
        } else {
            j0(i, (byte) -50);
        }
    }

    public final void l0(byte b, short s) {
        d(3);
        MessageBuffer messageBuffer = this.o;
        int i = this.X;
        this.X = i + 1;
        messageBuffer.putByte(i, b);
        this.o.putShort(this.X, s);
        this.X += 2;
    }

    public final void w(long j) {
        if (j < -32) {
            if (j < -32768) {
                if (j < -2147483648L) {
                    k0(j, (byte) -45);
                    return;
                } else {
                    j0((int) j, (byte) -46);
                    return;
                }
            }
            if (j < -128) {
                l0((byte) -47, (short) j);
                return;
            } else {
                i0((byte) -48, (byte) j);
                return;
            }
        }
        if (j < 128) {
            h0((byte) j);
            return;
        }
        if (j < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
            if (j < 256) {
                i0((byte) -52, (byte) j);
                return;
            } else {
                l0((byte) -51, (short) j);
                return;
            }
        }
        if (j < 4294967296L) {
            j0((int) j, (byte) -50);
        } else {
            k0(j, (byte) -49);
        }
    }

    public final void y(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("map size must be >= 0");
        }
        if (i < 16) {
            h0((byte) (i | (-128)));
        } else if (i < 65536) {
            l0((byte) -34, (short) i);
        } else {
            j0(i, (byte) -33);
        }
    }
}
