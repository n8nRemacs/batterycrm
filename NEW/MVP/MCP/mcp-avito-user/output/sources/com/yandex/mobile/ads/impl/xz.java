package com.yandex.mobile.ads.impl;

import com.adjust.sdk.Constants;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.yandex.mobile.ads.impl.a10;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import okhttp3.internal.http2.Http2;
import okio.C44802l;
import okio.C44805o;
import okio.InterfaceC44804n;

/* loaded from: classes8.dex */
public final class xz {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private static final ez[] f391843a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private static final Map<C44805o, Integer> f391844b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f391845c = 0;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f391846a;

        /* renamed from: b, reason: collision with root package name */
        private int f391847b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        private final ArrayList f391848c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        private final InterfaceC44804n f391849d;

        /* renamed from: e, reason: collision with root package name */
        @X41.f
        @Y61.k
        public ez[] f391850e;

        /* renamed from: f, reason: collision with root package name */
        private int f391851f;

        /* renamed from: g, reason: collision with root package name */
        @X41.f
        public int f391852g;

        /* renamed from: h, reason: collision with root package name */
        @X41.f
        public int f391853h;

        public /* synthetic */ a(a10.b bVar) {
            this(bVar, 4096);
        }

        private final C44805o b(int i12) throws IOException {
            if (i12 >= 0 && i12 <= xz.b().length - 1) {
                return xz.b()[i12].f385144a;
            }
            int length = this.f391851f + 1 + (i12 - xz.b().length);
            if (length >= 0) {
                ez[] ezVarArr = this.f391850e;
                if (length < ezVarArr.length) {
                    return ezVarArr[length].f385144a;
                }
            }
            StringBuilder sbA = Cif.a("Header index too large ");
            sbA.append(i12 + 1);
            throw new IOException(sbA.toString());
        }

        @Y61.k
        public final List<ez> a() {
            List<ez> listM0 = C42745f0.M0(this.f391848c);
            this.f391848c.clear();
            return listM0;
        }

        public final void c() {
            while (!this.f391849d.W2()) {
                int iA2 = qc1.a(this.f391849d.readByte());
                if (iA2 == 128) {
                    throw new IOException("index == 0");
                }
                if ((iA2 & 128) == 128) {
                    int iA3 = a(iA2, 127);
                    int i12 = iA3 - 1;
                    if (i12 < 0 || i12 > xz.b().length - 1) {
                        int length = this.f391851f + 1 + (i12 - xz.b().length);
                        if (length >= 0) {
                            ez[] ezVarArr = this.f391850e;
                            if (length < ezVarArr.length) {
                                this.f391848c.add(ezVarArr[length]);
                            }
                        }
                        StringBuilder sbA = Cif.a("Header index too large ");
                        sbA.append(iA3);
                        throw new IOException(sbA.toString());
                    }
                    this.f391848c.add(xz.b()[i12]);
                } else if (iA2 == 64) {
                    int i13 = xz.f391845c;
                    a(new ez(xz.a(b()), b()));
                } else if ((iA2 & 64) == 64) {
                    a(new ez(b(a(iA2, 63) - 1), b()));
                } else if ((iA2 & 32) == 32) {
                    int iA4 = a(iA2, 31);
                    this.f391847b = iA4;
                    if (iA4 < 0 || iA4 > this.f391846a) {
                        StringBuilder sbA2 = Cif.a("Invalid dynamic table size update ");
                        sbA2.append(this.f391847b);
                        throw new IOException(sbA2.toString());
                    }
                    int i14 = this.f391853h;
                    if (iA4 < i14) {
                        if (iA4 == 0) {
                            C42756l.y(null, this.f391850e);
                            this.f391851f = this.f391850e.length - 1;
                            this.f391852g = 0;
                            this.f391853h = 0;
                        } else {
                            a(i14 - iA4);
                        }
                    }
                } else if (iA2 == 16 || iA2 == 0) {
                    int i15 = xz.f391845c;
                    this.f391848c.add(new ez(xz.a(b()), b()));
                } else {
                    this.f391848c.add(new ez(b(a(iA2, 15) - 1), b()));
                }
            }
        }

        @X41.j
        public a(@Y61.k a10.b bVar, int i12) {
            this.f391846a = 4096;
            this.f391847b = i12;
            this.f391848c = new ArrayList();
            this.f391849d = new okio.Y(bVar);
            this.f391850e = new ez[8];
            this.f391851f = 7;
        }

        private final int a(int i12) {
            int i13;
            int i14 = 0;
            if (i12 > 0) {
                int length = this.f391850e.length;
                while (true) {
                    length--;
                    i13 = this.f391851f;
                    if (length < i13 || i12 <= 0) {
                        break;
                    }
                    int i15 = this.f391850e[length].f385146c;
                    i12 -= i15;
                    this.f391853h -= i15;
                    this.f391852g--;
                    i14++;
                }
                ez[] ezVarArr = this.f391850e;
                int i16 = i13 + 1;
                System.arraycopy(ezVarArr, i16, ezVarArr, i16 + i14, this.f391852g);
                this.f391851f += i14;
            }
            return i14;
        }

