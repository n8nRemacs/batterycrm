package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import tech.kwik.core.generic.IntegerTooLargeException;
import tech.kwik.core.generic.InvalidIntegerEncodingException;
import tech.kwik.core.impl.InvalidPacketException;
import tech.kwik.core.impl.NotYetImplementedException;
import tech.kwik.core.impl.TransportError;

/* loaded from: classes3.dex */
public abstract class btc {
    public zzg a;
    public ArrayList c;
    public byte[] e;
    public boolean f;
    public long b = -1;
    public int d = -1;

    public btc() {
        this.c = new ArrayList();
        this.c = new ArrayList();
    }

    public static int e(long j) {
        if (j <= 255) {
            return 1;
        }
        if (j <= 65535) {
            return 2;
        }
        return j <= 16777215 ? 3 : 4;
    }

    public static byte[] f(long j) {
        if (j <= 255) {
            return new byte[]{(byte) j};
        }
        if (j <= 65535) {
            return new byte[]{(byte) (j >> 8), (byte) (j & 255)};
        }
        if (j <= 16777215) {
            return new byte[]{(byte) (j >> 16), (byte) (j >> 8), (byte) (j & 255)};
        }
        if (j <= 4294967295L) {
            return new byte[]{(byte) (j >> 24), (byte) (j >> 16), (byte) (j >> 8), (byte) (j & 255)};
        }
        throw new NotYetImplementedException("cannot encode pn > 4 bytes");
    }

    public static byte g(long j, byte b) {
        int i;
        if (j <= 255) {
            return b;
        }
        if (j <= 65535) {
            i = b | 1;
        } else if (j <= 16777215) {
            i = b | 2;
        } else {
            if (j > 4294967295L) {
                throw new NotYetImplementedException("cannot encode pn > 4 bytes");
            }
            i = b | 3;
        }
        return (byte) i;
    }

    public abstract int a(ysc yscVar, bj bjVar);

    public final void b(atc atcVar) {
        this.c.add(atcVar);
    }

    public boolean c() {
        return !(this instanceof upd);
    }

    public void d(byte b) {
    }

    public abstract int h(int i);

    public abstract byte[] i(hc hcVar);

