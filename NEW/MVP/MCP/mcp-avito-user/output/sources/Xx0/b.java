package XX0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zac;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        ArrayList arrayListJ = null;
        int iS2 = 0;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                iS2 = SafeParcelReader.s(parcel, i12);
            } else if (c12 != 2) {
                SafeParcelReader.x(parcel, i12);
            } else {
                arrayListJ = SafeParcelReader.j(parcel, i12, zac.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new StringToIntConverter(iS2, arrayListJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new StringToIntConverter[i12];
    }
}
