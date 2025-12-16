package com.avito.android.beduin.common.action;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.beduin.common.navigation_bar.NavigationBarItem;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinOpenUniversalPageV2Action.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\fR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0010¨\u0006+"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinNavigationBar;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/action/ScreenTitle;", "screenTitle", "", "Lcom/avito/android/beduin/common/navigation_bar/NavigationBarItem;", "rightItems", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "<init>", "(Lcom/avito/android/beduin/common/action/ScreenTitle;Ljava/util/List;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Lcom/avito/android/beduin/common/action/ScreenTitle;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Lcom/avito/android/beduin/common/action/ScreenTitle;Ljava/util/List;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/beduin/common/action/BeduinNavigationBar;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/beduin/common/action/ScreenTitle;", "getScreenTitle", "Ljava/util/List;", "getRightItems", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinNavigationBar implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BeduinNavigationBar> CREATOR = new a();

    @l
    private final UniversalColor backgroundColor;

    @l
    private final List<NavigationBarItem> rightItems;

    @l
    private final ScreenTitle screenTitle;

    /* compiled from: BeduinOpenUniversalPageV2Action.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinNavigationBar> {
        @Override // android.os.Parcelable.Creator
        public final BeduinNavigationBar createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            ScreenTitle screenTitleCreateFromParcel = parcel.readInt() == 0 ? null : ScreenTitle.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinNavigationBar.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new BeduinNavigationBar(screenTitleCreateFromParcel, arrayList, (UniversalColor) parcel.readParcelable(BeduinNavigationBar.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinNavigationBar[] newArray(int i12) {
            return new BeduinNavigationBar[i12];
        }
    }

    public BeduinNavigationBar() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinNavigationBar copy$default(BeduinNavigationBar beduinNavigationBar, ScreenTitle screenTitle, List list, UniversalColor universalColor, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            screenTitle = beduinNavigationBar.screenTitle;
        }
        if ((i12 & 2) != 0) {
            list = beduinNavigationBar.rightItems;
        }
        if ((i12 & 4) != 0) {
            universalColor = beduinNavigationBar.backgroundColor;
        }
        return beduinNavigationBar.copy(screenTitle, list, universalColor);
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
    public final BeduinNavigationBar copy(@l ScreenTitle screenTitle, @l List<? extends NavigationBarItem> rightItems, @l UniversalColor backgroundColor) {
        return new BeduinNavigationBar(screenTitle, rightItems, backgroundColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinNavigationBar)) {
            return false;
        }
        BeduinNavigationBar beduinNavigationBar = (BeduinNavigationBar) other;
        return L.f(this.screenTitle, beduinNavigationBar.screenTitle) && L.f(this.rightItems, beduinNavigationBar.rightItems) && L.f(this.backgroundColor, beduinNavigationBar.backgroundColor);
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
        StringBuilder sb2 = new StringBuilder("BeduinNavigationBar(screenTitle=");
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
    public BeduinNavigationBar(@l ScreenTitle screenTitle, @l List<? extends NavigationBarItem> list, @l UniversalColor universalColor) {
        this.screenTitle = screenTitle;
        this.rightItems = list;
        this.backgroundColor = universalColor;
    }

    public /* synthetic */ BeduinNavigationBar(ScreenTitle screenTitle, List list, UniversalColor universalColor, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : screenTitle, (i12 & 2) != 0 ? null : list, (i12 & 4) != 0 ? null : universalColor);
    }
}
