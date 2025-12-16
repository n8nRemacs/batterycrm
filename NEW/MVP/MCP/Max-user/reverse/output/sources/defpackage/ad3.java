package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* loaded from: classes2.dex */
public final class ad3 extends CharacterStyle implements UpdateAppearance, Parcelable, ep8 {
    public static final Parcelable.Creator<ad3> CREATOR = new e8(21);
    public final int a;
    public final int b;

    public /* synthetic */ ad3() {
        this(-65536);
    }

    @Override // defpackage.g74
    public final g74 copy() {
        return new ad3();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ep8
    public final int getType() {
        return this.b;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public ad3(int i) {
        this.a = i;
        this.b = 9;
    }

    public ad3(Parcel parcel) {
        this(parcel.readInt());
    }
}
