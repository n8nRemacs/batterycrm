package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public enum es2 implements Parcelable {
    DEFAULT,
    /* JADX INFO: Fake field, exist only in values array */
    SCHEDULED_SEND;

    public static final Parcelable.Creator<es2> CREATOR;
    public static final q85 b;
    public final bwf a = new bwf(new hk1(12, this));

    static {
        r8j r8jVar = rs4.d;
        b = new q85(16);
        CREATOR = new e8(19);
    }

    es2() {
        name().substring(0, 3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
