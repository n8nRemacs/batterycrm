package com.google.android.play.core.splitinstall.internal;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public abstract class O extends j0 implements P {
    public O() {
        attachInterface(this, "com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // com.google.android.play.core.splitinstall.internal.j0
    public final boolean e4(Parcel parcel, int i12) {
        switch (i12) {
            case 2:
                int i13 = parcel.readInt();
                Bundle bundle = (Bundle) k0.a(parcel, Bundle.CREATOR);
                k0.b(parcel);
                e1(i13, bundle);
                return true;
            case 3:
                int i14 = parcel.readInt();
                k0.b(parcel);
                T(i14);
                return true;
            case 4:
                int i15 = parcel.readInt();
                Bundle bundle2 = (Bundle) k0.a(parcel, Bundle.CREATOR);
                k0.b(parcel);
                p0(i15, bundle2);
                return true;
            case 5:
                int i16 = parcel.readInt();
                Bundle bundle3 = (Bundle) k0.a(parcel, Bundle.CREATOR);
                k0.b(parcel);
                l1(i16, bundle3);
                return true;
            case 6:
                Bundle bundle4 = (Bundle) k0.a(parcel, Bundle.CREATOR);
                k0.b(parcel);
                i3(bundle4);
                return true;
            case 7:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                k0.b(parcel);
                U2(arrayListCreateTypedArrayList);
                return true;
            case 8:
                Bundle bundle5 = (Bundle) k0.a(parcel, Bundle.CREATOR);
                k0.b(parcel);
                p2(bundle5);
                return true;
            case 9:
                Bundle bundle6 = (Bundle) k0.a(parcel, Bundle.CREATOR);
                k0.b(parcel);
                k(bundle6);
                return true;
            case 10:
                k0.b(parcel);
                zzm();
                return true;
            case 11:
                k0.b(parcel);
                zzk();
                return true;
            case 12:
                Bundle bundle7 = (Bundle) k0.a(parcel, Bundle.CREATOR);
                k0.b(parcel);
                z2(bundle7);
                return true;
            case 13:
                Bundle bundle8 = (Bundle) k0.a(parcel, Bundle.CREATOR);
                k0.b(parcel);
                v2(bundle8);
                return true;
            default:
                return false;
        }
    }
}
