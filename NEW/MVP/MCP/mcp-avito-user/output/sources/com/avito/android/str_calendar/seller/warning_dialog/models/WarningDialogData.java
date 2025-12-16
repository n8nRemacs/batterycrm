package com.avito.android.str_calendar.seller.warning_dialog.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WarningDialogData.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/warning_dialog/models/WarningDialogData;", "Landroid/os/Parcelable;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class WarningDialogData implements Parcelable {

    @k
    public static final Parcelable.Creator<WarningDialogData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f288092b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<WarningDialogCondition> f288093c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final WarningDialogActions f288094d;

    /* compiled from: WarningDialogData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WarningDialogData> {
        @Override // android.os.Parcelable.Creator
        public final WarningDialogData createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(WarningDialogCondition.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new WarningDialogData(string, arrayList, WarningDialogActions.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final WarningDialogData[] newArray(int i12) {
            return new WarningDialogData[i12];
        }
    }

    public WarningDialogData(@k String str, @k List<WarningDialogCondition> list, @k WarningDialogActions warningDialogActions) {
        this.f288092b = str;
        this.f288093c = list;
        this.f288094d = warningDialogActions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WarningDialogData)) {
            return false;
        }
        WarningDialogData warningDialogData = (WarningDialogData) obj;
        return L.f(this.f288092b, warningDialogData.f288092b) && L.f(this.f288093c, warningDialogData.f288093c) && L.f(this.f288094d, warningDialogData.f288094d);
    }

    public final int hashCode() {
        return this.f288094d.hashCode() + H.e(this.f288092b.hashCode() * 31, 31, this.f288093c);
    }

    @k
    public final String toString() {
        return "WarningDialogData(title=" + this.f288092b + ", conditions=" + this.f288093c + ", actions=" + this.f288094d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f288092b);
        Iterator itJ = C0.j(this.f288093c, parcel);
        while (itJ.hasNext()) {
            ((WarningDialogCondition) itJ.next()).writeToParcel(parcel, i12);
        }
        this.f288094d.writeToParcel(parcel, i12);
    }
}
