package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.user_profile.Device;
import com.avito.android.remote.model.user_profile.Phone;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PhonesItem.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b \u0010!R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\fR*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010&R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/PhonesItem;", "Lcom/avito/android/remote/model/user_profile/items/UserProfileItem;", "", "Lcom/avito/android/remote/model/user_profile/Phone;", "phones", "Lcom/avito/android/remote/model/user_profile/Device;", "voipSessions", "", "phonesCount", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;)Lcom/avito/android/remote/model/user_profile/items/PhonesItem;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getPhones", "getVoipSessions", "setVoipSessions", "(Ljava/util/List;)V", "Ljava/lang/Integer;", "getPhonesCount", "setPhonesCount", "(Ljava/lang/Integer;)V", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PhonesItem extends UserProfileItem {

    @k
    public static final Parcelable.Creator<PhonesItem> CREATOR = new Creator();

    @c("list")
    @k
    private final List<Phone> phones;

    @l
    private Integer phonesCount;

    @l
    private List<Device> voipSessions;

    /* compiled from: PhonesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PhonesItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PhonesItem createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            int iC2 = 0;
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(PhonesItem.class, parcel, arrayList2, iL2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = a.c(Device.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new PhonesItem(arrayList2, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PhonesItem[] newArray(int i12) {
            return new PhonesItem[i12];
        }
    }

    public PhonesItem(@k List<Phone> list, @l List<Device> list2, @l Integer num) {
        this.phones = list;
        this.voipSessions = list2;
        this.phonesCount = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhonesItem copy$default(PhonesItem phonesItem, List list, List list2, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = phonesItem.phones;
        }
        if ((i12 & 2) != 0) {
            list2 = phonesItem.voipSessions;
        }
        if ((i12 & 4) != 0) {
            num = phonesItem.phonesCount;
        }
        return phonesItem.copy(list, list2, num);
    }

    @k
    public final List<Phone> component1() {
        return this.phones;
    }

    @l
    public final List<Device> component2() {
        return this.voipSessions;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getPhonesCount() {
        return this.phonesCount;
    }

    @k
    public final PhonesItem copy(@k List<Phone> phones, @l List<Device> voipSessions, @l Integer phonesCount) {
        return new PhonesItem(phones, voipSessions, phonesCount);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhonesItem)) {
            return false;
        }
        PhonesItem phonesItem = (PhonesItem) other;
        return L.f(this.phones, phonesItem.phones) && L.f(this.voipSessions, phonesItem.voipSessions) && L.f(this.phonesCount, phonesItem.phonesCount);
    }

    @k
    public final List<Phone> getPhones() {
        return this.phones;
    }

    @l
    public final Integer getPhonesCount() {
        return this.phonesCount;
    }

    @l
    public final List<Device> getVoipSessions() {
        return this.voipSessions;
    }

    public int hashCode() {
        int iHashCode = this.phones.hashCode() * 31;
        List<Device> list = this.voipSessions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.phonesCount;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final void setPhonesCount(@l Integer num) {
        this.phonesCount = num;
    }

    public final void setVoipSessions(@l List<Device> list) {
        this.voipSessions = list;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PhonesItem(phones=");
        sb2.append(this.phones);
        sb2.append(", voipSessions=");
        sb2.append(this.voipSessions);
        sb2.append(", phonesCount=");
        return s.j(sb2, this.phonesCount, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.phones, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        List<Device> list = this.voipSessions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Device) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Integer num = this.phonesCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
    }

    public PhonesItem(List list, List list2, Integer num, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? C42784z0.f406748b : list2, (i12 & 4) != 0 ? null : num);
    }
}
