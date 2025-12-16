package V91;

import android.os.Parcel;
import android.os.Parcelable;
import ru.mts.biometry.sdk.feature.main.entity.d;

/* loaded from: classes9.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new ru.mts.biometry.sdk.feature.main.entity.b(parcel.readInt() != 0, parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i12) {
        return new ru.mts.biometry.sdk.feature.main.entity.b[i12];
    }
}
