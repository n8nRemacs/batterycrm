package com.avito.android.beduin.common.navigation_bar.icon;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.beduin.common.component.image.BeduinImageModel;
import com.avito.android.beduin.common.component.image.Size;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin.common.navigation_bar.NavigationBarItem;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: NavigationBarIcon.kt */
@d
@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u00012B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JB\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b\u0005\u0010\u0015R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u0017R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u0019¨\u00063"}, d2 = {"Lcom/avito/android/beduin/common/navigation_bar/icon/NavigationBarIcon;", "Lcom/avito/android/beduin/common/navigation_bar/NavigationBarItem;", "", "name", "", "isActive", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onTapActions", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "localIcon", "<init>", "(Ljava/lang/String;ZLjava/util/List;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;)V", "Lcom/avito/android/remote/model/UniversalColor;", "tint", "Lcom/avito/android/beduin_models/BeduinModel;", "toBeduinModel", "(Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Ljava/util/List;", "component4", "()Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "copy", "(Ljava/lang/String;ZLjava/util/List;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;)Lcom/avito/android/beduin/common/navigation_bar/icon/NavigationBarIcon;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "Z", "Ljava/util/List;", "getOnTapActions", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "getLocalIcon", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NavigationBarIcon implements NavigationBarItem {

    @k
    public static final Parcelable.Creator<NavigationBarIcon> CREATOR = new a();
    private final boolean isActive;

    @l
    private final LocalIcon localIcon;

    @k
    private final String name;

    @l
    private final List<BeduinAction> onTapActions;

    /* compiled from: NavigationBarIcon.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NavigationBarIcon> {
        @Override // android.os.Parcelable.Creator
        public final NavigationBarIcon createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            int iL2 = 0;
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(NavigationBarIcon.class, parcel, arrayList, iL2, 1);
                }
            }
            return new NavigationBarIcon(string, z12, arrayList, parcel.readInt() != 0 ? LocalIcon.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final NavigationBarIcon[] newArray(int i12) {
            return new NavigationBarIcon[i12];
        }
    }

    /* compiled from: NavigationBarIcon.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/navigation_bar/icon/NavigationBarIcon$b;", "Lcom/avito/android/beduin/common/navigation_bar/d;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.beduin.common.navigation_bar.d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f103443a = new b();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Class<NavigationBarIcon> f103444b = NavigationBarIcon.class;

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f103445c = "icon";

        @Override // com.avito.android.beduin.common.navigation_bar.d
        @k
        public final String getType() {
            return f103445c;
        }

        @Override // com.avito.android.beduin.common.navigation_bar.d
        @k
        public final Class<NavigationBarIcon> getValue() {
            return f103444b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavigationBarIcon(@k String str, boolean z12, @l List<? extends BeduinAction> list, @l LocalIcon localIcon) {
        this.name = str;
        this.isActive = z12;
        this.onTapActions = list;
        this.localIcon = localIcon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavigationBarIcon copy$default(NavigationBarIcon navigationBarIcon, String str, boolean z12, List list, LocalIcon localIcon, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = navigationBarIcon.name;
        }
        if ((i12 & 2) != 0) {
            z12 = navigationBarIcon.isActive;
        }
        if ((i12 & 4) != 0) {
            list = navigationBarIcon.onTapActions;
        }
        if ((i12 & 8) != 0) {
            localIcon = navigationBarIcon.localIcon;
        }
        return navigationBarIcon.copy(str, z12, list, localIcon);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @l
    public final List<BeduinAction> component3() {
        return this.onTapActions;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final LocalIcon getLocalIcon() {
        return this.localIcon;
    }

    @k
    public final NavigationBarIcon copy(@k String name, boolean isActive, @l List<? extends BeduinAction> onTapActions, @l LocalIcon localIcon) {
        return new NavigationBarIcon(name, isActive, onTapActions, localIcon);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationBarIcon)) {
            return false;
        }
        NavigationBarIcon navigationBarIcon = (NavigationBarIcon) other;
        return L.f(this.name, navigationBarIcon.name) && this.isActive == navigationBarIcon.isActive && L.f(this.onTapActions, navigationBarIcon.onTapActions) && L.f(this.localIcon, navigationBarIcon.localIcon);
    }

    @l
    public final LocalIcon getLocalIcon() {
        return this.localIcon;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @l
    public final List<BeduinAction> getOnTapActions() {
        return this.onTapActions;
    }

    public int hashCode() {
        int i12 = r.i(this.name.hashCode() * 31, 31, this.isActive);
        List<BeduinAction> list = this.onTapActions;
        int iHashCode = (i12 + (list == null ? 0 : list.hashCode())) * 31;
        LocalIcon localIcon = this.localIcon;
        return iHashCode + (localIcon != null ? localIcon.hashCode() : 0);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    @Override // com.avito.android.beduin.common.navigation_bar.NavigationBarItem
    @k
    public BeduinModel toBeduinModel(@l UniversalColor tint) {
        LocalIcon localIcon;
        String string = UUID.randomUUID().toString();
        boolean z12 = this.isActive;
        List<BeduinAction> list = z12 ? this.onTapActions : null;
        LocalIcon localIcon2 = this.localIcon;
        if (localIcon2 != null) {
            localIcon = localIcon2;
        } else {
            localIcon = !z12 ? new LocalIcon(this.name, "gray28", null, null, 12, null) : tint != null ? new LocalIcon(this.name, null, tint, null, 8, null) : new LocalIcon(this.name, AvitoMapMarkerKt.AMENITY_TYPE_BLACK, null, null, 12, null);
        }
        return new BeduinImageModel(string, null, list, null, null, localIcon, new Size(24, 24), null, null, null, 512, null);
    }

    @k
    public String toString() {
        return "NavigationBarIcon(name=" + this.name + ", isActive=" + this.isActive + ", onTapActions=" + this.onTapActions + ", localIcon=" + this.localIcon + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.name);
        parcel.writeInt(this.isActive ? 1 : 0);
        List<BeduinAction> list = this.onTapActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        LocalIcon localIcon = this.localIcon;
        if (localIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localIcon.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ NavigationBarIcon(String str, boolean z12, List list, LocalIcon localIcon, int i12, C42822w c42822w) {
        this(str, z12, list, (i12 & 8) != 0 ? null : localIcon);
    }
}
