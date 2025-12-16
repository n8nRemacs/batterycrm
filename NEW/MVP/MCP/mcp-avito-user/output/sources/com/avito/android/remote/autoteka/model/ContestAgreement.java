package com.avito.android.remote.autoteka.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPurchaseResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/autoteka/model/ContestAgreement;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "", "isChecked", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Z)V", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Z", "()Z", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ContestAgreement implements Parcelable {

    @k
    public static final Parcelable.Creator<ContestAgreement> CREATOR = new a();

    @c("isChecked")
    private final boolean isChecked;

    @c("text")
    @k
    private final AttributedText text;

    /* compiled from: AutotekaPurchaseResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ContestAgreement> {
        @Override // android.os.Parcelable.Creator
        public final ContestAgreement createFromParcel(Parcel parcel) {
            return new ContestAgreement((AttributedText) parcel.readParcelable(ContestAgreement.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ContestAgreement[] newArray(int i12) {
            return new ContestAgreement[i12];
        }
    }

    public ContestAgreement(@k AttributedText attributedText, boolean z12) {
        this.text = attributedText;
        this.isChecked = z12;
    }

    public static ContestAgreement a(ContestAgreement contestAgreement, boolean z12) {
        AttributedText attributedText = contestAgreement.text;
        contestAgreement.getClass();
        return new ContestAgreement(attributedText, z12);
    }

    @k
    /* renamed from: c, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContestAgreement)) {
            return false;
        }
        ContestAgreement contestAgreement = (ContestAgreement) obj;
        return L.f(this.text, contestAgreement.text) && this.isChecked == contestAgreement.isChecked;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isChecked) + (this.text.hashCode() * 31);
    }

    /* renamed from: isChecked, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContestAgreement(text=");
        sb2.append(this.text);
        sb2.append(", isChecked=");
        return r.x(sb2, this.isChecked, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.text, i12);
        parcel.writeInt(this.isChecked ? 1 : 0);
    }
}
