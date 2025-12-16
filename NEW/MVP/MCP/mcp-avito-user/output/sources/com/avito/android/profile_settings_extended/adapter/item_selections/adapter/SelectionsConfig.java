package com.avito.android.profile_settings_extended.adapter.item_selections.adapter;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectionsConfig.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/item_selections/adapter/SelectionsConfig;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SelectionsConfig implements Parcelable {

    @k
    public static final Parcelable.Creator<SelectionsConfig> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229528b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f229529c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f229530d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Integer f229531e;

    /* renamed from: f, reason: collision with root package name */
    public final int f229532f;

    /* renamed from: g, reason: collision with root package name */
    public final int f229533g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ArrayList f229534h;

    /* compiled from: SelectionsConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectionsConfig> {
        @Override // android.os.Parcelable.Creator
        public final SelectionsConfig createFromParcel(Parcel parcel) {
            return new SelectionsConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectionsConfig[] newArray(int i12) {
            return new SelectionsConfig[i12];
        }
    }

    public SelectionsConfig(@k String str, @l String str2, @l String str3, @l Integer num, int i12, int i13, @k ArrayList arrayList) {
        this.f229528b = str;
        this.f229529c = str2;
        this.f229530d = str3;
        this.f229531e = num;
        this.f229532f = i12;
        this.f229533g = i13;
        this.f229534h = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionsConfig)) {
            return false;
        }
        SelectionsConfig selectionsConfig = (SelectionsConfig) obj;
        return L.f(this.f229528b, selectionsConfig.f229528b) && L.f(this.f229529c, selectionsConfig.f229529c) && L.f(this.f229530d, selectionsConfig.f229530d) && L.f(this.f229531e, selectionsConfig.f229531e) && this.f229532f == selectionsConfig.f229532f && this.f229533g == selectionsConfig.f229533g && L.f(this.f229534h, selectionsConfig.f229534h);
    }

    public final int hashCode() {
        int iHashCode = this.f229528b.hashCode() * 31;
        String str = this.f229529c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f229530d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f229531e;
        return this.f229534h.hashCode() + r.e(this.f229533g, r.e(this.f229532f, (iHashCode3 + (num != null ? num.hashCode() : 0)) * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionsConfig(userKey=");
        sb2.append(this.f229528b);
        sb2.append(", form=");
        sb2.append(this.f229529c);
        sb2.append(", fromPage=");
        sb2.append(this.f229530d);
        sb2.append(", pageSize=");
        sb2.append(this.f229531e);
        sb2.append(", minItemsInSelection=");
        sb2.append(this.f229532f);
        sb2.append(", maxItemsInSelection=");
        sb2.append(this.f229533g);
        sb2.append(", valuesIdOrder=");
        return e.p(sb2, this.f229534h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229528b);
        parcel.writeString(this.f229529c);
        parcel.writeString(this.f229530d);
        Integer num = this.f229531e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeInt(this.f229532f);
        parcel.writeInt(this.f229533g);
        parcel.writeStringList(this.f229534h);
    }
}
