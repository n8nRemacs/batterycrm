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

/* compiled from: NotCondition.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0001HÂ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001a\u00020\u000b2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0014J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u001f¨\u0006!"}, d2 = {"Lcom/avito/android/beduin/common/component/conditional_group/component/NotCondition;", "Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;", "condition", "<init>", "(Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;)V", "component1", "()Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;", "", "", "", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "", "check", "(Ljava/util/Map;)Z", "copy", "(Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;)Lcom/avito/android/beduin/common/component/conditional_group/component/NotCondition;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/conditional_group/component/Condition;", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NotCondition implements Condition {

    @Y61.k
    public static final Parcelable.Creator<NotCondition> CREATOR = new a();

    @Y61.k
    private final Condition condition;

    /* compiled from: NotCondition.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NotCondition> {
        @Override // android.os.Parcelable.Creator
        public final NotCondition createFromParcel(Parcel parcel) {
            return new NotCondition((Condition) parcel.readParcelable(NotCondition.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NotCondition[] newArray(int i12) {
            return new NotCondition[i12];
        }
    }

    /* compiled from: NotCondition.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/conditional_group/component/NotCondition$b;", "Lcom/avito/android/beduin/common/component/conditional_group/component/b;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.beduin.common.component.conditional_group.component.b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Class<? extends Condition> f101077a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f101078b;

        public b() {
            this(null, null, 3, null);
        }

        @Override // com.avito.android.beduin.common.component.conditional_group.component.b
        @Y61.k
        /* renamed from: getType, reason: from getter */
        public final String getF101078b() {
            return this.f101078b;
        }

        @Override // com.avito.android.beduin.common.component.conditional_group.component.b
        @Y61.k
        public final Class<? extends Condition> getValue() {
            return this.f101077a;
        }

        public b(Class cls, String str, int i12, C42822w c42822w) {
            cls = (i12 & 1) != 0 ? NotCondition.class : cls;
            str = (i12 & 2) != 0 ? "not" : str;
            this.f101077a = cls;
            this.f101078b = str;
        }
    }

    public NotCondition(@Y61.k Condition condition) {
        this.condition = condition;
    }

    /* renamed from: component1, reason: from getter */
    private final Condition getCondition() {
        return this.condition;
    }

    public static /* synthetic */ NotCondition copy$default(NotCondition notCondition, Condition condition, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            condition = notCondition.condition;
        }
        return notCondition.copy(condition);
    }

    @Override // com.avito.android.beduin.common.component.conditional_group.component.Condition
    public boolean check(@Y61.k Map<String, ? extends Object> parameters) {
        return !this.condition.check(parameters);
    }

    @Y61.k
    public final NotCondition copy(@Y61.k Condition condition) {
        return new NotCondition(condition);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NotCondition) && L.f(this.condition, ((NotCondition) other).condition);
    }

    public int hashCode() {
        return this.condition.hashCode();
    }

    @Y61.k
    public String toString() {
        return "NotCondition(condition=" + this.condition + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeParcelable(this.condition, flags);
    }
}
