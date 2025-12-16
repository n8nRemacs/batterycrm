package com.avito.android.advert_core.safedeal.trust_factors;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.safedeal.SafeDeal;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrustFactorsComponent.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent;", "Landroid/os/Parcelable;", "BadgeBar", "Button", "CombinedButtons", "ExpandableListItem", "Header", "ListItem", "Spacing", "SplitText", "Text", "Voucher", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$BadgeBar;", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$Button;", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$CombinedButtons;", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$ExpandableListItem;", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$Header;", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$ListItem;", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$Spacing;", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$SplitText;", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$Text;", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$Voucher;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface TrustFactorsComponent extends Parcelable {
    @l
    /* renamed from: getId */
    String getF84275c();

    /* compiled from: TrustFactorsComponent.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$BadgeBar;", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BadgeBar implements TrustFactorsComponent {

        @k
        public static final Parcelable.Creator<BadgeBar> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SafeDeal.Component.BadgeBar f84255b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f84256c;

        /* compiled from: TrustFactorsComponent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BadgeBar> {
            @Override // android.os.Parcelable.Creator
            public final BadgeBar createFromParcel(Parcel parcel) {
                return new BadgeBar((SafeDeal.Component.BadgeBar) parcel.readParcelable(BadgeBar.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BadgeBar[] newArray(int i12) {
                return new BadgeBar[i12];
            }
        }

        public BadgeBar(@k SafeDeal.Component.BadgeBar badgeBar, @l String str) {
            this.f84255b = badgeBar;
            this.f84256c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BadgeBar)) {
                return false;
            }
            BadgeBar badgeBar = (BadgeBar) obj;
            return L.f(this.f84255b, badgeBar.f84255b) && L.f(this.f84256c, badgeBar.f84256c);
        }

        @Override // com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent
        @l
        /* renamed from: getId, reason: from getter */
        public final String getF84275c() {
            return this.f84256c;
        }

        public final int hashCode() {
            int iHashCode = this.f84255b.hashCode() * 31;
            String str = this.f84256c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BadgeBar(data=");
            sb2.append(this.f84255b);
            sb2.append(", id=");
            return C22026a.c(sb2, this.f84256c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f84255b, i12);
            parcel.writeString(this.f84256c);
        }

        public /* synthetic */ BadgeBar(SafeDeal.Component.BadgeBar badgeBar, String str, int i12, C42822w c42822w) {
            this(badgeBar, (i12 & 2) != 0 ? badgeBar.getId() : str);
        }
    }

    /* compiled from: TrustFactorsComponent.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$Button;", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Button implements TrustFactorsComponent {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SafeDeal.Component.Button f84257b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f84258c;

        /* compiled from: TrustFactorsComponent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button((SafeDeal.Component.Button) parcel.readParcelable(Button.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@k SafeDeal.Component.Button button, @l String str) {
            this.f84257b = button;
            this.f84258c = str;
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
            return L.f(this.f84257b, button.f84257b) && L.f(this.f84258c, button.f84258c);
        }

        @Override // com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent
        @l
        /* renamed from: getId, reason: from getter */
        public final String getF84275c() {
            return this.f84258c;
        }

        public final int hashCode() {
            int iHashCode = this.f84257b.hashCode() * 31;
            String str = this.f84258c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(data=");
            sb2.append(this.f84257b);
            sb2.append(", id=");
            return C22026a.c(sb2, this.f84258c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f84257b, i12);
            parcel.writeString(this.f84258c);
        }

        public /* synthetic */ Button(SafeDeal.Component.Button button, String str, int i12, C42822w c42822w) {
            this(button, (i12 & 2) != 0 ? button.getId() : str);
        }
    }

    /* compiled from: TrustFactorsComponent.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$ExpandableListItem;", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ExpandableListItem implements TrustFactorsComponent {

        @k
        public static final Parcelable.Creator<ExpandableListItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SafeDeal.Component.ExpandableListItem f84262b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f84263c;

        /* compiled from: TrustFactorsComponent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ExpandableListItem> {
            @Override // android.os.Parcelable.Creator
            public final ExpandableListItem createFromParcel(Parcel parcel) {
                return new ExpandableListItem((SafeDeal.Component.ExpandableListItem) parcel.readParcelable(ExpandableListItem.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ExpandableListItem[] newArray(int i12) {
                return new ExpandableListItem[i12];
            }
        }

        public ExpandableListItem(@k SafeDeal.Component.ExpandableListItem expandableListItem, @l String str) {
            this.f84262b = expandableListItem;
            this.f84263c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExpandableListItem)) {
                return false;
            }
            ExpandableListItem expandableListItem = (ExpandableListItem) obj;
            return L.f(this.f84262b, expandableListItem.f84262b) && L.f(this.f84263c, expandableListItem.f84263c);
        }

        @Override // com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent
        @l
        /* renamed from: getId, reason: from getter */
        public final String getF84275c() {
            return this.f84263c;
        }

        public final int hashCode() {
            int iHashCode = this.f84262b.hashCode() * 31;
            String str = this.f84263c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ExpandableListItem(data=");
            sb2.append(this.f84262b);
            sb2.append(", id=");
            return C22026a.c(sb2, this.f84263c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f84262b, i12);
            parcel.writeString(this.f84263c);
        }

        public /* synthetic */ ExpandableListItem(SafeDeal.Component.ExpandableListItem expandableListItem, String str, int i12, C42822w c42822w) {
            this(expandableListItem, (i12 & 2) != 0 ? expandableListItem.getId() : str);
        }
    }

    /* compiled from: TrustFactorsComponent.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$Header;", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Header implements TrustFactorsComponent {

        @k
        public static final Parcelable.Creator<Header> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SafeDeal.Component.Header f84264b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f84265c;

        /* compiled from: TrustFactorsComponent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Header> {
            @Override // android.os.Parcelable.Creator
            public final Header createFromParcel(Parcel parcel) {
                return new Header((SafeDeal.Component.Header) parcel.readParcelable(Header.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Header[] newArray(int i12) {
                return new Header[i12];
            }
        }

        public Header(@k SafeDeal.Component.Header header, @l String str) {
            this.f84264b = header;
            this.f84265c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return L.f(this.f84264b, header.f84264b) && L.f(this.f84265c, header.f84265c);
        }

        @Override // com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent
        @l
        /* renamed from: getId, reason: from getter */
        public final String getF84275c() {
            return this.f84265c;
        }

        public final int hashCode() {
            int iHashCode = this.f84264b.hashCode() * 31;
            String str = this.f84265c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Header(data=");
            sb2.append(this.f84264b);
            sb2.append(", id=");
            return C22026a.c(sb2, this.f84265c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f84264b, i12);
            parcel.writeString(this.f84265c);
        }

        public /* synthetic */ Header(SafeDeal.Component.Header header, String str, int i12, C42822w c42822w) {
            this(header, (i12 & 2) != 0 ? header.getId() : str);
        }
    }

    /* compiled from: TrustFactorsComponent.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$ListItem;", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ListItem implements TrustFactorsComponent {

        @k
        public static final Parcelable.Creator<ListItem> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SafeDeal.Component.ListItem f84266b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f84267c;

        /* compiled from: TrustFactorsComponent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ListItem> {
            @Override // android.os.Parcelable.Creator
            public final ListItem createFromParcel(Parcel parcel) {
                return new ListItem((SafeDeal.Component.ListItem) parcel.readParcelable(ListItem.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ListItem[] newArray(int i12) {
                return new ListItem[i12];
            }
        }

        public ListItem(@k SafeDeal.Component.ListItem listItem, @l String str) {
            this.f84266b = listItem;
            this.f84267c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListItem)) {
                return false;
            }
            ListItem listItem = (ListItem) obj;
            return L.f(this.f84266b, listItem.f84266b) && L.f(this.f84267c, listItem.f84267c);
        }

        @Override // com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent
        @l
        /* renamed from: getId, reason: from getter */
        public final String getF84275c() {
            return this.f84267c;
        }

        public final int hashCode() {
            int iHashCode = this.f84266b.hashCode() * 31;
            String str = this.f84267c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ListItem(data=");
            sb2.append(this.f84266b);
            sb2.append(", id=");
            return C22026a.c(sb2, this.f84267c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f84266b, i12);
            parcel.writeString(this.f84267c);
        }

        public /* synthetic */ ListItem(SafeDeal.Component.ListItem listItem, String str, int i12, C42822w c42822w) {
            this(listItem, (i12 & 2) != 0 ? listItem.getId() : str);
        }
    }

    /* compiled from: TrustFactorsComponent.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$Spacing;", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Spacing implements TrustFactorsComponent {

        @k
        public static final Parcelable.Creator<Spacing> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SafeDeal.Component.Spacing f84268b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f84269c;

        /* compiled from: TrustFactorsComponent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Spacing> {
            @Override // android.os.Parcelable.Creator
            public final Spacing createFromParcel(Parcel parcel) {
                return new Spacing((SafeDeal.Component.Spacing) parcel.readParcelable(Spacing.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Spacing[] newArray(int i12) {
                return new Spacing[i12];
            }
        }

        public Spacing(@k SafeDeal.Component.Spacing spacing, @l String str) {
            this.f84268b = spacing;
            this.f84269c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Spacing)) {
                return false;
            }
            Spacing spacing = (Spacing) obj;
            return L.f(this.f84268b, spacing.f84268b) && L.f(this.f84269c, spacing.f84269c);
        }

        @Override // com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent
        @l
        /* renamed from: getId, reason: from getter */
        public final String getF84275c() {
            return this.f84269c;
        }

        public final int hashCode() {
            int iHashCode = this.f84268b.hashCode() * 31;
            String str = this.f84269c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Spacing(data=");
            sb2.append(this.f84268b);
            sb2.append(", id=");
            return C22026a.c(sb2, this.f84269c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f84268b, i12);
            parcel.writeString(this.f84269c);
        }

        public /* synthetic */ Spacing(SafeDeal.Component.Spacing spacing, String str, int i12, C42822w c42822w) {
            this(spacing, (i12 & 2) != 0 ? spacing.getId() : str);
        }
    }

    /* compiled from: TrustFactorsComponent.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$SplitText;", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SplitText implements TrustFactorsComponent {

        @k
        public static final Parcelable.Creator<SplitText> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SafeDeal.Component.SplitText f84270b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f84271c;

        /* compiled from: TrustFactorsComponent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SplitText> {
            @Override // android.os.Parcelable.Creator
            public final SplitText createFromParcel(Parcel parcel) {
                return new SplitText((SafeDeal.Component.SplitText) parcel.readParcelable(SplitText.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SplitText[] newArray(int i12) {
                return new SplitText[i12];
            }
        }

        public SplitText(@k SafeDeal.Component.SplitText splitText, @l String str) {
            this.f84270b = splitText;
            this.f84271c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SplitText)) {
                return false;
            }
            SplitText splitText = (SplitText) obj;
            return L.f(this.f84270b, splitText.f84270b) && L.f(this.f84271c, splitText.f84271c);
        }

        @Override // com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent
        @l
        /* renamed from: getId, reason: from getter */
        public final String getF84275c() {
            return this.f84271c;
        }

        public final int hashCode() {
            int iHashCode = this.f84270b.hashCode() * 31;
            String str = this.f84271c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SplitText(data=");
            sb2.append(this.f84270b);
            sb2.append(", id=");
            return C22026a.c(sb2, this.f84271c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f84270b, i12);
            parcel.writeString(this.f84271c);
        }

        public /* synthetic */ SplitText(SafeDeal.Component.SplitText splitText, String str, int i12, C42822w c42822w) {
            this(splitText, (i12 & 2) != 0 ? splitText.getId() : str);
        }
    }

    /* compiled from: TrustFactorsComponent.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$Text;", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Text implements TrustFactorsComponent {

        @k
        public static final Parcelable.Creator<Text> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SafeDeal.Component.Text f84272b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f84273c;

        /* compiled from: TrustFactorsComponent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Text> {
            @Override // android.os.Parcelable.Creator
            public final Text createFromParcel(Parcel parcel) {
                return new Text((SafeDeal.Component.Text) parcel.readParcelable(Text.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Text[] newArray(int i12) {
                return new Text[i12];
            }
        }

        public Text(@k SafeDeal.Component.Text text, @l String str) {
            this.f84272b = text;
            this.f84273c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Text)) {
                return false;
            }
            Text text = (Text) obj;
            return L.f(this.f84272b, text.f84272b) && L.f(this.f84273c, text.f84273c);
        }

        @Override // com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent
        @l
        /* renamed from: getId, reason: from getter */
        public final String getF84275c() {
            return this.f84273c;
        }

        public final int hashCode() {
            int iHashCode = this.f84272b.hashCode() * 31;
            String str = this.f84273c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Text(data=");
            sb2.append(this.f84272b);
            sb2.append(", id=");
            return C22026a.c(sb2, this.f84273c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f84272b, i12);
            parcel.writeString(this.f84273c);
        }

        public /* synthetic */ Text(SafeDeal.Component.Text text, String str, int i12, C42822w c42822w) {
            this(text, (i12 & 2) != 0 ? text.getId() : str);
        }
    }

    /* compiled from: TrustFactorsComponent.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$Voucher;", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Voucher implements TrustFactorsComponent {

        @k
        public static final Parcelable.Creator<Voucher> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SafeDeal.Component.Voucher f84274b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f84275c;

        /* compiled from: TrustFactorsComponent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Voucher> {
            @Override // android.os.Parcelable.Creator
            public final Voucher createFromParcel(Parcel parcel) {
                return new Voucher((SafeDeal.Component.Voucher) parcel.readParcelable(Voucher.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Voucher[] newArray(int i12) {
                return new Voucher[i12];
            }
        }

        public Voucher(@k SafeDeal.Component.Voucher voucher, @l String str) {
            this.f84274b = voucher;
            this.f84275c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Voucher)) {
                return false;
            }
            Voucher voucher = (Voucher) obj;
            return L.f(this.f84274b, voucher.f84274b) && L.f(this.f84275c, voucher.f84275c);
        }

        @Override // com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent
        @l
        /* renamed from: getId, reason: from getter */
        public final String getF84275c() {
            return this.f84275c;
        }

        public final int hashCode() {
            int iHashCode = this.f84274b.hashCode() * 31;
            String str = this.f84275c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Voucher(data=");
            sb2.append(this.f84274b);
            sb2.append(", id=");
            return C22026a.c(sb2, this.f84275c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f84274b, i12);
            parcel.writeString(this.f84275c);
        }

        public /* synthetic */ Voucher(SafeDeal.Component.Voucher voucher, String str, int i12, C42822w c42822w) {
            this(voucher, (i12 & 2) != 0 ? voucher.getId() : str);
        }
    }

    /* compiled from: TrustFactorsComponent.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent$CombinedButtons;", "Lcom/avito/android/advert_core/safedeal/trust_factors/TrustFactorsComponent;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CombinedButtons implements TrustFactorsComponent {

        @k
        public static final Parcelable.Creator<CombinedButtons> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SafeDeal.Component.CombinedButtons f84259b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final SafeDeal.Component.CombinedButtons.WidthStrategy f84260c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f84261d;

        /* compiled from: TrustFactorsComponent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CombinedButtons> {
            @Override // android.os.Parcelable.Creator
            public final CombinedButtons createFromParcel(Parcel parcel) {
                return new CombinedButtons((SafeDeal.Component.CombinedButtons) parcel.readParcelable(CombinedButtons.class.getClassLoader()), parcel.readInt() == 0 ? null : SafeDeal.Component.CombinedButtons.WidthStrategy.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CombinedButtons[] newArray(int i12) {
                return new CombinedButtons[i12];
            }
        }

        public CombinedButtons(@k SafeDeal.Component.CombinedButtons combinedButtons, @l SafeDeal.Component.CombinedButtons.WidthStrategy widthStrategy, @l String str) {
            this.f84259b = combinedButtons;
            this.f84260c = widthStrategy;
            this.f84261d = str;
        }

        public static CombinedButtons a(CombinedButtons combinedButtons, SafeDeal.Component.CombinedButtons combinedButtons2) {
            SafeDeal.Component.CombinedButtons.WidthStrategy widthStrategy = combinedButtons.f84260c;
            String str = combinedButtons.f84261d;
            combinedButtons.getClass();
            return new CombinedButtons(combinedButtons2, widthStrategy, str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CombinedButtons)) {
                return false;
            }
            CombinedButtons combinedButtons = (CombinedButtons) obj;
            return L.f(this.f84259b, combinedButtons.f84259b) && this.f84260c == combinedButtons.f84260c && L.f(this.f84261d, combinedButtons.f84261d);
        }

        @Override // com.avito.android.advert_core.safedeal.trust_factors.TrustFactorsComponent
        @l
        /* renamed from: getId, reason: from getter */
        public final String getF84275c() {
            return this.f84261d;
        }

        public final int hashCode() {
            int iHashCode = this.f84259b.hashCode() * 31;
            SafeDeal.Component.CombinedButtons.WidthStrategy widthStrategy = this.f84260c;
            int iHashCode2 = (iHashCode + (widthStrategy == null ? 0 : widthStrategy.hashCode())) * 31;
            String str = this.f84261d;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CombinedButtons(data=");
            sb2.append(this.f84259b);
            sb2.append(", originalWidthStrategy=");
            sb2.append(this.f84260c);
            sb2.append(", id=");
            return C22026a.c(sb2, this.f84261d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f84259b, i12);
            SafeDeal.Component.CombinedButtons.WidthStrategy widthStrategy = this.f84260c;
            if (widthStrategy == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(widthStrategy.name());
            }
            parcel.writeString(this.f84261d);
        }

        public /* synthetic */ CombinedButtons(SafeDeal.Component.CombinedButtons combinedButtons, SafeDeal.Component.CombinedButtons.WidthStrategy widthStrategy, String str, int i12, C42822w c42822w) {
            this(combinedButtons, widthStrategy, (i12 & 4) != 0 ? combinedButtons.getId() : str);
        }
    }
}
