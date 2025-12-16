package com.avito.android.profile_settings_basic.adapter.progress_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_basic.adapter.BasicSettingsListItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProgressItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/adapter/progress_item/ProgressItem;", "Lcom/avito/android/profile_settings_basic/adapter/BasicSettingsListItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProgressItem implements BasicSettingsListItem {

    @k
    public static final Parcelable.Creator<ProgressItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f228665b;

    /* compiled from: ProgressItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProgressItem> {
        @Override // android.os.Parcelable.Creator
        public final ProgressItem createFromParcel(Parcel parcel) {
            return new ProgressItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProgressItem[] newArray(int i12) {
            return new ProgressItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProgressItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProgressItem) && L.f(this.f228665b, ((ProgressItem) obj).f228665b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF121506b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223392b() {
        return this.f228665b;
    }

    public final int hashCode() {
        return this.f228665b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ProgressItem(stringId="), this.f228665b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f228665b);
    }

    public ProgressItem(@k String str) {
        this.f228665b = str;
    }

    public /* synthetic */ ProgressItem(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "progress_item" : str);
    }
}
