package com.avito.android.remote.autoteka.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PromoCodeWidget.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/autoteka/model/PromoCodeWidget;", "Landroid/os/Parcelable;", "", "title", ChannelContext.Item.PLACEHOLDER, "promoCodeAccepted", "Lcom/avito/android/remote/autoteka/model/PromoCodeStatus;", "status", "hint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/autoteka/model/PromoCodeStatus;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getPlaceholder", "c", "Lcom/avito/android/remote/autoteka/model/PromoCodeStatus;", "d", "()Lcom/avito/android/remote/autoteka/model/PromoCodeStatus;", "getHint", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PromoCodeWidget implements Parcelable {

    @k
    public static final Parcelable.Creator<PromoCodeWidget> CREATOR = new a();

    @c("hint")
    @l
    private final String hint;

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @c("promocode")
    @l
    private final String promoCodeAccepted;

    @c("status")
    @k
    private final PromoCodeStatus status;

    @c("title")
    @l
    private final String title;

    /* compiled from: PromoCodeWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PromoCodeWidget> {
        @Override // android.os.Parcelable.Creator
        public final PromoCodeWidget createFromParcel(Parcel parcel) {
            return new PromoCodeWidget(parcel.readString(), parcel.readString(), parcel.readString(), PromoCodeStatus.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PromoCodeWidget[] newArray(int i12) {
            return new PromoCodeWidget[i12];
        }
    }

    public PromoCodeWidget(@l String str, @l String str2, @l String str3, @k PromoCodeStatus promoCodeStatus, @l String str4) {
        this.title = str;
        this.placeholder = str2;
        this.promoCodeAccepted = str3;
        this.status = promoCodeStatus;
        this.hint = str4;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getPromoCodeAccepted() {
        return this.promoCodeAccepted;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final PromoCodeStatus getStatus() {
        return this.status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoCodeWidget)) {
            return false;
        }
        PromoCodeWidget promoCodeWidget = (PromoCodeWidget) obj;
        return L.f(this.title, promoCodeWidget.title) && L.f(this.placeholder, promoCodeWidget.placeholder) && L.f(this.promoCodeAccepted, promoCodeWidget.promoCodeAccepted) && this.status == promoCodeWidget.status && L.f(this.hint, promoCodeWidget.hint);
    }

    @l
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.placeholder;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.promoCodeAccepted;
        int iHashCode3 = (this.status.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.hint;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PromoCodeWidget(title=");
        sb2.append(this.title);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", promoCodeAccepted=");
        sb2.append(this.promoCodeAccepted);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", hint=");
        return C22026a.c(sb2, this.hint, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.placeholder);
        parcel.writeString(this.promoCodeAccepted);
        this.status.writeToParcel(parcel, i12);
        parcel.writeString(this.hint);
    }

    public /* synthetic */ PromoCodeWidget(String str, String str2, String str3, PromoCodeStatus promoCodeStatus, String str4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, promoCodeStatus, (i12 & 16) != 0 ? null : str4);
    }
}
