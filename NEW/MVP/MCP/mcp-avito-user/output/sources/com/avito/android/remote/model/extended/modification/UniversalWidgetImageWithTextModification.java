package com.avito.android.remote.model.extended.modification;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.extended.UniversalWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetSectionModification.kt */
@d
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jd\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00042\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020$HÖ\u0001¢\u0006\u0004\b+\u0010&J \u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020$HÖ\u0001¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b\u0005\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010\u001eR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\b>\u0010 ¨\u0006?"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetSectionModification;", "Lcom/avito/android/remote/model/extended/UniversalWidget$SectionSubtype;", "subtype", "", "isVisibleByUser", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextImageRatio;", "imgRatio", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextPosition;", "textPosition", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextPositionImageWithText;", "textPositionImageWithText", "", "sectionTitle", "", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModificationBlock;", "blocks", "<init>", "(Lcom/avito/android/remote/model/extended/UniversalWidget$SectionSubtype;ZLcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextImageRatio;Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextPosition;Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextPositionImageWithText;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/avito/android/remote/model/extended/UniversalWidget$SectionSubtype;", "component2", "()Z", "component3", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextImageRatio;", "component4", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextPosition;", "component5", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextPositionImageWithText;", "component6", "()Ljava/lang/String;", "component7", "()Ljava/util/List;", "copy", "(Lcom/avito/android/remote/model/extended/UniversalWidget$SectionSubtype;ZLcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextImageRatio;Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextPosition;Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextPositionImageWithText;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/extended/UniversalWidget$SectionSubtype;", "getSubtype", "Z", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetImageWithTextImageRatio;", "getImgRatio", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextPosition;", "getTextPosition", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextPositionImageWithText;", "getTextPositionImageWithText", "Ljava/lang/String;", "getSectionTitle", "Ljava/util/List;", "getBlocks", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UniversalWidgetImageWithTextModification implements UniversalWidgetSectionModification {

    @k
    public static final Parcelable.Creator<UniversalWidgetImageWithTextModification> CREATOR = new Creator();

    @k
    private final List<UniversalWidgetImageWithTextModificationBlock> blocks;

    @l
    private final UniversalWidget.UniversalWidgetImageWithTextImageRatio imgRatio;
    private final boolean isVisibleByUser;

    @l
    private final String sectionTitle;

    @k
    private final UniversalWidget.SectionSubtype subtype;

    @l
    private final UniversalWidget.UniversalWidgetTextPosition textPosition;

    @l
    private final UniversalWidget.UniversalWidgetTextPositionImageWithText textPositionImageWithText;

    /* compiled from: UniversalWidgetSectionModification.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UniversalWidgetImageWithTextModification> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalWidgetImageWithTextModification createFromParcel(@k Parcel parcel) {
            UniversalWidget.SectionSubtype sectionSubtypeValueOf = UniversalWidget.SectionSubtype.valueOf(parcel.readString());
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            UniversalWidget.UniversalWidgetImageWithTextImageRatio universalWidgetImageWithTextImageRatioValueOf = parcel.readInt() == 0 ? null : UniversalWidget.UniversalWidgetImageWithTextImageRatio.valueOf(parcel.readString());
            UniversalWidget.UniversalWidgetTextPosition universalWidgetTextPositionValueOf = parcel.readInt() == 0 ? null : UniversalWidget.UniversalWidgetTextPosition.valueOf(parcel.readString());
            UniversalWidget.UniversalWidgetTextPositionImageWithText universalWidgetTextPositionImageWithTextValueOf = parcel.readInt() != 0 ? UniversalWidget.UniversalWidgetTextPositionImageWithText.valueOf(parcel.readString()) : null;
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iC2 != i12) {
                iC2 = a.c(UniversalWidgetImageWithTextModificationBlock.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new UniversalWidgetImageWithTextModification(sectionSubtypeValueOf, z12, universalWidgetImageWithTextImageRatioValueOf, universalWidgetTextPositionValueOf, universalWidgetTextPositionImageWithTextValueOf, string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalWidgetImageWithTextModification[] newArray(int i12) {
            return new UniversalWidgetImageWithTextModification[i12];
        }
    }

    public UniversalWidgetImageWithTextModification(@k UniversalWidget.SectionSubtype sectionSubtype, boolean z12, @l UniversalWidget.UniversalWidgetImageWithTextImageRatio universalWidgetImageWithTextImageRatio, @l UniversalWidget.UniversalWidgetTextPosition universalWidgetTextPosition, @l UniversalWidget.UniversalWidgetTextPositionImageWithText universalWidgetTextPositionImageWithText, @l String str, @k List<UniversalWidgetImageWithTextModificationBlock> list) {
        this.subtype = sectionSubtype;
        this.isVisibleByUser = z12;
        this.imgRatio = universalWidgetImageWithTextImageRatio;
        this.textPosition = universalWidgetTextPosition;
        this.textPositionImageWithText = universalWidgetTextPositionImageWithText;
        this.sectionTitle = str;
        this.blocks = list;
    }

    public static /* synthetic */ UniversalWidgetImageWithTextModification copy$default(UniversalWidgetImageWithTextModification universalWidgetImageWithTextModification, UniversalWidget.SectionSubtype sectionSubtype, boolean z12, UniversalWidget.UniversalWidgetImageWithTextImageRatio universalWidgetImageWithTextImageRatio, UniversalWidget.UniversalWidgetTextPosition universalWidgetTextPosition, UniversalWidget.UniversalWidgetTextPositionImageWithText universalWidgetTextPositionImageWithText, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            sectionSubtype = universalWidgetImageWithTextModification.subtype;
        }
        if ((i12 & 2) != 0) {
            z12 = universalWidgetImageWithTextModification.isVisibleByUser;
        }
        boolean z13 = z12;
        if ((i12 & 4) != 0) {
            universalWidgetImageWithTextImageRatio = universalWidgetImageWithTextModification.imgRatio;
        }
        UniversalWidget.UniversalWidgetImageWithTextImageRatio universalWidgetImageWithTextImageRatio2 = universalWidgetImageWithTextImageRatio;
        if ((i12 & 8) != 0) {
            universalWidgetTextPosition = universalWidgetImageWithTextModification.textPosition;
        }
        UniversalWidget.UniversalWidgetTextPosition universalWidgetTextPosition2 = universalWidgetTextPosition;
        if ((i12 & 16) != 0) {
            universalWidgetTextPositionImageWithText = universalWidgetImageWithTextModification.textPositionImageWithText;
        }
        UniversalWidget.UniversalWidgetTextPositionImageWithText universalWidgetTextPositionImageWithText2 = universalWidgetTextPositionImageWithText;
        if ((i12 & 32) != 0) {
            str = universalWidgetImageWithTextModification.sectionTitle;
        }
        String str2 = str;
        if ((i12 & 64) != 0) {
            list = universalWidgetImageWithTextModification.blocks;
        }
        return universalWidgetImageWithTextModification.copy(sectionSubtype, z13, universalWidgetImageWithTextImageRatio2, universalWidgetTextPosition2, universalWidgetTextPositionImageWithText2, str2, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final UniversalWidget.SectionSubtype getSubtype() {
        return this.subtype;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsVisibleByUser() {
        return this.isVisibleByUser;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalWidget.UniversalWidgetImageWithTextImageRatio getImgRatio() {
        return this.imgRatio;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final UniversalWidget.UniversalWidgetTextPosition getTextPosition() {
        return this.textPosition;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final UniversalWidget.UniversalWidgetTextPositionImageWithText getTextPositionImageWithText() {
        return this.textPositionImageWithText;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    @k
    public final List<UniversalWidgetImageWithTextModificationBlock> component7() {
        return this.blocks;
    }

    @k
    public final UniversalWidgetImageWithTextModification copy(@k UniversalWidget.SectionSubtype subtype, boolean isVisibleByUser, @l UniversalWidget.UniversalWidgetImageWithTextImageRatio imgRatio, @l UniversalWidget.UniversalWidgetTextPosition textPosition, @l UniversalWidget.UniversalWidgetTextPositionImageWithText textPositionImageWithText, @l String sectionTitle, @k List<UniversalWidgetImageWithTextModificationBlock> blocks) {
        return new UniversalWidgetImageWithTextModification(subtype, isVisibleByUser, imgRatio, textPosition, textPositionImageWithText, sectionTitle, blocks);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalWidgetImageWithTextModification)) {
            return false;
        }
        UniversalWidgetImageWithTextModification universalWidgetImageWithTextModification = (UniversalWidgetImageWithTextModification) other;
        return this.subtype == universalWidgetImageWithTextModification.subtype && this.isVisibleByUser == universalWidgetImageWithTextModification.isVisibleByUser && this.imgRatio == universalWidgetImageWithTextModification.imgRatio && this.textPosition == universalWidgetImageWithTextModification.textPosition && this.textPositionImageWithText == universalWidgetImageWithTextModification.textPositionImageWithText && L.f(this.sectionTitle, universalWidgetImageWithTextModification.sectionTitle) && L.f(this.blocks, universalWidgetImageWithTextModification.blocks);
    }

    @k
    public final List<UniversalWidgetImageWithTextModificationBlock> getBlocks() {
        return this.blocks;
    }

    @l
    public final UniversalWidget.UniversalWidgetImageWithTextImageRatio getImgRatio() {
        return this.imgRatio;
    }

    @l
    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    @k
    public final UniversalWidget.SectionSubtype getSubtype() {
        return this.subtype;
    }

    @l
    public final UniversalWidget.UniversalWidgetTextPosition getTextPosition() {
        return this.textPosition;
    }

    @l
    public final UniversalWidget.UniversalWidgetTextPositionImageWithText getTextPositionImageWithText() {
        return this.textPositionImageWithText;
    }

    public int hashCode() {
        int i12 = r.i(this.subtype.hashCode() * 31, 31, this.isVisibleByUser);
        UniversalWidget.UniversalWidgetImageWithTextImageRatio universalWidgetImageWithTextImageRatio = this.imgRatio;
        int iHashCode = (i12 + (universalWidgetImageWithTextImageRatio == null ? 0 : universalWidgetImageWithTextImageRatio.hashCode())) * 31;
        UniversalWidget.UniversalWidgetTextPosition universalWidgetTextPosition = this.textPosition;
        int iHashCode2 = (iHashCode + (universalWidgetTextPosition == null ? 0 : universalWidgetTextPosition.hashCode())) * 31;
        UniversalWidget.UniversalWidgetTextPositionImageWithText universalWidgetTextPositionImageWithText = this.textPositionImageWithText;
        int iHashCode3 = (iHashCode2 + (universalWidgetTextPositionImageWithText == null ? 0 : universalWidgetTextPositionImageWithText.hashCode())) * 31;
        String str = this.sectionTitle;
        return this.blocks.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final boolean isVisibleByUser() {
        return this.isVisibleByUser;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalWidgetImageWithTextModification(subtype=");
        sb2.append(this.subtype);
        sb2.append(", isVisibleByUser=");
        sb2.append(this.isVisibleByUser);
        sb2.append(", imgRatio=");
        sb2.append(this.imgRatio);
        sb2.append(", textPosition=");
        sb2.append(this.textPosition);
        sb2.append(", textPositionImageWithText=");
        sb2.append(this.textPositionImageWithText);
        sb2.append(", sectionTitle=");
        sb2.append(this.sectionTitle);
        sb2.append(", blocks=");
        return H.p(sb2, this.blocks, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.subtype.name());
        parcel.writeInt(this.isVisibleByUser ? 1 : 0);
        UniversalWidget.UniversalWidgetImageWithTextImageRatio universalWidgetImageWithTextImageRatio = this.imgRatio;
        if (universalWidgetImageWithTextImageRatio == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(universalWidgetImageWithTextImageRatio.name());
        }
        UniversalWidget.UniversalWidgetTextPosition universalWidgetTextPosition = this.textPosition;
        if (universalWidgetTextPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(universalWidgetTextPosition.name());
        }
        UniversalWidget.UniversalWidgetTextPositionImageWithText universalWidgetTextPositionImageWithText = this.textPositionImageWithText;
        if (universalWidgetTextPositionImageWithText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(universalWidgetTextPositionImageWithText.name());
        }
        parcel.writeString(this.sectionTitle);
        Iterator itJ = C0.j(this.blocks, parcel);
        while (itJ.hasNext()) {
            ((UniversalWidgetImageWithTextModificationBlock) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
