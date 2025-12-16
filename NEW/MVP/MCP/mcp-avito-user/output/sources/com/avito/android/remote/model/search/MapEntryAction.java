package com.avito.android.remote.model.search;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InlineFilters.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/search/MapEntryAction;", "Landroid/os/Parcelable;", "", "text", "iconName", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/search/MapEntryAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "getIconName", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MapEntryAction implements Parcelable {

    @k
    public static final Parcelable.Creator<MapEntryAction> CREATOR = new Creator();

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink deeplink;

    @c("iconName")
    @l
    private final String iconName;

    @c("text")
    @k
    private final String text;

    /* compiled from: InlineFilters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MapEntryAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MapEntryAction createFromParcel(@k Parcel parcel) {
            return new MapEntryAction(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(MapEntryAction.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MapEntryAction[] newArray(int i12) {
            return new MapEntryAction[i12];
        }
    }

    public MapEntryAction(@k String str, @l String str2, @k DeepLink deepLink) {
        this.text = str;
        this.iconName = str2;
        this.deeplink = deepLink;
    }

    public static /* synthetic */ MapEntryAction copy$default(MapEntryAction mapEntryAction, String str, String str2, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = mapEntryAction.text;
        }
        if ((i12 & 2) != 0) {
            str2 = mapEntryAction.iconName;
        }
        if ((i12 & 4) != 0) {
            deepLink = mapEntryAction.deeplink;
        }
        return mapEntryAction.copy(str, str2, deepLink);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    public final MapEntryAction copy(@k String text, @l String iconName, @k DeepLink deeplink) {
        return new MapEntryAction(text, iconName, deeplink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapEntryAction)) {
            return false;
        }
        MapEntryAction mapEntryAction = (MapEntryAction) other;
        return L.f(this.text, mapEntryAction.text) && L.f(this.iconName, mapEntryAction.iconName) && L.f(this.deeplink, mapEntryAction.deeplink);
    }

    @k
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final String getIconName() {
        return this.iconName;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        String str = this.iconName;
        return this.deeplink.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MapEntryAction(text=");
        sb2.append(this.text);
        sb2.append(", iconName=");
        sb2.append(this.iconName);
        sb2.append(", deeplink=");
        return a.v(sb2, this.deeplink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        parcel.writeString(this.iconName);
        parcel.writeParcelable(this.deeplink, flags);
    }
}
