package com.avito.android.remote.model.stories;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StoryBanner.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b'\u0010\r¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/stories/StoryBannerStyle;", "Landroid/os/Parcelable;", "", "type", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "titleColor", "subtitleColor", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/stories/StoryBannerStyle;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "getTitleColor", "getSubtitleColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StoryBannerStyle implements Parcelable {

    @k
    public static final Parcelable.Creator<StoryBannerStyle> CREATOR = new Creator();

    @c("backgroundColor")
    @l
    private final UniversalColor backgroundColor;

    @c("subtitleColor")
    @l
    private final UniversalColor subtitleColor;

    @c("titleColor")
    @l
    private final UniversalColor titleColor;

    @c("type")
    @l
    private final String type;

    /* compiled from: StoryBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StoryBannerStyle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StoryBannerStyle createFromParcel(@k Parcel parcel) {
            return new StoryBannerStyle(parcel.readString(), (UniversalColor) parcel.readParcelable(StoryBannerStyle.class.getClassLoader()), (UniversalColor) parcel.readParcelable(StoryBannerStyle.class.getClassLoader()), (UniversalColor) parcel.readParcelable(StoryBannerStyle.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StoryBannerStyle[] newArray(int i12) {
            return new StoryBannerStyle[i12];
        }
    }

    public StoryBannerStyle(@l String str, @l UniversalColor universalColor, @l UniversalColor universalColor2, @l UniversalColor universalColor3) {
        this.type = str;
        this.backgroundColor = universalColor;
        this.titleColor = universalColor2;
        this.subtitleColor = universalColor3;
    }

    public static /* synthetic */ StoryBannerStyle copy$default(StoryBannerStyle storyBannerStyle, String str, UniversalColor universalColor, UniversalColor universalColor2, UniversalColor universalColor3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = storyBannerStyle.type;
        }
        if ((i12 & 2) != 0) {
            universalColor = storyBannerStyle.backgroundColor;
        }
        if ((i12 & 4) != 0) {
            universalColor2 = storyBannerStyle.titleColor;
        }
        if ((i12 & 8) != 0) {
            universalColor3 = storyBannerStyle.subtitleColor;
        }
        return storyBannerStyle.copy(str, universalColor, universalColor2, universalColor3);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalColor getTitleColor() {
        return this.titleColor;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalColor getSubtitleColor() {
        return this.subtitleColor;
    }

    @k
    public final StoryBannerStyle copy(@l String type, @l UniversalColor backgroundColor, @l UniversalColor titleColor, @l UniversalColor subtitleColor) {
        return new StoryBannerStyle(type, backgroundColor, titleColor, subtitleColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryBannerStyle)) {
            return false;
        }
        StoryBannerStyle storyBannerStyle = (StoryBannerStyle) other;
        return L.f(this.type, storyBannerStyle.type) && L.f(this.backgroundColor, storyBannerStyle.backgroundColor) && L.f(this.titleColor, storyBannerStyle.titleColor) && L.f(this.subtitleColor, storyBannerStyle.subtitleColor);
    }

    @l
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final UniversalColor getSubtitleColor() {
        return this.subtitleColor;
    }

    @l
    public final UniversalColor getTitleColor() {
        return this.titleColor;
    }

    @l
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UniversalColor universalColor = this.backgroundColor;
        int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        UniversalColor universalColor2 = this.titleColor;
        int iHashCode3 = (iHashCode2 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
        UniversalColor universalColor3 = this.subtitleColor;
        return iHashCode3 + (universalColor3 != null ? universalColor3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StoryBannerStyle(type=");
        sb2.append(this.type);
        sb2.append(", backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", titleColor=");
        sb2.append(this.titleColor);
        sb2.append(", subtitleColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.subtitleColor, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.type);
        parcel.writeParcelable(this.backgroundColor, flags);
        parcel.writeParcelable(this.titleColor, flags);
        parcel.writeParcelable(this.subtitleColor, flags);
    }
}