    public final ByteBuffer j(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1500);
        this.c.stream().forEachOrdered(new as(5, byteBufferAllocate));
        if (byteBufferAllocate.position() + i < 4) {
            ulb ulbVar = new ulb((4 - i) - byteBufferAllocate.position());
            this.c.add(ulbVar);
            ulbVar.g(byteBufferAllocate);
        }
        return byteBufferAllocate;
    }

    public byte[] k() {
        return this.e;
    }

    public abstract hf5 l();

    public Long m() {
        long j = this.b;
        if (j >= 0) {
            return Long.valueOf(j);
        }
        throw new IllegalStateException("PN is not yet known");
    }

    public abstract m5c n();

    public final int o() {
        int i = this.d;
        if (i > 0) {
            return i;
        }
        throw new IllegalStateException("no size for ".concat(getClass().getSimpleName()));
    }

    public boolean p() {
        return this.c.stream().anyMatch(new kk8(10));
    }

    public boolean q() {
        return this.c.stream().allMatch(new kk8(12));
    }

    public boolean r() {
        return this.c.stream().anyMatch(new kk8(11));
    }

    public abstract void s(ByteBuffer byteBuffer, hc hcVar, long j, bh8 bh8Var, int i);

    public final void t(ByteBuffer byteBuffer, byte b, int i, hc hcVar, long j, bh8 bh8Var) throws InvalidPacketException, TransportError {
        if (byteBuffer.remaining() < i) {
            throw new InvalidPacketException();
        }
        int iPosition = byteBuffer.position();
        if (byteBuffer.remaining() < 4) {
            throw new InvalidPacketException();
        }
        if (byteBuffer.remaining() < 16) {
            throw new InvalidPacketException();
        }
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        byte[] bArrA = hcVar.a(bArr2);
        byte b2 = (byte) (b ^ ((b & 128) == 128 ? bArrA[0] & 15 : bArrA[0] & 31));
        v(b2);
        int i3 = (b2 & 3) + 1;
        byte[] bArr3 = new byte[i3];
        byteBuffer.get(bArr3);
        byte[] bArr4 = new byte[i3];
        int i4 = 0;
        while (i4 < i3) {
            int i5 = i4 + 1;
            bArr4[i4] = (byte) (bArr3[i4] ^ bArrA[i5]);
            i4 = i5;
        }
        long j2 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            j2 = (j2 << 8) | (bArr4[i6] & 255);
        }
        long j3 = j + 1;
        long j4 = 1 << (i3 * 8);
        long j5 = j4 / 2;
        long j6 = (j3 & (~(j4 - 1))) | j2;
        if (j6 <= j3 - j5 && j6 < 4611686018427387904L - j4) {
            j6 += j4;
        } else if (j6 > j3 + j5 && j6 >= j4) {
            j6 -= j4;
        }
        this.b = j6;
        bh8Var.decrypted("Unprotected packet number: " + j6);
        int iPosition2 = byteBuffer.position();
        int iPosition3 = byteBuffer.position();
        byte[] bArr5 = new byte[iPosition3];
        byteBuffer.get(bArr5);
        bArr5[0] = b2;
        System.arraycopy(bArr4, 0, bArr5, iPosition3 - i3, i3);
        bh8Var.encrypted("Frame header", bArr5);
        int i7 = i - i3;
        if (i7 < 1) {
            throw new InvalidPacketException();
        }
        byte[] bArr6 = new byte[i7];
        byteBuffer.get(bArr6, 0, i7);
        bh8Var.encrypted("Encrypted payload", bArr6);
        long j7 = this.b;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(0);
        byteBufferAllocate.putLong(j7);
        if (this instanceof rwe) {
            short s = ((rwe) this).g;
            kc kcVar = (kc) hcVar;
            bh8 bh8Var2 = kcVar.b;
            if (kcVar.o % 2 != s) {
                if (kcVar.g == null) {
                    kcVar.d(false);
                    bh8Var2.secret("Computed new (updated) key", kcVar.g);
                    bh8Var2.secret("Computed new (updated) iv", kcVar.i);
                }
                bh8Var2.info("Received key phase does not match current => possible key update in progress");
                kcVar.p = true;
            }
        }
        kc kcVar2 = (kc) hcVar;
        byte[] bArr7 = kcVar2.p ? kcVar2.i : kcVar2.h;
        byte[] bArr8 = new byte[12];
        byte[] bArrArray = byteBufferAllocate.array();
        int length = bArrArray.length;
        int i8 = 0;
        while (i2 < length) {
            bArr8[i8] = (byte) (bArrArray[i2] ^ bArr7[i8]);
            i2++;
            i8++;
        }
        byte[] bArrB = kcVar2.b(bArr5, bArr6, bArr8);
        bh8Var.decrypted("Decrypted payload", bArrB);
        this.c = new ArrayList();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrB);
        byte b3 = -1;
        while (byteBufferWrap.remaining() > 0) {
            try {
                b3 = byteBufferWrap.get();
                if (b3 != 48 && b3 != 49) {
                    switch (b3) {
                        case 0:
                            ArrayList arrayList = this.c;
                            ulb ulbVar = new ulb();
                            ulbVar.h(byteBufferWrap);
                            arrayList.add(ulbVar);
                        case 1:
                            ArrayList arrayList2 = this.c;
                            r0c r0cVar = new r0c();
                            byteBufferWrap.get();
                            arrayList2.add(r0cVar);
                        case 2:
                        case 3:
                            ArrayList arrayList3 = this.c;
                            z5 z5Var = new z5();
                            z5Var.o = 8;
                            z5Var.X = null;
                            z5Var.i(byteBufferWrap, bh8Var);
                            arrayList3.add(z5Var);
                        case 4:
                            ArrayList arrayList4 = this.c;
                            snd sndVar = new snd();
                            sndVar.h(byteBufferWrap);
                            arrayList4.add(sndVar);
                        case 5:
                            ArrayList arrayList5 = this.c;
                            mr8 mr8Var = new mr8(1);
                            mr8Var.h(byteBufferWrap);
                            arrayList5.add(mr8Var);
                        case 6:
                            ArrayList arrayList6 = this.c;
                            ya4 ya4Var = new ya4();
                            ya4Var.h(byteBufferWrap, bh8Var);
                            arrayList6.add(ya4Var);
                        case 7:
                            ArrayList arrayList7 = this.c;
                            fha fhaVar = new fha();
                            fhaVar.h(byteBufferWrap, bh8Var);
                            arrayList7.add(fhaVar);
                        default:
                            switch (b3) {
                                case 16:
                                    ArrayList arrayList8 = this.c;
                                    zd4 zd4Var = new zd4(1);
                                    byteBufferWrap.get();
                                    zd4Var.b = epi.i(byteBufferWrap);
                                    arrayList8.add(zd4Var);
                                case LangUtils.HASH_SEED /* 17 */:
                                    ArrayList arrayList9 = this.c;
                                    mr8 mr8Var2 = new mr8(0);
                                    mr8Var2.j(byteBufferWrap);
                                    arrayList9.add(mr8Var2);
                                case 18:
                                case 19:
                                    ArrayList arrayList10 = this.c;
                                    nr8 nr8Var = new nr8();
                                    nr8Var.h(byteBufferWrap);
                                    arrayList10.add(nr8Var);
                                case 20:
                                    ArrayList arrayList11 = this.c;
                                    zd4 zd4Var2 = new zd4(0);
                                    byteBufferWrap.get();
                                    zd4Var2.b = epi.i(byteBufferWrap);
                                    arrayList11.add(zd4Var2);
                                case 21:
                                    ArrayList arrayList12 = this.c;
                                    mr8 mr8Var3 = new mr8(2);
                                    mr8Var3.i(byteBufferWrap);
                                    arrayList12.add(mr8Var3);
                                case 22:
                                case 23:
                                    ArrayList arrayList13 = this.c;
                                    emf emfVar = new emf();
                                    emfVar.h(byteBufferWrap);
                                    arrayList13.add(emfVar);
                                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                                    ArrayList arrayList14 = this.c;
                                    qga qgaVar = new qga();
                                    qgaVar.h(byteBufferWrap);
                                    arrayList14.add(qgaVar);
                                case 25:
                                    ArrayList arrayList15 = this.c;
                                    spd spdVar = new spd();
                                    byteBufferWrap.get();
                                    spdVar.a = atc.e(byteBufferWrap);
                                    arrayList15.add(spdVar);
                                case 26:
                                    ArrayList arrayList16 = this.c;
                                    qob qobVar = new qob();
                                    qobVar.h(byteBufferWrap);
                                    arrayList16.add(qobVar);
                                case 27:
                                    ArrayList arrayList17 = this.c;
                                    yob yobVar = new yob();
                                    yobVar.h(byteBufferWrap);
                                    arrayList17.add(yobVar);
                                case 28:
                                case 29:
                                    ArrayList arrayList18 = this.c;
                                    ir3 ir3Var = new ir3();
                                    ir3Var.j(byteBufferWrap);
                                    arrayList18.add(ir3Var);
                                case 30:
                                    ArrayList arrayList19 = this.c;
                                    g07 g07Var = new g07();
                                    g07Var.h(byteBufferWrap);
                                    arrayList19.add(g07Var);
                                default:
                                    if (b3 < 8 || b3 > 15) {
                                        throw new TransportError(8);
                                    }
                                    ArrayList arrayList20 = this.c;
                                    dlf dlfVar = new dlf();
                                    dlfVar.h(byteBufferWrap, bh8Var);
                                    arrayList20.add(dlfVar);
                                    break;
                            }
                            break;
                    }
                } else {
                    ArrayList arrayList21 = this.c;
                    ef4 ef4Var = new ef4();
                    ef4Var.h(byteBufferWrap);
                    arrayList21.add(ef4Var);
                }
            } catch (IllegalArgumentException unused) {
                bh8Var.error("Parse error while parsing frame of type " + ((int) b3) + ", packet will be marked invalid (and dropped)");
                throw new InvalidPacketException("unexpected large int value");
            } catch (BufferUnderflowException | IntegerTooLargeException unused2) {
                bh8Var.error("Parse error while parsing frame of type " + ((int) b3) + ".");
                throw new TransportError(8, "invalid frame encoding");
            } catch (InvalidIntegerEncodingException unused3) {
                bh8Var.error("Parse error while parsing frame of type " + ((int) b3) + ".");
                throw new TransportError(8, "invalid integer encoding");
            }
        }
        d(b2);
    }

    public final void u(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, hc hcVar) {
        int iPosition = byteBuffer.position() - i;
        byte[] bArr = new byte[byteBuffer.position()];
        byteBuffer.get(bArr);
        byte[] bArr2 = new byte[byteBuffer2.limit()];
        byteBuffer2.get(bArr2, 0, byteBuffer2.limit());
        long j = this.b;
        kc kcVar = (kc) hcVar;
        byte[] bArr3 = kcVar.p ? kcVar.i : kcVar.h;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr3.length);
        for (int i2 = 0; i2 < byteBufferAllocate.capacity() - 8; i2++) {
            byteBufferAllocate.put((byte) 0);
        }
        byteBufferAllocate.putLong(j);
        byte[] bArr4 = new byte[12];
        byte[] bArrArray = byteBufferAllocate.array();
        int length = bArrArray.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            bArr4[i4] = (byte) (bArrArray[i3] ^ bArr3[i4]);
            i3++;
            i4++;
        }
        byte[] bArrC = kcVar.c(bArr, bArr2, bArr4);
        byteBuffer.put(bArrC);
        byte[] bArrF = f(this.b);
        byte[] bArr5 = new byte[16];
        System.arraycopy(bArrC, 4 - bArrF.length, bArr5, 0, 16);
        byte[] bArrA = hcVar.a(bArr5);
        byte[] bArr6 = new byte[bArrF.length];
        int i5 = 0;
        while (i5 < bArrF.length) {
            int i6 = i5 + 1;
            bArr6[i5] = (byte) (bArrF[i5] ^ bArrA[i6]);
            i5 = i6;
        }
        byte b = byteBuffer.get(0);
        byteBuffer.put(0, (byte) (((byte) ((b & 128) == 128 ? bArrA[0] & 15 : bArrA[0] & 31)) ^ b));
        int iPosition2 = byteBuffer.position();
        byteBuffer.put(bArr6);
    }

    public void v(byte b) {
    }
}
