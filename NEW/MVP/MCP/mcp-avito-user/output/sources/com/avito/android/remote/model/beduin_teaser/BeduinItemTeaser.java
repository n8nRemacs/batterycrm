package com.avito.android.remote.model.beduin_teaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinTeaser.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J|\u0010\u0018\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b+\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b.\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b/\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b0\u0010\u0010R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b1\u0010\u0010R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b2\u0010\u0010¨\u00063"}, d2 = {"Lcom/avito/android/remote/model/beduin_teaser/BeduinItemTeaser;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "", "topFormId", "mainFormId", "bottomFormId", "Lcom/avito/android/beduin_models/BeduinModel;", "topComponents", "mainComponents", "bottomComponents", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/avito/android/remote/model/beduin_teaser/BeduinItemTeaser;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getActions", "Ljava/lang/String;", "getTopFormId", "getMainFormId", "getBottomFormId", "getTopComponents", "getMainComponents", "getBottomComponents", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BeduinItemTeaser implements Parcelable {

    @k
    public static final Parcelable.Creator<BeduinItemTeaser> CREATOR = new Creator();

    @c("actions")
    @l
    private final List<BeduinAction> actions;

    @c("bottomComponents")
    @l
    private final List<BeduinModel> bottomComponents;

    @c("bottomFormId")
    @l
    private final String bottomFormId;

    @c("mainComponents")
    @l
    private final List<BeduinModel> mainComponents;

    @c("mainFormId")
    @l
    private final String mainFormId;

    @c("topComponents")
    @l
    private final List<BeduinModel> topComponents;

    @c("topFormId")
    @l
    private final String topFormId;

    /* compiled from: BeduinTeaser.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BeduinItemTeaser> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BeduinItemTeaser createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int iL2 = 0;
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = a.l(BeduinItemTeaser.class, parcel, arrayList5, iL3, 1);
                }
                arrayList = arrayList5;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i13);
                int iL4 = 0;
                while (iL4 != i13) {
                    iL4 = a.l(BeduinItemTeaser.class, parcel, arrayList6, iL4, 1);
                }
                arrayList2 = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i14);
                int iL5 = 0;
                while (iL5 != i14) {
                    iL5 = a.l(BeduinItemTeaser.class, parcel, arrayList7, iL5, 1);
                }
                arrayList3 = arrayList7;
            }
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                arrayList4 = new ArrayList(i15);
                while (iL2 != i15) {
                    iL2 = a.l(BeduinItemTeaser.class, parcel, arrayList4, iL2, 1);
                }
            }
            return new BeduinItemTeaser(arrayList, string, string2, string3, arrayList2, arrayList3, arrayList4);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BeduinItemTeaser[] newArray(int i12) {
            return new BeduinItemTeaser[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinItemTeaser(@l List<? extends BeduinAction> list, @l String str, @l String str2, @l String str3, @l List<? extends BeduinModel> list2, @l List<? extends BeduinModel> list3, @l List<? extends BeduinModel> list4) {
        this.actions = list;
        this.topFormId = str;
        this.mainFormId = str2;
        this.bottomFormId = str3;
        this.topComponents = list2;
        this.mainComponents = list3;
        this.bottomComponents = list4;
    }

    public static /* synthetic */ BeduinItemTeaser copy$default(BeduinItemTeaser beduinItemTeaser, List list, String str, String str2, String str3, List list2, List list3, List list4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = beduinItemTeaser.actions;
        }
        if ((i12 & 2) != 0) {
            str = beduinItemTeaser.topFormId;
        }
        String str4 = str;
        if ((i12 & 4) != 0) {
            str2 = beduinItemTeaser.mainFormId;
        }
        String str5 = str2;
        if ((i12 & 8) != 0) {
            str3 = beduinItemTeaser.bottomFormId;
        }
        String str6 = str3;
        if ((i12 & 16) != 0) {
            list2 = beduinItemTeaser.topComponents;
        }
        List list5 = list2;
        if ((i12 & 32) != 0) {
            list3 = beduinItemTeaser.mainComponents;
        }
        List list6 = list3;
        if ((i12 & 64) != 0) {
            list4 = beduinItemTeaser.bottomComponents;
        }
        return beduinItemTeaser.copy(list, str4, str5, str6, list5, list6, list4);
    }

    @l
    public final List<BeduinAction> component1() {
        return this.actions;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTopFormId() {
        return this.topFormId;
    }

    @l
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
    public final List<BeduinModel> component6() {
        return this.mainComponents;
    }

    @l
    public final List<BeduinModel> component7() {
        return this.bottomComponents;
    }

    @k
    public final BeduinItemTeaser copy(@l List<? extends BeduinAction> actions, @l String topFormId, @l String mainFormId, @l String bottomFormId, @l List<? extends BeduinModel> topComponents, @l List<? extends BeduinModel> mainComponents, @l List<? extends BeduinModel> bottomComponents) {
        return new BeduinItemTeaser(actions, topFormId, mainFormId, bottomFormId, topComponents, mainComponents, bottomComponents);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinItemTeaser)) {
            return false;
        }
        BeduinItemTeaser beduinItemTeaser = (BeduinItemTeaser) other;
        return L.f(this.actions, beduinItemTeaser.actions) && L.f(this.topFormId, beduinItemTeaser.topFormId) && L.f(this.mainFormId, beduinItemTeaser.mainFormId) && L.f(this.bottomFormId, beduinItemTeaser.bottomFormId) && L.f(this.topComponents, beduinItemTeaser.topComponents) && L.f(this.mainComponents, beduinItemTeaser.mainComponents) && L.f(this.bottomComponents, beduinItemTeaser.bottomComponents);
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @l
    public final List<BeduinModel> getBottomComponents() {
        return this.bottomComponents;
    }

    @l
    public final String getBottomFormId() {
        return this.bottomFormId;
    }

    @l
    public final List<BeduinModel> getMainComponents() {
        return this.mainComponents;
    }

    @l
    public final String getMainFormId() {
        return this.mainFormId;
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
        List<BeduinAction> list = this.actions;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.topFormId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mainFormId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bottomFormId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<BeduinModel> list2 = this.topComponents;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BeduinModel> list3 = this.mainComponents;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<BeduinModel> list4 = this.bottomComponents;
        return iHashCode6 + (list4 != null ? list4.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinItemTeaser(actions=");
        sb2.append(this.actions);
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
        return H.p(sb2, this.bottomComponents, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<BeduinAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this.topFormId);
        parcel.writeString(this.mainFormId);
        parcel.writeString(this.bottomFormId);
        List<BeduinModel> list2 = this.topComponents;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        List<BeduinModel> list3 = this.mainComponents;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), flags);
            }
        }
        List<BeduinModel> list4 = this.bottomComponents;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA4 = a.A(list4, parcel, 1);
        while (itA4.hasNext()) {
            parcel.writeParcelable((Parcelable) itA4.next(), flags);
        }
    }
}
