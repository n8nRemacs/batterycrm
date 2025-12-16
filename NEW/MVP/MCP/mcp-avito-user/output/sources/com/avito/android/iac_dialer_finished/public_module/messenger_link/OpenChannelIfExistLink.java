package com.avito.android.iac_dialer_finished.public_module.messenger_link;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: OpenChannelIfExistLink.kt */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/iac_dialer_finished/public_module/messenger_link/OpenChannelIfExistLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "", ChannelContext.Item.USER_ID, "itemId", "onChannelNotFoundLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/iac_dialer_finished/public_module/messenger_link/OpenChannelIfExistLink;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUserId", "getItemId", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnChannelNotFoundLink", "b", "_avito_iac-dialer-finished_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class OpenChannelIfExistLink extends DeepLink {

    @k
    public static final Parcelable.Creator<OpenChannelIfExistLink> CREATOR = new a();

    @k
    private final String itemId;

    @l
    private final DeepLink onChannelNotFoundLink;

    @k
    private final String userId;

    /* compiled from: OpenChannelIfExistLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OpenChannelIfExistLink> {
        @Override // android.os.Parcelable.Creator
        public final OpenChannelIfExistLink createFromParcel(Parcel parcel) {
            return new OpenChannelIfExistLink(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(OpenChannelIfExistLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final OpenChannelIfExistLink[] newArray(int i12) {
            return new OpenChannelIfExistLink[i12];
        }
    }

    /* compiled from: OpenChannelIfExistLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_finished/public_module/messenger_link/OpenChannelIfExistLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_iac-dialer-finished_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC14249c.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f166822b = new b();
    }

    public OpenChannelIfExistLink(@k String str, @k String str2, @l DeepLink deepLink) {
        this.userId = str;
        this.itemId = str2;
        this.onChannelNotFoundLink = deepLink;
    }

    public static /* synthetic */ OpenChannelIfExistLink copy$default(OpenChannelIfExistLink openChannelIfExistLink, String str, String str2, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = openChannelIfExistLink.userId;
        }
        if ((i12 & 2) != 0) {
            str2 = openChannelIfExistLink.itemId;
        }
        if ((i12 & 4) != 0) {
            deepLink = openChannelIfExistLink.onChannelNotFoundLink;
        }
        return openChannelIfExistLink.copy(str, str2, deepLink);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DeepLink getOnChannelNotFoundLink() {
        return this.onChannelNotFoundLink;
    }

    @k
    public final OpenChannelIfExistLink copy(@k String userId, @k String itemId, @l DeepLink onChannelNotFoundLink) {
        return new OpenChannelIfExistLink(userId, itemId, onChannelNotFoundLink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenChannelIfExistLink)) {
            return false;
        }
        OpenChannelIfExistLink openChannelIfExistLink = (OpenChannelIfExistLink) other;
        return L.f(this.userId, openChannelIfExistLink.userId) && L.f(this.itemId, openChannelIfExistLink.itemId) && L.f(this.onChannelNotFoundLink, openChannelIfExistLink.onChannelNotFoundLink);
    }

    @k
    public final String getItemId() {
        return this.itemId;
    }

    @l
    public final DeepLink getOnChannelNotFoundLink() {
        return this.onChannelNotFoundLink;
    }

    @k
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iD2 = H.d(this.userId.hashCode() * 31, 31, this.itemId);
        DeepLink deepLink = this.onChannelNotFoundLink;
        return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("OpenChannelIfExistLink(userId=");
        sb2.append(this.userId);
        sb2.append(", itemId=");
        sb2.append(this.itemId);
        sb2.append(", onChannelNotFoundLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.onChannelNotFoundLink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.userId);
        parcel.writeString(this.itemId);
        parcel.writeParcelable(this.onChannelNotFoundLink, flags);
    }
}
