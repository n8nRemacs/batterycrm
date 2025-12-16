package com.avito.android.extended_profile_selection_create.select.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.extended_profile_selection_create.select.adapter.advert.SelectionAdvertItem;
import com.avito.android.extended_profile_selection_create.select.adapter.search_correction.SearchCorrectionItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.printable_text.b;
import com.avito.android.remote.model.SearchParams;
import com.yandex.div2.D8;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42784z0;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: ExtendedProfileSelectionCreateState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateState;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "ErrorAction", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExtendedProfileSelectionCreateState extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f152341b;

    /* renamed from: c, reason: collision with root package name */
    public final int f152342c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SearchParams f152343d;

    /* renamed from: e, reason: collision with root package name */
    public final int f152344e;

    /* renamed from: f, reason: collision with root package name */
    public final int f152345f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f152346g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f152347h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f152348i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f152349j;

    /* renamed from: k, reason: collision with root package name */
    public final int f152350k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final SearchCorrectionItem f152351l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final Long f152352m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f152353n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final Set<Long> f152354o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final Set<Long> f152355p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f152356q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final List<SelectionAdvertItem> f152357r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final List<QH.a> f152358s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f152359t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final PrintableText f152360u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f152361v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f152362w;

    /* renamed from: x, reason: collision with root package name */
    @l
    public final a f152363x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f152364y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExtendedProfileSelectionCreateState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateState$ErrorAction;", "", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ErrorAction {

        /* renamed from: b, reason: collision with root package name */
        public static final ErrorAction f152365b;

        /* renamed from: c, reason: collision with root package name */
        public static final ErrorAction f152366c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ErrorAction[] f152367d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f152368e;

        static {
            ErrorAction errorAction = new ErrorAction("LOAD_SELECTED", 0);
            f152365b = errorAction;
            ErrorAction errorAction2 = new ErrorAction("LOAD_ADVERTS", 1);
            f152366c = errorAction2;
            ErrorAction[] errorActionArr = {errorAction, errorAction2};
            f152367d = errorActionArr;
            f152368e = c.a(errorActionArr);
        }

        public ErrorAction() {
            throw null;
        }

        public static ErrorAction valueOf(String str) {
            return (ErrorAction) Enum.valueOf(ErrorAction.class, str);
        }

        public static ErrorAction[] values() {
            return (ErrorAction[]) f152367d.clone();
        }
    }

    /* compiled from: ExtendedProfileSelectionCreateState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/mvi/entity/ExtendedProfileSelectionCreateState$a;", "", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f152369a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ErrorAction f152370b;

        public a(@k Throwable th2, @k ErrorAction errorAction) {
            this.f152369a = th2;
            this.f152370b = errorAction;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f152369a, aVar.f152369a) && this.f152370b == aVar.f152370b;
        }

        public final int hashCode() {
            return this.f152370b.hashCode() + (this.f152369a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Error(throwable=" + this.f152369a + ", action=" + this.f152370b + ')';
        }
    }

    public ExtendedProfileSelectionCreateState(String str, int i12, SearchParams searchParams, int i13, int i14, String str2, boolean z12, boolean z13, boolean z14, int i15, SearchCorrectionItem searchCorrectionItem, Long l12, String str3, Set set, Set set2, boolean z15, List list, List list2, boolean z16, PrintableText printableText, boolean z17, boolean z18, a aVar, boolean z19, int i16, C42822w c42822w) {
        this((i16 & 1) != 0 ? "" : str, (i16 & 2) != 0 ? 0 : i12, searchParams, (i16 & 8) != 0 ? 0 : i13, (i16 & 16) != 0 ? 0 : i14, (i16 & 32) != 0 ? null : str2, (i16 & 64) != 0 ? false : z12, (i16 & 128) != 0 ? true : z13, (i16 & 256) != 0 ? true : z14, (i16 & 512) != 0 ? 1 : i15, (i16 & 1024) != 0 ? null : searchCorrectionItem, (i16 & 2048) != 0 ? null : l12, (i16 & 4096) != 0 ? null : str3, (i16 & 8192) != 0 ? B0.f406639b : set, (i16 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? B0.f406639b : set2, (32768 & i16) != 0 ? false : z15, (65536 & i16) != 0 ? C42784z0.f406748b : list, (131072 & i16) != 0 ? C42784z0.f406748b : list2, (262144 & i16) != 0 ? false : z16, (524288 & i16) != 0 ? b.a() : printableText, (1048576 & i16) != 0 ? false : z17, (2097152 & i16) != 0 ? false : z18, (4194304 & i16) != 0 ? null : aVar, (i16 & 8388608) != 0 ? false : z19);
    }

    public static ExtendedProfileSelectionCreateState a(ExtendedProfileSelectionCreateState extendedProfileSelectionCreateState, String str, SearchParams searchParams, int i12, int i13, String str2, boolean z12, boolean z13, boolean z14, int i14, SearchCorrectionItem searchCorrectionItem, Long l12, String str3, Set set, Set set2, boolean z15, List list, List list2, boolean z16, PrintableText printableText, boolean z17, boolean z18, a aVar, boolean z19, int i15) {
        Set set3;
        boolean z22;
        boolean z23;
        List list3;
        List list4;
        List list5;
        List list6;
        boolean z24;
        boolean z25;
        PrintableText printableText2;
        PrintableText printableText3;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        a aVar2;
        String str4 = (i15 & 1) != 0 ? extendedProfileSelectionCreateState.f152341b : str;
        int i16 = extendedProfileSelectionCreateState.f152342c;
        SearchParams searchParams2 = (i15 & 4) != 0 ? extendedProfileSelectionCreateState.f152343d : searchParams;
        int i17 = (i15 & 8) != 0 ? extendedProfileSelectionCreateState.f152344e : i12;
        int i18 = (i15 & 16) != 0 ? extendedProfileSelectionCreateState.f152345f : i13;
        String str5 = (i15 & 32) != 0 ? extendedProfileSelectionCreateState.f152346g : str2;
        boolean z32 = (i15 & 64) != 0 ? extendedProfileSelectionCreateState.f152347h : z12;
        boolean z33 = (i15 & 128) != 0 ? extendedProfileSelectionCreateState.f152348i : z13;
        boolean z34 = (i15 & 256) != 0 ? extendedProfileSelectionCreateState.f152349j : z14;
        int i19 = (i15 & 512) != 0 ? extendedProfileSelectionCreateState.f152350k : i14;
        SearchCorrectionItem searchCorrectionItem2 = (i15 & 1024) != 0 ? extendedProfileSelectionCreateState.f152351l : searchCorrectionItem;
        Long l13 = (i15 & 2048) != 0 ? extendedProfileSelectionCreateState.f152352m : l12;
        String str6 = (i15 & 4096) != 0 ? extendedProfileSelectionCreateState.f152353n : str3;
        Set set4 = (i15 & 8192) != 0 ? extendedProfileSelectionCreateState.f152354o : set;
        Set set5 = (i15 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? extendedProfileSelectionCreateState.f152355p : set2;
        if ((i15 & 32768) != 0) {
            set3 = set5;
            z22 = extendedProfileSelectionCreateState.f152356q;
        } else {
            set3 = set5;
            z22 = z15;
        }
        if ((i15 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0) {
            z23 = z22;
            list3 = extendedProfileSelectionCreateState.f152357r;
        } else {
            z23 = z22;
            list3 = list;
        }
        if ((i15 & 131072) != 0) {
            list4 = list3;
            list5 = extendedProfileSelectionCreateState.f152358s;
        } else {
            list4 = list3;
            list5 = list2;
        }
        if ((i15 & 262144) != 0) {
            list6 = list5;
            z24 = extendedProfileSelectionCreateState.f152359t;
        } else {
            list6 = list5;
            z24 = z16;
        }
        if ((i15 & 524288) != 0) {
            z25 = z24;
            printableText2 = extendedProfileSelectionCreateState.f152360u;
        } else {
            z25 = z24;
            printableText2 = printableText;
        }
        if ((i15 & 1048576) != 0) {
            printableText3 = printableText2;
            z26 = extendedProfileSelectionCreateState.f152361v;
        } else {
            printableText3 = printableText2;
            z26 = z17;
        }
        if ((i15 & 2097152) != 0) {
            z27 = z26;
            z28 = extendedProfileSelectionCreateState.f152362w;
        } else {
            z27 = z26;
            z28 = z18;
        }
        if ((i15 & 4194304) != 0) {
            z29 = z28;
            aVar2 = extendedProfileSelectionCreateState.f152363x;
        } else {
            z29 = z28;
            aVar2 = aVar;
        }
        boolean z35 = (i15 & 8388608) != 0 ? extendedProfileSelectionCreateState.f152364y : z19;
        extendedProfileSelectionCreateState.getClass();
        return new ExtendedProfileSelectionCreateState(str4, i16, searchParams2, i17, i18, str5, z32, z33, z34, i19, searchCorrectionItem2, l13, str6, set4, set3, z23, list4, list6, z25, printableText3, z27, z29, aVar2, z35);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedProfileSelectionCreateState)) {
            return false;
        }
        ExtendedProfileSelectionCreateState extendedProfileSelectionCreateState = (ExtendedProfileSelectionCreateState) obj;
        return L.f(this.f152341b, extendedProfileSelectionCreateState.f152341b) && this.f152342c == extendedProfileSelectionCreateState.f152342c && L.f(this.f152343d, extendedProfileSelectionCreateState.f152343d) && this.f152344e == extendedProfileSelectionCreateState.f152344e && this.f152345f == extendedProfileSelectionCreateState.f152345f && L.f(this.f152346g, extendedProfileSelectionCreateState.f152346g) && this.f152347h == extendedProfileSelectionCreateState.f152347h && this.f152348i == extendedProfileSelectionCreateState.f152348i && this.f152349j == extendedProfileSelectionCreateState.f152349j && this.f152350k == extendedProfileSelectionCreateState.f152350k && L.f(this.f152351l, extendedProfileSelectionCreateState.f152351l) && L.f(this.f152352m, extendedProfileSelectionCreateState.f152352m) && L.f(this.f152353n, extendedProfileSelectionCreateState.f152353n) && L.f(this.f152354o, extendedProfileSelectionCreateState.f152354o) && L.f(this.f152355p, extendedProfileSelectionCreateState.f152355p) && this.f152356q == extendedProfileSelectionCreateState.f152356q && L.f(this.f152357r, extendedProfileSelectionCreateState.f152357r) && L.f(this.f152358s, extendedProfileSelectionCreateState.f152358s) && this.f152359t == extendedProfileSelectionCreateState.f152359t && L.f(this.f152360u, extendedProfileSelectionCreateState.f152360u) && this.f152361v == extendedProfileSelectionCreateState.f152361v && this.f152362w == extendedProfileSelectionCreateState.f152362w && L.f(this.f152363x, extendedProfileSelectionCreateState.f152363x) && this.f152364y == extendedProfileSelectionCreateState.f152364y;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f152345f, r.e(this.f152344e, (this.f152343d.hashCode() + r.e(this.f152342c, this.f152341b.hashCode() * 31, 31)) * 31, 31), 31);
        String str = this.f152346g;
        int iE3 = r.e(this.f152350k, r.i(r.i(r.i((iE2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f152347h), 31, this.f152348i), 31, this.f152349j), 31);
        SearchCorrectionItem searchCorrectionItem = this.f152351l;
        int iHashCode = (iE3 + (searchCorrectionItem == null ? 0 : searchCorrectionItem.hashCode())) * 31;
        Long l12 = this.f152352m;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str2 = this.f152353n;
        int i12 = r.i(r.i(com.avito.android.actions_sheet.a.f(this.f152360u, r.i(H.e(H.e(r.i(m.g(this.f152355p, m.g(this.f152354o, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.f152356q), 31, this.f152357r), 31, this.f152358s), 31, this.f152359t), 31), 31, this.f152361v), 31, this.f152362w);
        a aVar = this.f152363x;
        return Boolean.hashCode(this.f152364y) + ((i12 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileSelectionCreateState: { advertItems.size: ");
        D8.r(this.f152357r, sb2, ", items.size: ");
        D8.r(this.f152358s, sb2, ", isAdvertsLoading: ");
        sb2.append(this.f152347h);
        sb2.append(", isScreenLoading: ");
        sb2.append(this.f152348i);
        sb2.append(", isFirstPageLoading: ");
        sb2.append(this.f152349j);
        sb2.append(", pageNumber: ");
        sb2.append(this.f152350k);
        sb2.append(", error: ");
        sb2.append(this.f152363x);
        sb2.append(", searchParams.query: ");
        sb2.append(this.f152343d.getQuery());
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExtendedProfileSelectionCreateState(@k String str, int i12, @k SearchParams searchParams, int i13, int i14, @l String str2, boolean z12, boolean z13, boolean z14, int i15, @l SearchCorrectionItem searchCorrectionItem, @l Long l12, @l String str3, @k Set<Long> set, @k Set<Long> set2, boolean z15, @k List<SelectionAdvertItem> list, @k List<? extends QH.a> list2, boolean z16, @k PrintableText printableText, boolean z17, boolean z18, @l a aVar, boolean z19) {
        this.f152341b = str;
        this.f152342c = i12;
        this.f152343d = searchParams;
        this.f152344e = i13;
        this.f152345f = i14;
        this.f152346g = str2;
        this.f152347h = z12;
        this.f152348i = z13;
        this.f152349j = z14;
        this.f152350k = i15;
        this.f152351l = searchCorrectionItem;
        this.f152352m = l12;
        this.f152353n = str3;
        this.f152354o = set;
        this.f152355p = set2;
        this.f152356q = z15;
        this.f152357r = list;
        this.f152358s = list2;
        this.f152359t = z16;
        this.f152360u = printableText;
        this.f152361v = z17;
        this.f152362w = z18;
        this.f152363x = aVar;
        this.f152364y = z19;
    }
}
