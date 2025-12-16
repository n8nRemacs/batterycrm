package defpackage;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.NoSuchElementException;
import ru.ok.android.api.json.JsonStateException;
import ru.ok.android.api.json.JsonSyntaxException;

/* loaded from: classes2.dex */
public final class o2c extends e2 {
    public final Writer a;
    public final zf b;

    public o2c(Writer writer) {
        zf zfVar = new zf(1);
        this.b = zfVar;
        this.a = writer;
        zfVar.e(0);
    }

    public static String P(zf zfVar) {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        int i = zfVar.b;
        if (i < 0) {
            throw new IllegalArgumentException(ho7.f(i, "Illegal Capacity: "));
        }
        int[] iArr2 = new int[Math.max(i, 8)];
        int i2 = 0;
        while (zfVar.b != 0) {
            int iC = zfVar.c();
            int length = iArr2.length;
            if (i2 < length) {
                iArr = iArr2;
            } else {
                iArr = new int[length * 2];
                System.arraycopy(iArr2, 0, iArr, 0, length);
                iArr2 = iArr;
            }
            iArr2[i2] = iC;
            i2++;
            iArr2 = iArr;
        }
        while (i2 != 0) {
            if (i2 == 0) {
                throw new NoSuchElementException();
            }
            i2--;
            int i3 = iArr2[i2];
            String str = "";
            switch (i3) {
                case 0:
                case 1:
                    break;
                case 2:
                case 3:
                    str = "[";
                    break;
                case 4:
                case 6:
                    str = "{";
                    break;
                case 5:
                    str = "{:";
                    break;
                default:
                    throw new IllegalArgumentException(ho7.f(i3, ""));
            }
            sb.append(str);
            zfVar.e(i3);
        }
        return sb.toString();
    }

    @Override // defpackage.gy7
    public final void G(InputStreamReader inputStreamReader) throws IOException {
        w();
        zf zfVar = this.b;
        int iA = zfVar.a();
        Writer writer = this.a;
        if (iA == 2 || iA == 3) {
            cx7 cx7Var = new cx7(inputStreamReader);
            soi.d(cx7Var, writer);
            while (cx7Var.j0() != 0) {
                cx7Var.w(44);
                cx7Var.i(writer);
                soi.d(cx7Var, writer);
            }
            return;
        }
        if (iA != 6) {
            throw new JsonStateException("Nesting problem: " + P(zfVar));
        }
        cx7 cx7Var2 = new cx7(inputStreamReader);
        soi.d(cx7Var2, writer);
        if (cx7Var2.j0() == 0) {
            return;
        }
        throw JsonSyntaxException.b(cx7Var2.d, cx7Var2.P(), cx7Var2.j0());
    }

    @Override // defpackage.gy7
    public final gy7 b0(String str) throws IOException {
        zf zfVar = this.b;
        int iA = zfVar.a();
        Writer writer = this.a;
        if (iA == 6) {
            writer.write(44);
        } else if (iA != 4) {
            throw new JsonStateException("Nesting problem: " + P(zfVar));
        }
        zfVar.d(5);
        ooi.d(writer, str);
        return this;
    }

    @Override // defpackage.e2
    public final void c(String str) throws IOException {
        w();
        this.a.write(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
        if (this.b.a() != 1) {
            throw new JsonStateException("Unfinished document");
        }
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    @Override // defpackage.gy7
    public final void h(String str) throws IOException {
        w();
        ooi.d(this.a, str);
    }

    @Override // defpackage.gy7
    public final void n() throws IOException {
        y(4, 6);
        this.a.write(125);
    }

    @Override // defpackage.gy7
    public final void p() throws IOException {
        w();
        this.b.e(4);
        this.a.write(123);
    }

    @Override // defpackage.gy7
    public final void q() throws IOException {
        y(2, 3);
        this.a.write(93);
    }

    @Override // defpackage.gy7
    public final void r() throws IOException {
        w();
        this.b.e(2);
        this.a.write(91);
    }

    public final void w() throws IOException {
        zf zfVar = this.b;
        int iA = zfVar.a();
        if (iA == 0) {
            zfVar.d(1);
            return;
        }
        Writer writer = this.a;
        if (iA == 5) {
            writer.write(":");
            zfVar.d(6);
        } else if (iA == 2) {
            zfVar.d(3);
        } else if (iA == 3) {
            writer.write(44);
        } else {
            throw new JsonStateException("Nesting problem: " + P(zfVar));
        }
    }

    public final void y(int i, int i2) {
        zf zfVar = this.b;
        int iA = zfVar.a();
        if (iA == i2 || iA == i) {
            zfVar.c();
        } else {
            throw new JsonStateException("Nesting problem: " + P(zfVar));
        }
    }
}
