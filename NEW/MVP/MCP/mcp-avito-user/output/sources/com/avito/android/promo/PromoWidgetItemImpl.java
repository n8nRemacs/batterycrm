package com.avito.android.promo;

import K51.d;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.lib.util.groupable_item.GroupingOutput;
import com.avito.android.promo.PromoWidgetItem;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;

/* compiled from: PromoWidgetItemImpl.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/promo/PromoWidgetItemImpl;", "Lcom/avito/android/promo/PromoWidgetItem;", "a", "_avito_bx-content_widget_promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PromoWidgetItemImpl implements PromoWidgetItem {

    @k
    public static final Parcelable.Creator<PromoWidgetItemImpl> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f231617b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f231618c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f231619d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<PromoAction> f231620e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final PromoStyle f231621f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f231622g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Analytics f231623h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final MovableImage f231624i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f231625j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final PromoAnalyticParams f231626k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f231627l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final PromoWidgetItem.ViewType f231628m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f231629n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f231630o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f231631p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final Settings f231632q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final SerpViewType f231633r;

    /* renamed from: s, reason: collision with root package name */
    public final int f231634s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final GroupingOutput f231635t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final h.b f231636u;

    /* renamed from: v, reason: collision with root package name */
    public final long f231637v;

    /* compiled from: PromoWidgetItemImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/promo/PromoWidgetItemImpl$a;", "", "<init>", "()V", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito_bx-content_widget_promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PromoWidgetItemImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PromoWidgetItemImpl> {
        @Override // android.os.Parcelable.Creator
        public final PromoWidgetItemImpl createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(PromoWidgetItemImpl.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new PromoWidgetItemImpl(string, string2, string3, arrayList, (PromoStyle) parcel.readParcelable(PromoWidgetItemImpl.class.getClassLoader()), parcel.readString(), (Analytics) parcel.readParcelable(PromoWidgetItemImpl.class.getClassLoader()), (MovableImage) parcel.readParcelable(PromoWidgetItemImpl.class.getClassLoader()), parcel.readString(), (PromoAnalyticParams) parcel.readParcelable(PromoWidgetItemImpl.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0 ? PromoWidgetItem.ViewType.valueOf(parcel.readString()) : null, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (Settings) parcel.readParcelable(PromoWidgetItemImpl.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PromoWidgetItemImpl[] newArray(int i12) {
            return new PromoWidgetItemImpl[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public PromoWidgetItemImpl(@k String str, @k String str2, @l String str3, @l List<PromoAction> list, @k PromoStyle promoStyle, @l String str4, @l Analytics analytics, @l MovableImage movableImage, @l String str5, @l PromoAnalyticParams promoAnalyticParams, boolean z12, @l PromoWidgetItem.ViewType viewType, boolean z13, boolean z14, boolean z15, @l Settings settings) {
        this.f231617b = str;
        this.f231618c = str2;
        this.f231619d = str3;
        this.f231620e = list;
        this.f231621f = promoStyle;
        this.f231622g = str4;
        this.f231623h = analytics;
        this.f231624i = movableImage;
        this.f231625j = str5;
        this.f231626k = promoAnalyticParams;
        this.f231627l = z12;
        this.f231628m = viewType;
        this.f231629n = z13;
        this.f231630o = z14;
        this.f231631p = z15;
        this.f231632q = settings;
        this.f231633r = SerpViewType.f268585e;
        this.f231634s = 6;
        this.f231635t = new GroupingOutput();
        this.f231636u = new h.b("vertical_promo", str2, str5, promoAnalyticParams != null ? promoAnalyticParams.getMcid() : null, null, analytics, 16, null);
        this.f231637v = a.C10492a.a(this);
    }

    @Override // com.avito.android.promo.PromoWidgetItem
    /* renamed from: I4, reason: from getter */
    public final boolean getF231627l() {
        return this.f231627l;
    }

    @Override // com.avito.android.promo.PromoWidgetItem
    @k
    @SuppressLint({"HardcodeStringDetector"})
    public final String J4(@k PromoAction promoAction) {
        return this.f231618c + ", " + promoAction.getTitle();
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // com.avito.android.lib.util.groupable_item.a
    /* renamed from: W, reason: from getter */
    public final boolean getF231629n() {
        return this.f231629n;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.lib.util.groupable_item.a
    @k
    /* renamed from: f, reason: from getter */
    public final GroupingOutput getF231635t() {
        return this.f231635t;
    }

    @Override // com.avito.android.promo.PromoWidgetItem
    @l
    public final List<PromoAction> getActions() {
        return this.f231620e;
    }

    @Override // com.avito.android.promo.PromoWidgetItem
    @l
    /* renamed from: getAnalyticParams, reason: from getter */
    public final PromoAnalyticParams getF231626k() {
        return this.f231626k;
    }

    @Override // com.avito.android.promo.PromoWidgetItem
    @l
    /* renamed from: getAnalytics, reason: from getter */
    public final Analytics getF231623h() {
        return this.f231623h;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition, reason: from getter */
    public final boolean getF231631p() {
        return this.f231631p;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF75315b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.promo.PromoWidgetItem
    @l
    /* renamed from: getImage, reason: from getter */
    public final String getF231622g() {
        return this.f231622g;
    }

    @Override // com.avito.android.promo.PromoWidgetItem
    @l
    /* renamed from: getPromoId, reason: from getter */
    public final String getF231625j() {
        return this.f231625j;
    }

    @Override // qs0.InterfaceC47435a
    @l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF231632q() {
        return this.f231632q;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF231634s() {
        return this.f231634s;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF231617b() {
        return this.f231617b;
    }

    @Override // com.avito.android.promo.PromoWidgetItem
    @k
    /* renamed from: getStyle, reason: from getter */
    public final PromoStyle getF231621f() {
        return this.f231621f;
    }

    @Override // com.avito.android.promo.PromoWidgetItem
    @l
    /* renamed from: getText, reason: from getter */
    public final String getF231619d() {
        return this.f231619d;
    }

    @Override // com.avito.android.promo.PromoWidgetItem
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF231618c() {
        return this.f231618c;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF231637v() {
        return this.f231637v;
    }

    @Override // com.avito.android.promo.PromoWidgetItem
    @l
    /* renamed from: getView, reason: from getter */
    public final PromoWidgetItem.ViewType getF231628m() {
        return this.f231628m;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF231633r() {
        return this.f231633r;
    }

    @Override // com.avito.android.promo.PromoWidgetItem
    @l
    /* renamed from: p4, reason: from getter */
    public final MovableImage getF231624i() {
        return this.f231624i;
    }

    @Override // is0.h
    @k
    /* renamed from: q1, reason: from getter */
    public final h.b getF231636u() {
        return this.f231636u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f231617b);
        parcel.writeString(this.f231618c);
        parcel.writeString(this.f231619d);
        List<PromoAction> list = this.f231620e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f231621f, i12);
        parcel.writeString(this.f231622g);
        parcel.writeParcelable(this.f231623h, i12);
        parcel.writeParcelable(this.f231624i, i12);
        parcel.writeString(this.f231625j);
        parcel.writeParcelable(this.f231626k, i12);
        parcel.writeInt(this.f231627l ? 1 : 0);
        PromoWidgetItem.ViewType viewType = this.f231628m;
        if (viewType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(viewType.name());
        }
        parcel.writeInt(this.f231629n ? 1 : 0);
        parcel.writeInt(this.f231630o ? 1 : 0);
        parcel.writeInt(this.f231631p ? 1 : 0);
        parcel.writeParcelable(this.f231632q, i12);
    }

    public /* synthetic */ PromoWidgetItemImpl(String str, String str2, String str3, List list, PromoStyle promoStyle, String str4, Analytics analytics, MovableImage movableImage, String str5, PromoAnalyticParams promoAnalyticParams, boolean z12, PromoWidgetItem.ViewType viewType, boolean z13, boolean z14, boolean z15, Settings settings, int i12, C42822w c42822w) {
        this(str, str2, str3, list, promoStyle, str4, (i12 & 64) != 0 ? null : analytics, (i12 & 128) != 0 ? null : movableImage, (i12 & 256) != 0 ? null : str5, (i12 & 512) != 0 ? null : promoAnalyticParams, (i12 & 1024) != 0 ? false : z12, (i12 & 2048) != 0 ? null : viewType, (i12 & 4096) != 0 ? false : z13, (i12 & 8192) != 0 ? false : z14, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? true : z15, (i12 & 32768) != 0 ? null : settings);
    }
}
