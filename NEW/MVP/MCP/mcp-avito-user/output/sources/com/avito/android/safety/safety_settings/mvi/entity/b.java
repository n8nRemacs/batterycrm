package com.avito.android.safety.safety_settings.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsElement;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SafetySettingsState.kt */
@F3
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/b;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/safety/safety_settings/mvi/entity/b$a;", "Lcom/avito/android/safety/safety_settings/mvi/entity/b$b;", "Lcom/avito/android/safety/safety_settings/mvi/entity/b$c;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class b extends q {

    /* compiled from: SafetySettingsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/b$a;", "Lcom/avito/android/safety/safety_settings/mvi/entity/b;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f257740b;

        public a(@k String str) {
            super(null);
            this.f257740b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f257740b, ((a) obj).f257740b);
        }

        public final int hashCode() {
            return this.f257740b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Error(message="), this.f257740b, ')');
        }
    }

    /* compiled from: SafetySettingsState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/b$b;", "Lcom/avito/android/safety/safety_settings/mvi/entity/b;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.safety.safety_settings.mvi.entity.b$b, reason: collision with other inner class name */
    public static final /* data */ class C7737b extends b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final C7737b f257741b = new C7737b();

        public C7737b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C7737b);
        }

        public final int hashCode() {
            return 1801232284;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ b(C42822w c42822w) {
        this();
    }

    public b() {
    }

    /* compiled from: SafetySettingsState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/entity/b$c;", "Lcom/avito/android/safety/safety_settings/mvi/entity/b;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<SafetySettingsElement> f257742b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f257743c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Long f257744d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f257745e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f257746f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f257747g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f257748h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final List<SafetySettingsElement.SessionItem.a> f257749i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f257750j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final String f257751k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final DeepLink f257752l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f257753m;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@k List<? extends SafetySettingsElement> list, boolean z12, @l Long l12, boolean z13, boolean z14, boolean z15, boolean z16, @k List<SafetySettingsElement.SessionItem.a> list2, boolean z17, @l String str, @l DeepLink deepLink, boolean z18) {
            super(null);
            this.f257742b = list;
            this.f257743c = z12;
            this.f257744d = l12;
            this.f257745e = z13;
            this.f257746f = z14;
            this.f257747g = z15;
            this.f257748h = z16;
            this.f257749i = list2;
            this.f257750j = z17;
            this.f257751k = str;
            this.f257752l = deepLink;
            this.f257753m = z18;
        }

        public static c a(c cVar, ArrayList arrayList, boolean z12, Long l12, boolean z13, boolean z14, boolean z15, boolean z16, List list, boolean z17, String str, DeepLink deepLink, int i12) {
            List<SafetySettingsElement> list2 = (i12 & 1) != 0 ? cVar.f257742b : arrayList;
            boolean z18 = (i12 & 2) != 0 ? cVar.f257743c : z12;
            Long l13 = (i12 & 4) != 0 ? cVar.f257744d : l12;
            boolean z19 = (i12 & 8) != 0 ? cVar.f257745e : z13;
            boolean z22 = (i12 & 16) != 0 ? cVar.f257746f : z14;
            boolean z23 = (i12 & 32) != 0 ? cVar.f257747g : z15;
            boolean z24 = (i12 & 64) != 0 ? cVar.f257748h : z16;
            List list3 = (i12 & 128) != 0 ? cVar.f257749i : list;
            boolean z25 = (i12 & 256) != 0 ? cVar.f257750j : z17;
            String str2 = (i12 & 512) != 0 ? cVar.f257751k : str;
            DeepLink deepLink2 = (i12 & 1024) != 0 ? cVar.f257752l : deepLink;
            boolean z26 = (i12 & 2048) != 0 ? cVar.f257753m : true;
            cVar.getClass();
            return new c(list2, z18, l13, z19, z22, z23, z24, list3, z25, str2, deepLink2, z26);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f257742b, cVar.f257742b) && this.f257743c == cVar.f257743c && L.f(this.f257744d, cVar.f257744d) && this.f257745e == cVar.f257745e && this.f257746f == cVar.f257746f && this.f257747g == cVar.f257747g && this.f257748h == cVar.f257748h && L.f(this.f257749i, cVar.f257749i) && this.f257750j == cVar.f257750j && L.f(this.f257751k, cVar.f257751k) && L.f(this.f257752l, cVar.f257752l) && this.f257753m == cVar.f257753m;
        }

        public final int hashCode() {
            int i12 = r.i(this.f257742b.hashCode() * 31, 31, this.f257743c);
            Long l12 = this.f257744d;
            int i13 = r.i(H.e(r.i(r.i(r.i(r.i((i12 + (l12 == null ? 0 : l12.hashCode())) * 31, 31, this.f257745e), 31, this.f257746f), 31, this.f257747g), 31, this.f257748h), 31, this.f257749i), 31, this.f257750j);
            String str = this.f257751k;
            int iHashCode = (i13 + (str == null ? 0 : str.hashCode())) * 31;
            DeepLink deepLink = this.f257752l;
            return Boolean.hashCode(this.f257753m) + ((iHashCode + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Success(elements=");
            sb2.append(this.f257742b);
            sb2.append(", isSessionActionLoading=");
            sb2.append(this.f257743c);
            sb2.append(", cursor=");
            sb2.append(this.f257744d);
            sb2.append(", isAdditionalSessionsLoading=");
            sb2.append(this.f257745e);
            sb2.append(", hasAdditionalSessionsLoadingError=");
            sb2.append(this.f257746f);
            sb2.append(", isUnavailableTfaBottomSheetShown=");
            sb2.append(this.f257747g);
            sb2.append(", isSessionBottomSheetShown=");
            sb2.append(this.f257748h);
            sb2.append(", sessionActions=");
            sb2.append(this.f257749i);
            sb2.append(", isAfterLogoutSessionBottomSheetShown=");
            sb2.append(this.f257750j);
            sb2.append(", afterLogoutSessionName=");
            sb2.append(this.f257751k);
            sb2.append(", afterLogoutSessionDeeplink=");
            sb2.append(this.f257752l);
            sb2.append(", needParentRefresh=");
            return r.x(sb2, this.f257753m, ')');
        }

        public c(List list, boolean z12, Long l12, boolean z13, boolean z14, boolean z15, boolean z16, List list2, boolean z17, String str, DeepLink deepLink, boolean z18, int i12, C42822w c42822w) {
            this(list, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? null : l12, (i12 & 8) != 0 ? false : z13, (i12 & 16) != 0 ? false : z14, (i12 & 32) != 0 ? false : z15, (i12 & 64) != 0 ? false : z16, (i12 & 128) != 0 ? C42784z0.f406748b : list2, (i12 & 256) != 0 ? false : z17, (i12 & 512) != 0 ? null : str, (i12 & 1024) == 0 ? deepLink : null, (i12 & 2048) == 0 ? z18 : false);
        }
    }
}
