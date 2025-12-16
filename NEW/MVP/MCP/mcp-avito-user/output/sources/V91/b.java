package V91;

import android.os.Parcel;
import android.os.Parcelable;
import ru.mts.biometry.sdk.feature.main.entity.d;

/* loaded from: classes9.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new d(parcel.readInt() != 0, parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i12) {
        return new d[i12];
    }
}
