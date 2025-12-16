package com.avito.android.short_term_rent.bookingform.domain.models.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.short_term_rent.bookingform.items.toggle_v2.ToggleV2Options;
import com.avito.android.short_term_rent.view.components.retro_badges.entity.RetroBadgeItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormBlockItem.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem;", "Landroid/os/Parcelable;", "Badge", "Button", "DottedText", "InfoBanner", "Input", "ItemPreview", "LoanTerms", "PaymentMethods", "RefundToggle", "RetroBadges", "Select", "Spacing", "Text", "Toggle", "ToggleV2", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$Badge;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$Button;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$DottedText;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$InfoBanner;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$Input;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$ItemPreview;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$LoanTerms;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$PaymentMethods;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$RefundToggle;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$RetroBadges;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$Select;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$Spacing;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$Text;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$Toggle;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$ToggleV2;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface BookingFormBlockItem extends Parcelable {

    /* compiled from: BookingFormBlockItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$Badge;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Badge implements BookingFormBlockItem {

        @k
        public static final Parcelable.Creator<Badge> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f281360b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AttributedText f281361c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final UniversalImage f281362d;

        /* compiled from: BookingFormBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Badge> {
            @Override // android.os.Parcelable.Creator
            public final Badge createFromParcel(Parcel parcel) {
                return new Badge(parcel.readString(), (AttributedText) parcel.readParcelable(Badge.class.getClassLoader()), (UniversalImage) parcel.readParcelable(Badge.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Badge[] newArray(int i12) {
                return new Badge[i12];
            }
        }

        public Badge(@k String str, @k AttributedText attributedText, @l UniversalImage universalImage) {
            this.f281360b = str;
            this.f281361c = attributedText;
            this.f281362d = universalImage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f281360b);
            parcel.writeParcelable(this.f281361c, i12);
            parcel.writeParcelable(this.f281362d, i12);
        }
    }

    /* compiled from: BookingFormBlockItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$Button;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements BookingFormBlockItem {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f281363b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f281364c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f281365d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final ParametrizedEvent f281366e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final ParametrizedEvent f281367f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final DeepLink f281368g;

        /* compiled from: BookingFormBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button(parcel.readString(), parcel.readString(), parcel.readString(), (ParametrizedEvent) parcel.readParcelable(Button.class.getClassLoader()), (ParametrizedEvent) parcel.readParcelable(Button.class.getClassLoader()), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@k String str, @k String str2, @l String str3, @l ParametrizedEvent parametrizedEvent, @l ParametrizedEvent parametrizedEvent2, @l DeepLink deepLink) {
            this.f281363b = str;
            this.f281364c = str2;
            this.f281365d = str3;
            this.f281366e = parametrizedEvent;
            this.f281367f = parametrizedEvent2;
            this.f281368g = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return L.f(this.f281363b, button.f281363b) && L.f(this.f281364c, button.f281364c) && L.f(this.f281365d, button.f281365d) && L.f(this.f281366e, button.f281366e) && L.f(this.f281367f, button.f281367f) && L.f(this.f281368g, button.f281368g);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f281363b.hashCode() * 31, 31, this.f281364c);
            String str = this.f281365d;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            ParametrizedEvent parametrizedEvent = this.f281366e;
            int iHashCode2 = (iHashCode + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
            ParametrizedEvent parametrizedEvent2 = this.f281367f;
            int iHashCode3 = (iHashCode2 + (parametrizedEvent2 == null ? 0 : parametrizedEvent2.hashCode())) * 31;
            DeepLink deepLink = this.f281368g;
            return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(id=");
            sb2.append(this.f281363b);
            sb2.append(", title=");
            sb2.append(this.f281364c);
            sb2.append(", style=");
            sb2.append(this.f281365d);
            sb2.append(", onShow=");
            sb2.append(this.f281366e);
            sb2.append(", onClick=");
            sb2.append(this.f281367f);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f281368g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f281363b);
            parcel.writeString(this.f281364c);
            parcel.writeString(this.f281365d);
            parcel.writeParcelable(this.f281366e, i12);
            parcel.writeParcelable(this.f281367f, i12);
            parcel.writeParcelable(this.f281368g, i12);
        }
    }

    /* compiled from: BookingFormBlockItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$DottedText;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DottedText implements BookingFormBlockItem {

        @k
        public static final Parcelable.Creator<DottedText> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f281369b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AttributedText f281370c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final AttributedText f281371d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final DeepLink f281372e;

        /* compiled from: BookingFormBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DottedText> {
            @Override // android.os.Parcelable.Creator
            public final DottedText createFromParcel(Parcel parcel) {
                return new DottedText((DeepLink) parcel.readParcelable(DottedText.class.getClassLoader()), parcel.readString(), (AttributedText) parcel.readParcelable(DottedText.class.getClassLoader()), (AttributedText) parcel.readParcelable(DottedText.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final DottedText[] newArray(int i12) {
                return new DottedText[i12];
            }
        }

        public DottedText(@l DeepLink deepLink, @k String str, @k AttributedText attributedText, @k AttributedText attributedText2) {
            this.f281369b = str;
            this.f281370c = attributedText;
            this.f281371d = attributedText2;
            this.f281372e = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f281369b);
            parcel.writeParcelable(this.f281370c, i12);
            parcel.writeParcelable(this.f281371d, i12);
            parcel.writeParcelable(this.f281372e, i12);
        }
    }

    /* compiled from: BookingFormBlockItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$InfoBanner;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InfoBanner implements BookingFormBlockItem {

        @k
        public static final Parcelable.Creator<InfoBanner> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f281373b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AttributedText f281374c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final UniversalImage f281375d;

        /* compiled from: BookingFormBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<InfoBanner> {
            @Override // android.os.Parcelable.Creator
            public final InfoBanner createFromParcel(Parcel parcel) {
                return new InfoBanner(parcel.readString(), (AttributedText) parcel.readParcelable(InfoBanner.class.getClassLoader()), (UniversalImage) parcel.readParcelable(InfoBanner.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final InfoBanner[] newArray(int i12) {
                return new InfoBanner[i12];
            }
        }

        public InfoBanner(@k String str, @k AttributedText attributedText, @l UniversalImage universalImage) {
            this.f281373b = str;
            this.f281374c = attributedText;
            this.f281375d = universalImage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoBanner)) {
                return false;
            }
            InfoBanner infoBanner = (InfoBanner) obj;
            return L.f(this.f281373b, infoBanner.f281373b) && L.f(this.f281374c, infoBanner.f281374c) && L.f(this.f281375d, infoBanner.f281375d);
        }

        public final int hashCode() {
            int iB2 = com.avito.android.actions_sheet.a.b(this.f281373b.hashCode() * 31, 31, this.f281374c);
            UniversalImage universalImage = this.f281375d;
            return iB2 + (universalImage == null ? 0 : universalImage.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InfoBanner(id=");
            sb2.append(this.f281373b);
            sb2.append(", text=");
            sb2.append(this.f281374c);
            sb2.append(", image=");
            return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f281375d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f281373b);
            parcel.writeParcelable(this.f281374c, i12);
            parcel.writeParcelable(this.f281375d, i12);
        }
    }

    /* compiled from: BookingFormBlockItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$Input;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Input implements BookingFormBlockItem {

        @k
        public static final Parcelable.Creator<Input> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f281376b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f281377c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f281378d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f281379e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f281380f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final Integer f281381g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final Integer f281382h;

        /* compiled from: BookingFormBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Input> {
            @Override // android.os.Parcelable.Creator
            public final Input createFromParcel(Parcel parcel) {
                return new Input(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Input[] newArray(int i12) {
                return new Input[i12];
            }
        }

        public Input(@k String str, @l String str2, @l String str3, @k String str4, boolean z12, @l Integer num, @l Integer num2) {
            this.f281376b = str;
            this.f281377c = str2;
            this.f281378d = str3;
            this.f281379e = str4;
            this.f281380f = z12;
            this.f281381g = num;
            this.f281382h = num2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f281376b);
            parcel.writeString(this.f281377c);
            parcel.writeString(this.f281378d);
            parcel.writeString(this.f281379e);
            parcel.writeInt(this.f281380f ? 1 : 0);
            Integer num = this.f281381g;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Integer num2 = this.f281382h;
            if (num2 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num2);
            }
        }
    }

    /* compiled from: BookingFormBlockItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$ItemPreview;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ItemPreview implements BookingFormBlockItem {

        @k
        public static final Parcelable.Creator<ItemPreview> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f281383b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AttributedText f281384c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Image f281385d;

        /* compiled from: BookingFormBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ItemPreview> {
            @Override // android.os.Parcelable.Creator
            public final ItemPreview createFromParcel(Parcel parcel) {
                return new ItemPreview((Image) parcel.readParcelable(ItemPreview.class.getClassLoader()), parcel.readString(), (AttributedText) parcel.readParcelable(ItemPreview.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ItemPreview[] newArray(int i12) {
                return new ItemPreview[i12];
            }
        }

        public ItemPreview(@k Image image, @k String str, @k AttributedText attributedText) {
            this.f281383b = str;
            this.f281384c = attributedText;
            this.f281385d = image;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f281383b);
            parcel.writeParcelable(this.f281384c, i12);
            parcel.writeParcelable(this.f281385d, i12);
        }
    }

    /* compiled from: BookingFormBlockItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$LoanTerms;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoanTerms implements BookingFormBlockItem {

        @k
        public static final Parcelable.Creator<LoanTerms> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f281386b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f281387c;

        /* renamed from: d, reason: collision with root package name */
        public final long f281388d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ArrayList f281389e;

        /* compiled from: BookingFormBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LoanTerms> {
            @Override // android.os.Parcelable.Creator
            public final LoanTerms createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int iL2 = 0;
                boolean z12 = parcel.readInt() != 0;
                long j12 = parcel.readLong();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(LoanTerms.class, parcel, arrayList, iL2, 1);
                }
                return new LoanTerms(string, z12, j12, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final LoanTerms[] newArray(int i12) {
                return new LoanTerms[i12];
            }
        }

        public LoanTerms(@k String str, boolean z12, long j12, @k ArrayList arrayList) {
            this.f281386b = str;
            this.f281387c = z12;
            this.f281388d = j12;
            this.f281389e = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoanTerms)) {
                return false;
            }
            LoanTerms loanTerms = (LoanTerms) obj;
            return L.f(this.f281386b, loanTerms.f281386b) && this.f281387c == loanTerms.f281387c && this.f281388d == loanTerms.f281388d && this.f281389e.equals(loanTerms.f281389e);
        }

        public final int hashCode() {
            return this.f281389e.hashCode() + r.g(r.i(this.f281386b.hashCode() * 31, 31, this.f281387c), 31, this.f281388d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LoanTerms(id=");
            sb2.append(this.f281386b);
            sb2.append(", needFormReload=");
            sb2.append(this.f281387c);
            sb2.append(", default=");
            sb2.append(this.f281388d);
            sb2.append(", terms=");
            return e.p(sb2, this.f281389e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f281386b);
            parcel.writeInt(this.f281387c ? 1 : 0);
            parcel.writeLong(this.f281388d);
            Iterator itZ = com.avito.android.actions_sheet.a.z(this.f281389e, parcel);
            while (itZ.hasNext()) {
                parcel.writeParcelable((Parcelable) itZ.next(), i12);
            }
        }
    }

    /* compiled from: BookingFormBlockItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$PaymentMethods;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PaymentMethods implements BookingFormBlockItem {

        @k
        public static final Parcelable.Creator<PaymentMethods> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f281390b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f281391c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f281392d;

        /* compiled from: BookingFormBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PaymentMethods> {
            @Override // android.os.Parcelable.Creator
            public final PaymentMethods createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(PaymentMethods.class, parcel, arrayList, iL2, 1);
                }
                return new PaymentMethods(string, arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final PaymentMethods[] newArray(int i12) {
                return new PaymentMethods[i12];
            }
        }

        public PaymentMethods(@k String str, @k ArrayList arrayList, boolean z12) {
            this.f281390b = str;
            this.f281391c = arrayList;
            this.f281392d = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentMethods)) {
                return false;
            }
            PaymentMethods paymentMethods = (PaymentMethods) obj;
            return L.f(this.f281390b, paymentMethods.f281390b) && this.f281391c.equals(paymentMethods.f281391c) && this.f281392d == paymentMethods.f281392d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f281392d) + e.g(this.f281391c, this.f281390b.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PaymentMethods(id=");
            sb2.append(this.f281390b);
            sb2.append(", methods=");
            sb2.append(this.f281391c);
            sb2.append(", needFormReload=");
            return r.x(sb2, this.f281392d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f281390b);
            Iterator itZ = com.avito.android.actions_sheet.a.z(this.f281391c, parcel);
            while (itZ.hasNext()) {
                parcel.writeParcelable((Parcelable) itZ.next(), i12);
            }
            parcel.writeInt(this.f281392d ? 1 : 0);
        }
    }

    /* compiled from: BookingFormBlockItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$RefundToggle;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem;", "RefundToggleButton", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class RefundToggle implements BookingFormBlockItem {

        @k
        public static final Parcelable.Creator<RefundToggle> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f281393b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f281394c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f281395d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ArrayList f281396e;

        /* compiled from: BookingFormBlockItem.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$RefundToggle$RefundToggleButton;", "Landroid/os/Parcelable;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RefundToggleButton implements Parcelable {

            @k
            public static final Parcelable.Creator<RefundToggleButton> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f281397b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f281398c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final String f281399d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final String f281400e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final String f281401f;

            /* renamed from: g, reason: collision with root package name */
            @k
            public final DeepLink f281402g;

            /* compiled from: BookingFormBlockItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RefundToggleButton> {
                @Override // android.os.Parcelable.Creator
                public final RefundToggleButton createFromParcel(Parcel parcel) {
                    return new RefundToggleButton(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(RefundToggleButton.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final RefundToggleButton[] newArray(int i12) {
                    return new RefundToggleButton[i12];
                }
            }

            public RefundToggleButton(@k String str, @k String str2, @l String str3, @l String str4, @k String str5, @k DeepLink deepLink) {
                this.f281397b = str;
                this.f281398c = str2;
                this.f281399d = str3;
                this.f281400e = str4;
                this.f281401f = str5;
                this.f281402g = deepLink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RefundToggleButton)) {
                    return false;
                }
                RefundToggleButton refundToggleButton = (RefundToggleButton) obj;
                return L.f(this.f281397b, refundToggleButton.f281397b) && L.f(this.f281398c, refundToggleButton.f281398c) && L.f(this.f281399d, refundToggleButton.f281399d) && L.f(this.f281400e, refundToggleButton.f281400e) && L.f(this.f281401f, refundToggleButton.f281401f) && L.f(this.f281402g, refundToggleButton.f281402g);
            }

            public final int hashCode() {
                int iD2 = H.d(this.f281397b.hashCode() * 31, 31, this.f281398c);
                String str = this.f281399d;
                int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f281400e;
                return this.f281402g.hashCode() + H.d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f281401f);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("RefundToggleButton(id=");
                sb2.append(this.f281397b);
                sb2.append(", text=");
                sb2.append(this.f281398c);
                sb2.append(", priceWithDiscount=");
                sb2.append(this.f281399d);
                sb2.append(", discount=");
                sb2.append(this.f281400e);
                sb2.append(", totalPrice=");
                sb2.append(this.f281401f);
                sb2.append(", tooltip=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f281402g, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f281397b);
                parcel.writeString(this.f281398c);
                parcel.writeString(this.f281399d);
                parcel.writeString(this.f281400e);
                parcel.writeString(this.f281401f);
                parcel.writeParcelable(this.f281402g, i12);
            }
        }

        /* compiled from: BookingFormBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RefundToggle> {
            @Override // android.os.Parcelable.Creator
            public final RefundToggle createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                int iC2 = 0;
                boolean z12 = parcel.readInt() != 0;
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(RefundToggleButton.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new RefundToggle(string, string2, arrayList, z12);
            }

            @Override // android.os.Parcelable.Creator
            public final RefundToggle[] newArray(int i12) {
                return new RefundToggle[i12];
            }
        }

        public RefundToggle(@k String str, @k String str2, @k ArrayList arrayList, boolean z12) {
            this.f281393b = str;
            this.f281394c = str2;
            this.f281395d = z12;
            this.f281396e = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f281393b);
            parcel.writeString(this.f281394c);
            parcel.writeInt(this.f281395d ? 1 : 0);
            Iterator itZ = com.avito.android.actions_sheet.a.z(this.f281396e, parcel);
            while (itZ.hasNext()) {
                ((RefundToggleButton) itZ.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: BookingFormBlockItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$RetroBadges;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RetroBadges implements BookingFormBlockItem {

        @k
        public static final Parcelable.Creator<RetroBadges> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f281403b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<List<RetroBadgeItem>> f281404c;

        /* compiled from: BookingFormBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RetroBadges> {
            @Override // android.os.Parcelable.Creator
            public final RetroBadges createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    int i14 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i14);
                    for (int i15 = 0; i15 != i14; i15++) {
                        arrayList2.add(parcel.readInt() == 0 ? null : RetroBadgeItem.CREATOR.createFromParcel(parcel));
                    }
                    arrayList.add(arrayList2);
                }
                return new RetroBadges(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final RetroBadges[] newArray(int i12) {
                return new RetroBadges[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RetroBadges(@k String str, @k List<? extends List<RetroBadgeItem>> list) {
            this.f281403b = str;
            this.f281404c = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RetroBadges)) {
                return false;
            }
            RetroBadges retroBadges = (RetroBadges) obj;
            return L.f(this.f281403b, retroBadges.f281403b) && L.f(this.f281404c, retroBadges.f281404c);
        }

        public final int hashCode() {
            return this.f281404c.hashCode() + (this.f281403b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RetroBadges(id=");
            sb2.append(this.f281403b);
            sb2.append(", badges=");
            return H.p(sb2, this.f281404c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f281403b);
            Iterator itJ = C0.j(this.f281404c, parcel);
            while (itJ.hasNext()) {
                Iterator itJ2 = C0.j((List) itJ.next(), parcel);
                while (itJ2.hasNext()) {
                    RetroBadgeItem retroBadgeItem = (RetroBadgeItem) itJ2.next();
                    if (retroBadgeItem == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        retroBadgeItem.writeToParcel(parcel, i12);
                    }
                }
            }
        }
    }

    /* compiled from: BookingFormBlockItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$Select;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Select implements BookingFormBlockItem {

        @k
        public static final Parcelable.Creator<Select> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f281405b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f281406c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f281407d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f281408e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final DeepLink f281409f;

        /* compiled from: BookingFormBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Select> {
            @Override // android.os.Parcelable.Creator
            public final Select createFromParcel(Parcel parcel) {
                return new Select((DeepLink) parcel.readParcelable(Select.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Select[] newArray(int i12) {
                return new Select[i12];
            }
        }

        public Select(@k DeepLink deepLink, @k String str, @l String str2, @l String str3, boolean z12) {
            this.f281405b = str;
            this.f281406c = str2;
            this.f281407d = str3;
            this.f281408e = z12;
            this.f281409f = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f281405b);
            parcel.writeString(this.f281406c);
            parcel.writeString(this.f281407d);
            parcel.writeInt(this.f281408e ? 1 : 0);
            parcel.writeParcelable(this.f281409f, i12);
        }
    }

    /* compiled from: BookingFormBlockItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$Spacing;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Spacing implements BookingFormBlockItem {

        @k
        public static final Parcelable.Creator<Spacing> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f281410b;

        /* renamed from: c, reason: collision with root package name */
        public final int f281411c;

        /* compiled from: BookingFormBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Spacing> {
            @Override // android.os.Parcelable.Creator
            public final Spacing createFromParcel(Parcel parcel) {
                return new Spacing(parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Spacing[] newArray(int i12) {
                return new Spacing[i12];
            }
        }

        public Spacing(@k String str, int i12) {
            this.f281410b = str;
            this.f281411c = i12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f281410b);
            parcel.writeInt(this.f281411c);
        }
    }

    /* compiled from: BookingFormBlockItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$Text;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Text implements BookingFormBlockItem {

        @k
        public static final Parcelable.Creator<Text> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f281412b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AttributedText f281413c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final DeepLink f281414d;

        /* compiled from: BookingFormBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Text> {
            @Override // android.os.Parcelable.Creator
            public final Text createFromParcel(Parcel parcel) {
                return new Text((DeepLink) parcel.readParcelable(Text.class.getClassLoader()), parcel.readString(), (AttributedText) parcel.readParcelable(Text.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Text[] newArray(int i12) {
                return new Text[i12];
            }
        }

        public Text(@l DeepLink deepLink, @k String str, @k AttributedText attributedText) {
            this.f281412b = str;
            this.f281413c = attributedText;
            this.f281414d = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f281412b);
            parcel.writeParcelable(this.f281413c, i12);
            parcel.writeParcelable(this.f281414d, i12);
        }
    }

    /* compiled from: BookingFormBlockItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$Toggle;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem;", "ToggleOption", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Toggle implements BookingFormBlockItem {

        @k
        public static final Parcelable.Creator<Toggle> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f281415b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f281416c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f281417d;

        /* renamed from: e, reason: collision with root package name */
        public final int f281418e;

        /* compiled from: BookingFormBlockItem.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$Toggle$ToggleOption;", "Landroid/os/Parcelable;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ToggleOption implements Parcelable {

            @k
            public static final Parcelable.Creator<ToggleOption> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f281419b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f281420c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f281421d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final String f281422e;

            /* renamed from: f, reason: collision with root package name */
            @l
            public final Long f281423f;

            /* compiled from: BookingFormBlockItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ToggleOption> {
                @Override // android.os.Parcelable.Creator
                public final ToggleOption createFromParcel(Parcel parcel) {
                    return new ToggleOption(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
                }

                @Override // android.os.Parcelable.Creator
                public final ToggleOption[] newArray(int i12) {
                    return new ToggleOption[i12];
                }
            }

            public ToggleOption(@k String str, boolean z12, boolean z13, @k String str2, @l Long l12) {
                this.f281419b = str;
                this.f281420c = z12;
                this.f281421d = z13;
                this.f281422e = str2;
                this.f281423f = l12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ToggleOption)) {
                    return false;
                }
                ToggleOption toggleOption = (ToggleOption) obj;
                return L.f(this.f281419b, toggleOption.f281419b) && this.f281420c == toggleOption.f281420c && this.f281421d == toggleOption.f281421d && L.f(this.f281422e, toggleOption.f281422e) && L.f(this.f281423f, toggleOption.f281423f);
            }

            public final int hashCode() {
                int iD2 = H.d(r.i(r.i(this.f281419b.hashCode() * 31, 31, this.f281420c), 31, this.f281421d), 31, this.f281422e);
                Long l12 = this.f281423f;
                return iD2 + (l12 == null ? 0 : l12.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ToggleOption(id=");
                sb2.append(this.f281419b);
                sb2.append(", isEnabled=");
                sb2.append(this.f281420c);
                sb2.append(", isSelected=");
                sb2.append(this.f281421d);
                sb2.append(", text=");
                sb2.append(this.f281422e);
                sb2.append(", value=");
                return m.m(sb2, this.f281423f, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f281419b);
                parcel.writeInt(this.f281420c ? 1 : 0);
                parcel.writeInt(this.f281421d ? 1 : 0);
                parcel.writeString(this.f281422e);
                Long l12 = this.f281423f;
                if (l12 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.m(parcel, 1, l12);
                }
            }
        }

        /* compiled from: BookingFormBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Toggle> {
            @Override // android.os.Parcelable.Creator
            public final Toggle createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int iC2 = 0;
                boolean z12 = parcel.readInt() != 0;
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(ToggleOption.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new Toggle(string, z12, arrayList, parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Toggle[] newArray(int i12) {
                return new Toggle[i12];
            }
        }

        public Toggle(@k String str, boolean z12, @k ArrayList arrayList, int i12) {
            this.f281415b = str;
            this.f281416c = z12;
            this.f281417d = arrayList;
            this.f281418e = i12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f281415b);
            parcel.writeInt(this.f281416c ? 1 : 0);
            Iterator itZ = com.avito.android.actions_sheet.a.z(this.f281417d, parcel);
            while (itZ.hasNext()) {
                ((ToggleOption) itZ.next()).writeToParcel(parcel, i12);
            }
            parcel.writeInt(this.f281418e);
        }
    }

    /* compiled from: BookingFormBlockItem.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem$ToggleV2;", "Lcom/avito/android/short_term_rent/bookingform/domain/models/items/BookingFormBlockItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToggleV2 implements BookingFormBlockItem {

        @k
        public static final Parcelable.Creator<ToggleV2> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f281424b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f281425c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f281426d;

        /* compiled from: BookingFormBlockItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ToggleV2> {
            @Override // android.os.Parcelable.Creator
            public final ToggleV2 createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(ToggleV2Options.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new ToggleV2(string, arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ToggleV2[] newArray(int i12) {
                return new ToggleV2[i12];
            }
        }

        public ToggleV2(@k String str, @k ArrayList arrayList, boolean z12) {
            this.f281424b = str;
            this.f281425c = arrayList;
            this.f281426d = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ToggleV2)) {
                return false;
            }
            ToggleV2 toggleV2 = (ToggleV2) obj;
            return L.f(this.f281424b, toggleV2.f281424b) && this.f281425c.equals(toggleV2.f281425c) && this.f281426d == toggleV2.f281426d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f281426d) + e.g(this.f281425c, this.f281424b.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ToggleV2(id=");
            sb2.append(this.f281424b);
            sb2.append(", options=");
            sb2.append(this.f281425c);
            sb2.append(", needFormReload=");
            return r.x(sb2, this.f281426d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f281424b);
            Iterator itZ = com.avito.android.actions_sheet.a.z(this.f281425c, parcel);
            while (itZ.hasNext()) {
                ((ToggleV2Options) itZ.next()).writeToParcel(parcel, i12);
            }
            parcel.writeInt(this.f281426d ? 1 : 0);
        }
    }
}
