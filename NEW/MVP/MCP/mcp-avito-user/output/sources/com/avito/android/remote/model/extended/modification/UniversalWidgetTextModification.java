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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b\u0005\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0012R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0014¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/UniversalWidgetTextModification;", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetSectionModification;", "Lcom/avito/android/remote/model/extended/UniversalWidget$SectionSubtype;", "subtype", "", "isVisibleByUser", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextTitlePosition;", "titlePosition", "", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetTextModificationBlock;", "blocks", "<init>", "(Lcom/avito/android/remote/model/extended/UniversalWidget$SectionSubtype;ZLcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextTitlePosition;Ljava/util/List;)V", "component1", "()Lcom/avito/android/remote/model/extended/UniversalWidget$SectionSubtype;", "component2", "()Z", "component3", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextTitlePosition;", "component4", "()Ljava/util/List;", "copy", "(Lcom/avito/android/remote/model/extended/UniversalWidget$SectionSubtype;ZLcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextTitlePosition;Ljava/util/List;)Lcom/avito/android/remote/model/extended/modification/UniversalWidgetTextModification;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/extended/UniversalWidget$SectionSubtype;", "getSubtype", "Z", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetTextTitlePosition;", "getTitlePosition", "Ljava/util/List;", "getBlocks", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UniversalWidgetTextModification implements UniversalWidgetSectionModification {

    @k
    public static final Parcelable.Creator<UniversalWidgetTextModification> CREATOR = new Creator();

    @k
    private final List<UniversalWidgetTextModificationBlock> blocks;
    private final boolean isVisibleByUser;

    @k
    private final UniversalWidget.SectionSubtype subtype;

    @l
    private final UniversalWidget.UniversalWidgetTextTitlePosition titlePosition;

    /* compiled from: UniversalWidgetSectionModification.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UniversalWidgetTextModification> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalWidgetTextModification createFromParcel(@k Parcel parcel) {
            UniversalWidget.SectionSubtype sectionSubtypeValueOf = UniversalWidget.SectionSubtype.valueOf(parcel.readString());
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            UniversalWidget.UniversalWidgetTextTitlePosition universalWidgetTextTitlePositionValueOf = parcel.readInt() == 0 ? null : UniversalWidget.UniversalWidgetTextTitlePosition.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iC2 != i12) {
                iC2 = a.c(UniversalWidgetTextModificationBlock.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new UniversalWidgetTextModification(sectionSubtypeValueOf, z12, universalWidgetTextTitlePositionValueOf, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalWidgetTextModification[] newArray(int i12) {
            return new UniversalWidgetTextModification[i12];
        }
    }

    public UniversalWidgetTextModification(@k UniversalWidget.SectionSubtype sectionSubtype, boolean z12, @l UniversalWidget.UniversalWidgetTextTitlePosition universalWidgetTextTitlePosition, @k List<UniversalWidgetTextModificationBlock> list) {
        this.subtype = sectionSubtype;
        this.isVisibleByUser = z12;
        this.titlePosition = universalWidgetTextTitlePosition;
        this.blocks = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UniversalWidgetTextModification copy$default(UniversalWidgetTextModification universalWidgetTextModification, UniversalWidget.SectionSubtype sectionSubtype, boolean z12, UniversalWidget.UniversalWidgetTextTitlePosition universalWidgetTextTitlePosition, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            sectionSubtype = universalWidgetTextModification.subtype;
        }
        if ((i12 & 2) != 0) {
            z12 = universalWidgetTextModification.isVisibleByUser;
        }
        if ((i12 & 4) != 0) {
            universalWidgetTextTitlePosition = universalWidgetTextModification.titlePosition;
        }
        if ((i12 & 8) != 0) {
            list = universalWidgetTextModification.blocks;
        }
        return universalWidgetTextModification.copy(sectionSubtype, z12, universalWidgetTextTitlePosition, list);
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
    public final UniversalWidget.UniversalWidgetTextTitlePosition getTitlePosition() {
        return this.titlePosition;
    }

    @k
    public final List<UniversalWidgetTextModificationBlock> component4() {
        return this.blocks;
    }

    @k
    public final UniversalWidgetTextModification copy(@k UniversalWidget.SectionSubtype subtype, boolean isVisibleByUser, @l UniversalWidget.UniversalWidgetTextTitlePosition titlePosition, @k List<UniversalWidgetTextModificationBlock> blocks) {
        return new UniversalWidgetTextModification(subtype, isVisibleByUser, titlePosition, blocks);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalWidgetTextModification)) {
            return false;
        }
        UniversalWidgetTextModification universalWidgetTextModification = (UniversalWidgetTextModification) other;
        return this.subtype == universalWidgetTextModification.subtype && this.isVisibleByUser == universalWidgetTextModification.isVisibleByUser && this.titlePosition == universalWidgetTextModification.titlePosition && L.f(this.blocks, universalWidgetTextModification.blocks);
    }

    @k
    public final List<UniversalWidgetTextModificationBlock> getBlocks() {
        return this.blocks;
    }

    @k
    public final UniversalWidget.SectionSubtype getSubtype() {
        return this.subtype;
    }

    @l
    public final UniversalWidget.UniversalWidgetTextTitlePosition getTitlePosition() {
        return this.titlePosition;
    }

    public int hashCode() {
        int i12 = r.i(this.subtype.hashCode() * 31, 31, this.isVisibleByUser);
        UniversalWidget.UniversalWidgetTextTitlePosition universalWidgetTextTitlePosition = this.titlePosition;
        return this.blocks.hashCode() + ((i12 + (universalWidgetTextTitlePosition == null ? 0 : universalWidgetTextTitlePosition.hashCode())) * 31);
    }

    public final boolean isVisibleByUser() {
        return this.isVisibleByUser;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalWidgetTextModification(subtype=");
        sb2.append(this.subtype);
        sb2.append(", isVisibleByUser=");
        sb2.append(this.isVisibleByUser);
        sb2.append(", titlePosition=");
        sb2.append(this.titlePosition);
        sb2.append(", blocks=");
        return H.p(sb2, this.blocks, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.subtype.name());
        parcel.writeInt(this.isVisibleByUser ? 1 : 0);
        UniversalWidget.UniversalWidgetTextTitlePosition universalWidgetTextTitlePosition = this.titlePosition;
        if (universalWidgetTextTitlePosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(universalWidgetTextTitlePosition.name());
        }
        Iterator itJ = C0.j(this.blocks, parcel);
        while (itJ.hasNext()) {
            ((UniversalWidgetTextModificationBlock) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
