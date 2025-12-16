package defpackage;

import android.os.Parcel;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class r5g extends s5g {
    public static final q5g CREATOR = new q5g();
    public final CharSequence c;

    public r5g(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r5g) && fni.a(this.c, ((r5g) obj).c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.c;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final String toString() {
        return "SimpleText(text=" + ((Object) this.c) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.c, parcel, i);
    }
}
