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

/* compiled from: ExtendedProfileUniversalWidget.kt */
@d
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J:\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0013¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSection;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionType;", "type", "Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionConfig;", Navigation.CONFIG, "Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionContent;", "content", "Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionTextLimits;", "textLimits", "<init>", "(Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionType;Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionConfig;Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionContent;Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionTextLimits;)V", "component1", "()Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionType;", "component2", "()Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionConfig;", "component3", "()Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionContent;", "component4", "()Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionTextLimits;", "copy", "(Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionType;Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionConfig;Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionContent;Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionTextLimits;)Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSection;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionType;", "getType", "Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionConfig;", "getConfig", "Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionContent;", "getContent", "Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSectionTextLimits;", "getTextLimits", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UniversalWidgetImageWithTextSection implements Parcelable {

    @k
    public static final Parcelable.Creator<UniversalWidgetImageWithTextSection> CREATOR = new Creator();

    @c(Navigation.CONFIG)
    @k
    private final UniversalWidgetImageWithTextSectionConfig config;

    @c("content")
    @k
    private final UniversalWidgetImageWithTextSectionContent content;

    @c("textLimits")
    @k
    private final UniversalWidgetImageWithTextSectionTextLimits textLimits;

    @c("type")
    @l
    private final UniversalWidgetImageWithTextSectionType type;

    /* compiled from: ExtendedProfileUniversalWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UniversalWidgetImageWithTextSection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalWidgetImageWithTextSection createFromParcel(@k Parcel parcel) {
            return new UniversalWidgetImageWithTextSection(parcel.readInt() == 0 ? null : UniversalWidgetImageWithTextSectionType.valueOf(parcel.readString()), UniversalWidgetImageWithTextSectionConfig.CREATOR.createFromParcel(parcel), UniversalWidgetImageWithTextSectionContent.CREATOR.createFromParcel(parcel), UniversalWidgetImageWithTextSectionTextLimits.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalWidgetImageWithTextSection[] newArray(int i12) {
            return new UniversalWidgetImageWithTextSection[i12];
        }
    }

    public UniversalWidgetImageWithTextSection(@l UniversalWidgetImageWithTextSectionType universalWidgetImageWithTextSectionType, @k UniversalWidgetImageWithTextSectionConfig universalWidgetImageWithTextSectionConfig, @k UniversalWidgetImageWithTextSectionContent universalWidgetImageWithTextSectionContent, @k UniversalWidgetImageWithTextSectionTextLimits universalWidgetImageWithTextSectionTextLimits) {
        this.type = universalWidgetImageWithTextSectionType;
        this.config = universalWidgetImageWithTextSectionConfig;
        this.content = universalWidgetImageWithTextSectionContent;
        this.textLimits = universalWidgetImageWithTextSectionTextLimits;
    }

    public static /* synthetic */ UniversalWidgetImageWithTextSection copy$default(UniversalWidgetImageWithTextSection universalWidgetImageWithTextSection, UniversalWidgetImageWithTextSectionType universalWidgetImageWithTextSectionType, UniversalWidgetImageWithTextSectionConfig universalWidgetImageWithTextSectionConfig, UniversalWidgetImageWithTextSectionContent universalWidgetImageWithTextSectionContent, UniversalWidgetImageWithTextSectionTextLimits universalWidgetImageWithTextSectionTextLimits, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            universalWidgetImageWithTextSectionType = universalWidgetImageWithTextSection.type;
        }
        if ((i12 & 2) != 0) {
            universalWidgetImageWithTextSectionConfig = universalWidgetImageWithTextSection.config;
        }
        if ((i12 & 4) != 0) {
            universalWidgetImageWithTextSectionContent = universalWidgetImageWithTextSection.content;
        }
        if ((i12 & 8) != 0) {
            universalWidgetImageWithTextSectionTextLimits = universalWidgetImageWithTextSection.textLimits;
        }
        return universalWidgetImageWithTextSection.copy(universalWidgetImageWithTextSectionType, universalWidgetImageWithTextSectionConfig, universalWidgetImageWithTextSectionContent, universalWidgetImageWithTextSectionTextLimits);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final UniversalWidgetImageWithTextSectionType getType() {
        return this.type;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final UniversalWidgetImageWithTextSectionConfig getConfig() {
        return this.config;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final UniversalWidgetImageWithTextSectionContent getContent() {
        return this.content;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final UniversalWidgetImageWithTextSectionTextLimits getTextLimits() {
        return this.textLimits;
    }

    @k
    public final UniversalWidgetImageWithTextSection copy(@l UniversalWidgetImageWithTextSectionType type, @k UniversalWidgetImageWithTextSectionConfig config, @k UniversalWidgetImageWithTextSectionContent content, @k UniversalWidgetImageWithTextSectionTextLimits textLimits) {
        return new UniversalWidgetImageWithTextSection(type, config, content, textLimits);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalWidgetImageWithTextSection)) {
            return false;
        }
        UniversalWidgetImageWithTextSection universalWidgetImageWithTextSection = (UniversalWidgetImageWithTextSection) other;
        return this.type == universalWidgetImageWithTextSection.type && L.f(this.config, universalWidgetImageWithTextSection.config) && L.f(this.content, universalWidgetImageWithTextSection.content) && L.f(this.textLimits, universalWidgetImageWithTextSection.textLimits);
    }

    @k
    public final UniversalWidgetImageWithTextSectionConfig getConfig() {
        return this.config;
    }

    @k
    public final UniversalWidgetImageWithTextSectionContent getContent() {
        return this.content;
    }

    @k
    public final UniversalWidgetImageWithTextSectionTextLimits getTextLimits() {
        return this.textLimits;
    }

    @l
    public final UniversalWidgetImageWithTextSectionType getType() {
        return this.type;
    }

    public int hashCode() {
        UniversalWidgetImageWithTextSectionType universalWidgetImageWithTextSectionType = this.type;
        return this.textLimits.hashCode() + ((this.content.hashCode() + ((this.config.hashCode() + ((universalWidgetImageWithTextSectionType == null ? 0 : universalWidgetImageWithTextSectionType.hashCode()) * 31)) * 31)) * 31);
    }

    @k
    public String toString() {
        return "UniversalWidgetImageWithTextSection(type=" + this.type + ", config=" + this.config + ", content=" + this.content + ", textLimits=" + this.textLimits + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        UniversalWidgetImageWithTextSectionType universalWidgetImageWithTextSectionType = this.type;
        if (universalWidgetImageWithTextSectionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(universalWidgetImageWithTextSectionType.name());
        }
        this.config.writeToParcel(parcel, flags);
        this.content.writeToParcel(parcel, flags);
        this.textLimits.writeToParcel(parcel, flags);
    }
}
