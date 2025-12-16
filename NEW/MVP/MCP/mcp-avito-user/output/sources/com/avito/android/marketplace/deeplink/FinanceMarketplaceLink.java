package com.avito.android.marketplace.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: FinanceMarketplaceLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/marketplace/deeplink/FinanceMarketplaceLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final class FinanceMarketplaceLink extends DeepLink {

    @k
    public static final Parcelable.Creator<FinanceMarketplaceLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f185886b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f185887c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f185888d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f185889e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f185890f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final FinanceMarketplaceWebViewPresentationMode f185891g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Boolean f185892h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Boolean f185893i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Boolean f185894j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Boolean f185895k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final FinanceMarketplaceWebViewDialogData f185896l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final List<FinanceMarketplaceWebViewAction> f185897m;

    /* compiled from: FinanceMarketplaceLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FinanceMarketplaceLink> {
        @Override // android.os.Parcelable.Creator
        public final FinanceMarketplaceLink createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            FinanceMarketplaceWebViewPresentationMode financeMarketplaceWebViewPresentationModeCreateFromParcel = parcel.readInt() == 0 ? null : FinanceMarketplaceWebViewPresentationMode.CREATOR.createFromParcel(parcel);
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            FinanceMarketplaceWebViewDialogData financeMarketplaceWebViewDialogDataCreateFromParcel = parcel.readInt() == 0 ? null : FinanceMarketplaceWebViewDialogData.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(FinanceMarketplaceWebViewAction.CREATOR, parcel, arrayList2, iC2, 1);
                    i12 = i12;
                }
                arrayList = arrayList2;
            }
            return new FinanceMarketplaceLink(string, string2, string3, string4, string5, financeMarketplaceWebViewPresentationModeCreateFromParcel, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, financeMarketplaceWebViewDialogDataCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FinanceMarketplaceLink[] newArray(int i12) {
            return new FinanceMarketplaceLink[i12];
        }
    }

    public FinanceMarketplaceLink(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, @l FinanceMarketplaceWebViewPresentationMode financeMarketplaceWebViewPresentationMode, @l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l Boolean bool4, @l FinanceMarketplaceWebViewDialogData financeMarketplaceWebViewDialogData, @l List<FinanceMarketplaceWebViewAction> list) {
        this.f185886b = str;
        this.f185887c = str2;
        this.f185888d = str3;
        this.f185889e = str4;
        this.f185890f = str5;
        this.f185891g = financeMarketplaceWebViewPresentationMode;
        this.f185892h = bool;
        this.f185893i = bool2;
        this.f185894j = bool3;
        this.f185895k = bool4;
        this.f185896l = financeMarketplaceWebViewDialogData;
        this.f185897m = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f185886b);
        parcel.writeString(this.f185887c);
        parcel.writeString(this.f185888d);
        parcel.writeString(this.f185889e);
        parcel.writeString(this.f185890f);
        FinanceMarketplaceWebViewPresentationMode financeMarketplaceWebViewPresentationMode = this.f185891g;
        if (financeMarketplaceWebViewPresentationMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            financeMarketplaceWebViewPresentationMode.writeToParcel(parcel, i12);
        }
        Boolean bool = this.f185892h;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.f185893i;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this.f185894j;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        Boolean bool4 = this.f185895k;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool4);
        }
        FinanceMarketplaceWebViewDialogData financeMarketplaceWebViewDialogData = this.f185896l;
        if (financeMarketplaceWebViewDialogData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            financeMarketplaceWebViewDialogData.writeToParcel(parcel, i12);
        }
        List<FinanceMarketplaceWebViewAction> list = this.f185897m;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((FinanceMarketplaceWebViewAction) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
