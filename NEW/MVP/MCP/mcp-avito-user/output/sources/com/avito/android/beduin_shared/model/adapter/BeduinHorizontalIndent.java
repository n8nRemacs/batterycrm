package com.avito.android.beduin_shared.model.adapter;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.akita.compose.component.accordion.s;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import j.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinHorizontalIndent.kt */
@d
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010R\u0011\u0010!\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b \u0010\u0010¨\u0006\""}, d2 = {"Lcom/avito/android/beduin_shared/model/adapter/BeduinHorizontalIndent;", "Landroid/os/Parcelable;", "", "left", "right", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/avito/android/beduin_shared/model/adapter/BeduinHorizontalIndent;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getLeftIndent", "leftIndent", "getRightIndent", "rightIndent", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinHorizontalIndent implements Parcelable {

    @k
    public static final Parcelable.Creator<BeduinHorizontalIndent> CREATOR = new a();

    @l
    private final Integer left;

    @l
    private final Integer right;

    /* compiled from: BeduinHorizontalIndent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinHorizontalIndent> {
        @Override // android.os.Parcelable.Creator
        public final BeduinHorizontalIndent createFromParcel(Parcel parcel) {
            return new BeduinHorizontalIndent(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinHorizontalIndent[] newArray(int i12) {
            return new BeduinHorizontalIndent[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinHorizontalIndent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final Integer getLeft() {
        return this.left;
    }

    /* renamed from: component2, reason: from getter */
    private final Integer getRight() {
        return this.right;
    }

    public static /* synthetic */ BeduinHorizontalIndent copy$default(BeduinHorizontalIndent beduinHorizontalIndent, Integer num, Integer num2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            num = beduinHorizontalIndent.left;
        }
        if ((i12 & 2) != 0) {
            num2 = beduinHorizontalIndent.right;
        }
        return beduinHorizontalIndent.copy(num, num2);
    }

    @k
    public final BeduinHorizontalIndent copy(@r @l Integer left, @r @l Integer right) {
        return new BeduinHorizontalIndent(left, right);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinHorizontalIndent)) {
            return false;
        }
        BeduinHorizontalIndent beduinHorizontalIndent = (BeduinHorizontalIndent) other;
        return L.f(this.left, beduinHorizontalIndent.left) && L.f(this.right, beduinHorizontalIndent.right);
    }

    public final int getLeftIndent() {
        Integer num = this.left;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final int getRightIndent() {
        Integer num = this.right;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public int hashCode() {
        Integer num = this.left;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.right;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinHorizontalIndent(left=");
        sb2.append(this.left);
        sb2.append(", right=");
        return s.j(sb2, this.right, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Integer num = this.left;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.right;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
    }

    public BeduinHorizontalIndent(@r @l Integer num, @r @l Integer num2) {
        this.left = num;
        this.right = num2;
    }

    public /* synthetic */ BeduinHorizontalIndent(Integer num, Integer num2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : num2);
    }
}
