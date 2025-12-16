package com.avito.android.advert.item.hotel.hotel_offer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsHotelOffer.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/AdvertDetailsHotelOffer;", "Landroid/os/Parcelable;", "Action", "Installment", "InstallmentEntryPoint", "InstallmentEntryPointPart", "Item", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsHotelOffer implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsHotelOffer> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Action f75861b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f75862c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ParametrizedEvent f75863d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Action f75864e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f75865f;

    /* compiled from: AdvertDetailsHotelOffer.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/AdvertDetailsHotelOffer$Action;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Action implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f75866b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f75867c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final DeepLink f75868d;

        /* compiled from: AdvertDetailsHotelOffer.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Action> {
            @Override // android.os.Parcelable.Creator
            public final Action createFromParcel(Parcel parcel) {
                return new Action(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(Action.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@Y61.l String str, @Y61.l String str2, @Y61.l DeepLink deepLink) {
            this.f75866b = str;
            this.f75867c = str2;
            this.f75868d = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return L.f(this.f75866b, action.f75866b) && L.f(this.f75867c, action.f75867c) && L.f(this.f75868d, action.f75868d);
        }

        public final int hashCode() {
            String str = this.f75866b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f75867c;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            DeepLink deepLink = this.f75868d;
            return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(style=");
            sb2.append(this.f75866b);
            sb2.append(", title=");
            sb2.append(this.f75867c);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f75868d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f75866b);
            parcel.writeString(this.f75867c);
            parcel.writeParcelable(this.f75868d, i12);
        }
    }

    /* compiled from: AdvertDetailsHotelOffer.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/AdvertDetailsHotelOffer$Installment;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class Installment implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Installment> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final DeepLink f75869b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final InstallmentEntryPoint f75870c;

        /* compiled from: AdvertDetailsHotelOffer.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Installment> {
            @Override // android.os.Parcelable.Creator
            public final Installment createFromParcel(Parcel parcel) {
                return new Installment((DeepLink) parcel.readParcelable(Installment.class.getClassLoader()), InstallmentEntryPoint.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Installment[] newArray(int i12) {
                return new Installment[i12];
            }
        }

        public Installment(@Y61.l DeepLink deepLink, @Y61.k InstallmentEntryPoint installmentEntryPoint) {
            this.f75869b = deepLink;
            this.f75870c = installmentEntryPoint;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f75869b, i12);
            this.f75870c.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: AdvertDetailsHotelOffer.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/AdvertDetailsHotelOffer$InstallmentEntryPoint;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class InstallmentEntryPoint implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<InstallmentEntryPoint> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final InstallmentEntryPointPart f75871b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final InstallmentEntryPointPart f75872c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Integer f75873d;

        /* compiled from: AdvertDetailsHotelOffer.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<InstallmentEntryPoint> {
            @Override // android.os.Parcelable.Creator
            public final InstallmentEntryPoint createFromParcel(Parcel parcel) {
                return new InstallmentEntryPoint(parcel.readInt() == 0 ? null : InstallmentEntryPointPart.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InstallmentEntryPointPart.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final InstallmentEntryPoint[] newArray(int i12) {
                return new InstallmentEntryPoint[i12];
            }
        }

        public InstallmentEntryPoint(@Y61.l InstallmentEntryPointPart installmentEntryPointPart, @Y61.l InstallmentEntryPointPart installmentEntryPointPart2, @Y61.l Integer num) {
            this.f75871b = installmentEntryPointPart;
            this.f75872c = installmentEntryPointPart2;
            this.f75873d = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            InstallmentEntryPointPart installmentEntryPointPart = this.f75871b;
            if (installmentEntryPointPart == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                installmentEntryPointPart.writeToParcel(parcel, i12);
            }
            InstallmentEntryPointPart installmentEntryPointPart2 = this.f75872c;
            if (installmentEntryPointPart2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                installmentEntryPointPart2.writeToParcel(parcel, i12);
            }
            Integer num = this.f75873d;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
        }
    }

    /* compiled from: AdvertDetailsHotelOffer.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/AdvertDetailsHotelOffer$InstallmentEntryPointPart;", "Landroid/os/Parcelable;", "HighlightType", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class InstallmentEntryPointPart implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<InstallmentEntryPointPart> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final AttributedText f75874b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final HighlightType f75875c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AdvertDetailsHotelOffer.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/AdvertDetailsHotelOffer$InstallmentEntryPointPart$HighlightType;", "", "Landroid/os/Parcelable;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class HighlightType implements Parcelable {

            @Y61.k
            public static final Parcelable.Creator<HighlightType> CREATOR;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f75876b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ HighlightType[] f75877c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f75878d;

            /* compiled from: AdvertDetailsHotelOffer.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/AdvertDetailsHotelOffer$InstallmentEntryPointPart$HighlightType$a;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class a {
                public /* synthetic */ a(C42822w c42822w) {
                    this();
                }

                public a() {
                }
            }

            /* compiled from: AdvertDetailsHotelOffer.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class b implements Parcelable.Creator<HighlightType> {
                @Override // android.os.Parcelable.Creator
                public final HighlightType createFromParcel(Parcel parcel) {
                    return HighlightType.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final HighlightType[] newArray(int i12) {
                    return new HighlightType[i12];
                }
            }

            static {
                HighlightType[] highlightTypeArr = {new HighlightType()};
                f75877c = highlightTypeArr;
                f75878d = kotlin.enums.c.a(highlightTypeArr);
                f75876b = new a(null);
                CREATOR = new b();
            }

            public static HighlightType valueOf(String str) {
                return (HighlightType) Enum.valueOf(HighlightType.class, str);
            }

            public static HighlightType[] values() {
                return (HighlightType[]) f75877c.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(name());
            }
        }

        /* compiled from: AdvertDetailsHotelOffer.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<InstallmentEntryPointPart> {
            @Override // android.os.Parcelable.Creator
            public final InstallmentEntryPointPart createFromParcel(Parcel parcel) {
                return new InstallmentEntryPointPart((AttributedText) parcel.readParcelable(InstallmentEntryPointPart.class.getClassLoader()), parcel.readInt() == 0 ? null : HighlightType.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final InstallmentEntryPointPart[] newArray(int i12) {
                return new InstallmentEntryPointPart[i12];
            }
        }

        public InstallmentEntryPointPart(@Y61.k AttributedText attributedText, @Y61.l HighlightType highlightType) {
            this.f75874b = attributedText;
            this.f75875c = highlightType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f75874b, i12);
            HighlightType highlightType = this.f75875c;
            if (highlightType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                highlightType.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: AdvertDetailsHotelOffer.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/AdvertDetailsHotelOffer$Item;", "Landroid/os/Parcelable;", "Button", "Offer", "Lcom/avito/android/advert/item/hotel/hotel_offer/AdvertDetailsHotelOffer$Item$Button;", "Lcom/avito/android/advert/item/hotel/hotel_offer/AdvertDetailsHotelOffer$Item$Offer;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Item extends Parcelable {

        /* compiled from: AdvertDetailsHotelOffer.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/AdvertDetailsHotelOffer$Item$Button;", "Lcom/avito/android/advert/item/hotel/hotel_offer/AdvertDetailsHotelOffer$Item;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class Button implements Item {

            @Y61.k
            public static final Parcelable.Creator<Button> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f75879b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f75880c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final DeepLink f75881d;

            /* compiled from: AdvertDetailsHotelOffer.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Button> {
                @Override // android.os.Parcelable.Creator
                public final Button createFromParcel(Parcel parcel) {
                    return new Button(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Button[] newArray(int i12) {
                    return new Button[i12];
                }
            }

            public Button(@Y61.l String str, @Y61.l String str2, @Y61.l DeepLink deepLink) {
                this.f75879b = str;
                this.f75880c = str2;
                this.f75881d = deepLink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f75879b);
                parcel.writeString(this.f75880c);
                parcel.writeParcelable(this.f75881d, i12);
            }
        }

        /* compiled from: AdvertDetailsHotelOffer.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_offer/AdvertDetailsHotelOffer$Item$Offer;", "Lcom/avito/android/advert/item/hotel/hotel_offer/AdvertDetailsHotelOffer$Item;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class Offer implements Item {

            @Y61.k
            public static final Parcelable.Creator<Offer> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Action f75882b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final AttributedText f75883c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final DeepLink f75884d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final List<Image> f75885e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.l
            public final Installment f75886f;

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final AttributedText f75887g;

            /* compiled from: AdvertDetailsHotelOffer.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Offer> {
                @Override // android.os.Parcelable.Creator
                public final Offer createFromParcel(Parcel parcel) {
                    Action actionCreateFromParcel = Action.CREATOR.createFromParcel(parcel);
                    AttributedText attributedText = (AttributedText) parcel.readParcelable(Offer.class.getClassLoader());
                    DeepLink deepLink = (DeepLink) parcel.readParcelable(Offer.class.getClassLoader());
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(Offer.class, parcel, arrayList, iL2, 1);
                    }
                    return new Offer(actionCreateFromParcel, attributedText, deepLink, arrayList, parcel.readInt() == 0 ? null : Installment.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(Offer.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Offer[] newArray(int i12) {
                    return new Offer[i12];
                }
            }

            public Offer(@Y61.k Action action, @Y61.k AttributedText attributedText, @Y61.k DeepLink deepLink, @Y61.k List<Image> list, @Y61.l Installment installment, @Y61.k AttributedText attributedText2) {
                this.f75882b = action;
                this.f75883c = attributedText;
                this.f75884d = deepLink;
                this.f75885e = list;
                this.f75886f = installment;
                this.f75887g = attributedText2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                this.f75882b.writeToParcel(parcel, i12);
                parcel.writeParcelable(this.f75883c, i12);
                parcel.writeParcelable(this.f75884d, i12);
                Iterator itJ = C0.j(this.f75885e, parcel);
                while (itJ.hasNext()) {
                    parcel.writeParcelable((Parcelable) itJ.next(), i12);
                }
                Installment installment = this.f75886f;
                if (installment == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    installment.writeToParcel(parcel, i12);
                }
                parcel.writeParcelable(this.f75887g, i12);
            }
        }
    }

    /* compiled from: AdvertDetailsHotelOffer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsHotelOffer> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsHotelOffer createFromParcel(Parcel parcel) {
            Action actionCreateFromParcel = parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AdvertDetailsHotelOffer.class, parcel, arrayList, iL2, 1);
            }
            return new AdvertDetailsHotelOffer(actionCreateFromParcel, arrayList, (ParametrizedEvent) parcel.readParcelable(AdvertDetailsHotelOffer.class.getClassLoader()), Action.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsHotelOffer[] newArray(int i12) {
            return new AdvertDetailsHotelOffer[i12];
        }
    }

    public AdvertDetailsHotelOffer(@Y61.l Action action, @Y61.k ArrayList arrayList, @Y61.l ParametrizedEvent parametrizedEvent, @Y61.k Action action2, @Y61.k String str) {
        this.f75861b = action;
        this.f75862c = arrayList;
        this.f75863d = parametrizedEvent;
        this.f75864e = action2;
        this.f75865f = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsHotelOffer)) {
            return false;
        }
        AdvertDetailsHotelOffer advertDetailsHotelOffer = (AdvertDetailsHotelOffer) obj;
        return L.f(this.f75861b, advertDetailsHotelOffer.f75861b) && this.f75862c.equals(advertDetailsHotelOffer.f75862c) && L.f(this.f75863d, advertDetailsHotelOffer.f75863d) && L.f(this.f75864e, advertDetailsHotelOffer.f75864e) && L.f(this.f75865f, advertDetailsHotelOffer.f75865f);
    }

    public final int hashCode() {
        Action action = this.f75861b;
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f75862c, (action == null ? 0 : action.hashCode()) * 31, 31);
        ParametrizedEvent parametrizedEvent = this.f75863d;
        return this.f75865f.hashCode() + ((this.f75864e.hashCode() + ((iG2 + (parametrizedEvent != null ? parametrizedEvent.hashCode() : 0)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsHotelOffer(bottomAction=");
        sb2.append(this.f75861b);
        sb2.append(", items=");
        sb2.append(this.f75862c);
        sb2.append(", onScrollEvent=");
        sb2.append(this.f75863d);
        sb2.append(", searchOffers=");
        sb2.append(this.f75864e);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f75865f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Action action = this.f75861b;
        if (action == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action.writeToParcel(parcel, i12);
        }
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f75862c, parcel);
        while (itZ.hasNext()) {
            parcel.writeParcelable((Parcelable) itZ.next(), i12);
        }
        parcel.writeParcelable(this.f75863d, i12);
        this.f75864e.writeToParcel(parcel, i12);
        parcel.writeString(this.f75865f);
    }
}
