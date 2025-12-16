package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class vnc {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public final dr6 h;

    public vnc(dr6 dr6Var) {
        dr6Var.getClass();
        this.h = dr6Var;
        this.c = 0;
        this.b = 0;
        this.d = 0;
        this.f = 0;
        this.e = 0;
        this.a = 0;
    }

    public final boolean a(y5c y5cVar) {
        int i;
        int i2 = this.e;
        while (this.a != 6 && (i = y5cVar.read()) != -1) {
            try {
                int i3 = this.c;
                this.c = i3 + 1;
                if (this.g) {
                    this.a = 6;
                    this.g = false;
                    return false;
                }
                int i4 = this.a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    this.a = 5;
                                } else if (i4 != 5) {
                                    l5j.f(false);
                                } else {
                                    int i5 = ((this.b << 8) + i) - 2;
                                    kj2.b(y5cVar, i5);
                                    this.c += i5;
                                    this.a = 2;
                                }
                            } else if (i == 255) {
                                this.a = 3;
                            } else if (i == 0) {
                                this.a = 2;
                            } else if (i == 217) {
                                this.g = true;
                                int i6 = i3 - 1;
                                int i7 = this.d;
                                if (i7 > 0) {
                                    this.f = i6;
                                }
                                this.d = i7 + 1;
                                this.e = i7;
                                this.a = 2;
                            } else {
                                if (i == 218) {
                                    int i8 = i3 - 1;
                                    int i9 = this.d;
                                    if (i9 > 0) {
                                        this.f = i8;
                                    }
                                    this.d = i9 + 1;
                                    this.e = i9;
                                }
                                if (i == 1 || ((i >= 208 && i <= 215) || i == 217 || i == 216)) {
                                    this.a = 2;
                                } else {
                                    this.a = 4;
                                }
                            }
                        } else if (i == 255) {
                            this.a = 3;
                        }
                    } else if (i == 216) {
                        this.a = 2;
                    } else {
                        this.a = 6;
                    }
                } else if (i == 255) {
                    this.a = 1;
                } else {
                    this.a = 6;
                }
                this.b = i;
            } catch (IOException e) {
                rei.g(e);
                throw null;
            }
        }
        return (this.a == 6 || this.e == i2) ? false : true;
    }

    public final boolean b(ce5 ce5Var) {
        if (this.a == 6 || ce5Var.y() <= this.c) {
            return false;
        }
        InputStream inputStreamW = ce5Var.w();
        inputStreamW.getClass();
        dr6 dr6Var = this.h;
        y5c y5cVar = new y5c(inputStreamW, (byte[]) dr6Var.get(16384), dr6Var);
        try {
            try {
                kj2.b(y5cVar, this.c);
                return a(y5cVar);
            } catch (IOException e) {
                rei.g(e);
                throw null;
            }
        } finally {
            xc3.b(y5cVar);
        }
    }
}
