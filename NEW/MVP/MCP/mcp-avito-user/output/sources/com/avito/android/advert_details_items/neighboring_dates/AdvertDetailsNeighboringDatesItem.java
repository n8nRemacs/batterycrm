package com.avito.android.advert_details_items.neighboring_dates;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.advert_details_items.neighboring_dates.items.NeighboringDatesItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsNeighboringDatesItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "State", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsNeighboringDatesItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsNeighboringDatesItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f84867b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f84868c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public SerpDisplayType f84869d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpViewType f84870e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final State f84871f;

    /* compiled from: AdvertDetailsNeighboringDatesItem.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem$State;", "Landroid/os/Parcelable;", "Content", "Hide", "Loading", "Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem$State$Content;", "Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem$State$Hide;", "Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem$State$Loading;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public interface State extends Parcelable {

        /* compiled from: AdvertDetailsNeighboringDatesItem.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem$State$Content;", "Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem$State;", "ChangeDateButton", "MultiplyChips", "OneChip", "TwoChips", "Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem$State$Content$MultiplyChips;", "Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem$State$Content$OneChip;", "Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem$State$Content$TwoChips;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface Content extends State {

            /* compiled from: AdvertDetailsNeighboringDatesItem.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem$State$Content$ChangeDateButton;", "Landroid/os/Parcelable;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static final /* data */ class ChangeDateButton implements Parcelable {

                @k
                public static final Parcelable.Creator<ChangeDateButton> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @k
                public final PrintableText f84872b;

                /* renamed from: c, reason: collision with root package name */
                @k
                public final DeepLink f84873c;

                /* compiled from: AdvertDetailsNeighboringDatesItem.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<ChangeDateButton> {
                    @Override // android.os.Parcelable.Creator
                    public final ChangeDateButton createFromParcel(Parcel parcel) {
                        return new ChangeDateButton((DeepLink) parcel.readParcelable(ChangeDateButton.class.getClassLoader()), (PrintableText) parcel.readParcelable(ChangeDateButton.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ChangeDateButton[] newArray(int i12) {
                        return new ChangeDateButton[i12];
                    }
                }

                public ChangeDateButton(@k DeepLink deepLink, @k PrintableText printableText) {
                    this.f84872b = printableText;
                    this.f84873c = deepLink;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ChangeDateButton)) {
                        return false;
                    }
                    ChangeDateButton changeDateButton = (ChangeDateButton) obj;
                    return L.f(this.f84872b, changeDateButton.f84872b) && L.f(this.f84873c, changeDateButton.f84873c);
                }

                public final int hashCode() {
                    return this.f84873c.hashCode() + (this.f84872b.hashCode() * 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("ChangeDateButton(text=");
                    sb2.append(this.f84872b);
                    sb2.append(", deeplink=");
                    return com.avito.android.actions_sheet.a.v(sb2, this.f84873c, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeParcelable(this.f84872b, i12);
                    parcel.writeParcelable(this.f84873c, i12);
                }
            }

            /* compiled from: AdvertDetailsNeighboringDatesItem.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem$State$Content$MultiplyChips;", "Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem$State$Content;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static final /* data */ class MultiplyChips implements Content {

                @k
                public static final Parcelable.Creator<MultiplyChips> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @k
                public final PrintableText f84874b;

                /* renamed from: c, reason: collision with root package name */
                @l
                public final ChangeDateButton f84875c;

                /* renamed from: d, reason: collision with root package name */
                @k
                public final ArrayList f84876d;

                /* renamed from: e, reason: collision with root package name */
                @l
                public final Integer f84877e;

                /* compiled from: AdvertDetailsNeighboringDatesItem.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<MultiplyChips> {
                    @Override // android.os.Parcelable.Creator
                    public final MultiplyChips createFromParcel(Parcel parcel) {
                        PrintableText printableText = (PrintableText) parcel.readParcelable(MultiplyChips.class.getClassLoader());
                        ChangeDateButton changeDateButtonCreateFromParcel = parcel.readInt() == 0 ? null : ChangeDateButton.CREATOR.createFromParcel(parcel);
                        int i12 = parcel.readInt();
                        ArrayList arrayList = new ArrayList(i12);
                        int iL2 = 0;
                        while (iL2 != i12) {
                            iL2 = com.avito.android.actions_sheet.a.l(MultiplyChips.class, parcel, arrayList, iL2, 1);
                        }
                        return new MultiplyChips(printableText, changeDateButtonCreateFromParcel, arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final MultiplyChips[] newArray(int i12) {
                        return new MultiplyChips[i12];
                    }
                }

                public MultiplyChips(@k PrintableText printableText, @l ChangeDateButton changeDateButton, @k ArrayList arrayList, @l Integer num) {
                    this.f84874b = printableText;
                    this.f84875c = changeDateButton;
                    this.f84876d = arrayList;
                    this.f84877e = num;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof MultiplyChips)) {
                        return false;
                    }
                    MultiplyChips multiplyChips = (MultiplyChips) obj;
                    return L.f(this.f84874b, multiplyChips.f84874b) && L.f(this.f84875c, multiplyChips.f84875c) && this.f84876d.equals(multiplyChips.f84876d) && L.f(this.f84877e, multiplyChips.f84877e);
                }

                public final int hashCode() {
                    int iHashCode = this.f84874b.hashCode() * 31;
                    ChangeDateButton changeDateButton = this.f84875c;
                    int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f84876d, (iHashCode + (changeDateButton == null ? 0 : changeDateButton.hashCode())) * 31, 31);
                    Integer num = this.f84877e;
                    return iG2 + (num != null ? num.hashCode() : 0);
                }

                @Override // com.avito.android.advert_details_items.neighboring_dates.AdvertDetailsNeighboringDatesItem.State.Content
                @l
                /* renamed from: t4, reason: from getter */
                public final ChangeDateButton getF84882c() {
                    return this.f84875c;
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("MultiplyChips(titleText=");
                    sb2.append(this.f84874b);
                    sb2.append(", changeDateButton=");
                    sb2.append(this.f84875c);
                    sb2.append(", chips=");
                    sb2.append(this.f84876d);
                    sb2.append(", scrollPosition=");
                    return s.j(sb2, this.f84877e, ')');
                }

                @Override // com.avito.android.advert_details_items.neighboring_dates.AdvertDetailsNeighboringDatesItem.State.Content
                @k
                /* renamed from: w0, reason: from getter */
                public final PrintableText getF84881b() {
                    return this.f84874b;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeParcelable(this.f84874b, i12);
                    ChangeDateButton changeDateButton = this.f84875c;
                    if (changeDateButton == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        changeDateButton.writeToParcel(parcel, i12);
                    }
                    ArrayList arrayList = this.f84876d;
                    parcel.writeInt(arrayList.size());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        parcel.writeParcelable((Parcelable) it.next(), i12);
                    }
                    Integer num = this.f84877e;
                    if (num == null) {
                        parcel.writeInt(0);
                    } else {
                        com.avito.android.actions_sheet.a.C(parcel, 1, num);
                    }
                }
            }

            /* compiled from: AdvertDetailsNeighboringDatesItem.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem$State$Content$OneChip;", "Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem$State$Content;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static final /* data */ class OneChip implements Content {

                @k
                public static final Parcelable.Creator<OneChip> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @k
                public final PrintableText f84878b;

                /* renamed from: c, reason: collision with root package name */
                @l
                public final ChangeDateButton f84879c;

                /* renamed from: d, reason: collision with root package name */
                @k
                public final NeighboringDatesItem f84880d;

                /* compiled from: AdvertDetailsNeighboringDatesItem.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<OneChip> {
                    @Override // android.os.Parcelable.Creator
                    public final OneChip createFromParcel(Parcel parcel) {
                        return new OneChip((PrintableText) parcel.readParcelable(OneChip.class.getClassLoader()), parcel.readInt() == 0 ? null : ChangeDateButton.CREATOR.createFromParcel(parcel), (NeighboringDatesItem) parcel.readParcelable(OneChip.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final OneChip[] newArray(int i12) {
                        return new OneChip[i12];
                    }
                }

                public OneChip(@k PrintableText printableText, @l ChangeDateButton changeDateButton, @k NeighboringDatesItem neighboringDatesItem) {
                    this.f84878b = printableText;
                    this.f84879c = changeDateButton;
                    this.f84880d = neighboringDatesItem;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof OneChip)) {
                        return false;
                    }
                    OneChip oneChip = (OneChip) obj;
                    return L.f(this.f84878b, oneChip.f84878b) && L.f(this.f84879c, oneChip.f84879c) && L.f(this.f84880d, oneChip.f84880d);
                }

                public final int hashCode() {
                    int iHashCode = this.f84878b.hashCode() * 31;
                    ChangeDateButton changeDateButton = this.f84879c;
                    return this.f84880d.hashCode() + ((iHashCode + (changeDateButton == null ? 0 : changeDateButton.hashCode())) * 31);
                }

                @Override // com.avito.android.advert_details_items.neighboring_dates.AdvertDetailsNeighboringDatesItem.State.Content
                @l
                /* renamed from: t4, reason: from getter */
                public final ChangeDateButton getF84882c() {
                    return this.f84879c;
                }

                @k
                public final String toString() {
                    return "OneChip(titleText=" + this.f84878b + ", changeDateButton=" + this.f84879c + ", chip=" + this.f84880d + ')';
                }

                @Override // com.avito.android.advert_details_items.neighboring_dates.AdvertDetailsNeighboringDatesItem.State.Content
                @k
                /* renamed from: w0, reason: from getter */
                public final PrintableText getF84881b() {
                    return this.f84878b;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeParcelable(this.f84878b, i12);
                    ChangeDateButton changeDateButton = this.f84879c;
                    if (changeDateButton == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        changeDateButton.writeToParcel(parcel, i12);
                    }
                    parcel.writeParcelable(this.f84880d, i12);
                }
            }

            /* compiled from: AdvertDetailsNeighboringDatesItem.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem$State$Content$TwoChips;", "Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem$State$Content;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static final /* data */ class TwoChips implements Content {

                @k
                public static final Parcelable.Creator<TwoChips> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @k
                public final PrintableText f84881b;

                /* renamed from: c, reason: collision with root package name */
                @l
                public final ChangeDateButton f84882c;

                /* renamed from: d, reason: collision with root package name */
                @k
                public final NeighboringDatesItem f84883d;

                /* renamed from: e, reason: collision with root package name */
                @k
                public final NeighboringDatesItem f84884e;

                /* compiled from: AdvertDetailsNeighboringDatesItem.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<TwoChips> {
                    @Override // android.os.Parcelable.Creator
                    public final TwoChips createFromParcel(Parcel parcel) {
                        return new TwoChips((PrintableText) parcel.readParcelable(TwoChips.class.getClassLoader()), parcel.readInt() == 0 ? null : ChangeDateButton.CREATOR.createFromParcel(parcel), (NeighboringDatesItem) parcel.readParcelable(TwoChips.class.getClassLoader()), (NeighboringDatesItem) parcel.readParcelable(TwoChips.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final TwoChips[] newArray(int i12) {
                        return new TwoChips[i12];
                    }
                }

                public TwoChips(@k PrintableText printableText, @l ChangeDateButton changeDateButton, @k NeighboringDatesItem neighboringDatesItem, @k NeighboringDatesItem neighboringDatesItem2) {
                    this.f84881b = printableText;
                    this.f84882c = changeDateButton;
                    this.f84883d = neighboringDatesItem;
                    this.f84884e = neighboringDatesItem2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof TwoChips)) {
                        return false;
                    }
                    TwoChips twoChips = (TwoChips) obj;
                    return L.f(this.f84881b, twoChips.f84881b) && L.f(this.f84882c, twoChips.f84882c) && L.f(this.f84883d, twoChips.f84883d) && L.f(this.f84884e, twoChips.f84884e);
                }

                public final int hashCode() {
                    int iHashCode = this.f84881b.hashCode() * 31;
                    ChangeDateButton changeDateButton = this.f84882c;
                    return this.f84884e.hashCode() + ((this.f84883d.hashCode() + ((iHashCode + (changeDateButton == null ? 0 : changeDateButton.hashCode())) * 31)) * 31);
                }

                @Override // com.avito.android.advert_details_items.neighboring_dates.AdvertDetailsNeighboringDatesItem.State.Content
                @l
                /* renamed from: t4, reason: from getter */
                public final ChangeDateButton getF84882c() {
                    return this.f84882c;
                }

                @k
                public final String toString() {
                    return "TwoChips(titleText=" + this.f84881b + ", changeDateButton=" + this.f84882c + ", firstChip=" + this.f84883d + ", secondChip=" + this.f84884e + ')';
                }

                @Override // com.avito.android.advert_details_items.neighboring_dates.AdvertDetailsNeighboringDatesItem.State.Content
                @k
                /* renamed from: w0, reason: from getter */
                public final PrintableText getF84881b() {
                    return this.f84881b;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeParcelable(this.f84881b, i12);
                    ChangeDateButton changeDateButton = this.f84882c;
                    if (changeDateButton == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        changeDateButton.writeToParcel(parcel, i12);
                    }
                    parcel.writeParcelable(this.f84883d, i12);
                    parcel.writeParcelable(this.f84884e, i12);
                }
            }

            @l
            /* renamed from: t4 */
            ChangeDateButton getF84882c();

            @k
            /* renamed from: w0 */
            PrintableText getF84881b();
        }

        /* compiled from: AdvertDetailsNeighboringDatesItem.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem$State$Hide;", "Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem$State;", "<init>", "()V", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Hide implements State {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final Hide f84885b = new Hide();

            @k
            public static final Parcelable.Creator<Hide> CREATOR = new a();

            /* compiled from: AdvertDetailsNeighboringDatesItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Hide> {
                @Override // android.os.Parcelable.Creator
                public final Hide createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Hide.f84885b;
                }

                @Override // android.os.Parcelable.Creator
                public final Hide[] newArray(int i12) {
                    return new Hide[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof Hide);
            }

            public final int hashCode() {
                return -1413938374;
            }

            @k
            public final String toString() {
                return "Hide";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: AdvertDetailsNeighboringDatesItem.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem$State$Loading;", "Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem$State;", "<init>", "()V", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Loading implements State {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final Loading f84886b = new Loading();

            @k
            public static final Parcelable.Creator<Loading> CREATOR = new a();

            /* compiled from: AdvertDetailsNeighboringDatesItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Loading> {
                @Override // android.os.Parcelable.Creator
                public final Loading createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Loading.f84886b;
                }

                @Override // android.os.Parcelable.Creator
                public final Loading[] newArray(int i12) {
                    return new Loading[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return 1825265732;
            }

            @k
            public final String toString() {
                return "Loading";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }
    }

    /* compiled from: AdvertDetailsNeighboringDatesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsNeighboringDatesItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsNeighboringDatesItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsNeighboringDatesItem(parcel.readInt(), parcel.readString(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), (State) parcel.readParcelable(AdvertDetailsNeighboringDatesItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsNeighboringDatesItem[] newArray(int i12) {
            return new AdvertDetailsNeighboringDatesItem[i12];
        }
    }

    public AdvertDetailsNeighboringDatesItem(int i12, @k String str, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @k State state) {
        this.f84867b = i12;
        this.f84868c = str;
        this.f84869d = serpDisplayType;
        this.f84870e = serpViewType;
        this.f84871f = state;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsNeighboringDatesItem(i12, this.f84868c, this.f84869d, this.f84870e, this.f84871f);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f84869d = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsNeighboringDatesItem)) {
            return false;
        }
        AdvertDetailsNeighboringDatesItem advertDetailsNeighboringDatesItem = (AdvertDetailsNeighboringDatesItem) obj;
        return this.f84867b == advertDetailsNeighboringDatesItem.f84867b && L.f(this.f84868c, advertDetailsNeighboringDatesItem.f84868c) && this.f84869d == advertDetailsNeighboringDatesItem.f84869d && this.f84870e == advertDetailsNeighboringDatesItem.f84870e && L.f(this.f84871f, advertDetailsNeighboringDatesItem.f84871f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80616b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF84965b() {
        return this.f84867b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF84966c() {
        return this.f84868c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF84968e() {
        return this.f84870e;
    }

    public final int hashCode() {
        return this.f84871f.hashCode() + com.avito.android.actions_sheet.a.j(this.f84870e, com.avito.android.actions_sheet.a.h(this.f84869d, H.d(Integer.hashCode(this.f84867b) * 31, 31, this.f84868c), 31), 31);
    }

    @k
    public final String toString() {
        return "AdvertDetailsNeighboringDatesItem(spanCount=" + this.f84867b + ", stringId=" + this.f84868c + ", displayType=" + this.f84869d + ", viewType=" + this.f84870e + ", state=" + this.f84871f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f84867b);
        parcel.writeString(this.f84868c);
        parcel.writeString(this.f84869d.name());
        parcel.writeString(this.f84870e.name());
        parcel.writeParcelable(this.f84871f, i12);
    }
}
