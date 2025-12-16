package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AgentRoomDealResponse.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/CalculationInfo;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "description", "", "buttonTitle", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CalculationInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<CalculationInfo> CREATOR = new a();

    @c("buttonTitle")
    @k
    private final String buttonTitle;

    @c("description")
    @k
    private final AttributedText description;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: AgentRoomDealResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CalculationInfo> {
        @Override // android.os.Parcelable.Creator
        public final CalculationInfo createFromParcel(Parcel parcel) {
            return new CalculationInfo((AttributedText) parcel.readParcelable(CalculationInfo.class.getClassLoader()), (AttributedText) parcel.readParcelable(CalculationInfo.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CalculationInfo[] newArray(int i12) {
            return new CalculationInfo[i12];
        }
    }

    public CalculationInfo(@k AttributedText attributedText, @k AttributedText attributedText2, @k String str) {
        this.title = attributedText;
        this.description = attributedText2;
        this.buttonTitle = str;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalculationInfo)) {
            return false;
        }
        CalculationInfo calculationInfo = (CalculationInfo) obj;
        return L.f(this.title, calculationInfo.title) && L.f(this.description, calculationInfo.description) && L.f(this.buttonTitle, calculationInfo.buttonTitle);
    }

    @k
    public final AttributedText getDescription() {
        return this.description;
    }

    public final int hashCode() {
        return this.buttonTitle.hashCode() + com.avito.android.actions_sheet.a.b(this.title.hashCode() * 31, 31, this.description);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalculationInfo(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", buttonTitle=");
        return C22026a.c(sb2, this.buttonTitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.title, i12);
        parcel.writeParcelable(this.description, i12);
        parcel.writeString(this.buttonTitle);
    }
}
