package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.apache.http.cookie.ClientCookie;
import tech.kwik.agent15.alert.DecodeErrorException;
import tech.kwik.core.generic.InvalidIntegerEncodingException;
import tech.kwik.core.impl.TransportError;

/* loaded from: classes3.dex */
public final class dtc extends rn5 {
    public final zzg a;
    public final int b;
    public byte[] c;
    public final lig d;

    public dtc(zzg zzgVar) {
        this.a = zzgVar;
        this.d = new lig();
    }

    public static void c(int i, long j, ByteBuffer byteBuffer) {
        epi.b(i, byteBuffer);
        int iC = epi.c(j, byteBuffer);
        epi.b(iC, byteBuffer);
        epi.c(j, byteBuffer);
    }

    public static void d(int i, ByteBuffer byteBuffer, byte[] bArr) {
        epi.b(i, byteBuffer);
        epi.b(bArr.length, byteBuffer);
        byteBuffer.put(bArr);
    }

    @Override // defpackage.rn5
    public final byte[] a() {
        byte[] bArr;
        byte[] bArr2;
        if (this.c == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(0 + 1024);
            zzg zzgVar = zzg.b;
            zzg zzgVar2 = this.a;
            byteBufferAllocate.putShort((short) ((zzgVar2.equals(zzgVar) || zzgVar2.b()) ? 57 : 65445));
            byteBufferAllocate.putShort((short) 0);
            int i = this.b;
            lig ligVar = this.d;
            if (i == 2) {
                d(0, byteBufferAllocate, ligVar.a);
            }
            c(1, ligVar.b, byteBufferAllocate);
            if (i == 2 && (bArr2 = ligVar.q) != null) {
                d(2, byteBufferAllocate, bArr2);
            }
            c(3, ligVar.p, byteBufferAllocate);
            c(4, ligVar.c, byteBufferAllocate);
            c(5, ligVar.d, byteBufferAllocate);
            c(6, ligVar.e, byteBufferAllocate);
            c(7, ligVar.f, byteBufferAllocate);
            c(8, ligVar.g, byteBufferAllocate);
            c(9, ligVar.h, byteBufferAllocate);
            c(10, ligVar.i, byteBufferAllocate);
            c(11, ligVar.l, byteBufferAllocate);
            if (ligVar.j) {
                epi.b(12, byteBufferAllocate);
                epi.b(0, byteBufferAllocate);
            }
            c(14, ligVar.m, byteBufferAllocate);
            d(15, byteBufferAllocate, ligVar.n);
            if (i == 2 && (bArr = ligVar.o) != null) {
                d(16, byteBufferAllocate, bArr);
            }
            enb enbVar = ligVar.r;
            if (enbVar != null) {
                List list = (List) enbVar.c;
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate((list.size() * 4) + 4);
                byteBufferAllocate2.put(((zzg) enbVar.b).a());
                list.forEach(new as(6, byteBufferAllocate2));
                d(17, byteBufferAllocate, byteBufferAllocate2.array());
            }
            long j = ligVar.s;
            if (j > 0) {
                c(32, j, byteBufferAllocate);
            }
            int iPosition = byteBufferAllocate.position();
            byteBufferAllocate.putShort(2, (short) (iPosition - 4));
            this.c = new byte[iPosition];
            byteBufferAllocate.get(this.c);
        }
        return this.c;
    }

