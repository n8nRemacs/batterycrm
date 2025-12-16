package com.avito.android.extended_profile_serp.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.extended_profile_phone_dialog.f;
import com.avito.android.extended_profile_serp.C30558v;
import com.avito.android.extended_profile_serp.adapter.search_correction.SearchCorrectionItem;
import com.avito.android.extended_profile_ui_components.search_input.suggest.SuggestItem;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.i1;
import com.yandex.div2.D8;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: ExtendedProfileSerpState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "ErrorType", "b", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExtendedProfileSerpState extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f152952b;

    /* renamed from: c, reason: collision with root package name */
    public final int f152953c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SearchParams f152954d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C30558v f152955e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f152956f;

    /* renamed from: g, reason: collision with root package name */
    public final int f152957g;

    /* renamed from: h, reason: collision with root package name */
    public final int f152958h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f152959i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f152960j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f152961k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f152962l;

    /* renamed from: m, reason: collision with root package name */
    public final int f152963m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final SearchCorrectionItem f152964n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final List<AdvertItem> f152965o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final List<i1> f152966p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f152967q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public final a f152968r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public final f f152969s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public final b f152970t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final List<SuggestItem> f152971u;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExtendedProfileSerpState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpState$ErrorType;", "", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ErrorType {

        /* renamed from: b, reason: collision with root package name */
        public static final ErrorType f152972b;

        /* renamed from: c, reason: collision with root package name */
        public static final ErrorType f152973c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ErrorType[] f152974d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f152975e;

        static {
            ErrorType errorType = new ErrorType("NOT_FOUND", 0);
            f152972b = errorType;
            ErrorType errorType2 = new ErrorType("COMMON", 1);
            f152973c = errorType2;
            ErrorType[] errorTypeArr = {errorType, errorType2};
            f152974d = errorTypeArr;
            f152975e = c.a(errorTypeArr);
        }

        public ErrorType() {
            throw null;
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) f152974d.clone();
        }
    }

    /* compiled from: ExtendedProfileSerpState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpState$a;", "", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f152976a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Throwable f152977b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ErrorType f152978c;

        public a(@l String str, @l Throwable th2, @k ErrorType errorType) {
            this.f152976a = str;
            this.f152977b = th2;
            this.f152978c = errorType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f152976a, aVar.f152976a) && L.f(this.f152977b, aVar.f152977b) && this.f152978c == aVar.f152978c;
        }

        public final int hashCode() {
            String str = this.f152976a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Throwable th2 = this.f152977b;
            return this.f152978c.hashCode() + ((iHashCode + (th2 != null ? th2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            return "Error(message=" + this.f152976a + ", throwable=" + this.f152977b + ", type=" + this.f152978c + ')';
        }
    }

    /* compiled from: ExtendedProfileSerpState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpState$b;", "", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final f f152979a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final FA.a f152980b;

        public b(@k f fVar, @k FA.a aVar) {
            this.f152979a = fVar;
            this.f152980b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f152979a, bVar.f152979a) && L.f(this.f152980b, bVar.f152980b);
        }

        public final int hashCode() {
            return this.f152980b.hashCode() + (this.f152979a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "PhoneDialog(phoneInfo=" + this.f152979a + ", analyticParams=" + this.f152980b + ')';
        }
    }

    public ExtendedProfileSerpState(String str, int i12, SearchParams searchParams, C30558v c30558v, String str2, int i13, int i14, String str3, boolean z12, boolean z13, boolean z14, int i15, SearchCorrectionItem searchCorrectionItem, List list, List list2, boolean z15, a aVar, f fVar, b bVar, List list3, int i16, C42822w c42822w) {
        this((i16 & 1) != 0 ? "" : str, (i16 & 2) != 0 ? 0 : i12, searchParams, (i16 & 8) != 0 ? null : c30558v, (i16 & 16) != 0 ? null : str2, (i16 & 32) != 0 ? 0 : i13, (i16 & 64) != 0 ? 0 : i14, (i16 & 128) != 0 ? null : str3, (i16 & 256) != 0 ? false : z12, (i16 & 512) != 0 ? true : z13, (i16 & 1024) != 0 ? true : z14, (i16 & 2048) != 0 ? 1 : i15, (i16 & 4096) != 0 ? null : searchCorrectionItem, (i16 & 8192) != 0 ? C42784z0.f406748b : list, (i16 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? C42784z0.f406748b : list2, (32768 & i16) != 0 ? false : z15, (65536 & i16) != 0 ? null : aVar, (131072 & i16) != 0 ? null : fVar, (262144 & i16) != 0 ? null : bVar, (i16 & 524288) != 0 ? C42784z0.f406748b : list3);
    }

    public static ExtendedProfileSerpState a(ExtendedProfileSerpState extendedProfileSerpState, String str, SearchParams searchParams, C30558v c30558v, String str2, int i12, int i13, String str3, boolean z12, boolean z13, boolean z14, int i14, SearchCorrectionItem searchCorrectionItem, List list, ArrayList arrayList, boolean z15, a aVar, f fVar, b bVar, List list2, int i15) {
        List<i1> list3;
        boolean z16;
        boolean z17;
        a aVar2;
        a aVar3;
        f fVar2;
        f fVar3;
        b bVar2;
        String str4 = (i15 & 1) != 0 ? extendedProfileSerpState.f152952b : str;
        int i16 = extendedProfileSerpState.f152953c;
        SearchParams searchParams2 = (i15 & 4) != 0 ? extendedProfileSerpState.f152954d : searchParams;
        C30558v c30558v2 = (i15 & 8) != 0 ? extendedProfileSerpState.f152955e : c30558v;
        String str5 = (i15 & 16) != 0 ? extendedProfileSerpState.f152956f : str2;
        int i17 = (i15 & 32) != 0 ? extendedProfileSerpState.f152957g : i12;
        int i18 = (i15 & 64) != 0 ? extendedProfileSerpState.f152958h : i13;
        String str6 = (i15 & 128) != 0 ? extendedProfileSerpState.f152959i : str3;
        boolean z18 = (i15 & 256) != 0 ? extendedProfileSerpState.f152960j : z12;
        boolean z19 = (i15 & 512) != 0 ? extendedProfileSerpState.f152961k : z13;
        boolean z22 = (i15 & 1024) != 0 ? extendedProfileSerpState.f152962l : z14;
        int i19 = (i15 & 2048) != 0 ? extendedProfileSerpState.f152963m : i14;
        SearchCorrectionItem searchCorrectionItem2 = (i15 & 4096) != 0 ? extendedProfileSerpState.f152964n : searchCorrectionItem;
        List list4 = (i15 & 8192) != 0 ? extendedProfileSerpState.f152965o : list;
        List<i1> list5 = (i15 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? extendedProfileSerpState.f152966p : arrayList;
        if ((i15 & 32768) != 0) {
            list3 = list5;
            z16 = extendedProfileSerpState.f152967q;
        } else {
            list3 = list5;
            z16 = z15;
        }
        if ((i15 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0) {
            z17 = z16;
            aVar2 = extendedProfileSerpState.f152968r;
        } else {
            z17 = z16;
            aVar2 = aVar;
        }
        if ((i15 & 131072) != 0) {
            aVar3 = aVar2;
            fVar2 = extendedProfileSerpState.f152969s;
        } else {
            aVar3 = aVar2;
            fVar2 = fVar;
        }
        if ((i15 & 262144) != 0) {
            fVar3 = fVar2;
            bVar2 = extendedProfileSerpState.f152970t;
        } else {
            fVar3 = fVar2;
            bVar2 = bVar;
        }
        List list6 = (i15 & 524288) != 0 ? extendedProfileSerpState.f152971u : list2;
        extendedProfileSerpState.getClass();
        return new ExtendedProfileSerpState(str4, i16, searchParams2, c30558v2, str5, i17, i18, str6, z18, z19, z22, i19, searchCorrectionItem2, list4, list3, z17, aVar3, fVar3, bVar2, list6);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedProfileSerpState)) {
            return false;
        }
        ExtendedProfileSerpState extendedProfileSerpState = (ExtendedProfileSerpState) obj;
        return L.f(this.f152952b, extendedProfileSerpState.f152952b) && this.f152953c == extendedProfileSerpState.f152953c && L.f(this.f152954d, extendedProfileSerpState.f152954d) && L.f(this.f152955e, extendedProfileSerpState.f152955e) && L.f(this.f152956f, extendedProfileSerpState.f152956f) && this.f152957g == extendedProfileSerpState.f152957g && this.f152958h == extendedProfileSerpState.f152958h && L.f(this.f152959i, extendedProfileSerpState.f152959i) && this.f152960j == extendedProfileSerpState.f152960j && this.f152961k == extendedProfileSerpState.f152961k && this.f152962l == extendedProfileSerpState.f152962l && this.f152963m == extendedProfileSerpState.f152963m && L.f(this.f152964n, extendedProfileSerpState.f152964n) && L.f(this.f152965o, extendedProfileSerpState.f152965o) && L.f(this.f152966p, extendedProfileSerpState.f152966p) && this.f152967q == extendedProfileSerpState.f152967q && L.f(this.f152968r, extendedProfileSerpState.f152968r) && L.f(this.f152969s, extendedProfileSerpState.f152969s) && L.f(this.f152970t, extendedProfileSerpState.f152970t) && L.f(this.f152971u, extendedProfileSerpState.f152971u);
    }

    public final int hashCode() {
        int iHashCode = (this.f152954d.hashCode() + r.e(this.f152953c, this.f152952b.hashCode() * 31, 31)) * 31;
        C30558v c30558v = this.f152955e;
        int iHashCode2 = (iHashCode + (c30558v == null ? 0 : c30558v.hashCode())) * 31;
        String str = this.f152956f;
        int iE2 = r.e(this.f152958h, r.e(this.f152957g, (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        String str2 = this.f152959i;
        int iE3 = r.e(this.f152963m, r.i(r.i(r.i((iE2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f152960j), 31, this.f152961k), 31, this.f152962l), 31);
        SearchCorrectionItem searchCorrectionItem = this.f152964n;
        int i12 = r.i(H.e(H.e((iE3 + (searchCorrectionItem == null ? 0 : searchCorrectionItem.hashCode())) * 31, 31, this.f152965o), 31, this.f152966p), 31, this.f152967q);
        a aVar = this.f152968r;
        int iHashCode3 = (i12 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        f fVar = this.f152969s;
        int iHashCode4 = (iHashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        b bVar = this.f152970t;
        return this.f152971u.hashCode() + ((iHashCode4 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileSerpState: { advertItems.size: ");
        D8.r(this.f152965o, sb2, ", items.size: ");
        D8.r(this.f152966p, sb2, ", isAdvertsLoading: ");
        sb2.append(this.f152960j);
        sb2.append(", isScreenLoading: ");
        sb2.append(this.f152961k);
        sb2.append(", isFirstPageLoading: ");
        sb2.append(this.f152962l);
        sb2.append(", pageNumber: ");
        sb2.append(this.f152963m);
        sb2.append(", error: ");
        sb2.append(this.f152968r);
        sb2.append(", searchParams.query: ");
        sb2.append(this.f152954d.getQuery());
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExtendedProfileSerpState(@k String str, int i12, @k SearchParams searchParams, @l C30558v c30558v, @l String str2, int i13, int i14, @l String str3, boolean z12, boolean z13, boolean z14, int i15, @l SearchCorrectionItem searchCorrectionItem, @k List<AdvertItem> list, @k List<? extends i1> list2, boolean z15, @l a aVar, @l f fVar, @l b bVar, @k List<SuggestItem> list3) {
        this.f152952b = str;
        this.f152953c = i12;
        this.f152954d = searchParams;
        this.f152955e = c30558v;
        this.f152956f = str2;
        this.f152957g = i13;
        this.f152958h = i14;
        this.f152959i = str3;
        this.f152960j = z12;
        this.f152961k = z13;
        this.f152962l = z14;
        this.f152963m = i15;
        this.f152964n = searchCorrectionItem;
        this.f152965o = list;
        this.f152966p = list2;
        this.f152967q = z15;
        this.f152968r = aVar;
        this.f152969s = fVar;
        this.f152970t = bVar;
        this.f152971u = list3;
    }
}
