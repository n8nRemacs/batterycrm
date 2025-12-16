package VX0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = 0;
        boolean zL2 = false;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            char c12 = (char) i12;
            if (c12 == 1) {
                iS2 = SafeParcelReader.s(parcel, i12);
            } else if (c12 != 2) {
                SafeParcelReader.x(parcel, i12);
            } else {
                zL2 = SafeParcelReader.l(parcel, i12);
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new ModuleInstallResponse(iS2, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new ModuleInstallResponse[i12];
    }
}