    public final void e(ByteBuffer byteBuffer, HashSet hashSet, bh8 bh8Var) throws InvalidIntegerEncodingException, TransportError, DecodeErrorException {
        boolean z;
        String str;
        long jI = epi.i(byteBuffer);
        if (!hashSet.add(Long.valueOf(jI))) {
            throw new TransportError(9, "duplicate transport parameter");
        }
        int iF = epi.f(byteBuffer);
        if (byteBuffer.remaining() < iF) {
            throw new DecodeErrorException("Invalid transport parameter extension");
        }
        int iPosition = byteBuffer.position();
        int iCharCount = 0;
        long j = 0;
        lig ligVar = this.d;
        if (jI == j) {
            byte[] bArr = new byte[iF];
            byteBuffer.get(bArr);
            bh8Var.debug("- original destination connection id: ", bArr);
            ligVar.a = bArr;
        } else if (jI == 1) {
            long jI2 = epi.i(byteBuffer);
            bh8Var.debug("- max idle timeout: " + jI2);
            ligVar.b = jI2;
        } else if (jI == 2) {
            byte[] bArr2 = new byte[16];
            byteBuffer.get(bArr2);
            bh8Var.debug("- stateless reset token: " + uwi.a(bArr2));
            ligVar.q = bArr2;
        } else if (jI == 3) {
            int iF2 = epi.f(byteBuffer);
            bh8Var.debug("- max udp payload size: " + iF2);
            ligVar.p = iF2;
        } else if (jI == 4) {
            long jI3 = epi.i(byteBuffer);
            bh8Var.debug("- initial max data: " + jI3);
            ligVar.c = jI3;
        } else if (jI == 5) {
            long jI4 = epi.i(byteBuffer);
            bh8Var.debug("- initial max stream data bidi local: " + jI4);
            ligVar.d = jI4;
        } else if (jI == 6) {
            long jI5 = epi.i(byteBuffer);
            bh8Var.debug("- initial max stream data bidi remote: " + jI5);
            ligVar.e = jI5;
        } else if (jI == 7) {
            long jI6 = epi.i(byteBuffer);
            bh8Var.debug("- initial max stream data uni: " + jI6);
            ligVar.f = jI6;
        } else if (jI == 8) {
            long jI7 = epi.i(byteBuffer);
            bh8Var.debug("- initial max bidi streams: " + jI7);
            ligVar.g = jI7;
        } else if (jI == 9) {
            long jI8 = epi.i(byteBuffer);
            bh8Var.debug("- max uni streams: " + jI8);
            ligVar.h = jI8;
        } else if (jI == 10) {
            int iF3 = epi.f(byteBuffer);
            bh8Var.debug("- ack delay exponent: " + iF3);
            ligVar.i = iF3;
        } else if (jI == 11) {
            int iF4 = epi.f(byteBuffer);
            bh8Var.debug("- max ack delay: " + iF4);
            ligVar.l = iF4;
        } else if (jI == 12) {
            bh8Var.debug("- disable migration");
            ligVar.j = true;
        } else if (jI == 13) {
            try {
                ka5 ka5Var = new ka5();
                byte[] bArr3 = new byte[4];
                byteBuffer.get(bArr3);
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        z = true;
                        break;
                    } else {
                        if (bArr3[i] != 0) {
                            z = false;
                            break;
                        }
                        i++;
                    }
                }
                if (!z) {
                    ka5Var.a = InetAddress.getByAddress(bArr3);
                }
                byteBuffer.get();
                byteBuffer.get();
                byte[] bArr4 = new byte[16];
                byteBuffer.get(bArr4);
                int i2 = 0;
                while (true) {
                    if (i2 >= 16) {
                        iCharCount = 1;
                        break;
                    } else if (bArr4[i2] != 0) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (iCharCount == 0) {
                    ka5Var.b = InetAddress.getByAddress(bArr4);
                }
                byteBuffer.get();
                byteBuffer.get();
                if (((InetAddress) ka5Var.a) == null && ((InetAddress) ka5Var.b) == null) {
                    throw new DecodeErrorException("Preferred address: no valid IP address");
                }
                byte[] bArr5 = new byte[byteBuffer.get()];
                ka5Var.c = bArr5;
                byteBuffer.get(bArr5);
                byteBuffer.get(new byte[16]);
                ligVar.k = ka5Var;
            } catch (UnknownHostException unused) {
                throw new RuntimeException();
            }
        } else if (jI == 14) {
            long jI9 = epi.i(byteBuffer);
            bh8Var.debug("- active connection id limit: " + jI9);
            ligVar.m = (int) jI9;
        } else if (jI == 15) {
            byte[] bArr6 = new byte[iF];
            byteBuffer.get(bArr6);
            bh8Var.debug("- initial source connection id: " + uwi.a(bArr6));
            ligVar.n = bArr6;
        } else if (jI == 16) {
            byte[] bArr7 = new byte[iF];
            byteBuffer.get(bArr7);
            bh8Var.debug("- retry source connection id: " + uwi.a(bArr7));
            ligVar.o = bArr7;
        } else if (jI == 17) {
            if (iF % 4 != 0 || iF < 4) {
                throw new DecodeErrorException("invalid parameters size");
            }
            int i3 = byteBuffer.getInt();
            ArrayList arrayList = new ArrayList();
            while (iCharCount < (iF / 4) - 1) {
                arrayList.add(new zzg(byteBuffer.getInt()));
                iCharCount++;
            }
            ligVar.r = new enb(new zzg(i3), 14, arrayList);
        } else if (jI == 32) {
            long jI10 = epi.i(byteBuffer);
            bh8Var.debug("- max datagram frame size: " + jI10);
            ligVar.s = jI10;
        } else {
            String str2 = jI == 32 ? "datagram" : "";
            if (jI == 64) {
                str2 = "multi-path";
            }
            if (jI == 4183) {
                str2 = "loss-bits";
            }
            if (jI == 5950) {
                str2 = ClientCookie.DISCARD_ATTR;
            }
            if (jI == 10930) {
                str2 = "grease-quic-bit";
            }
            if (jI == 29015) {
                str2 = "timestamp";
            }
            String str3 = jI != 29016 ? str2 : "timestamp";
            if (jI == 29659) {
                str3 = "version-negotiation";
            }
            if (jI == 56858) {
                str3 = "delayed-ack";
            }
            if (jI == 16741339) {
                str3 = "version-information-4-13";
            }
            String str4 = jI != 4278378010L ? str3 : "delayed-ack";
            int length = str4.length();
            while (true) {
                if (iCharCount >= length) {
                    str = String.format("- unknown transport parameter 0x%04x, size %d", Long.valueOf(jI), Integer.valueOf(iF));
                    break;
                }
                int iCodePointAt = str4.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    str = String.format("- unsupported transport parameter 0x%04x, size %d (%s)", Long.valueOf(jI), Integer.valueOf(iF), str4);
                    break;
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
            bh8Var.warn(str);
            byteBuffer.get(new byte[iF]);
        }
        if (byteBuffer.position() - iPosition != iF) {
            throw new DecodeErrorException("inconsistent size in transport parameter");
        }
    }

    public dtc(zzg zzgVar, lig ligVar) {
        this.a = zzgVar;
        this.d = ligVar;
        this.b = 1;
    }
}
