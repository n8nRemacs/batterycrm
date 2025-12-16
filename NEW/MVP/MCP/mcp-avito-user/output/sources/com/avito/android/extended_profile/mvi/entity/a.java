package com.avito.android.extended_profile.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.extended_profile.data.SearchFormat;
import com.avito.android.extended_profile_ui_components.search_input.suggest.SuggestItem;
import com.avito.android.extended_profile_widgets.adapter.search.search_advert.SearchAdvertItem;
import com.avito.android.extended_profile_widgets.adapter.search.search_correction.SearchCorrectionItem;
import com.avito.android.remote.model.ActiveItemsPreview;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.android.remote.model.ProfileCounter;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.text.AttributedText;
import com.yandex.div2.D8;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: ExtendedProfileState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/a;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "e", "f", "g", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a extends q {

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final c f150238m = new c(null);

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final a f150239n = new a(null, false, null, null, false, null, null, null, null, null, null, 2047, null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final com.avito.android.extended_profile.data.b f150240b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f150241c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Throwable f150242d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final g f150243e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f150244f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final com.avito.android.extended_profile_phone_dialog.f f150245g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final d f150246h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final C4397a f150247i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final b f150248j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final e f150249k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final f f150250l;

    /* compiled from: ExtendedProfileState.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/a$b;", "", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<SearchAdvertItem> f150271a;

        /* renamed from: b, reason: collision with root package name */
        public final int f150272b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f150273c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f150274d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f150275e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f150276f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f150277g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final String f150278h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final SearchFormat f150279i;

        public b() {
            this(null, 0, false, false, false, null, null, null, null, 511, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static b a(b bVar, ArrayList arrayList, boolean z12, boolean z13, boolean z14, int i12) {
            List list = arrayList;
            if ((i12 & 1) != 0) {
                list = bVar.f150271a;
            }
            List list2 = list;
            int i13 = bVar.f150272b;
            if ((i12 & 8) != 0) {
                z13 = bVar.f150274d;
            }
            boolean z15 = z13;
            if ((i12 & 16) != 0) {
                z14 = bVar.f150275e;
            }
            String str = bVar.f150276f;
            String str2 = bVar.f150277g;
            String str3 = bVar.f150278h;
            SearchFormat searchFormat = bVar.f150279i;
            bVar.getClass();
            return new b(list2, i13, z12, z15, z14, str, str2, str3, searchFormat);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f150271a, bVar.f150271a) && this.f150272b == bVar.f150272b && this.f150273c == bVar.f150273c && this.f150274d == bVar.f150274d && this.f150275e == bVar.f150275e && L.f(this.f150276f, bVar.f150276f) && L.f(this.f150277g, bVar.f150277g) && L.f(this.f150278h, bVar.f150278h) && this.f150279i == bVar.f150279i;
        }

        public final int hashCode() {
            int iD2 = H.d(r.i(r.i(r.i(r.e(this.f150272b, this.f150271a.hashCode() * 31, 31), 31, this.f150273c), 31, this.f150274d), 31, this.f150275e), 31, this.f150276f);
            String str = this.f150277g;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f150278h;
            return this.f150279i.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClosedAdvertsSearchState: { adverts.size: ");
            D8.r(this.f150271a, sb2, ", totalCount: ");
            sb2.append(this.f150272b);
            sb2.append(", shortcut: ");
            return AK.c.s(sb2, this.f150276f, " }");
        }

        public b(List list, int i12, boolean z12, boolean z13, boolean z14, String str, String str2, String str3, SearchFormat searchFormat, int i13, C42822w c42822w) {
            this((i13 & 1) != 0 ? C42784z0.f406748b : list, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? false : z12, (i13 & 8) != 0 ? true : z13, (i13 & 16) == 0 ? z14 : false, (i13 & 32) != 0 ? "" : str, (i13 & 64) != 0 ? null : str2, (i13 & 128) == 0 ? str3 : null, (i13 & 256) != 0 ? SearchFormat.f149460b : searchFormat);
        }

        public b(@k List<SearchAdvertItem> list, int i12, boolean z12, boolean z13, boolean z14, @k String str, @l String str2, @l String str3, @k SearchFormat searchFormat) {
            this.f150271a = list;
            this.f150272b = i12;
            this.f150273c = z12;
            this.f150274d = z13;
            this.f150275e = z14;
            this.f150276f = str;
            this.f150277g = str2;
            this.f150278h = str3;
            this.f150279i = searchFormat;
        }
    }

    /* compiled from: ExtendedProfileState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/a$c;", "", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: ExtendedProfileState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/a$d;", "", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.extended_profile_phone_dialog.f f150280a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final FA.a f150281b;

        public d(@k com.avito.android.extended_profile_phone_dialog.f fVar, @k FA.a aVar) {
            this.f150280a = fVar;
            this.f150281b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f150280a, dVar.f150280a) && L.f(this.f150281b, dVar.f150281b);
        }

        public final int hashCode() {
            return this.f150281b.hashCode() + (this.f150280a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "PhoneDialog(phoneInfo=" + this.f150280a + ", analyticParams=" + this.f150281b + ')';
        }
    }

    /* compiled from: ExtendedProfileState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/a$e;", "", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Boolean f150282a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f150283b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Boolean f150284c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f150285d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f150286e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final ProfileCounter f150287f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final ProfileCounter f150288g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f150289h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f150290i;

        public e() {
            this(null, false, null, false, false, null, null, false, false, 511, null);
        }

        public static e a(e eVar, Boolean bool, boolean z12, Boolean bool2, boolean z13, boolean z14, ProfileCounter profileCounter, ProfileCounter profileCounter2, boolean z15, boolean z16, int i12) {
            Boolean bool3 = (i12 & 1) != 0 ? eVar.f150282a : bool;
            boolean z17 = (i12 & 2) != 0 ? eVar.f150283b : z12;
            Boolean bool4 = (i12 & 4) != 0 ? eVar.f150284c : bool2;
            boolean z18 = (i12 & 8) != 0 ? eVar.f150285d : z13;
            boolean z19 = (i12 & 16) != 0 ? eVar.f150286e : z14;
            ProfileCounter profileCounter3 = (i12 & 32) != 0 ? eVar.f150287f : profileCounter;
            ProfileCounter profileCounter4 = (i12 & 64) != 0 ? eVar.f150288g : profileCounter2;
            boolean z22 = (i12 & 128) != 0 ? eVar.f150289h : z15;
            boolean z23 = (i12 & 256) != 0 ? eVar.f150290i : z16;
            eVar.getClass();
            return new e(bool3, z17, bool4, z18, z19, profileCounter3, profileCounter4, z22, z23);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f150282a, eVar.f150282a) && this.f150283b == eVar.f150283b && L.f(this.f150284c, eVar.f150284c) && this.f150285d == eVar.f150285d && this.f150286e == eVar.f150286e && L.f(this.f150287f, eVar.f150287f) && L.f(this.f150288g, eVar.f150288g) && this.f150289h == eVar.f150289h && this.f150290i == eVar.f150290i;
        }

        public final int hashCode() {
            Boolean bool = this.f150282a;
            int i12 = r.i((bool == null ? 0 : bool.hashCode()) * 31, 31, this.f150283b);
            Boolean bool2 = this.f150284c;
            int i13 = r.i(r.i((i12 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.f150285d), 31, this.f150286e);
            ProfileCounter profileCounter = this.f150287f;
            int iHashCode = (i13 + (profileCounter == null ? 0 : profileCounter.hashCode())) * 31;
            ProfileCounter profileCounter2 = this.f150288g;
            return Boolean.hashCode(this.f150290i) + r.i((iHashCode + (profileCounter2 != null ? profileCounter2.hashCode() : 0)) * 31, 31, this.f150289h);
        }

        @k
        public final String toString() {
            return "SubscriptionState: { isSubscribed: " + this.f150283b + ", isNotificationsActivated: " + this.f150284c + ", targetSubscribe: " + this.f150282a + " }";
        }

        public e(@l Boolean bool, boolean z12, @l Boolean bool2, boolean z13, boolean z14, @l ProfileCounter profileCounter, @l ProfileCounter profileCounter2, boolean z15, boolean z16) {
            this.f150282a = bool;
            this.f150283b = z12;
            this.f150284c = bool2;
            this.f150285d = z13;
            this.f150286e = z14;
            this.f150287f = profileCounter;
            this.f150288g = profileCounter2;
            this.f150289h = z15;
            this.f150290i = z16;
        }

        public /* synthetic */ e(Boolean bool, boolean z12, Boolean bool2, boolean z13, boolean z14, ProfileCounter profileCounter, ProfileCounter profileCounter2, boolean z15, boolean z16, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : bool, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : bool2, (i12 & 8) != 0 ? false : z13, (i12 & 16) != 0 ? false : z14, (i12 & 32) != 0 ? null : profileCounter, (i12 & 64) == 0 ? profileCounter2 : null, (i12 & 128) != 0 ? false : z15, (i12 & 256) == 0 ? z16 : false);
        }
    }

    /* compiled from: ExtendedProfileState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/a$f;", "", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f150291a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<SuggestItem> f150292b;

        public f() {
            this(false, null, 3, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f150291a == fVar.f150291a && L.f(this.f150292b, fVar.f150292b);
        }

        public final int hashCode() {
            return this.f150292b.hashCode() + (Boolean.hashCode(this.f150291a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SuggestsState(isSuggestsVisible=");
            sb2.append(this.f150291a);
            sb2.append(", suggests=");
            return H.p(sb2, this.f150292b, ')');
        }

        public f(boolean z12, @k List<SuggestItem> list) {
            this.f150291a = z12;
            this.f150292b = list;
        }

        public f(boolean z12, List list, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? C42784z0.f406748b : list);
        }
    }

    /* compiled from: ExtendedProfileState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/a$g;", "", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f150293a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final AttributedText f150294b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeeplinkAction f150295c;

        public g(@k String str, @l AttributedText attributedText, @l DeeplinkAction deeplinkAction) {
            this.f150293a = str;
            this.f150294b = attributedText;
            this.f150295c = deeplinkAction;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f150293a, gVar.f150293a) && L.f(this.f150294b, gVar.f150294b) && L.f(this.f150295c, gVar.f150295c);
        }

        public final int hashCode() {
            int iHashCode = this.f150293a.hashCode() * 31;
            AttributedText attributedText = this.f150294b;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            DeeplinkAction deeplinkAction = this.f150295c;
            return iHashCode2 + (deeplinkAction != null ? deeplinkAction.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "UserStatus(title=" + this.f150293a + ", subtitle=" + this.f150294b + ", action=" + this.f150295c + ')';
        }
    }

    public a() {
        this(null, false, null, null, false, null, null, null, null, null, null, 2047, null);
    }

    public static a a(a aVar, com.avito.android.extended_profile.data.b bVar, com.avito.android.extended_profile_phone_dialog.f fVar, d dVar, C4397a c4397a, b bVar2, e eVar, f fVar2, int i12) {
        com.avito.android.extended_profile.data.b bVar3 = (i12 & 1) != 0 ? aVar.f150240b : bVar;
        boolean z12 = aVar.f150241c;
        Throwable th2 = aVar.f150242d;
        g gVar = aVar.f150243e;
        boolean z13 = (i12 & 16) != 0 ? aVar.f150244f : true;
        com.avito.android.extended_profile_phone_dialog.f fVar3 = (i12 & 32) != 0 ? aVar.f150245g : fVar;
        d dVar2 = (i12 & 64) != 0 ? aVar.f150246h : dVar;
        C4397a c4397a2 = (i12 & 128) != 0 ? aVar.f150247i : c4397a;
        b bVar4 = (i12 & 256) != 0 ? aVar.f150248j : bVar2;
        e eVar2 = (i12 & 512) != 0 ? aVar.f150249k : eVar;
        f fVar4 = (i12 & 1024) != 0 ? aVar.f150250l : fVar2;
        aVar.getClass();
        return new a(bVar3, z12, th2, gVar, z13, fVar3, dVar2, c4397a2, bVar4, eVar2, fVar4);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f150240b, aVar.f150240b) && this.f150241c == aVar.f150241c && L.f(this.f150242d, aVar.f150242d) && L.f(this.f150243e, aVar.f150243e) && this.f150244f == aVar.f150244f && L.f(this.f150245g, aVar.f150245g) && L.f(this.f150246h, aVar.f150246h) && L.f(this.f150247i, aVar.f150247i) && L.f(this.f150248j, aVar.f150248j) && L.f(this.f150249k, aVar.f150249k) && L.f(this.f150250l, aVar.f150250l);
    }

    public final int hashCode() {
        com.avito.android.extended_profile.data.b bVar = this.f150240b;
        int i12 = r.i((bVar == null ? 0 : bVar.hashCode()) * 31, 31, this.f150241c);
        Throwable th2 = this.f150242d;
        int iHashCode = (i12 + (th2 == null ? 0 : th2.hashCode())) * 31;
        g gVar = this.f150243e;
        int i13 = r.i((iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.f150244f);
        com.avito.android.extended_profile_phone_dialog.f fVar = this.f150245g;
        int iHashCode2 = (i13 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        d dVar = this.f150246h;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        C4397a c4397a = this.f150247i;
        int iHashCode4 = (iHashCode3 + (c4397a == null ? 0 : c4397a.hashCode())) * 31;
        b bVar2 = this.f150248j;
        return this.f150250l.hashCode() + ((this.f150249k.hashCode() + ((iHashCode4 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public final String toString() {
        List<com.avito.android.extended_profile.data.g> list;
        StringBuilder sb2 = new StringBuilder("ExtendedProfileState: { data.widgetGroups.size: ");
        com.avito.android.extended_profile.data.b bVar = this.f150240b;
        sb2.append((bVar == null || (list = bVar.f149466a) == null) ? null : Integer.valueOf(list.size()));
        sb2.append(", activeSearchState: ");
        sb2.append(this.f150247i);
        sb2.append(", closedSearchState: ");
        sb2.append(this.f150248j);
        sb2.append(", subscriptionState: ");
        sb2.append(this.f150249k);
        sb2.append(" }");
        return sb2.toString();
    }

    public /* synthetic */ a(com.avito.android.extended_profile.data.b bVar, boolean z12, Throwable th2, g gVar, boolean z13, com.avito.android.extended_profile_phone_dialog.f fVar, d dVar, C4397a c4397a, b bVar2, e eVar, f fVar2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : bVar, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : th2, (i12 & 8) != 0 ? null : gVar, (i12 & 16) != 0 ? false : z13, (i12 & 32) != 0 ? null : fVar, (i12 & 64) != 0 ? null : dVar, (i12 & 128) != 0 ? null : c4397a, (i12 & 256) != 0 ? null : bVar2, (i12 & 512) != 0 ? new e(null, false, null, false, false, null, null, false, false, 511, null) : eVar, (i12 & 1024) != 0 ? new f(false, null, 3, null) : fVar2);
    }

    public a(@l com.avito.android.extended_profile.data.b bVar, boolean z12, @l Throwable th2, @l g gVar, boolean z13, @l com.avito.android.extended_profile_phone_dialog.f fVar, @l d dVar, @l C4397a c4397a, @l b bVar2, @k e eVar, @k f fVar2) {
        this.f150240b = bVar;
        this.f150241c = z12;
        this.f150242d = th2;
        this.f150243e = gVar;
        this.f150244f = z13;
        this.f150245g = fVar;
        this.f150246h = dVar;
        this.f150247i = c4397a;
        this.f150248j = bVar2;
        this.f150249k = eVar;
        this.f150250l = fVar2;
    }

    /* compiled from: ExtendedProfileState.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile/mvi/entity/a$a;", "", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.extended_profile.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C4397a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f150251a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f150252b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f150253c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f150254d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f150255e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f150256f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final SearchParams f150257g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final String f150258h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final String f150259i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final ActiveItemsPreview f150260j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final SearchCorrectionItem f150261k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f150262l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public final Integer f150263m;

        /* renamed from: n, reason: collision with root package name */
        @l
        public final Integer f150264n;

        /* renamed from: o, reason: collision with root package name */
        @l
        public final Integer f150265o;

        /* renamed from: p, reason: collision with root package name */
        @l
        public final Integer f150266p;

        /* renamed from: q, reason: collision with root package name */
        @k
        public final List<SearchAdvertItem> f150267q;

        /* renamed from: r, reason: collision with root package name */
        @l
        public final String f150268r;

        /* renamed from: s, reason: collision with root package name */
        @l
        public final String f150269s;

        /* renamed from: t, reason: collision with root package name */
        @k
        public final SearchFormat f150270t;

        public C4397a(boolean z12, boolean z13, boolean z14, @l String str, @l String str2, boolean z15, @k SearchParams searchParams, @k String str3, @l String str4, @l ActiveItemsPreview activeItemsPreview, @l SearchCorrectionItem searchCorrectionItem, boolean z16, @l Integer num, @l Integer num2, @l Integer num3, @l Integer num4, @k List<SearchAdvertItem> list, @l String str5, @l String str6, @k SearchFormat searchFormat) {
            this.f150251a = z12;
            this.f150252b = z13;
            this.f150253c = z14;
            this.f150254d = str;
            this.f150255e = str2;
            this.f150256f = z15;
            this.f150257g = searchParams;
            this.f150258h = str3;
            this.f150259i = str4;
            this.f150260j = activeItemsPreview;
            this.f150261k = searchCorrectionItem;
            this.f150262l = z16;
            this.f150263m = num;
            this.f150264n = num2;
            this.f150265o = num3;
            this.f150266p = num4;
            this.f150267q = list;
            this.f150268r = str5;
            this.f150269s = str6;
            this.f150270t = searchFormat;
        }

        public static C4397a a(C4397a c4397a, boolean z12, boolean z13, String str, String str2, SearchParams searchParams, String str3, SearchCorrectionItem searchCorrectionItem, boolean z14, Integer num, Integer num2, Integer num3, List list, int i12) {
            boolean z15 = (i12 & 1) != 0 ? c4397a.f150251a : z12;
            boolean z16 = (i12 & 2) != 0 ? c4397a.f150252b : z13;
            boolean z17 = (i12 & 4) != 0 ? c4397a.f150253c : true;
            String str4 = (i12 & 8) != 0 ? c4397a.f150254d : str;
            String str5 = (i12 & 16) != 0 ? c4397a.f150255e : str2;
            boolean z18 = c4397a.f150256f;
            SearchParams searchParams2 = (i12 & 64) != 0 ? c4397a.f150257g : searchParams;
            String str6 = (i12 & 128) != 0 ? c4397a.f150258h : str3;
            String str7 = c4397a.f150259i;
            ActiveItemsPreview activeItemsPreview = c4397a.f150260j;
            SearchCorrectionItem searchCorrectionItem2 = (i12 & 1024) != 0 ? c4397a.f150261k : searchCorrectionItem;
            boolean z19 = (i12 & 2048) != 0 ? c4397a.f150262l : z14;
            Integer num4 = (i12 & 4096) != 0 ? c4397a.f150263m : num;
            Integer num5 = (i12 & 8192) != 0 ? c4397a.f150264n : num2;
            Integer num6 = c4397a.f150265o;
            Integer num7 = (32768 & i12) != 0 ? c4397a.f150266p : num3;
            List list2 = (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? c4397a.f150267q : list;
            String str8 = c4397a.f150268r;
            String str9 = c4397a.f150269s;
            SearchFormat searchFormat = c4397a.f150270t;
            c4397a.getClass();
            return new C4397a(z15, z16, z17, str4, str5, z18, searchParams2, str6, str7, activeItemsPreview, searchCorrectionItem2, z19, num4, num5, num6, num7, list2, str8, str9, searchFormat);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4397a)) {
                return false;
            }
            C4397a c4397a = (C4397a) obj;
            return this.f150251a == c4397a.f150251a && this.f150252b == c4397a.f150252b && this.f150253c == c4397a.f150253c && L.f(this.f150254d, c4397a.f150254d) && L.f(this.f150255e, c4397a.f150255e) && this.f150256f == c4397a.f150256f && L.f(this.f150257g, c4397a.f150257g) && L.f(this.f150258h, c4397a.f150258h) && L.f(this.f150259i, c4397a.f150259i) && L.f(this.f150260j, c4397a.f150260j) && L.f(this.f150261k, c4397a.f150261k) && this.f150262l == c4397a.f150262l && L.f(this.f150263m, c4397a.f150263m) && L.f(this.f150264n, c4397a.f150264n) && L.f(this.f150265o, c4397a.f150265o) && L.f(this.f150266p, c4397a.f150266p) && L.f(this.f150267q, c4397a.f150267q) && L.f(this.f150268r, c4397a.f150268r) && L.f(this.f150269s, c4397a.f150269s) && this.f150270t == c4397a.f150270t;
        }

        public final int hashCode() {
            int i12 = r.i(r.i(Boolean.hashCode(this.f150251a) * 31, 31, this.f150252b), 31, this.f150253c);
            String str = this.f150254d;
            int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f150255e;
            int iD2 = H.d((this.f150257g.hashCode() + r.i((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f150256f)) * 31, 31, this.f150258h);
            String str3 = this.f150259i;
            int iHashCode2 = (iD2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ActiveItemsPreview activeItemsPreview = this.f150260j;
            int iHashCode3 = (iHashCode2 + (activeItemsPreview == null ? 0 : activeItemsPreview.hashCode())) * 31;
            SearchCorrectionItem searchCorrectionItem = this.f150261k;
            int i13 = r.i((iHashCode3 + (searchCorrectionItem == null ? 0 : searchCorrectionItem.hashCode())) * 31, 31, this.f150262l);
            Integer num = this.f150263m;
            int iHashCode4 = (i13 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f150264n;
            int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.f150265o;
            int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.f150266p;
            int iE2 = H.e((iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31, 31, this.f150267q);
            String str4 = this.f150268r;
            int iHashCode7 = (iE2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f150269s;
            return this.f150270t.hashCode() + ((iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActiveAdvertsSearchState: { adverts.size: ");
            D8.r(this.f150267q, sb2, ", totalCount: ");
            sb2.append(this.f150263m);
            sb2.append(", foundCount: ");
            sb2.append(this.f150264n);
            sb2.append(", userInput : ");
            sb2.append(this.f150258h);
            sb2.append(", activeItemsPreview: ");
            sb2.append(this.f150260j);
            sb2.append(" }");
            return sb2.toString();
        }

        public C4397a(boolean z12, boolean z13, boolean z14, String str, String str2, boolean z15, SearchParams searchParams, String str3, String str4, ActiveItemsPreview activeItemsPreview, SearchCorrectionItem searchCorrectionItem, boolean z16, Integer num, Integer num2, Integer num3, Integer num4, List list, String str5, String str6, SearchFormat searchFormat, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? false : z14, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? false : z15, searchParams, (i12 & 128) != 0 ? "" : str3, (i12 & 256) != 0 ? null : str4, (i12 & 512) != 0 ? null : activeItemsPreview, (i12 & 1024) != 0 ? null : searchCorrectionItem, (i12 & 2048) != 0 ? false : z16, (i12 & 4096) != 0 ? null : num, (i12 & 8192) != 0 ? null : num2, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : num3, (32768 & i12) != 0 ? null : num4, (65536 & i12) != 0 ? C42784z0.f406748b : list, (131072 & i12) != 0 ? null : str5, (262144 & i12) != 0 ? null : str6, (i12 & 524288) != 0 ? SearchFormat.f149460b : searchFormat);
        }
    }
}
