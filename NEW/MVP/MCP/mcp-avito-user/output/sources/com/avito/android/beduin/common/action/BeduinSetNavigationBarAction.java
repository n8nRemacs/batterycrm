package com.avito.android.beduin.common.action;

import Ui.InterfaceC15524c;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.navigation_bar.NavigationBarItem;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSetNavigationBarAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001-B1\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\rR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0011¨\u0006."}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinSetNavigationBarAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "LUi/e;", "Lcom/avito/android/beduin/common/action/ScreenTitle;", "screenTitle", "", "Lcom/avito/android/beduin/common/navigation_bar/NavigationBarItem;", "rightItems", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "<init>", "(Lcom/avito/android/beduin/common/action/ScreenTitle;Ljava/util/List;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Lcom/avito/android/beduin/common/action/ScreenTitle;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Lcom/avito/android/beduin/common/action/ScreenTitle;Ljava/util/List;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/beduin/common/action/BeduinSetNavigationBarAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/action/ScreenTitle;", "getScreenTitle", "Ljava/util/List;", "getRightItems", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinSetNavigationBarAction implements BeduinAction, Ui.e {

    @l
    private final UniversalColor backgroundColor;

    @l
    private final List<NavigationBarItem> rightItems;

    @l
    private final ScreenTitle screenTitle;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<BeduinSetNavigationBarAction> CREATOR = new b();

    @Y61.k
    private static final Class<? extends BeduinAction> action = BeduinSetNavigationBarAction.class;

    @Y61.k
    private static final String type = "setNavigationBar";

    /* compiled from: BeduinSetNavigationBarAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinSetNavigationBarAction$a;", "LUi/c;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.action.BeduinSetNavigationBarAction$a, reason: from kotlin metadata */
    public static final class Companion implements InterfaceC15524c {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        public final Class<? extends BeduinAction> getAction() {
            return BeduinSetNavigationBarAction.action;
        }

        @Override // Ui.InterfaceC15524c
        @Y61.k
        /* renamed from: getType */
        public final String getF105301c() {
            return BeduinSetNavigationBarAction.type;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinSetNavigationBarAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinSetNavigationBarAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSetNavigationBarAction createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            ScreenTitle screenTitleCreateFromParcel = parcel.readInt() == 0 ? null : ScreenTitle.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinSetNavigationBarAction.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new BeduinSetNavigationBarAction(screenTitleCreateFromParcel, arrayList, (UniversalColor) parcel.readParcelable(BeduinSetNavigationBarAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSetNavigationBarAction[] newArray(int i12) {
            return new BeduinSetNavigationBarAction[i12];
        }
    }

    public BeduinSetNavigationBarAction() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinSetNavigationBarAction copy$default(BeduinSetNavigationBarAction beduinSetNavigationBarAction, ScreenTitle screenTitle, List list, UniversalColor universalColor, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            screenTitle = beduinSetNavigationBarAction.screenTitle;
        }
        if ((i12 & 2) != 0) {
            list = beduinSetNavigationBarAction.rightItems;
        }
        if ((i12 & 4) != 0) {
            universalColor = beduinSetNavigationBarAction.backgroundColor;
        }
        return beduinSetNavigationBarAction.copy(screenTitle, list, universalColor);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final ScreenTitle getScreenTitle() {
        return this.screenTitle;
    }

    @l
    public final List<NavigationBarItem> component2() {
        return this.rightItems;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @Y61.k
    public final BeduinSetNavigationBarAction copy(@l ScreenTitle screenTitle, @l List<? extends NavigationBarItem> rightItems, @l UniversalColor backgroundColor) {
        return new BeduinSetNavigationBarAction(screenTitle, rightItems, backgroundColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinSetNavigationBarAction)) {
            return false;
        }
        BeduinSetNavigationBarAction beduinSetNavigationBarAction = (BeduinSetNavigationBarAction) other;
        return L.f(this.screenTitle, beduinSetNavigationBarAction.screenTitle) && L.f(this.rightItems, beduinSetNavigationBarAction.rightItems) && L.f(this.backgroundColor, beduinSetNavigationBarAction.backgroundColor);
    }

    @l
    public final UniversalColor getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final List<NavigationBarItem> getRightItems() {
        return this.rightItems;
    }

    @l
    public final ScreenTitle getScreenTitle() {
        return this.screenTitle;
    }

    public int hashCode() {
        ScreenTitle screenTitle = this.screenTitle;
        int iHashCode = (screenTitle == null ? 0 : screenTitle.hashCode()) * 31;
        List<NavigationBarItem> list = this.rightItems;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        UniversalColor universalColor = this.backgroundColor;
        return iHashCode2 + (universalColor != null ? universalColor.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinSetNavigationBarAction(screenTitle=");
        sb2.append(this.screenTitle);
        sb2.append(", rightItems=");
        sb2.append(this.rightItems);
        sb2.append(", backgroundColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.backgroundColor, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        ScreenTitle screenTitle = this.screenTitle;
        if (screenTitle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            screenTitle.writeToParcel(parcel, flags);
        }
        List<NavigationBarItem> list = this.rightItems;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeParcelable(this.backgroundColor, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinSetNavigationBarAction(@l ScreenTitle screenTitle, @l List<? extends NavigationBarItem> list, @l UniversalColor universalColor) {
        this.screenTitle = screenTitle;
        this.rightItems = list;
        this.backgroundColor = universalColor;
    }

    public /* synthetic */ BeduinSetNavigationBarAction(ScreenTitle screenTitle, List list, UniversalColor universalColor, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : screenTitle, (i12 & 2) != 0 ? null : list, (i12 & 4) != 0 ? null : universalColor);
    }
}
