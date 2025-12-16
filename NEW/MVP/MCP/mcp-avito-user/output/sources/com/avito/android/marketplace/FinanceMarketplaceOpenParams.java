package com.avito.android.marketplace;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.marketplace.deeplink.FinanceMarketplaceWebViewAction;
import com.avito.android.marketplace.deeplink.FinanceMarketplaceWebViewDialogData;
import com.avito.android.marketplace.deeplink.FinanceMarketplaceWebViewPresentationMode;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FinanceMarketplaceOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/marketplace/FinanceMarketplaceOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FinanceMarketplaceOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<FinanceMarketplaceOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f185869b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f185870c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f185871d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f185872e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f185873f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final FinanceMarketplaceWebViewPresentationMode f185874g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f185875h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f185876i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f185877j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f185878k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final FinanceMarketplaceWebViewDialogData f185879l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final List<FinanceMarketplaceWebViewAction> f185880m;

    /* compiled from: FinanceMarketplaceOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FinanceMarketplaceOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final FinanceMarketplaceOpenParams createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            FinanceMarketplaceWebViewPresentationMode financeMarketplaceWebViewPresentationModeCreateFromParcel = parcel.readInt() == 0 ? null : FinanceMarketplaceWebViewPresentationMode.CREATOR.createFromParcel(parcel);
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
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
            return new FinanceMarketplaceOpenParams(string, string2, string3, string4, string5, financeMarketplaceWebViewPresentationModeCreateFromParcel, z12, z13, z14, z15, financeMarketplaceWebViewDialogDataCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final FinanceMarketplaceOpenParams[] newArray(int i12) {
            return new FinanceMarketplaceOpenParams[i12];
        }
    }

    public FinanceMarketplaceOpenParams(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l FinanceMarketplaceWebViewPresentationMode financeMarketplaceWebViewPresentationMode, boolean z12, boolean z13, boolean z14, boolean z15, @Y61.l FinanceMarketplaceWebViewDialogData financeMarketplaceWebViewDialogData, @Y61.l List<FinanceMarketplaceWebViewAction> list) {
        this.f185869b = str;
        this.f185870c = str2;
        this.f185871d = str3;
        this.f185872e = str4;
        this.f185873f = str5;
        this.f185874g = financeMarketplaceWebViewPresentationMode;
        this.f185875h = z12;
        this.f185876i = z13;
        this.f185877j = z14;
        this.f185878k = z15;
        this.f185879l = financeMarketplaceWebViewDialogData;
        this.f185880m = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f185869b);
        parcel.writeString(this.f185870c);
        parcel.writeString(this.f185871d);
        parcel.writeString(this.f185872e);
        parcel.writeString(this.f185873f);
        FinanceMarketplaceWebViewPresentationMode financeMarketplaceWebViewPresentationMode = this.f185874g;
        if (financeMarketplaceWebViewPresentationMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            financeMarketplaceWebViewPresentationMode.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f185875h ? 1 : 0);
        parcel.writeInt(this.f185876i ? 1 : 0);
        parcel.writeInt(this.f185877j ? 1 : 0);
        parcel.writeInt(this.f185878k ? 1 : 0);
        FinanceMarketplaceWebViewDialogData financeMarketplaceWebViewDialogData = this.f185879l;
        if (financeMarketplaceWebViewDialogData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            financeMarketplaceWebViewDialogData.writeToParcel(parcel, i12);
        }
        List<FinanceMarketplaceWebViewAction> list = this.f185880m;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((FinanceMarketplaceWebViewAction) itA.next()).writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ FinanceMarketplaceOpenParams(String str, String str2, String str3, String str4, String str5, FinanceMarketplaceWebViewPresentationMode financeMarketplaceWebViewPresentationMode, boolean z12, boolean z13, boolean z14, boolean z15, FinanceMarketplaceWebViewDialogData financeMarketplaceWebViewDialogData, List list, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, str5, (i12 & 32) != 0 ? FinanceMarketplaceWebViewPresentationMode.Modal : financeMarketplaceWebViewPresentationMode, z12, z13, z14, z15, financeMarketplaceWebViewDialogData, list);
    }
}
