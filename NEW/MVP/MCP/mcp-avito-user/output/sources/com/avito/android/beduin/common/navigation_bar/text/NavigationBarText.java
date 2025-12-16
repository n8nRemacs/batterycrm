package com.avito.android.beduin.common.navigation_bar.text;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.text.BeduinTextModel;
import com.avito.android.beduin.common.navigation_bar.NavigationBarItem;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalColorKt;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NavigationBarText.kt */
@d
@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001,B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J6\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b\u0005\u0010\u0013R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0015¨\u0006-"}, d2 = {"Lcom/avito/android/beduin/common/navigation_bar/text/NavigationBarText;", "Lcom/avito/android/beduin/common/navigation_bar/NavigationBarItem;", "", "text", "", "isActive", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onTapActions", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "Lcom/avito/android/remote/model/UniversalColor;", "tint", "Lcom/avito/android/beduin_models/BeduinModel;", "toBeduinModel", "(Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;ZLjava/util/List;)Lcom/avito/android/beduin/common/navigation_bar/text/NavigationBarText;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Z", "Ljava/util/List;", "getOnTapActions", "b", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NavigationBarText implements NavigationBarItem {

    @k
    public static final Parcelable.Creator<NavigationBarText> CREATOR = new a();
    private final boolean isActive;

    @l
    private final List<BeduinAction> onTapActions;

    @k
    private final String text;

    /* compiled from: NavigationBarText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NavigationBarText> {
        @Override // android.os.Parcelable.Creator
        public final NavigationBarText createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            int iL2 = 0;
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(NavigationBarText.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new NavigationBarText(string, z12, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final NavigationBarText[] newArray(int i12) {
            return new NavigationBarText[i12];
        }
    }

    /* compiled from: NavigationBarText.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/navigation_bar/text/NavigationBarText$b;", "Lcom/avito/android/beduin/common/navigation_bar/d;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.beduin.common.navigation_bar.d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f103449a = new b();

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Class<NavigationBarText> f103450b = NavigationBarText.class;

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final String f103451c = "text";

        @Override // com.avito.android.beduin.common.navigation_bar.d
        @k
        public final String getType() {
            return f103451c;
        }

        @Override // com.avito.android.beduin.common.navigation_bar.d
        @k
        public final Class<NavigationBarText> getValue() {
            return f103450b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NavigationBarText(@k String str, boolean z12, @l List<? extends BeduinAction> list) {
        this.text = str;
        this.isActive = z12;
        this.onTapActions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NavigationBarText copy$default(NavigationBarText navigationBarText, String str, boolean z12, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = navigationBarText.text;
        }
        if ((i12 & 2) != 0) {
            z12 = navigationBarText.isActive;
        }
        if ((i12 & 4) != 0) {
            list = navigationBarText.onTapActions;
        }
        return navigationBarText.copy(str, z12, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @l
    public final List<BeduinAction> component3() {
        return this.onTapActions;
    }

    @k
    public final NavigationBarText copy(@k String text, boolean isActive, @l List<? extends BeduinAction> onTapActions) {
        return new NavigationBarText(text, isActive, onTapActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationBarText)) {
            return false;
        }
        NavigationBarText navigationBarText = (NavigationBarText) other;
        return L.f(this.text, navigationBarText.text) && this.isActive == navigationBarText.isActive && L.f(this.onTapActions, navigationBarText.onTapActions);
    }

    @l
    public final List<BeduinAction> getOnTapActions() {
        return this.onTapActions;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int i12 = r.i(this.text.hashCode() * 31, 31, this.isActive);
        List<BeduinAction> list = this.onTapActions;
        return i12 + (list == null ? 0 : list.hashCode());
    }

    public final boolean isActive() {
        return this.isActive;
    }

    @Override // com.avito.android.beduin.common.navigation_bar.NavigationBarItem
    @k
    public BeduinModel toBeduinModel(@l UniversalColor tint) {
        String string = UUID.randomUUID().toString();
        String str = this.text;
        if (!this.isActive) {
            tint = UniversalColorKt.universalColorOf$default("gray28", 0, 2, null);
        } else if (tint == null) {
            tint = UniversalColorKt.universalColorOf$default("blue600", 0, 2, null);
        }
        return new BeduinTextModel(string, str, null, null, "m2", null, tint, null, null, null, this.isActive ? this.onTapActions : null);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavigationBarText(text=");
        sb2.append(this.text);
        sb2.append(", isActive=");
        sb2.append(this.isActive);
        sb2.append(", onTapActions=");
        return H.p(sb2, this.onTapActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        parcel.writeInt(this.isActive ? 1 : 0);
        List<BeduinAction> list = this.onTapActions;
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
