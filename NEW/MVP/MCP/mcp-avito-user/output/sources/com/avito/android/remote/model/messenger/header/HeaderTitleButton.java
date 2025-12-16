package com.avito.android.remote.model.messenger.header;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HeaderTitleButton.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/messenger/header/HeaderTitleButton;", "Landroid/os/Parcelable;", "", "iconMobile", "iconWeb", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/messenger/header/HeaderTitleButton;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIconMobile", "getIconWeb", "getDeeplink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class HeaderTitleButton implements Parcelable {

    @k
    public static final Parcelable.Creator<HeaderTitleButton> CREATOR = new Creator();

    @l
    private final String deeplink;

    @l
    private final String iconMobile;

    @l
    private final String iconWeb;

    /* compiled from: HeaderTitleButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HeaderTitleButton> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final HeaderTitleButton createFromParcel(@k Parcel parcel) {
            return new HeaderTitleButton(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final HeaderTitleButton[] newArray(int i12) {
            return new HeaderTitleButton[i12];
        }
    }

    public HeaderTitleButton(@l String str, @l String str2, @l String str3) {
        this.iconMobile = str;
        this.iconWeb = str2;
        this.deeplink = str3;
    }

    public static /* synthetic */ HeaderTitleButton copy$default(HeaderTitleButton headerTitleButton, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = headerTitleButton.iconMobile;
        }
        if ((i12 & 2) != 0) {
            str2 = headerTitleButton.iconWeb;
        }
        if ((i12 & 4) != 0) {
            str3 = headerTitleButton.deeplink;
        }
        return headerTitleButton.copy(str, str2, str3);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getIconMobile() {
        return this.iconMobile;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getIconWeb() {
        return this.iconWeb;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    @k
    public final HeaderTitleButton copy(@l String iconMobile, @l String iconWeb, @l String deeplink) {
        return new HeaderTitleButton(iconMobile, iconWeb, deeplink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderTitleButton)) {
            return false;
        }
        HeaderTitleButton headerTitleButton = (HeaderTitleButton) other;
        return L.f(this.iconMobile, headerTitleButton.iconMobile) && L.f(this.iconWeb, headerTitleButton.iconWeb) && L.f(this.deeplink, headerTitleButton.deeplink);
    }

    @l
    public final String getDeeplink() {
        return this.deeplink;
    }

    @l
    public final String getIconMobile() {
        return this.iconMobile;
    }

    @l
    public final String getIconWeb() {
        return this.iconWeb;
    }

    public int hashCode() {
        String str = this.iconMobile;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconWeb;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deeplink;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderTitleButton(iconMobile=");
        sb2.append(this.iconMobile);
        sb2.append(", iconWeb=");
        sb2.append(this.iconWeb);
        sb2.append(", deeplink=");
        return C22026a.c(sb2, this.deeplink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.iconMobile);
        parcel.writeString(this.iconWeb);
        parcel.writeString(this.deeplink);
    }
}
