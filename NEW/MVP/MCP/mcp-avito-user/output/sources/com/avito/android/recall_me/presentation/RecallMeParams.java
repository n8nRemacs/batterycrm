package com.avito.android.recall_me.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RecallMeParams.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me/presentation/RecallMeParams;", "Lcom/avito/android/util/OpenParams;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RecallMeParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<RecallMeParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f251909b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f251910c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f251911d;

    /* compiled from: RecallMeParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RecallMeParams> {
        @Override // android.os.Parcelable.Creator
        public final RecallMeParams createFromParcel(Parcel parcel) {
            return new RecallMeParams(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecallMeParams[] newArray(int i12) {
            return new RecallMeParams[i12];
        }
    }

    public RecallMeParams(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        this.f251909b = str;
        this.f251910c = str2;
        this.f251911d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecallMeParams)) {
            return false;
        }
        RecallMeParams recallMeParams = (RecallMeParams) obj;
        return L.f(this.f251909b, recallMeParams.f251909b) && L.f(this.f251910c, recallMeParams.f251910c) && L.f(this.f251911d, recallMeParams.f251911d);
    }

    public final int hashCode() {
        int iHashCode = this.f251909b.hashCode() * 31;
        String str = this.f251910c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f251911d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecallMeParams(itemID=");
        sb2.append(this.f251909b);
        sb2.append(", channel=");
        sb2.append(this.f251910c);
        sb2.append(", buyerNeeds=");
        return C22026a.c(sb2, this.f251911d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f251909b);
        parcel.writeString(this.f251910c);
        parcel.writeString(this.f251911d);
    }
}
