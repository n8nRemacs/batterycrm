package jY0;

import android.os.Parcel;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.signin.internal.zak;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* renamed from: jY0.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC42329d extends zab implements InterfaceC42330e {
    public AbstractBinderC42329d() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        switch (i12) {
            case 3:
                zac.zab(parcel);
                break;
            case 4:
                zac.zab(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                zac.zab(parcel);
                break;
            case 7:
                zac.zab(parcel);
                break;
            case 8:
                zak zakVar = (zak) zac.zaa(parcel, zak.CREATOR);
                zac.zab(parcel);
                T0(zakVar);
                break;
            case 9:
                zac.zab(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