        @Y61.k
        public final C44805o b() {
            int iA2 = qc1.a(this.f391849d.readByte());
            boolean z12 = (iA2 & 128) == 128;
            long jA2 = a(iA2, 127);
            if (z12) {
                C44802l c44802l = new C44802l();
                int i12 = u10.f390415d;
                u10.a(this.f391849d, jA2, c44802l);
                return c44802l.W0(c44802l.f420125c);
            }
            return this.f391849d.W0(jA2);
        }

        private final void a(ez ezVar) {
            this.f391848c.add(ezVar);
            int i12 = ezVar.f385146c;
            int i13 = this.f391847b;
            if (i12 > i13) {
                C42756l.y(null, this.f391850e);
                this.f391851f = this.f391850e.length - 1;
                this.f391852g = 0;
                this.f391853h = 0;
                return;
            }
            a((this.f391853h + i12) - i13);
            int i14 = this.f391852g + 1;
            ez[] ezVarArr = this.f391850e;
            if (i14 > ezVarArr.length) {
                ez[] ezVarArr2 = new ez[ezVarArr.length * 2];
                System.arraycopy(ezVarArr, 0, ezVarArr2, ezVarArr.length, ezVarArr.length);
                this.f391851f = this.f391850e.length - 1;
                this.f391850e = ezVarArr2;
            }
            int i15 = this.f391851f;
            this.f391851f = i15 - 1;
            this.f391850e[i15] = ezVar;
            this.f391852g++;
            this.f391853h += i12;
        }

