package G91;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes9.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new ru.mts.biometry.sdk.domain.entity.selector.b(parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i12) {
        return new ru.mts.biometry.sdk.domain.entity.selector.b[i12];
    }
}
