package com.avito.android.select.sectioned_multiselect.container.tab_layout;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.deprecated_design.tab.adapter.BaseTabItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContainerTabItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/container/tab_layout/ContainerTabItem;", "Lcom/avito/android/lib/deprecated_design/tab/adapter/BaseTabItem;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContainerTabItem extends BaseTabItem {

    @k
    public static final Parcelable.Creator<ContainerTabItem> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f266463d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f266464e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f266465f;

    /* compiled from: ContainerTabItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ContainerTabItem> {
        @Override // android.os.Parcelable.Creator
        public final ContainerTabItem createFromParcel(Parcel parcel) {
            return new ContainerTabItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ContainerTabItem[] newArray(int i12) {
            return new ContainerTabItem[i12];
        }
    }

    public ContainerTabItem(@l String str, @k String str2, @k String str3) {
        super(str2, null);
        this.f266463d = str;
        this.f266464e = str2;
        this.f266465f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContainerTabItem)) {
            return false;
        }
        ContainerTabItem containerTabItem = (ContainerTabItem) obj;
        return L.f(this.f266463d, containerTabItem.f266463d) && L.f(this.f266464e, containerTabItem.f266464e) && L.f(this.f266465f, containerTabItem.f266465f);
    }

    @Override // com.avito.android.lib.deprecated_design.tab.adapter.BaseTabItem, com.avito.android.lib.deprecated_design.tab.a
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF228383d() {
        return this.f266464e;
    }

    public final int hashCode() {
        String str = this.f266463d;
        return this.f266465f.hashCode() + H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f266464e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContainerTabItem(tabId=");
        sb2.append(this.f266463d);
        sb2.append(", title=");
        sb2.append(this.f266464e);
        sb2.append(", shortcut=");
        return C22026a.c(sb2, this.f266465f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f266463d);
        parcel.writeString(this.f266464e);
        parcel.writeString(this.f266465f);
    }
}
