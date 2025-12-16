package com.avito.android.remote.fmp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FmpPaymentTitle.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/fmp/FmpPaymentTitle;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "leftPart", "rightPart", "", "icon", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "d", "Ljava/lang/String;", "getIcon", "()Ljava/lang/String;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FmpPaymentTitle implements Parcelable {

    @k
    public static final Parcelable.Creator<FmpPaymentTitle> CREATOR = new a();

    @c("icon")
    @l
    private final String icon;

    @c("leftPart")
    @l
    private final AttributedText leftPart;

    @c("rightPart")
    @l
    private final AttributedText rightPart;

    /* compiled from: FmpPaymentTitle.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FmpPaymentTitle> {
        @Override // android.os.Parcelable.Creator
        public final FmpPaymentTitle createFromParcel(Parcel parcel) {
            return new FmpPaymentTitle((AttributedText) parcel.readParcelable(FmpPaymentTitle.class.getClassLoader()), (AttributedText) parcel.readParcelable(FmpPaymentTitle.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FmpPaymentTitle[] newArray(int i12) {
            return new FmpPaymentTitle[i12];
        }
    }

    public FmpPaymentTitle(@l AttributedText attributedText, @l AttributedText attributedText2, @l String str) {
        this.leftPart = attributedText;
        this.rightPart = attributedText2;
        this.icon = str;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AttributedText getLeftPart() {
        return this.leftPart;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getRightPart() {
        return this.rightPart;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FmpPaymentTitle)) {
            return false;
        }
        FmpPaymentTitle fmpPaymentTitle = (FmpPaymentTitle) obj;
        return L.f(this.leftPart, fmpPaymentTitle.leftPart) && L.f(this.rightPart, fmpPaymentTitle.rightPart) && L.f(this.icon, fmpPaymentTitle.icon);
    }

    public final int hashCode() {
        AttributedText attributedText = this.leftPart;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.rightPart;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        String str = this.icon;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FmpPaymentTitle(leftPart=");
        sb2.append(this.leftPart);
        sb2.append(", rightPart=");
        sb2.append(this.rightPart);
        sb2.append(", icon=");
        return C22026a.c(sb2, this.icon, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.leftPart, i12);
        parcel.writeParcelable(this.rightPart, i12);
        parcel.writeString(this.icon);
    }
}
