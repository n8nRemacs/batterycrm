package G91;

import android.os.Parcel;
import android.os.Parcelable;
import ru.mts.biometry.sdk.domain.entity.selector.d;

/* loaded from: classes9.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new d(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i12) {
        return new d[i12];
    }
}
