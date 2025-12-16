package com.avito.android.beduin.common.component.conditional_group.component;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IsTabletCondition.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0010J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/beduin/common/component/conditional_group/component/IsTabletCondition;", "Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;", "<init>", "()V", "", "", "", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "", "check", "(Ljava/util/Map;)Z", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class IsTabletCondition implements Condition {

    @Y61.k
    public static final IsTabletCondition INSTANCE = new IsTabletCondition();

    @Y61.k
    public static final Parcelable.Creator<IsTabletCondition> CREATOR = new a();

    /* compiled from: IsTabletCondition.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IsTabletCondition> {
        @Override // android.os.Parcelable.Creator
        public final IsTabletCondition createFromParcel(Parcel parcel) {
            parcel.readInt();
            return IsTabletCondition.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final IsTabletCondition[] newArray(int i12) {
            return new IsTabletCondition[i12];
        }
    }

    /* compiled from: IsTabletCondition.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/conditional_group/component/IsTabletCondition$b;", "Lcom/avito/android/beduin/common/component/conditional_group/component/b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.beduin.common.component.conditional_group.component.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Class<? extends Condition> f101065a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f101066b;

        public b() {
            this(null, null, 3, null);
        }

        @Override // com.avito.android.beduin.common.component.conditional_group.component.b
        @Y61.k
        /* renamed from: getType, reason: from getter */
        public final String getF101078b() {
            return this.f101066b;
        }

        @Override // com.avito.android.beduin.common.component.conditional_group.component.b
        @Y61.k
        public final Class<? extends Condition> getValue() {
            return this.f101065a;
        }

        public b(Class cls, String str, int i12, C42822w c42822w) {
            cls = (i12 & 1) != 0 ? IsTabletCondition.class : cls;
            str = (i12 & 2) != 0 ? "isTablet" : str;
            this.f101065a = cls;
            this.f101066b = str;
        }
    }

    private IsTabletCondition() {
    }

    @Override // com.avito.android.beduin.common.component.conditional_group.component.Condition
    public boolean check(@Y61.k Map<String, ? extends Object> parameters) {
        return L.f(parameters.get("BEDUIN_SCREEN_PARAMETERS_IS_TABLET"), Boolean.TRUE);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        return IsTabletCondition.class.equals(other != null ? other.getClass() : null);
    }

    public int hashCode() {
        return IsTabletCondition.class.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeInt(1);
    }
}
