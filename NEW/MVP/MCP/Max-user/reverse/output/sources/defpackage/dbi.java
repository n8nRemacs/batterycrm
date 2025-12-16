package defpackage;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class dbi extends uai {
    @Override // defpackage.uai
    public final boolean S(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                cbi.b(parcel);
                break;
            case 4:
                cbi.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                cbi.b(parcel);
                break;
            case 7:
                cbi.b(parcel);
                break;
            case 8:
                aci aciVar = (aci) cbi.a(parcel, aci.CREATOR);
                cbi.b(parcel);
                hbi hbiVar = (hbi) this;
                hbiVar.e.post(new c5e(hbiVar, aciVar, false, 10));
                break;
            case 9:
                cbi.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
