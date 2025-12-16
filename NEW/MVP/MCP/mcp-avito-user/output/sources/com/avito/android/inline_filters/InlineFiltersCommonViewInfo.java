package com.avito.android.inline_filters;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: InlineFiltersCommonViewInfo.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/InlineFiltersCommonViewInfo;", "Landroid/os/Parcelable;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class InlineFiltersCommonViewInfo implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<InlineFiltersCommonViewInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f170991b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f170992c;

    /* compiled from: InlineFiltersCommonViewInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InlineFiltersCommonViewInfo> {
        @Override // android.os.Parcelable.Creator
        public final InlineFiltersCommonViewInfo createFromParcel(Parcel parcel) {
            return new InlineFiltersCommonViewInfo(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final InlineFiltersCommonViewInfo[] newArray(int i12) {
            return new InlineFiltersCommonViewInfo[i12];
        }
    }

    public InlineFiltersCommonViewInfo(@Y61.k String str, boolean z12) {
        this.f170991b = str;
        this.f170992c = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineFiltersCommonViewInfo)) {
            return false;
        }
        InlineFiltersCommonViewInfo inlineFiltersCommonViewInfo = (InlineFiltersCommonViewInfo) obj;
        return kotlin.jvm.internal.L.f(this.f170991b, inlineFiltersCommonViewInfo.f170991b) && this.f170992c == inlineFiltersCommonViewInfo.f170992c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f170992c) + (this.f170991b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InlineFiltersCommonViewInfo(applyButtonText=");
        sb2.append(this.f170991b);
        sb2.append(", resetButtonIsVisible=");
        return androidx.appcompat.app.r.x(sb2, this.f170992c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f170991b);
        parcel.writeInt(this.f170992c ? 1 : 0);
    }
}
