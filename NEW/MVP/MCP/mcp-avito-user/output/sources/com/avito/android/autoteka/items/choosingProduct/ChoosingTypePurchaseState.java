package com.avito.android.autoteka.items.choosingProduct;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.autoteka.domain.AutotekaItems;
import com.avito.android.autoteka.domain.model.choosingPurchase.ProductItem;
import com.avito.android.remote.autoteka.model.AutotekaAction;
import com.avito.android.remote.autoteka.model.StandaloneAutotekaBlock;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChoosingTypePurchaseState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/autoteka/items/choosingProduct/ChoosingTypePurchaseState;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "BuyAgainState", "ChoosingProductState", "PurchaseViaPackageState", "PurchaseViaStandaloneState", "Lcom/avito/android/autoteka/items/choosingProduct/ChoosingTypePurchaseState$BuyAgainState;", "Lcom/avito/android/autoteka/items/choosingProduct/ChoosingTypePurchaseState$ChoosingProductState;", "Lcom/avito/android/autoteka/items/choosingProduct/ChoosingTypePurchaseState$PurchaseViaPackageState;", "Lcom/avito/android/autoteka/items/choosingProduct/ChoosingTypePurchaseState$PurchaseViaStandaloneState;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ChoosingTypePurchaseState extends com.avito.conveyor_item.a, Parcelable {

    /* compiled from: ChoosingTypePurchaseState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: ChoosingTypePurchaseState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/items/choosingProduct/ChoosingTypePurchaseState$BuyAgainState;", "Lcom/avito/android/autoteka/items/choosingProduct/ChoosingTypePurchaseState;", "Landroid/os/Parcelable;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BuyAgainState implements ChoosingTypePurchaseState, Parcelable {

        @Y61.k
        public static final Parcelable.Creator<BuyAgainState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f96684b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f96685c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final AttributedText f96686d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f96687e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f96688f;

        /* compiled from: ChoosingTypePurchaseState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BuyAgainState> {
            @Override // android.os.Parcelable.Creator
            public final BuyAgainState createFromParcel(Parcel parcel) {
                return new BuyAgainState(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(BuyAgainState.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BuyAgainState[] newArray(int i12) {
                return new BuyAgainState[i12];
            }
        }

        public BuyAgainState(@Y61.k String str, @Y61.k String str2, @Y61.k AttributedText attributedText, @Y61.k String str3, @Y61.l String str4) {
            this.f96684b = str;
            this.f96685c = str2;
            this.f96686d = attributedText;
            this.f96687e = str3;
            this.f96688f = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BuyAgainState)) {
                return false;
            }
            BuyAgainState buyAgainState = (BuyAgainState) obj;
            return L.f(this.f96684b, buyAgainState.f96684b) && L.f(this.f96685c, buyAgainState.f96685c) && L.f(this.f96686d, buyAgainState.f96686d) && L.f(this.f96687e, buyAgainState.f96687e) && L.f(this.f96688f, buyAgainState.f96688f);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF80596b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF296503b() {
            return this.f96684b;
        }

        public final int hashCode() {
            int iD2 = H.d(com.avito.android.actions_sheet.a.b(H.d(this.f96684b.hashCode() * 31, 31, this.f96685c), 31, this.f96686d), 31, this.f96687e);
            String str = this.f96688f;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BuyAgainState(stringId=");
            sb2.append(this.f96684b);
            sb2.append(", title=");
            sb2.append(this.f96685c);
            sb2.append(", description=");
            sb2.append(this.f96686d);
            sb2.append(", reportPublicId=");
            sb2.append(this.f96687e);
            sb2.append(", usagePublicId=");
            return C22026a.c(sb2, this.f96688f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f96684b);
            parcel.writeString(this.f96685c);
            parcel.writeParcelable(this.f96686d, i12);
            parcel.writeString(this.f96687e);
            parcel.writeString(this.f96688f);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ BuyAgainState(String str, String str2, AttributedText attributedText, String str3, String str4, int i12, C42822w c42822w) {
            if ((i12 & 1) != 0) {
                AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
                str = "ITEM_BUY_AGAIN";
            }
            this(str, str2, attributedText, str3, str4);
        }
    }

    /* compiled from: ChoosingTypePurchaseState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/items/choosingProduct/ChoosingTypePurchaseState$PurchaseViaStandaloneState;", "Lcom/avito/android/autoteka/items/choosingProduct/ChoosingTypePurchaseState;", "Landroid/os/Parcelable;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PurchaseViaStandaloneState implements ChoosingTypePurchaseState, Parcelable {

        @Y61.k
        public static final Parcelable.Creator<PurchaseViaStandaloneState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f96703b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f96704c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final AttributedText f96705d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final AutotekaAction f96706e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final StandaloneAutotekaBlock.StandaloneAutotekaLink f96707f;

        /* compiled from: ChoosingTypePurchaseState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PurchaseViaStandaloneState> {
            @Override // android.os.Parcelable.Creator
            public final PurchaseViaStandaloneState createFromParcel(Parcel parcel) {
                return new PurchaseViaStandaloneState(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(PurchaseViaStandaloneState.class.getClassLoader()), (AutotekaAction) parcel.readParcelable(PurchaseViaStandaloneState.class.getClassLoader()), (StandaloneAutotekaBlock.StandaloneAutotekaLink) parcel.readParcelable(PurchaseViaStandaloneState.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final PurchaseViaStandaloneState[] newArray(int i12) {
                return new PurchaseViaStandaloneState[i12];
            }
        }

        public PurchaseViaStandaloneState(@Y61.k String str, @Y61.k String str2, @Y61.k AttributedText attributedText, @Y61.k AutotekaAction autotekaAction, @Y61.k StandaloneAutotekaBlock.StandaloneAutotekaLink standaloneAutotekaLink) {
            this.f96703b = str;
            this.f96704c = str2;
            this.f96705d = attributedText;
            this.f96706e = autotekaAction;
            this.f96707f = standaloneAutotekaLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PurchaseViaStandaloneState)) {
                return false;
            }
            PurchaseViaStandaloneState purchaseViaStandaloneState = (PurchaseViaStandaloneState) obj;
            return L.f(this.f96703b, purchaseViaStandaloneState.f96703b) && L.f(this.f96704c, purchaseViaStandaloneState.f96704c) && L.f(this.f96705d, purchaseViaStandaloneState.f96705d) && L.f(this.f96706e, purchaseViaStandaloneState.f96706e) && L.f(this.f96707f, purchaseViaStandaloneState.f96707f);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF80596b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF296503b() {
            return this.f96703b;
        }

        public final int hashCode() {
            return this.f96707f.hashCode() + ((this.f96706e.hashCode() + com.avito.android.actions_sheet.a.b(H.d(this.f96703b.hashCode() * 31, 31, this.f96704c), 31, this.f96705d)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "PurchaseViaStandaloneState(stringId=" + this.f96703b + ", title=" + this.f96704c + ", description=" + this.f96705d + ", productListAction=" + this.f96706e + ", standaloneLink=" + this.f96707f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f96703b);
            parcel.writeString(this.f96704c);
            parcel.writeParcelable(this.f96705d, i12);
            parcel.writeParcelable(this.f96706e, i12);
            parcel.writeParcelable(this.f96707f, i12);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ PurchaseViaStandaloneState(String str, String str2, AttributedText attributedText, AutotekaAction autotekaAction, StandaloneAutotekaBlock.StandaloneAutotekaLink standaloneAutotekaLink, int i12, C42822w c42822w) {
            if ((i12 & 1) != 0) {
                AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
                str = "ITEM_PURCHASE_VIA_STANDALONE";
            }
            this(str, str2, attributedText, autotekaAction, standaloneAutotekaLink);
        }
    }

    /* compiled from: ChoosingTypePurchaseState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/items/choosingProduct/ChoosingTypePurchaseState$ChoosingProductState;", "Lcom/avito/android/autoteka/items/choosingProduct/ChoosingTypePurchaseState;", "Landroid/os/Parcelable;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ChoosingProductState implements ChoosingTypePurchaseState, Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ChoosingProductState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f96689b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final AttributedText f96690c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f96691d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final StandaloneAutotekaBlock f96692e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final List<ProductItem> f96693f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final String f96694g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final Boolean f96695h;

        /* compiled from: ChoosingTypePurchaseState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ChoosingProductState> {
            @Override // android.os.Parcelable.Creator
            public final ChoosingProductState createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                AttributedText attributedText = (AttributedText) parcel.readParcelable(ChoosingProductState.class.getClassLoader());
                String string2 = parcel.readString();
                StandaloneAutotekaBlock standaloneAutotekaBlock = (StandaloneAutotekaBlock) parcel.readParcelable(ChoosingProductState.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(ProductItem.CREATOR, parcel, arrayList, iC2, 1);
                }
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new ChoosingProductState(string, attributedText, string2, standaloneAutotekaBlock, arrayList, string3, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            public final ChoosingProductState[] newArray(int i12) {
                return new ChoosingProductState[i12];
            }
        }

        public ChoosingProductState(@Y61.k String str, @Y61.l AttributedText attributedText, @Y61.k String str2, @Y61.l StandaloneAutotekaBlock standaloneAutotekaBlock, @Y61.k List<ProductItem> list, @Y61.l String str3, @Y61.l Boolean bool) {
            this.f96689b = str;
            this.f96690c = attributedText;
            this.f96691d = str2;
            this.f96692e = standaloneAutotekaBlock;
            this.f96693f = list;
            this.f96694g = str3;
            this.f96695h = bool;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChoosingProductState)) {
                return false;
            }
            ChoosingProductState choosingProductState = (ChoosingProductState) obj;
            return L.f(this.f96689b, choosingProductState.f96689b) && L.f(this.f96690c, choosingProductState.f96690c) && L.f(this.f96691d, choosingProductState.f96691d) && L.f(this.f96692e, choosingProductState.f96692e) && L.f(this.f96693f, choosingProductState.f96693f) && L.f(this.f96694g, choosingProductState.f96694g) && L.f(this.f96695h, choosingProductState.f96695h);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF80596b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF296503b() {
            return this.f96689b;
        }

        public final int hashCode() {
            int iHashCode = this.f96689b.hashCode() * 31;
            AttributedText attributedText = this.f96690c;
            int iD2 = H.d((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f96691d);
            StandaloneAutotekaBlock standaloneAutotekaBlock = this.f96692e;
            int iE2 = H.e((iD2 + (standaloneAutotekaBlock == null ? 0 : standaloneAutotekaBlock.hashCode())) * 31, 31, this.f96693f);
            String str = this.f96694g;
            int iHashCode2 = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.f96695h;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChoosingProductState(stringId=");
            sb2.append(this.f96689b);
            sb2.append(", text=");
            sb2.append(this.f96690c);
            sb2.append(", title=");
            sb2.append(this.f96691d);
            sb2.append(", standaloneAutotekaBlock=");
            sb2.append(this.f96692e);
            sb2.append(", products=");
            sb2.append(this.f96693f);
            sb2.append(", selectedItemSlug=");
            sb2.append(this.f96694g);
            sb2.append(", multiProductFlow=");
            return C0.g(sb2, this.f96695h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f96689b);
            parcel.writeParcelable(this.f96690c, i12);
            parcel.writeString(this.f96691d);
            parcel.writeParcelable(this.f96692e, i12);
            Iterator itJ = C0.j(this.f96693f, parcel);
            while (itJ.hasNext()) {
                ((ProductItem) itJ.next()).writeToParcel(parcel, i12);
            }
            parcel.writeString(this.f96694g);
            Boolean bool = this.f96695h;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ChoosingProductState(String str, AttributedText attributedText, String str2, StandaloneAutotekaBlock standaloneAutotekaBlock, List list, String str3, Boolean bool, int i12, C42822w c42822w) {
            String str4;
            if ((i12 & 1) != 0) {
                AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
                str4 = "ITEM_CHOOSING_PRODUCT";
            } else {
                str4 = str;
            }
            this(str4, attributedText, str2, standaloneAutotekaBlock, list, str3, bool);
        }
    }

    /* compiled from: ChoosingTypePurchaseState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/items/choosingProduct/ChoosingTypePurchaseState$PurchaseViaPackageState;", "Lcom/avito/android/autoteka/items/choosingProduct/ChoosingTypePurchaseState;", "Landroid/os/Parcelable;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PurchaseViaPackageState implements ChoosingTypePurchaseState, Parcelable {

        @Y61.k
        public static final Parcelable.Creator<PurchaseViaPackageState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f96696b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f96697c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final AttributedText f96698d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f96699e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final AutotekaAction f96700f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final AutotekaAction f96701g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final String f96702h;

        /* compiled from: ChoosingTypePurchaseState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PurchaseViaPackageState> {
            @Override // android.os.Parcelable.Creator
            public final PurchaseViaPackageState createFromParcel(Parcel parcel) {
                return new PurchaseViaPackageState(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(PurchaseViaPackageState.class.getClassLoader()), parcel.readInt() != 0, (AutotekaAction) parcel.readParcelable(PurchaseViaPackageState.class.getClassLoader()), (AutotekaAction) parcel.readParcelable(PurchaseViaPackageState.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PurchaseViaPackageState[] newArray(int i12) {
                return new PurchaseViaPackageState[i12];
            }
        }

        public PurchaseViaPackageState(@Y61.k String str, @Y61.k String str2, @Y61.k AttributedText attributedText, boolean z12, @Y61.l AutotekaAction autotekaAction, @Y61.l AutotekaAction autotekaAction2, @Y61.k String str3) {
            this.f96696b = str;
            this.f96697c = str2;
            this.f96698d = attributedText;
            this.f96699e = z12;
            this.f96700f = autotekaAction;
            this.f96701g = autotekaAction2;
            this.f96702h = str3;
        }

        public static PurchaseViaPackageState a(PurchaseViaPackageState purchaseViaPackageState, boolean z12) {
            String str = purchaseViaPackageState.f96696b;
            String str2 = purchaseViaPackageState.f96697c;
            AttributedText attributedText = purchaseViaPackageState.f96698d;
            AutotekaAction autotekaAction = purchaseViaPackageState.f96700f;
            AutotekaAction autotekaAction2 = purchaseViaPackageState.f96701g;
            String str3 = purchaseViaPackageState.f96702h;
            purchaseViaPackageState.getClass();
            return new PurchaseViaPackageState(str, str2, attributedText, z12, autotekaAction, autotekaAction2, str3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PurchaseViaPackageState)) {
                return false;
            }
            PurchaseViaPackageState purchaseViaPackageState = (PurchaseViaPackageState) obj;
            return L.f(this.f96696b, purchaseViaPackageState.f96696b) && L.f(this.f96697c, purchaseViaPackageState.f96697c) && L.f(this.f96698d, purchaseViaPackageState.f96698d) && this.f96699e == purchaseViaPackageState.f96699e && L.f(this.f96700f, purchaseViaPackageState.f96700f) && L.f(this.f96701g, purchaseViaPackageState.f96701g) && L.f(this.f96702h, purchaseViaPackageState.f96702h);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF80596b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF296503b() {
            return this.f96696b;
        }

        public final int hashCode() {
            int i12 = r.i(com.avito.android.actions_sheet.a.b(H.d(this.f96696b.hashCode() * 31, 31, this.f96697c), 31, this.f96698d), 31, this.f96699e);
            AutotekaAction autotekaAction = this.f96700f;
            int iHashCode = (i12 + (autotekaAction == null ? 0 : autotekaAction.hashCode())) * 31;
            AutotekaAction autotekaAction2 = this.f96701g;
            return this.f96702h.hashCode() + ((iHashCode + (autotekaAction2 != null ? autotekaAction2.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PurchaseViaPackageState(stringId=");
            sb2.append(this.f96696b);
            sb2.append(", title=");
            sb2.append(this.f96697c);
            sb2.append(", description=");
            sb2.append(this.f96698d);
            sb2.append(", isLoading=");
            sb2.append(this.f96699e);
            sb2.append(", primaryButton=");
            sb2.append(this.f96700f);
            sb2.append(", secondaryButton=");
            sb2.append(this.f96701g);
            sb2.append(", nextUsagePublicId=");
            return C22026a.c(sb2, this.f96702h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f96696b);
            parcel.writeString(this.f96697c);
            parcel.writeParcelable(this.f96698d, i12);
            parcel.writeInt(this.f96699e ? 1 : 0);
            parcel.writeParcelable(this.f96700f, i12);
            parcel.writeParcelable(this.f96701g, i12);
            parcel.writeString(this.f96702h);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ PurchaseViaPackageState(String str, String str2, AttributedText attributedText, boolean z12, AutotekaAction autotekaAction, AutotekaAction autotekaAction2, String str3, int i12, C42822w c42822w) {
            String str4;
            if ((i12 & 1) != 0) {
                AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
                str4 = "ITEM_PURCHASE_VIA_PACKAGE";
            } else {
                str4 = str;
            }
            this(str4, str2, attributedText, z12, autotekaAction, autotekaAction2, str3);
        }
    }
}
