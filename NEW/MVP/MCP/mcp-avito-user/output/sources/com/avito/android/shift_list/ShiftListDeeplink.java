package com.avito.android.shift_list;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ShiftListDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/shift_list/ShiftListDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "_avito_gig_shift-list_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final class ShiftListDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<ShiftListDeeplink> CREATOR = new a();

    /* compiled from: ShiftListDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ShiftListDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final ShiftListDeeplink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new ShiftListDeeplink();
        }

        @Override // android.os.Parcelable.Creator
        public final ShiftListDeeplink[] newArray(int i12) {
            return new ShiftListDeeplink[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
