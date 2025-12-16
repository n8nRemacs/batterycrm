package com.google.android.play.core.assetpacks.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public abstract class x extends s implements y {
    public x() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    @Override // com.google.android.play.core.assetpacks.internal.s
    public final boolean e4(Parcel parcel, int i12) {
        switch (i12) {
            case 2:
                int i13 = parcel.readInt();
                Bundle bundle = (Bundle) t.a(parcel, Bundle.CREATOR);
                t.b(parcel);
                R0(i13, bundle);
                return true;
            case 3:
                int i14 = parcel.readInt();
                t.b(parcel);
                b(i14);
                return true;
            case 4:
                int i15 = parcel.readInt();
                t.b(parcel);
                p(i15);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                t.b(parcel);
                d2(arrayListCreateTypedArrayList);
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) t.a(parcel, creator);
                t.b(parcel);
                o2(bundle2);
                return true;
            case 7:
                Bundle bundle3 = (Bundle) t.a(parcel, Bundle.CREATOR);
                t.b(parcel);
                M2(bundle3);
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) t.a(parcel, creator2);
                t.b(parcel);
                A2(bundle4);
                return true;
            case 9:
            default:
                return false;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle5 = (Bundle) t.a(parcel, creator3);
                t.b(parcel);
                t2(bundle5);
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundle6 = (Bundle) t.a(parcel, creator4);
                Bundle bundle7 = (Bundle) t.a(parcel, creator4);
                t.b(parcel);
                i0(bundle6, bundle7);
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                Bundle bundle8 = (Bundle) t.a(parcel, creator5);
                Bundle bundle9 = (Bundle) t.a(parcel, creator5);
                t.b(parcel);
                G0(bundle8, bundle9);
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                Bundle bundle10 = (Bundle) t.a(parcel, creator6);
                Bundle bundle11 = (Bundle) t.a(parcel, creator6);
                t.b(parcel);
                i1(bundle10, bundle11);
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                t.b(parcel);
                l();
                return true;
            case 15:
                t.b(parcel);
                c();
                return true;
        }
    }
}
