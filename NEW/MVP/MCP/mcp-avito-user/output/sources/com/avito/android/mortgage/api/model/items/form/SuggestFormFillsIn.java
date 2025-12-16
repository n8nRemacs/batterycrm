package com.avito.android.mortgage.api.model.items.form;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestFormContentItemValue.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/mortgage/api/model/items/form/SuggestFormFillsIn;", "Landroid/os/Parcelable;", "", "id", "dataAttr", "", "isPrimary", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "c", "Z", "d", "()Z", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SuggestFormFillsIn implements Parcelable {

    @k
    public static final Parcelable.Creator<SuggestFormFillsIn> CREATOR = new a();

    @com.google.gson.annotations.c("dataAttr")
    @k
    private final String dataAttr;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("isPrimary")
    private final boolean isPrimary;

    /* compiled from: SuggestFormContentItemValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SuggestFormFillsIn> {
        @Override // android.os.Parcelable.Creator
        public final SuggestFormFillsIn createFromParcel(Parcel parcel) {
            return new SuggestFormFillsIn(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SuggestFormFillsIn[] newArray(int i12) {
            return new SuggestFormFillsIn[i12];
        }
    }

    public SuggestFormFillsIn(@k String str, @k String str2, boolean z12) {
        this.id = str;
        this.dataAttr = str2;
        this.isPrimary = z12;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getDataAttr() {
        return this.dataAttr;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestFormFillsIn)) {
            return false;
        }
        SuggestFormFillsIn suggestFormFillsIn = (SuggestFormFillsIn) obj;
        return L.f(this.id, suggestFormFillsIn.id) && L.f(this.dataAttr, suggestFormFillsIn.dataAttr) && this.isPrimary == suggestFormFillsIn.isPrimary;
    }

    @k
    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isPrimary) + H.d(this.id.hashCode() * 31, 31, this.dataAttr);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestFormFillsIn(id=");
        sb2.append(this.id);
        sb2.append(", dataAttr=");
        sb2.append(this.dataAttr);
        sb2.append(", isPrimary=");
        return r.x(sb2, this.isPrimary, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.dataAttr);
        parcel.writeInt(this.isPrimary ? 1 : 0);
    }
}
