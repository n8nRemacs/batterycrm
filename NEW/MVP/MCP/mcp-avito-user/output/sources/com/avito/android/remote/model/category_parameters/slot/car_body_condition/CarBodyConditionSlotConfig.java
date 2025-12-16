package com.avito.android.remote.model.category_parameters.slot.car_body_condition;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.CarBodyCondition;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CarBodyConditionSlotConfig.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ*\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\r¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/car_body_condition/CarBodyConditionSlotConfig;", "Lcom/avito/android/deep_linking/links/CarBodyCondition;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "", "title", "", "Lcom/avito/android/remote/model/category_parameters/slot/car_body_condition/CarBodySide;", "sides", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/category_parameters/slot/car_body_condition/CarBodyConditionSlotConfig;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getSides", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CarBodyConditionSlotConfig implements CarBodyCondition, SlotConfig {

    @k
    public static final Parcelable.Creator<CarBodyConditionSlotConfig> CREATOR = new Creator();

    @c("sides")
    @k
    private final List<CarBodySide> sides;

    @c("title")
    @k
    private final String title;

    /* compiled from: CarBodyConditionSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CarBodyConditionSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CarBodyConditionSlotConfig createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(CarBodySide.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new CarBodyConditionSlotConfig(string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CarBodyConditionSlotConfig[] newArray(int i12) {
            return new CarBodyConditionSlotConfig[i12];
        }
    }

    public CarBodyConditionSlotConfig(@k String str, @k List<CarBodySide> list) {
        this.title = str;
        this.sides = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CarBodyConditionSlotConfig copy$default(CarBodyConditionSlotConfig carBodyConditionSlotConfig, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = carBodyConditionSlotConfig.title;
        }
        if ((i12 & 2) != 0) {
            list = carBodyConditionSlotConfig.sides;
        }
        return carBodyConditionSlotConfig.copy(str, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    public final List<CarBodySide> component2() {
        return this.sides;
    }

    @k
    public final CarBodyConditionSlotConfig copy(@k String title, @k List<CarBodySide> sides) {
        return new CarBodyConditionSlotConfig(title, sides);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarBodyConditionSlotConfig)) {
            return false;
        }
        CarBodyConditionSlotConfig carBodyConditionSlotConfig = (CarBodyConditionSlotConfig) other;
        return L.f(this.title, carBodyConditionSlotConfig.title) && L.f(this.sides, carBodyConditionSlotConfig.sides);
    }

    @Override // com.avito.android.deep_linking.links.CarBodyCondition
    @k
    public List<CarBodySide> getSides() {
        return this.sides;
    }

    @Override // com.avito.android.deep_linking.links.CarBodyCondition
    @k
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.sides.hashCode() + (this.title.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CarBodyConditionSlotConfig(title=");
        sb2.append(this.title);
        sb2.append(", sides=");
        return H.p(sb2, this.sides, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        Iterator itJ = C0.j(this.sides, parcel);
        while (itJ.hasNext()) {
            ((CarBodySide) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
