package androidx.emoji2.text.flatbuffer;

import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;

/* loaded from: classes.dex */
public class FlexBuffers {

    /* renamed from: a, reason: collision with root package name */
    public static final C22942a f46085a;

    public static class FlexBufferException extends RuntimeException {
    }

    public static class a extends g {

        /* renamed from: e, reason: collision with root package name */
        public static final a f46086e = new a(FlexBuffers.f46085a, 1, 1);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public final StringBuilder a(StringBuilder sb2) {
            sb2.append('\"');
            sb2.append(this.f46090a.a(this.f46091b, this.f46099d));
            sb2.append('\"');
            return sb2;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public final String toString() {
            return this.f46090a.a(this.f46091b, this.f46099d);
        }
    }

    public static class b extends e {

        /* renamed from: d, reason: collision with root package name */
        public static final b f46087d = new b(FlexBuffers.f46085a, 0, 0);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public final StringBuilder a(StringBuilder sb2) {
            sb2.append(toString());
            return sb2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f46091b == this.f46091b && bVar.f46092c == this.f46092c;
        }

        public final int hashCode() {
            return this.f46091b ^ this.f46092c;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public final String toString() {
            int i12 = this.f46091b;
            int i13 = i12;
            while (true) {
                p pVar = this.f46090a;
                if (pVar.get(i13) == 0) {
                    return pVar.a(i12, i13 - i12);
                }
                i13++;
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final h f46088a;

        public c(h hVar) {
            this.f46088a = hVar;
        }

        public final String toString() throws NumberFormatException {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            int i12 = 0;
            while (true) {
                h hVar = this.f46088a;
                int i13 = hVar.f46099d;
                if (i12 >= i13) {
                    sb2.append("]");
                    return sb2.toString();
                }
                hVar.b(i12).d(sb2);
                if (i12 != i13 - 1) {
                    sb2.append(", ");
                }
                i12++;
            }
        }
    }

    public static class d extends j {

        /* renamed from: f, reason: collision with root package name */
        public static final d f46089f = new d(FlexBuffers.f46085a, 1, 1);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.j, androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public final StringBuilder a(StringBuilder sb2) {
            b bVar;
            sb2.append("{ ");
            int i12 = this.f46092c;
            int i13 = this.f46091b;
            int i14 = i13 - (i12 * 3);
            p pVar = this.f46090a;
            c cVar = new c(new h(pVar, FlexBuffers.a(pVar, i14, i12), (int) FlexBuffers.c(pVar, i14 + i12, i12), 4));
            j jVar = new j(pVar, i13, i12);
            int i15 = 0;
            while (true) {
                int i16 = this.f46099d;
                if (i15 >= i16) {
                    sb2.append(" }");
                    return sb2;
                }
                sb2.append('\"');
                h hVar = cVar.f46088a;
                if (i15 >= hVar.f46099d) {
                    bVar = b.f46087d;
                } else {
                    int i17 = hVar.f46091b;
                    int i18 = hVar.f46092c;
                    p pVar2 = hVar.f46090a;
                    bVar = new b(pVar2, FlexBuffers.a(pVar2, (i15 * i18) + i17, i18), 1);
                }
                sb2.append(bVar.toString());
                sb2.append("\" : ");
                sb2.append(jVar.b(i15).toString());
                if (i15 != i16 - 1) {
                    sb2.append(", ");
                }
                i15++;
            }
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public final p f46090a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46091b;

        /* renamed from: c, reason: collision with root package name */
        public final int f46092c;

        public e(p pVar, int i12, int i13) {
            this.f46090a = pVar;
            this.f46091b = i12;
            this.f46092c = i13;
        }

        public abstract StringBuilder a(StringBuilder sb2);

        public String toString() {
            return a(new StringBuilder(128)).toString();
        }
    }

    public static class f {

        /* renamed from: f, reason: collision with root package name */
        public static final f f46093f = new f(FlexBuffers.f46085a, 0, 1, 0);

        /* renamed from: a, reason: collision with root package name */
        public final p f46094a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46095b;

        /* renamed from: c, reason: collision with root package name */
        public final int f46096c;

        /* renamed from: d, reason: collision with root package name */
        public final int f46097d;

        /* renamed from: e, reason: collision with root package name */
        public final int f46098e;

        public f(p pVar, int i12, int i13, int i14) {
            this(pVar, i12, i13, 1 << (i14 & 3), i14 >> 2);
        }

        public final String a() {
            int i12 = this.f46098e;
            boolean z12 = i12 == 5;
            int i13 = this.f46097d;
            int i14 = this.f46095b;
            p pVar = this.f46094a;
            if (z12) {
                int iA2 = FlexBuffers.a(pVar, i14, this.f46096c);
                return pVar.a(iA2, (int) FlexBuffers.d(pVar, iA2 - i13, i13));
            }
            if (i12 != 4) {
                return "";
            }
            int iA3 = FlexBuffers.a(pVar, i14, i13);
            int i15 = iA3;
            while (pVar.get(i15) != 0) {
                i15++;
            }
            return pVar.a(iA3, i15 - iA3);
        }

        public final long b() {
            int i12 = this.f46095b;
            p pVar = this.f46094a;
            int i13 = this.f46096c;
            int i14 = this.f46098e;
            if (i14 == 2) {
                return FlexBuffers.d(pVar, i12, i13);
            }
            if (i14 == 1) {
                return FlexBuffers.c(pVar, i12, i13);
            }
            if (i14 == 3) {
                return (long) FlexBuffers.b(pVar, i12, i13);
            }
            if (i14 == 10) {
                return c().f46099d;
            }
            if (i14 == 26) {
                return (int) FlexBuffers.c(pVar, i12, i13);
            }
            if (i14 == 5) {
                return Long.parseLong(a());
            }
            int i15 = this.f46097d;
            if (i14 == 6) {
                return FlexBuffers.c(pVar, FlexBuffers.a(pVar, i12, i13), i15);
            }
            if (i14 == 7) {
                return FlexBuffers.d(pVar, FlexBuffers.a(pVar, i12, i13), i15);
            }
            if (i14 != 8) {
                return 0L;
            }
            return (long) FlexBuffers.b(pVar, FlexBuffers.a(pVar, i12, i13), i13);
        }

        public final j c() {
            int i12 = this.f46098e;
            int i13 = this.f46097d;
            int i14 = this.f46096c;
            int i15 = this.f46095b;
            p pVar = this.f46094a;
            return (i12 == 10 || i12 == 9) ? new j(pVar, FlexBuffers.a(pVar, i15, i14), i13) : i12 == 15 ? new h(pVar, FlexBuffers.a(pVar, i15, i14), i13, 4) : ((i12 < 11 || i12 > 15) && i12 != 36) ? j.f46101e : new h(pVar, FlexBuffers.a(pVar, i15, i14), i13, i12 - 10);
        }

        public final StringBuilder d(StringBuilder sb2) throws NumberFormatException {
            double dB2;
            int iC2;
            long jC2;
            int i12;
            double dB3;
            long jD2;
            int i13 = this.f46098e;
            if (i13 != 36) {
                int i14 = this.f46097d;
                int i15 = this.f46096c;
                int i16 = this.f46095b;
                p pVar = this.f46094a;
                long jD3 = 0;
                boolean z12 = true;
                switch (i13) {
                    case 0:
                        sb2.append("null");
                        return sb2;
                    case 1:
                    case 6:
                        if (i13 == 1) {
                            jD3 = FlexBuffers.c(pVar, i16, i15);
                        } else if (i13 != 2) {
                            if (i13 == 3) {
                                dB2 = FlexBuffers.b(pVar, i16, i15);
                            } else if (i13 == 5) {
                                try {
                                    jD3 = Long.parseLong(a());
                                } catch (NumberFormatException unused) {
                                }
                            } else if (i13 == 6) {
                                jD3 = FlexBuffers.c(pVar, FlexBuffers.a(pVar, i16, i15), i14);
                            } else if (i13 == 7) {
                                jD3 = FlexBuffers.d(pVar, FlexBuffers.a(pVar, i16, i15), i15);
                            } else if (i13 != 8) {
                                if (i13 == 10) {
                                    iC2 = c().f46099d;
                                } else if (i13 == 26) {
                                    iC2 = (int) FlexBuffers.c(pVar, i16, i15);
                                }
                                jD3 = iC2;
                            } else {
                                dB2 = FlexBuffers.b(pVar, FlexBuffers.a(pVar, i16, i15), i14);
                            }
                            jD3 = (long) dB2;
                        } else {
                            jD3 = FlexBuffers.d(pVar, i16, i15);
                        }
                        sb2.append(jD3);
                        return sb2;
                    case 2:
                    case 7:
                        sb2.append(b());
                        return sb2;
                    case 3:
                    case 8:
                        if (i13 == 3) {
                            dB3 = FlexBuffers.b(pVar, i16, i15);
                        } else {
                            if (i13 == 1) {
                                jC2 = FlexBuffers.c(pVar, i16, i15);
                            } else if (i13 == 2) {
                                jD2 = FlexBuffers.d(pVar, i16, i15);
                                dB3 = jD2;
                            } else if (i13 == 5) {
                                dB3 = Double.parseDouble(a());
                            } else if (i13 == 6) {
                                jC2 = FlexBuffers.c(pVar, FlexBuffers.a(pVar, i16, i15), i14);
                            } else if (i13 == 7) {
                                jD2 = FlexBuffers.d(pVar, FlexBuffers.a(pVar, i16, i15), i14);
                                dB3 = jD2;
                            } else if (i13 == 8) {
                                dB3 = FlexBuffers.b(pVar, FlexBuffers.a(pVar, i16, i15), i14);
                            } else if (i13 != 10) {
                                if (i13 != 26) {
                                    dB3 = 0.0d;
                                }
                                jD2 = FlexBuffers.d(pVar, i16, i15);
                                dB3 = jD2;
                            } else {
                                i12 = c().f46099d;
                                dB3 = i12;
                            }
                            i12 = (int) jC2;
                            dB3 = i12;
                        }
                        sb2.append(dB3);
                        return sb2;
                    case 4:
                        b bVar = i13 == 4 ? new b(pVar, FlexBuffers.a(pVar, i16, i15), i14) : b.f46087d;
                        sb2.append('\"');
                        bVar.a(sb2);
                        sb2.append('\"');
                        return sb2;
                    case 5:
                        sb2.append('\"');
                        sb2.append(a());
                        sb2.append('\"');
                        return sb2;
                    case 9:
                        (i13 == 9 ? new d(pVar, FlexBuffers.a(pVar, i16, i15), i14) : d.f46089f).a(sb2);
                        return sb2;
                    case 10:
                        c().a(sb2);
                        return sb2;
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                        throw new FlexBufferException(AK.c.g(i13, "not_implemented:"));
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        ((i13 == 25 || i13 == 5) ? new a(pVar, FlexBuffers.a(pVar, i16, i15), i14) : a.f46086e).a(sb2);
                        return sb2;
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        if (i13 != 26 ? b() == 0 : pVar.get(i16) == 0) {
                            z12 = false;
                        }
                        sb2.append(z12);
                        return sb2;
                    default:
                        return sb2;
                }
            }
            sb2.append(c());
            return sb2;
        }

        public final String toString() throws NumberFormatException {
            StringBuilder sb2 = new StringBuilder(128);
            d(sb2);
            return sb2.toString();
        }

        public f(p pVar, int i12, int i13, int i14, int i15) {
            this.f46094a = pVar;
            this.f46095b = i12;
            this.f46096c = i13;
            this.f46097d = i14;
            this.f46098e = i15;
        }
    }

    public static abstract class g extends e {

        /* renamed from: d, reason: collision with root package name */
        public final int f46099d;

        public g(p pVar, int i12, int i13) {
            super(pVar, i12, i13);
            this.f46099d = (int) FlexBuffers.c(pVar, i12 - i13, i13);
        }
    }

    public static class h extends j {

        /* renamed from: f, reason: collision with root package name */
        public final int f46100f;

        static {
            new h(FlexBuffers.f46085a, 1, 1, 1);
        }

        public h(p pVar, int i12, int i13, int i14) {
            super(pVar, i12, i13);
            this.f46100f = i14;
        }

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.j
        public final f b(int i12) {
            if (i12 >= this.f46099d) {
                return f.f46093f;
            }
            return new f(this.f46090a, (i12 * this.f46092c) + this.f46091b, this.f46092c, 1, this.f46100f);
        }
    }

    public static class i {
    }

    public static class j extends g {

        /* renamed from: e, reason: collision with root package name */
        public static final j f46101e = new j(FlexBuffers.f46085a, 1, 1);

        @Override // androidx.emoji2.text.flatbuffer.FlexBuffers.e
        public StringBuilder a(StringBuilder sb2) {
            sb2.append("[ ");
            int i12 = 0;
            while (true) {
                int i13 = this.f46099d;
                if (i12 >= i13) {
                    sb2.append(" ]");
                    return sb2;
                }
                b(i12).d(sb2);
                if (i12 != i13 - 1) {
                    sb2.append(", ");
                }
                i12++;
            }
        }

        public f b(int i12) {
            long j12 = this.f46099d;
            long j13 = i12;
            if (j13 >= j12) {
                return f.f46093f;
            }
            int i13 = this.f46091b;
            int i14 = this.f46092c;
            long j14 = j12 * i14;
            p pVar = this.f46090a;
            return new f(pVar, (i12 * i14) + i13, i14, pVar.get((int) (j14 + i13 + j13)) & 255);
        }
    }

    static {
        C22942a c22942a = new C22942a();
        c22942a.f46102a = new byte[]{0};
        f46085a = c22942a;
    }

    public static int a(p pVar, int i12, int i13) {
        return (int) (i12 - d(pVar, i12, i13));
    }

    public static double b(p pVar, int i12, int i13) {
        if (i13 == 4) {
            return pVar.getFloat(i12);
        }
        if (i13 != 8) {
            return -1.0d;
        }
        return pVar.getDouble(i12);
    }

    public static long c(p pVar, int i12, int i13) {
        int i14;
        if (i13 == 1) {
            i14 = pVar.get(i12);
        } else if (i13 == 2) {
            i14 = pVar.getShort(i12);
        } else {
            if (i13 != 4) {
                if (i13 != 8) {
                    return -1L;
                }
                return pVar.getLong(i12);
            }
            i14 = pVar.getInt(i12);
        }
        return i14;
    }

    public static long d(p pVar, int i12, int i13) {
        if (i13 == 1) {
            return pVar.get(i12) & 255;
        }
        if (i13 == 2) {
            return pVar.getShort(i12) & 65535;
        }
        if (i13 == 4) {
            return pVar.getInt(i12) & 4294967295L;
        }
        if (i13 != 8) {
            return -1L;
        }
        return pVar.getLong(i12);
    }
}
