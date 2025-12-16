package z91;

import android.os.Parcel;
import android.os.Parcelable;
import ru.mts.biometry.sdk.OnboardingSettings;

/* loaded from: classes9.dex */
public final class u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new OnboardingSettings(parcel.readInt() != 0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i12) {
        return new OnboardingSettings[i12];
    }
}
