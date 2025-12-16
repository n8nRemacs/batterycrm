package com.avito.android.beduin.common.component.pixel;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.network.model.Condition;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinPixelModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006*"}, d2 = {"Lcom/avito/android/beduin/common/component/pixel/PixelActionModel;", "Lcom/avito/android/beduin_models/BeduinAction;", "Lcom/avito/android/beduin/network/model/Condition;", "conditionRange", "", "actions", "Lcom/avito/android/beduin/common/component/pixel/PixelScreenPosition;", "screenPosition", "<init>", "(Lcom/avito/android/beduin/network/model/Condition;Ljava/util/List;Lcom/avito/android/beduin/common/component/pixel/PixelScreenPosition;)V", "component1", "()Lcom/avito/android/beduin/network/model/Condition;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/beduin/common/component/pixel/PixelScreenPosition;", "copy", "(Lcom/avito/android/beduin/network/model/Condition;Ljava/util/List;Lcom/avito/android/beduin/common/component/pixel/PixelScreenPosition;)Lcom/avito/android/beduin/common/component/pixel/PixelActionModel;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/network/model/Condition;", "getConditionRange", "Ljava/util/List;", "getActions", "Lcom/avito/android/beduin/common/component/pixel/PixelScreenPosition;", "getScreenPosition", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PixelActionModel implements BeduinAction {

    @k
    public static final Parcelable.Creator<PixelActionModel> CREATOR = new a();

    @k
    private final List<BeduinAction> actions;

    @k
    private final Condition conditionRange;

    @l
    private final PixelScreenPosition screenPosition;

    /* compiled from: BeduinPixelModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PixelActionModel> {
        @Override // android.os.Parcelable.Creator
        public final PixelActionModel createFromParcel(Parcel parcel) {
            Condition condition = (Condition) parcel.readParcelable(PixelActionModel.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(PixelActionModel.class, parcel, arrayList, iL2, 1);
            }
            return new PixelActionModel(condition, arrayList, parcel.readInt() == 0 ? null : PixelScreenPosition.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PixelActionModel[] newArray(int i12) {
            return new PixelActionModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PixelActionModel(@k Condition condition, @k List<? extends BeduinAction> list, @l PixelScreenPosition pixelScreenPosition) {
        this.conditionRange = condition;
        this.actions = list;
        this.screenPosition = pixelScreenPosition;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PixelActionModel copy$default(PixelActionModel pixelActionModel, Condition condition, List list, PixelScreenPosition pixelScreenPosition, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            condition = pixelActionModel.conditionRange;
        }
        if ((i12 & 2) != 0) {
            list = pixelActionModel.actions;
        }
        if ((i12 & 4) != 0) {
            pixelScreenPosition = pixelActionModel.screenPosition;
        }
        return pixelActionModel.copy(condition, list, pixelScreenPosition);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Condition getConditionRange() {
        return this.conditionRange;
    }

    @k
    public final List<BeduinAction> component2() {
        return this.actions;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final PixelScreenPosition getScreenPosition() {
        return this.screenPosition;
    }

    @k
    public final PixelActionModel copy(@k Condition conditionRange, @k List<? extends BeduinAction> actions, @l PixelScreenPosition screenPosition) {
        return new PixelActionModel(conditionRange, actions, screenPosition);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PixelActionModel)) {
            return false;
        }
        PixelActionModel pixelActionModel = (PixelActionModel) other;
        return L.f(this.conditionRange, pixelActionModel.conditionRange) && L.f(this.actions, pixelActionModel.actions) && L.f(this.screenPosition, pixelActionModel.screenPosition);
    }

    @k
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @k
    public final Condition getConditionRange() {
        return this.conditionRange;
    }

    @l
    public final PixelScreenPosition getScreenPosition() {
        return this.screenPosition;
    }

    public int hashCode() {
        int iE2 = H.e(this.conditionRange.hashCode() * 31, 31, this.actions);
        PixelScreenPosition pixelScreenPosition = this.screenPosition;
        return iE2 + (pixelScreenPosition == null ? 0 : pixelScreenPosition.hashCode());
    }

    @k
    public String toString() {
        return "PixelActionModel(conditionRange=" + this.conditionRange + ", actions=" + this.actions + ", screenPosition=" + this.screenPosition + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.conditionRange, flags);
        Iterator itJ = C0.j(this.actions, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        PixelScreenPosition pixelScreenPosition = this.screenPosition;
        if (pixelScreenPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            pixelScreenPosition.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ PixelActionModel(Condition condition, List list, PixelScreenPosition pixelScreenPosition, int i12, C42822w c42822w) {
        this(condition, list, (i12 & 4) != 0 ? null : pixelScreenPosition);
    }
}
