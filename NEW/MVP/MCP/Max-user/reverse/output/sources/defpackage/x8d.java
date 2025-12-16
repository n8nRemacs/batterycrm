package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class x8d implements Comparable, CharSequence, Serializable {
    public final CharSequence a;

    public x8d(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.a.charAt(i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a.toString().compareTo(((x8d) obj).a.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x8d) {
            return fni.a(this.a.toString(), ((x8d) obj).a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + x8d.class.hashCode();
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.a.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.a.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.a.toString();
    }
}
