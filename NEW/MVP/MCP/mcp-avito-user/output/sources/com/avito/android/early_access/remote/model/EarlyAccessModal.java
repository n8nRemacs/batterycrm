package com.avito.android.early_access.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.google.gson.annotations.c;
import com.my.tracker.ads.AdFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyAccessModalResponse.kt */
@d
@s0
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0012¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b#\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b0\u0010\"R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b2\u00103R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010:\u001a\u0004\b;\u0010<R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00104\u001a\u0004\b=\u00106¨\u0006>"}, d2 = {"Lcom/avito/android/early_access/remote/model/EarlyAccessModal;", "Landroid/os/Parcelable;", "", "orderId", "", "title", "description", "Lcom/avito/android/early_access/remote/model/Price;", "price", "Lcom/avito/android/early_access/remote/model/Legal;", "legal", "Lcom/avito/android/early_access/remote/model/Link;", "action", "Lcom/avito/android/early_access/remote/model/PopupType;", "popupType", "countdown", "Lcom/avito/android/early_access/remote/model/Banner;", AdFormat.BANNER, "", "Lcom/avito/android/early_access/remote/model/Parameter;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "Lcom/avito/android/early_access/remote/model/PackageInfo;", "packages", "Lcom/avito/android/early_access/remote/model/FakedoorInfo;", "fakedoor", "Lcom/avito/android/early_access/remote/model/EarlyAccessLegalBlock;", "legalV2", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/early_access/remote/model/Price;Lcom/avito/android/early_access/remote/model/Legal;Lcom/avito/android/early_access/remote/model/Link;Lcom/avito/android/early_access/remote/model/PopupType;Ljava/lang/String;Lcom/avito/android/early_access/remote/model/Banner;Ljava/util/List;Lcom/avito/android/early_access/remote/model/PackageInfo;Lcom/avito/android/early_access/remote/model/FakedoorInfo;Ljava/util/List;)V", "Ljava/lang/Long;", "getOrderId", "()Ljava/lang/Long;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Lcom/avito/android/early_access/remote/model/Price;", "getPrice", "()Lcom/avito/android/early_access/remote/model/Price;", "Lcom/avito/android/early_access/remote/model/Legal;", "getLegal", "()Lcom/avito/android/early_access/remote/model/Legal;", "Lcom/avito/android/early_access/remote/model/Link;", "getAction", "()Lcom/avito/android/early_access/remote/model/Link;", "Lcom/avito/android/early_access/remote/model/PopupType;", "getPopupType", "()Lcom/avito/android/early_access/remote/model/PopupType;", "getCountdown", "Lcom/avito/android/early_access/remote/model/Banner;", "getBanner", "()Lcom/avito/android/early_access/remote/model/Banner;", "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "Lcom/avito/android/early_access/remote/model/PackageInfo;", "getPackages", "()Lcom/avito/android/early_access/remote/model/PackageInfo;", "Lcom/avito/android/early_access/remote/model/FakedoorInfo;", "getFakedoor", "()Lcom/avito/android/early_access/remote/model/FakedoorInfo;", "getLegalV2", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EarlyAccessModal implements Parcelable {

    @k
    public static final Parcelable.Creator<EarlyAccessModal> CREATOR = new a();

    @c("action")
    @l
    private final Link action;

    @c(AdFormat.BANNER)
    @l
    private final Banner banner;

    @c("countdown")
    @l
    private final String countdown;

    @c("description")
    @l
    private final String description;

    @c("fakedoor")
    @l
    private final FakedoorInfo fakedoor;

    @c("legal")
    @l
    private final Legal legal;

    @c("legalV2")
    @l
    private final List<EarlyAccessLegalBlock> legalV2;

    @c("orderId")
    @l
    private final Long orderId;

    @c("packages")
    @l
    private final PackageInfo packages;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @l
    private final List<Parameter> parameters;

    @c("popupTypeV2")
    @l
    private final PopupType popupType;

    @c("price")
    @l
    private final Price price;

    @c("title")
    @l
    private final String title;

    /* compiled from: EarlyAccessModalResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessModal> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessModal createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            FakedoorInfo fakedoorInfo;
            ArrayList arrayList2;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            Price priceCreateFromParcel = parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel);
            Legal legalCreateFromParcel = parcel.readInt() == 0 ? null : Legal.CREATOR.createFromParcel(parcel);
            Link linkCreateFromParcel = parcel.readInt() == 0 ? null : Link.CREATOR.createFromParcel(parcel);
            PopupType popupTypeValueOf = parcel.readInt() == 0 ? null : PopupType.valueOf(parcel.readString());
            String string3 = parcel.readString();
            Banner bannerCreateFromParcel = parcel.readInt() == 0 ? null : Banner.CREATOR.createFromParcel(parcel);
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = com.avito.android.actions_sheet.a.c(Parameter.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            PackageInfo packageInfoCreateFromParcel = parcel.readInt() == 0 ? null : PackageInfo.CREATOR.createFromParcel(parcel);
            FakedoorInfo fakedoorInfoCreateFromParcel = parcel.readInt() == 0 ? null : FakedoorInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                fakedoorInfo = fakedoorInfoCreateFromParcel;
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(EarlyAccessLegalBlock.CREATOR, parcel, arrayList3, iC2, 1);
                    i13 = i13;
                    fakedoorInfoCreateFromParcel = fakedoorInfoCreateFromParcel;
                }
                fakedoorInfo = fakedoorInfoCreateFromParcel;
                arrayList2 = arrayList3;
            }
            return new EarlyAccessModal(lValueOf, string, string2, priceCreateFromParcel, legalCreateFromParcel, linkCreateFromParcel, popupTypeValueOf, string3, bannerCreateFromParcel, arrayList, packageInfoCreateFromParcel, fakedoorInfo, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessModal[] newArray(int i12) {
            return new EarlyAccessModal[i12];
        }
    }

    /* compiled from: EarlyAccessModalResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f145570a;

        static {
            int[] iArr = new int[PopupType.values().length];
            try {
                iArr[PopupType.POPUP_PURCHASE_NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PopupType.POPUP_PURCHASE_PACKAGES_SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PopupType.POPUP_PURCHASE_PACKAGES_LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PopupType.POPUP_EA_BUNDLES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PopupType.POPUP_SECRET_ITEMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f145570a = iArr;
        }
    }

    public EarlyAccessModal(@l Long l12, @l String str, @l String str2, @l Price price, @l Legal legal, @l Link link, @l PopupType popupType, @l String str3, @l Banner banner, @l List<Parameter> list, @l PackageInfo packageInfo, @l FakedoorInfo fakedoorInfo, @l List<EarlyAccessLegalBlock> list2) {
        this.orderId = l12;
        this.title = str;
        this.description = str2;
        this.price = price;
        this.legal = legal;
        this.action = link;
        this.popupType = popupType;
        this.countdown = str3;
        this.banner = banner;
        this.parameters = list;
        this.packages = packageInfo;
        this.fakedoor = fakedoorInfo;
        this.legalV2 = list2;
    }

    @k
    public final ReEarlyAccessData a(@k String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        PopupType popupType = this.popupType;
        int i12 = popupType == null ? -1 : b.f145570a[popupType.ordinal()];
        ReEarlyAccessData.PopupType popupType2 = i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? i12 != 5 ? ReEarlyAccessData.PopupType.f145373c : ReEarlyAccessData.PopupType.f145378h : ReEarlyAccessData.PopupType.f145377g : ReEarlyAccessData.PopupType.f145376f : ReEarlyAccessData.PopupType.f145375e : ReEarlyAccessData.PopupType.f145374d;
        Long l12 = this.orderId;
        String str2 = this.title;
        String str3 = this.description;
        Price price = this.price;
        List listSingletonList = Collections.singletonList(price != null ? price.c() : null);
        Legal legal = this.legal;
        ReEarlyAccessData.Legal legalC = legal != null ? legal.c() : null;
        List<EarlyAccessLegalBlock> list = this.legalV2;
        if (list != null) {
            List<EarlyAccessLegalBlock> list2 = list;
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((EarlyAccessLegalBlock) it.next()).c());
            }
        } else {
            arrayList = null;
        }
        Link link = this.action;
        ReEarlyAccessData.Link linkC = link != null ? link.c() : null;
        List<Parameter> list3 = this.parameters;
        if (list3 != null) {
            List<Parameter> list4 = list3;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((Parameter) it2.next()).c());
            }
            arrayList2 = arrayList3;
        } else {
            arrayList2 = null;
        }
        Banner banner = this.banner;
        ReEarlyAccessData.BannerData bannerDataC = banner != null ? banner.c() : null;
        String str4 = this.countdown;
        PackageInfo packageInfo = this.packages;
        ReEarlyAccessData.PackagesInfo packagesInfoC = packageInfo != null ? packageInfo.c() : null;
        FakedoorInfo fakedoorInfo = this.fakedoor;
        return new ReEarlyAccessData(str, l12, str2, listSingletonList, legalC, arrayList, linkC, str4, str3, popupType2, bannerDataC, arrayList2, packagesInfoC, fakedoorInfo != null ? fakedoorInfo.c() : null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyAccessModal)) {
            return false;
        }
        EarlyAccessModal earlyAccessModal = (EarlyAccessModal) obj;
        return L.f(this.orderId, earlyAccessModal.orderId) && L.f(this.title, earlyAccessModal.title) && L.f(this.description, earlyAccessModal.description) && L.f(this.price, earlyAccessModal.price) && L.f(this.legal, earlyAccessModal.legal) && L.f(this.action, earlyAccessModal.action) && this.popupType == earlyAccessModal.popupType && L.f(this.countdown, earlyAccessModal.countdown) && L.f(this.banner, earlyAccessModal.banner) && L.f(this.parameters, earlyAccessModal.parameters) && L.f(this.packages, earlyAccessModal.packages) && L.f(this.fakedoor, earlyAccessModal.fakedoor) && L.f(this.legalV2, earlyAccessModal.legalV2);
    }

    public final int hashCode() {
        Long l12 = this.orderId;
        int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Price price = this.price;
        int iHashCode4 = (iHashCode3 + (price == null ? 0 : price.hashCode())) * 31;
        Legal legal = this.legal;
        int iHashCode5 = (iHashCode4 + (legal == null ? 0 : legal.hashCode())) * 31;
        Link link = this.action;
        int iHashCode6 = (iHashCode5 + (link == null ? 0 : link.hashCode())) * 31;
        PopupType popupType = this.popupType;
        int iHashCode7 = (iHashCode6 + (popupType == null ? 0 : popupType.hashCode())) * 31;
        String str3 = this.countdown;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Banner banner = this.banner;
        int iHashCode9 = (iHashCode8 + (banner == null ? 0 : banner.hashCode())) * 31;
        List<Parameter> list = this.parameters;
        int iHashCode10 = (iHashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        PackageInfo packageInfo = this.packages;
        int iHashCode11 = (iHashCode10 + (packageInfo == null ? 0 : packageInfo.hashCode())) * 31;
        FakedoorInfo fakedoorInfo = this.fakedoor;
        int iHashCode12 = (iHashCode11 + (fakedoorInfo == null ? 0 : fakedoorInfo.hashCode())) * 31;
        List<EarlyAccessLegalBlock> list2 = this.legalV2;
        return iHashCode12 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EarlyAccessModal(orderId=");
        sb2.append(this.orderId);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", legal=");
        sb2.append(this.legal);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", popupType=");
        sb2.append(this.popupType);
        sb2.append(", countdown=");
        sb2.append(this.countdown);
        sb2.append(", banner=");
        sb2.append(this.banner);
        sb2.append(", parameters=");
        sb2.append(this.parameters);
        sb2.append(", packages=");
        sb2.append(this.packages);
        sb2.append(", fakedoor=");
        sb2.append(this.fakedoor);
        sb2.append(", legalV2=");
        return H.p(sb2, this.legalV2, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Long l12 = this.orderId;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Price price = this.price;
        if (price == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            price.writeToParcel(parcel, i12);
        }
        Legal legal = this.legal;
        if (legal == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            legal.writeToParcel(parcel, i12);
        }
        Link link = this.action;
        if (link == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            link.writeToParcel(parcel, i12);
        }
        PopupType popupType = this.popupType;
        if (popupType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(popupType.name());
        }
        parcel.writeString(this.countdown);
        Banner banner = this.banner;
        if (banner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            banner.writeToParcel(parcel, i12);
        }
        List<Parameter> list = this.parameters;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Parameter) itA.next()).writeToParcel(parcel, i12);
            }
        }
        PackageInfo packageInfo = this.packages;
        if (packageInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            packageInfo.writeToParcel(parcel, i12);
        }
        FakedoorInfo fakedoorInfo = this.fakedoor;
        if (fakedoorInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fakedoorInfo.writeToParcel(parcel, i12);
        }
        List<EarlyAccessLegalBlock> list2 = this.legalV2;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            ((EarlyAccessLegalBlock) itA2.next()).writeToParcel(parcel, i12);
        }
    }
}
