package com.avito.android.promo_snippet;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: PromoSnippetState.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/promo_snippet/PromoSnippetState;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_gig_promo-snippet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PromoSnippetState implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<PromoSnippetState> CREATOR = new b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f231720b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f231721c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f231722d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<Double> f231723e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final FooterInfo f231724f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final DeepLink f231725g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ActionButton f231726h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f231727i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f231728j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f231729k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f231730l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final String f231731m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final Y41.l<DeepLink, G0> f231732n;

    /* compiled from: PromoSnippetState.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<DeepLink, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f231733l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(DeepLink deepLink) {
            return G0.f406611a;
        }
    }

    /* compiled from: PromoSnippetState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PromoSnippetState> {
        @Override // android.os.Parcelable.Creator
        public final PromoSnippetState createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(Double.valueOf(parcel.readDouble()));
                }
                arrayList = arrayList2;
            }
            return new PromoSnippetState(string, string2, string3, arrayList, parcel.readInt() == 0 ? null : FooterInfo.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(PromoSnippetState.class.getClassLoader()), parcel.readInt() != 0 ? ActionButton.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (Y41.l) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final PromoSnippetState[] newArray(int i12) {
            return new PromoSnippetState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PromoSnippetState(@k String str, @l String str2, @l String str3, @l List<Double> list, @l FooterInfo footerInfo, @k DeepLink deepLink, @l ActionButton actionButton, boolean z12, boolean z13, boolean z14, boolean z15, @k String str4, @k Y41.l<? super DeepLink, G0> lVar) {
        this.f231720b = str;
        this.f231721c = str2;
        this.f231722d = str3;
        this.f231723e = list;
        this.f231724f = footerInfo;
        this.f231725g = deepLink;
        this.f231726h = actionButton;
        this.f231727i = z12;
        this.f231728j = z13;
        this.f231729k = z14;
        this.f231730l = z15;
        this.f231731m = str4;
        this.f231732n = lVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoSnippetState)) {
            return false;
        }
        PromoSnippetState promoSnippetState = (PromoSnippetState) obj;
        return L.f(this.f231720b, promoSnippetState.f231720b) && L.f(this.f231721c, promoSnippetState.f231721c) && L.f(this.f231722d, promoSnippetState.f231722d) && L.f(this.f231723e, promoSnippetState.f231723e) && L.f(this.f231724f, promoSnippetState.f231724f) && L.f(this.f231725g, promoSnippetState.f231725g) && L.f(this.f231726h, promoSnippetState.f231726h) && this.f231727i == promoSnippetState.f231727i && this.f231728j == promoSnippetState.f231728j && this.f231729k == promoSnippetState.f231729k && this.f231730l == promoSnippetState.f231730l && L.f(this.f231731m, promoSnippetState.f231731m) && L.f(this.f231732n, promoSnippetState.f231732n);
    }

    @Override // TV0.a
    public final long getId() {
        return getF229153b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229153b() {
        return this.f231731m;
    }

    public final int hashCode() {
        int iHashCode = this.f231720b.hashCode() * 31;
        String str = this.f231721c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f231722d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Double> list = this.f231723e;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        FooterInfo footerInfo = this.f231724f;
        int iE2 = com.avito.android.actions_sheet.a.e(this.f231725g, (iHashCode4 + (footerInfo == null ? 0 : footerInfo.hashCode())) * 31, 31);
        ActionButton actionButton = this.f231726h;
        return this.f231732n.hashCode() + H.d(r.i(r.i(r.i(r.i((iE2 + (actionButton != null ? actionButton.hashCode() : 0)) * 31, 31, this.f231727i), 31, this.f231728j), 31, this.f231729k), 31, this.f231730l), 31, this.f231731m);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PromoSnippetState(title=");
        sb2.append(this.f231720b);
        sb2.append(", subtitle=");
        sb2.append(this.f231721c);
        sb2.append(", price=");
        sb2.append(this.f231722d);
        sb2.append(", progress=");
        sb2.append(this.f231723e);
        sb2.append(", footerInfo=");
        sb2.append(this.f231724f);
        sb2.append(", deeplink=");
        sb2.append(this.f231725g);
        sb2.append(", actionButton=");
        sb2.append(this.f231726h);
        sb2.append(", showError=");
        sb2.append(this.f231727i);
        sb2.append(", showBackgroundColor=");
        sb2.append(this.f231728j);
        sb2.append(", isLocked=");
        sb2.append(this.f231729k);
        sb2.append(", useCustomCornerRadius=");
        sb2.append(this.f231730l);
        sb2.append(", stringId=");
        sb2.append(this.f231731m);
        sb2.append(", onClick=");
        return H.l(sb2, this.f231732n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f231720b);
        parcel.writeString(this.f231721c);
        parcel.writeString(this.f231722d);
        List<Double> list = this.f231723e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeDouble(((Number) itA.next()).doubleValue());
            }
        }
        FooterInfo footerInfo = this.f231724f;
        if (footerInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            footerInfo.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f231725g, i12);
        ActionButton actionButton = this.f231726h;
        if (actionButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionButton.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f231727i ? 1 : 0);
        parcel.writeInt(this.f231728j ? 1 : 0);
        parcel.writeInt(this.f231729k ? 1 : 0);
        parcel.writeInt(this.f231730l ? 1 : 0);
        parcel.writeString(this.f231731m);
        parcel.writeSerializable((Serializable) this.f231732n);
    }

    public /* synthetic */ PromoSnippetState(String str, String str2, String str3, List list, FooterInfo footerInfo, DeepLink deepLink, ActionButton actionButton, boolean z12, boolean z13, boolean z14, boolean z15, String str4, Y41.l lVar, int i12, C42822w c42822w) {
        this(str, str2, str3, list, footerInfo, deepLink, actionButton, (i12 & 128) != 0 ? false : z12, (i12 & 256) != 0 ? false : z13, (i12 & 512) != 0 ? false : z14, (i12 & 1024) != 0 ? false : z15, (i12 & 2048) != 0 ? UUID.randomUUID().toString() : str4, (i12 & 4096) != 0 ? a.f231733l : lVar);
    }
}
