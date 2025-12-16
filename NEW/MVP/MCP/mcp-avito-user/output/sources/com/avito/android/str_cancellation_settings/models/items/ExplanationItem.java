package com.avito.android.str_cancellation_settings.models.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExplanationItem.kt */
@d
@H0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_cancellation_settings/models/items/ExplanationItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ExplanationItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<ExplanationItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f288408b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f288409c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f288410d;

    /* compiled from: ExplanationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExplanationItem> {
        @Override // android.os.Parcelable.Creator
        public final ExplanationItem createFromParcel(Parcel parcel) {
            return new ExplanationItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExplanationItem[] newArray(int i12) {
            return new ExplanationItem[i12];
        }
    }

    public ExplanationItem(@k String str, @k String str2, @k String str3) {
        this.f288408b = str;
        this.f288409c = str2;
        this.f288410d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExplanationItem)) {
            return false;
        }
        ExplanationItem explanationItem = (ExplanationItem) obj;
        return L.f(this.f288408b, explanationItem.f288408b) && L.f(this.f288409c, explanationItem.f288409c) && L.f(this.f288410d, explanationItem.f288410d);
    }

    @Override // TV0.a
    public final long getId() {
        return getF288408b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF288408b() {
        return this.f288408b;
    }

    public final int hashCode() {
        return this.f288410d.hashCode() + H.d(this.f288408b.hashCode() * 31, 31, this.f288409c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExplanationItem(stringId=");
        sb2.append(this.f288408b);
        sb2.append(", textIconName=");
        sb2.append(this.f288409c);
        sb2.append(", explanationText=");
        return C22026a.c(sb2, this.f288410d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f288408b);
        parcel.writeString(this.f288409c);
        parcel.writeString(this.f288410d);
    }
}
