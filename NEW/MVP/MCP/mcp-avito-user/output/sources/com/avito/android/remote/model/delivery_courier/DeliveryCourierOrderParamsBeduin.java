package com.avito.android.remote.model.delivery_courier;

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

/* compiled from: DeliveryCourierOrderParamsBeduin.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000fJ\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011Jh\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b,\u0010\u000fR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b-\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b.\u0010\u000fR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b/\u0010\u0011¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/delivery_courier/DeliveryCourierOrderParamsBeduin;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "mainFormId", "Lcom/avito/android/beduin_models/BeduinModel;", "mainComponents", "bottomFormId", "bottomComponents", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/delivery_courier/DeliveryCourierOrderParamsBeduin;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getActions", "getMainFormId", "getMainComponents", "getBottomFormId", "getBottomComponents", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DeliveryCourierOrderParamsBeduin implements Parcelable {

    @k
    public static final Parcelable.Creator<DeliveryCourierOrderParamsBeduin> CREATOR = new Creator();

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

    @c("title")
    @k
    private final String title;

    /* compiled from: DeliveryCourierOrderParamsBeduin.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryCourierOrderParamsBeduin> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryCourierOrderParamsBeduin createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            int iL2 = 0;
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = a.l(DeliveryCourierOrderParamsBeduin.class, parcel, arrayList, iL3, 1);
                }
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iL4 = 0;
                while (iL4 != i13) {
                    iL4 = a.l(DeliveryCourierOrderParamsBeduin.class, parcel, arrayList2, iL4, 1);
                }
            }
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                arrayList3 = new ArrayList(i14);
                while (iL2 != i14) {
                    iL2 = a.l(DeliveryCourierOrderParamsBeduin.class, parcel, arrayList3, iL2, 1);
                }
            }
            return new DeliveryCourierOrderParamsBeduin(string, arrayList, string2, arrayList2, string3, arrayList3);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryCourierOrderParamsBeduin[] newArray(int i12) {
            return new DeliveryCourierOrderParamsBeduin[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryCourierOrderParamsBeduin(@k String str, @l List<? extends BeduinAction> list, @l String str2, @l List<? extends BeduinModel> list2, @l String str3, @l List<? extends BeduinModel> list3) {
        this.title = str;
        this.actions = list;
        this.mainFormId = str2;
        this.mainComponents = list2;
        this.bottomFormId = str3;
        this.bottomComponents = list3;
    }

    public static /* synthetic */ DeliveryCourierOrderParamsBeduin copy$default(DeliveryCourierOrderParamsBeduin deliveryCourierOrderParamsBeduin, String str, List list, String str2, List list2, String str3, List list3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = deliveryCourierOrderParamsBeduin.title;
        }
        if ((i12 & 2) != 0) {
            list = deliveryCourierOrderParamsBeduin.actions;
        }
        List list4 = list;
        if ((i12 & 4) != 0) {
            str2 = deliveryCourierOrderParamsBeduin.mainFormId;
        }
        String str4 = str2;
        if ((i12 & 8) != 0) {
            list2 = deliveryCourierOrderParamsBeduin.mainComponents;
        }
        List list5 = list2;
        if ((i12 & 16) != 0) {
            str3 = deliveryCourierOrderParamsBeduin.bottomFormId;
        }
        String str5 = str3;
        if ((i12 & 32) != 0) {
            list3 = deliveryCourierOrderParamsBeduin.bottomComponents;
        }
        return deliveryCourierOrderParamsBeduin.copy(str, list4, str4, list5, str5, list3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<BeduinAction> component2() {
        return this.actions;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getMainFormId() {
        return this.mainFormId;
    }

    @l
    public final List<BeduinModel> component4() {
        return this.mainComponents;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getBottomFormId() {
        return this.bottomFormId;
    }

    @l
    public final List<BeduinModel> component6() {
        return this.bottomComponents;
    }

    @k
    public final DeliveryCourierOrderParamsBeduin copy(@k String title, @l List<? extends BeduinAction> actions, @l String mainFormId, @l List<? extends BeduinModel> mainComponents, @l String bottomFormId, @l List<? extends BeduinModel> bottomComponents) {
        return new DeliveryCourierOrderParamsBeduin(title, actions, mainFormId, mainComponents, bottomFormId, bottomComponents);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryCourierOrderParamsBeduin)) {
            return false;
        }
        DeliveryCourierOrderParamsBeduin deliveryCourierOrderParamsBeduin = (DeliveryCourierOrderParamsBeduin) other;
        return L.f(this.title, deliveryCourierOrderParamsBeduin.title) && L.f(this.actions, deliveryCourierOrderParamsBeduin.actions) && L.f(this.mainFormId, deliveryCourierOrderParamsBeduin.mainFormId) && L.f(this.mainComponents, deliveryCourierOrderParamsBeduin.mainComponents) && L.f(this.bottomFormId, deliveryCourierOrderParamsBeduin.bottomFormId) && L.f(this.bottomComponents, deliveryCourierOrderParamsBeduin.bottomComponents);
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

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        List<BeduinAction> list = this.actions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.mainFormId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<BeduinModel> list2 = this.mainComponents;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.bottomFormId;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BeduinModel> list3 = this.bottomComponents;
        return iHashCode5 + (list3 != null ? list3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryCourierOrderParamsBeduin(title=");
        sb2.append(this.title);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", mainFormId=");
        sb2.append(this.mainFormId);
        sb2.append(", mainComponents=");
        sb2.append(this.mainComponents);
        sb2.append(", bottomFormId=");
        sb2.append(this.bottomFormId);
        sb2.append(", bottomComponents=");
        return H.p(sb2, this.bottomComponents, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        List<BeduinAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this.mainFormId);
        List<BeduinModel> list2 = this.mainComponents;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        parcel.writeString(this.bottomFormId);
        List<BeduinModel> list3 = this.bottomComponents;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA3 = a.A(list3, parcel, 1);
        while (itA3.hasNext()) {
            parcel.writeParcelable((Parcelable) itA3.next(), flags);
        }
    }
}
