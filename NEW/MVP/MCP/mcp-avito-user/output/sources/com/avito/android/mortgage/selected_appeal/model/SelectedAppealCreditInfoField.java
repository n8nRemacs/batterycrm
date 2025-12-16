package com.avito.android.mortgage.selected_appeal.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectedAppealCreditInfoField.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/selected_appeal/model/SelectedAppealCreditInfoField;", "Landroid/os/Parcelable;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SelectedAppealCreditInfoField implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f203449b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f203450c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f203448d = new a(null);

    @k
    public static final Parcelable.Creator<SelectedAppealCreditInfoField> CREATOR = new b();

    /* compiled from: SelectedAppealCreditInfoField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/selected_appeal/model/SelectedAppealCreditInfoField$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SelectedAppealCreditInfoField.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SelectedAppealCreditInfoField> {
        @Override // android.os.Parcelable.Creator
        public final SelectedAppealCreditInfoField createFromParcel(Parcel parcel) {
            return new SelectedAppealCreditInfoField(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectedAppealCreditInfoField[] newArray(int i12) {
            return new SelectedAppealCreditInfoField[i12];
        }
    }

    public SelectedAppealCreditInfoField(@k String str, @k String str2) {
        this.f203449b = str;
        this.f203450c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedAppealCreditInfoField)) {
            return false;
        }
        SelectedAppealCreditInfoField selectedAppealCreditInfoField = (SelectedAppealCreditInfoField) obj;
        return L.f(this.f203449b, selectedAppealCreditInfoField.f203449b) && L.f(this.f203450c, selectedAppealCreditInfoField.f203450c);
    }

    public final int hashCode() {
        return this.f203450c.hashCode() + (this.f203449b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectedAppealCreditInfoField(title=");
        sb2.append(this.f203449b);
        sb2.append(", value=");
        return C22026a.c(sb2, this.f203450c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f203449b);
        parcel.writeString(this.f203450c);
    }
}
