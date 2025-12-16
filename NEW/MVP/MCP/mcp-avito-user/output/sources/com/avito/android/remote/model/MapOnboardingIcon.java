package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MapOnboardingResponse.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/MapOnboardingIcon;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/AnimatedIcon;", "animatedIcon", "Lcom/avito/android/remote/model/UniversalImage;", "staticIcon", "<init>", "(Lcom/avito/android/remote/model/AnimatedIcon;Lcom/avito/android/remote/model/UniversalImage;)V", "component1", "()Lcom/avito/android/remote/model/AnimatedIcon;", "component2", "()Lcom/avito/android/remote/model/UniversalImage;", "copy", "(Lcom/avito/android/remote/model/AnimatedIcon;Lcom/avito/android/remote/model/UniversalImage;)Lcom/avito/android/remote/model/MapOnboardingIcon;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/AnimatedIcon;", "getAnimatedIcon", "Lcom/avito/android/remote/model/UniversalImage;", "getStaticIcon", "_avito-discouraged_avito-api_search-map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MapOnboardingIcon implements Parcelable {

    @k
    public static final Parcelable.Creator<MapOnboardingIcon> CREATOR = new Creator();

    @c("animatedIcon")
    @l
    private final AnimatedIcon animatedIcon;

    @c("staticIcon")
    @l
    private final UniversalImage staticIcon;

    /* compiled from: MapOnboardingResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MapOnboardingIcon> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MapOnboardingIcon createFromParcel(@k Parcel parcel) {
            return new MapOnboardingIcon(parcel.readInt() == 0 ? null : AnimatedIcon.CREATOR.createFromParcel(parcel), (UniversalImage) parcel.readParcelable(MapOnboardingIcon.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MapOnboardingIcon[] newArray(int i12) {
            return new MapOnboardingIcon[i12];
        }
    }

    public MapOnboardingIcon(@l AnimatedIcon animatedIcon, @l UniversalImage universalImage) {
        this.animatedIcon = animatedIcon;
        this.staticIcon = universalImage;
    }

    public static /* synthetic */ MapOnboardingIcon copy$default(MapOnboardingIcon mapOnboardingIcon, AnimatedIcon animatedIcon, UniversalImage universalImage, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            animatedIcon = mapOnboardingIcon.animatedIcon;
        }
        if ((i12 & 2) != 0) {
            universalImage = mapOnboardingIcon.staticIcon;
        }
        return mapOnboardingIcon.copy(animatedIcon, universalImage);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AnimatedIcon getAnimatedIcon() {
        return this.animatedIcon;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalImage getStaticIcon() {
        return this.staticIcon;
    }

    @k
    public final MapOnboardingIcon copy(@l AnimatedIcon animatedIcon, @l UniversalImage staticIcon) {
        return new MapOnboardingIcon(animatedIcon, staticIcon);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapOnboardingIcon)) {
            return false;
        }
        MapOnboardingIcon mapOnboardingIcon = (MapOnboardingIcon) other;
        return L.f(this.animatedIcon, mapOnboardingIcon.animatedIcon) && L.f(this.staticIcon, mapOnboardingIcon.staticIcon);
    }

    @l
    public final AnimatedIcon getAnimatedIcon() {
        return this.animatedIcon;
    }

    @l
    public final UniversalImage getStaticIcon() {
        return this.staticIcon;
    }

    public int hashCode() {
        AnimatedIcon animatedIcon = this.animatedIcon;
        int iHashCode = (animatedIcon == null ? 0 : animatedIcon.hashCode()) * 31;
        UniversalImage universalImage = this.staticIcon;
        return iHashCode + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MapOnboardingIcon(animatedIcon=");
        sb2.append(this.animatedIcon);
        sb2.append(", staticIcon=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.staticIcon, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        AnimatedIcon animatedIcon = this.animatedIcon;
        if (animatedIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            animatedIcon.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.staticIcon, flags);
    }
}
