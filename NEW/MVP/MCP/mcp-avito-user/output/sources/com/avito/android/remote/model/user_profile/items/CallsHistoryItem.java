package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ServiceTypeKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CallsHistoryItem.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0011¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/CallsHistoryItem;", "Lcom/avito/android/remote/model/user_profile/items/UserProfileItem;", "", "header", "text", "", ServiceTypeKt.SERVICE_HIGHLIGHT, "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/user_profile/items/CallsHistoryItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getHeader", "getText", "Ljava/lang/Boolean;", "getHighlight", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CallsHistoryItem extends UserProfileItem {

    @k
    public static final Parcelable.Creator<CallsHistoryItem> CREATOR = new Creator();

    @c(Constants.DEEPLINK)
    @k
    private final DeepLink deepLink;

    @c("header")
    @k
    private final String header;

    @c(ServiceTypeKt.SERVICE_HIGHLIGHT)
    @l
    private final Boolean highlight;

    @c("text")
    @l
    private final String text;

    /* compiled from: CallsHistoryItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CallsHistoryItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CallsHistoryItem createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CallsHistoryItem(string, string2, boolValueOf, (DeepLink) parcel.readParcelable(CallsHistoryItem.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CallsHistoryItem[] newArray(int i12) {
            return new CallsHistoryItem[i12];
        }
    }

    public CallsHistoryItem(@k String str, @l String str2, @l Boolean bool, @k DeepLink deepLink) {
        this.header = str;
        this.text = str2;
        this.highlight = bool;
        this.deepLink = deepLink;
    }

    public static /* synthetic */ CallsHistoryItem copy$default(CallsHistoryItem callsHistoryItem, String str, String str2, Boolean bool, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = callsHistoryItem.header;
        }
        if ((i12 & 2) != 0) {
            str2 = callsHistoryItem.text;
        }
        if ((i12 & 4) != 0) {
            bool = callsHistoryItem.highlight;
        }
        if ((i12 & 8) != 0) {
            deepLink = callsHistoryItem.deepLink;
        }
        return callsHistoryItem.copy(str, str2, bool, deepLink);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Boolean getHighlight() {
        return this.highlight;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final CallsHistoryItem copy(@k String header, @l String text, @l Boolean highlight, @k DeepLink deepLink) {
        return new CallsHistoryItem(header, text, highlight, deepLink);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallsHistoryItem)) {
            return false;
        }
        CallsHistoryItem callsHistoryItem = (CallsHistoryItem) other;
        return L.f(this.header, callsHistoryItem.header) && L.f(this.text, callsHistoryItem.text) && L.f(this.highlight, callsHistoryItem.highlight) && L.f(this.deepLink, callsHistoryItem.deepLink);
    }

    @k
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final String getHeader() {
        return this.header;
    }

    @l
    public final Boolean getHighlight() {
        return this.highlight;
    }

    @l
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = this.header.hashCode() * 31;
        String str = this.text;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.highlight;
        return this.deepLink.hashCode() + ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CallsHistoryItem(header=");
        sb2.append(this.header);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", highlight=");
        sb2.append(this.highlight);
        sb2.append(", deepLink=");
        return a.v(sb2, this.deepLink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.header);
        parcel.writeString(this.text);
        Boolean bool = this.highlight;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.deepLink, flags);
    }
}
