package com.avito.android.autoteka.domain.model.landing;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LandingBeduinItem.kt */
@d
@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u009a\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0014J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020#HÖ\u0001¢\u0006\u0004\b+\u0010%J \u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020#HÖ\u0001¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u0014R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010\u0019R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b9\u0010\u0019R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b:\u0010\u0019R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b;\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b<\u0010\u0014R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\b>\u0010\u001f¨\u0006?"}, d2 = {"Lcom/avito/android/autoteka/domain/model/landing/LandingBeduinItem;", "Landroid/os/Parcelable;", "", "id", "topFormId", "mainFormId", "bottomFormId", "", "Lcom/avito/android/beduin_models/BeduinModel;", "topComponents", "mainComponents", "bottomComponents", "Lcom/avito/android/beduin_models/BeduinAction;", "onOpenActions", "navBarTitle", "Lcom/avito/android/remote/model/UniversalColor;", "navBarColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "component9", "component10", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/autoteka/domain/model/landing/LandingBeduinItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTopFormId", "getMainFormId", "getBottomFormId", "Ljava/util/List;", "getTopComponents", "getMainComponents", "getBottomComponents", "getOnOpenActions", "getNavBarTitle", "Lcom/avito/android/remote/model/UniversalColor;", "getNavBarColor", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LandingBeduinItem implements Parcelable {

    @k
    public static final Parcelable.Creator<LandingBeduinItem> CREATOR = new a();

    @l
    private final List<BeduinModel> bottomComponents;

    @l
    private final String bottomFormId;

    @k
    private final String id;

    @k
    private final List<BeduinModel> mainComponents;

    @k
    private final String mainFormId;

    @l
    private final UniversalColor navBarColor;

    @l
    private final String navBarTitle;

    @l
    private final List<BeduinAction> onOpenActions;

    @l
    private final List<BeduinModel> topComponents;

    @l
    private final String topFormId;

    /* compiled from: LandingBeduinItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LandingBeduinItem> {
        @Override // android.os.Parcelable.Creator
        public final LandingBeduinItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ArrayList arrayList3 = null;
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(LandingBeduinItem.class, parcel, arrayList, iL3, 1);
                }
            }
            int i13 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i13);
            int iL4 = 0;
            while (iL4 != i13) {
                iL4 = com.avito.android.actions_sheet.a.l(LandingBeduinItem.class, parcel, arrayList4, iL4, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i14 = parcel.readInt();
                arrayList2 = new ArrayList(i14);
                int iL5 = 0;
                while (iL5 != i14) {
                    iL5 = com.avito.android.actions_sheet.a.l(LandingBeduinItem.class, parcel, arrayList2, iL5, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                arrayList3 = new ArrayList(i15);
                while (iL2 != i15) {
                    iL2 = com.avito.android.actions_sheet.a.l(LandingBeduinItem.class, parcel, arrayList3, iL2, 1);
                }
            }
            return new LandingBeduinItem(string, string2, string3, string4, arrayList, arrayList4, arrayList2, arrayList3, parcel.readString(), (UniversalColor) parcel.readParcelable(LandingBeduinItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LandingBeduinItem[] newArray(int i12) {
            return new LandingBeduinItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LandingBeduinItem(@k String str, @l String str2, @k String str3, @l String str4, @l List<? extends BeduinModel> list, @k List<? extends BeduinModel> list2, @l List<? extends BeduinModel> list3, @l List<? extends BeduinAction> list4, @l String str5, @l UniversalColor universalColor) {
        this.id = str;
        this.topFormId = str2;
        this.mainFormId = str3;
        this.bottomFormId = str4;
        this.topComponents = list;
        this.mainComponents = list2;
        this.bottomComponents = list3;
        this.onOpenActions = list4;
        this.navBarTitle = str5;
        this.navBarColor = universalColor;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final UniversalColor getNavBarColor() {
        return this.navBarColor;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTopFormId() {
        return this.topFormId;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getMainFormId() {
        return this.mainFormId;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getBottomFormId() {
        return this.bottomFormId;
    }

    @l
    public final List<BeduinModel> component5() {
        return this.topComponents;
    }

    @k
    public final List<BeduinModel> component6() {
        return this.mainComponents;
    }

    @l
    public final List<BeduinModel> component7() {
        return this.bottomComponents;
    }

    @l
    public final List<BeduinAction> component8() {
        return this.onOpenActions;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getNavBarTitle() {
        return this.navBarTitle;
    }

    @k
    public final LandingBeduinItem copy(@k String id2, @l String topFormId, @k String mainFormId, @l String bottomFormId, @l List<? extends BeduinModel> topComponents, @k List<? extends BeduinModel> mainComponents, @l List<? extends BeduinModel> bottomComponents, @l List<? extends BeduinAction> onOpenActions, @l String navBarTitle, @l UniversalColor navBarColor) {
        return new LandingBeduinItem(id2, topFormId, mainFormId, bottomFormId, topComponents, mainComponents, bottomComponents, onOpenActions, navBarTitle, navBarColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingBeduinItem)) {
            return false;
        }
        LandingBeduinItem landingBeduinItem = (LandingBeduinItem) other;
        return L.f(this.id, landingBeduinItem.id) && L.f(this.topFormId, landingBeduinItem.topFormId) && L.f(this.mainFormId, landingBeduinItem.mainFormId) && L.f(this.bottomFormId, landingBeduinItem.bottomFormId) && L.f(this.topComponents, landingBeduinItem.topComponents) && L.f(this.mainComponents, landingBeduinItem.mainComponents) && L.f(this.bottomComponents, landingBeduinItem.bottomComponents) && L.f(this.onOpenActions, landingBeduinItem.onOpenActions) && L.f(this.navBarTitle, landingBeduinItem.navBarTitle) && L.f(this.navBarColor, landingBeduinItem.navBarColor);
    }

    @l
    public final List<BeduinModel> getBottomComponents() {
        return this.bottomComponents;
    }

    @l
    public final String getBottomFormId() {
        return this.bottomFormId;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final List<BeduinModel> getMainComponents() {
        return this.mainComponents;
    }

    @k
    public final String getMainFormId() {
        return this.mainFormId;
    }

    @l
    public final UniversalColor getNavBarColor() {
        return this.navBarColor;
    }

    @l
    public final String getNavBarTitle() {
        return this.navBarTitle;
    }

    @l
    public final List<BeduinAction> getOnOpenActions() {
        return this.onOpenActions;
    }

    @l
    public final List<BeduinModel> getTopComponents() {
        return this.topComponents;
    }

    @l
    public final String getTopFormId() {
        return this.topFormId;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.topFormId;
        int iD2 = H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.mainFormId);
        String str2 = this.bottomFormId;
        int iHashCode2 = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BeduinModel> list = this.topComponents;
        int iE2 = H.e((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.mainComponents);
        List<BeduinModel> list2 = this.bottomComponents;
        int iHashCode3 = (iE2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BeduinAction> list3 = this.onOpenActions;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.navBarTitle;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UniversalColor universalColor = this.navBarColor;
        return iHashCode5 + (universalColor != null ? universalColor.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LandingBeduinItem(id=");
        sb2.append(this.id);
        sb2.append(", topFormId=");
        sb2.append(this.topFormId);
        sb2.append(", mainFormId=");
        sb2.append(this.mainFormId);
        sb2.append(", bottomFormId=");
        sb2.append(this.bottomFormId);
        sb2.append(", topComponents=");
        sb2.append(this.topComponents);
        sb2.append(", mainComponents=");
        sb2.append(this.mainComponents);
        sb2.append(", bottomComponents=");
        sb2.append(this.bottomComponents);
        sb2.append(", onOpenActions=");
        sb2.append(this.onOpenActions);
        sb2.append(", navBarTitle=");
        sb2.append(this.navBarTitle);
        sb2.append(", navBarColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.navBarColor, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.topFormId);
        parcel.writeString(this.mainFormId);
        parcel.writeString(this.bottomFormId);
        List<BeduinModel> list = this.topComponents;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        Iterator itJ = C0.j(this.mainComponents, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        List<BeduinModel> list2 = this.bottomComponents;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        List<BeduinAction> list3 = this.onOpenActions;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), flags);
            }
        }
        parcel.writeString(this.navBarTitle);
        parcel.writeParcelable(this.navBarColor, flags);
    }
}
