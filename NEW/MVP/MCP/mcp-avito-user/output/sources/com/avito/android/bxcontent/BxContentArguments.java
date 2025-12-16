package com.avito.android.bxcontent;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.AnalyticParams;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bxcontent.model.AdvertListAdditionalTopics;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.remote.model.search.map.Area;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: BxContentFragment.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/BxContentArguments;", "Landroid/os/Parcelable;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BxContentArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BxContentArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f108863b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final SearchParams f108864c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f108865d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final TreeClickStreamParent f108866e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f108867f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final PresentationType f108868g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Class<? extends com.avito.android.serp.adapter.l1> f108869h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f108870i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final List<String> f108871j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final SerpSpaceType f108872k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f108873l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final NavigationBarStyle f108874m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final Boolean f108875n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final List<String> f108876o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final AnalyticParams f108877p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final String f108878q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final String f108879r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final AdvertListAdditionalTopics f108880s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final String f108881t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final Area f108882u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final String f108883v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final Float f108884w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final NavigationScreenAction f108885x;

    /* compiled from: BxContentFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BxContentArguments> {
        @Override // android.os.Parcelable.Creator
        public final BxContentArguments createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            SearchParams searchParams = (SearchParams) parcel.readParcelable(BxContentArguments.class.getClassLoader());
            String string2 = parcel.readString();
            TreeClickStreamParent treeClickStreamParent = (TreeClickStreamParent) parcel.readParcelable(BxContentArguments.class.getClassLoader());
            String string3 = parcel.readString();
            PresentationType presentationTypeValueOf = PresentationType.valueOf(parcel.readString());
            Class cls = (Class) parcel.readSerializable();
            String string4 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            SerpSpaceType serpSpaceTypeValueOf = parcel.readInt() == 0 ? null : SerpSpaceType.valueOf(parcel.readString());
            boolean z12 = parcel.readInt() != 0;
            NavigationBarStyle navigationBarStyle = (NavigationBarStyle) parcel.readParcelable(BxContentArguments.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BxContentArguments(string, searchParams, string2, treeClickStreamParent, string3, presentationTypeValueOf, cls, string4, arrayListCreateStringArrayList, serpSpaceTypeValueOf, z12, navigationBarStyle, boolValueOf, parcel.createStringArrayList(), (AnalyticParams) parcel.readParcelable(BxContentArguments.class.getClassLoader()), parcel.readString(), parcel.readString(), (AdvertListAdditionalTopics) parcel.readParcelable(BxContentArguments.class.getClassLoader()), parcel.readString(), (Area) parcel.readParcelable(BxContentArguments.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), (NavigationScreenAction) parcel.readParcelable(BxContentArguments.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BxContentArguments[] newArray(int i12) {
            return new BxContentArguments[i12];
        }
    }

    public BxContentArguments() {
        this(null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 8388607, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BxContentArguments)) {
            return false;
        }
        BxContentArguments bxContentArguments = (BxContentArguments) obj;
        return kotlin.jvm.internal.L.f(this.f108863b, bxContentArguments.f108863b) && kotlin.jvm.internal.L.f(this.f108864c, bxContentArguments.f108864c) && kotlin.jvm.internal.L.f(this.f108865d, bxContentArguments.f108865d) && kotlin.jvm.internal.L.f(this.f108866e, bxContentArguments.f108866e) && kotlin.jvm.internal.L.f(this.f108867f, bxContentArguments.f108867f) && this.f108868g == bxContentArguments.f108868g && kotlin.jvm.internal.L.f(this.f108869h, bxContentArguments.f108869h) && kotlin.jvm.internal.L.f(this.f108870i, bxContentArguments.f108870i) && kotlin.jvm.internal.L.f(this.f108871j, bxContentArguments.f108871j) && this.f108872k == bxContentArguments.f108872k && this.f108873l == bxContentArguments.f108873l && kotlin.jvm.internal.L.f(this.f108874m, bxContentArguments.f108874m) && kotlin.jvm.internal.L.f(this.f108875n, bxContentArguments.f108875n) && kotlin.jvm.internal.L.f(this.f108876o, bxContentArguments.f108876o) && kotlin.jvm.internal.L.f(this.f108877p, bxContentArguments.f108877p) && kotlin.jvm.internal.L.f(this.f108878q, bxContentArguments.f108878q) && kotlin.jvm.internal.L.f(this.f108879r, bxContentArguments.f108879r) && kotlin.jvm.internal.L.f(this.f108880s, bxContentArguments.f108880s) && kotlin.jvm.internal.L.f(this.f108881t, bxContentArguments.f108881t) && kotlin.jvm.internal.L.f(this.f108882u, bxContentArguments.f108882u) && kotlin.jvm.internal.L.f(this.f108883v, bxContentArguments.f108883v) && kotlin.jvm.internal.L.f(this.f108884w, bxContentArguments.f108884w) && this.f108885x == bxContentArguments.f108885x;
    }

    public final int hashCode() {
        String str = this.f108863b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        SearchParams searchParams = this.f108864c;
        int iHashCode2 = (iHashCode + (searchParams == null ? 0 : searchParams.hashCode())) * 31;
        String str2 = this.f108865d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TreeClickStreamParent treeClickStreamParent = this.f108866e;
        int iHashCode4 = (iHashCode3 + (treeClickStreamParent == null ? 0 : treeClickStreamParent.hashCode())) * 31;
        String str3 = this.f108867f;
        int iHashCode5 = (this.f108868g.hashCode() + ((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        Class<? extends com.avito.android.serp.adapter.l1> cls = this.f108869h;
        int iD2 = androidx.compose.foundation.H.d((iHashCode5 + (cls == null ? 0 : cls.hashCode())) * 31, 31, this.f108870i);
        List<String> list = this.f108871j;
        int iHashCode6 = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
        SerpSpaceType serpSpaceType = this.f108872k;
        int i12 = androidx.appcompat.app.r.i((iHashCode6 + (serpSpaceType == null ? 0 : serpSpaceType.hashCode())) * 31, 31, this.f108873l);
        NavigationBarStyle navigationBarStyle = this.f108874m;
        int iHashCode7 = (i12 + (navigationBarStyle == null ? 0 : navigationBarStyle.hashCode())) * 31;
        Boolean bool = this.f108875n;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list2 = this.f108876o;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AnalyticParams analyticParams = this.f108877p;
        int iHashCode10 = (iHashCode9 + (analyticParams == null ? 0 : analyticParams.hashCode())) * 31;
        String str4 = this.f108878q;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f108879r;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AdvertListAdditionalTopics advertListAdditionalTopics = this.f108880s;
        int iHashCode13 = (iHashCode12 + (advertListAdditionalTopics == null ? 0 : advertListAdditionalTopics.hashCode())) * 31;
        String str6 = this.f108881t;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Area area = this.f108882u;
        int iHashCode15 = (iHashCode14 + (area == null ? 0 : area.hashCode())) * 31;
        String str7 = this.f108883v;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Float f12 = this.f108884w;
        return this.f108885x.hashCode() + ((iHashCode16 + (f12 != null ? f12.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "BxContentArguments(subscriptionId=" + this.f108863b + ", searchParams=" + this.f108864c + ", context=" + this.f108865d + ", treeParent=" + this.f108866e + ", fromPage=" + this.f108867f + ", presentationType=" + this.f108868g + ", typeOfFirstItemToScroll=" + this.f108869h + ", onboardingId=" + this.f108870i + ", inlinesOrder=" + this.f108871j + ", serpSpaceType=" + this.f108872k + ", autoOpenSuggest=" + this.f108873l + ", navigationBarStyle=" + this.f108874m + ", stayInAppOnBack=" + this.f108875n + ", itemIds=" + this.f108876o + ", analyticParams=" + this.f108877p + ", title=" + this.f108878q + ", subtitle=" + this.f108879r + ", advertListAdditionalTopics=" + this.f108880s + ", src=" + this.f108881t + ", area=" + this.f108882u + ", mapSerpState=" + this.f108883v + ", mapZoomLevel=" + this.f108884w + ", currentScreenAction=" + this.f108885x + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f108863b);
        parcel.writeParcelable(this.f108864c, i12);
        parcel.writeString(this.f108865d);
        parcel.writeParcelable(this.f108866e, i12);
        parcel.writeString(this.f108867f);
        parcel.writeString(this.f108868g.name());
        parcel.writeSerializable(this.f108869h);
        parcel.writeString(this.f108870i);
        parcel.writeStringList(this.f108871j);
        SerpSpaceType serpSpaceType = this.f108872k;
        if (serpSpaceType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(serpSpaceType.name());
        }
        parcel.writeInt(this.f108873l ? 1 : 0);
        parcel.writeParcelable(this.f108874m, i12);
        Boolean bool = this.f108875n;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            com.akita.compose.theme.re23.style.C0.l(parcel, 1, bool);
        }
        parcel.writeStringList(this.f108876o);
        parcel.writeParcelable(this.f108877p, i12);
        parcel.writeString(this.f108878q);
        parcel.writeString(this.f108879r);
        parcel.writeParcelable(this.f108880s, i12);
        parcel.writeString(this.f108881t);
        parcel.writeParcelable(this.f108882u, i12);
        parcel.writeString(this.f108883v);
        Float f12 = this.f108884w;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.B(parcel, 1, f12);
        }
        parcel.writeParcelable(this.f108885x, i12);
    }

    public BxContentArguments(@Y61.l String str, @Y61.l SearchParams searchParams, @Y61.l String str2, @Y61.l TreeClickStreamParent treeClickStreamParent, @Y61.l String str3, @Y61.k PresentationType presentationType, @Y61.l Class<? extends com.avito.android.serp.adapter.l1> cls, @Y61.k String str4, @Y61.l List<String> list, @Y61.l SerpSpaceType serpSpaceType, boolean z12, @Y61.l NavigationBarStyle navigationBarStyle, @Y61.l Boolean bool, @Y61.l List<String> list2, @Y61.l AnalyticParams analyticParams, @Y61.l String str5, @Y61.l String str6, @Y61.l AdvertListAdditionalTopics advertListAdditionalTopics, @Y61.l String str7, @Y61.l Area area, @Y61.l String str8, @Y61.l Float f12, @Y61.k NavigationScreenAction navigationScreenAction) {
        this.f108863b = str;
        this.f108864c = searchParams;
        this.f108865d = str2;
        this.f108866e = treeClickStreamParent;
        this.f108867f = str3;
        this.f108868g = presentationType;
        this.f108869h = cls;
        this.f108870i = str4;
        this.f108871j = list;
        this.f108872k = serpSpaceType;
        this.f108873l = z12;
        this.f108874m = navigationBarStyle;
        this.f108875n = bool;
        this.f108876o = list2;
        this.f108877p = analyticParams;
        this.f108878q = str5;
        this.f108879r = str6;
        this.f108880s = advertListAdditionalTopics;
        this.f108881t = str7;
        this.f108882u = area;
        this.f108883v = str8;
        this.f108884w = f12;
        this.f108885x = navigationScreenAction;
    }

    public /* synthetic */ BxContentArguments(String str, SearchParams searchParams, String str2, TreeClickStreamParent treeClickStreamParent, String str3, PresentationType presentationType, Class cls, String str4, List list, SerpSpaceType serpSpaceType, boolean z12, NavigationBarStyle navigationBarStyle, Boolean bool, List list2, AnalyticParams analyticParams, String str5, String str6, AdvertListAdditionalTopics advertListAdditionalTopics, String str7, Area area, String str8, Float f12, NavigationScreenAction navigationScreenAction, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : searchParams, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : treeClickStreamParent, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? PresentationType.MAIN : presentationType, (i12 & 64) != 0 ? null : cls, (i12 & 128) != 0 ? "" : str4, (i12 & 256) != 0 ? null : list, (i12 & 512) != 0 ? null : serpSpaceType, (i12 & 1024) != 0 ? false : z12, (i12 & 2048) != 0 ? null : navigationBarStyle, (i12 & 4096) != 0 ? null : bool, (i12 & 8192) != 0 ? null : list2, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : analyticParams, (i12 & 32768) != 0 ? null : str5, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : str6, (i12 & 131072) != 0 ? null : advertListAdditionalTopics, (i12 & 262144) != 0 ? null : str7, (i12 & 524288) != 0 ? null : area, (i12 & 1048576) != 0 ? null : str8, (i12 & 2097152) != 0 ? null : f12, (i12 & 4194304) != 0 ? NavigationScreenAction.f107100b : navigationScreenAction);
    }
}
