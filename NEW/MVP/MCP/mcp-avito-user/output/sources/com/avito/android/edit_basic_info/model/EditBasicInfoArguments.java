package com.avito.android.edit_basic_info.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.basic_info_v2.BasicInfoV2Item;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditBasicInfoArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_basic_info/model/EditBasicInfoArguments;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EditBasicInfoArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<EditBasicInfoArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final BasicInfoV2Item f146101b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f146102c;

    /* compiled from: EditBasicInfoArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EditBasicInfoArguments> {
        @Override // android.os.Parcelable.Creator
        public final EditBasicInfoArguments createFromParcel(Parcel parcel) {
            return new EditBasicInfoArguments(BasicInfoV2Item.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EditBasicInfoArguments[] newArray(int i12) {
            return new EditBasicInfoArguments[i12];
        }
    }

    public EditBasicInfoArguments(@k BasicInfoV2Item basicInfoV2Item, @k String str) {
        this.f146101b = basicInfoV2Item;
        this.f146102c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditBasicInfoArguments)) {
            return false;
        }
        EditBasicInfoArguments editBasicInfoArguments = (EditBasicInfoArguments) obj;
        return L.f(this.f146101b, editBasicInfoArguments.f146101b) && L.f(this.f146102c, editBasicInfoArguments.f146102c);
    }

    public final int hashCode() {
        return this.f146102c.hashCode() + (this.f146101b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EditBasicInfoArguments(item=");
        sb2.append(this.f146101b);
        sb2.append(", requestId=");
        return C22026a.c(sb2, this.f146102c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f146101b.writeToParcel(parcel, i12);
        parcel.writeString(this.f146102c);
    }
}
