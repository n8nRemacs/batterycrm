package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MapOnboardingResponse.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/MapOnboarding;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/remote/model/MapOnboardingIcon;", "icon", "Lcom/avito/android/deep_linking/links/DeepLink;", "onClick", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/MapOnboardingIcon;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/MapOnboardingIcon;", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/MapOnboardingIcon;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/MapOnboarding;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/remote/model/MapOnboardingIcon;", "getIcon", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnClick", "_avito-discouraged_avito-api_search-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MapOnboarding implements Parcelable {

    @k
    public static final Parcelable.Creator<MapOnboarding> CREATOR = new Creator();

    @c("icon")
    @l
    private final MapOnboardingIcon icon;

    @c("id")
    @l
    private final String id;

    @c("onClick")
    @l
    private final DeepLink onClick;

    /* compiled from: MapOnboardingResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MapOnboarding> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MapOnboarding createFromParcel(@k Parcel parcel) {
            return new MapOnboarding(parcel.readString(), parcel.readInt() == 0 ? null : MapOnboardingIcon.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(MapOnboarding.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MapOnboarding[] newArray(int i12) {
            return new MapOnboarding[i12];
        }
    }

    public MapOnboarding(@l String str, @l MapOnboardingIcon mapOnboardingIcon, @l DeepLink deepLink) {
        this.id = str;
        this.icon = mapOnboardingIcon;
        this.onClick = deepLink;
    }

    public static /* synthetic */ MapOnboarding copy$default(MapOnboarding mapOnboarding, String str, MapOnboardingIcon mapOnboardingIcon, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = mapOnboarding.id;
        }
        if ((i12 & 2) != 0) {
            mapOnboardingIcon = mapOnboarding.icon;
        }
        if ((i12 & 4) != 0) {
            deepLink = mapOnboarding.onClick;
        }
        return mapOnboarding.copy(str, mapOnboardingIcon, deepLink);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final MapOnboardingIcon getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DeepLink getOnClick() {
        return this.onClick;
    }

    @k
    public final MapOnboarding copy(@l String id2, @l MapOnboardingIcon icon, @l DeepLink onClick) {
        return new MapOnboarding(id2, icon, onClick);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapOnboarding)) {
            return false;
        }
        MapOnboarding mapOnboarding = (MapOnboarding) other;
        return L.f(this.id, mapOnboarding.id) && L.f(this.icon, mapOnboarding.icon) && L.f(this.onClick, mapOnboarding.onClick);
    }

    @l
    public final MapOnboardingIcon getIcon() {
        return this.icon;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final DeepLink getOnClick() {
        return this.onClick;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        MapOnboardingIcon mapOnboardingIcon = this.icon;
        int iHashCode2 = (iHashCode + (mapOnboardingIcon == null ? 0 : mapOnboardingIcon.hashCode())) * 31;
        DeepLink deepLink = this.onClick;
        return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MapOnboarding(id=");
        sb2.append(this.id);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", onClick=");
        return a.v(sb2, this.onClick, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        MapOnboardingIcon mapOnboardingIcon = this.icon;
        if (mapOnboardingIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mapOnboardingIcon.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.onClick, flags);
    }
}
