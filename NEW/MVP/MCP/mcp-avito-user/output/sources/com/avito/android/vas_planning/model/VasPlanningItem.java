package com.avito.android.vas_planning.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.threeten.bp.e;
import org.threeten.bp.g;

/* compiled from: VasPlanningItem.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/vas_planning/model/VasPlanningItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "<init>", "()V", "VasPlanningDateTime", "VasPlanningRadioItem", "VasPlanningTitle", "Lcom/avito/android/vas_planning/model/VasPlanningItem$VasPlanningDateTime;", "Lcom/avito/android/vas_planning/model/VasPlanningItem$VasPlanningRadioItem;", "Lcom/avito/android/vas_planning/model/VasPlanningItem$VasPlanningTitle;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class VasPlanningItem implements ParcelableItem {

    /* compiled from: VasPlanningItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/model/VasPlanningItem$VasPlanningDateTime;", "Lcom/avito/android/vas_planning/model/VasPlanningItem;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VasPlanningDateTime extends VasPlanningItem {

        @k
        public static final Parcelable.Creator<VasPlanningDateTime> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f322421b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f322422c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final e f322423d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final g f322424e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f322425f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f322426g;

        /* compiled from: VasPlanningItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<VasPlanningDateTime> {
            @Override // android.os.Parcelable.Creator
            public final VasPlanningDateTime createFromParcel(Parcel parcel) {
                return new VasPlanningDateTime(parcel.readString(), parcel.readInt() != 0, (e) parcel.readSerializable(), (g) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final VasPlanningDateTime[] newArray(int i12) {
                return new VasPlanningDateTime[i12];
            }
        }

        public /* synthetic */ VasPlanningDateTime(String str, boolean z12, e eVar, g gVar, boolean z13, boolean z14, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : eVar, (i12 & 8) == 0 ? gVar : null, (i12 & 16) != 0 ? false : z13, (i12 & 32) == 0 ? z14 : false);
        }

        public static VasPlanningDateTime L(VasPlanningDateTime vasPlanningDateTime, e eVar, g gVar, boolean z12, boolean z13, int i12) {
            String str = vasPlanningDateTime.f322421b;
            boolean z14 = vasPlanningDateTime.f322422c;
            if ((i12 & 4) != 0) {
                eVar = vasPlanningDateTime.f322423d;
            }
            e eVar2 = eVar;
            if ((i12 & 8) != 0) {
                gVar = vasPlanningDateTime.f322424e;
            }
            g gVar2 = gVar;
            if ((i12 & 16) != 0) {
                z12 = vasPlanningDateTime.f322425f;
            }
            boolean z15 = z12;
            if ((i12 & 32) != 0) {
                z13 = vasPlanningDateTime.f322426g;
            }
            vasPlanningDateTime.getClass();
            return new VasPlanningDateTime(str, z14, eVar2, gVar2, z15, z13);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VasPlanningDateTime)) {
                return false;
            }
            VasPlanningDateTime vasPlanningDateTime = (VasPlanningDateTime) obj;
            return L.f(this.f322421b, vasPlanningDateTime.f322421b) && this.f322422c == vasPlanningDateTime.f322422c && L.f(this.f322423d, vasPlanningDateTime.f322423d) && L.f(this.f322424e, vasPlanningDateTime.f322424e) && this.f322425f == vasPlanningDateTime.f322425f && this.f322426g == vasPlanningDateTime.f322426g;
        }

        @Override // com.avito.android.vas_planning.model.VasPlanningItem
        /* renamed from: f, reason: from getter */
        public final boolean getF322442c() {
            return this.f322422c;
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF323246b() {
            return this.f322421b;
        }

        public final int hashCode() {
            int i12 = r.i(this.f322421b.hashCode() * 31, 31, this.f322422c);
            e eVar = this.f322423d;
            int iHashCode = (i12 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            g gVar = this.f322424e;
            return Boolean.hashCode(this.f322426g) + r.i((iHashCode + (gVar != null ? gVar.hashCode() : 0)) * 31, 31, this.f322425f);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VasPlanningDateTime(stringId=");
            sb2.append(this.f322421b);
            sb2.append(", isStableModel=");
            sb2.append(this.f322422c);
            sb2.append(", selectedDate=");
            sb2.append(this.f322423d);
            sb2.append(", selectedTime=");
            sb2.append(this.f322424e);
            sb2.append(", deletable=");
            sb2.append(this.f322425f);
            sb2.append(", isLastDateItem=");
            return r.x(sb2, this.f322426g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f322421b);
            parcel.writeInt(this.f322422c ? 1 : 0);
            parcel.writeSerializable(this.f322423d);
            parcel.writeSerializable(this.f322424e);
            parcel.writeInt(this.f322425f ? 1 : 0);
            parcel.writeInt(this.f322426g ? 1 : 0);
        }

        public VasPlanningDateTime(@k String str, boolean z12, @l e eVar, @l g gVar, boolean z13, boolean z14) {
            super(null);
            this.f322421b = str;
            this.f322422c = z12;
            this.f322423d = eVar;
            this.f322424e = gVar;
            this.f322425f = z13;
            this.f322426g = z14;
        }
    }

    /* compiled from: VasPlanningItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/model/VasPlanningItem$VasPlanningTitle;", "Lcom/avito/android/vas_planning/model/VasPlanningItem;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VasPlanningTitle extends VasPlanningItem {

        @k
        public static final Parcelable.Creator<VasPlanningTitle> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f322441b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f322442c;

        /* renamed from: d, reason: collision with root package name */
        public final int f322443d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f322444e;

        /* compiled from: VasPlanningItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<VasPlanningTitle> {
            @Override // android.os.Parcelable.Creator
            public final VasPlanningTitle createFromParcel(Parcel parcel) {
                return new VasPlanningTitle(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final VasPlanningTitle[] newArray(int i12) {
                return new VasPlanningTitle[i12];
            }
        }

        public /* synthetic */ VasPlanningTitle(String str, boolean z12, int i12, String str2, int i13, C42822w c42822w) {
            this((i13 & 4) != 0 ? R.attr.textH10 : i12, str, str2, (i13 & 2) != 0 ? true : z12);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VasPlanningTitle)) {
                return false;
            }
            VasPlanningTitle vasPlanningTitle = (VasPlanningTitle) obj;
            return L.f(this.f322441b, vasPlanningTitle.f322441b) && this.f322442c == vasPlanningTitle.f322442c && this.f322443d == vasPlanningTitle.f322443d && L.f(this.f322444e, vasPlanningTitle.f322444e);
        }

        @Override // com.avito.android.vas_planning.model.VasPlanningItem
        /* renamed from: f, reason: from getter */
        public final boolean getF322442c() {
            return this.f322442c;
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF323246b() {
            return this.f322441b;
        }

        public final int hashCode() {
            return this.f322444e.hashCode() + r.e(this.f322443d, r.i(this.f322441b.hashCode() * 31, 31, this.f322442c), 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VasPlanningTitle(stringId=");
            sb2.append(this.f322441b);
            sb2.append(", isStableModel=");
            sb2.append(this.f322442c);
            sb2.append(", titleAppearance=");
            sb2.append(this.f322443d);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f322444e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f322441b);
            parcel.writeInt(this.f322442c ? 1 : 0);
            parcel.writeInt(this.f322443d);
            parcel.writeString(this.f322444e);
        }

        public VasPlanningTitle(@InterfaceC42150f int i12, @k String str, @k String str2, boolean z12) {
            super(null);
            this.f322441b = str;
            this.f322442c = z12;
            this.f322443d = i12;
            this.f322444e = str2;
        }
    }

    public /* synthetic */ VasPlanningItem(C42822w c42822w) {
        this();
    }

    /* renamed from: f */
    public abstract boolean getF322442c();

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268996b() {
        return a.C10492a.a(this);
    }

    public VasPlanningItem() {
    }

    /* compiled from: VasPlanningItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_planning/model/VasPlanningItem$VasPlanningRadioItem;", "Lcom/avito/android/vas_planning/model/VasPlanningItem;", "VasPlanningRadioType", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class VasPlanningRadioItem extends VasPlanningItem {

        @k
        public static final Parcelable.Creator<VasPlanningRadioItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f322427b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f322428c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final VasPlanningRadioType f322429d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f322430e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f322431f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f322432g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final DeepLink f322433h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final String f322434i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f322435j;

        /* renamed from: k, reason: collision with root package name */
        @k
        public final List<VasPlanningItem> f322436k;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VasPlanningItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/model/VasPlanningItem$VasPlanningRadioItem$VasPlanningRadioType;", "", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class VasPlanningRadioType {

            /* renamed from: b, reason: collision with root package name */
            public static final VasPlanningRadioType f322437b;

            /* renamed from: c, reason: collision with root package name */
            public static final VasPlanningRadioType f322438c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ VasPlanningRadioType[] f322439d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f322440e;

            static {
                VasPlanningRadioType vasPlanningRadioType = new VasPlanningRadioType("Now", 0);
                f322437b = vasPlanningRadioType;
                VasPlanningRadioType vasPlanningRadioType2 = new VasPlanningRadioType("PlanDateTime", 1);
                f322438c = vasPlanningRadioType2;
                VasPlanningRadioType[] vasPlanningRadioTypeArr = {vasPlanningRadioType, vasPlanningRadioType2};
                f322439d = vasPlanningRadioTypeArr;
                f322440e = c.a(vasPlanningRadioTypeArr);
            }

            public VasPlanningRadioType() {
                throw null;
            }

            public static VasPlanningRadioType valueOf(String str) {
                return (VasPlanningRadioType) Enum.valueOf(VasPlanningRadioType.class, str);
            }

            public static VasPlanningRadioType[] values() {
                return (VasPlanningRadioType[]) f322439d.clone();
            }
        }

        /* compiled from: VasPlanningItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<VasPlanningRadioItem> {
            @Override // android.os.Parcelable.Creator
            public final VasPlanningRadioItem createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int iL2 = 0;
                boolean z12 = parcel.readInt() != 0;
                VasPlanningRadioType vasPlanningRadioTypeValueOf = VasPlanningRadioType.valueOf(parcel.readString());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(VasPlanningRadioItem.class.getClassLoader());
                String string5 = parcel.readString();
                boolean z13 = parcel.readInt() != 0;
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(VasPlanningRadioItem.class, parcel, arrayList, iL2, 1);
                }
                return new VasPlanningRadioItem(string, z12, vasPlanningRadioTypeValueOf, string2, string3, string4, deepLink, string5, z13, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final VasPlanningRadioItem[] newArray(int i12) {
                return new VasPlanningRadioItem[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public VasPlanningRadioItem(@k String str, boolean z12, @k VasPlanningRadioType vasPlanningRadioType, @k String str2, @l String str3, @l String str4, @l DeepLink deepLink, @k String str5, boolean z13, @k List<? extends VasPlanningItem> list) {
            super(null);
            this.f322427b = str;
            this.f322428c = z12;
            this.f322429d = vasPlanningRadioType;
            this.f322430e = str2;
            this.f322431f = str3;
            this.f322432g = str4;
            this.f322433h = deepLink;
            this.f322434i = str5;
            this.f322435j = z13;
            this.f322436k = list;
        }

        public static VasPlanningRadioItem L(VasPlanningRadioItem vasPlanningRadioItem, boolean z12, List list, int i12) {
            String str = vasPlanningRadioItem.f322427b;
            boolean z13 = vasPlanningRadioItem.f322428c;
            VasPlanningRadioType vasPlanningRadioType = vasPlanningRadioItem.f322429d;
            String str2 = vasPlanningRadioItem.f322430e;
            String str3 = vasPlanningRadioItem.f322431f;
            String str4 = vasPlanningRadioItem.f322432g;
            DeepLink deepLink = vasPlanningRadioItem.f322433h;
            String str5 = vasPlanningRadioItem.f322434i;
            if ((i12 & 256) != 0) {
                z12 = vasPlanningRadioItem.f322435j;
            }
            boolean z14 = z12;
            if ((i12 & 512) != 0) {
                list = vasPlanningRadioItem.f322436k;
            }
            vasPlanningRadioItem.getClass();
            return new VasPlanningRadioItem(str, z13, vasPlanningRadioType, str2, str3, str4, deepLink, str5, z14, list);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VasPlanningRadioItem)) {
                return false;
            }
            VasPlanningRadioItem vasPlanningRadioItem = (VasPlanningRadioItem) obj;
            return L.f(this.f322427b, vasPlanningRadioItem.f322427b) && this.f322428c == vasPlanningRadioItem.f322428c && this.f322429d == vasPlanningRadioItem.f322429d && L.f(this.f322430e, vasPlanningRadioItem.f322430e) && L.f(this.f322431f, vasPlanningRadioItem.f322431f) && L.f(this.f322432g, vasPlanningRadioItem.f322432g) && L.f(this.f322433h, vasPlanningRadioItem.f322433h) && L.f(this.f322434i, vasPlanningRadioItem.f322434i) && this.f322435j == vasPlanningRadioItem.f322435j && L.f(this.f322436k, vasPlanningRadioItem.f322436k);
        }

        @Override // com.avito.android.vas_planning.model.VasPlanningItem
        /* renamed from: f, reason: from getter */
        public final boolean getF322442c() {
            return this.f322428c;
        }

        @Override // com.avito.conveyor_item.a
        @k
        /* renamed from: getStringId, reason: from getter */
        public final String getF323246b() {
            return this.f322427b;
        }

        public final int hashCode() {
            int iD2 = H.d((this.f322429d.hashCode() + r.i(this.f322427b.hashCode() * 31, 31, this.f322428c)) * 31, 31, this.f322430e);
            String str = this.f322431f;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f322432g;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            DeepLink deepLink = this.f322433h;
            return this.f322436k.hashCode() + r.i(H.d((iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31, 31, this.f322434i), 31, this.f322435j);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VasPlanningRadioItem(stringId=");
            sb2.append(this.f322427b);
            sb2.append(", isStableModel=");
            sb2.append(this.f322428c);
            sb2.append(", type=");
            sb2.append(this.f322429d);
            sb2.append(", title=");
            sb2.append(this.f322430e);
            sb2.append(", description=");
            sb2.append(this.f322431f);
            sb2.append(", label=");
            sb2.append(this.f322432g);
            sb2.append(", action=");
            sb2.append(this.f322433h);
            sb2.append(", actionTitle=");
            sb2.append(this.f322434i);
            sb2.append(", isChecked=");
            sb2.append(this.f322435j);
            sb2.append(", dependentItems=");
            return H.p(sb2, this.f322436k, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f322427b);
            parcel.writeInt(this.f322428c ? 1 : 0);
            parcel.writeString(this.f322429d.name());
            parcel.writeString(this.f322430e);
            parcel.writeString(this.f322431f);
            parcel.writeString(this.f322432g);
            parcel.writeParcelable(this.f322433h, i12);
            parcel.writeString(this.f322434i);
            parcel.writeInt(this.f322435j ? 1 : 0);
            Iterator itJ = C0.j(this.f322436k, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
        }

        public VasPlanningRadioItem(String str, boolean z12, VasPlanningRadioType vasPlanningRadioType, String str2, String str3, String str4, DeepLink deepLink, String str5, boolean z13, List list, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? true : z12, vasPlanningRadioType, str2, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : str4, deepLink, str5, z13, (i12 & 512) != 0 ? C42784z0.f406748b : list);
        }
    }
}
