package com.avito.android.edit_count_field.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.count.CountItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditCountFieldArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_count_field/model/EditCountFieldArguments;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EditCountFieldArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<EditCountFieldArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CountItem f146623b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f146624c;

    /* compiled from: EditCountFieldArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EditCountFieldArguments> {
        @Override // android.os.Parcelable.Creator
        public final EditCountFieldArguments createFromParcel(Parcel parcel) {
            return new EditCountFieldArguments(CountItem.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EditCountFieldArguments[] newArray(int i12) {
            return new EditCountFieldArguments[i12];
        }
    }

    public EditCountFieldArguments(@k CountItem countItem, @k String str) {
        this.f146623b = countItem;
        this.f146624c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditCountFieldArguments)) {
            return false;
        }
        EditCountFieldArguments editCountFieldArguments = (EditCountFieldArguments) obj;
        return L.f(this.f146623b, editCountFieldArguments.f146623b) && L.f(this.f146624c, editCountFieldArguments.f146624c);
    }

    public final int hashCode() {
        return this.f146624c.hashCode() + (this.f146623b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EditCountFieldArguments(item=");
        sb2.append(this.f146623b);
        sb2.append(", requestId=");
        return C22026a.c(sb2, this.f146624c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f146623b.writeToParcel(parcel, i12);
        parcel.writeString(this.f146624c);
    }
}
