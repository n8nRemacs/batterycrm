package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class l8f implements Iterator {
    public int X;
    public final /* synthetic */ kme Y;
    public String b;
    public final CharSequence c;
    public final za2 d;
    public int a = 2;
    public int o = 0;

    public l8f(kme kmeVar, lk6 lk6Var, CharSequence charSequence) {
        this.Y = kmeVar;
        this.d = (za2) lk6Var.c;
        this.X = lk6Var.b;
        this.c = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        za2 za2Var;
        int i = this.a;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iV = az1.v(i);
        if (iV == 0) {
            return true;
        }
        if (iV == 2) {
            return false;
        }
        this.a = 4;
        int i2 = this.o;
        while (true) {
            int length = this.o;
            if (length == -1) {
                this.a = 3;
                string = null;
                break;
            }
            ab2 ab2Var = (ab2) this.Y.b;
            CharSequence charSequence = this.c;
            int length2 = charSequence.length();
            u5j.f(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (ab2Var.a(charSequence.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = charSequence.length();
                this.o = -1;
            } else {
                this.o = length + 1;
            }
            int i3 = this.o;
            if (i3 == i2) {
                int i4 = i3 + 1;
                this.o = i4;
                if (i4 > charSequence.length()) {
                    this.o = -1;
                }
            } else {
                while (true) {
                    za2Var = this.d;
                    if (i2 >= length || !za2Var.a(charSequence.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
                while (length > i2 && za2Var.a(charSequence.charAt(length - 1))) {
                    length--;
                }
                int i5 = this.X;
                if (i5 == 1) {
                    length = charSequence.length();
                    this.o = -1;
                    while (length > i2 && za2Var.a(charSequence.charAt(length - 1))) {
                        length--;
                    }
                } else {
                    this.X = i5 - 1;
                }
                string = charSequence.subSequence(i2, length).toString();
            }
        }
        this.b = string;
        if (this.a == 3) {
            return false;
        }
        this.a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = 2;
        String str = this.b;
        this.b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
