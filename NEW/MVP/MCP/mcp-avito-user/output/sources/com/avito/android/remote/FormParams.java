package com.avito.android.remote;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: ContactInfo.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/FormParams;", "Landroid/os/Parcelable;", "", "formTitle", "timeWithoutSelectorTip", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito-discouraged_avito-api_recall-me"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FormParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<FormParams> CREATOR = new a();

    @com.google.gson.annotations.c("formTitle")
    @Y61.k
    private final String formTitle;

    @com.google.gson.annotations.c("timeWithoutSelectorTip")
    @Y61.k
    private final String timeWithoutSelectorTip;

    /* compiled from: ContactInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FormParams> {
        @Override // android.os.Parcelable.Creator
        public final FormParams createFromParcel(Parcel parcel) {
            return new FormParams(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FormParams[] newArray(int i12) {
            return new FormParams[i12];
        }
    }

    public FormParams(@Y61.k String str, @Y61.k String str2) {
        this.formTitle = str;
        this.timeWithoutSelectorTip = str2;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getFormTitle() {
        return this.formTitle;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getTimeWithoutSelectorTip() {
        return this.timeWithoutSelectorTip;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormParams)) {
            return false;
        }
        FormParams formParams = (FormParams) obj;
        return kotlin.jvm.internal.L.f(this.formTitle, formParams.formTitle) && kotlin.jvm.internal.L.f(this.timeWithoutSelectorTip, formParams.timeWithoutSelectorTip);
    }

    public final int hashCode() {
        return this.timeWithoutSelectorTip.hashCode() + (this.formTitle.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FormParams(formTitle=");
        sb2.append(this.formTitle);
        sb2.append(", timeWithoutSelectorTip=");
        return C22026a.c(sb2, this.timeWithoutSelectorTip, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.formTitle);
        parcel.writeString(this.timeWithoutSelectorTip);
    }
}