        public final int a(int i12, int i13) {
            int i14 = i12 & i13;
            if (i14 < i13) {
                return i14;
            }
            int i15 = 0;
            while (true) {
                int iA2 = qc1.a(this.f391849d.readByte());
                if ((iA2 & 128) == 0) {
                    return i13 + (iA2 << i15);
                }
                i13 += (iA2 & 127) << i15;
                i15 += 7;
            }
        }
    }

    static {
        ez ezVar = new ez(ez.f385143i, "");
        C44805o c44805o = ez.f385140f;
        ez ezVar2 = new ez(c44805o, "GET");
        ez ezVar3 = new ez(c44805o, "POST");
        C44805o c44805o2 = ez.f385141g;
        ez ezVar4 = new ez(c44805o2, "/");
        ez ezVar5 = new ez(c44805o2, "/index.html");
        C44805o c44805o3 = ez.f385142h;
        ez ezVar6 = new ez(c44805o3, "http");
        ez ezVar7 = new ez(c44805o3, Constants.SCHEME);
        C44805o c44805o4 = ez.f385139e;
        f391843a = new ez[]{ezVar, ezVar2, ezVar3, ezVar4, ezVar5, ezVar6, ezVar7, new ez(c44805o4, "200"), new ez(c44805o4, "204"), new ez(c44805o4, "206"), new ez(c44805o4, "304"), new ez(c44805o4, "400"), new ez(c44805o4, "404"), new ez(c44805o4, "500"), new ez("accept-charset", ""), new ez("accept-encoding", "gzip, deflate"), new ez("accept-language", ""), new ez("accept-ranges", ""), new ez("accept", ""), new ez("access-control-allow-origin", ""), new ez("age", ""), new ez("allow", ""), new ez("authorization", ""), new ez("cache-control", ""), new ez("content-disposition", ""), new ez("content-encoding", ""), new ez("content-language", ""), new ez("content-length", ""), new ez("content-location", ""), new ez("content-range", ""), new ez("content-type", ""), new ez("cookie", ""), new ez("date", ""), new ez("etag", ""), new ez("expect", ""), new ez("expires", ""), new ez(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, ""), new ez("host", ""), new ez("if-match", ""), new ez("if-modified-since", ""), new ez("if-none-match", ""), new ez("if-range", ""), new ez("if-unmodified-since", ""), new ez("last-modified", ""), new ez("link", ""), new ez("location", ""), new ez("max-forwards", ""), new ez("proxy-authenticate", ""), new ez("proxy-authorization", ""), new ez("range", ""), new ez("referer", ""), new ez("refresh", ""), new ez("retry-after", ""), new ez("server", ""), new ez("set-cookie", ""), new ez("strict-transport-security", ""), new ez("transfer-encoding", ""), new ez("user-agent", ""), new ez("vary", ""), new ez("via", ""), new ez("www-authenticate", "")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i12 = 0; i12 < 61; i12++) {
            ez[] ezVarArr = f391843a;
            if (!linkedHashMap.containsKey(ezVarArr[i12].f385144a)) {
                linkedHashMap.put(ezVarArr[i12].f385144a, Integer.valueOf(i12));
            }
        }
        f391844b = Collections.unmodifiableMap(linkedHashMap);
    }

    @Y61.k
    public static Map a() {
        return f391844b;
    }

    @Y61.k
    public static ez[] b() {
        return f391843a;
    }

    @Y61.k
    public static C44805o a(@Y61.k C44805o c44805o) throws IOException {
        int iD2 = c44805o.d();
        for (int i12 = 0; i12 < iD2; i12++) {
            byte bK2 = c44805o.k(i12);
            if (65 <= bK2 && bK2 <= 90) {
                StringBuilder sbA = Cif.a("PROTOCOL_ERROR response malformed: mixed case name: ");
                sbA.append(c44805o.t());
                throw new IOException(sbA.toString());
            }
        }
        return c44805o;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f391854a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private final C44802l f391855b;

        /* renamed from: c, reason: collision with root package name */
        private int f391856c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f391857d;

        /* renamed from: e, reason: collision with root package name */
        @X41.f
        public int f391858e;

        /* renamed from: f, reason: collision with root package name */
        @X41.f
        @Y61.k
        public ez[] f391859f;

        /* renamed from: g, reason: collision with root package name */
        private int f391860g;

        /* renamed from: h, reason: collision with root package name */
        @X41.f
        public int f391861h;

        /* renamed from: i, reason: collision with root package name */
        @X41.f
        public int f391862i;

        @X41.j
        public b(int i12, boolean z12, @Y61.k C44802l c44802l) {
            this.f391854a = z12;
            this.f391855b = c44802l;
            this.f391856c = Integer.MAX_VALUE;
            this.f391858e = i12;
            this.f391859f = new ez[8];
            this.f391860g = 7;
        }

        private final void a(int i12) {
            int i13;
            if (i12 > 0) {
                int length = this.f391859f.length - 1;
                int i14 = 0;
                while (true) {
                    i13 = this.f391860g;
                    if (length < i13 || i12 <= 0) {
                        break;
                    }
                    int i15 = this.f391859f[length].f385146c;
                    i12 -= i15;
                    this.f391862i -= i15;
                    this.f391861h--;
                    i14++;
                    length--;
                }
                ez[] ezVarArr = this.f391859f;
                int i16 = i13 + 1;
                System.arraycopy(ezVarArr, i16, ezVarArr, i16 + i14, this.f391861h);
                ez[] ezVarArr2 = this.f391859f;
                int i17 = this.f391860g + 1;
                Arrays.fill(ezVarArr2, i17, i17 + i14, (Object) null);
                this.f391860g += i14;
            }
        }

        public final void b(int i12) {
            int iMin = Math.min(i12, Http2.INITIAL_MAX_FRAME_SIZE);
            int i13 = this.f391858e;
            if (i13 == iMin) {
                return;
            }
            if (iMin < i13) {
                this.f391856c = Math.min(this.f391856c, iMin);
            }
            this.f391857d = true;
            this.f391858e = iMin;
            int i14 = this.f391862i;
            if (iMin < i14) {
                if (iMin != 0) {
                    a(i14 - iMin);
                    return;
                }
                C42756l.y(null, this.f391859f);
                this.f391860g = this.f391859f.length - 1;
                this.f391861h = 0;
                this.f391862i = 0;
            }
        }

        public /* synthetic */ b(C44802l c44802l) {
            this(4096, true, c44802l);
        }

        private final void a(ez ezVar) {
            int i12 = ezVar.f385146c;
            int i13 = this.f391858e;
            if (i12 > i13) {
                C42756l.y(null, this.f391859f);
                this.f391860g = this.f391859f.length - 1;
                this.f391861h = 0;
                this.f391862i = 0;
                return;
            }
            a((this.f391862i + i12) - i13);
            int i14 = this.f391861h + 1;
            ez[] ezVarArr = this.f391859f;
            if (i14 > ezVarArr.length) {
                ez[] ezVarArr2 = new ez[ezVarArr.length * 2];
                System.arraycopy(ezVarArr, 0, ezVarArr2, ezVarArr.length, ezVarArr.length);
                this.f391860g = this.f391859f.length - 1;
                this.f391859f = ezVarArr2;
            }
            int i15 = this.f391860g;
            this.f391860g = i15 - 1;
            this.f391859f[i15] = ezVar;
            this.f391861h++;
            this.f391862i += i12;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(@Y61.k java.util.ArrayList r14) throws java.io.EOFException {
            /*
                Method dump skipped, instructions count: 255
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.xz.b.a(java.util.ArrayList):void");
        }

        public final void a(int i12, int i13, int i14) {
            if (i12 < i13) {
                this.f391855b.D(i12 | i14);
                return;
            }
            this.f391855b.D(i14 | i13);
            int i15 = i12 - i13;
            while (i15 >= 128) {
                this.f391855b.D(128 | (i15 & 127));
                i15 >>>= 7;
            }
            this.f391855b.D(i15);
        }

        public final void a(@Y61.k C44805o c44805o) throws EOFException {
            if (this.f391854a && u10.a(c44805o) < c44805o.d()) {
                C44802l c44802l = new C44802l();
                u10.a(c44805o, c44802l);
                C44805o c44805oW0 = c44802l.W0(c44802l.f420125c);
                a(c44805oW0.d(), 127, 128);
                C44802l c44802l2 = this.f391855b;
                c44802l2.getClass();
                c44805oW0.u(c44805oW0.d(), c44802l2);
                return;
            }
            a(c44805o.d(), 127, 0);
            C44802l c44802l3 = this.f391855b;
            c44802l3.getClass();
            c44805o.u(c44805o.d(), c44802l3);
        }
    }
}
