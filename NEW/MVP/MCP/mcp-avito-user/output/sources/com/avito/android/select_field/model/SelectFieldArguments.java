package com.avito.android.select_field.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.select.SelectItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectFieldArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_field/model/SelectFieldArguments;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelectFieldArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<SelectFieldArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SelectItem f267179b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f267180c;

    /* compiled from: SelectFieldArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectFieldArguments> {
        @Override // android.os.Parcelable.Creator
        public final SelectFieldArguments createFromParcel(Parcel parcel) {
            return new SelectFieldArguments(SelectItem.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectFieldArguments[] newArray(int i12) {
            return new SelectFieldArguments[i12];
        }
    }

    public SelectFieldArguments(@k SelectItem selectItem, @k String str) {
        this.f267179b = selectItem;
        this.f267180c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectFieldArguments)) {
            return false;
        }
        SelectFieldArguments selectFieldArguments = (SelectFieldArguments) obj;
        return L.f(this.f267179b, selectFieldArguments.f267179b) && L.f(this.f267180c, selectFieldArguments.f267180c);
    }

    public final int hashCode() {
        return this.f267180c.hashCode() + (this.f267179b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectFieldArguments(item=");
        sb2.append(this.f267179b);
        sb2.append(", requestId=");
        return C22026a.c(sb2, this.f267180c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f267179b.writeToParcel(parcel, i12);
        parcel.writeString(this.f267180c);
    }
}
