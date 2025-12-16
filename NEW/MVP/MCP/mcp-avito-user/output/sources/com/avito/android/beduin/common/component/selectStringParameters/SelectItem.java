package com.avito.android.beduin.common.component.selectStringParameters;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.model.icon.IconBase64;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectItem.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u000eR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0010¨\u0006+"}, d2 = {"Lcom/avito/android/beduin/common/component/selectStringParameters/SelectItem;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "localIcon", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "base64Icon", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "<init>", "(Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Ljava/util/List;)V", "component1", "()Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "component2", "()Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "component3", "()Ljava/util/List;", "copy", "(Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Ljava/util/List;)Lcom/avito/android/beduin/common/component/selectStringParameters/SelectItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "getLocalIcon", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "getBase64Icon", "Ljava/util/List;", "getActions", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SelectItem implements Parcelable {

    @k
    public static final Parcelable.Creator<SelectItem> CREATOR = new a();

    @l
    private final List<BeduinAction> actions;

    @l
    private final IconBase64 base64Icon;

    @l
    private final LocalIcon localIcon;

    /* compiled from: SelectItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectItem> {
        @Override // android.os.Parcelable.Creator
        public final SelectItem createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            LocalIcon localIconCreateFromParcel = parcel.readInt() == 0 ? null : LocalIcon.CREATOR.createFromParcel(parcel);
            IconBase64 iconBase64CreateFromParcel = parcel.readInt() == 0 ? null : IconBase64.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(SelectItem.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new SelectItem(localIconCreateFromParcel, iconBase64CreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectItem[] newArray(int i12) {
            return new SelectItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectItem(@l LocalIcon localIcon, @l IconBase64 iconBase64, @l List<? extends BeduinAction> list) {
        this.localIcon = localIcon;
        this.base64Icon = iconBase64;
        this.actions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectItem copy$default(SelectItem selectItem, LocalIcon localIcon, IconBase64 iconBase64, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            localIcon = selectItem.localIcon;
        }
        if ((i12 & 2) != 0) {
            iconBase64 = selectItem.base64Icon;
        }
        if ((i12 & 4) != 0) {
            list = selectItem.actions;
        }
        return selectItem.copy(localIcon, iconBase64, list);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final LocalIcon getLocalIcon() {
        return this.localIcon;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final IconBase64 getBase64Icon() {
        return this.base64Icon;
    }

    @l
    public final List<BeduinAction> component3() {
        return this.actions;
    }

    @k
    public final SelectItem copy(@l LocalIcon localIcon, @l IconBase64 base64Icon, @l List<? extends BeduinAction> actions) {
        return new SelectItem(localIcon, base64Icon, actions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectItem)) {
            return false;
        }
        SelectItem selectItem = (SelectItem) other;
        return L.f(this.localIcon, selectItem.localIcon) && L.f(this.base64Icon, selectItem.base64Icon) && L.f(this.actions, selectItem.actions);
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @l
    public final IconBase64 getBase64Icon() {
        return this.base64Icon;
    }

    @l
    public final LocalIcon getLocalIcon() {
        return this.localIcon;
    }

    public int hashCode() {
        LocalIcon localIcon = this.localIcon;
        int iHashCode = (localIcon == null ? 0 : localIcon.hashCode()) * 31;
        IconBase64 iconBase64 = this.base64Icon;
        int iHashCode2 = (iHashCode + (iconBase64 == null ? 0 : iconBase64.hashCode())) * 31;
        List<BeduinAction> list = this.actions;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SelectItem(localIcon=");
        sb2.append(this.localIcon);
        sb2.append(", base64Icon=");
        sb2.append(this.base64Icon);
        sb2.append(", actions=");
        return H.p(sb2, this.actions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        LocalIcon localIcon = this.localIcon;
        if (localIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localIcon.writeToParcel(parcel, flags);
        }
        IconBase64 iconBase64 = this.base64Icon;
        if (iconBase64 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iconBase64.writeToParcel(parcel, flags);
        }
        List<BeduinAction> list = this.actions;
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
