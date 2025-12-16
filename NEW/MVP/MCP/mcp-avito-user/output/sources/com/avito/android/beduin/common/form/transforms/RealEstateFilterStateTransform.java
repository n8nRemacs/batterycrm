package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Ti.InterfaceC15365a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.component.real_estate_filter.RealEstateFilterState;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RealEstateFilterState.kt */
@d
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006 "}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/RealEstateFilterStateTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilterState;", "filterState", "<init>", "(Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilterState;)V", "component1", "()Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilterState;", "copy", "(Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilterState;)Lcom/avito/android/beduin/common/form/transforms/RealEstateFilterStateTransform;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/real_estate_filter/RealEstateFilterState;", "getFilterState", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class RealEstateFilterStateTransform implements BeduinModelTransform {

    @k
    private final RealEstateFilterState filterState;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<RealEstateFilterStateTransform> CREATOR = new b();

    @k
    private static final Class<? extends BeduinModelTransform> transform = RealEstateFilterStateTransform.class;

    @k
    private static final String type = "RealEstateFilterState";

    /* compiled from: RealEstateFilterState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/RealEstateFilterStateTransform$a;", "LTi/a;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.form.transforms.RealEstateFilterStateTransform$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15365a {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final Class<? extends BeduinModelTransform> a() {
            return RealEstateFilterStateTransform.transform;
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final String getType() {
            return RealEstateFilterStateTransform.type;
        }

        public Companion() {
        }
    }

    /* compiled from: RealEstateFilterState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<RealEstateFilterStateTransform> {
        @Override // android.os.Parcelable.Creator
        public final RealEstateFilterStateTransform createFromParcel(Parcel parcel) {
            return new RealEstateFilterStateTransform(RealEstateFilterState.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final RealEstateFilterStateTransform[] newArray(int i12) {
            return new RealEstateFilterStateTransform[i12];
        }
    }

    public RealEstateFilterStateTransform(@k RealEstateFilterState realEstateFilterState) {
        this.filterState = realEstateFilterState;
    }

    public static /* synthetic */ RealEstateFilterStateTransform copy$default(RealEstateFilterStateTransform realEstateFilterStateTransform, RealEstateFilterState realEstateFilterState, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            realEstateFilterState = realEstateFilterStateTransform.filterState;
        }
        return realEstateFilterStateTransform.copy(realEstateFilterState);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final RealEstateFilterState getFilterState() {
        return this.filterState;
    }

    @k
    public final RealEstateFilterStateTransform copy(@k RealEstateFilterState filterState) {
        return new RealEstateFilterStateTransform(filterState);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RealEstateFilterStateTransform) && L.f(this.filterState, ((RealEstateFilterStateTransform) other).filterState);
    }

    @k
    public final RealEstateFilterState getFilterState() {
        return this.filterState;
    }

    public int hashCode() {
        return this.filterState.hashCode();
    }

    @k
    public String toString() {
        return "RealEstateFilterStateTransform(filterState=" + this.filterState + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.filterState.writeToParcel(parcel, flags);
    }
}
