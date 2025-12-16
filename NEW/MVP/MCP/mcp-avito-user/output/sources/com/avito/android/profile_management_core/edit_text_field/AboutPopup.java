package com.avito.android.profile_management_core.edit_text_field;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: PopupTabs.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_management_core/edit_text_field/AboutPopup;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AboutPopup implements Parcelable {

    @k
    public static final Parcelable.Creator<AboutPopup> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f226608b;

    /* compiled from: PopupTabs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AboutPopup> {
        @Override // android.os.Parcelable.Creator
        public final AboutPopup createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AboutPopup.class, parcel, arrayList, iL2, 1);
            }
            return new AboutPopup(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AboutPopup[] newArray(int i12) {
            return new AboutPopup[i12];
        }
    }

    public AboutPopup(@k ArrayList arrayList) {
        this.f226608b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AboutPopup) && this.f226608b.equals(((AboutPopup) obj).f226608b);
    }

    public final int hashCode() {
        return this.f226608b.hashCode();
    }

    @k
    public final String toString() {
        return e.p(new StringBuilder("AboutPopup(tabs="), this.f226608b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f226608b, parcel);
        while (itZ.hasNext()) {
            parcel.writeParcelable((Parcelable) itZ.next(), i12);
        }
    }
}
