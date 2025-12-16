package com.avito.android.remote.model.fmp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FmpCalculator.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/fmp/PaymentTitle;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "leftPart", "rightPart", "", "icon", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)Lcom/avito/android/remote/model/fmp/PaymentTitle;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getLeftPart", "getRightPart", "Ljava/lang/String;", "getIcon", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PaymentTitle implements Parcelable {

    @k
    public static final Parcelable.Creator<PaymentTitle> CREATOR = new Creator();

    @c("icon")
    @l
    private final String icon;

    @c("leftPart")
    @l
    private final AttributedText leftPart;

    @c("rightPart")
    @l
    private final AttributedText rightPart;

    /* compiled from: FmpCalculator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentTitle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PaymentTitle createFromParcel(@k Parcel parcel) {
            return new PaymentTitle((AttributedText) parcel.readParcelable(PaymentTitle.class.getClassLoader()), (AttributedText) parcel.readParcelable(PaymentTitle.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PaymentTitle[] newArray(int i12) {
            return new PaymentTitle[i12];
        }
    }

    public PaymentTitle(@l AttributedText attributedText, @l AttributedText attributedText2, @l String str) {
        this.leftPart = attributedText;
        this.rightPart = attributedText2;
        this.icon = str;
    }

    public static /* synthetic */ PaymentTitle copy$default(PaymentTitle paymentTitle, AttributedText attributedText, AttributedText attributedText2, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = paymentTitle.leftPart;
        }
        if ((i12 & 2) != 0) {
            attributedText2 = paymentTitle.rightPart;
        }
        if ((i12 & 4) != 0) {
            str = paymentTitle.icon;
        }
        return paymentTitle.copy(attributedText, attributedText2, str);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getLeftPart() {
        return this.leftPart;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedText getRightPart() {
        return this.rightPart;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @k
    public final PaymentTitle copy(@l AttributedText leftPart, @l AttributedText rightPart, @l String icon) {
        return new PaymentTitle(leftPart, rightPart, icon);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentTitle)) {
            return false;
        }
        PaymentTitle paymentTitle = (PaymentTitle) other;
        return L.f(this.leftPart, paymentTitle.leftPart) && L.f(this.rightPart, paymentTitle.rightPart) && L.f(this.icon, paymentTitle.icon);
    }

    @l
    public final String getIcon() {
        return this.icon;
    }

    @l
    public final AttributedText getLeftPart() {
        return this.leftPart;
    }

    @l
    public final AttributedText getRightPart() {
        return this.rightPart;
    }

    public int hashCode() {
        AttributedText attributedText = this.leftPart;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.rightPart;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        String str = this.icon;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentTitle(leftPart=");
        sb2.append(this.leftPart);
        sb2.append(", rightPart=");
        sb2.append(this.rightPart);
        sb2.append(", icon=");
        return C22026a.c(sb2, this.icon, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.leftPart, flags);
        parcel.writeParcelable(this.rightPart, flags);
        parcel.writeString(this.icon);
    }
}
