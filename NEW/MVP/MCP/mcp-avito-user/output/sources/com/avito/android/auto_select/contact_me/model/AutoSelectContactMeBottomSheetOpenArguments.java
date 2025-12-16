package com.avito.android.auto_select.contact_me.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectContactMeBottomSheetOpenArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_select/contact_me/model/AutoSelectContactMeBottomSheetOpenArguments;", "Lcom/avito/android/util/OpenParams;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AutoSelectContactMeBottomSheetOpenArguments implements OpenParams {

    @k
    public static final Parcelable.Creator<AutoSelectContactMeBottomSheetOpenArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f95987b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f95988c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f95989d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f95990e;

    /* compiled from: AutoSelectContactMeBottomSheetOpenArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoSelectContactMeBottomSheetOpenArguments> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectContactMeBottomSheetOpenArguments createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(AutoSelectContactMeContact.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new AutoSelectContactMeBottomSheetOpenArguments(string, string2, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectContactMeBottomSheetOpenArguments[] newArray(int i12) {
            return new AutoSelectContactMeBottomSheetOpenArguments[i12];
        }
    }

    public AutoSelectContactMeBottomSheetOpenArguments(@k String str, @k String str2, @k String str3, @k ArrayList arrayList) {
        this.f95987b = str;
        this.f95988c = str2;
        this.f95989d = str3;
        this.f95990e = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoSelectContactMeBottomSheetOpenArguments)) {
            return false;
        }
        AutoSelectContactMeBottomSheetOpenArguments autoSelectContactMeBottomSheetOpenArguments = (AutoSelectContactMeBottomSheetOpenArguments) obj;
        return L.f(this.f95987b, autoSelectContactMeBottomSheetOpenArguments.f95987b) && L.f(this.f95988c, autoSelectContactMeBottomSheetOpenArguments.f95988c) && L.f(this.f95989d, autoSelectContactMeBottomSheetOpenArguments.f95989d) && this.f95990e.equals(autoSelectContactMeBottomSheetOpenArguments.f95990e);
    }

    public final int hashCode() {
        return this.f95990e.hashCode() + H.d(H.d(this.f95987b.hashCode() * 31, 31, this.f95988c), 31, this.f95989d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoSelectContactMeBottomSheetOpenArguments(requestKey=");
        sb2.append(this.f95987b);
        sb2.append(", advertId=");
        sb2.append(this.f95988c);
        sb2.append(", title=");
        sb2.append(this.f95989d);
        sb2.append(", contacts=");
        return e.p(sb2, this.f95990e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f95987b);
        parcel.writeString(this.f95988c);
        parcel.writeString(this.f95989d);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f95990e, parcel);
        while (itZ.hasNext()) {
            ((AutoSelectContactMeContact) itZ.next()).writeToParcel(parcel, i12);
        }
    }
}
