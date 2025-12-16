package net.bytebuddy.jar.asm;

/* compiled from: Attribute.java */
/* renamed from: net.bytebuddy.jar.asm.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44390c {

    /* renamed from: a, reason: collision with root package name */
    public final String f418160a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f418161b;

    /* renamed from: c, reason: collision with root package name */
    public C44390c f418162c;

    /* compiled from: Attribute.java */
    /* renamed from: net.bytebuddy.jar.asm.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f418163a;

        /* renamed from: b, reason: collision with root package name */
        public C44390c[] f418164b = new C44390c[6];

        public final void a(C44390c c44390c) {
            while (c44390c != null) {
                int i12 = 0;
                while (true) {
                    int i13 = this.f418163a;
                    if (i12 >= i13) {
                        C44390c[] c44390cArr = this.f418164b;
                        if (i13 >= c44390cArr.length) {
                            C44390c[] c44390cArr2 = new C44390c[c44390cArr.length + 6];
                            System.arraycopy(c44390cArr, 0, c44390cArr2, 0, i13);
                            this.f418164b = c44390cArr2;
                        }
                        C44390c[] c44390cArr3 = this.f418164b;
                        int i14 = this.f418163a;
                        this.f418163a = i14 + 1;
                        c44390cArr3[i14] = c44390c;
                    } else if (this.f418164b[i12].f418160a.equals(c44390c.f418160a)) {
                        break;
                    } else {
                        i12++;
                    }
                }
                c44390c = c44390c.f418162c;
            }
        }
    }

    public C44390c(String str) {
        this.f418160a = str;
    }

    public static int a(A a12, int i12, int i13) {
        int i14;
        if ((i12 & 4096) == 0 || a12.f418123c >= 49) {
            i14 = 0;
        } else {
            a12.j("Synthetic");
            i14 = 6;
        }
        if (i13 != 0) {
            a12.j("Signature");
            i14 += 8;
        }
        if ((i12 & 131072) == 0) {
            return i14;
        }
        a12.j("Deprecated");
        return i14 + 6;
    }

    public static void b(A a12, int i12, int i13, C44391d c44391d) {
        if ((i12 & 4096) != 0 && a12.f418123c < 49) {
            c44391d.j(a12.j("Synthetic"));
            c44391d.i(0);
        }
        if (i13 != 0) {
            c44391d.j(a12.j("Signature"));
            c44391d.i(2);
            c44391d.j(i13);
        }
        if ((i12 & 131072) != 0) {
            c44391d.j(a12.j("Deprecated"));
            c44391d.i(0);
        }
    }

    public C44390c c(e eVar, int i12, int i13, char[] cArr) {
        C44390c c44390c = new C44390c(this.f418160a);
        byte[] bArr = new byte[i13];
        c44390c.f418161b = bArr;
        System.arraycopy(eVar.f418168b, i12, bArr, 0, i13);
        return c44390c;
    }

    public C44391d d(g gVar) {
        byte[] bArr = this.f418161b;
        C44391d c44391d = new C44391d();
        c44391d.f418165a = bArr;
        c44391d.f418166b = bArr.length;
        return c44391d;
    }
}
