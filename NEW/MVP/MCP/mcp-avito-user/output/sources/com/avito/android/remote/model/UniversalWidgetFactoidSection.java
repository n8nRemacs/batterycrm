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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/UniversalWidgetFactoidSection;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalWidgetFactoidType;", "type", "Lcom/avito/android/remote/model/UniversalWidgetFactoidSectionContent;", "content", "Lcom/avito/android/remote/model/UniversalWidgetFactoidSectionTextLimits;", "textLimits", "<init>", "(Lcom/avito/android/remote/model/UniversalWidgetFactoidType;Lcom/avito/android/remote/model/UniversalWidgetFactoidSectionContent;Lcom/avito/android/remote/model/UniversalWidgetFactoidSectionTextLimits;)V", "component1", "()Lcom/avito/android/remote/model/UniversalWidgetFactoidType;", "component2", "()Lcom/avito/android/remote/model/UniversalWidgetFactoidSectionContent;", "component3", "()Lcom/avito/android/remote/model/UniversalWidgetFactoidSectionTextLimits;", "copy", "(Lcom/avito/android/remote/model/UniversalWidgetFactoidType;Lcom/avito/android/remote/model/UniversalWidgetFactoidSectionContent;Lcom/avito/android/remote/model/UniversalWidgetFactoidSectionTextLimits;)Lcom/avito/android/remote/model/UniversalWidgetFactoidSection;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalWidgetFactoidType;", "getType", "Lcom/avito/android/remote/model/UniversalWidgetFactoidSectionContent;", "getContent", "Lcom/avito/android/remote/model/UniversalWidgetFactoidSectionTextLimits;", "getTextLimits", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UniversalWidgetFactoidSection implements Parcelable {

    @k
    public static final Parcelable.Creator<UniversalWidgetFactoidSection> CREATOR = new Creator();

    @c("content")
    @k
    private final UniversalWidgetFactoidSectionContent content;

    @c("textLimits")
    @k
    private final UniversalWidgetFactoidSectionTextLimits textLimits;

    @c("type")
    @l
    private final UniversalWidgetFactoidType type;

    /* compiled from: ExtendedProfileUniversalWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UniversalWidgetFactoidSection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalWidgetFactoidSection createFromParcel(@k Parcel parcel) {
            return new UniversalWidgetFactoidSection(parcel.readInt() == 0 ? null : UniversalWidgetFactoidType.valueOf(parcel.readString()), UniversalWidgetFactoidSectionContent.CREATOR.createFromParcel(parcel), UniversalWidgetFactoidSectionTextLimits.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalWidgetFactoidSection[] newArray(int i12) {
            return new UniversalWidgetFactoidSection[i12];
        }
    }

    public UniversalWidgetFactoidSection(@l UniversalWidgetFactoidType universalWidgetFactoidType, @k UniversalWidgetFactoidSectionContent universalWidgetFactoidSectionContent, @k UniversalWidgetFactoidSectionTextLimits universalWidgetFactoidSectionTextLimits) {
        this.type = universalWidgetFactoidType;
        this.content = universalWidgetFactoidSectionContent;
        this.textLimits = universalWidgetFactoidSectionTextLimits;
    }

    public static /* synthetic */ UniversalWidgetFactoidSection copy$default(UniversalWidgetFactoidSection universalWidgetFactoidSection, UniversalWidgetFactoidType universalWidgetFactoidType, UniversalWidgetFactoidSectionContent universalWidgetFactoidSectionContent, UniversalWidgetFactoidSectionTextLimits universalWidgetFactoidSectionTextLimits, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            universalWidgetFactoidType = universalWidgetFactoidSection.type;
        }
        if ((i12 & 2) != 0) {
            universalWidgetFactoidSectionContent = universalWidgetFactoidSection.content;
        }
        if ((i12 & 4) != 0) {
            universalWidgetFactoidSectionTextLimits = universalWidgetFactoidSection.textLimits;
        }
        return universalWidgetFactoidSection.copy(universalWidgetFactoidType, universalWidgetFactoidSectionContent, universalWidgetFactoidSectionTextLimits);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final UniversalWidgetFactoidType getType() {
        return this.type;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final UniversalWidgetFactoidSectionContent getContent() {
        return this.content;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final UniversalWidgetFactoidSectionTextLimits getTextLimits() {
        return this.textLimits;
    }

    @k
    public final UniversalWidgetFactoidSection copy(@l UniversalWidgetFactoidType type, @k UniversalWidgetFactoidSectionContent content, @k UniversalWidgetFactoidSectionTextLimits textLimits) {
        return new UniversalWidgetFactoidSection(type, content, textLimits);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalWidgetFactoidSection)) {
            return false;
        }
        UniversalWidgetFactoidSection universalWidgetFactoidSection = (UniversalWidgetFactoidSection) other;
        return this.type == universalWidgetFactoidSection.type && L.f(this.content, universalWidgetFactoidSection.content) && L.f(this.textLimits, universalWidgetFactoidSection.textLimits);
    }

    @k
    public final UniversalWidgetFactoidSectionContent getContent() {
        return this.content;
    }

    @k
    public final UniversalWidgetFactoidSectionTextLimits getTextLimits() {
        return this.textLimits;
    }

    @l
    public final UniversalWidgetFactoidType getType() {
        return this.type;
    }

    public int hashCode() {
        UniversalWidgetFactoidType universalWidgetFactoidType = this.type;
        return this.textLimits.hashCode() + ((this.content.hashCode() + ((universalWidgetFactoidType == null ? 0 : universalWidgetFactoidType.hashCode()) * 31)) * 31);
    }

    @k
    public String toString() {
        return "UniversalWidgetFactoidSection(type=" + this.type + ", content=" + this.content + ", textLimits=" + this.textLimits + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        UniversalWidgetFactoidType universalWidgetFactoidType = this.type;
        if (universalWidgetFactoidType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(universalWidgetFactoidType.name());
        }
        this.content.writeToParcel(parcel, flags);
        this.textLimits.writeToParcel(parcel, flags);
    }
}
