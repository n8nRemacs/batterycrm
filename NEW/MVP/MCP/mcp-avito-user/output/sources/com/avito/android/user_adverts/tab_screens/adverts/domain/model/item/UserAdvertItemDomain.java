package com.avito.android.user_adverts.tab_screens.adverts.domain.model.item;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.media3.exoplayer.analytics.m;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.authorization.auto_recovery.phone_confirm.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertItemDomain.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u0016\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain;", "Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertsBaseItemDomain;", "ActionButton", "AddressesAdditionalInfo", "AdvertImage", "ContactsBbl", "CpxPromoWidget", "FashionBadge", "LinkedAdvertisementsInfo", "LiquidityStatus", "PriceBadge", "RealtyLeadgen", "RealtyOwnerBadge", "RightAction", "SearchPosition", "ServiceIcon", "Space", "Stats", "Status", "TimeToLive", "Tip", "VacancyRostrud", "VerificationStatus", "Video", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserAdvertItemDomain implements UserAdvertsBaseItemDomain {

    @k
    public static final Parcelable.Creator<UserAdvertItemDomain> CREATOR = new a();

    /* renamed from: A, reason: collision with root package name */
    @l
    public final List<String> f315015A;

    /* renamed from: B, reason: collision with root package name */
    @l
    public final String f315016B;

    /* renamed from: C, reason: collision with root package name */
    @l
    public final DeepLink f315017C;

    /* renamed from: D, reason: collision with root package name */
    @l
    public final String f315018D;

    /* renamed from: E, reason: collision with root package name */
    @l
    public final String f315019E;

    /* renamed from: F, reason: collision with root package name */
    @l
    public final String f315020F;

    /* renamed from: G, reason: collision with root package name */
    @l
    public final AddressesAdditionalInfo f315021G;

    /* renamed from: H, reason: collision with root package name */
    @l
    public final ContactsBbl f315022H;

    /* renamed from: I, reason: collision with root package name */
    @l
    public final VacancyRostrud f315023I;

    /* renamed from: J, reason: collision with root package name */
    @l
    public final LinkedAdvertisementsInfo f315024J;

    /* renamed from: K, reason: collision with root package name */
    @l
    public final ActionButton f315025K;

    /* renamed from: L, reason: collision with root package name */
    @l
    public final SearchPosition f315026L;

    /* renamed from: M, reason: collision with root package name */
    @l
    public final RightAction f315027M;

    /* renamed from: N, reason: collision with root package name */
    @l
    public final Space f315028N;

    /* renamed from: O, reason: collision with root package name */
    @l
    public final CpxPromoWidget f315029O;

    /* renamed from: P, reason: collision with root package name */
    @k
    public final String f315030P;

    /* renamed from: b, reason: collision with root package name */
    public final long f315031b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f315032c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AdvertImage f315033d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Video f315034e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f315035f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f315036g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f315037h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Stats f315038i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Tip f315039j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final ArrayList f315040k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final TimeToLive f315041l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final String f315042m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f315043n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final RealtyLeadgen f315044o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f315045p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final DeepLink f315046q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public final Boolean f315047r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public final Status f315048s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public final String f315049t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public final PriceBadge f315050u;

    /* renamed from: v, reason: collision with root package name */
    @l
    public final RealtyOwnerBadge f315051v;

    /* renamed from: w, reason: collision with root package name */
    @l
    public final FashionBadge f315052w;

    /* renamed from: x, reason: collision with root package name */
    @l
    public final Boolean f315053x;

    /* renamed from: y, reason: collision with root package name */
    @l
    public final VerificationStatus f315054y;

    /* renamed from: z, reason: collision with root package name */
    @l
    public final LiquidityStatus f315055z;

    /* compiled from: UserAdvertItemDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$ActionButton;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ActionButton implements Parcelable {

        @k
        public static final Parcelable.Creator<ActionButton> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315056b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f315057c;

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ActionButton> {
            @Override // android.os.Parcelable.Creator
            public final ActionButton createFromParcel(Parcel parcel) {
                return new ActionButton(parcel.readString(), (DeepLink) parcel.readParcelable(ActionButton.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ActionButton[] newArray(int i12) {
                return new ActionButton[i12];
            }
        }

        public ActionButton(@k String str, @k DeepLink deepLink) {
            this.f315056b = str;
            this.f315057c = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionButton)) {
                return false;
            }
            ActionButton actionButton = (ActionButton) obj;
            return L.f(this.f315056b, actionButton.f315056b) && L.f(this.f315057c, actionButton.f315057c);
        }

        public final int hashCode() {
            return this.f315057c.hashCode() + (this.f315056b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActionButton(title=");
            sb2.append(this.f315056b);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f315057c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f315056b);
            parcel.writeParcelable(this.f315057c, i12);
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$AddressesAdditionalInfo;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddressesAdditionalInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<AddressesAdditionalInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315058b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f315059c;

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AddressesAdditionalInfo> {
            @Override // android.os.Parcelable.Creator
            public final AddressesAdditionalInfo createFromParcel(Parcel parcel) {
                return new AddressesAdditionalInfo(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AddressesAdditionalInfo[] newArray(int i12) {
                return new AddressesAdditionalInfo[i12];
            }
        }

        public AddressesAdditionalInfo(@k String str, @k String str2) {
            this.f315058b = str;
            this.f315059c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddressesAdditionalInfo)) {
                return false;
            }
            AddressesAdditionalInfo addressesAdditionalInfo = (AddressesAdditionalInfo) obj;
            return L.f(this.f315058b, addressesAdditionalInfo.f315058b) && L.f(this.f315059c, addressesAdditionalInfo.f315059c);
        }

        public final int hashCode() {
            return this.f315059c.hashCode() + (this.f315058b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddressesAdditionalInfo(delimiter=");
            sb2.append(this.f315058b);
            sb2.append(", content=");
            return C22026a.c(sb2, this.f315059c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f315058b);
            parcel.writeString(this.f315059c);
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$AdvertImage;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvertImage implements Parcelable {

        @k
        public static final Parcelable.Creator<AdvertImage> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f315060b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Image f315061c;

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AdvertImage> {
            @Override // android.os.Parcelable.Creator
            public final AdvertImage createFromParcel(Parcel parcel) {
                return new AdvertImage(parcel.readInt(), (Image) parcel.readParcelable(AdvertImage.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final AdvertImage[] newArray(int i12) {
                return new AdvertImage[i12];
            }
        }

        public AdvertImage(int i12, @k Image image) {
            this.f315060b = i12;
            this.f315061c = image;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdvertImage)) {
                return false;
            }
            AdvertImage advertImage = (AdvertImage) obj;
            return this.f315060b == advertImage.f315060b && L.f(this.f315061c, advertImage.f315061c);
        }

        public final int hashCode() {
            return this.f315061c.hashCode() + (Integer.hashCode(this.f315060b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdvertImage(count=");
            sb2.append(this.f315060b);
            sb2.append(", image=");
            return c.o(sb2, this.f315061c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f315060b);
            parcel.writeParcelable(this.f315061c, i12);
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$ContactsBbl;", "Landroid/os/Parcelable;", "Progressbar", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ContactsBbl implements Parcelable {

        @k
        public static final Parcelable.Creator<ContactsBbl> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315062b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f315063c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Progressbar f315064d;

        /* compiled from: UserAdvertItemDomain.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$ContactsBbl$Progressbar;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Progressbar implements Parcelable {

            @k
            public static final Parcelable.Creator<Progressbar> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final float f315065b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final UniversalColor f315066c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final UniversalColor f315067d;

            /* compiled from: UserAdvertItemDomain.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Progressbar> {
                @Override // android.os.Parcelable.Creator
                public final Progressbar createFromParcel(Parcel parcel) {
                    return new Progressbar(parcel.readFloat(), (UniversalColor) parcel.readParcelable(Progressbar.class.getClassLoader()), (UniversalColor) parcel.readParcelable(Progressbar.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Progressbar[] newArray(int i12) {
                    return new Progressbar[i12];
                }
            }

            public Progressbar(float f12, @k UniversalColor universalColor, @k UniversalColor universalColor2) {
                this.f315065b = f12;
                this.f315066c = universalColor;
                this.f315067d = universalColor2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Progressbar)) {
                    return false;
                }
                Progressbar progressbar = (Progressbar) obj;
                return Float.compare(this.f315065b, progressbar.f315065b) == 0 && L.f(this.f315066c, progressbar.f315066c) && L.f(this.f315067d, progressbar.f315067d);
            }

            public final int hashCode() {
                return this.f315067d.hashCode() + com.avito.android.actions_sheet.a.i(this.f315066c, Float.hashCode(this.f315065b) * 31, 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Progressbar(percentage=");
                sb2.append(this.f315065b);
                sb2.append(", color=");
                sb2.append(this.f315066c);
                sb2.append(", colorBackground=");
                return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f315067d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeFloat(this.f315065b);
                parcel.writeParcelable(this.f315066c, i12);
                parcel.writeParcelable(this.f315067d, i12);
            }
        }

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ContactsBbl> {
            @Override // android.os.Parcelable.Creator
            public final ContactsBbl createFromParcel(Parcel parcel) {
                return new ContactsBbl(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Progressbar.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ContactsBbl[] newArray(int i12) {
                return new ContactsBbl[i12];
            }
        }

        public ContactsBbl(@k String str, @l String str2, @l Progressbar progressbar) {
            this.f315062b = str;
            this.f315063c = str2;
            this.f315064d = progressbar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContactsBbl)) {
                return false;
            }
            ContactsBbl contactsBbl = (ContactsBbl) obj;
            return L.f(this.f315062b, contactsBbl.f315062b) && L.f(this.f315063c, contactsBbl.f315063c) && L.f(this.f315064d, contactsBbl.f315064d);
        }

        public final int hashCode() {
            int iHashCode = this.f315062b.hashCode() * 31;
            String str = this.f315063c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Progressbar progressbar = this.f315064d;
            return iHashCode2 + (progressbar != null ? progressbar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ContactsBbl(title=" + this.f315062b + ", titleColor=" + this.f315063c + ", progressbar=" + this.f315064d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f315062b);
            parcel.writeString(this.f315063c);
            Progressbar progressbar = this.f315064d;
            if (progressbar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                progressbar.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$CpxPromoWidget;", "Landroid/os/Parcelable;", "Color", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class CpxPromoWidget implements Parcelable {

        @k
        public static final Parcelable.Creator<CpxPromoWidget> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Color f315068b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Image f315069c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f315070d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final DeepLink f315071e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$CpxPromoWidget$Color;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Color {

            /* renamed from: b, reason: collision with root package name */
            public static final Color f315072b;

            /* renamed from: c, reason: collision with root package name */
            public static final Color f315073c;

            /* renamed from: d, reason: collision with root package name */
            public static final Color f315074d;

            /* renamed from: e, reason: collision with root package name */
            public static final Color f315075e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ Color[] f315076f;

            /* renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f315077g;

            static {
                Color color = new Color("GRAY", 0);
                f315072b = color;
                Color color2 = new Color("GREEN", 1);
                f315073c = color2;
                Color color3 = new Color("YELLOW", 2);
                f315074d = color3;
                Color color4 = new Color("RED", 3);
                f315075e = color4;
                Color[] colorArr = {color, color2, color3, color4};
                f315076f = colorArr;
                f315077g = kotlin.enums.c.a(colorArr);
            }

            public Color() {
                throw null;
            }

            public static Color valueOf(String str) {
                return (Color) Enum.valueOf(Color.class, str);
            }

            public static Color[] values() {
                return (Color[]) f315076f.clone();
            }
        }

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CpxPromoWidget> {
            @Override // android.os.Parcelable.Creator
            public final CpxPromoWidget createFromParcel(Parcel parcel) {
                return new CpxPromoWidget(Color.valueOf(parcel.readString()), (Image) parcel.readParcelable(CpxPromoWidget.class.getClassLoader()), parcel.readString(), (DeepLink) parcel.readParcelable(CpxPromoWidget.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final CpxPromoWidget[] newArray(int i12) {
                return new CpxPromoWidget[i12];
            }
        }

        public CpxPromoWidget(@k Color color, @k Image image, @k String str, @l DeepLink deepLink) {
            this.f315068b = color;
            this.f315069c = image;
            this.f315070d = str;
            this.f315071e = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CpxPromoWidget)) {
                return false;
            }
            CpxPromoWidget cpxPromoWidget = (CpxPromoWidget) obj;
            return this.f315068b == cpxPromoWidget.f315068b && L.f(this.f315069c, cpxPromoWidget.f315069c) && L.f(this.f315070d, cpxPromoWidget.f315070d) && L.f(this.f315071e, cpxPromoWidget.f315071e);
        }

        public final int hashCode() {
            int iD2 = H.d(com.avito.android.actions_sheet.a.g(this.f315069c, this.f315068b.hashCode() * 31, 31), 31, this.f315070d);
            DeepLink deepLink = this.f315071e;
            return iD2 + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CpxPromoWidget(color=");
            sb2.append(this.f315068b);
            sb2.append(", icon=");
            sb2.append(this.f315069c);
            sb2.append(", text=");
            sb2.append(this.f315070d);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f315071e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f315068b.name());
            parcel.writeParcelable(this.f315069c, i12);
            parcel.writeString(this.f315070d);
            parcel.writeParcelable(this.f315071e, i12);
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$FashionBadge;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FashionBadge implements Parcelable {

        @k
        public static final Parcelable.Creator<FashionBadge> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315078b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f315079c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f315080d;

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<FashionBadge> {
            @Override // android.os.Parcelable.Creator
            public final FashionBadge createFromParcel(Parcel parcel) {
                return new FashionBadge(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FashionBadge[] newArray(int i12) {
                return new FashionBadge[i12];
            }
        }

        public FashionBadge(@k String str, @k String str2, @k String str3) {
            this.f315078b = str;
            this.f315079c = str2;
            this.f315080d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FashionBadge)) {
                return false;
            }
            FashionBadge fashionBadge = (FashionBadge) obj;
            return L.f(this.f315078b, fashionBadge.f315078b) && L.f(this.f315079c, fashionBadge.f315079c) && L.f(this.f315080d, fashionBadge.f315080d);
        }

        public final int hashCode() {
            return this.f315080d.hashCode() + H.d(this.f315078b.hashCode() * 31, 31, this.f315079c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FashionBadge(text=");
            sb2.append(this.f315078b);
            sb2.append(", textColor=");
            sb2.append(this.f315079c);
            sb2.append(", backgroundColor=");
            return C22026a.c(sb2, this.f315080d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f315078b);
            parcel.writeString(this.f315079c);
            parcel.writeString(this.f315080d);
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$LinkedAdvertisementsInfo;", "Landroid/os/Parcelable;", "Onboarding", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class LinkedAdvertisementsInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<LinkedAdvertisementsInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315081b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f315082c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final DeepLink f315083d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Onboarding f315084e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final DeepLink f315085f;

        /* compiled from: UserAdvertItemDomain.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$LinkedAdvertisementsInfo$Onboarding;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Onboarding implements Parcelable {

            @k
            public static final Parcelable.Creator<Onboarding> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f315086b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f315087c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final DeepLink f315088d;

            /* compiled from: UserAdvertItemDomain.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Onboarding> {
                @Override // android.os.Parcelable.Creator
                public final Onboarding createFromParcel(Parcel parcel) {
                    return new Onboarding(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(Onboarding.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Onboarding[] newArray(int i12) {
                    return new Onboarding[i12];
                }
            }

            public Onboarding(@k String str, @k String str2, @k DeepLink deepLink) {
                this.f315086b = str;
                this.f315087c = str2;
                this.f315088d = deepLink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Onboarding)) {
                    return false;
                }
                Onboarding onboarding = (Onboarding) obj;
                return L.f(this.f315086b, onboarding.f315086b) && L.f(this.f315087c, onboarding.f315087c) && L.f(this.f315088d, onboarding.f315088d);
            }

            public final int hashCode() {
                return this.f315088d.hashCode() + H.d(this.f315086b.hashCode() * 31, 31, this.f315087c);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Onboarding(title=");
                sb2.append(this.f315086b);
                sb2.append(", subtitle=");
                sb2.append(this.f315087c);
                sb2.append(", deepLink=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f315088d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f315086b);
                parcel.writeString(this.f315087c);
                parcel.writeParcelable(this.f315088d, i12);
            }
        }

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LinkedAdvertisementsInfo> {
            @Override // android.os.Parcelable.Creator
            public final LinkedAdvertisementsInfo createFromParcel(Parcel parcel) {
                return new LinkedAdvertisementsInfo(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(LinkedAdvertisementsInfo.class.getClassLoader()), parcel.readInt() == 0 ? null : Onboarding.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(LinkedAdvertisementsInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final LinkedAdvertisementsInfo[] newArray(int i12) {
                return new LinkedAdvertisementsInfo[i12];
            }
        }

        public LinkedAdvertisementsInfo(@k String str, @k String str2, @k DeepLink deepLink, @l Onboarding onboarding, @l DeepLink deepLink2) {
            this.f315081b = str;
            this.f315082c = str2;
            this.f315083d = deepLink;
            this.f315084e = onboarding;
            this.f315085f = deepLink2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkedAdvertisementsInfo)) {
                return false;
            }
            LinkedAdvertisementsInfo linkedAdvertisementsInfo = (LinkedAdvertisementsInfo) obj;
            return L.f(this.f315081b, linkedAdvertisementsInfo.f315081b) && L.f(this.f315082c, linkedAdvertisementsInfo.f315082c) && L.f(this.f315083d, linkedAdvertisementsInfo.f315083d) && L.f(this.f315084e, linkedAdvertisementsInfo.f315084e) && L.f(this.f315085f, linkedAdvertisementsInfo.f315085f);
        }

        public final int hashCode() {
            int iE2 = com.avito.android.actions_sheet.a.e(this.f315083d, H.d(this.f315081b.hashCode() * 31, 31, this.f315082c), 31);
            Onboarding onboarding = this.f315084e;
            int iHashCode = (iE2 + (onboarding == null ? 0 : onboarding.hashCode())) * 31;
            DeepLink deepLink = this.f315085f;
            return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LinkedAdvertisementsInfo(title=");
            sb2.append(this.f315081b);
            sb2.append(", count=");
            sb2.append(this.f315082c);
            sb2.append(", deeplink=");
            sb2.append(this.f315083d);
            sb2.append(", onboarding=");
            sb2.append(this.f315084e);
            sb2.append(", copyDeeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f315085f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f315081b);
            parcel.writeString(this.f315082c);
            parcel.writeParcelable(this.f315083d, i12);
            Onboarding onboarding = this.f315084e;
            if (onboarding == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                onboarding.writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.f315085f, i12);
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$LiquidityStatus;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LiquidityStatus implements Parcelable {

        @k
        public static final Parcelable.Creator<LiquidityStatus> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315089b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f315090c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final DeepLink f315091d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Long f315092e;

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LiquidityStatus> {
            @Override // android.os.Parcelable.Creator
            public final LiquidityStatus createFromParcel(Parcel parcel) {
                return new LiquidityStatus(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(LiquidityStatus.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            public final LiquidityStatus[] newArray(int i12) {
                return new LiquidityStatus[i12];
            }
        }

        public LiquidityStatus(@k String str, @l String str2, @l DeepLink deepLink, @l Long l12) {
            this.f315089b = str;
            this.f315090c = str2;
            this.f315091d = deepLink;
            this.f315092e = l12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LiquidityStatus)) {
                return false;
            }
            LiquidityStatus liquidityStatus = (LiquidityStatus) obj;
            return L.f(this.f315089b, liquidityStatus.f315089b) && L.f(this.f315090c, liquidityStatus.f315090c) && L.f(this.f315091d, liquidityStatus.f315091d) && L.f(this.f315092e, liquidityStatus.f315092e);
        }

        public final int hashCode() {
            int iHashCode = this.f315089b.hashCode() * 31;
            String str = this.f315090c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            DeepLink deepLink = this.f315091d;
            int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            Long l12 = this.f315092e;
            return iHashCode3 + (l12 != null ? l12.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LiquidityStatus(statusText=");
            sb2.append(this.f315089b);
            sb2.append(", statusTextColor=");
            sb2.append(this.f315090c);
            sb2.append(", deeplink=");
            sb2.append(this.f315091d);
            sb2.append(", finishTime=");
            return m.m(sb2, this.f315092e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f315089b);
            parcel.writeString(this.f315090c);
            parcel.writeParcelable(this.f315091d, i12);
            Long l12 = this.f315092e;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$PriceBadge;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PriceBadge implements Parcelable {

        @k
        public static final Parcelable.Creator<PriceBadge> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315093b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final UniversalColor f315094c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final UniversalColor f315095d;

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PriceBadge> {
            @Override // android.os.Parcelable.Creator
            public final PriceBadge createFromParcel(Parcel parcel) {
                return new PriceBadge(parcel.readString(), (UniversalColor) parcel.readParcelable(PriceBadge.class.getClassLoader()), (UniversalColor) parcel.readParcelable(PriceBadge.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final PriceBadge[] newArray(int i12) {
                return new PriceBadge[i12];
            }
        }

        public PriceBadge(@k String str, @l UniversalColor universalColor, @l UniversalColor universalColor2) {
            this.f315093b = str;
            this.f315094c = universalColor;
            this.f315095d = universalColor2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PriceBadge)) {
                return false;
            }
            PriceBadge priceBadge = (PriceBadge) obj;
            return L.f(this.f315093b, priceBadge.f315093b) && L.f(this.f315094c, priceBadge.f315094c) && L.f(this.f315095d, priceBadge.f315095d);
        }

        public final int hashCode() {
            int iHashCode = this.f315093b.hashCode() * 31;
            UniversalColor universalColor = this.f315094c;
            int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
            UniversalColor universalColor2 = this.f315095d;
            return iHashCode2 + (universalColor2 != null ? universalColor2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PriceBadge(title=");
            sb2.append(this.f315093b);
            sb2.append(", titleColor=");
            sb2.append(this.f315094c);
            sb2.append(", backgroundColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f315095d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f315093b);
            parcel.writeParcelable(this.f315094c, i12);
            parcel.writeParcelable(this.f315095d, i12);
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$RealtyLeadgen;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RealtyLeadgen implements Parcelable {

        @k
        public static final Parcelable.Creator<RealtyLeadgen> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315096b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final UniversalColor f315097c;

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RealtyLeadgen> {
            @Override // android.os.Parcelable.Creator
            public final RealtyLeadgen createFromParcel(Parcel parcel) {
                return new RealtyLeadgen(parcel.readString(), (UniversalColor) parcel.readParcelable(RealtyLeadgen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final RealtyLeadgen[] newArray(int i12) {
                return new RealtyLeadgen[i12];
            }
        }

        public RealtyLeadgen(@k String str, @k UniversalColor universalColor) {
            this.f315096b = str;
            this.f315097c = universalColor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RealtyLeadgen)) {
                return false;
            }
            RealtyLeadgen realtyLeadgen = (RealtyLeadgen) obj;
            return L.f(this.f315096b, realtyLeadgen.f315096b) && L.f(this.f315097c, realtyLeadgen.f315097c);
        }

        public final int hashCode() {
            return this.f315097c.hashCode() + (this.f315096b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RealtyLeadgen(text=");
            sb2.append(this.f315096b);
            sb2.append(", textColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f315097c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f315096b);
            parcel.writeParcelable(this.f315097c, i12);
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$RealtyOwnerBadge;", "Landroid/os/Parcelable;", "Button", "Tooltip", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class RealtyOwnerBadge implements Parcelable {

        @k
        public static final Parcelable.Creator<RealtyOwnerBadge> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315098b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f315099c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f315100d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Tooltip f315101e;

        /* compiled from: UserAdvertItemDomain.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$RealtyOwnerBadge$Button;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Button implements Parcelable {

            @k
            public static final Parcelable.Creator<Button> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f315102b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final DeepLink f315103c;

            /* compiled from: UserAdvertItemDomain.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Button> {
                @Override // android.os.Parcelable.Creator
                public final Button createFromParcel(Parcel parcel) {
                    return new Button(parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Button[] newArray(int i12) {
                    return new Button[i12];
                }
            }

            public Button(@k String str, @l DeepLink deepLink) {
                this.f315102b = str;
                this.f315103c = deepLink;
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
                return L.f(this.f315102b, button.f315102b) && L.f(this.f315103c, button.f315103c);
            }

            public final int hashCode() {
                int iHashCode = this.f315102b.hashCode() * 31;
                DeepLink deepLink = this.f315103c;
                return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Button(text=");
                sb2.append(this.f315102b);
                sb2.append(", link=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f315103c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f315102b);
                parcel.writeParcelable(this.f315103c, i12);
            }
        }

        /* compiled from: UserAdvertItemDomain.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$RealtyOwnerBadge$Tooltip;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Tooltip implements Parcelable {

            @k
            public static final Parcelable.Creator<Tooltip> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f315104b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f315105c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final Button f315106d;

            /* compiled from: UserAdvertItemDomain.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Tooltip> {
                @Override // android.os.Parcelable.Creator
                public final Tooltip createFromParcel(Parcel parcel) {
                    return new Tooltip(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Tooltip[] newArray(int i12) {
                    return new Tooltip[i12];
                }
            }

            public Tooltip(@k String str, @k String str2, @l Button button) {
                this.f315104b = str;
                this.f315105c = str2;
                this.f315106d = button;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Tooltip)) {
                    return false;
                }
                Tooltip tooltip = (Tooltip) obj;
                return L.f(this.f315104b, tooltip.f315104b) && L.f(this.f315105c, tooltip.f315105c) && L.f(this.f315106d, tooltip.f315106d);
            }

            public final int hashCode() {
                int iD2 = H.d(this.f315104b.hashCode() * 31, 31, this.f315105c);
                Button button = this.f315106d;
                return iD2 + (button == null ? 0 : button.hashCode());
            }

            @k
            public final String toString() {
                return "Tooltip(title=" + this.f315104b + ", text=" + this.f315105c + ", button=" + this.f315106d + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f315104b);
                parcel.writeString(this.f315105c);
                Button button = this.f315106d;
                if (button == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    button.writeToParcel(parcel, i12);
                }
            }
        }

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RealtyOwnerBadge> {
            @Override // android.os.Parcelable.Creator
            public final RealtyOwnerBadge createFromParcel(Parcel parcel) {
                return new RealtyOwnerBadge(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Tooltip.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final RealtyOwnerBadge[] newArray(int i12) {
                return new RealtyOwnerBadge[i12];
            }
        }

        public RealtyOwnerBadge(@k String str, @k String str2, @l String str3, @l Tooltip tooltip) {
            this.f315098b = str;
            this.f315099c = str2;
            this.f315100d = str3;
            this.f315101e = tooltip;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RealtyOwnerBadge)) {
                return false;
            }
            RealtyOwnerBadge realtyOwnerBadge = (RealtyOwnerBadge) obj;
            return L.f(this.f315098b, realtyOwnerBadge.f315098b) && L.f(this.f315099c, realtyOwnerBadge.f315099c) && L.f(this.f315100d, realtyOwnerBadge.f315100d) && L.f(this.f315101e, realtyOwnerBadge.f315101e);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f315098b.hashCode() * 31, 31, this.f315099c);
            String str = this.f315100d;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            Tooltip tooltip = this.f315101e;
            return iHashCode + (tooltip != null ? tooltip.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "RealtyOwnerBadge(text=" + this.f315098b + ", textColor=" + this.f315099c + ", backgroundColor=" + this.f315100d + ", tooltip=" + this.f315101e + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f315098b);
            parcel.writeString(this.f315099c);
            parcel.writeString(this.f315100d);
            Tooltip tooltip = this.f315101e;
            if (tooltip == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                tooltip.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$RightAction;", "Landroid/os/Parcelable;", "Button", "Icon", "More", "Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$RightAction$Button;", "Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$RightAction$Icon;", "Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$RightAction$More;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RightAction extends Parcelable {

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$RightAction$Button;", "Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$RightAction;", "Style", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Button implements RightAction {

            @k
            public static final Parcelable.Creator<Button> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f315107b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final DeepLink f315108c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final Style f315109d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final String f315110e;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: UserAdvertItemDomain.kt */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$RightAction$Button$Style;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Style {

                /* renamed from: b, reason: collision with root package name */
                public static final Style f315111b;

                /* renamed from: c, reason: collision with root package name */
                public static final Style f315112c;

                /* renamed from: d, reason: collision with root package name */
                public static final /* synthetic */ Style[] f315113d;

                /* renamed from: e, reason: collision with root package name */
                public static final /* synthetic */ kotlin.enums.a f315114e;

                static {
                    Style style = new Style("Primary", 0);
                    f315111b = style;
                    Style style2 = new Style("Secondary", 1);
                    f315112c = style2;
                    Style[] styleArr = {style, style2};
                    f315113d = styleArr;
                    f315114e = kotlin.enums.c.a(styleArr);
                }

                public Style() {
                    throw null;
                }

                public static Style valueOf(String str) {
                    return (Style) Enum.valueOf(Style.class, str);
                }

                public static Style[] values() {
                    return (Style[]) f315113d.clone();
                }
            }

            /* compiled from: UserAdvertItemDomain.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Button> {
                @Override // android.os.Parcelable.Creator
                public final Button createFromParcel(Parcel parcel) {
                    return new Button(parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()), Style.valueOf(parcel.readString()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Button[] newArray(int i12) {
                    return new Button[i12];
                }
            }

            public Button(@k String str, @k DeepLink deepLink, @k Style style, @k String str2) {
                this.f315107b = str;
                this.f315108c = deepLink;
                this.f315109d = style;
                this.f315110e = str2;
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
                return L.f(this.f315107b, button.f315107b) && L.f(this.f315108c, button.f315108c) && this.f315109d == button.f315109d && L.f(this.f315110e, button.f315110e);
            }

            public final int hashCode() {
                return this.f315110e.hashCode() + ((this.f315109d.hashCode() + com.avito.android.actions_sheet.a.e(this.f315108c, this.f315107b.hashCode() * 31, 31)) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Button(title=");
                sb2.append(this.f315107b);
                sb2.append(", deepLink=");
                sb2.append(this.f315108c);
                sb2.append(", style=");
                sb2.append(this.f315109d);
                sb2.append(", actionSlug=");
                return C22026a.c(sb2, this.f315110e, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f315107b);
                parcel.writeParcelable(this.f315108c, i12);
                parcel.writeString(this.f315109d.name());
                parcel.writeString(this.f315110e);
            }
        }

        /* compiled from: UserAdvertItemDomain.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$RightAction$Icon;", "Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$RightAction;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Icon implements RightAction {

            @k
            public static final Parcelable.Creator<Icon> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f315115b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final DeepLink f315116c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final String f315117d;

            /* compiled from: UserAdvertItemDomain.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Icon> {
                @Override // android.os.Parcelable.Creator
                public final Icon createFromParcel(Parcel parcel) {
                    return new Icon(parcel.readString(), (DeepLink) parcel.readParcelable(Icon.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Icon[] newArray(int i12) {
                    return new Icon[i12];
                }
            }

            public Icon(@k String str, @k DeepLink deepLink, @k String str2) {
                this.f315115b = str;
                this.f315116c = deepLink;
                this.f315117d = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Icon)) {
                    return false;
                }
                Icon icon = (Icon) obj;
                return L.f(this.f315115b, icon.f315115b) && L.f(this.f315116c, icon.f315116c) && L.f(this.f315117d, icon.f315117d);
            }

            public final int hashCode() {
                return this.f315117d.hashCode() + com.avito.android.actions_sheet.a.e(this.f315116c, this.f315115b.hashCode() * 31, 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Icon(name=");
                sb2.append(this.f315115b);
                sb2.append(", deepLink=");
                sb2.append(this.f315116c);
                sb2.append(", actionSlug=");
                return C22026a.c(sb2, this.f315117d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f315115b);
                parcel.writeParcelable(this.f315116c, i12);
                parcel.writeString(this.f315117d);
            }
        }

        /* compiled from: UserAdvertItemDomain.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$RightAction$More;", "Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$RightAction;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class More implements RightAction {

            @k
            public static final Parcelable.Creator<More> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f315118b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f315119c;

            /* compiled from: UserAdvertItemDomain.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<More> {
                @Override // android.os.Parcelable.Creator
                public final More createFromParcel(Parcel parcel) {
                    return new More(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final More[] newArray(int i12) {
                    return new More[i12];
                }
            }

            public More(@k String str, @k String str2) {
                this.f315118b = str;
                this.f315119c = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof More)) {
                    return false;
                }
                More more = (More) obj;
                return L.f(this.f315118b, more.f315118b) && L.f(this.f315119c, more.f315119c);
            }

            public final int hashCode() {
                return this.f315119c.hashCode() + (this.f315118b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("More(name=");
                sb2.append(this.f315118b);
                sb2.append(", slug=");
                return C22026a.c(sb2, this.f315119c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f315118b);
                parcel.writeString(this.f315119c);
            }
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$SearchPosition;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SearchPosition implements Parcelable {

        @k
        public static final Parcelable.Creator<SearchPosition> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f315120b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final AttributedText f315121c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final DeepLink f315122d;

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SearchPosition> {
            @Override // android.os.Parcelable.Creator
            public final SearchPosition createFromParcel(Parcel parcel) {
                return new SearchPosition(parcel.readInt() != 0, (AttributedText) parcel.readParcelable(SearchPosition.class.getClassLoader()), (DeepLink) parcel.readParcelable(SearchPosition.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SearchPosition[] newArray(int i12) {
                return new SearchPosition[i12];
            }
        }

        public SearchPosition(boolean z12, @k AttributedText attributedText, @l DeepLink deepLink) {
            this.f315120b = z12;
            this.f315121c = attributedText;
            this.f315122d = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchPosition)) {
                return false;
            }
            SearchPosition searchPosition = (SearchPosition) obj;
            return this.f315120b == searchPosition.f315120b && L.f(this.f315121c, searchPosition.f315121c) && L.f(this.f315122d, searchPosition.f315122d);
        }

        public final int hashCode() {
            int iB2 = com.avito.android.actions_sheet.a.b(Boolean.hashCode(this.f315120b) * 31, 31, this.f315121c);
            DeepLink deepLink = this.f315122d;
            return iB2 + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SearchPosition(blinking=");
            sb2.append(this.f315120b);
            sb2.append(", text=");
            sb2.append(this.f315121c);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f315122d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f315120b ? 1 : 0);
            parcel.writeParcelable(this.f315121c, i12);
            parcel.writeParcelable(this.f315122d, i12);
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$ServiceIcon;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServiceIcon implements Parcelable {

        @k
        public static final Parcelable.Creator<ServiceIcon> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315123b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Image f315124c;

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ServiceIcon> {
            @Override // android.os.Parcelable.Creator
            public final ServiceIcon createFromParcel(Parcel parcel) {
                return new ServiceIcon(parcel.readString(), (Image) parcel.readParcelable(ServiceIcon.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ServiceIcon[] newArray(int i12) {
                return new ServiceIcon[i12];
            }
        }

        public ServiceIcon(@k String str, @k Image image) {
            this.f315123b = str;
            this.f315124c = image;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServiceIcon)) {
                return false;
            }
            ServiceIcon serviceIcon = (ServiceIcon) obj;
            return L.f(this.f315123b, serviceIcon.f315123b) && L.f(this.f315124c, serviceIcon.f315124c);
        }

        public final int hashCode() {
            return this.f315124c.hashCode() + (this.f315123b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ServiceIcon(id=");
            sb2.append(this.f315123b);
            sb2.append(", icon=");
            return c.o(sb2, this.f315124c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f315123b);
            parcel.writeParcelable(this.f315124c, i12);
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$Space;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Space implements Parcelable {

        @k
        public static final Parcelable.Creator<Space> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedText f315125b;

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Space> {
            @Override // android.os.Parcelable.Creator
            public final Space createFromParcel(Parcel parcel) {
                return new Space((AttributedText) parcel.readParcelable(Space.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Space[] newArray(int i12) {
                return new Space[i12];
            }
        }

        public Space(@l AttributedText attributedText) {
            this.f315125b = attributedText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Space) && L.f(this.f315125b, ((Space) obj).f315125b);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f315125b;
            if (attributedText == null) {
                return 0;
            }
            return attributedText.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.w(new StringBuilder("Space(badge="), this.f315125b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f315125b, i12);
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$Stats;", "Landroid/os/Parcelable;", "Counters", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Stats implements Parcelable {

        @k
        public static final Parcelable.Creator<Stats> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Counters f315126b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Counters f315127c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Counters f315128d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Double f315129e;

        /* compiled from: UserAdvertItemDomain.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$Stats$Counters;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Counters implements Parcelable {

            @k
            public static final Parcelable.Creator<Counters> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final int f315130b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final Integer f315131c;

            /* compiled from: UserAdvertItemDomain.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Counters> {
                @Override // android.os.Parcelable.Creator
                public final Counters createFromParcel(Parcel parcel) {
                    return new Counters(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final Counters[] newArray(int i12) {
                    return new Counters[i12];
                }
            }

            public Counters(int i12, @l Integer num) {
                this.f315130b = i12;
                this.f315131c = num;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Counters)) {
                    return false;
                }
                Counters counters = (Counters) obj;
                return this.f315130b == counters.f315130b && L.f(this.f315131c, counters.f315131c);
            }

            public final int hashCode() {
                int iHashCode = Integer.hashCode(this.f315130b) * 31;
                Integer num = this.f315131c;
                return iHashCode + (num == null ? 0 : num.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Counters(total=");
                sb2.append(this.f315130b);
                sb2.append(", today=");
                return s.j(sb2, this.f315131c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.f315130b);
                Integer num = this.f315131c;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num);
                }
            }
        }

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Stats> {
            @Override // android.os.Parcelable.Creator
            public final Stats createFromParcel(Parcel parcel) {
                return new Stats(parcel.readInt() == 0 ? null : Counters.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Counters.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Counters.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Stats[] newArray(int i12) {
                return new Stats[i12];
            }
        }

        public Stats(@l Counters counters, @l Counters counters2, @l Counters counters3, @l Double d12) {
            this.f315126b = counters;
            this.f315127c = counters2;
            this.f315128d = counters3;
            this.f315129e = d12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Stats)) {
                return false;
            }
            Stats stats = (Stats) obj;
            return L.f(this.f315126b, stats.f315126b) && L.f(this.f315127c, stats.f315127c) && L.f(this.f315128d, stats.f315128d) && L.f(this.f315129e, stats.f315129e);
        }

        public final int hashCode() {
            Counters counters = this.f315126b;
            int iHashCode = (counters == null ? 0 : counters.hashCode()) * 31;
            Counters counters2 = this.f315127c;
            int iHashCode2 = (iHashCode + (counters2 == null ? 0 : counters2.hashCode())) * 31;
            Counters counters3 = this.f315128d;
            int iHashCode3 = (iHashCode2 + (counters3 == null ? 0 : counters3.hashCode())) * 31;
            Double d12 = this.f315129e;
            return iHashCode3 + (d12 != null ? d12.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Stats(views=");
            sb2.append(this.f315126b);
            sb2.append(", favorites=");
            sb2.append(this.f315127c);
            sb2.append(", contacts=");
            sb2.append(this.f315128d);
            sb2.append(", viewsToContactsConversion=");
            return b.h(sb2, this.f315129e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Counters counters = this.f315126b;
            if (counters == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                counters.writeToParcel(parcel, i12);
            }
            Counters counters2 = this.f315127c;
            if (counters2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                counters2.writeToParcel(parcel, i12);
            }
            Counters counters3 = this.f315128d;
            if (counters3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                counters3.writeToParcel(parcel, i12);
            }
            Double d12 = this.f315129e;
            if (d12 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
            }
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$Status;", "Landroid/os/Parcelable;", "Type", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Status implements Parcelable {

        @k
        public static final Parcelable.Creator<Status> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Type f315132b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f315133c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$Status$Type;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            /* renamed from: b, reason: collision with root package name */
            public static final Type f315134b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ Type[] f315135c;

            /* renamed from: d, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f315136d;

            static {
                Type type = new Type("Discount", 0);
                f315134b = type;
                Type[] typeArr = {type};
                f315135c = typeArr;
                f315136d = kotlin.enums.c.a(typeArr);
            }

            public Type() {
                throw null;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f315135c.clone();
            }
        }

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Status> {
            @Override // android.os.Parcelable.Creator
            public final Status createFromParcel(Parcel parcel) {
                return new Status(Type.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Status[] newArray(int i12) {
                return new Status[i12];
            }
        }

        public Status(@k Type type, @k String str) {
            this.f315132b = type;
            this.f315133c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Status)) {
                return false;
            }
            Status status = (Status) obj;
            return this.f315132b == status.f315132b && L.f(this.f315133c, status.f315133c);
        }

        public final int hashCode() {
            return this.f315133c.hashCode() + (this.f315132b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Status(type=");
            sb2.append(this.f315132b);
            sb2.append(", description=");
            return C22026a.c(sb2, this.f315133c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f315132b.name());
            parcel.writeString(this.f315133c);
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$TimeToLive;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TimeToLive implements Parcelable {

        @k
        public static final Parcelable.Creator<TimeToLive> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315137b;

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TimeToLive> {
            @Override // android.os.Parcelable.Creator
            public final TimeToLive createFromParcel(Parcel parcel) {
                return new TimeToLive(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TimeToLive[] newArray(int i12) {
                return new TimeToLive[i12];
            }
        }

        public TimeToLive(@k String str) {
            this.f315137b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TimeToLive) && L.f(this.f315137b, ((TimeToLive) obj).f315137b);
        }

        public final int hashCode() {
            return this.f315137b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("TimeToLive(description="), this.f315137b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f315137b);
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$Tip;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Tip implements Parcelable {

        @k
        public static final Parcelable.Creator<Tip> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315138b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f315139c;

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Tip> {
            @Override // android.os.Parcelable.Creator
            public final Tip createFromParcel(Parcel parcel) {
                return new Tip(parcel.readString(), (DeepLink) parcel.readParcelable(Tip.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Tip[] newArray(int i12) {
                return new Tip[i12];
            }
        }

        public Tip(@k String str, @k DeepLink deepLink) {
            this.f315138b = str;
            this.f315139c = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tip)) {
                return false;
            }
            Tip tip = (Tip) obj;
            return L.f(this.f315138b, tip.f315138b) && L.f(this.f315139c, tip.f315139c);
        }

        public final int hashCode() {
            return this.f315139c.hashCode() + (this.f315138b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Tip(title=");
            sb2.append(this.f315138b);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f315139c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f315138b);
            parcel.writeParcelable(this.f315139c, i12);
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$VacancyRostrud;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VacancyRostrud implements Parcelable {

        @k
        public static final Parcelable.Creator<VacancyRostrud> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f315140b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f315141c;

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<VacancyRostrud> {
            @Override // android.os.Parcelable.Creator
            public final VacancyRostrud createFromParcel(Parcel parcel) {
                return new VacancyRostrud(parcel.readLong(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VacancyRostrud[] newArray(int i12) {
                return new VacancyRostrud[i12];
            }
        }

        public VacancyRostrud(long j12, @l String str) {
            this.f315140b = j12;
            this.f315141c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VacancyRostrud)) {
                return false;
            }
            VacancyRostrud vacancyRostrud = (VacancyRostrud) obj;
            return this.f315140b == vacancyRostrud.f315140b && L.f(this.f315141c, vacancyRostrud.f315141c);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f315140b) * 31;
            String str = this.f315141c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VacancyRostrud(status=");
            sb2.append(this.f315140b);
            sb2.append(", statusTitle=");
            return C22026a.c(sb2, this.f315141c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f315140b);
            parcel.writeString(this.f315141c);
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$VerificationStatus;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VerificationStatus implements Parcelable {

        @k
        public static final Parcelable.Creator<VerificationStatus> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315142b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f315143c;

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<VerificationStatus> {
            @Override // android.os.Parcelable.Creator
            public final VerificationStatus createFromParcel(Parcel parcel) {
                return new VerificationStatus(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VerificationStatus[] newArray(int i12) {
                return new VerificationStatus[i12];
            }
        }

        public VerificationStatus(@k String str, @l String str2) {
            this.f315142b = str;
            this.f315143c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerificationStatus)) {
                return false;
            }
            VerificationStatus verificationStatus = (VerificationStatus) obj;
            return L.f(this.f315142b, verificationStatus.f315142b) && L.f(this.f315143c, verificationStatus.f315143c);
        }

        public final int hashCode() {
            int iHashCode = this.f315142b.hashCode() * 31;
            String str = this.f315143c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VerificationStatus(statusText=");
            sb2.append(this.f315142b);
            sb2.append(", statusTextColor=");
            return C22026a.c(sb2, this.f315143c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f315142b);
            parcel.writeString(this.f315143c);
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/item/UserAdvertItemDomain$Video;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Video implements Parcelable {

        @k
        public static final Parcelable.Creator<Video> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Uri f315144b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Image f315145c;

        /* compiled from: UserAdvertItemDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Video> {
            @Override // android.os.Parcelable.Creator
            public final Video createFromParcel(Parcel parcel) {
                return new Video((Uri) parcel.readParcelable(Video.class.getClassLoader()), (Image) parcel.readParcelable(Video.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Video[] newArray(int i12) {
                return new Video[i12];
            }
        }

        public Video(@k Uri uri, @l Image image) {
            this.f315144b = uri;
            this.f315145c = image;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Video)) {
                return false;
            }
            Video video = (Video) obj;
            return L.f(this.f315144b, video.f315144b) && L.f(this.f315145c, video.f315145c);
        }

        public final int hashCode() {
            int iHashCode = this.f315144b.hashCode() * 31;
            Image image = this.f315145c;
            return iHashCode + (image == null ? 0 : image.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Video(videoUrl=");
            sb2.append(this.f315144b);
            sb2.append(", previewImage=");
            return c.o(sb2, this.f315145c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f315144b, i12);
            parcel.writeParcelable(this.f315145c, i12);
        }
    }

    /* compiled from: UserAdvertItemDomain.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserAdvertItemDomain> {
        @Override // android.os.Parcelable.Creator
        public final UserAdvertItemDomain createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            AdvertImage advertImageCreateFromParcel = parcel.readInt() == 0 ? null : AdvertImage.CREATOR.createFromParcel(parcel);
            Video videoCreateFromParcel = parcel.readInt() == 0 ? null : Video.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(UserAdvertItemDomain.class.getClassLoader());
            String string3 = parcel.readString();
            Stats statsCreateFromParcel = parcel.readInt() == 0 ? null : Stats.CREATOR.createFromParcel(parcel);
            Tip tipCreateFromParcel = parcel.readInt() == 0 ? null : Tip.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(ServiceIcon.CREATOR, parcel, arrayList, iC2, 1);
                    i12 = i12;
                }
            }
            TimeToLive timeToLiveCreateFromParcel = parcel.readInt() == 0 ? null : TimeToLive.CREATOR.createFromParcel(parcel);
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            RealtyLeadgen realtyLeadgenCreateFromParcel = parcel.readInt() == 0 ? null : RealtyLeadgen.CREATOR.createFromParcel(parcel);
            boolean z12 = parcel.readInt() != 0;
            DeepLink deepLink = (DeepLink) parcel.readParcelable(UserAdvertItemDomain.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Status statusCreateFromParcel = parcel.readInt() == 0 ? null : Status.CREATOR.createFromParcel(parcel);
            String string6 = parcel.readString();
            PriceBadge priceBadgeCreateFromParcel = parcel.readInt() == 0 ? null : PriceBadge.CREATOR.createFromParcel(parcel);
            RealtyOwnerBadge realtyOwnerBadgeCreateFromParcel = parcel.readInt() == 0 ? null : RealtyOwnerBadge.CREATOR.createFromParcel(parcel);
            FashionBadge fashionBadgeCreateFromParcel = parcel.readInt() == 0 ? null : FashionBadge.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UserAdvertItemDomain(j12, string, advertImageCreateFromParcel, videoCreateFromParcel, string2, attributedText, string3, statsCreateFromParcel, tipCreateFromParcel, arrayList, timeToLiveCreateFromParcel, string4, string5, realtyLeadgenCreateFromParcel, z12, deepLink, boolValueOf, statusCreateFromParcel, string6, priceBadgeCreateFromParcel, realtyOwnerBadgeCreateFromParcel, fashionBadgeCreateFromParcel, boolValueOf2, parcel.readInt() == 0 ? null : VerificationStatus.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LiquidityStatus.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString(), (DeepLink) parcel.readParcelable(UserAdvertItemDomain.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AddressesAdditionalInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ContactsBbl.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : VacancyRostrud.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LinkedAdvertisementsInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ActionButton.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SearchPosition.CREATOR.createFromParcel(parcel), (RightAction) parcel.readParcelable(UserAdvertItemDomain.class.getClassLoader()), parcel.readInt() == 0 ? null : Space.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CpxPromoWidget.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final UserAdvertItemDomain[] newArray(int i12) {
            return new UserAdvertItemDomain[i12];
        }
    }

    public UserAdvertItemDomain(long j12, @k String str, @l AdvertImage advertImage, @l Video video, @l String str2, @l AttributedText attributedText, @l String str3, @l Stats stats, @l Tip tip, @l ArrayList arrayList, @l TimeToLive timeToLive, @l String str4, @l String str5, @l RealtyLeadgen realtyLeadgen, boolean z12, @l DeepLink deepLink, @l Boolean bool, @l Status status, @l String str6, @l PriceBadge priceBadge, @l RealtyOwnerBadge realtyOwnerBadge, @l FashionBadge fashionBadge, @l Boolean bool2, @l VerificationStatus verificationStatus, @l LiquidityStatus liquidityStatus, @l List list, @l String str7, @l DeepLink deepLink2, @l String str8, @l String str9, @l String str10, @l AddressesAdditionalInfo addressesAdditionalInfo, @l ContactsBbl contactsBbl, @l VacancyRostrud vacancyRostrud, @l LinkedAdvertisementsInfo linkedAdvertisementsInfo, @l ActionButton actionButton, @l SearchPosition searchPosition, @l RightAction rightAction, @l Space space, @l CpxPromoWidget cpxPromoWidget) {
        this.f315031b = j12;
        this.f315032c = str;
        this.f315033d = advertImage;
        this.f315034e = video;
        this.f315035f = str2;
        this.f315036g = attributedText;
        this.f315037h = str3;
        this.f315038i = stats;
        this.f315039j = tip;
        this.f315040k = arrayList;
        this.f315041l = timeToLive;
        this.f315042m = str4;
        this.f315043n = str5;
        this.f315044o = realtyLeadgen;
        this.f315045p = z12;
        this.f315046q = deepLink;
        this.f315047r = bool;
        this.f315048s = status;
        this.f315049t = str6;
        this.f315050u = priceBadge;
        this.f315051v = realtyOwnerBadge;
        this.f315052w = fashionBadge;
        this.f315053x = bool2;
        this.f315054y = verificationStatus;
        this.f315055z = liquidityStatus;
        this.f315015A = list;
        this.f315016B = str7;
        this.f315017C = deepLink2;
        this.f315018D = str8;
        this.f315019E = str9;
        this.f315020F = str10;
        this.f315021G = addressesAdditionalInfo;
        this.f315022H = contactsBbl;
        this.f315023I = vacancyRostrud;
        this.f315024J = linkedAdvertisementsInfo;
        this.f315025K = actionButton;
        this.f315026L = searchPosition;
        this.f315027M = rightAction;
        this.f315028N = space;
        this.f315029O = cpxPromoWidget;
        this.f315030P = String.valueOf(j12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAdvertItemDomain)) {
            return false;
        }
        UserAdvertItemDomain userAdvertItemDomain = (UserAdvertItemDomain) obj;
        return this.f315031b == userAdvertItemDomain.f315031b && L.f(this.f315032c, userAdvertItemDomain.f315032c) && L.f(this.f315033d, userAdvertItemDomain.f315033d) && L.f(this.f315034e, userAdvertItemDomain.f315034e) && L.f(this.f315035f, userAdvertItemDomain.f315035f) && L.f(this.f315036g, userAdvertItemDomain.f315036g) && L.f(this.f315037h, userAdvertItemDomain.f315037h) && L.f(this.f315038i, userAdvertItemDomain.f315038i) && L.f(this.f315039j, userAdvertItemDomain.f315039j) && L.f(this.f315040k, userAdvertItemDomain.f315040k) && L.f(this.f315041l, userAdvertItemDomain.f315041l) && L.f(this.f315042m, userAdvertItemDomain.f315042m) && L.f(this.f315043n, userAdvertItemDomain.f315043n) && L.f(this.f315044o, userAdvertItemDomain.f315044o) && this.f315045p == userAdvertItemDomain.f315045p && L.f(this.f315046q, userAdvertItemDomain.f315046q) && L.f(this.f315047r, userAdvertItemDomain.f315047r) && L.f(this.f315048s, userAdvertItemDomain.f315048s) && L.f(this.f315049t, userAdvertItemDomain.f315049t) && L.f(this.f315050u, userAdvertItemDomain.f315050u) && L.f(this.f315051v, userAdvertItemDomain.f315051v) && L.f(this.f315052w, userAdvertItemDomain.f315052w) && L.f(this.f315053x, userAdvertItemDomain.f315053x) && L.f(this.f315054y, userAdvertItemDomain.f315054y) && L.f(this.f315055z, userAdvertItemDomain.f315055z) && L.f(this.f315015A, userAdvertItemDomain.f315015A) && L.f(this.f315016B, userAdvertItemDomain.f315016B) && L.f(this.f315017C, userAdvertItemDomain.f315017C) && L.f(this.f315018D, userAdvertItemDomain.f315018D) && L.f(this.f315019E, userAdvertItemDomain.f315019E) && L.f(this.f315020F, userAdvertItemDomain.f315020F) && L.f(this.f315021G, userAdvertItemDomain.f315021G) && L.f(this.f315022H, userAdvertItemDomain.f315022H) && L.f(this.f315023I, userAdvertItemDomain.f315023I) && L.f(this.f315024J, userAdvertItemDomain.f315024J) && L.f(this.f315025K, userAdvertItemDomain.f315025K) && L.f(this.f315026L, userAdvertItemDomain.f315026L) && L.f(this.f315027M, userAdvertItemDomain.f315027M) && L.f(this.f315028N, userAdvertItemDomain.f315028N) && L.f(this.f315029O, userAdvertItemDomain.f315029O);
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f315031b) * 31, 31, this.f315032c);
        AdvertImage advertImage = this.f315033d;
        int iHashCode = (iD2 + (advertImage == null ? 0 : advertImage.hashCode())) * 31;
        Video video = this.f315034e;
        int iHashCode2 = (iHashCode + (video == null ? 0 : video.hashCode())) * 31;
        String str = this.f315035f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f315036g;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str2 = this.f315037h;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Stats stats = this.f315038i;
        int iHashCode6 = (iHashCode5 + (stats == null ? 0 : stats.hashCode())) * 31;
        Tip tip = this.f315039j;
        int iHashCode7 = (iHashCode6 + (tip == null ? 0 : tip.hashCode())) * 31;
        ArrayList arrayList = this.f315040k;
        int iHashCode8 = (iHashCode7 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        TimeToLive timeToLive = this.f315041l;
        int iHashCode9 = (iHashCode8 + (timeToLive == null ? 0 : timeToLive.f315137b.hashCode())) * 31;
        String str3 = this.f315042m;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f315043n;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        RealtyLeadgen realtyLeadgen = this.f315044o;
        int i12 = r.i((iHashCode11 + (realtyLeadgen == null ? 0 : realtyLeadgen.hashCode())) * 31, 31, this.f315045p);
        DeepLink deepLink = this.f315046q;
        int iHashCode12 = (i12 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        Boolean bool = this.f315047r;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Status status = this.f315048s;
        int iHashCode14 = (iHashCode13 + (status == null ? 0 : status.hashCode())) * 31;
        String str5 = this.f315049t;
        int iHashCode15 = (iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        PriceBadge priceBadge = this.f315050u;
        int iHashCode16 = (iHashCode15 + (priceBadge == null ? 0 : priceBadge.hashCode())) * 31;
        RealtyOwnerBadge realtyOwnerBadge = this.f315051v;
        int iHashCode17 = (iHashCode16 + (realtyOwnerBadge == null ? 0 : realtyOwnerBadge.hashCode())) * 31;
        FashionBadge fashionBadge = this.f315052w;
        int iHashCode18 = (iHashCode17 + (fashionBadge == null ? 0 : fashionBadge.hashCode())) * 31;
        Boolean bool2 = this.f315053x;
        int iHashCode19 = (iHashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        VerificationStatus verificationStatus = this.f315054y;
        int iHashCode20 = (iHashCode19 + (verificationStatus == null ? 0 : verificationStatus.hashCode())) * 31;
        LiquidityStatus liquidityStatus = this.f315055z;
        int iHashCode21 = (iHashCode20 + (liquidityStatus == null ? 0 : liquidityStatus.hashCode())) * 31;
        List<String> list = this.f315015A;
        int iHashCode22 = (iHashCode21 + (list == null ? 0 : list.hashCode())) * 31;
        String str6 = this.f315016B;
        int iHashCode23 = (iHashCode22 + (str6 == null ? 0 : str6.hashCode())) * 31;
        DeepLink deepLink2 = this.f315017C;
        int iHashCode24 = (iHashCode23 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        String str7 = this.f315018D;
        int iHashCode25 = (iHashCode24 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f315019E;
        int iHashCode26 = (iHashCode25 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f315020F;
        int iHashCode27 = (iHashCode26 + (str9 == null ? 0 : str9.hashCode())) * 31;
        AddressesAdditionalInfo addressesAdditionalInfo = this.f315021G;
        int iHashCode28 = (iHashCode27 + (addressesAdditionalInfo == null ? 0 : addressesAdditionalInfo.hashCode())) * 31;
        ContactsBbl contactsBbl = this.f315022H;
        int iHashCode29 = (iHashCode28 + (contactsBbl == null ? 0 : contactsBbl.hashCode())) * 31;
        VacancyRostrud vacancyRostrud = this.f315023I;
        int iHashCode30 = (iHashCode29 + (vacancyRostrud == null ? 0 : vacancyRostrud.hashCode())) * 31;
        LinkedAdvertisementsInfo linkedAdvertisementsInfo = this.f315024J;
        int iHashCode31 = (iHashCode30 + (linkedAdvertisementsInfo == null ? 0 : linkedAdvertisementsInfo.hashCode())) * 31;
        ActionButton actionButton = this.f315025K;
        int iHashCode32 = (iHashCode31 + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
        SearchPosition searchPosition = this.f315026L;
        int iHashCode33 = (iHashCode32 + (searchPosition == null ? 0 : searchPosition.hashCode())) * 31;
        RightAction rightAction = this.f315027M;
        int iHashCode34 = (iHashCode33 + (rightAction == null ? 0 : rightAction.hashCode())) * 31;
        Space space = this.f315028N;
        int iHashCode35 = (iHashCode34 + (space == null ? 0 : space.hashCode())) * 31;
        CpxPromoWidget cpxPromoWidget = this.f315029O;
        return iHashCode35 + (cpxPromoWidget != null ? cpxPromoWidget.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "UserAdvertItemDomain(advertId=" + this.f315031b + ", title=" + this.f315032c + ", image=" + this.f315033d + ", video=" + this.f315034e + ", price=" + this.f315035f + ", saleInfo=" + this.f315036g + ", shortcut=" + this.f315037h + ", stats=" + this.f315038i + ", tip=" + this.f315039j + ", servicesIcons=" + this.f315040k + ", ttl=" + this.f315041l + ", declineReason=" + this.f315042m + ", reservationInfo=" + this.f315043n + ", realtyLeadgen=" + this.f315044o + ", isModerated=" + this.f315045p + ", deepLink=" + this.f315046q + ", hasDelivery=" + this.f315047r + ", status=" + this.f315048s + ", shortcutTitle=" + this.f315049t + ", priceBadge=" + this.f315050u + ", realtyOwnerBadge=" + this.f315051v + ", fashionBadge=" + this.f315052w + ", isAutoPublishOn=" + this.f315053x + ", verificationStatus=" + this.f315054y + ", liquidityStatus=" + this.f315055z + ", actions=" + this.f315015A + ", availableStocks=" + this.f315016B + ", editDeeplink=" + this.f315017C + ", fillParameters=" + this.f315018D + ", deliveryAlertText=" + this.f315019E + ", location=" + this.f315020F + ", addressesAdditionalInfo=" + this.f315021G + ", contactsBbl=" + this.f315022H + ", vacancyRostrud=" + this.f315023I + ", linkedAdvertisements=" + this.f315024J + ", actionButton=" + this.f315025K + ", searchPosition=" + this.f315026L + ", rightAction=" + this.f315027M + ", space=" + this.f315028N + ", cpxPromoWidget=" + this.f315029O + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f315031b);
        parcel.writeString(this.f315032c);
        AdvertImage advertImage = this.f315033d;
        if (advertImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertImage.writeToParcel(parcel, i12);
        }
        Video video = this.f315034e;
        if (video == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            video.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f315035f);
        parcel.writeParcelable(this.f315036g, i12);
        parcel.writeString(this.f315037h);
        Stats stats = this.f315038i;
        if (stats == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stats.writeToParcel(parcel, i12);
        }
        Tip tip = this.f315039j;
        if (tip == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tip.writeToParcel(parcel, i12);
        }
        ArrayList arrayList = this.f315040k;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                ((ServiceIcon) itY.next()).writeToParcel(parcel, i12);
            }
        }
        TimeToLive timeToLive = this.f315041l;
        if (timeToLive == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            timeToLive.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f315042m);
        parcel.writeString(this.f315043n);
        RealtyLeadgen realtyLeadgen = this.f315044o;
        if (realtyLeadgen == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            realtyLeadgen.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f315045p ? 1 : 0);
        parcel.writeParcelable(this.f315046q, i12);
        Boolean bool = this.f315047r;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Status status = this.f315048s;
        if (status == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            status.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f315049t);
        PriceBadge priceBadge = this.f315050u;
        if (priceBadge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceBadge.writeToParcel(parcel, i12);
        }
        RealtyOwnerBadge realtyOwnerBadge = this.f315051v;
        if (realtyOwnerBadge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            realtyOwnerBadge.writeToParcel(parcel, i12);
        }
        FashionBadge fashionBadge = this.f315052w;
        if (fashionBadge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fashionBadge.writeToParcel(parcel, i12);
        }
        Boolean bool2 = this.f315053x;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        VerificationStatus verificationStatus = this.f315054y;
        if (verificationStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            verificationStatus.writeToParcel(parcel, i12);
        }
        LiquidityStatus liquidityStatus = this.f315055z;
        if (liquidityStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            liquidityStatus.writeToParcel(parcel, i12);
        }
        parcel.writeStringList(this.f315015A);
        parcel.writeString(this.f315016B);
        parcel.writeParcelable(this.f315017C, i12);
        parcel.writeString(this.f315018D);
        parcel.writeString(this.f315019E);
        parcel.writeString(this.f315020F);
        AddressesAdditionalInfo addressesAdditionalInfo = this.f315021G;
        if (addressesAdditionalInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressesAdditionalInfo.writeToParcel(parcel, i12);
        }
        ContactsBbl contactsBbl = this.f315022H;
        if (contactsBbl == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contactsBbl.writeToParcel(parcel, i12);
        }
        VacancyRostrud vacancyRostrud = this.f315023I;
        if (vacancyRostrud == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vacancyRostrud.writeToParcel(parcel, i12);
        }
        LinkedAdvertisementsInfo linkedAdvertisementsInfo = this.f315024J;
        if (linkedAdvertisementsInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkedAdvertisementsInfo.writeToParcel(parcel, i12);
        }
        ActionButton actionButton = this.f315025K;
        if (actionButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionButton.writeToParcel(parcel, i12);
        }
        SearchPosition searchPosition = this.f315026L;
        if (searchPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchPosition.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f315027M, i12);
        Space space = this.f315028N;
        if (space == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            space.writeToParcel(parcel, i12);
        }
        CpxPromoWidget cpxPromoWidget = this.f315029O;
        if (cpxPromoWidget == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cpxPromoWidget.writeToParcel(parcel, i12);
        }
    }
}
