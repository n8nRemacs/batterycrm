package com.avito.android.change_specific;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileChangeSpecificResult.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/change_specific/ExtendedProfileChangeSpecificResult;", "Landroid/os/Parcelable;", "()V", "OnlySelect", "Lcom/avito/android/change_specific/ExtendedProfileChangeSpecificResult$OnlySelect;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ExtendedProfileChangeSpecificResult implements Parcelable {

    /* compiled from: ExtendedProfileChangeSpecificResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/change_specific/ExtendedProfileChangeSpecificResult$OnlySelect;", "Lcom/avito/android/change_specific/ExtendedProfileChangeSpecificResult;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnlySelect extends ExtendedProfileChangeSpecificResult {

        @Y61.k
        public static final Parcelable.Creator<OnlySelect> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f117891b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f117892c;

        /* compiled from: ExtendedProfileChangeSpecificResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OnlySelect> {
            @Override // android.os.Parcelable.Creator
            public final OnlySelect createFromParcel(Parcel parcel) {
                return new OnlySelect(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OnlySelect[] newArray(int i12) {
                return new OnlySelect[i12];
            }
        }

        public OnlySelect(int i12, @Y61.k String str) {
            super(null);
            this.f117891b = i12;
            this.f117892c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnlySelect)) {
                return false;
            }
            OnlySelect onlySelect = (OnlySelect) obj;
            return this.f117891b == onlySelect.f117891b && L.f(this.f117892c, onlySelect.f117892c);
        }

        public final int hashCode() {
            return this.f117892c.hashCode() + (Integer.hashCode(this.f117891b) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnlySelect(specificId=");
            sb2.append(this.f117891b);
            sb2.append(", specificTitle=");
            return C22026a.c(sb2, this.f117892c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f117891b);
            parcel.writeString(this.f117892c);
        }
    }

    public /* synthetic */ ExtendedProfileChangeSpecificResult(C42822w c42822w) {
        this();
    }

    public ExtendedProfileChangeSpecificResult() {
    }
}
