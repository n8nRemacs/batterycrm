package com.avito.android.mortgage.api.model.landing;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LandingHeader.kt */
@d
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/mortgage/api/model/landing/LandingHeaderAction;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/mortgage/api/model/landing/LandingHeaderActionType;", "type", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "<init>", "(Ljava/lang/String;Lcom/avito/android/mortgage/api/model/landing/LandingHeaderActionType;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/mortgage/api/model/landing/LandingHeaderActionType;", "d", "()Lcom/avito/android/mortgage/api/model/landing/LandingHeaderActionType;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LandingHeaderAction implements Parcelable {

    @k
    public static final Parcelable.Creator<LandingHeaderAction> CREATOR = new a();

    @c("link")
    @l
    private final DeepLink link;

    @c("title")
    @k
    private final String title;

    @c("type")
    @l
    private final LandingHeaderActionType type;

    /* compiled from: LandingHeader.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LandingHeaderAction> {
        @Override // android.os.Parcelable.Creator
        public final LandingHeaderAction createFromParcel(Parcel parcel) {
            return new LandingHeaderAction(parcel.readString(), parcel.readInt() == 0 ? null : LandingHeaderActionType.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(LandingHeaderAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LandingHeaderAction[] newArray(int i12) {
            return new LandingHeaderAction[i12];
        }
    }

    public LandingHeaderAction(@k String str, @l LandingHeaderActionType landingHeaderActionType, @l DeepLink deepLink) {
        this.title = str;
        this.type = landingHeaderActionType;
        this.link = deepLink;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final DeepLink getLink() {
        return this.link;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final LandingHeaderActionType getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LandingHeaderAction)) {
            return false;
        }
        LandingHeaderAction landingHeaderAction = (LandingHeaderAction) obj;
        return L.f(this.title, landingHeaderAction.title) && this.type == landingHeaderAction.type && L.f(this.link, landingHeaderAction.link);
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        LandingHeaderActionType landingHeaderActionType = this.type;
        int iHashCode2 = (iHashCode + (landingHeaderActionType == null ? 0 : landingHeaderActionType.hashCode())) * 31;
        DeepLink deepLink = this.link;
        return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LandingHeaderAction(title=");
        sb2.append(this.title);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", link=");
        return com.avito.android.actions_sheet.a.v(sb2, this.link, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        LandingHeaderActionType landingHeaderActionType = this.type;
        if (landingHeaderActionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(landingHeaderActionType.name());
        }
        parcel.writeParcelable(this.link, i12);
    }
}
