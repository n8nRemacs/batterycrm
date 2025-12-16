package com.avito.android.remote.autoteka.model;

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
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaLandingResponse.kt */
@d
@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u008e\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0013J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020!HÖ\u0001¢\u0006\u0004\b)\u0010#J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020!HÖ\u0001¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u0013R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010\u0018R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b7\u0010\u0018R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b8\u0010\u0018R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b9\u0010\u0018R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010\u001d¨\u0006<"}, d2 = {"Lcom/avito/android/remote/autoteka/model/AutotekaLandingResponse;", "Landroid/os/Parcelable;", "", "id", "topFormId", "mainFormId", "bottomFormId", "", "Lcom/avito/android/beduin_models/BeduinModel;", "topComponents", "Lcom/avito/android/beduin_models/BeduinAction;", "onOpenActions", "mainComponents", "bottomComponents", "Lcom/avito/android/remote/autoteka/model/AutotekaLandingNavBarParams;", "navigationBar", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/autoteka/model/AutotekaLandingNavBarParams;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "component9", "()Lcom/avito/android/remote/autoteka/model/AutotekaLandingNavBarParams;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/autoteka/model/AutotekaLandingNavBarParams;)Lcom/avito/android/remote/autoteka/model/AutotekaLandingResponse;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTopFormId", "getMainFormId", "getBottomFormId", "Ljava/util/List;", "getTopComponents", "getOnOpenActions", "getMainComponents", "getBottomComponents", "Lcom/avito/android/remote/autoteka/model/AutotekaLandingNavBarParams;", "getNavigationBar", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutotekaLandingResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<AutotekaLandingResponse> CREATOR = new a();

    @c("bottomComponents")
    @l
    private final List<BeduinModel> bottomComponents;

    @c("bottomFormId")
    @l
    private final String bottomFormId;

    @c("id")
    @k
    private final String id;

    @c("mainComponents")
    @k
    private final List<BeduinModel> mainComponents;

    @c("mainFormId")
    @k
    private final String mainFormId;

    @c("navigationBar")
    @l
    private final AutotekaLandingNavBarParams navigationBar;

    @c("onOpenActions")
    @l
    private final List<BeduinAction> onOpenActions;

    @c("topComponents")
    @l
    private final List<BeduinModel> topComponents;

    @c("topFormId")
    @l
    private final String topFormId;

    /* compiled from: AutotekaLandingResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutotekaLandingResponse> {
        @Override // android.os.Parcelable.Creator
        public final AutotekaLandingResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(AutotekaLandingResponse.class, parcel, arrayList, iL3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iL4 = 0;
                while (iL4 != i13) {
                    iL4 = com.avito.android.actions_sheet.a.l(AutotekaLandingResponse.class, parcel, arrayList2, iL4, 1);
                }
            }
            int i14 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i14);
            int iL5 = 0;
            while (iL5 != i14) {
                iL5 = com.avito.android.actions_sheet.a.l(AutotekaLandingResponse.class, parcel, arrayList4, iL5, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList3 = new ArrayList(i15);
                while (iL2 != i15) {
                    iL2 = com.avito.android.actions_sheet.a.l(AutotekaLandingResponse.class, parcel, arrayList3, iL2, 1);
                }
            }
            return new AutotekaLandingResponse(string, string2, string3, string4, arrayList, arrayList2, arrayList4, arrayList3, parcel.readInt() != 0 ? AutotekaLandingNavBarParams.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AutotekaLandingResponse[] newArray(int i12) {
            return new AutotekaLandingResponse[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutotekaLandingResponse(@k String str, @l String str2, @k String str3, @l String str4, @l List<? extends BeduinModel> list, @l List<? extends BeduinAction> list2, @k List<? extends BeduinModel> list3, @l List<? extends BeduinModel> list4, @l AutotekaLandingNavBarParams autotekaLandingNavBarParams) {
        this.id = str;
        this.topFormId = str2;
        this.mainFormId = str3;
        this.bottomFormId = str4;
        this.topComponents = list;
        this.onOpenActions = list2;
        this.mainComponents = list3;
        this.bottomComponents = list4;
        this.navigationBar = autotekaLandingNavBarParams;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
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

    @l
    public final List<BeduinAction> component6() {
        return this.onOpenActions;
    }

    @k
    public final List<BeduinModel> component7() {
        return this.mainComponents;
    }

    @l
    public final List<BeduinModel> component8() {
        return this.bottomComponents;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final AutotekaLandingNavBarParams getNavigationBar() {
        return this.navigationBar;
    }

    @k
    public final AutotekaLandingResponse copy(@k String id2, @l String topFormId, @k String mainFormId, @l String bottomFormId, @l List<? extends BeduinModel> topComponents, @l List<? extends BeduinAction> onOpenActions, @k List<? extends BeduinModel> mainComponents, @l List<? extends BeduinModel> bottomComponents, @l AutotekaLandingNavBarParams navigationBar) {
        return new AutotekaLandingResponse(id2, topFormId, mainFormId, bottomFormId, topComponents, onOpenActions, mainComponents, bottomComponents, navigationBar);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutotekaLandingResponse)) {
            return false;
        }
        AutotekaLandingResponse autotekaLandingResponse = (AutotekaLandingResponse) other;
        return L.f(this.id, autotekaLandingResponse.id) && L.f(this.topFormId, autotekaLandingResponse.topFormId) && L.f(this.mainFormId, autotekaLandingResponse.mainFormId) && L.f(this.bottomFormId, autotekaLandingResponse.bottomFormId) && L.f(this.topComponents, autotekaLandingResponse.topComponents) && L.f(this.onOpenActions, autotekaLandingResponse.onOpenActions) && L.f(this.mainComponents, autotekaLandingResponse.mainComponents) && L.f(this.bottomComponents, autotekaLandingResponse.bottomComponents) && L.f(this.navigationBar, autotekaLandingResponse.navigationBar);
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
    public final AutotekaLandingNavBarParams getNavigationBar() {
        return this.navigationBar;
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
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinAction> list2 = this.onOpenActions;
        int iE2 = H.e((iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.mainComponents);
        List<BeduinModel> list3 = this.bottomComponents;
        int iHashCode4 = (iE2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        AutotekaLandingNavBarParams autotekaLandingNavBarParams = this.navigationBar;
        return iHashCode4 + (autotekaLandingNavBarParams != null ? autotekaLandingNavBarParams.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AutotekaLandingResponse(id=" + this.id + ", topFormId=" + this.topFormId + ", mainFormId=" + this.mainFormId + ", bottomFormId=" + this.bottomFormId + ", topComponents=" + this.topComponents + ", onOpenActions=" + this.onOpenActions + ", mainComponents=" + this.mainComponents + ", bottomComponents=" + this.bottomComponents + ", navigationBar=" + this.navigationBar + ')';
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
        List<BeduinAction> list2 = this.onOpenActions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        Iterator itJ = C0.j(this.mainComponents, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        List<BeduinModel> list3 = this.bottomComponents;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), flags);
            }
        }
        AutotekaLandingNavBarParams autotekaLandingNavBarParams = this.navigationBar;
        if (autotekaLandingNavBarParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            autotekaLandingNavBarParams.writeToParcel(parcel, flags);
        }
    }
}
