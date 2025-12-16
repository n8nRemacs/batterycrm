package com.avito.android.serp.analytics.widgets_tracker;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.widget_analytics.Analytics;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActionConfig.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/a;", "", "a", "b", "c", "d", "Lcom/avito/android/serp/analytics/widgets_tracker/a$a;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$b;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$c;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$d;", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: ActionConfig.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/a$a;", "Lcom/avito/android/serp/analytics/widgets_tracker/a;", "a", "b", "c", "Lcom/avito/android/serp/analytics/widgets_tracker/a$a$a;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$a$b;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$a$c;", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.serp.analytics.widgets_tracker.a$a, reason: collision with other inner class name */
    public interface InterfaceC8123a extends a {

        /* compiled from: ActionConfig.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/a$a$a;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$a;", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.serp.analytics.widgets_tracker.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C8124a implements InterfaceC8123a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f273908a;

            /* renamed from: b, reason: collision with root package name */
            public final int f273909b;

            public C8124a(@k String str, int i12) {
                this.f273908a = str;
                this.f273909b = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C8124a)) {
                    return false;
                }
                C8124a c8124a = (C8124a) obj;
                return L.f(this.f273908a, c8124a.f273908a) && this.f273909b == c8124a.f273909b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f273909b) + (this.f273908a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Click_8676(service=");
                sb2.append(this.f273908a);
                sb2.append(", position=");
                return r.t(sb2, this.f273909b, ')');
            }
        }

        /* compiled from: ActionConfig.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/a$a$b;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$a;", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.serp.analytics.widgets_tracker.a$a$b */
        public static final /* data */ class b implements InterfaceC8123a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f273910a;

            /* renamed from: b, reason: collision with root package name */
            public final int f273911b;

            public b(@k String str, int i12) {
                this.f273910a = str;
                this.f273911b = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f273910a, bVar.f273910a) && this.f273911b == bVar.f273911b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f273911b) + (this.f273910a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Show_14358(service=");
                sb2.append(this.f273910a);
                sb2.append(", position=");
                return r.t(sb2, this.f273911b, ')');
            }
        }

        /* compiled from: ActionConfig.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/a$a$c;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$a;", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.serp.analytics.widgets_tracker.a$a$c */
        public static final /* data */ class c implements InterfaceC8123a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f273912a;

            public c(@k String str) {
                this.f273912a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f273912a, ((c) obj).f273912a);
            }

            public final int hashCode() {
                return this.f273912a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Show_8675(shortcutsTitles="), this.f273912a, ')');
            }
        }
    }

    /* compiled from: ActionConfig.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/a$b;", "Lcom/avito/android/serp/analytics/widgets_tracker/a;", "a", "b", "c", "Lcom/avito/android/serp/analytics/widgets_tracker/a$b$a;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$b$b;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$b$c;", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends a {

        /* compiled from: ActionConfig.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/a$b$a;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$b;", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.serp.analytics.widgets_tracker.a$b$a, reason: collision with other inner class name */
        public static final /* data */ class C8125a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f273913a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f273914b;

            public C8125a(@k String str, @k String str2) {
                this.f273913a = str;
                this.f273914b = str2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C8125a)) {
                    return false;
                }
                C8125a c8125a = (C8125a) obj;
                return L.f(this.f273913a, c8125a.f273913a) && L.f(this.f273914b, c8125a.f273914b);
            }

            public final int hashCode() {
                return this.f273914b.hashCode() + (this.f273913a.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Click_14431(title=");
                sb2.append(this.f273913a);
                sb2.append(", fromSource=");
                return C22026a.c(sb2, this.f273914b, ')');
            }
        }

        /* compiled from: ActionConfig.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/a$b$b;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$b;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.serp.analytics.widgets_tracker.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C8126b implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final C8126b f273915a = new C8126b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C8126b);
            }

            public final int hashCode() {
                return 219726411;
            }

            @k
            public final String toString() {
                return "Scroll_14432";
            }
        }

        /* compiled from: ActionConfig.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/a$b$c;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$b;", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f273916a;

            public c(@k String str) {
                this.f273916a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f273916a, ((c) obj).f273916a);
            }

            public final int hashCode() {
                return this.f273916a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Show_14430(titles="), this.f273916a, ')');
            }
        }
    }

    /* compiled from: ActionConfig.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/a$c;", "Lcom/avito/android/serp/analytics/widgets_tracker/a;", "a", "b", "c", "d", "Lcom/avito/android/serp/analytics/widgets_tracker/a$c$a;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$c$b;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$c$c;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$c$d;", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends a {

        /* compiled from: ActionConfig.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/a$c$a;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$c;", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.serp.analytics.widgets_tracker.a$c$a, reason: collision with other inner class name */
        public static final /* data */ class C8127a implements c {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f273917a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f273918b;

            /* renamed from: c, reason: collision with root package name */
            public final int f273919c;

            public C8127a(@k String str, @l String str2, int i12) {
                this.f273917a = str;
                this.f273918b = str2;
                this.f273919c = i12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C8127a)) {
                    return false;
                }
                C8127a c8127a = (C8127a) obj;
                return L.f(this.f273917a, c8127a.f273917a) && L.f(this.f273918b, c8127a.f273918b) && this.f273919c == c8127a.f273919c;
            }

            public final int hashCode() {
                int iHashCode = this.f273917a.hashCode() * 31;
                String str = this.f273918b;
                return Integer.hashCode(this.f273919c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Click_4203(id=");
                sb2.append(this.f273917a);
                sb2.append(", title=");
                sb2.append(this.f273918b);
                sb2.append(", position=");
                return r.t(sb2, this.f273919c, ')');
            }
        }

        /* compiled from: ActionConfig.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/a$c$b;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$c;", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements c {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f273920a;

            public b(@l String str) {
                this.f273920a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && L.f(this.f273920a, ((b) obj).f273920a);
            }

            public final int hashCode() {
                String str = this.f273920a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Click_9491(title="), this.f273920a, ')');
            }
        }

        /* compiled from: ActionConfig.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/a$c$c;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$c;", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.serp.analytics.widgets_tracker.a$c$c, reason: collision with other inner class name */
        public static final /* data */ class C8128c implements c {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final ArrayList f273921a;

            public C8128c(@l ArrayList arrayList) {
                this.f273921a = arrayList;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C8128c) && L.f(this.f273921a, ((C8128c) obj).f273921a);
            }

            public final int hashCode() {
                ArrayList arrayList = this.f273921a;
                if (arrayList == null) {
                    return 0;
                }
                return arrayList.hashCode();
            }

            @k
            public final String toString() {
                return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("Show_4310(ids="), this.f273921a, ')');
            }
        }

        /* compiled from: ActionConfig.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/a$c$d;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$c;", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements c {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f273922a;

            public d(@l String str) {
                this.f273922a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && L.f(this.f273922a, ((d) obj).f273922a);
            }

            public final int hashCode() {
                String str = this.f273922a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Show_9490(title="), this.f273922a, ')');
            }
        }
    }

    /* compiled from: ActionConfig.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/a$d;", "Lcom/avito/android/serp/analytics/widgets_tracker/a;", "a", "b", "c", "Lcom/avito/android/serp/analytics/widgets_tracker/a$d$a;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$d$b;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$d$c;", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface d extends a {

        /* compiled from: ActionConfig.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/a$d$a;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$d;", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.serp.analytics.widgets_tracker.a$d$a, reason: collision with other inner class name */
        public static final /* data */ class C8129a implements d {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final Integer f273923a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f273924b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f273925c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final String f273926d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final Integer f273927e;

            /* renamed from: f, reason: collision with root package name */
            @l
            public final Long f273928f;

            /* renamed from: g, reason: collision with root package name */
            @l
            public final Map<String, String> f273929g;

            /* renamed from: h, reason: collision with root package name */
            @l
            public final Analytics f273930h;

            public C8129a(@l Integer num, @l String str, @l String str2, @l String str3, @l Integer num2, @l Long l12, @l Map<String, String> map, @l Analytics analytics) {
                this.f273923a = num;
                this.f273924b = str;
                this.f273925c = str2;
                this.f273926d = str3;
                this.f273927e = num2;
                this.f273928f = l12;
                this.f273929g = map;
                this.f273930h = analytics;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C8129a)) {
                    return false;
                }
                C8129a c8129a = (C8129a) obj;
                return L.f(this.f273923a, c8129a.f273923a) && L.f(this.f273924b, c8129a.f273924b) && L.f(this.f273925c, c8129a.f273925c) && L.f(this.f273926d, c8129a.f273926d) && L.f(this.f273927e, c8129a.f273927e) && L.f(this.f273928f, c8129a.f273928f) && L.f(this.f273929g, c8129a.f273929g) && L.f(this.f273930h, c8129a.f273930h);
            }

            public final int hashCode() {
                Integer num = this.f273923a;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                String str = this.f273924b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f273925c;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f273926d;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Integer num2 = this.f273927e;
                int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Long l12 = this.f273928f;
                int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
                Map<String, String> map = this.f273929g;
                int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
                Analytics analytics = this.f273930h;
                return iHashCode7 + (analytics != null ? analytics.hashCode() : 0);
            }

            @k
            public final String toString() {
                return "Click_4921(position=" + this.f273923a + ", fromPage=" + this.f273924b + ", targetPage=" + this.f273925c + ", promoId=" + this.f273926d + ", optionNumber=" + this.f273927e + ", mcid=" + this.f273928f + ", additionalParams=" + this.f273929g + ", customWidgetAnalytics=" + this.f273930h + ')';
            }
        }

        /* compiled from: ActionConfig.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/a$d$b;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$d;", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements d {

            /* renamed from: a, reason: collision with root package name */
            public final int f273931a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f273932b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f273933c;

            /* renamed from: d, reason: collision with root package name */
            @l
            public final String f273934d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final Long f273935e;

            /* renamed from: f, reason: collision with root package name */
            @l
            public final Map<String, String> f273936f;

            /* renamed from: g, reason: collision with root package name */
            @l
            public final Analytics f273937g;

            public b(int i12, @l String str, @l String str2, @l String str3, @l Long l12, @l Map<String, String> map, @l Analytics analytics) {
                this.f273931a = i12;
                this.f273932b = str;
                this.f273933c = str2;
                this.f273934d = str3;
                this.f273935e = l12;
                this.f273936f = map;
                this.f273937g = analytics;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.f273931a == bVar.f273931a && L.f(this.f273932b, bVar.f273932b) && L.f(this.f273933c, bVar.f273933c) && L.f(this.f273934d, bVar.f273934d) && L.f(this.f273935e, bVar.f273935e) && L.f(this.f273936f, bVar.f273936f) && L.f(this.f273937g, bVar.f273937g);
            }

            public final int hashCode() {
                int iHashCode = Integer.hashCode(this.f273931a) * 31;
                String str = this.f273932b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f273933c;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f273934d;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Long l12 = this.f273935e;
                int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
                Map<String, String> map = this.f273936f;
                int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
                Analytics analytics = this.f273937g;
                return iHashCode6 + (analytics != null ? analytics.hashCode() : 0);
            }

            @k
            public final String toString() {
                return "Show_4920(position=" + this.f273931a + ", fromPage=" + this.f273932b + ", targetPage=" + this.f273933c + ", promoId=" + this.f273934d + ", mcid=" + this.f273935e + ", additionalParams=" + this.f273936f + ", customWidgetAnalytics=" + this.f273937g + ')';
            }
        }

        /* compiled from: ActionConfig.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/a$d$c;", "Lcom/avito/android/serp/analytics/widgets_tracker/a$d;", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements d {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f273938a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f273939b;

            public c(@k String str, @l String str2) {
                this.f273938a = str;
                this.f273939b = str2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f273938a, cVar.f273938a) && L.f(this.f273939b, cVar.f273939b);
            }

            public final int hashCode() {
                int iHashCode = this.f273938a.hashCode() * 31;
                String str = this.f273939b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Swipe_5807(fromPage=");
                sb2.append(this.f273938a);
                sb2.append(", targetPage=");
                return C22026a.c(sb2, this.f273939b, ')');
            }
        }
    }
}
