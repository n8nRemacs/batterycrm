package OX0;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes6.dex */
public final class s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iY2 = SafeParcelReader.y(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        Uri uri = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        PublicKeyCredential publicKeyCredential = null;
        while (parcel.dataPosition() < iY2) {
            int i12 = parcel.readInt();
            switch ((char) i12) {
                case 1:
                    strF = SafeParcelReader.f(parcel, i12);
                    break;
                case 2:
                    strF2 = SafeParcelReader.f(parcel, i12);
                    break;
                case 3:
                    strF3 = SafeParcelReader.f(parcel, i12);
                    break;
                case 4:
                    strF4 = SafeParcelReader.f(parcel, i12);
                    break;
                case 5:
                    uri = (Uri) SafeParcelReader.e(parcel, i12, Uri.CREATOR);
                    break;
                case 6:
                    strF5 = SafeParcelReader.f(parcel, i12);
                    break;
                case 7:
                    strF6 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\b':
                    strF7 = SafeParcelReader.f(parcel, i12);
                    break;
                case '\t':
                    publicKeyCredential = (PublicKeyCredential) SafeParcelReader.e(parcel, i12, PublicKeyCredential.CREATOR);
                    break;
                default:
                    SafeParcelReader.x(parcel, i12);
                    break;
            }
        }
        SafeParcelReader.k(parcel, iY2);
        return new SignInCredential(strF, strF2, strF3, strF4, uri, strF5, strF6, strF7, publicKeyCredential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i12) {
        return new SignInCredential[i12];
    }
}
