package com.avito.android.remote.parse.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: AdvertCreditCompositeBroker.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/parse/adapter/CompositeBrokerEventParams;", "Landroid/os/Parcelable;", "", "fromPage", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CompositeBrokerEventParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CompositeBrokerEventParams> CREATOR = new a();

    @com.google.gson.annotations.c("fromPage")
    @Y61.l
    private final String fromPage;

    /* compiled from: AdvertCreditCompositeBroker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CompositeBrokerEventParams> {
        @Override // android.os.Parcelable.Creator
        public final CompositeBrokerEventParams createFromParcel(Parcel parcel) {
            return new CompositeBrokerEventParams(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CompositeBrokerEventParams[] newArray(int i12) {
            return new CompositeBrokerEventParams[i12];
        }
    }

    public CompositeBrokerEventParams(@Y61.l String str) {
        this.fromPage = str;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getFromPage() {
        return this.fromPage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CompositeBrokerEventParams) && kotlin.jvm.internal.L.f(this.fromPage, ((CompositeBrokerEventParams) obj).fromPage);
    }

    public final int hashCode() {
        String str = this.fromPage;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("CompositeBrokerEventParams(fromPage="), this.fromPage, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.fromPage);
    }
}
