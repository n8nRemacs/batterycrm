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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileUniversalWidgetSection;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalWidgetFactoidSection;", "factoid", "Lcom/avito/android/remote/model/UniversalWidgetTextSection;", "text", "Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSection;", "imageWithText", "<init>", "(Lcom/avito/android/remote/model/UniversalWidgetFactoidSection;Lcom/avito/android/remote/model/UniversalWidgetTextSection;Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSection;)V", "component1", "()Lcom/avito/android/remote/model/UniversalWidgetFactoidSection;", "component2", "()Lcom/avito/android/remote/model/UniversalWidgetTextSection;", "component3", "()Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSection;", "copy", "(Lcom/avito/android/remote/model/UniversalWidgetFactoidSection;Lcom/avito/android/remote/model/UniversalWidgetTextSection;Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSection;)Lcom/avito/android/remote/model/ExtendedProfileUniversalWidgetSection;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalWidgetFactoidSection;", "getFactoid", "Lcom/avito/android/remote/model/UniversalWidgetTextSection;", "getText", "Lcom/avito/android/remote/model/UniversalWidgetImageWithTextSection;", "getImageWithText", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExtendedProfileUniversalWidgetSection implements Parcelable {

    @k
    public static final Parcelable.Creator<ExtendedProfileUniversalWidgetSection> CREATOR = new Creator();

    @c("factoid")
    @l
    private final UniversalWidgetFactoidSection factoid;

    @c("imageWithText")
    @l
    private final UniversalWidgetImageWithTextSection imageWithText;

    @c("text")
    @l
    private final UniversalWidgetTextSection text;

    /* compiled from: ExtendedProfileUniversalWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfileUniversalWidgetSection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileUniversalWidgetSection createFromParcel(@k Parcel parcel) {
            return new ExtendedProfileUniversalWidgetSection(parcel.readInt() == 0 ? null : UniversalWidgetFactoidSection.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : UniversalWidgetTextSection.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? UniversalWidgetImageWithTextSection.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileUniversalWidgetSection[] newArray(int i12) {
            return new ExtendedProfileUniversalWidgetSection[i12];
        }
    }

    public ExtendedProfileUniversalWidgetSection(@l UniversalWidgetFactoidSection universalWidgetFactoidSection, @l UniversalWidgetTextSection universalWidgetTextSection, @l UniversalWidgetImageWithTextSection universalWidgetImageWithTextSection) {
        this.factoid = universalWidgetFactoidSection;
        this.text = universalWidgetTextSection;
        this.imageWithText = universalWidgetImageWithTextSection;
    }

    public static /* synthetic */ ExtendedProfileUniversalWidgetSection copy$default(ExtendedProfileUniversalWidgetSection extendedProfileUniversalWidgetSection, UniversalWidgetFactoidSection universalWidgetFactoidSection, UniversalWidgetTextSection universalWidgetTextSection, UniversalWidgetImageWithTextSection universalWidgetImageWithTextSection, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            universalWidgetFactoidSection = extendedProfileUniversalWidgetSection.factoid;
        }
        if ((i12 & 2) != 0) {
            universalWidgetTextSection = extendedProfileUniversalWidgetSection.text;
        }
        if ((i12 & 4) != 0) {
            universalWidgetImageWithTextSection = extendedProfileUniversalWidgetSection.imageWithText;
        }
        return extendedProfileUniversalWidgetSection.copy(universalWidgetFactoidSection, universalWidgetTextSection, universalWidgetImageWithTextSection);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final UniversalWidgetFactoidSection getFactoid() {
        return this.factoid;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final UniversalWidgetTextSection getText() {
        return this.text;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalWidgetImageWithTextSection getImageWithText() {
        return this.imageWithText;
    }

    @k
    public final ExtendedProfileUniversalWidgetSection copy(@l UniversalWidgetFactoidSection factoid, @l UniversalWidgetTextSection text, @l UniversalWidgetImageWithTextSection imageWithText) {
        return new ExtendedProfileUniversalWidgetSection(factoid, text, imageWithText);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedProfileUniversalWidgetSection)) {
            return false;
        }
        ExtendedProfileUniversalWidgetSection extendedProfileUniversalWidgetSection = (ExtendedProfileUniversalWidgetSection) other;
        return L.f(this.factoid, extendedProfileUniversalWidgetSection.factoid) && L.f(this.text, extendedProfileUniversalWidgetSection.text) && L.f(this.imageWithText, extendedProfileUniversalWidgetSection.imageWithText);
    }

    @l
    public final UniversalWidgetFactoidSection getFactoid() {
        return this.factoid;
    }

    @l
    public final UniversalWidgetImageWithTextSection getImageWithText() {
        return this.imageWithText;
    }

    @l
    public final UniversalWidgetTextSection getText() {
        return this.text;
    }

    public int hashCode() {
        UniversalWidgetFactoidSection universalWidgetFactoidSection = this.factoid;
        int iHashCode = (universalWidgetFactoidSection == null ? 0 : universalWidgetFactoidSection.hashCode()) * 31;
        UniversalWidgetTextSection universalWidgetTextSection = this.text;
        int iHashCode2 = (iHashCode + (universalWidgetTextSection == null ? 0 : universalWidgetTextSection.hashCode())) * 31;
        UniversalWidgetImageWithTextSection universalWidgetImageWithTextSection = this.imageWithText;
        return iHashCode2 + (universalWidgetImageWithTextSection != null ? universalWidgetImageWithTextSection.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ExtendedProfileUniversalWidgetSection(factoid=" + this.factoid + ", text=" + this.text + ", imageWithText=" + this.imageWithText + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        UniversalWidgetFactoidSection universalWidgetFactoidSection = this.factoid;
        if (universalWidgetFactoidSection == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            universalWidgetFactoidSection.writeToParcel(parcel, flags);
        }
        UniversalWidgetTextSection universalWidgetTextSection = this.text;
        if (universalWidgetTextSection == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            universalWidgetTextSection.writeToParcel(parcel, flags);
        }
        UniversalWidgetImageWithTextSection universalWidgetImageWithTextSection = this.imageWithText;
        if (universalWidgetImageWithTextSection == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            universalWidgetImageWithTextSection.writeToParcel(parcel, flags);
        }
    }
}
