package io.ktor.http;

import io.ktor.utils.io.core.C41640m;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.ranges.C42837c;
import kotlin.text.C43047d;

/* compiled from: Codecs.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-http"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.http.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41508b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Set<Byte> f399935a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Set<Character> f399936b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final Set<Character> f399937c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final ArrayList f399938d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final Set<Character> f399939e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final ArrayList f399940f;

    /* compiled from: Codecs.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(B)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: io.ktor.http.b$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Byte, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f399941l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f399942m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(StringBuilder sb2, boolean z12) {
            super(1);
            this.f399941l = sb2;
            this.f399942m = z12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(Byte b12) {
            byte bByteValue = b12.byteValue();
            boolean zContains = C41508b.f399935a.contains(Byte.valueOf(bByteValue));
            StringBuilder sb2 = this.f399941l;
            if (zContains || C41508b.f399940f.contains(Byte.valueOf(bByteValue))) {
                sb2.append((char) bByteValue);
            } else if (this.f399942m && bByteValue == 32) {
                sb2.append('+');
            } else {
                sb2.append(C41508b.a(bByteValue));
            }
            return kotlin.G0.f406611a;
        }
    }

    static {
        ArrayList arrayListH0 = C42745f0.h0(new C42837c('0', '9'), C42745f0.f0(new C42837c('a', 'z'), new C42837c('A', 'Z')));
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListH0, 10));
        Iterator it = arrayListH0.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f399935a = C42745f0.P0(arrayList);
        f399936b = C42745f0.P0(C42745f0.h0(new C42837c('0', '9'), C42745f0.f0(new C42837c('a', 'z'), new C42837c('A', 'Z'))));
        f399937c = C42745f0.P0(C42745f0.h0(new C42837c('0', '9'), C42745f0.f0(new C42837c('a', 'f'), new C42837c('A', 'F'))));
        Set setL0 = C42756l.l0(new Character[]{':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', '.', '_', '~', '+'});
        ArrayList arrayList2 = new ArrayList(C42745f0.q(setL0, 10));
        Iterator it2 = setL0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        f399938d = arrayList2;
        f399939e = C42756l.l0(new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', '.', '_', '~'});
        kotlin.collections.b1.h(f399936b, C42756l.l0(new Character[]{'!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'}));
        List listU = C42745f0.U('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(C42745f0.q(listU, 10));
        Iterator it3 = listU.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        f399940f = arrayList3;
    }

    public static final String a(byte b12) {
        int i12 = (b12 & 255) >> 4;
        int i13 = b12 & 15;
        return new String(new char[]{'%', (char) ((i12 < 0 || i12 >= 10) ? ((char) (i12 + 65)) - '\n' : i12 + 48), (char) ((i13 < 0 || i13 >= 10) ? ((char) (i13 + 65)) - '\n' : i13 + 48)});
    }

    public static final int b(char c12) {
        if ('0' <= c12 && c12 < ':') {
            return c12 - '0';
        }
        if ('A' <= c12 && c12 < 'G') {
            return c12 - '7';
        }
        if ('a' > c12 || c12 >= 'g') {
            return -1;
        }
        return c12 - 'W';
    }

    public static final String c(String str, int i12, int i13, boolean z12, Charset charset) throws URLDecodeException {
        int i14 = i12;
        while (i14 < i13) {
            char cCharAt = str.charAt(i14);
            if (cCharAt == '%' || (z12 && cCharAt == '+')) {
                int i15 = i13 - i12;
                if (i15 > 255) {
                    i15 /= 3;
                }
                StringBuilder sb2 = new StringBuilder(i15);
                if (i14 > i12) {
                    sb2.append((CharSequence) str, i12, i14);
                }
                byte[] bArr = null;
                while (i14 < i13) {
                    char cCharAt2 = str.charAt(i14);
                    if (z12 && cCharAt2 == '+') {
                        sb2.append(' ');
                    } else if (cCharAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i13 - i14) / 3];
                        }
                        int i16 = 0;
                        while (i14 < i13 && str.charAt(i14) == '%') {
                            int i17 = i14 + 2;
                            if (i17 >= i13) {
                                throw new URLDecodeException("Incomplete trailing HEX escape: " + str.subSequence(i14, str.length()).toString() + ", in " + ((Object) str) + " at " + i14);
                            }
                            int i18 = i14 + 1;
                            int iB2 = b(str.charAt(i18));
                            int iB3 = b(str.charAt(i17));
                            if (iB2 == -1 || iB3 == -1) {
                                throw new URLDecodeException("Wrong HEX escape: %" + str.charAt(i18) + str.charAt(i17) + ", in " + ((Object) str) + ", at " + i14);
                            }
                            bArr[i16] = (byte) ((iB2 * 16) + iB3);
                            i14 += 3;
                            i16++;
                        }
                        sb2.append(new String(bArr, 0, i16, charset));
                    } else {
                        sb2.append(cCharAt2);
                    }
                    i14++;
                }
                return sb2.toString();
            }
            i14++;
        }
        return (i12 == 0 && i13 == str.length()) ? str.toString() : str.substring(i12, i13);
    }

    public static String d(String str) {
        return c(str, 0, str.length(), false, C43047d.f410589b);
    }

    public static String e(int i12, int i13, String str, int i14) {
        if ((i14 & 1) != 0) {
            i12 = 0;
        }
        if ((i14 & 2) != 0) {
            i13 = str.length();
        }
        return c(str, i12, i13, (i14 & 4) == 0, C43047d.f410589b);
    }

    @Y61.k
    public static final String f(@Y61.k String str, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = C43047d.f410589b.newEncoder();
        int length = str.length();
        C41640m c41640m = new C41640m(null, 1, null);
        try {
            W31.b.b(charsetEncoderNewEncoder, c41640m, str, 0, length);
            g(c41640m.y(), new a(sb2, z12));
            return sb2.toString();
        } catch (Throwable th2) {
            c41640m.close();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        throw new java.io.EOFException("No readable bytes available.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(io.ktor.utils.io.core.C41641n r4, Y41.l<? super java.lang.Byte, kotlin.G0> r5) {
        /*
            r0 = 1
            io.ktor.utils.io.core.internal.b r1 = r4.u(r0)
            if (r1 != 0) goto L8
            goto L32
        L8:
            int r2 = r1.f400876c     // Catch: java.lang.Throwable -> L22
            int r3 = r1.f400875b     // Catch: java.lang.Throwable -> L22
            if (r2 <= r3) goto L2c
            if (r3 == r2) goto L24
            int r2 = r3 + 1
            r1.f400875b = r2     // Catch: java.lang.Throwable -> L22
            java.nio.ByteBuffer r2 = r1.f400874a     // Catch: java.lang.Throwable -> L22
            byte r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)     // Catch: java.lang.Throwable -> L22
            r5.invoke(r2)     // Catch: java.lang.Throwable -> L22
            goto L8
        L22:
            r5 = move-exception
            goto L35
        L24:
            java.io.EOFException r5 = new java.io.EOFException     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "No readable bytes available."
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L22
            throw r5     // Catch: java.lang.Throwable -> L22
        L2c:
            io.ktor.utils.io.core.internal.b r1 = io.ktor.utils.io.core.internal.i.b(r4, r1)     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L8
        L32:
            return
        L33:
            r5 = move-exception
            r0 = 0
        L35:
            if (r0 == 0) goto L3a
            io.ktor.utils.io.core.internal.i.a(r4, r1)
        L3a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.C41508b.g(io.ktor.utils.io.core.n, Y41.l):void");
    }
}
