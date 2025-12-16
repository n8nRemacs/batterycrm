package com.avito.android.user_adverts.root_screen.adverts_host.host_view;

import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.tab_group.b;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: HostViewState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "AppBarContent", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$b;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$j;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class HostViewState extends com.avito.android.analytics.screens.mvi.q {

    /* compiled from: HostViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$AppBarContent;", "", "ExpandType", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AppBarContent {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ExpandType f312964a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f312965b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f312966c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: HostViewState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$AppBarContent$ExpandType;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ExpandType {

            /* renamed from: b, reason: collision with root package name */
            public static final ExpandType f312967b;

            /* renamed from: c, reason: collision with root package name */
            public static final ExpandType f312968c;

            /* renamed from: d, reason: collision with root package name */
            public static final ExpandType f312969d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ ExpandType[] f312970e;

            /* renamed from: f, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f312971f;

            static {
                ExpandType expandType = new ExpandType("None", 0);
                f312967b = expandType;
                ExpandType expandType2 = new ExpandType("Expand", 1);
                f312968c = expandType2;
                ExpandType expandType3 = new ExpandType("Collapse", 2);
                f312969d = expandType3;
                ExpandType[] expandTypeArr = {expandType, expandType2, expandType3};
                f312970e = expandTypeArr;
                f312971f = kotlin.enums.c.a(expandTypeArr);
            }

            public ExpandType() {
                throw null;
            }

            public static ExpandType valueOf(String str) {
                return (ExpandType) Enum.valueOf(ExpandType.class, str);
            }

            public static ExpandType[] values() {
                return (ExpandType[]) f312970e.clone();
            }
        }

        public AppBarContent(@Y61.k ExpandType expandType, boolean z12, @Y61.k String str) {
            this.f312964a = expandType;
            this.f312965b = z12;
            this.f312966c = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AppBarContent)) {
                return false;
            }
            AppBarContent appBarContent = (AppBarContent) obj;
            return this.f312964a == appBarContent.f312964a && this.f312965b == appBarContent.f312965b && L.f(this.f312966c, appBarContent.f312966c);
        }

        public final int hashCode() {
            return this.f312966c.hashCode() + androidx.appcompat.app.r.i(this.f312964a.hashCode() * 31, 31, this.f312965b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AppBarContent(expandType=");
            sb2.append(this.f312964a);
            sb2.append(", dragEnabled=");
            sb2.append(this.f312965b);
            sb2.append(", stateKey=");
            return C22026a.c(sb2, this.f312966c, ')');
        }
    }

    /* compiled from: HostViewState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState;", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$a$a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$a$b;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$a$c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a extends HostViewState {

        /* compiled from: HostViewState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$a$a;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.host_view.HostViewState$a$a, reason: collision with other inner class name */
        public static final /* data */ class C9588a extends a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final e f312972b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final i f312973c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final d f312974d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final f f312975e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.k
            public final AppBarContent f312976f;

            public C9588a(@Y61.k e eVar, @Y61.k i iVar, @Y61.k d dVar, @Y61.l f fVar, @Y61.k AppBarContent appBarContent) {
                super(null);
                this.f312972b = eVar;
                this.f312973c = iVar;
                this.f312974d = dVar;
                this.f312975e = fVar;
                this.f312976f = appBarContent;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9588a)) {
                    return false;
                }
                C9588a c9588a = (C9588a) obj;
                return L.f(this.f312972b, c9588a.f312972b) && L.f(this.f312973c, c9588a.f312973c) && L.f(this.f312974d, c9588a.f312974d) && L.f(this.f312975e, c9588a.f312975e) && L.f(this.f312976f, c9588a.f312976f);
            }

            public final int hashCode() {
                int iHashCode = (this.f312974d.hashCode() + ((this.f312973c.hashCode() + (this.f312972b.hashCode() * 31)) * 31)) * 31;
                f fVar = this.f312975e;
                return this.f312976f.hashCode() + ((iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31);
            }

            @Y61.k
            public final String toString() {
                return "Content(refreshContent=" + this.f312972b + ", tabsContent=" + this.f312973c + ", publishButtonContent=" + this.f312974d + ", secondaryButtonContent=" + this.f312975e + ", appBarContent=" + this.f312976f + ')';
            }
        }

        /* compiled from: HostViewState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$a$b;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final ApiError f312977b;

            public b(@Y61.l ApiError apiError) {
                super(null);
                this.f312977b = apiError;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f312977b, ((b) obj).f312977b);
            }

            public final int hashCode() {
                ApiError apiError = this.f312977b;
                if (apiError == null) {
                    return 0;
                }
                return apiError.hashCode();
            }

            @Y61.k
            public final String toString() {
                return AK.c.n(new StringBuilder("Error(apiError="), this.f312977b, ')');
            }
        }

        /* compiled from: HostViewState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$a$c;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final c f312978b = new c();

            public c() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1293319150;
            }

            @Y61.k
            public final String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
            super(null);
        }
    }

    /* compiled from: HostViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$b;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends HostViewState {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final b f312979b = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1048155107;
        }

        @Y61.k
        public final String toString() {
            return "None";
        }
    }

    /* compiled from: HostViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$c;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f312980a;

        public c(@Y61.k String str) {
            this.f312980a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f312980a, ((c) obj).f312980a);
        }

        public final int hashCode() {
            return this.f312980a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("PagerItem(shortcut="), this.f312980a, ')');
        }
    }

    /* compiled from: HostViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$d;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f312981a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f312982b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f312983c;

        public d(boolean z12, boolean z13, @Y61.k String str) {
            this.f312981a = z12;
            this.f312982b = z13;
            this.f312983c = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f312981a == dVar.f312981a && this.f312982b == dVar.f312982b && L.f(this.f312983c, dVar.f312983c);
        }

        public final int hashCode() {
            return this.f312983c.hashCode() + androidx.appcompat.app.r.i(Boolean.hashCode(this.f312981a) * 31, 31, this.f312982b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PublishButtonContent(isVisible=");
            sb2.append(this.f312981a);
            sb2.append(", behaviorEnabled=");
            sb2.append(this.f312982b);
            sb2.append(", stateKey=");
            return C22026a.c(sb2, this.f312983c, ')');
        }
    }

    /* compiled from: HostViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$e;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f312984a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f312985b;

        public e(boolean z12, boolean z13) {
            this.f312984a = z12;
            this.f312985b = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f312984a == eVar.f312984a && this.f312985b == eVar.f312985b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f312985b) + (Boolean.hashCode(this.f312984a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RefreshContent(refreshing=");
            sb2.append(this.f312984a);
            sb2.append(", enabled=");
            return androidx.appcompat.app.r.x(sb2, this.f312985b, ')');
        }
    }

    /* compiled from: HostViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$f;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f312986a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f312987b;

        public f(@Y61.k String str, @Y61.k DeepLink deepLink) {
            this.f312986a = str;
            this.f312987b = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f312986a, fVar.f312986a) && L.f(this.f312987b, fVar.f312987b);
        }

        public final int hashCode() {
            return this.f312987b.hashCode() + (this.f312986a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SecondaryButtonContent(title=");
            sb2.append(this.f312986a);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f312987b, ')');
        }
    }

    /* compiled from: HostViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$g;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f312988a;

        /* renamed from: b, reason: collision with root package name */
        public final int f312989b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f312990c;

        public g(int i12, @Y61.k PrintableText printableText, @Y61.k String str) {
            this.f312988a = printableText;
            this.f312989b = i12;
            this.f312990c = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f312988a, gVar.f312988a) && this.f312989b == gVar.f312989b && L.f(this.f312990c, gVar.f312990c);
        }

        public final int hashCode() {
            return this.f312990c.hashCode() + androidx.appcompat.app.r.e(this.f312989b, this.f312988a.hashCode() * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TabItem(title=");
            sb2.append(this.f312988a);
            sb2.append(", count=");
            sb2.append(this.f312989b);
            sb2.append(", shortcut=");
            return C22026a.c(sb2, this.f312990c, ')');
        }
    }

    /* compiled from: HostViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$h;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f312991a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f312992b;

        public h(int i12, @Y61.k String str) {
            this.f312991a = i12;
            this.f312992b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f312991a == hVar.f312991a && L.f(this.f312992b, hVar.f312992b);
        }

        public final int hashCode() {
            return this.f312992b.hashCode() + (Integer.hashCode(this.f312991a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TabSelectedInfo(position=");
            sb2.append(this.f312991a);
            sb2.append(", shortcut=");
            return C22026a.c(sb2, this.f312992b, ')');
        }
    }

    /* compiled from: HostViewState.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$i;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f312993a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final h f312994b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f312995c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ArrayList f312996d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final ArrayList f312997e;

        public i(@Y61.k ArrayList arrayList, @Y61.k h hVar, @Y61.k String str) {
            this.f312993a = arrayList;
            this.f312994b = hVar;
            this.f312995c = str;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                arrayList2.add(new com.avito.android.lib.design.tab_group.b(gVar.f312988a, new b.a.c(gVar.f312989b, null, null, 2, null), false, 4, null));
            }
            this.f312996d = arrayList2;
            ArrayList arrayList3 = this.f312993a;
            ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new c(((g) it2.next()).f312990c));
            }
            this.f312997e = arrayList4;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.f312993a.equals(iVar.f312993a) && this.f312994b.equals(iVar.f312994b) && L.f(this.f312995c, iVar.f312995c);
        }

        public final int hashCode() {
            return this.f312995c.hashCode() + ((this.f312994b.hashCode() + (this.f312993a.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TabsContent(tabs=");
            sb2.append(this.f312993a);
            sb2.append(", selectedTab=");
            sb2.append(this.f312994b);
            sb2.append(", stateKey=");
            return C22026a.c(sb2, this.f312995c, ')');
        }
    }

    /* compiled from: HostViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState$j;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/host_view/HostViewState;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j extends HostViewState {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final j f312998b = new j();

        public j() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -840811271;
        }

        @Y61.k
        public final String toString() {
            return "UnAuthorized";
        }
    }

    public /* synthetic */ HostViewState(C42822w c42822w) {
        this();
    }

    public HostViewState() {
    }
}
