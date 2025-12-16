package com.avito.android.mortgage.api.model.landing;

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

/* compiled from: LandingManagerUsp.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/mortgage/api/model/landing/LandingManagerUspItem;", "Landroid/os/Parcelable;", "", "iconName", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getText", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LandingManagerUspItem implements Parcelable {

    @k
    public static final Parcelable.Creator<LandingManagerUspItem> CREATOR = new a();

    @c("iconName")
    @k
    private final String iconName;

    @c("text")
    @k
    private final String text;

    /* compiled from: LandingManagerUsp.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LandingManagerUspItem> {
        @Override // android.os.Parcelable.Creator
        public final LandingManagerUspItem createFromParcel(Parcel parcel) {
            return new LandingManagerUspItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LandingManagerUspItem[] newArray(int i12) {
            return new LandingManagerUspItem[i12];
        }
    }

    public LandingManagerUspItem(@k String str, @k String str2) {
        this.iconName = str;
        this.text = str2;
    }

    @k
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
        if (!(obj instanceof LandingManagerUspItem)) {
            return false;
        }
        LandingManagerUspItem landingManagerUspItem = (LandingManagerUspItem) obj;
        return L.f(this.iconName, landingManagerUspItem.iconName) && L.f(this.text, landingManagerUspItem.text);
    }

    @k
    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        return this.text.hashCode() + (this.iconName.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LandingManagerUspItem(iconName=");
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
