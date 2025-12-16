package ZX0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.stats.WakeLockEvent;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        int iS2 = 0;
        int iS3 = 0;
        int iS4 = 0;
        int iS5 = 0;
        boolean zL2 = false;
        String strF = null;
        ArrayList<String> arrayListH = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        long jU2 = 0;
        long jU3 = 0;
        long jU4 = 0;
        float fP2 = 0.0f;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    iS2 = SafeParcelReader.s(parcel, i12);
                    break;
                case 2:
                    jU2 = SafeParcelReader.u(parcel, i12);
                    break;
                case 3:
                case 7:
                case '\t':
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
                case 4:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 5:
                    iS4 = SafeParcelReader.s(parcel, i12);
                    break;
                case 6:
                    arrayListH = SafeParcelReader.h(parcel, i12);
                    break;
                case '\b':
                    jU3 = SafeParcelReader.u(parcel, i12);
                    break;
                case '\n':
                    strF3 = SafeParcelReader.f(parcel, i12);
                    break;
                case 11:
                    iS3 = SafeParcelReader.s(parcel, i12);
                    break;
                case '\f':
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\r':
                    strF4 = SafeParcelReader.f(parcel, i12);
                    break;
                case 14:
                    iS5 = SafeParcelReader.s(parcel, i12);
                    break;
                case 15:
                    fP2 = SafeParcelReader.p(parcel, i12);
                    break;
                case 16:
                    jU4 = SafeParcelReader.u(parcel, i12);
                    break;
                case 17:
                    strF5 = SafeParcelReader.f(parcel, i12);
                    break;
                case 18:
                    zL2 = SafeParcelReader.l(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new WakeLockEvent(iS2, jU2, iS3, strF, iS4, arrayListH, strF2, jU3, iS5, strF3, strF4, fP2, jU4, strF5, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new WakeLockEvent[i12];
    }
}
