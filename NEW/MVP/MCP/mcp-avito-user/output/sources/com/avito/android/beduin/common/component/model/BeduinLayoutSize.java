package com.avito.android.beduin.common.component.model;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinLayoutParams.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize;", "Landroid/os/Parcelable;", "()V", "Fixed", "MatchParent", "Percent", "Ratio", "WrapContent", "Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Fixed;", "Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$MatchParent;", "Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Percent;", "Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Ratio;", "Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$WrapContent;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BeduinLayoutSize implements Parcelable {

    /* compiled from: BeduinLayoutParams.kt */
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Fixed;", "Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize;", "Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Fixed$Params;", "params", "<init>", "(Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Fixed$Params;)V", "component1", "()Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Fixed$Params;", "copy", "(Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Fixed$Params;)Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Fixed;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Fixed$Params;", "getParams", "Params", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Fixed extends BeduinLayoutSize {

        @k
        public static final Parcelable.Creator<Fixed> CREATOR = new a();

        @k
        private final Params params;

        /* compiled from: BeduinLayoutParams.kt */
        @Keep
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Fixed$Params;", "Landroid/os/Parcelable;", "", "value", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Fixed$Params;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getValue", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Params implements Parcelable {

            @k
            public static final Parcelable.Creator<Params> CREATOR = new a();
            private final int value;

            /* compiled from: BeduinLayoutParams.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Params> {
                @Override // android.os.Parcelable.Creator
                public final Params createFromParcel(Parcel parcel) {
                    return new Params(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Params[] newArray(int i12) {
                    return new Params[i12];
                }
            }

            public Params(int i12) {
                this.value = i12;
            }

            public static /* synthetic */ Params copy$default(Params params, int i12, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    i12 = params.value;
                }
                return params.copy(i12);
            }

            /* renamed from: component1, reason: from getter */
            public final int getValue() {
                return this.value;
            }

            @k
            public final Params copy(int value) {
                return new Params(value);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Params) && this.value == ((Params) other).value;
            }

            public final int getValue() {
                return this.value;
            }

            public int hashCode() {
                return Integer.hashCode(this.value);
            }

            @k
            public String toString() {
                return r.t(new StringBuilder("Params(value="), this.value, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(this.value);
            }
        }

        /* compiled from: BeduinLayoutParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Fixed> {
            @Override // android.os.Parcelable.Creator
            public final Fixed createFromParcel(Parcel parcel) {
                return new Fixed(Params.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Fixed[] newArray(int i12) {
                return new Fixed[i12];
            }
        }

        public Fixed(@k Params params) {
            super(null);
            this.params = params;
        }

        public static /* synthetic */ Fixed copy$default(Fixed fixed, Params params, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                params = fixed.params;
            }
            return fixed.copy(params);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final Params getParams() {
            return this.params;
        }

        @k
        public final Fixed copy(@k Params params) {
            return new Fixed(params);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Fixed) && L.f(this.params, ((Fixed) other).params);
        }

        @k
        public final Params getParams() {
            return this.params;
        }

        public int hashCode() {
            return this.params.hashCode();
        }

        @k
        public String toString() {
            return "Fixed(params=" + this.params + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.params.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: BeduinLayoutParams.kt */
    @Keep
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\f\u0010\u000bJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$MatchParent;", "Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize;", "<init>", "()V", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class MatchParent extends BeduinLayoutSize {

        @k
        public static final MatchParent INSTANCE = new MatchParent();

        @k
        public static final Parcelable.Creator<MatchParent> CREATOR = new a();

        /* compiled from: BeduinLayoutParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MatchParent> {
            @Override // android.os.Parcelable.Creator
            public final MatchParent createFromParcel(Parcel parcel) {
                parcel.readInt();
                return MatchParent.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final MatchParent[] newArray(int i12) {
                return new MatchParent[i12];
            }
        }

        private MatchParent() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return MatchParent.class.equals(other != null ? other.getClass() : null);
        }

        public int hashCode() {
            return MatchParent.class.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: BeduinLayoutParams.kt */
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Percent;", "Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize;", "Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Percent$Params;", "params", "<init>", "(Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Percent$Params;)V", "component1", "()Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Percent$Params;", "copy", "(Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Percent$Params;)Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Percent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Percent$Params;", "getParams", "Params", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Percent extends BeduinLayoutSize {

        @k
        public static final Parcelable.Creator<Percent> CREATOR = new a();

        @k
        private final Params params;

        /* compiled from: BeduinLayoutParams.kt */
        @Keep
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Percent$Params;", "Landroid/os/Parcelable;", "", "value", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Percent$Params;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getValue", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Params implements Parcelable {

            @k
            public static final Parcelable.Creator<Params> CREATOR = new a();
            private final int value;

            /* compiled from: BeduinLayoutParams.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Params> {
                @Override // android.os.Parcelable.Creator
                public final Params createFromParcel(Parcel parcel) {
                    return new Params(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Params[] newArray(int i12) {
                    return new Params[i12];
                }
            }

            public Params(int i12) {
                this.value = i12;
            }

            public static /* synthetic */ Params copy$default(Params params, int i12, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    i12 = params.value;
                }
                return params.copy(i12);
            }

            /* renamed from: component1, reason: from getter */
            public final int getValue() {
                return this.value;
            }

            @k
            public final Params copy(int value) {
                return new Params(value);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Params) && this.value == ((Params) other).value;
            }

            public final int getValue() {
                return this.value;
            }

            public int hashCode() {
                return Integer.hashCode(this.value);
            }

            @k
            public String toString() {
                return r.t(new StringBuilder("Params(value="), this.value, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(this.value);
            }
        }

        /* compiled from: BeduinLayoutParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Percent> {
            @Override // android.os.Parcelable.Creator
            public final Percent createFromParcel(Parcel parcel) {
                return new Percent(Params.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Percent[] newArray(int i12) {
                return new Percent[i12];
            }
        }

        public Percent(@k Params params) {
            super(null);
            this.params = params;
        }

        public static /* synthetic */ Percent copy$default(Percent percent, Params params, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                params = percent.params;
            }
            return percent.copy(params);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final Params getParams() {
            return this.params;
        }

        @k
        public final Percent copy(@k Params params) {
            return new Percent(params);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Percent) && L.f(this.params, ((Percent) other).params);
        }

        @k
        public final Params getParams() {
            return this.params;
        }

        public int hashCode() {
            return this.params.hashCode();
        }

        @k
        public String toString() {
            return "Percent(params=" + this.params + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.params.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: BeduinLayoutParams.kt */
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Ratio;", "Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize;", "Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Ratio$Params;", "params", "<init>", "(Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Ratio$Params;)V", "component1", "()Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Ratio$Params;", "copy", "(Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Ratio$Params;)Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Ratio;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Ratio$Params;", "getParams", "Params", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Ratio extends BeduinLayoutSize {

        @k
        public static final Parcelable.Creator<Ratio> CREATOR = new a();

        @k
        private final Params params;

        /* compiled from: BeduinLayoutParams.kt */
        @Keep
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Ratio$Params;", "Landroid/os/Parcelable;", "", "value", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$Ratio$Params;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getValue", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Params implements Parcelable {

            @k
            public static final Parcelable.Creator<Params> CREATOR = new a();
            private final int value;

            /* compiled from: BeduinLayoutParams.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Params> {
                @Override // android.os.Parcelable.Creator
                public final Params createFromParcel(Parcel parcel) {
                    return new Params(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Params[] newArray(int i12) {
                    return new Params[i12];
                }
            }

            public Params(int i12) {
                this.value = i12;
            }

            public static /* synthetic */ Params copy$default(Params params, int i12, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    i12 = params.value;
                }
                return params.copy(i12);
            }

            /* renamed from: component1, reason: from getter */
            public final int getValue() {
                return this.value;
            }

            @k
            public final Params copy(int value) {
                return new Params(value);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Params) && this.value == ((Params) other).value;
            }

            public final int getValue() {
                return this.value;
            }

            public int hashCode() {
                return Integer.hashCode(this.value);
            }

            @k
            public String toString() {
                return r.t(new StringBuilder("Params(value="), this.value, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeInt(this.value);
            }
        }

        /* compiled from: BeduinLayoutParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Ratio> {
            @Override // android.os.Parcelable.Creator
            public final Ratio createFromParcel(Parcel parcel) {
                return new Ratio(Params.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Ratio[] newArray(int i12) {
                return new Ratio[i12];
            }
        }

        public Ratio(@k Params params) {
            super(null);
            this.params = params;
        }

        public static /* synthetic */ Ratio copy$default(Ratio ratio, Params params, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                params = ratio.params;
            }
            return ratio.copy(params);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final Params getParams() {
            return this.params;
        }

        @k
        public final Ratio copy(@k Params params) {
            return new Ratio(params);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ratio) && L.f(this.params, ((Ratio) other).params);
        }

        @k
        public final Params getParams() {
            return this.params;
        }

        public int hashCode() {
            return this.params.hashCode();
        }

        @k
        public String toString() {
            return "Ratio(params=" + this.params + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.params.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: BeduinLayoutParams.kt */
    @Keep
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\f\u0010\u000bJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize$WrapContent;", "Lcom/avito/android/beduin/common/component/model/BeduinLayoutSize;", "<init>", "()V", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class WrapContent extends BeduinLayoutSize {

        @k
        public static final WrapContent INSTANCE = new WrapContent();

        @k
        public static final Parcelable.Creator<WrapContent> CREATOR = new a();

        /* compiled from: BeduinLayoutParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WrapContent> {
            @Override // android.os.Parcelable.Creator
            public final WrapContent createFromParcel(Parcel parcel) {
                parcel.readInt();
                return WrapContent.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final WrapContent[] newArray(int i12) {
                return new WrapContent[i12];
            }
        }

        private WrapContent() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return WrapContent.class.equals(other != null ? other.getClass() : null);
        }

        public int hashCode() {
            return WrapContent.class.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ BeduinLayoutSize(C42822w c42822w) {
        this();
    }

    private BeduinLayoutSize() {
    }
}
