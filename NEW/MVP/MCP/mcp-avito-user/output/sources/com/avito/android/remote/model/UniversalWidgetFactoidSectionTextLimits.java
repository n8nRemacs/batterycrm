package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileUniversalWidget.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b$\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b%\u0010\n¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/UniversalWidgetFactoidSectionTextLimits;", "Landroid/os/Parcelable;", "", "sectionTitleMaxLines", "titleMaxLines", "subtitleMaxLines", "descriptionMaxLines", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/avito/android/remote/model/UniversalWidgetFactoidSectionTextLimits;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getSectionTitleMaxLines", "getTitleMaxLines", "getSubtitleMaxLines", "getDescriptionMaxLines", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UniversalWidgetFactoidSectionTextLimits implements Parcelable {

    @k
    public static final Parcelable.Creator<UniversalWidgetFactoidSectionTextLimits> CREATOR = new Creator();

    @c("descriptionMaxLines")
    @l
    private final Integer descriptionMaxLines;

    @c("sectionTitleMaxLines")
    @l
    private final Integer sectionTitleMaxLines;

    @c("subtitleMaxLines")
    @l
    private final Integer subtitleMaxLines;

    @c("titleMaxLines")
    @l
    private final Integer titleMaxLines;

    /* compiled from: ExtendedProfileUniversalWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UniversalWidgetFactoidSectionTextLimits> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalWidgetFactoidSectionTextLimits createFromParcel(@k Parcel parcel) {
            return new UniversalWidgetFactoidSectionTextLimits(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalWidgetFactoidSectionTextLimits[] newArray(int i12) {
            return new UniversalWidgetFactoidSectionTextLimits[i12];
        }
    }

    public UniversalWidgetFactoidSectionTextLimits(@l Integer num, @l Integer num2, @l Integer num3, @l Integer num4) {
        this.sectionTitleMaxLines = num;
        this.titleMaxLines = num2;
        this.subtitleMaxLines = num3;
        this.descriptionMaxLines = num4;
    }

    public static /* synthetic */ UniversalWidgetFactoidSectionTextLimits copy$default(UniversalWidgetFactoidSectionTextLimits universalWidgetFactoidSectionTextLimits, Integer num, Integer num2, Integer num3, Integer num4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            num = universalWidgetFactoidSectionTextLimits.sectionTitleMaxLines;
        }
        if ((i12 & 2) != 0) {
            num2 = universalWidgetFactoidSectionTextLimits.titleMaxLines;
        }
        if ((i12 & 4) != 0) {
            num3 = universalWidgetFactoidSectionTextLimits.subtitleMaxLines;
        }
        if ((i12 & 8) != 0) {
            num4 = universalWidgetFactoidSectionTextLimits.descriptionMaxLines;
        }
        return universalWidgetFactoidSectionTextLimits.copy(num, num2, num3, num4);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Integer getSectionTitleMaxLines() {
        return this.sectionTitleMaxLines;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getTitleMaxLines() {
        return this.titleMaxLines;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getSubtitleMaxLines() {
        return this.subtitleMaxLines;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Integer getDescriptionMaxLines() {
        return this.descriptionMaxLines;
    }

    @k
    public final UniversalWidgetFactoidSectionTextLimits copy(@l Integer sectionTitleMaxLines, @l Integer titleMaxLines, @l Integer subtitleMaxLines, @l Integer descriptionMaxLines) {
        return new UniversalWidgetFactoidSectionTextLimits(sectionTitleMaxLines, titleMaxLines, subtitleMaxLines, descriptionMaxLines);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalWidgetFactoidSectionTextLimits)) {
            return false;
        }
        UniversalWidgetFactoidSectionTextLimits universalWidgetFactoidSectionTextLimits = (UniversalWidgetFactoidSectionTextLimits) other;
        return L.f(this.sectionTitleMaxLines, universalWidgetFactoidSectionTextLimits.sectionTitleMaxLines) && L.f(this.titleMaxLines, universalWidgetFactoidSectionTextLimits.titleMaxLines) && L.f(this.subtitleMaxLines, universalWidgetFactoidSectionTextLimits.subtitleMaxLines) && L.f(this.descriptionMaxLines, universalWidgetFactoidSectionTextLimits.descriptionMaxLines);
    }

    @l
    public final Integer getDescriptionMaxLines() {
        return this.descriptionMaxLines;
    }

    @l
    public final Integer getSectionTitleMaxLines() {
        return this.sectionTitleMaxLines;
    }

    @l
    public final Integer getSubtitleMaxLines() {
        return this.subtitleMaxLines;
    }

    @l
    public final Integer getTitleMaxLines() {
        return this.titleMaxLines;
    }

    public int hashCode() {
        Integer num = this.sectionTitleMaxLines;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.titleMaxLines;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.subtitleMaxLines;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.descriptionMaxLines;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalWidgetFactoidSectionTextLimits(sectionTitleMaxLines=");
        sb2.append(this.sectionTitleMaxLines);
        sb2.append(", titleMaxLines=");
        sb2.append(this.titleMaxLines);
        sb2.append(", subtitleMaxLines=");
        sb2.append(this.subtitleMaxLines);
        sb2.append(", descriptionMaxLines=");
        return s.j(sb2, this.descriptionMaxLines, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Integer num = this.sectionTitleMaxLines;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        Integer num2 = this.titleMaxLines;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        Integer num3 = this.subtitleMaxLines;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num3);
        }
        Integer num4 = this.descriptionMaxLines;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num4);
        }
    }
}
