package defpackage;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonSyntaxException;

/* loaded from: classes2.dex */
public final class y97 extends e2 {
    public static final byte[] s0 = {110, 117, 108, 108};
    public final kkb X;
    public int Y;
    public boolean Z;
    public final OutputStream a;
    public final ArrayList b;
    public final String c;
    public final zf d = new zf(1);
    public final MessageDigest o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [yi9] */
    public y97(OutputStream outputStream, ArrayList arrayList, String str) throws NoSuchAlgorithmException {
        this.a = outputStream;
        this.b = arrayList;
        this.c = str;
        owg owgVar = new owg(0, outputStream);
        if (str != null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                this.o = messageDigest;
                owgVar = new yi9(owgVar, messageDigest);
            } catch (NoSuchAlgorithmException e) {
                throw new AssertionError(e);
            }
        } else {
            this.o = lia.a;
        }
        this.X = new kkb(owgVar);
    }

    @Override // defpackage.gy7
    public final void G(InputStreamReader inputStreamReader) throws IOException {
        w();
        zf zfVar = this.d;
        int iA = zfVar.a();
        kkb kkbVar = this.X;
        if (iA == 2 || iA == 5) {
            cx7 cx7Var = new cx7(inputStreamReader);
            soi.d(cx7Var, kkbVar);
            if (cx7Var.j0() == 0) {
                return;
            }
            throw JsonSyntaxException.b(cx7Var.d, cx7Var.P(), cx7Var.j0());
        }
        if (iA != 6 && iA != 7) {
            throw new JsonStateException("Nesting problem: ".concat(jbe.b(zfVar)));
        }
        cx7 cx7Var2 = new cx7(inputStreamReader);
        soi.d(cx7Var2, kkbVar);
        while (cx7Var2.j0() != 0) {
            cx7Var2.w(44);
            cx7Var2.i(kkbVar);
            soi.d(cx7Var2, kkbVar);
        }
    }

    @Override // defpackage.e2, defpackage.gy7
    public final void X() throws IOException {
        w();
        if (this.d.a() == 2) {
            this.o.update(s0);
            return;
        }
        kkb kkbVar = this.X;
        kkbVar.getClass();
        kkbVar.write("null", 0, 4);
    }

    @Override // defpackage.gy7
    public final gy7 b0(String str) {
        int i;
        int iA = this.d.a();
        if ((iA == 0 || iA == 2) && (i = this.Y) >= 0) {
            this.Y = -1;
            while (true) {
                ArrayList arrayList = this.b;
                if (i >= arrayList.size()) {
                    break;
                }
                omf omfVar = (omf) arrayList.get(i);
                int iCompareTo = str.compareTo(omfVar.a);
                if (iCompareTo < 0) {
                    break;
                }
                if (iCompareTo > 0) {
                    omfVar.a(this);
                }
                i++;
            }
            this.Y = i;
        }
        y(str);
        return this;
    }

    @Override // defpackage.e2
    public final void c(String str) throws IOException {
        w();
        kkb kkbVar = this.X;
        kkbVar.getClass();
        kkbVar.write(str, 0, str.length());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.X.close();
        int iA = this.d.a();
        if (iA != 0 && iA != 2) {
            throw new JsonStateException("Unfinished document");
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.X.flush();
    }

    @Override // defpackage.gy7
    public final void h(String str) {
        w();
        int iA = this.d.a();
        kkb kkbVar = this.X;
        if (iA != 2) {
            ooi.d(kkbVar, str);
            return;
        }
        if (str.length() == 0) {
            this.o.update(s0);
        }
        kkbVar.getClass();
        kkbVar.write(str, 0, str.length());
    }

    @Override // defpackage.gy7
    public final void n() {
        zf zfVar = this.d;
        int iA = zfVar.a();
        if (iA != 3 && iA != 5) {
            throw new JsonStateException("Nesting problem: ".concat(jbe.b(zfVar)));
        }
        zfVar.c();
        this.X.write(125);
    }

    @Override // defpackage.gy7
    public final void p() throws IOException {
        w();
        this.d.e(3);
        this.X.write(123);
    }

    @Override // defpackage.gy7
    public final void q() {
        zf zfVar = this.d;
        int iA = zfVar.a();
        if (iA != 6 && iA != 7) {
            throw new JsonStateException("Nesting problem: ".concat(jbe.b(zfVar)));
        }
        zfVar.c();
        this.X.write(93);
    }

    @Override // defpackage.gy7
    public final void r() throws IOException {
        w();
        this.d.e(6);
        this.X.write(91);
    }

    public final void w() throws IOException {
        zf zfVar = this.d;
        int iA = zfVar.a();
        if (iA == 1) {
            zfVar.d(2);
            this.a.write(61);
            this.o.update((byte) 61);
            return;
        }
        kkb kkbVar = this.X;
        if (iA == 4) {
            zfVar.d(5);
            kkbVar.write(58);
        } else if (iA == 6) {
            zfVar.d(7);
        } else {
            if (iA != 7) {
                throw new JsonStateException("Nesting problem: ".concat(jbe.b(zfVar)));
            }
            kkbVar.write(44);
        }
    }

    public final void y(String str) throws IOException {
        zf zfVar = this.d;
        int iA = zfVar.a();
        kkb kkbVar = this.X;
        if (iA == 0) {
            zfVar.d(1);
            kkbVar.write(str);
            return;
        }
        if (iA == 5) {
            kkbVar.write(44);
            zfVar.d(4);
            ooi.d(kkbVar, str);
        } else if (iA == 2) {
            this.a.write(38);
            zfVar.d(1);
            kkbVar.write(str);
        } else {
            if (iA != 3) {
                throw new JsonStateException("Nesting problem: ".concat(jbe.b(zfVar)));
            }
            zfVar.d(4);
            ooi.d(kkbVar, str);
        }
    }
}
