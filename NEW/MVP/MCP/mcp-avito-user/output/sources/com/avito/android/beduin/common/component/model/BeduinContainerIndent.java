package com.avito.android.beduin.common.component.model;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.akita.compose.component.accordion.s;
import com.avito.android.remote.model.ProfileTab;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinContainerIndent.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJL\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b(\u0010\u000bR\u0011\u0010*\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b)\u0010\u0016R\u0011\u0010,\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010\u0016R\u0011\u0010.\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b-\u0010\u0016R\u0011\u00100\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b/\u0010\u0016R\u0011\u00102\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b1\u0010\u0016R\u0011\u00104\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b3\u0010\u0016¨\u00065"}, d2 = {"Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "Landroid/os/Parcelable;", "", "top", "bottom", "left", "right", ProfileTab.ALL, "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getTop", "getBottom", "getLeft", "getRight", "getAll", "getHorizontalIndent", "horizontalIndent", "getVerticalIndent", "verticalIndent", "getLeftIndent", "leftIndent", "getRightIndent", "rightIndent", "getTopIndent", "topIndent", "getBottomIndent", "bottomIndent", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinContainerIndent implements Parcelable {

    @k
    public static final Parcelable.Creator<BeduinContainerIndent> CREATOR = new a();

    @l
    private final Integer all;

    @l
    private final Integer bottom;

    @l
    private final Integer left;

    @l
    private final Integer right;

    @l
    private final Integer top;

    /* compiled from: BeduinContainerIndent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinContainerIndent> {
        @Override // android.os.Parcelable.Creator
        public final BeduinContainerIndent createFromParcel(Parcel parcel) {
            return new BeduinContainerIndent(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinContainerIndent[] newArray(int i12) {
            return new BeduinContainerIndent[i12];
        }
    }

    public BeduinContainerIndent() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ BeduinContainerIndent copy$default(BeduinContainerIndent beduinContainerIndent, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            num = beduinContainerIndent.top;
        }
        if ((i12 & 2) != 0) {
            num2 = beduinContainerIndent.bottom;
        }
        Integer num6 = num2;
        if ((i12 & 4) != 0) {
            num3 = beduinContainerIndent.left;
        }
        Integer num7 = num3;
        if ((i12 & 8) != 0) {
            num4 = beduinContainerIndent.right;
        }
        Integer num8 = num4;
        if ((i12 & 16) != 0) {
            num5 = beduinContainerIndent.all;
        }
        return beduinContainerIndent.copy(num, num6, num7, num8, num5);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Integer getTop() {
        return this.top;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getBottom() {
        return this.bottom;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getLeft() {
        return this.left;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Integer getRight() {
        return this.right;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Integer getAll() {
        return this.all;
    }

    @k
    public final BeduinContainerIndent copy(@l Integer top, @l Integer bottom, @l Integer left, @l Integer right, @l Integer all) {
        return new BeduinContainerIndent(top, bottom, left, right, all);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinContainerIndent)) {
            return false;
        }
        BeduinContainerIndent beduinContainerIndent = (BeduinContainerIndent) other;
        return L.f(this.top, beduinContainerIndent.top) && L.f(this.bottom, beduinContainerIndent.bottom) && L.f(this.left, beduinContainerIndent.left) && L.f(this.right, beduinContainerIndent.right) && L.f(this.all, beduinContainerIndent.all);
    }

    @l
    public final Integer getAll() {
        return this.all;
    }

    @l
    public final Integer getBottom() {
        return this.bottom;
    }

    public final int getBottomIndent() {
        Integer num = this.bottom;
        if (num == null && (num = this.all) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final int getHorizontalIndent() {
        return getRightIndent() + getLeftIndent();
    }

    @l
    public final Integer getLeft() {
        return this.left;
    }

    public final int getLeftIndent() {
        Integer num = this.left;
        if (num == null && (num = this.all) == null) {
            return 0;
        }
        return num.intValue();
    }

    @l
    public final Integer getRight() {
        return this.right;
    }

    public final int getRightIndent() {
        Integer num = this.right;
        if (num == null && (num = this.all) == null) {
            return 0;
        }
        return num.intValue();
    }

    @l
    public final Integer getTop() {
        return this.top;
    }

    public final int getTopIndent() {
        Integer num = this.top;
        if (num == null && (num = this.all) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final int getVerticalIndent() {
        return getBottomIndent() + getTopIndent();
    }

    public int hashCode() {
        Integer num = this.top;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.bottom;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.left;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.right;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.all;
        return iHashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinContainerIndent(top=");
        sb2.append(this.top);
        sb2.append(", bottom=");
        sb2.append(this.bottom);
        sb2.append(", left=");
        sb2.append(this.left);
        sb2.append(", right=");
        sb2.append(this.right);
        sb2.append(", all=");
        return s.j(sb2, this.all, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Integer num = this.top;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.bottom;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.left;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        Integer num4 = this.right;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num4);
        }
        Integer num5 = this.all;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num5);
        }
    }

    public BeduinContainerIndent(@l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @l Integer num5) {
        this.top = num;
        this.bottom = num2;
        this.left = num3;
        this.right = num4;
        this.all = num5;
    }

    public /* synthetic */ BeduinContainerIndent(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : num2, (i12 & 4) != 0 ? null : num3, (i12 & 8) != 0 ? null : num4, (i12 & 16) != 0 ? null : num5);
    }
}
