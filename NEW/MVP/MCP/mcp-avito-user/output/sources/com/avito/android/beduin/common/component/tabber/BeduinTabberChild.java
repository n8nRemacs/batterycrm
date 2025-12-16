package com.avito.android.beduin.common.component.tabber;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.shared.tabs.BeduinTabCounter;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinTabberModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0010R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0012¨\u0006,"}, d2 = {"Lcom/avito/android/beduin/common/component/tabber/BeduinTabberChild;", "Landroid/os/Parcelable;", "", "id", "title", "Lcom/avito/android/beduin/common/shared/tabs/BeduinTabCounter;", "counter", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onSelectTabActions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/shared/tabs/BeduinTabCounter;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/beduin/common/shared/tabs/BeduinTabCounter;", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/shared/tabs/BeduinTabCounter;Ljava/util/List;)Lcom/avito/android/beduin/common/component/tabber/BeduinTabberChild;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Lcom/avito/android/beduin/common/shared/tabs/BeduinTabCounter;", "getCounter", "Ljava/util/List;", "getOnSelectTabActions", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinTabberChild implements Parcelable {

    @k
    public static final Parcelable.Creator<BeduinTabberChild> CREATOR = new a();

    @l
    private final BeduinTabCounter counter;

    @k
    private final String id;

    @l
    private final List<BeduinAction> onSelectTabActions;

    @k
    private final String title;

    /* compiled from: BeduinTabberModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinTabberChild> {
        @Override // android.os.Parcelable.Creator
        public final BeduinTabberChild createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList arrayList = null;
            BeduinTabCounter beduinTabCounterCreateFromParcel = parcel.readInt() == 0 ? null : BeduinTabCounter.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinTabberChild.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new BeduinTabberChild(string, string2, beduinTabCounterCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinTabberChild[] newArray(int i12) {
            return new BeduinTabberChild[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinTabberChild(@k String str, @k String str2, @l BeduinTabCounter beduinTabCounter, @l List<? extends BeduinAction> list) {
        this.id = str;
        this.title = str2;
        this.counter = beduinTabCounter;
        this.onSelectTabActions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinTabberChild copy$default(BeduinTabberChild beduinTabberChild, String str, String str2, BeduinTabCounter beduinTabCounter, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinTabberChild.id;
        }
        if ((i12 & 2) != 0) {
            str2 = beduinTabberChild.title;
        }
        if ((i12 & 4) != 0) {
            beduinTabCounter = beduinTabberChild.counter;
        }
        if ((i12 & 8) != 0) {
            list = beduinTabberChild.onSelectTabActions;
        }
        return beduinTabberChild.copy(str, str2, beduinTabCounter, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final BeduinTabCounter getCounter() {
        return this.counter;
    }

    @l
    public final List<BeduinAction> component4() {
        return this.onSelectTabActions;
    }

    @k
    public final BeduinTabberChild copy(@k String id2, @k String title, @l BeduinTabCounter counter, @l List<? extends BeduinAction> onSelectTabActions) {
        return new BeduinTabberChild(id2, title, counter, onSelectTabActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinTabberChild)) {
            return false;
        }
        BeduinTabberChild beduinTabberChild = (BeduinTabberChild) other;
        return L.f(this.id, beduinTabberChild.id) && L.f(this.title, beduinTabberChild.title) && L.f(this.counter, beduinTabberChild.counter) && L.f(this.onSelectTabActions, beduinTabberChild.onSelectTabActions);
    }

    @l
    public final BeduinTabCounter getCounter() {
        return this.counter;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final List<BeduinAction> getOnSelectTabActions() {
        return this.onSelectTabActions;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
        BeduinTabCounter beduinTabCounter = this.counter;
        int iHashCode = (iD2 + (beduinTabCounter == null ? 0 : beduinTabCounter.hashCode())) * 31;
        List<BeduinAction> list = this.onSelectTabActions;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinTabberChild(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", counter=");
        sb2.append(this.counter);
        sb2.append(", onSelectTabActions=");
        return H.p(sb2, this.onSelectTabActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        BeduinTabCounter beduinTabCounter = this.counter;
        if (beduinTabCounter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinTabCounter.writeToParcel(parcel, flags);
        }
        List<BeduinAction> list = this.onSelectTabActions;
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
