package com.avito.android.serp.adapter.sale;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.sales.SalesHeaderWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: SaleHeaderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/sale/SaleHeaderItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lqs0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SaleHeaderItem implements PersistableSerpItem, InterfaceC47435a {

    @Y61.k
    public static final Parcelable.Creator<SaleHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AttributedText f271468b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AttributedText f271469c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SalesHeaderWidget.Style f271470d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f271471e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final SalesHeaderWidget.Timer f271472f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f271473g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f271474h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SalesHeaderWidget.ImageDisplayMode f271475i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final List<PersistableSerpItem> f271476j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final String f271477k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Analytics f271478l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final Settings f271479m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f271480n;

    /* renamed from: o, reason: collision with root package name */
    public final int f271481o;

    /* compiled from: SaleHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SaleHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final SaleHeaderItem createFromParcel(Parcel parcel) {
            AttributedText attributedText = (AttributedText) parcel.readParcelable(SaleHeaderItem.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(SaleHeaderItem.class.getClassLoader());
            SalesHeaderWidget.Style style = (SalesHeaderWidget.Style) parcel.readParcelable(SaleHeaderItem.class.getClassLoader());
            String string = parcel.readString();
            SalesHeaderWidget.Timer timer = (SalesHeaderWidget.Timer) parcel.readParcelable(SaleHeaderItem.class.getClassLoader());
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(SaleHeaderItem.class.getClassLoader());
            UniversalImage universalImage2 = (UniversalImage) parcel.readParcelable(SaleHeaderItem.class.getClassLoader());
            SalesHeaderWidget.ImageDisplayMode imageDisplayModeValueOf = SalesHeaderWidget.ImageDisplayMode.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(SaleHeaderItem.class, parcel, arrayList, iL2, 1);
            }
            return new SaleHeaderItem(attributedText, attributedText2, style, string, timer, universalImage, universalImage2, imageDisplayModeValueOf, arrayList, parcel.readString(), (Analytics) parcel.readParcelable(SaleHeaderItem.class.getClassLoader()), (Settings) parcel.readParcelable(SaleHeaderItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SaleHeaderItem[] newArray(int i12) {
            return new SaleHeaderItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SaleHeaderItem(@Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.k SalesHeaderWidget.Style style, @Y61.l String str, @Y61.l SalesHeaderWidget.Timer timer, @Y61.l UniversalImage universalImage, @Y61.l UniversalImage universalImage2, @Y61.k SalesHeaderWidget.ImageDisplayMode imageDisplayMode, @Y61.k List<? extends PersistableSerpItem> list, @Y61.k String str2, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.f271468b = attributedText;
        this.f271469c = attributedText2;
        this.f271470d = style;
        this.f271471e = str;
        this.f271472f = timer;
        this.f271473g = universalImage;
        this.f271474h = universalImage2;
        this.f271475i = imageDisplayMode;
        this.f271476j = list;
        this.f271477k = str2;
        this.f271478l = analytics;
        this.f271479m = settings;
        this.f271480n = SerpViewType.f268585e;
        this.f271481o = 6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SaleHeaderItem)) {
            return false;
        }
        SaleHeaderItem saleHeaderItem = (SaleHeaderItem) obj;
        return L.f(this.f271468b, saleHeaderItem.f271468b) && L.f(this.f271469c, saleHeaderItem.f271469c) && L.f(this.f271470d, saleHeaderItem.f271470d) && L.f(this.f271471e, saleHeaderItem.f271471e) && L.f(this.f271472f, saleHeaderItem.f271472f) && L.f(this.f271473g, saleHeaderItem.f271473g) && L.f(this.f271474h, saleHeaderItem.f271474h) && this.f271475i == saleHeaderItem.f271475i && L.f(this.f271476j, saleHeaderItem.f271476j) && L.f(this.f271477k, saleHeaderItem.f271477k) && L.f(this.f271478l, saleHeaderItem.f271478l) && L.f(this.f271479m, saleHeaderItem.f271479m);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272775j() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF270893b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF272772g() {
        return this.f271479m;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF272774i() {
        return this.f271481o;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272767b() {
        return this.f271477k;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF272773h() {
        return this.f271480n;
    }

    public final int hashCode() {
        AttributedText attributedText = this.f271468b;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.f271469c;
        int iHashCode2 = (this.f271470d.hashCode() + ((iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31)) * 31;
        String str = this.f271471e;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        SalesHeaderWidget.Timer timer = this.f271472f;
        int iHashCode4 = (iHashCode3 + (timer == null ? 0 : timer.hashCode())) * 31;
        UniversalImage universalImage = this.f271473g;
        int iHashCode5 = (iHashCode4 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        UniversalImage universalImage2 = this.f271474h;
        int iD2 = H.d(H.e((this.f271475i.hashCode() + ((iHashCode5 + (universalImage2 == null ? 0 : universalImage2.hashCode())) * 31)) * 31, 31, this.f271476j), 31, this.f271477k);
        Analytics analytics = this.f271478l;
        int iHashCode6 = (iD2 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f271479m;
        return iHashCode6 + (settings != null ? settings.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SaleHeaderItem(title=");
        sb2.append(this.f271468b);
        sb2.append(", subtitle=");
        sb2.append(this.f271469c);
        sb2.append(", style=");
        sb2.append(this.f271470d);
        sb2.append(", stickerText=");
        sb2.append(this.f271471e);
        sb2.append(", timer=");
        sb2.append(this.f271472f);
        sb2.append(", image=");
        sb2.append(this.f271473g);
        sb2.append(", bottomImage=");
        sb2.append(this.f271474h);
        sb2.append(", imageDisplayMode=");
        sb2.append(this.f271475i);
        sb2.append(", internalWidgets=");
        sb2.append(this.f271476j);
        sb2.append(", stringId=");
        sb2.append(this.f271477k);
        sb2.append(", analytics=");
        sb2.append(this.f271478l);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f271479m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f271468b, i12);
        parcel.writeParcelable(this.f271469c, i12);
        parcel.writeParcelable(this.f271470d, i12);
        parcel.writeString(this.f271471e);
        parcel.writeParcelable(this.f271472f, i12);
        parcel.writeParcelable(this.f271473g, i12);
        parcel.writeParcelable(this.f271474h, i12);
        parcel.writeString(this.f271475i.name());
        Iterator itJ = C0.j(this.f271476j, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f271477k);
        parcel.writeParcelable(this.f271478l, i12);
        parcel.writeParcelable(this.f271479m, i12);
    }

    public /* synthetic */ SaleHeaderItem(AttributedText attributedText, AttributedText attributedText2, SalesHeaderWidget.Style style, String str, SalesHeaderWidget.Timer timer, UniversalImage universalImage, UniversalImage universalImage2, SalesHeaderWidget.ImageDisplayMode imageDisplayMode, List list, String str2, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(attributedText, attributedText2, style, str, timer, universalImage, universalImage2, imageDisplayMode, list, (i12 & 512) != 0 ? UUID.randomUUID().toString() : str2, (i12 & 1024) != 0 ? null : analytics, (i12 & 2048) != 0 ? null : settings);
    }
}
