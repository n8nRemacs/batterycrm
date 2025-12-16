package defpackage;

/* loaded from: classes2.dex */
public final class qn9 {
    public final CharSequence a;
    public final Integer b;

    public qn9(CharSequence charSequence, Integer num) {
        this.a = charSequence;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn9)) {
            return false;
        }
        qn9 qn9Var = (qn9) obj;
        return fni.a(this.a, qn9Var.a) && fni.a(this.b, qn9Var.b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "InputTextData(inputText=" + ((Object) this.a) + ", inputCursorPosition=" + this.b + ")";
    }
}
