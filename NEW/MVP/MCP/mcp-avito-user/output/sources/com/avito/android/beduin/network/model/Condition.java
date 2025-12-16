package com.avito.android.beduin.network.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.akita.compose.component.accordion.s;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Condition.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/beduin/network/model/Condition;", "Landroid/os/Parcelable;", "()V", "isSatisfied", "", "value", "", "Equals", "Range", "Lcom/avito/android/beduin/network/model/Condition$Equals;", "Lcom/avito/android/beduin/network/model/Condition$Range;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class Condition implements Parcelable {

    /* compiled from: Condition.kt */
    @Keep
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\nJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/avito/android/beduin/network/model/Condition$Equals;", "Lcom/avito/android/beduin/network/model/Condition;", "", "value", "<init>", "(I)V", "", "isSatisfied", "(I)Z", "component1", "()I", "copy", "(I)Lcom/avito/android/beduin/network/model/Condition$Equals;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getValue", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Equals extends Condition {

        @k
        public static final Parcelable.Creator<Equals> CREATOR = new a();
        private final int value;

        /* compiled from: Condition.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Equals> {
            @Override // android.os.Parcelable.Creator
            public final Equals createFromParcel(Parcel parcel) {
                return new Equals(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Equals[] newArray(int i12) {
                return new Equals[i12];
            }
        }

        public Equals(int i12) {
            super(null);
            this.value = i12;
        }

        public static /* synthetic */ Equals copy$default(Equals equals, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i12 = equals.value;
            }
            return equals.copy(i12);
        }

        /* renamed from: component1, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        @k
        public final Equals copy(int value) {
            return new Equals(value);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Equals) && this.value == ((Equals) other).value;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return Integer.hashCode(this.value);
        }

        @Override // com.avito.android.beduin.network.model.Condition
        public boolean isSatisfied(int value) {
            return value == this.value;
        }

        @k
        public String toString() {
            return r.t(new StringBuilder("Equals(value="), this.value, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.value);
        }
    }

    /* compiled from: Condition.kt */
    @Keep
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ(\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/avito/android/beduin/network/model/Condition$Range;", "Lcom/avito/android/beduin/network/model/Condition;", "", "start", "end", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "value", "", "isSatisfied", "(I)Z", "component1", "()Ljava/lang/Integer;", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/avito/android/beduin/network/model/Condition$Range;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getStart", "getEnd", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Range extends Condition {

        @k
        public static final Parcelable.Creator<Range> CREATOR = new a();

        @l
        private final Integer end;

        @l
        private final Integer start;

        /* compiled from: Condition.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Range> {
            @Override // android.os.Parcelable.Creator
            public final Range createFromParcel(Parcel parcel) {
                return new Range(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Range[] newArray(int i12) {
                return new Range[i12];
            }
        }

        public Range(@l Integer num, @l Integer num2) {
            super(null);
            this.start = num;
            this.end = num2;
        }

        public static /* synthetic */ Range copy$default(Range range, Integer num, Integer num2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                num = range.start;
            }
            if ((i12 & 2) != 0) {
                num2 = range.end;
            }
            return range.copy(num, num2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Integer getStart() {
            return this.start;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Integer getEnd() {
            return this.end;
        }

        @k
        public final Range copy(@l Integer start, @l Integer end) {
            return new Range(start, end);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Range)) {
                return false;
            }
            Range range = (Range) other;
            return L.f(this.start, range.start) && L.f(this.end, range.end);
        }

        @l
        public final Integer getEnd() {
            return this.end;
        }

        @l
        public final Integer getStart() {
            return this.start;
        }

        public int hashCode() {
            Integer num = this.start;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.end;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        @Override // com.avito.android.beduin.network.model.Condition
        public boolean isSatisfied(int value) {
            Integer num = this.start;
            int iIntValue = num != null ? num.intValue() : BeduinInputModel.MIN_TEXT_VERSION;
            Integer num2 = this.end;
            return iIntValue <= value && value <= (num2 != null ? num2.intValue() : Integer.MAX_VALUE);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Range(start=");
            sb2.append(this.start);
            sb2.append(", end=");
            return s.j(sb2, this.end, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            Integer num = this.start;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Integer num2 = this.end;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
        }
    }

    public /* synthetic */ Condition(C42822w c42822w) {
        this();
    }

    public abstract boolean isSatisfied(int value);

    private Condition() {
    }
}
