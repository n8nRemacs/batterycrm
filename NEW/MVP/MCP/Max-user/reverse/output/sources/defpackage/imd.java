package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class imd {
    public final ArrayList a;
    public final boolean b;

    public imd(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imd)) {
            return false;
        }
        imd imdVar = (imd) obj;
        return this.a.equals(imdVar.a) && this.b == imdVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReplyKeyboard(buttons=" + this.a + ", defaultInputDisabled=" + this.b + ")";
    }
}
