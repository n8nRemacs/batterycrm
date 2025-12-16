package com.avito.android.mortgage.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MortgageVerificationFlow.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/mortgage/api/model/MortgageVerificationFlow;", "Landroid/os/Parcelable;", "", "imageUrl", "title", "description", "Lcom/avito/android/mortgage/api/model/ActionButton;", "primaryAction", "secondaryAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/mortgage/api/model/ActionButton;Lcom/avito/android/mortgage/api/model/ActionButton;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getTitle", "getDescription", "Lcom/avito/android/mortgage/api/model/ActionButton;", "d", "()Lcom/avito/android/mortgage/api/model/ActionButton;", "e", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MortgageVerificationFlow implements Parcelable {

    @k
    public static final Parcelable.Creator<MortgageVerificationFlow> CREATOR = new a();

    @c("description")
    @l
    private final String description;

    @c("image")
    @l
    private final String imageUrl;

    @c("primaryAction")
    @l
    private final ActionButton primaryAction;

    @c("secondaryAction")
    @l
    private final ActionButton secondaryAction;

    @c("title")
    @k
    private final String title;

    /* compiled from: MortgageVerificationFlow.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MortgageVerificationFlow> {
        @Override // android.os.Parcelable.Creator
        public final MortgageVerificationFlow createFromParcel(Parcel parcel) {
            return new MortgageVerificationFlow(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ActionButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ActionButton.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MortgageVerificationFlow[] newArray(int i12) {
            return new MortgageVerificationFlow[i12];
        }
    }

    public MortgageVerificationFlow(@l String str, @k String str2, @l String str3, @l ActionButton actionButton, @l ActionButton actionButton2) {
        this.imageUrl = str;
        this.title = str2;
        this.description = str3;
        this.primaryAction = actionButton;
        this.secondaryAction = actionButton2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final ActionButton getPrimaryAction() {
        return this.primaryAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final ActionButton getSecondaryAction() {
        return this.secondaryAction;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MortgageVerificationFlow)) {
            return false;
        }
        MortgageVerificationFlow mortgageVerificationFlow = (MortgageVerificationFlow) obj;
        return L.f(this.imageUrl, mortgageVerificationFlow.imageUrl) && L.f(this.title, mortgageVerificationFlow.title) && L.f(this.description, mortgageVerificationFlow.description) && L.f(this.primaryAction, mortgageVerificationFlow.primaryAction) && L.f(this.secondaryAction, mortgageVerificationFlow.secondaryAction);
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.imageUrl;
        int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
        String str2 = this.description;
        int iHashCode = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ActionButton actionButton = this.primaryAction;
        int iHashCode2 = (iHashCode + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
        ActionButton actionButton2 = this.secondaryAction;
        return iHashCode2 + (actionButton2 != null ? actionButton2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "MortgageVerificationFlow(imageUrl=" + this.imageUrl + ", title=" + this.title + ", description=" + this.description + ", primaryAction=" + this.primaryAction + ", secondaryAction=" + this.secondaryAction + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        ActionButton actionButton = this.primaryAction;
        if (actionButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionButton.writeToParcel(parcel, i12);
        }
        ActionButton actionButton2 = this.secondaryAction;
        if (actionButton2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionButton2.writeToParcel(parcel, i12);
        }
    }
}
