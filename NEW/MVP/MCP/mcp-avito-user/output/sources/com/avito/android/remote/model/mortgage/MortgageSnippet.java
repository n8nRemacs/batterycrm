package com.avito.android.remote.model.mortgage;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: MortgageSnippet.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/mortgage/MortgageSnippet;", "Landroid/os/Parcelable;", "", "title", "paymentTemplate", "emptyPaymentTemplate", "actionTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getPaymentTemplate", "getEmptyPaymentTemplate", "getActionTitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MortgageSnippet implements Parcelable {

    @k
    public static final Parcelable.Creator<MortgageSnippet> CREATOR = new Creator();

    @c("actionTitle")
    @l
    private final String actionTitle;

    @c("emptyPaymentTemplate")
    @l
    private final String emptyPaymentTemplate;

    @c("paymentTemplate")
    @l
    private final String paymentTemplate;

    @c("title")
    @l
    private final String title;

    /* compiled from: MortgageSnippet.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MortgageSnippet> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MortgageSnippet createFromParcel(@k Parcel parcel) {
            return new MortgageSnippet(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MortgageSnippet[] newArray(int i12) {
            return new MortgageSnippet[i12];
        }
    }

    public MortgageSnippet(@l String str, @l String str2, @l String str3, @l String str4) {
        this.title = str;
        this.paymentTemplate = str2;
        this.emptyPaymentTemplate = str3;
        this.actionTitle = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getActionTitle() {
        return this.actionTitle;
    }

    @l
    public final String getEmptyPaymentTemplate() {
        return this.emptyPaymentTemplate;
    }

    @l
    public final String getPaymentTemplate() {
        return this.paymentTemplate;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.paymentTemplate);
        parcel.writeString(this.emptyPaymentTemplate);
        parcel.writeString(this.actionTitle);
    }
}
