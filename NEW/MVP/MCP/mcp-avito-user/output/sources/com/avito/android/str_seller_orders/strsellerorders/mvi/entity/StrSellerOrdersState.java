package com.avito.android.str_seller_orders.strsellerorders.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.StrSellerOrdersImportantToNote;
import com.avito.android.remote.model.StrSellerOrdersScreenWidget;
import com.avito.android.str_seller_orders.strsellerorders.mvi.entity.a;
import com.avito.android.str_seller_orders.strsellerordersdialog.shared.StrSellerOrdersDialogData;
import com.avito.android.util.ApiException;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import yz0.C50327a;
import yz0.e;

/* compiled from: StrSellerOrdersState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "LoadingType", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class StrSellerOrdersState extends q {

    /* renamed from: r, reason: collision with root package name */
    @k
    public static final a f289880r = new a(null);

    /* renamed from: s, reason: collision with root package name */
    @k
    public static final StrSellerOrdersState f289881s = new StrSellerOrdersState(P0.c(), C42784z0.f406748b, null, null, LoadingType.f289899c, null, null, a.c.f289906a, null, null, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<String, C50327a> f289882b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<StrSellerOrdersScreenWidget> f289883c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f289884d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f289885e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LoadingType f289886f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Throwable f289887g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f289888h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.str_seller_orders.strsellerorders.mvi.entity.a f289889i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final StrSellerOrdersImportantToNote f289890j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final StrSellerOrdersDialogData f289891k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final e f289892l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final C50327a f289893m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final List<C50327a> f289894n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final C50327a f289895o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final Collection<C50327a> f289896p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f289897q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StrSellerOrdersState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersState$LoadingType;", "", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LoadingType {

        /* renamed from: b, reason: collision with root package name */
        public static final LoadingType f289898b;

        /* renamed from: c, reason: collision with root package name */
        public static final LoadingType f289899c;

        /* renamed from: d, reason: collision with root package name */
        public static final LoadingType f289900d;

        /* renamed from: e, reason: collision with root package name */
        public static final LoadingType f289901e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ LoadingType[] f289902f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f289903g;

        static {
            LoadingType loadingType = new LoadingType("NONE", 0);
            f289898b = loadingType;
            LoadingType loadingType2 = new LoadingType("INITIAL_LOADING", 1);
            f289899c = loadingType2;
            LoadingType loadingType3 = new LoadingType("PAGINATION_LOADING", 2);
            f289900d = loadingType3;
            LoadingType loadingType4 = new LoadingType("ERROR", 3);
            f289901e = loadingType4;
            LoadingType[] loadingTypeArr = {loadingType, loadingType2, loadingType3, loadingType4};
            f289902f = loadingTypeArr;
            f289903g = c.a(loadingTypeArr);
        }

        public LoadingType() {
            throw null;
        }

        public static LoadingType valueOf(String str) {
            return (LoadingType) Enum.valueOf(LoadingType.class, str);
        }

        public static LoadingType[] values() {
            return (LoadingType[]) f289902f.clone();
        }
    }

    /* compiled from: StrSellerOrdersState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/entity/StrSellerOrdersState$a;", "", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public StrSellerOrdersState(@k Map<String, C50327a> map, @k List<StrSellerOrdersScreenWidget> list, @l String str, @l String str2, @k LoadingType loadingType, @l Throwable th2, @l String str3, @k com.avito.android.str_seller_orders.strsellerorders.mvi.entity.a aVar, @l StrSellerOrdersImportantToNote strSellerOrdersImportantToNote, @l StrSellerOrdersDialogData strSellerOrdersDialogData, @l e eVar) {
        Object next;
        this.f289882b = map;
        this.f289883c = list;
        this.f289884d = str;
        this.f289885e = str2;
        this.f289886f = loadingType;
        this.f289887g = th2;
        this.f289888h = str3;
        this.f289889i = aVar;
        this.f289890j = strSellerOrdersImportantToNote;
        this.f289891k = strSellerOrdersDialogData;
        this.f289892l = eVar;
        this.f289893m = map.get(str3);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C50327a> entry : map.entrySet()) {
            String key = entry.getKey();
            com.avito.android.str_seller_orders.strsellerorders.a.f289702a.getClass();
            if (com.avito.android.str_seller_orders.strsellerorders.a.f289703b.contains(key)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Collection collectionValues = linkedHashMap.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((C50327a) obj).f443629f.isEmpty()) {
                arrayList.add(obj);
            }
        }
        this.f289894n = C42745f0.M0(arrayList);
        Map<String, C50327a> map2 = this.f289882b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, C50327a> entry2 : map2.entrySet()) {
            String key2 = entry2.getKey();
            com.avito.android.str_seller_orders.strsellerorders.a.f289702a.getClass();
            if (!com.avito.android.str_seller_orders.strsellerorders.a.f289703b.contains(key2)) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        Iterator it = linkedHashMap2.values().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (O2.a(((C50327a) next).f443629f)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        this.f289895o = (C50327a) next;
        Collection<C50327a> collectionValues2 = this.f289882b.values();
        this.f289896p = collectionValues2;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : collectionValues2) {
            if (O2.a(((C50327a) obj2).f443629f)) {
                arrayList2.add(obj2);
            }
        }
        LoadingType loadingType2 = this.f289886f;
        this.f289897q = loadingType2 == LoadingType.f289899c || loadingType2 == LoadingType.f289900d;
    }

    public static StrSellerOrdersState a(StrSellerOrdersState strSellerOrdersState, LinkedHashMap linkedHashMap, List list, String str, String str2, LoadingType loadingType, ApiException apiException, String str3, com.avito.android.str_seller_orders.strsellerorders.mvi.entity.a aVar, StrSellerOrdersImportantToNote strSellerOrdersImportantToNote, StrSellerOrdersDialogData strSellerOrdersDialogData, e eVar, int i12) {
        Map<String, C50327a> map = (i12 & 1) != 0 ? strSellerOrdersState.f289882b : linkedHashMap;
        List list2 = (i12 & 2) != 0 ? strSellerOrdersState.f289883c : list;
        String str4 = (i12 & 4) != 0 ? strSellerOrdersState.f289884d : str;
        String str5 = (i12 & 8) != 0 ? strSellerOrdersState.f289885e : str2;
        LoadingType loadingType2 = (i12 & 16) != 0 ? strSellerOrdersState.f289886f : loadingType;
        Throwable th2 = (i12 & 32) != 0 ? strSellerOrdersState.f289887g : apiException;
        String str6 = (i12 & 64) != 0 ? strSellerOrdersState.f289888h : str3;
        com.avito.android.str_seller_orders.strsellerorders.mvi.entity.a aVar2 = (i12 & 128) != 0 ? strSellerOrdersState.f289889i : aVar;
        StrSellerOrdersImportantToNote strSellerOrdersImportantToNote2 = (i12 & 256) != 0 ? strSellerOrdersState.f289890j : strSellerOrdersImportantToNote;
        StrSellerOrdersDialogData strSellerOrdersDialogData2 = (i12 & 512) != 0 ? strSellerOrdersState.f289891k : strSellerOrdersDialogData;
        e eVar2 = (i12 & 1024) != 0 ? strSellerOrdersState.f289892l : eVar;
        strSellerOrdersState.getClass();
        return new StrSellerOrdersState(map, list2, str4, str5, loadingType2, th2, str6, aVar2, strSellerOrdersImportantToNote2, strSellerOrdersDialogData2, eVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrSellerOrdersState)) {
            return false;
        }
        StrSellerOrdersState strSellerOrdersState = (StrSellerOrdersState) obj;
        return L.f(this.f289882b, strSellerOrdersState.f289882b) && L.f(this.f289883c, strSellerOrdersState.f289883c) && L.f(this.f289884d, strSellerOrdersState.f289884d) && L.f(this.f289885e, strSellerOrdersState.f289885e) && this.f289886f == strSellerOrdersState.f289886f && L.f(this.f289887g, strSellerOrdersState.f289887g) && L.f(this.f289888h, strSellerOrdersState.f289888h) && L.f(this.f289889i, strSellerOrdersState.f289889i) && L.f(this.f289890j, strSellerOrdersState.f289890j) && L.f(this.f289891k, strSellerOrdersState.f289891k) && L.f(this.f289892l, strSellerOrdersState.f289892l);
    }

    public final int hashCode() {
        int iE2 = H.e(this.f289882b.hashCode() * 31, 31, this.f289883c);
        String str = this.f289884d;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f289885e;
        int iHashCode2 = (this.f289886f.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Throwable th2 = this.f289887g;
        int iHashCode3 = (iHashCode2 + (th2 == null ? 0 : th2.hashCode())) * 31;
        String str3 = this.f289888h;
        int iHashCode4 = (this.f289889i.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        StrSellerOrdersImportantToNote strSellerOrdersImportantToNote = this.f289890j;
        int iHashCode5 = (iHashCode4 + (strSellerOrdersImportantToNote == null ? 0 : strSellerOrdersImportantToNote.hashCode())) * 31;
        StrSellerOrdersDialogData strSellerOrdersDialogData = this.f289891k;
        int iHashCode6 = (iHashCode5 + (strSellerOrdersDialogData == null ? 0 : strSellerOrdersDialogData.hashCode())) * 31;
        e eVar = this.f289892l;
        return iHashCode6 + (eVar != null ? eVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "StrSellerOrdersState(sectionIdToSectionInfoMap=" + this.f289882b + ", widgets=" + this.f289883c + ", header=" + this.f289884d + ", title=" + this.f289885e + ", loadingType=" + this.f289886f + ", lastApiError=" + this.f289887g + ", selectedSectionId=" + this.f289888h + ", bannerState=" + this.f289889i + ", importantToNote=" + this.f289890j + ", lastDialogData=" + this.f289891k + ", viewState=" + this.f289892l + ')';
    }
}
