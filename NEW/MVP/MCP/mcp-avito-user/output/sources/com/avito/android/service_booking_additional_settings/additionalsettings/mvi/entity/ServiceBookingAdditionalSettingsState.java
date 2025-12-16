package com.avito.android.service_booking_additional_settings.additionalsettings.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.service_booking_additional_settings.additionalsettings.domain.BookingToggleToast;
import com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.AdditionalSettingsElementsContentItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingAdditionalSettingsState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "a", "ElementsShow", "ServiceBookingAdditionalSettingsContent", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceBookingAdditionalSettingsState extends q implements Parcelable {

    @k
    public static final Parcelable.Creator<ServiceBookingAdditionalSettingsState> CREATOR = new b();

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f274989g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final ServiceBookingAdditionalSettingsState f274990h;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f274991b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ServiceBookingAdditionalSettingsContent f274992c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f274993d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ElementsShow f274994e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final BookingToggleToast f274995f;

    /* compiled from: ServiceBookingAdditionalSettingsState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsState$ElementsShow;", "Landroid/os/Parcelable;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ElementsShow implements Parcelable {

        @k
        public static final Parcelable.Creator<ElementsShow> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f274996b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f274997c;

        /* compiled from: ServiceBookingAdditionalSettingsState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ElementsShow> {
            @Override // android.os.Parcelable.Creator
            public final ElementsShow createFromParcel(Parcel parcel) {
                return new ElementsShow(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ElementsShow[] newArray(int i12) {
                return new ElementsShow[i12];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ElementsShow() {
            boolean z12 = false;
            this(z12, z12, 3, null);
        }

        public static ElementsShow a(ElementsShow elementsShow, boolean z12) {
            boolean z13 = elementsShow.f274996b;
            elementsShow.getClass();
            return new ElementsShow(z13, z12);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ElementsShow)) {
                return false;
            }
            ElementsShow elementsShow = (ElementsShow) obj;
            return this.f274996b == elementsShow.f274996b && this.f274997c == elementsShow.f274997c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f274997c) + (Boolean.hashCode(this.f274996b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ElementsShow(openTimeGapBottomSheet=");
            sb2.append(this.f274996b);
            sb2.append(", dataLoading=");
            return r.x(sb2, this.f274997c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f274996b ? 1 : 0);
            parcel.writeInt(this.f274997c ? 1 : 0);
        }

        public ElementsShow(boolean z12, boolean z13) {
            this.f274996b = z12;
            this.f274997c = z13;
        }

        public /* synthetic */ ElementsShow(boolean z12, boolean z13, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13);
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsState$ServiceBookingAdditionalSettingsContent;", "Landroid/os/Parcelable;", "AdditionalSettingsAppBar", "AdditionalSettingsHelpButton", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ServiceBookingAdditionalSettingsContent implements Parcelable {

        @k
        public static final Parcelable.Creator<ServiceBookingAdditionalSettingsContent> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AdditionalSettingsAppBar f274998b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AdditionalSettingsHelpButton f274999c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final AttributedText f275000d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<AdditionalSettingsElementsContentItem> f275001e;

        /* compiled from: ServiceBookingAdditionalSettingsState.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsState$ServiceBookingAdditionalSettingsContent$AdditionalSettingsAppBar;", "Landroid/os/Parcelable;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AdditionalSettingsAppBar implements Parcelable {

            @k
            public static final Parcelable.Creator<AdditionalSettingsAppBar> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f275002b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f275003c;

            /* compiled from: ServiceBookingAdditionalSettingsState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<AdditionalSettingsAppBar> {
                @Override // android.os.Parcelable.Creator
                public final AdditionalSettingsAppBar createFromParcel(Parcel parcel) {
                    return new AdditionalSettingsAppBar(parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final AdditionalSettingsAppBar[] newArray(int i12) {
                    return new AdditionalSettingsAppBar[i12];
                }
            }

            public AdditionalSettingsAppBar(@k String str, boolean z12) {
                this.f275002b = str;
                this.f275003c = z12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AdditionalSettingsAppBar)) {
                    return false;
                }
                AdditionalSettingsAppBar additionalSettingsAppBar = (AdditionalSettingsAppBar) obj;
                return L.f(this.f275002b, additionalSettingsAppBar.f275002b) && this.f275003c == additionalSettingsAppBar.f275003c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f275003c) + (this.f275002b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AdditionalSettingsAppBar(title=");
                sb2.append(this.f275002b);
                sb2.append(", hasCloseButton=");
                return r.x(sb2, this.f275003c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f275002b);
                parcel.writeInt(this.f275003c ? 1 : 0);
            }
        }

        /* compiled from: ServiceBookingAdditionalSettingsState.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsState$ServiceBookingAdditionalSettingsContent$AdditionalSettingsHelpButton;", "Landroid/os/Parcelable;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AdditionalSettingsHelpButton implements Parcelable {

            @k
            public static final Parcelable.Creator<AdditionalSettingsHelpButton> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f275004b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f275005c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f275006d;

            /* compiled from: ServiceBookingAdditionalSettingsState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<AdditionalSettingsHelpButton> {
                @Override // android.os.Parcelable.Creator
                public final AdditionalSettingsHelpButton createFromParcel(Parcel parcel) {
                    return new AdditionalSettingsHelpButton(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final AdditionalSettingsHelpButton[] newArray(int i12) {
                    return new AdditionalSettingsHelpButton[i12];
                }
            }

            public AdditionalSettingsHelpButton(@k String str, @k String str2, @k String str3) {
                this.f275004b = str;
                this.f275005c = str2;
                this.f275006d = str3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AdditionalSettingsHelpButton)) {
                    return false;
                }
                AdditionalSettingsHelpButton additionalSettingsHelpButton = (AdditionalSettingsHelpButton) obj;
                return L.f(this.f275004b, additionalSettingsHelpButton.f275004b) && L.f(this.f275005c, additionalSettingsHelpButton.f275005c) && L.f(this.f275006d, additionalSettingsHelpButton.f275006d);
            }

            public final int hashCode() {
                return this.f275006d.hashCode() + H.d(this.f275004b.hashCode() * 31, 31, this.f275005c);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AdditionalSettingsHelpButton(text=");
                sb2.append(this.f275004b);
                sb2.append(", url=");
                sb2.append(this.f275005c);
                sb2.append(", textColor=");
                return C22026a.c(sb2, this.f275006d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f275004b);
                parcel.writeString(this.f275005c);
                parcel.writeString(this.f275006d);
            }
        }

        /* compiled from: ServiceBookingAdditionalSettingsState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ServiceBookingAdditionalSettingsContent> {
            @Override // android.os.Parcelable.Creator
            public final ServiceBookingAdditionalSettingsContent createFromParcel(Parcel parcel) {
                AdditionalSettingsAppBar additionalSettingsAppBarCreateFromParcel = AdditionalSettingsAppBar.CREATOR.createFromParcel(parcel);
                AdditionalSettingsHelpButton additionalSettingsHelpButtonCreateFromParcel = parcel.readInt() == 0 ? null : AdditionalSettingsHelpButton.CREATOR.createFromParcel(parcel);
                AttributedText attributedText = (AttributedText) parcel.readParcelable(ServiceBookingAdditionalSettingsContent.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(AdditionalSettingsElementsContentItem.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new ServiceBookingAdditionalSettingsContent(additionalSettingsAppBarCreateFromParcel, additionalSettingsHelpButtonCreateFromParcel, attributedText, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final ServiceBookingAdditionalSettingsContent[] newArray(int i12) {
                return new ServiceBookingAdditionalSettingsContent[i12];
            }
        }

        public ServiceBookingAdditionalSettingsContent(@k AdditionalSettingsAppBar additionalSettingsAppBar, @l AdditionalSettingsHelpButton additionalSettingsHelpButton, @l AttributedText attributedText, @k List<AdditionalSettingsElementsContentItem> list) {
            this.f274998b = additionalSettingsAppBar;
            this.f274999c = additionalSettingsHelpButton;
            this.f275000d = attributedText;
            this.f275001e = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServiceBookingAdditionalSettingsContent)) {
                return false;
            }
            ServiceBookingAdditionalSettingsContent serviceBookingAdditionalSettingsContent = (ServiceBookingAdditionalSettingsContent) obj;
            return L.f(this.f274998b, serviceBookingAdditionalSettingsContent.f274998b) && L.f(this.f274999c, serviceBookingAdditionalSettingsContent.f274999c) && L.f(this.f275000d, serviceBookingAdditionalSettingsContent.f275000d) && L.f(this.f275001e, serviceBookingAdditionalSettingsContent.f275001e);
        }

        public final int hashCode() {
            int iHashCode = this.f274998b.hashCode() * 31;
            AdditionalSettingsHelpButton additionalSettingsHelpButton = this.f274999c;
            int iHashCode2 = (iHashCode + (additionalSettingsHelpButton == null ? 0 : additionalSettingsHelpButton.hashCode())) * 31;
            AttributedText attributedText = this.f275000d;
            return this.f275001e.hashCode() + ((iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ServiceBookingAdditionalSettingsContent(appBar=");
            sb2.append(this.f274998b);
            sb2.append(", helpButton=");
            sb2.append(this.f274999c);
            sb2.append(", licenseAgreement=");
            sb2.append(this.f275000d);
            sb2.append(", content=");
            return H.p(sb2, this.f275001e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f274998b.writeToParcel(parcel, i12);
            AdditionalSettingsHelpButton additionalSettingsHelpButton = this.f274999c;
            if (additionalSettingsHelpButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                additionalSettingsHelpButton.writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.f275000d, i12);
            Iterator itJ = C0.j(this.f275001e, parcel);
            while (itJ.hasNext()) {
                ((AdditionalSettingsElementsContentItem) itJ.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/mvi/entity/ServiceBookingAdditionalSettingsState$a;", "", "<init>", "()V", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ServiceBookingAdditionalSettingsState> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingAdditionalSettingsState createFromParcel(Parcel parcel) {
            return new ServiceBookingAdditionalSettingsState(parcel.readInt() != 0, parcel.readInt() == 0 ? null : ServiceBookingAdditionalSettingsContent.CREATOR.createFromParcel(parcel), parcel.readString(), ElementsShow.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BookingToggleToast.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingAdditionalSettingsState[] newArray(int i12) {
            return new ServiceBookingAdditionalSettingsState[i12];
        }
    }

    static {
        C42822w c42822w = null;
        f274989g = new a(c42822w);
        boolean z12 = false;
        f274990h = new ServiceBookingAdditionalSettingsState(true, null, null, new ElementsShow(z12, z12, 3, c42822w), null);
    }

    public ServiceBookingAdditionalSettingsState(boolean z12, @l ServiceBookingAdditionalSettingsContent serviceBookingAdditionalSettingsContent, @l String str, @k ElementsShow elementsShow, @l BookingToggleToast bookingToggleToast) {
        this.f274991b = z12;
        this.f274992c = serviceBookingAdditionalSettingsContent;
        this.f274993d = str;
        this.f274994e = elementsShow;
        this.f274995f = bookingToggleToast;
    }

    public static ServiceBookingAdditionalSettingsState a(ServiceBookingAdditionalSettingsState serviceBookingAdditionalSettingsState, ServiceBookingAdditionalSettingsContent serviceBookingAdditionalSettingsContent, String str, ElementsShow elementsShow, int i12) {
        boolean z12 = (i12 & 1) != 0 ? serviceBookingAdditionalSettingsState.f274991b : false;
        if ((i12 & 2) != 0) {
            serviceBookingAdditionalSettingsContent = serviceBookingAdditionalSettingsState.f274992c;
        }
        ServiceBookingAdditionalSettingsContent serviceBookingAdditionalSettingsContent2 = serviceBookingAdditionalSettingsContent;
        if ((i12 & 4) != 0) {
            str = serviceBookingAdditionalSettingsState.f274993d;
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            elementsShow = serviceBookingAdditionalSettingsState.f274994e;
        }
        BookingToggleToast bookingToggleToast = serviceBookingAdditionalSettingsState.f274995f;
        serviceBookingAdditionalSettingsState.getClass();
        return new ServiceBookingAdditionalSettingsState(z12, serviceBookingAdditionalSettingsContent2, str2, elementsShow, bookingToggleToast);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingAdditionalSettingsState)) {
            return false;
        }
        ServiceBookingAdditionalSettingsState serviceBookingAdditionalSettingsState = (ServiceBookingAdditionalSettingsState) obj;
        return this.f274991b == serviceBookingAdditionalSettingsState.f274991b && L.f(this.f274992c, serviceBookingAdditionalSettingsState.f274992c) && L.f(this.f274993d, serviceBookingAdditionalSettingsState.f274993d) && L.f(this.f274994e, serviceBookingAdditionalSettingsState.f274994e) && L.f(this.f274995f, serviceBookingAdditionalSettingsState.f274995f);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f274991b) * 31;
        ServiceBookingAdditionalSettingsContent serviceBookingAdditionalSettingsContent = this.f274992c;
        int iHashCode2 = (iHashCode + (serviceBookingAdditionalSettingsContent == null ? 0 : serviceBookingAdditionalSettingsContent.hashCode())) * 31;
        String str = this.f274993d;
        int iHashCode3 = (this.f274994e.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        BookingToggleToast bookingToggleToast = this.f274995f;
        return iHashCode3 + (bookingToggleToast != null ? bookingToggleToast.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ServiceBookingAdditionalSettingsState(isLoading=" + this.f274991b + ", screenContent=" + this.f274992c + ", error=" + this.f274993d + ", showElements=" + this.f274994e + ", bookingToggleToast=" + this.f274995f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f274991b ? 1 : 0);
        ServiceBookingAdditionalSettingsContent serviceBookingAdditionalSettingsContent = this.f274992c;
        if (serviceBookingAdditionalSettingsContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceBookingAdditionalSettingsContent.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f274993d);
        this.f274994e.writeToParcel(parcel, i12);
        BookingToggleToast bookingToggleToast = this.f274995f;
        if (bookingToggleToast == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bookingToggleToast.writeToParcel(parcel, i12);
        }
    }
}
