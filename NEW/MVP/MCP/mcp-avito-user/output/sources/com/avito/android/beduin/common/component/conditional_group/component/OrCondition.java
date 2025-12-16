package com.avito.android.beduin.common.component.conditional_group.component;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: OrCondition.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\f2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 ¨\u0006\""}, d2 = {"Lcom/avito/android/beduin/common/component/conditional_group/component/OrCondition;", "Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;", "", "conditions", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "", "", "", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "", "check", "(Ljava/util/Map;)Z", "copy", "(Ljava/util/List;)Lcom/avito/android/beduin/common/component/conditional_group/component/OrCondition;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes11.dex */
public final /* data */ class OrCondition implements Condition {

    @Y61.k
    public static final Parcelable.Creator<OrCondition> CREATOR = new a();

    @Y61.l
    private final List<Condition> conditions;

    /* compiled from: OrCondition.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OrCondition> {
        @Override // android.os.Parcelable.Creator
        public final OrCondition createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(OrCondition.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new OrCondition(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final OrCondition[] newArray(int i12) {
            return new OrCondition[i12];
        }
    }

    /* compiled from: OrCondition.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/conditional_group/component/OrCondition$b;", "Lcom/avito/android/beduin/common/component/conditional_group/component/b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.beduin.common.component.conditional_group.component.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Class<? extends Condition> f101079a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f101080b;

        public b() {
            this(null, null, 3, null);
        }

        @Override // com.avito.android.beduin.common.component.conditional_group.component.b
        @Y61.k
        /* renamed from: getType, reason: from getter */
        public final String getF101080b() {
            return this.f101080b;
        }

        @Override // com.avito.android.beduin.common.component.conditional_group.component.b
        @Y61.k
        public final Class<? extends Condition> getValue() {
            return this.f101079a;
        }

        public b(Class cls, String str, int i12, C42822w c42822w) {
            cls = (i12 & 1) != 0 ? OrCondition.class : cls;
            str = (i12 & 2) != 0 ? "or" : str;
            this.f101079a = cls;
            this.f101080b = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OrCondition(@Y61.l List<? extends Condition> list) {
        this.conditions = list;
    }

    private final List<Condition> component1() {
        return this.conditions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrCondition copy$default(OrCondition orCondition, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = orCondition.conditions;
        }
        return orCondition.copy(list);
    }

    @Override // com.avito.android.beduin.common.component.conditional_group.component.Condition
    public boolean check(@Y61.k Map<String, ? extends Object> parameters) {
        Iterable iterable = this.conditions;
        if (iterable == null) {
            iterable = C42784z0.f406748b;
        }
        Iterable iterable2 = iterable;
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
            return false;
        }
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            if (((Condition) it.next()).check(parameters)) {
                return true;
            }
        }
        return false;
    }

    @Y61.k
    public final OrCondition copy(@Y61.l List<? extends Condition> conditions) {
        return new OrCondition(conditions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrCondition) && L.f(this.conditions, ((OrCondition) other).conditions);
    }

    public int hashCode() {
        List<Condition> list = this.conditions;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Y61.k
    public String toString() {
        return H.p(new StringBuilder("OrCondition(conditions="), this.conditions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        List<Condition> list = this.conditions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), flags);
        }
    }
}
