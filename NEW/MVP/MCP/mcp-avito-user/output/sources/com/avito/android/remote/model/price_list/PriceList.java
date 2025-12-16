package com.avito.android.remote.model.price_list;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.imv_services.ImvServices;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PriceList.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002./BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JX\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0011R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b+\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b,\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b\u000b\u0010\u0015¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/price_list/PriceList;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/price_list/PriceList$Group;", "groups", "Lcom/avito/android/remote/model/price_list/PriceList$Value;", "values", "countHint", "", "isRedesign", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/price_list/PriceList;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getGroups", "getValues", "getCountHint", "Ljava/lang/Boolean;", "Group", "Value", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PriceList implements Parcelable {

    @k
    public static final Parcelable.Creator<PriceList> CREATOR = new Creator();

    @c("countHint")
    @l
    private final String countHint;

    @c("groups")
    @l
    private final List<Group> groups;

    @c("isRedesign")
    @l
    private final Boolean isRedesign;

    @c("title")
    @l
    private final String title;

    @c("values")
    @l
    private final List<Value> values;

    /* compiled from: PriceList.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PriceList> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PriceList createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean boolValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Group.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = a.c(Value.CREATOR, parcel, arrayList2, iC3, 1);
                }
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PriceList(string, arrayList, arrayList2, string2, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PriceList[] newArray(int i12) {
            return new PriceList[i12];
        }
    }

    public PriceList() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ PriceList copy$default(PriceList priceList, String str, List list, List list2, String str2, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = priceList.title;
        }
        if ((i12 & 2) != 0) {
            list = priceList.groups;
        }
        List list3 = list;
        if ((i12 & 4) != 0) {
            list2 = priceList.values;
        }
        List list4 = list2;
        if ((i12 & 8) != 0) {
            str2 = priceList.countHint;
        }
        String str3 = str2;
        if ((i12 & 16) != 0) {
            bool = priceList.isRedesign;
        }
        return priceList.copy(str, list3, list4, str3, bool);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<Group> component2() {
        return this.groups;
    }

    @l
    public final List<Value> component3() {
        return this.values;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getCountHint() {
        return this.countHint;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getIsRedesign() {
        return this.isRedesign;
    }

    @k
    public final PriceList copy(@l String title, @l List<Group> groups, @l List<Value> values, @l String countHint, @l Boolean isRedesign) {
        return new PriceList(title, groups, values, countHint, isRedesign);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PriceList)) {
            return false;
        }
        PriceList priceList = (PriceList) other;
        return L.f(this.title, priceList.title) && L.f(this.groups, priceList.groups) && L.f(this.values, priceList.values) && L.f(this.countHint, priceList.countHint) && L.f(this.isRedesign, priceList.isRedesign);
    }

    @l
    public final String getCountHint() {
        return this.countHint;
    }

    @l
    public final List<Group> getGroups() {
        return this.groups;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<Value> getValues() {
        return this.values;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Group> list = this.groups;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Value> list2 = this.values;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.countHint;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isRedesign;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @l
    public final Boolean isRedesign() {
        return this.isRedesign;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PriceList(title=");
        sb2.append(this.title);
        sb2.append(", groups=");
        sb2.append(this.groups);
        sb2.append(", values=");
        sb2.append(this.values);
        sb2.append(", countHint=");
        sb2.append(this.countHint);
        sb2.append(", isRedesign=");
        return C0.g(sb2, this.isRedesign, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        List<Group> list = this.groups;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Group) itA.next()).writeToParcel(parcel, flags);
            }
        }
        List<Value> list2 = this.values;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((Value) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.countHint);
        Boolean bool = this.isRedesign;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public PriceList(@l String str, @l List<Group> list, @l List<Value> list2, @l String str2, @l Boolean bool) {
        this.title = str;
        this.groups = list;
        this.values = list2;
        this.countHint = str2;
        this.isRedesign = bool;
    }

    /* compiled from: PriceList.kt */
    @d
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JD\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b\u0005\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u000fR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010\u0012¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/price_list/PriceList$Group;", "Landroid/os/Parcelable;", "", "title", "", "isCollapsed", "areGroupsCollapsible", "", "Lcom/avito/android/remote/model/price_list/PriceList$Value;", "values", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;)Lcom/avito/android/remote/model/price_list/PriceList$Group;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/lang/Boolean;", "getAreGroupsCollapsible", "Ljava/util/List;", "getValues", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Group implements Parcelable {

        @k
        public static final Parcelable.Creator<Group> CREATOR = new Creator();

        @c("areGroupsCollapsible")
        @l
        private final Boolean areGroupsCollapsible;

        @c("isCollapsed")
        @l
        private final Boolean isCollapsed;

        @c("title")
        @l
        private final String title;

        @c("values")
        @k
        private final List<Value> values;

        /* compiled from: PriceList.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Group> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Group createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                Boolean boolValueOf2 = null;
                int iC2 = 0;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = a.c(Value.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new Group(string, boolValueOf, boolValueOf2, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Group[] newArray(int i12) {
                return new Group[i12];
            }
        }

        public Group(@l String str, @l Boolean bool, @l Boolean bool2, @k List<Value> list) {
            this.title = str;
            this.isCollapsed = bool;
            this.areGroupsCollapsible = bool2;
            this.values = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Group copy$default(Group group, String str, Boolean bool, Boolean bool2, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = group.title;
            }
            if ((i12 & 2) != 0) {
                bool = group.isCollapsed;
            }
            if ((i12 & 4) != 0) {
                bool2 = group.areGroupsCollapsible;
            }
            if ((i12 & 8) != 0) {
                list = group.values;
            }
            return group.copy(str, bool, bool2, list);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Boolean getIsCollapsed() {
            return this.isCollapsed;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Boolean getAreGroupsCollapsible() {
            return this.areGroupsCollapsible;
        }

        @k
        public final List<Value> component4() {
            return this.values;
        }

        @k
        public final Group copy(@l String title, @l Boolean isCollapsed, @l Boolean areGroupsCollapsible, @k List<Value> values) {
            return new Group(title, isCollapsed, areGroupsCollapsible, values);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Group)) {
                return false;
            }
            Group group = (Group) other;
            return L.f(this.title, group.title) && L.f(this.isCollapsed, group.isCollapsed) && L.f(this.areGroupsCollapsible, group.areGroupsCollapsible) && L.f(this.values, group.values);
        }

        @l
        public final Boolean getAreGroupsCollapsible() {
            return this.areGroupsCollapsible;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @k
        public final List<Value> getValues() {
            return this.values;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isCollapsed;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.areGroupsCollapsible;
            return this.values.hashCode() + ((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
        }

        @l
        public final Boolean isCollapsed() {
            return this.isCollapsed;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Group(title=");
            sb2.append(this.title);
            sb2.append(", isCollapsed=");
            sb2.append(this.isCollapsed);
            sb2.append(", areGroupsCollapsible=");
            sb2.append(this.areGroupsCollapsible);
            sb2.append(", values=");
            return H.p(sb2, this.values, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            Boolean bool = this.isCollapsed;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            Boolean bool2 = this.areGroupsCollapsible;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool2);
            }
            Iterator itJ = C0.j(this.values, parcel);
            while (itJ.hasNext()) {
                ((Value) itJ.next()).writeToParcel(parcel, flags);
            }
        }

        public /* synthetic */ Group(String str, Boolean bool, Boolean bool2, List list, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : bool, (i12 & 4) != 0 ? null : bool2, list);
        }
    }

    /* compiled from: PriceList.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JH\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0011¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/price_list/PriceList$Value;", "Landroid/os/Parcelable;", "", "title", "price", "subTitle", "subPrice", "Lcom/avito/android/remote/model/imv_services/ImvServices;", "imv", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/imv_services/ImvServices;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/avito/android/remote/model/imv_services/ImvServices;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/imv_services/ImvServices;)Lcom/avito/android/remote/model/price_list/PriceList$Value;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getPrice", "getSubTitle", "getSubPrice", "Lcom/avito/android/remote/model/imv_services/ImvServices;", "getImv", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Value implements Parcelable {

        @k
        public static final Parcelable.Creator<Value> CREATOR = new Creator();

        @c("imv")
        @l
        private final ImvServices imv;

        @c("price")
        @k
        private final String price;

        @c("subPrice")
        @l
        private final String subPrice;

        @c("subTitle")
        @l
        private final String subTitle;

        @c("title")
        @k
        private final String title;

        /* compiled from: PriceList.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Value> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Value createFromParcel(@k Parcel parcel) {
                return new Value(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ImvServices.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Value[] newArray(int i12) {
                return new Value[i12];
            }
        }

        public Value(@k String str, @k String str2, @l String str3, @l String str4, @l ImvServices imvServices) {
            this.title = str;
            this.price = str2;
            this.subTitle = str3;
            this.subPrice = str4;
            this.imv = imvServices;
        }

        public static /* synthetic */ Value copy$default(Value value, String str, String str2, String str3, String str4, ImvServices imvServices, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = value.title;
            }
            if ((i12 & 2) != 0) {
                str2 = value.price;
            }
            String str5 = str2;
            if ((i12 & 4) != 0) {
                str3 = value.subTitle;
            }
            String str6 = str3;
            if ((i12 & 8) != 0) {
                str4 = value.subPrice;
            }
            String str7 = str4;
            if ((i12 & 16) != 0) {
                imvServices = value.imv;
            }
            return value.copy(str, str5, str6, str7, imvServices);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getSubTitle() {
            return this.subTitle;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getSubPrice() {
            return this.subPrice;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final ImvServices getImv() {
            return this.imv;
        }

        @k
        public final Value copy(@k String title, @k String price, @l String subTitle, @l String subPrice, @l ImvServices imv) {
            return new Value(title, price, subTitle, subPrice, imv);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Value)) {
                return false;
            }
            Value value = (Value) other;
            return L.f(this.title, value.title) && L.f(this.price, value.price) && L.f(this.subTitle, value.subTitle) && L.f(this.subPrice, value.subPrice) && L.f(this.imv, value.imv);
        }

        @l
        public final ImvServices getImv() {
            return this.imv;
        }

        @k
        public final String getPrice() {
            return this.price;
        }

        @l
        public final String getSubPrice() {
            return this.subPrice;
        }

        @l
        public final String getSubTitle() {
            return this.subTitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iD2 = H.d(this.title.hashCode() * 31, 31, this.price);
            String str = this.subTitle;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subPrice;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ImvServices imvServices = this.imv;
            return iHashCode2 + (imvServices != null ? imvServices.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Value(title=" + this.title + ", price=" + this.price + ", subTitle=" + this.subTitle + ", subPrice=" + this.subPrice + ", imv=" + this.imv + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.price);
            parcel.writeString(this.subTitle);
            parcel.writeString(this.subPrice);
            ImvServices imvServices = this.imv;
            if (imvServices == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                imvServices.writeToParcel(parcel, flags);
            }
        }

        public /* synthetic */ Value(String str, String str2, String str3, String str4, ImvServices imvServices, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : imvServices);
        }
    }

    public /* synthetic */ PriceList(String str, List list, List list2, String str2, Boolean bool, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : list, (i12 & 4) != 0 ? null : list2, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : bool);
    }
}
