package com.avito.android.beduin.common.component.checkbox_list_item;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.akita.compose.component.accordion.s;
import com.avito.android.beduin.common.alignment.VerticalAlignment;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckboxVerticalPosition.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox_list_item/CheckboxVerticalPosition;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/alignment/VerticalAlignment;", "alignment", "", "offset", "<init>", "(Lcom/avito/android/beduin/common/alignment/VerticalAlignment;Ljava/lang/Integer;)V", "component1", "()Lcom/avito/android/beduin/common/alignment/VerticalAlignment;", "component2", "()Ljava/lang/Integer;", "copy", "(Lcom/avito/android/beduin/common/alignment/VerticalAlignment;Ljava/lang/Integer;)Lcom/avito/android/beduin/common/component/checkbox_list_item/CheckboxVerticalPosition;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/alignment/VerticalAlignment;", "getAlignment", "Ljava/lang/Integer;", "getOffset", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CheckboxVerticalPosition implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CheckboxVerticalPosition> CREATOR = new a();

    @com.google.gson.annotations.c("alignment")
    @Y61.l
    private final VerticalAlignment alignment;

    @com.google.gson.annotations.c("offset")
    @Y61.l
    private final Integer offset;

    /* compiled from: CheckboxVerticalPosition.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CheckboxVerticalPosition> {
        @Override // android.os.Parcelable.Creator
        public final CheckboxVerticalPosition createFromParcel(Parcel parcel) {
            return new CheckboxVerticalPosition(parcel.readInt() == 0 ? null : VerticalAlignment.valueOf(parcel.readString()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CheckboxVerticalPosition[] newArray(int i12) {
            return new CheckboxVerticalPosition[i12];
        }
    }

    public CheckboxVerticalPosition(@Y61.l VerticalAlignment verticalAlignment, @Y61.l Integer num) {
        this.alignment = verticalAlignment;
        this.offset = num;
    }

    public static /* synthetic */ CheckboxVerticalPosition copy$default(CheckboxVerticalPosition checkboxVerticalPosition, VerticalAlignment verticalAlignment, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            verticalAlignment = checkboxVerticalPosition.alignment;
        }
        if ((i12 & 2) != 0) {
            num = checkboxVerticalPosition.offset;
        }
        return checkboxVerticalPosition.copy(verticalAlignment, num);
    }

    @Y61.l
    /* renamed from: component1, reason: from getter */
    public final VerticalAlignment getAlignment() {
        return this.alignment;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final Integer getOffset() {
        return this.offset;
    }

    @Y61.k
    public final CheckboxVerticalPosition copy(@Y61.l VerticalAlignment alignment, @Y61.l Integer offset) {
        return new CheckboxVerticalPosition(alignment, offset);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckboxVerticalPosition)) {
            return false;
        }
        CheckboxVerticalPosition checkboxVerticalPosition = (CheckboxVerticalPosition) other;
        return this.alignment == checkboxVerticalPosition.alignment && L.f(this.offset, checkboxVerticalPosition.offset);
    }

    @Y61.l
    public final VerticalAlignment getAlignment() {
        return this.alignment;
    }

    @Y61.l
    public final Integer getOffset() {
        return this.offset;
    }

    public int hashCode() {
        VerticalAlignment verticalAlignment = this.alignment;
        int iHashCode = (verticalAlignment == null ? 0 : verticalAlignment.hashCode()) * 31;
        Integer num = this.offset;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CheckboxVerticalPosition(alignment=");
        sb2.append(this.alignment);
        sb2.append(", offset=");
        return s.j(sb2, this.offset, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        VerticalAlignment verticalAlignment = this.alignment;
        if (verticalAlignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(verticalAlignment.name());
        }
        Integer num = this.offset;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
