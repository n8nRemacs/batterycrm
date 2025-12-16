package com.avito.android.guests_selector.io;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GuestsSelectorInput.kt */
@d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\t¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b#\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/avito/android/guests_selector/io/GuestsSelectorInput;", "Landroid/os/Parcelable;", "", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "", "minGuests", "maxGuests", "maxAdultCount", "maxChildrenCount", "", "Lcom/avito/android/guests_selector/io/GuestsSelectorAvailableAge;", "availableAges", "initialAdultGuests", "Lcom/avito/android/guests_selector/io/GuestsSelectorChild;", "initialChildren", "buttonTitle", "", "withChildren", "Lcom/avito/android/guests_selector/io/Parameter;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "Ljava/lang/String;", "getTheme", "()Ljava/lang/String;", "Ljava/lang/Integer;", "j", "()Ljava/lang/Integer;", "i", "g", "h", "Ljava/util/List;", "c", "()Ljava/util/List;", "e", "f", "d", "Ljava/lang/Boolean;", "k", "()Ljava/lang/Boolean;", "_avito_guests-selector_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GuestsSelectorInput implements Parcelable {

    @k
    public static final Parcelable.Creator<GuestsSelectorInput> CREATOR = new a();

    @c("availableAges")
    @l
    private final List<GuestsSelectorAvailableAge> availableAges;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<Parameter> f161447b;

    @c("buttonTitle")
    @l
    private final String buttonTitle;

    @c("initialAdultGuests")
    @l
    private final Integer initialAdultGuests;

    @c("initialChildren")
    @l
    private final List<GuestsSelectorChild> initialChildren;

    @c("maxAdultsCount")
    @l
    private final Integer maxAdultCount;

    @c("maxChildrenCount")
    @l
    private final Integer maxChildrenCount;

    @c("maxGuests")
    @l
    private final Integer maxGuests;

    @c("minGuests")
    @l
    private final Integer minGuests;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @l
    private final String theme;

    @c("withChildren")
    @l
    private final Boolean withChildren;

    /* compiled from: GuestsSelectorInput.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GuestsSelectorInput> {
        @Override // android.os.Parcelable.Creator
        public final GuestsSelectorInput createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean boolValueOf;
            ArrayList arrayList3;
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(GuestsSelectorAvailableAge.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = com.avito.android.actions_sheet.a.c(GuestsSelectorChild.CREATOR, parcel, arrayList2, iC3, 1);
                }
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                arrayList3 = new ArrayList(i14);
                while (iL2 != i14) {
                    iL2 = com.avito.android.actions_sheet.a.l(GuestsSelectorInput.class, parcel, arrayList3, iL2, 1);
                }
            }
            return new GuestsSelectorInput(string, numValueOf, numValueOf2, numValueOf3, numValueOf4, arrayList, numValueOf5, arrayList2, string2, boolValueOf, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final GuestsSelectorInput[] newArray(int i12) {
            return new GuestsSelectorInput[i12];
        }
    }

    public GuestsSelectorInput() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @l
    public final List<GuestsSelectorAvailableAge> c() {
        return this.availableAges;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Integer getInitialAdultGuests() {
        return this.initialAdultGuests;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GuestsSelectorInput)) {
            return false;
        }
        GuestsSelectorInput guestsSelectorInput = (GuestsSelectorInput) obj;
        return L.f(this.theme, guestsSelectorInput.theme) && L.f(this.minGuests, guestsSelectorInput.minGuests) && L.f(this.maxGuests, guestsSelectorInput.maxGuests) && L.f(this.maxAdultCount, guestsSelectorInput.maxAdultCount) && L.f(this.maxChildrenCount, guestsSelectorInput.maxChildrenCount) && L.f(this.availableAges, guestsSelectorInput.availableAges) && L.f(this.initialAdultGuests, guestsSelectorInput.initialAdultGuests) && L.f(this.initialChildren, guestsSelectorInput.initialChildren) && L.f(this.buttonTitle, guestsSelectorInput.buttonTitle) && L.f(this.withChildren, guestsSelectorInput.withChildren) && L.f(this.f161447b, guestsSelectorInput.f161447b);
    }

    @l
    public final List<GuestsSelectorChild> f() {
        return this.initialChildren;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Integer getMaxAdultCount() {
        return this.maxAdultCount;
    }

    @l
    public final String getTheme() {
        return this.theme;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final Integer getMaxChildrenCount() {
        return this.maxChildrenCount;
    }

    public final int hashCode() {
        String str = this.theme;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.minGuests;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maxGuests;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxAdultCount;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.maxChildrenCount;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<GuestsSelectorAvailableAge> list = this.availableAges;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num5 = this.initialAdultGuests;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List<GuestsSelectorChild> list2 = this.initialChildren;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.buttonTitle;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.withChildren;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<Parameter> list3 = this.f161447b;
        return iHashCode10 + (list3 != null ? list3.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final Integer getMaxGuests() {
        return this.maxGuests;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final Integer getMinGuests() {
        return this.minGuests;
    }

    @l
    /* renamed from: k, reason: from getter */
    public final Boolean getWithChildren() {
        return this.withChildren;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GuestsSelectorInput(theme=");
        sb2.append(this.theme);
        sb2.append(", minGuests=");
        sb2.append(this.minGuests);
        sb2.append(", maxGuests=");
        sb2.append(this.maxGuests);
        sb2.append(", maxAdultCount=");
        sb2.append(this.maxAdultCount);
        sb2.append(", maxChildrenCount=");
        sb2.append(this.maxChildrenCount);
        sb2.append(", availableAges=");
        sb2.append(this.availableAges);
        sb2.append(", initialAdultGuests=");
        sb2.append(this.initialAdultGuests);
        sb2.append(", initialChildren=");
        sb2.append(this.initialChildren);
        sb2.append(", buttonTitle=");
        sb2.append(this.buttonTitle);
        sb2.append(", withChildren=");
        sb2.append(this.withChildren);
        sb2.append(", parameters=");
        return H.p(sb2, this.f161447b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.theme);
        Integer num = this.minGuests;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.maxGuests;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.maxAdultCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        Integer num4 = this.maxChildrenCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num4);
        }
        List<GuestsSelectorAvailableAge> list = this.availableAges;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((GuestsSelectorAvailableAge) itA.next()).writeToParcel(parcel, i12);
            }
        }
        Integer num5 = this.initialAdultGuests;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num5);
        }
        List<GuestsSelectorChild> list2 = this.initialChildren;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((GuestsSelectorChild) itA2.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeString(this.buttonTitle);
        Boolean bool = this.withChildren;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        List<Parameter> list3 = this.f161447b;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
        while (itA3.hasNext()) {
            parcel.writeParcelable((Parcelable) itA3.next(), i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GuestsSelectorInput(@l String str, @l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @l List<GuestsSelectorAvailableAge> list, @l Integer num5, @l List<GuestsSelectorChild> list2, @l String str2, @l Boolean bool, @l List<? extends Parameter> list3) {
        this.theme = str;
        this.minGuests = num;
        this.maxGuests = num2;
        this.maxAdultCount = num3;
        this.maxChildrenCount = num4;
        this.availableAges = list;
        this.initialAdultGuests = num5;
        this.initialChildren = list2;
        this.buttonTitle = str2;
        this.withChildren = bool;
        this.f161447b = list3;
    }

    public /* synthetic */ GuestsSelectorInput(String str, Integer num, Integer num2, Integer num3, Integer num4, List list, Integer num5, List list2, String str2, Boolean bool, List list3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : num2, (i12 & 8) != 0 ? null : num3, (i12 & 16) != 0 ? null : num4, (i12 & 32) != 0 ? null : list, (i12 & 64) != 0 ? null : num5, (i12 & 128) != 0 ? null : list2, (i12 & 256) != 0 ? null : str2, (i12 & 512) != 0 ? Boolean.TRUE : bool, (i12 & 1024) == 0 ? list3 : null);
    }
}
