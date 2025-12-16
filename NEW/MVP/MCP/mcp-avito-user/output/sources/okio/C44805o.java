package okio;

import androidx.compose.ui.platform.C22491k0;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;
import kotlin.text.C43066x;
import okio.C44802l;

/* compiled from: ByteString.kt */
@s0
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lokio/o;", "Ljava/io/Serializable;", "", "Ljava/io/ObjectInputStream;", "in", "Lkotlin/G0;", "readObject", "(Ljava/io/ObjectInputStream;)V", "Ljava/io/ObjectOutputStream;", "out", "writeObject", "(Ljava/io/ObjectOutputStream;)V", "", "b", "[B", "getData$okio", "()[B", "data", "a", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: okio.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44805o implements Serializable, Comparable<C44805o> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f420139e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final C44805o f420140f = new C44805o(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final byte[] data;

    /* renamed from: c, reason: collision with root package name */
    public transient int f420142c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public transient String f420143d;

    /* compiled from: ByteString.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lokio/o$a;", "", "<init>", "()V", "Lokio/o;", "EMPTY", "Lokio/o;", "", "serialVersionUID", "J", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: okio.o$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @X41.n
        @Y61.l
        public static C44805o a(@Y61.k String str) {
            int i12;
            char cCharAt;
            byte[] bArr = C44791a.f420057a;
            int length = str.length();
            while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
                length--;
            }
            int i13 = (int) ((length * 6) / 8);
            byte[] bArrCopyOf = new byte[i13];
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (i14 < length) {
                    char cCharAt2 = str.charAt(i14);
                    if ('A' <= cCharAt2 && cCharAt2 < '[') {
                        i12 = cCharAt2 - 'A';
                    } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                        i12 = cCharAt2 - 'G';
                    } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                        i12 = cCharAt2 + 4;
                    } else if (cCharAt2 != '+' && cCharAt2 != '-') {
                        if (cCharAt2 != '/' && cCharAt2 != '_') {
                            if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                                break;
                            }
                            i14++;
                        } else {
                            i12 = 63;
                        }
                    } else {
                        i12 = 62;
                    }
                    int i18 = i12 | (i16 << 6);
                    i15++;
                    if (i15 % 4 == 0) {
                        bArrCopyOf[i17] = (byte) (i18 >> 16);
                        int i19 = i17 + 2;
                        bArrCopyOf[i17 + 1] = (byte) (i18 >> 8);
                        i17 += 3;
                        bArrCopyOf[i19] = (byte) i18;
                    }
                    i16 = i18;
                    i14++;
                } else {
                    int i22 = i15 % 4;
                    if (i22 != 1) {
                        if (i22 == 2) {
                            bArrCopyOf[i17] = (byte) ((i16 << 12) >> 16);
                            i17 = 1 + i17;
                        } else if (i22 == 3) {
                            int i23 = i16 << 6;
                            int i24 = 1 + i17;
                            bArrCopyOf[i17] = (byte) (i23 >> 16);
                            i17 += 2;
                            bArrCopyOf[i24] = (byte) (i23 >> 8);
                        }
                        if (i17 != i13) {
                            bArrCopyOf = Arrays.copyOf(bArrCopyOf, i17);
                        }
                    }
                }
            }
            bArrCopyOf = null;
            if (bArrCopyOf != null) {
                return new C44805o(bArrCopyOf);
            }
            return null;
        }

        @X41.n
        @Y61.k
        public static C44805o b(@Y61.k String str) {
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i12 = 0; i12 < length; i12++) {
                int i13 = i12 * 2;
                bArr[i12] = (byte) (okio.internal.c.a(str.charAt(i13 + 1)) + (okio.internal.c.a(str.charAt(i13)) << 4));
            }
            return new C44805o(bArr);
        }

        @X41.n
        @Y61.k
        public static C44805o c(@Y61.k String str) {
            C44805o c44805o = new C44805o(str.getBytes(C43047d.f410589b));
            c44805o.f420143d = str;
            return c44805o;
        }

        public static C44805o d(a aVar, byte[] bArr) {
            C44802l.a aVar2 = C44799i.f420068a;
            aVar.getClass();
            int length = bArr.length;
            C44799i.b(bArr.length, 0, length);
            return new C44805o(C42756l.t(0, length, bArr));
        }

        public a() {
        }
    }

    public C44805o(@Y61.k byte[] bArr) {
        this.data = bArr;
    }

    public static int h(C44805o c44805o, C44805o c44805o2) {
        c44805o.getClass();
        return c44805o.f(0, c44805o2.data);
    }

    public static C44805o q(C44805o c44805o, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i12 = 0;
        }
        if ((i14 & 2) != 0) {
            i13 = C44799i.f420069b;
        }
        return c44805o.p(i12, i13);
    }

    private final void readObject(ObjectInputStream in2) throws IllegalAccessException, NoSuchFieldException, IOException, SecurityException, IllegalArgumentException {
        int i12 = in2.readInt();
        f420139e.getClass();
        if (i12 < 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "byteCount < 0: ").toString());
        }
        byte[] bArr = new byte[i12];
        int i13 = 0;
        while (i13 < i12) {
            int i14 = in2.read(bArr, i13, i12 - i13);
            if (i14 == -1) {
                throw new EOFException();
            }
            i13 += i14;
        }
        C44805o c44805o = new C44805o(bArr);
        Field declaredField = C44805o.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this, c44805o.data);
    }

    private final void writeObject(ObjectOutputStream out) throws IOException {
        out.writeInt(this.data.length);
        out.write(this.data);
    }

    @Y61.k
    public String a() {
        byte[] bArr = this.data;
        byte[] bArr2 = C44791a.f420057a;
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            byte b12 = bArr[i12];
            int i14 = i12 + 2;
            byte b13 = bArr[i12 + 1];
            i12 += 3;
            byte b14 = bArr[i14];
            bArr3[i13] = bArr2[(b12 & 255) >> 2];
            bArr3[i13 + 1] = bArr2[((b12 & 3) << 4) | ((b13 & 255) >> 4)];
            int i15 = i13 + 3;
            bArr3[i13 + 2] = bArr2[((b13 & 15) << 2) | ((b14 & 255) >> 6)];
            i13 += 4;
            bArr3[i15] = bArr2[b14 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b15 = bArr[i12];
            bArr3[i13] = bArr2[(b15 & 255) >> 2];
            bArr3[i13 + 1] = bArr2[(b15 & 3) << 4];
            bArr3[i13 + 2] = 61;
            bArr3[i13 + 3] = 61;
        } else if (length2 == 2) {
            int i16 = i12 + 1;
            byte b16 = bArr[i12];
            byte b17 = bArr[i16];
            bArr3[i13] = bArr2[(b16 & 255) >> 2];
            bArr3[i13 + 1] = bArr2[((b16 & 3) << 4) | ((b17 & 255) >> 4)];
            bArr3[i13 + 2] = bArr2[(b17 & 15) << 2];
            bArr3[i13 + 3] = 61;
        }
        return new String(bArr3, C43047d.f410589b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(@Y61.k okio.C44805o r10) {
        /*
            r9 = this;
            int r0 = r9.d()
            int r1 = r10.d()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        Le:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L29
            byte r7 = r9.k(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.k(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L23
            int r4 = r4 + 1
            goto Le
        L23:
            if (r7 >= r8) goto L27
        L25:
            r3 = r5
            goto L2f
        L27:
            r3 = r6
            goto L2f
        L29:
            if (r0 != r1) goto L2c
            goto L2f
        L2c:
            if (r0 >= r1) goto L27
            goto L25
        L2f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C44805o.compareTo(okio.o):int");
    }

    @Y61.k
    public C44805o c(@Y61.k String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.data, 0, d());
        return new C44805o(messageDigest.digest());
    }

    public int d() {
        return this.data.length;
    }

    @Y61.k
    public String e() {
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int i12 = 0;
        for (byte b12 : bArr) {
            int i13 = i12 + 1;
            char[] cArr2 = okio.internal.c.f420071a;
            cArr[i12] = cArr2[(b12 >> 4) & 15];
            i12 += 2;
            cArr[i13] = cArr2[b12 & 15];
        }
        return new String(cArr);
    }

    public boolean equals(@Y61.l Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C44805o) {
            C44805o c44805o = (C44805o) obj;
            int iD2 = c44805o.d();
            byte[] bArr = this.data;
            if (iD2 == bArr.length && c44805o.m(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    @X41.j
    public int f(int i12, @Y61.k byte[] bArr) {
        int length = this.data.length - bArr.length;
        int iMax = Math.max(i12, 0);
        if (iMax <= length) {
            while (!C44799i.a(this.data, iMax, bArr, 0, bArr.length)) {
                if (iMax != length) {
                    iMax++;
                }
            }
            return iMax;
        }
        return -1;
    }

    public int hashCode() {
        int i12 = this.f420142c;
        if (i12 != 0) {
            return i12;
        }
        int iHashCode = Arrays.hashCode(this.data);
        this.f420142c = iHashCode;
        return iHashCode;
    }

    @Y61.k
    /* renamed from: i, reason: from getter */
    public byte[] getData() {
        return this.data;
    }

    public byte k(int i12) {
        return this.data[i12];
    }

    @X41.j
    public int l(int i12, @Y61.k byte[] bArr) {
        if (i12 == C44799i.f420069b) {
            i12 = d();
        }
        for (int iMin = Math.min(i12, this.data.length - bArr.length); -1 < iMin; iMin--) {
            if (C44799i.a(this.data, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public boolean m(int i12, int i13, int i14, @Y61.k byte[] bArr) {
        if (i12 >= 0) {
            byte[] bArr2 = this.data;
            if (i12 <= bArr2.length - i14 && i13 >= 0 && i13 <= bArr.length - i14 && C44799i.a(bArr2, i12, bArr, i13, i14)) {
                return true;
            }
        }
        return false;
    }

    public boolean n(int i12, @Y61.k C44805o c44805o, int i13) {
        return c44805o.m(0, i12, i13, this.data);
    }

    @Y61.k
    public String o(@Y61.k Charset charset) {
        return new String(this.data, charset);
    }

    @X41.j
    @Y61.k
    public C44805o p(int i12, int i13) {
        if (i13 == C44799i.f420069b) {
            i13 = d();
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.data;
        if (i13 > bArr.length) {
            throw new IllegalArgumentException(androidx.appcompat.app.r.t(new StringBuilder("endIndex > length("), this.data.length, ')').toString());
        }
        if (i13 - i12 >= 0) {
            return (i12 == 0 && i13 == bArr.length) ? this : new C44805o(C42756l.t(i12, i13, bArr));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    @Y61.k
    public C44805o r() {
        int i12 = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i12 >= bArr.length) {
                return this;
            }
            byte b12 = bArr[i12];
            if (b12 >= 65 && b12 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i12] = (byte) (b12 + 32);
                for (int i13 = i12 + 1; i13 < bArrCopyOf.length; i13++) {
                    byte b13 = bArrCopyOf[i13];
                    if (b13 >= 65 && b13 <= 90) {
                        bArrCopyOf[i13] = (byte) (b13 + 32);
                    }
                }
                return new C44805o(bArrCopyOf);
            }
            i12++;
        }
    }

    @Y61.k
    public byte[] s() {
        byte[] bArr = this.data;
        return Arrays.copyOf(bArr, bArr.length);
    }

    @Y61.k
    public final String t() {
        String str = this.f420143d;
        if (str != null) {
            return str;
        }
        String str2 = new String(getData(), C43047d.f410589b);
        this.f420143d = str2;
        return str2;
    }

    @Y61.k
    public String toString() {
        byte b12;
        int i12;
        byte[] bArr = this.data;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        loop0: while (true) {
            if (i13 >= length) {
                break;
            }
            byte b13 = bArr[i13];
            if (b13 >= 0) {
                int i16 = i15 + 1;
                if (i15 == 64) {
                    break;
                }
                if ((b13 != 10 && b13 != 13 && ((b13 >= 0 && b13 < 32) || (127 <= b13 && b13 < 160))) || b13 == 65533) {
                    break;
                }
                i14 += b13 < 65536 ? 1 : 2;
                i13++;
                while (true) {
                    i15 = i16;
                    if (i13 < length && (b12 = bArr[i13]) >= 0) {
                        i13++;
                        i16 = i15 + 1;
                        if (i15 == 64) {
                            break loop0;
                        }
                        if ((b12 != 10 && b12 != 13 && ((b12 >= 0 && b12 < 32) || (127 <= b12 && b12 < 160))) || b12 == 65533) {
                            break loop0;
                        }
                        i14 += b12 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b13 >> 5) == -2) {
                int i17 = i13 + 1;
                if (length > i17) {
                    byte b14 = bArr[i17];
                    if ((b14 & 192) == 128) {
                        int i18 = (b14 ^ 3968) ^ (b13 << 6);
                        if (i18 >= 128) {
                            int i19 = i15 + 1;
                            if (i15 == 64) {
                                break;
                            }
                            if ((i18 != 10 && i18 != 13 && ((i18 >= 0 && i18 < 32) || (127 <= i18 && i18 < 160))) || i18 == 65533) {
                                break;
                            }
                            i14 += i18 < 65536 ? 1 : 2;
                            G0 g02 = G0.f406611a;
                            i13 += 2;
                            i15 = i19;
                        } else if (i15 != 64) {
                            break;
                        }
                    } else if (i15 != 64) {
                        break;
                    }
                } else if (i15 != 64) {
                    break;
                }
            } else if ((b13 >> 4) == -2) {
                int i22 = i13 + 2;
                if (length > i22) {
                    byte b15 = bArr[i13 + 1];
                    if ((b15 & 192) == 128) {
                        byte b16 = bArr[i22];
                        if ((b16 & 192) == 128) {
                            int i23 = ((b15 << 6) ^ (b16 ^ (-123008))) ^ (b13 << 12);
                            if (i23 < 2048) {
                                if (i15 != 64) {
                                    break;
                                }
                            } else if (55296 > i23 || i23 >= 57344) {
                                i12 = i15 + 1;
                                if (i15 == 64) {
                                    break;
                                }
                                if ((i23 != 10 && i23 != 13 && ((i23 >= 0 && i23 < 32) || (127 <= i23 && i23 < 160))) || i23 == 65533) {
                                    break;
                                }
                                i14 += i23 < 65536 ? 1 : 2;
                                G0 g03 = G0.f406611a;
                                i13 += 3;
                                i15 = i12;
                            } else if (i15 != 64) {
                                break;
                            }
                        } else if (i15 != 64) {
                            break;
                        }
                    } else if (i15 != 64) {
                        break;
                    }
                } else if (i15 != 64) {
                    break;
                }
            } else if ((b13 >> 3) == -2) {
                int i24 = i13 + 3;
                if (length > i24) {
                    byte b17 = bArr[i13 + 1];
                    if ((b17 & 192) == 128) {
                        byte b18 = bArr[i13 + 2];
                        if ((b18 & 192) == 128) {
                            byte b19 = bArr[i24];
                            if ((b19 & 192) == 128) {
                                int i25 = (((b19 ^ 3678080) ^ (b18 << 6)) ^ (b17 << 12)) ^ (b13 << 18);
                                if (i25 > 1114111) {
                                    if (i15 != 64) {
                                        break;
                                    }
                                } else if (55296 > i25 || i25 >= 57344) {
                                    if (i25 >= 65536) {
                                        i12 = i15 + 1;
                                        if (i15 == 64) {
                                            break;
                                        }
                                        if ((i25 != 10 && i25 != 13 && ((i25 >= 0 && i25 < 32) || (127 <= i25 && i25 < 160))) || i25 == 65533) {
                                            break;
                                        }
                                        i14 += i25 < 65536 ? 1 : 2;
                                        G0 g04 = G0.f406611a;
                                        i13 += 4;
                                        i15 = i12;
                                    } else if (i15 != 64) {
                                        break;
                                    }
                                } else if (i15 != 64) {
                                    break;
                                }
                            } else if (i15 != 64) {
                                break;
                            }
                        } else if (i15 != 64) {
                            break;
                        }
                    } else if (i15 != 64) {
                        break;
                    }
                } else if (i15 != 64) {
                    break;
                }
            } else if (i15 != 64) {
                break;
            }
        }
        i14 = -1;
        if (i14 != -1) {
            String strT = t();
            String strA0 = C43066x.a0(C43066x.a0(C43066x.a0(strT.substring(0, i14), "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
            if (i14 >= strT.length()) {
                return C22491k0.a(']', "[text=", strA0);
            }
            return "[size=" + this.data.length + " text=" + strA0 + "…]";
        }
        if (this.data.length <= 64) {
            return "[hex=" + e() + ']';
        }
        StringBuilder sb2 = new StringBuilder("[size=");
        sb2.append(this.data.length);
        sb2.append(" hex=");
        int iD2 = 64 == C44799i.f420069b ? d() : 64;
        byte[] bArr2 = this.data;
        if (iD2 > bArr2.length) {
            throw new IllegalArgumentException(androidx.appcompat.app.r.t(new StringBuilder("endIndex > length("), this.data.length, ')').toString());
        }
        if (iD2 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        sb2.append((iD2 == bArr2.length ? this : new C44805o(C42756l.t(0, iD2, bArr2))).e());
        sb2.append("…]");
        return sb2.toString();
    }

    public void u(int i12, @Y61.k C44802l c44802l) {
        c44802l.write(this.data, 0, i12);
    }
}
