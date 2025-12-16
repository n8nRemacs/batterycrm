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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018JJ\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b\u0007\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u0016R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u0010\u0018¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/UniversalWidgetFactoidModification;", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetSectionModification;", "Lcom/avito/android/remote/model/extended/UniversalWidget$SectionSubtype;", "subtype", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidItemsCountType;", "itemsCountType", "", "isVisibleByUser", "", "sectionTitle", "", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetFactoidModificationBlock;", "blocks", "<init>", "(Lcom/avito/android/remote/model/extended/UniversalWidget$SectionSubtype;Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidItemsCountType;ZLjava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/avito/android/remote/model/extended/UniversalWidget$SectionSubtype;", "component2", "()Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidItemsCountType;", "component3", "()Z", "component4", "()Ljava/lang/String;", "component5", "()Ljava/util/List;", "copy", "(Lcom/avito/android/remote/model/extended/UniversalWidget$SectionSubtype;Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidItemsCountType;ZLjava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/extended/modification/UniversalWidgetFactoidModification;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/extended/UniversalWidget$SectionSubtype;", "getSubtype", "Lcom/avito/android/remote/model/extended/UniversalWidget$UniversalWidgetFactoidItemsCountType;", "getItemsCountType", "Z", "Ljava/lang/String;", "getSectionTitle", "Ljava/util/List;", "getBlocks", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UniversalWidgetFactoidModification implements UniversalWidgetSectionModification {

    @k
    public static final Parcelable.Creator<UniversalWidgetFactoidModification> CREATOR = new Creator();

    @k
    private final List<UniversalWidgetFactoidModificationBlock> blocks;
    private final boolean isVisibleByUser;

    @k
    private final UniversalWidget.UniversalWidgetFactoidItemsCountType itemsCountType;

    @l
    private final String sectionTitle;

    @k
    private final UniversalWidget.SectionSubtype subtype;

    /* compiled from: UniversalWidgetSectionModification.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UniversalWidgetFactoidModification> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalWidgetFactoidModification createFromParcel(@k Parcel parcel) {
            UniversalWidget.SectionSubtype sectionSubtypeValueOf = UniversalWidget.SectionSubtype.valueOf(parcel.readString());
            UniversalWidget.UniversalWidgetFactoidItemsCountType universalWidgetFactoidItemsCountTypeValueOf = UniversalWidget.UniversalWidgetFactoidItemsCountType.valueOf(parcel.readString());
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iC2 != i12) {
                iC2 = a.c(UniversalWidgetFactoidModificationBlock.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new UniversalWidgetFactoidModification(sectionSubtypeValueOf, universalWidgetFactoidItemsCountTypeValueOf, z12, string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UniversalWidgetFactoidModification[] newArray(int i12) {
            return new UniversalWidgetFactoidModification[i12];
        }
    }

    public UniversalWidgetFactoidModification(@k UniversalWidget.SectionSubtype sectionSubtype, @k UniversalWidget.UniversalWidgetFactoidItemsCountType universalWidgetFactoidItemsCountType, boolean z12, @l String str, @k List<UniversalWidgetFactoidModificationBlock> list) {
        this.subtype = sectionSubtype;
        this.itemsCountType = universalWidgetFactoidItemsCountType;
        this.isVisibleByUser = z12;
        this.sectionTitle = str;
        this.blocks = list;
    }

    public static /* synthetic */ UniversalWidgetFactoidModification copy$default(UniversalWidgetFactoidModification universalWidgetFactoidModification, UniversalWidget.SectionSubtype sectionSubtype, UniversalWidget.UniversalWidgetFactoidItemsCountType universalWidgetFactoidItemsCountType, boolean z12, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            sectionSubtype = universalWidgetFactoidModification.subtype;
        }
        if ((i12 & 2) != 0) {
            universalWidgetFactoidItemsCountType = universalWidgetFactoidModification.itemsCountType;
        }
        UniversalWidget.UniversalWidgetFactoidItemsCountType universalWidgetFactoidItemsCountType2 = universalWidgetFactoidItemsCountType;
        if ((i12 & 4) != 0) {
            z12 = universalWidgetFactoidModification.isVisibleByUser;
        }
        boolean z13 = z12;
        if ((i12 & 8) != 0) {
            str = universalWidgetFactoidModification.sectionTitle;
        }
        String str2 = str;
        if ((i12 & 16) != 0) {
            list = universalWidgetFactoidModification.blocks;
        }
        return universalWidgetFactoidModification.copy(sectionSubtype, universalWidgetFactoidItemsCountType2, z13, str2, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final UniversalWidget.SectionSubtype getSubtype() {
        return this.subtype;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final UniversalWidget.UniversalWidgetFactoidItemsCountType getItemsCountType() {
        return this.itemsCountType;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsVisibleByUser() {
        return this.isVisibleByUser;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    @k
    public final List<UniversalWidgetFactoidModificationBlock> component5() {
        return this.blocks;
    }

    @k
    public final UniversalWidgetFactoidModification copy(@k UniversalWidget.SectionSubtype subtype, @k UniversalWidget.UniversalWidgetFactoidItemsCountType itemsCountType, boolean isVisibleByUser, @l String sectionTitle, @k List<UniversalWidgetFactoidModificationBlock> blocks) {
        return new UniversalWidgetFactoidModification(subtype, itemsCountType, isVisibleByUser, sectionTitle, blocks);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalWidgetFactoidModification)) {
            return false;
        }
        UniversalWidgetFactoidModification universalWidgetFactoidModification = (UniversalWidgetFactoidModification) other;
        return this.subtype == universalWidgetFactoidModification.subtype && this.itemsCountType == universalWidgetFactoidModification.itemsCountType && this.isVisibleByUser == universalWidgetFactoidModification.isVisibleByUser && L.f(this.sectionTitle, universalWidgetFactoidModification.sectionTitle) && L.f(this.blocks, universalWidgetFactoidModification.blocks);
    }

    @k
    public final List<UniversalWidgetFactoidModificationBlock> getBlocks() {
        return this.blocks;
    }

    @k
    public final UniversalWidget.UniversalWidgetFactoidItemsCountType getItemsCountType() {
        return this.itemsCountType;
    }

    @l
    public final String getSectionTitle() {
        return this.sectionTitle;
    }

    @k
    public final UniversalWidget.SectionSubtype getSubtype() {
        return this.subtype;
    }

    public int hashCode() {
        int i12 = r.i((this.itemsCountType.hashCode() + (this.subtype.hashCode() * 31)) * 31, 31, this.isVisibleByUser);
        String str = this.sectionTitle;
        return this.blocks.hashCode() + ((i12 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final boolean isVisibleByUser() {
        return this.isVisibleByUser;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UniversalWidgetFactoidModification(subtype=");
        sb2.append(this.subtype);
        sb2.append(", itemsCountType=");
        sb2.append(this.itemsCountType);
        sb2.append(", isVisibleByUser=");
        sb2.append(this.isVisibleByUser);
        sb2.append(", sectionTitle=");
        sb2.append(this.sectionTitle);
        sb2.append(", blocks=");
        return H.p(sb2, this.blocks, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.subtype.name());
        parcel.writeString(this.itemsCountType.name());
        parcel.writeInt(this.isVisibleByUser ? 1 : 0);
        parcel.writeString(this.sectionTitle);
        Iterator itJ = C0.j(this.blocks, parcel);
        while (itJ.hasNext()) {
            ((UniversalWidgetFactoidModificationBlock) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
