package com.avito.android.recall_me.domain;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RecallMeFormState.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recall_me/domain/RecallMeFormState;", "Landroid/os/Parcelable;", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RecallMeFormState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<RecallMeFormState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public String f251830b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public String f251831c;

    /* compiled from: RecallMeFormState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RecallMeFormState> {
        @Override // android.os.Parcelable.Creator
        public final RecallMeFormState createFromParcel(Parcel parcel) {
            return new RecallMeFormState(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RecallMeFormState[] newArray(int i12) {
            return new RecallMeFormState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecallMeFormState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecallMeFormState)) {
            return false;
        }
        RecallMeFormState recallMeFormState = (RecallMeFormState) obj;
        return L.f(this.f251830b, recallMeFormState.f251830b) && L.f(this.f251831c, recallMeFormState.f251831c);
    }

    public final int hashCode() {
        String str = this.f251830b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f251831c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecallMeFormState(name=");
        sb2.append(this.f251830b);
        sb2.append(", phone=");
        return C22026a.c(sb2, this.f251831c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f251830b);
        parcel.writeString(this.f251831c);
    }

    public RecallMeFormState(@Y61.l String str, @Y61.l String str2) {
        this.f251830b = str;
        this.f251831c = str2;
    }

    public /* synthetic */ RecallMeFormState(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
    }
}
