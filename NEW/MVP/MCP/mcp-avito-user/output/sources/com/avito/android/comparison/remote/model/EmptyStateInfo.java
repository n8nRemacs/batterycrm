package com.avito.android.comparison.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComparisonListResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/comparison/remote/model/EmptyStateInfo;", "Landroid/os/Parcelable;", "", "description", "buttonText", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "c", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-network_comparison"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class EmptyStateInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<EmptyStateInfo> CREATOR = new a();

    @c("buttonText")
    @k
    private final String buttonText;

    @c("description")
    @k
    private final String description;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink link;

    /* compiled from: ComparisonListResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EmptyStateInfo> {
        @Override // android.os.Parcelable.Creator
        public final EmptyStateInfo createFromParcel(Parcel parcel) {
            return new EmptyStateInfo(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(EmptyStateInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final EmptyStateInfo[] newArray(int i12) {
            return new EmptyStateInfo[i12];
        }
    }

    public EmptyStateInfo(@k String str, @k String str2, @k DeepLink deepLink) {
        this.description = str;
        this.buttonText = str2;
        this.link = deepLink;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final DeepLink getLink() {
        return this.link;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmptyStateInfo)) {
            return false;
        }
        EmptyStateInfo emptyStateInfo = (EmptyStateInfo) obj;
        return L.f(this.description, emptyStateInfo.description) && L.f(this.buttonText, emptyStateInfo.buttonText) && L.f(this.link, emptyStateInfo.link);
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        return this.link.hashCode() + H.d(this.description.hashCode() * 31, 31, this.buttonText);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EmptyStateInfo(description=");
        sb2.append(this.description);
        sb2.append(", buttonText=");
        sb2.append(this.buttonText);
        sb2.append(", link=");
        return com.avito.android.actions_sheet.a.v(sb2, this.link, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.description);
        parcel.writeString(this.buttonText);
        parcel.writeParcelable(this.link, i12);
    }
}
