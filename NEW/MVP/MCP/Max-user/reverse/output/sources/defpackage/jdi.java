package defpackage;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class jdi extends uai implements vei {
    public static final /* synthetic */ int e = 0;
    public final /* synthetic */ p8g d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdi(p8g p8gVar) {
        super("com.google.android.gms.maps.model.internal.ITileProviderDelegate", 6);
        this.d = p8gVar;
    }

    @Override // defpackage.uai
    public final boolean T(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        int i2 = parcel.readInt();
        int i3 = parcel.readInt();
        int i4 = parcel.readInt();
        mgi.b(parcel);
        m8g m8gVarA = this.d.a(i2, i3, i4);
        parcel2.writeNoException();
        if (m8gVarA == null) {
            parcel2.writeInt(0);
            return true;
        }
        parcel2.writeInt(1);
        m8gVarA.writeToParcel(parcel2, 1);
        return true;
    }
}
