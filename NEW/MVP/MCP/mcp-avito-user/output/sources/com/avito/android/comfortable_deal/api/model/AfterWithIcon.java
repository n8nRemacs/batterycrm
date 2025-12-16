package com.avito.android.comfortable_deal.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AgentRoomDealResponse.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/comfortable_deal/api/model/AfterWithIcon;", "Landroid/os/Parcelable;", "", "iconName", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getText", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AfterWithIcon implements Parcelable {

    @k
    public static final Parcelable.Creator<AfterWithIcon> CREATOR = new a();

    @c("iconName")
    @l
    private final String iconName;

    @c("text")
    @l
    private final String text;

    /* compiled from: AgentRoomDealResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AfterWithIcon> {
        @Override // android.os.Parcelable.Creator
        public final AfterWithIcon createFromParcel(Parcel parcel) {
            return new AfterWithIcon(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AfterWithIcon[] newArray(int i12) {
            return new AfterWithIcon[i12];
        }
    }

    public AfterWithIcon(@l String str, @l String str2) {
        this.iconName = str;
        this.text = str2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterWithIcon)) {
            return false;
        }
        AfterWithIcon afterWithIcon = (AfterWithIcon) obj;
        return L.f(this.iconName, afterWithIcon.iconName) && L.f(this.text, afterWithIcon.text);
    }

    @l
    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        String str = this.iconName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AfterWithIcon(iconName=");
        sb2.append(this.iconName);
        sb2.append(", text=");
        return C22026a.c(sb2, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.iconName);
        parcel.writeString(this.text);
    }
}
