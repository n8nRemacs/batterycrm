package com.avito.android.beduin.common.component.conditional_group.component;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: IsScreenWidthAtLeastCondition.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\f"}, d2 = {"Lcom/avito/android/beduin/common/component/conditional_group/component/IsScreenWidthAtLeastCondition;", "Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;", "", "width", "Lcom/avito/android/beduin/common/component/conditional_group/component/IsScreenWidthAtLeastCondition$Dimension;", "_dimension", "<init>", "(ILcom/avito/android/beduin/common/component/conditional_group/component/IsScreenWidthAtLeastCondition$Dimension;)V", "I", "Lcom/avito/android/beduin/common/component/conditional_group/component/IsScreenWidthAtLeastCondition$Dimension;", "Dimension", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class IsScreenWidthAtLeastCondition implements Condition {

    @Y61.k
    public static final Parcelable.Creator<IsScreenWidthAtLeastCondition> CREATOR = new a();

    @com.google.gson.annotations.c("dimension")
    @Y61.l
    private final Dimension _dimension;

    @com.google.gson.annotations.c("width")
    private final int width;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IsScreenWidthAtLeastCondition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/conditional_group/component/IsScreenWidthAtLeastCondition$Dimension;", "", "(Ljava/lang/String;I)V", "Px", "Dp", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Dimension {

        /* renamed from: Dp, reason: collision with root package name */
        @com.google.gson.annotations.c("dp")
        public static final Dimension f101058Dp;

        /* renamed from: Px, reason: collision with root package name */
        @com.google.gson.annotations.c("px")
        public static final Dimension f101059Px;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Dimension[] f101060b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f101061c;

        static {
            Dimension dimension = new Dimension("Px", 0);
            f101059Px = dimension;
            Dimension dimension2 = new Dimension("Dp", 1);
            f101058Dp = dimension2;
            Dimension[] dimensionArr = {dimension, dimension2};
            f101060b = dimensionArr;
            f101061c = kotlin.enums.c.a(dimensionArr);
        }

        private Dimension(String str, int i12) {
        }

        public static Dimension valueOf(String str) {
            return (Dimension) Enum.valueOf(Dimension.class, str);
        }

        public static Dimension[] values() {
            return (Dimension[]) f101060b.clone();
        }
    }

    /* compiled from: IsScreenWidthAtLeastCondition.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IsScreenWidthAtLeastCondition> {
        @Override // android.os.Parcelable.Creator
        public final IsScreenWidthAtLeastCondition createFromParcel(Parcel parcel) {
            return new IsScreenWidthAtLeastCondition(parcel.readInt(), parcel.readInt() == 0 ? null : Dimension.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final IsScreenWidthAtLeastCondition[] newArray(int i12) {
            return new IsScreenWidthAtLeastCondition[i12];
        }
    }

    /* compiled from: IsScreenWidthAtLeastCondition.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/conditional_group/component/IsScreenWidthAtLeastCondition$b;", "Lcom/avito/android/beduin/common/component/conditional_group/component/b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.beduin.common.component.conditional_group.component.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Class<? extends Condition> f101062a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f101063b;

        public b() {
            this(null, null, 3, null);
        }

        @Override // com.avito.android.beduin.common.component.conditional_group.component.b
        @Y61.k
        /* renamed from: getType, reason: from getter */
        public final String getF101063b() {
            return this.f101063b;
        }

        @Override // com.avito.android.beduin.common.component.conditional_group.component.b
        @Y61.k
        public final Class<? extends Condition> getValue() {
            return this.f101062a;
        }

        public b(Class cls, String str, int i12, C42822w c42822w) {
            cls = (i12 & 1) != 0 ? IsScreenWidthAtLeastCondition.class : cls;
            str = (i12 & 2) != 0 ? "isScreenWidthAtLeast" : str;
            this.f101062a = cls;
            this.f101063b = str;
        }
    }

    /* compiled from: IsScreenWidthAtLeastCondition.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101064a;

        static {
            int[] iArr = new int[Dimension.values().length];
            try {
                iArr[Dimension.f101059Px.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Dimension.f101058Dp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f101064a = iArr;
        }
    }

    public IsScreenWidthAtLeastCondition(int i12, @Y61.l Dimension dimension) {
        this.width = i12;
        this._dimension = dimension;
    }

    @Override // com.avito.android.beduin.common.component.conditional_group.component.Condition
    public final boolean check(@Y61.k Map<String, ? extends Object> map) {
        Object obj;
        Dimension dimension = this._dimension;
        if (dimension == null) {
            dimension = Dimension.f101059Px;
        }
        int i12 = c.f101064a[dimension.ordinal()];
        if (i12 == 1) {
            obj = map.get("BEDUIN_SCREEN_PARAMETERS_WIDTH_PX");
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            obj = map.get("BEDUIN_SCREEN_PARAMETERS_WIDTH_DP");
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        return num != null && num.intValue() >= this.width;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IsScreenWidthAtLeastCondition)) {
            return false;
        }
        IsScreenWidthAtLeastCondition isScreenWidthAtLeastCondition = (IsScreenWidthAtLeastCondition) obj;
        return this.width == isScreenWidthAtLeastCondition.width && this._dimension == isScreenWidthAtLeastCondition._dimension;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.width) * 31;
        Dimension dimension = this._dimension;
        return iHashCode + (dimension == null ? 0 : dimension.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "IsScreenWidthAtLeastCondition(width=" + this.width + ", _dimension=" + this._dimension + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.width);
        Dimension dimension = this._dimension;
        if (dimension == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dimension.name());
        }
    }
}
