package com.avito.android.publish;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.tracker.ScreenTransfer;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Navigation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RoutingAction.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001a\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u0082\u0001\u001a\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./012345¨\u00066"}, d2 = {"Lcom/avito/android/publish/Q0;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "Lcom/avito/android/publish/Q0$a;", "Lcom/avito/android/publish/Q0$b;", "Lcom/avito/android/publish/Q0$c;", "Lcom/avito/android/publish/Q0$d;", "Lcom/avito/android/publish/Q0$e;", "Lcom/avito/android/publish/Q0$f;", "Lcom/avito/android/publish/Q0$g;", "Lcom/avito/android/publish/Q0$h;", "Lcom/avito/android/publish/Q0$i;", "Lcom/avito/android/publish/Q0$j;", "Lcom/avito/android/publish/Q0$k;", "Lcom/avito/android/publish/Q0$l;", "Lcom/avito/android/publish/Q0$m;", "Lcom/avito/android/publish/Q0$n;", "Lcom/avito/android/publish/Q0$o;", "Lcom/avito/android/publish/Q0$p;", "Lcom/avito/android/publish/Q0$q;", "Lcom/avito/android/publish/Q0$r;", "Lcom/avito/android/publish/Q0$s;", "Lcom/avito/android/publish/Q0$t;", "Lcom/avito/android/publish/Q0$u;", "Lcom/avito/android/publish/Q0$v;", "Lcom/avito/android/publish/Q0$w;", "Lcom/avito/android/publish/Q0$x;", "Lcom/avito/android/publish/Q0$y;", "Lcom/avito/android/publish/Q0$z;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f232038a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final ScreenTransfer f232039b;

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/Q0$a;", "Lcom/avito/android/publish/Q0;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final a f232040c = new a();

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            super(false, null, 3, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/Q0$b;", "Lcom/avito/android/publish/Q0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        public final int f232041c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(int i12, boolean z12) {
            super(z12, null, 2, 0 == true ? 1 : 0);
            this.f232041c = i12;
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/Q0$c;", "Lcom/avito/android/publish/Q0;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final c f232042c = new c();

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            super(false, null, 3, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/Q0$d;", "Lcom/avito/android/publish/Q0;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final d f232043c = new d();

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            super(false, null, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -407118512;
        }

        @Y61.k
        public final String toString() {
            return "ClearBackStack";
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/Q0$e;", "Lcom/avito/android/publish/Q0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        public final int f232044c;

        /* JADX WARN: Multi-variable type inference failed */
        public e(int i12) {
            super(false, null, 3, 0 == true ? 1 : 0);
            this.f232044c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f232044c == ((e) obj).f232044c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f232044c);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("Edit(stepIndex="), this.f232044c, ')');
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/Q0$f;", "Lcom/avito/android/publish/Q0;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final f f232045c = new f();

        /* JADX WARN: Multi-variable type inference failed */
        public f() {
            super(false, null, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 703811550;
        }

        @Y61.k
        public final String toString() {
            return "HideLoading";
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/Q0$g;", "Lcom/avito/android/publish/Q0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        public final int f232046c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f232047d;

        /* JADX WARN: Multi-variable type inference failed */
        public g(int i12, boolean z12) {
            super(false, null, 3, 0 == true ? 1 : 0);
            this.f232046c = i12;
            this.f232047d = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f232046c == gVar.f232046c && this.f232047d == gVar.f232047d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f232047d) + (Integer.hashCode(this.f232046c) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InfomodelRequest(stepIndex=");
            sb2.append(this.f232046c);
            sb2.append(", isInitial=");
            return androidx.appcompat.app.r.x(sb2, this.f232047d, ')');
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/Q0$h;", "Lcom/avito/android/publish/Q0;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final h f232048c = new h();

        /* JADX WARN: Multi-variable type inference failed */
        public h() {
            super(false, null, 3, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/Q0$i;", "Lcom/avito/android/publish/Q0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        public final int f232049c;

        /* JADX WARN: Multi-variable type inference failed */
        public i(int i12) {
            super(false, null, 3, 0 == true ? 1 : 0);
            this.f232049c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f232049c == ((i) obj).f232049c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f232049c);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("MergedPretendPremoderation(stepIndex="), this.f232049c, ')');
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/Q0$j;", "Lcom/avito/android/publish/Q0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final DeepLink f232050c;

        /* JADX WARN: Multi-variable type inference failed */
        public j(@Y61.k DeepLink deepLink) {
            super(false, null, 3, 0 == true ? 1 : 0);
            this.f232050c = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && kotlin.jvm.internal.L.f(this.f232050c, ((j) obj).f232050c);
        }

        public final int hashCode() {
            return this.f232050c.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f232050c, ')');
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/Q0$k;", "Lcom/avito/android/publish/Q0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        public final int f232051c;

        /* JADX WARN: Multi-variable type inference failed */
        public k(int i12) {
            super(false, null, 3, 0 == true ? 1 : 0);
            this.f232051c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f232051c == ((k) obj).f232051c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f232051c);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("Premoderation(stepIndex="), this.f232051c, ')');
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/Q0$l;", "Lcom/avito/android/publish/Q0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        public final int f232052c;

        /* JADX WARN: Multi-variable type inference failed */
        public l(int i12) {
            super(false, null, 3, 0 == true ? 1 : 0);
            this.f232052c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f232052c == ((l) obj).f232052c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f232052c);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("Pretend(stepIndex="), this.f232052c, ')');
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/Q0$m;", "Lcom/avito/android/publish/Q0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        public final int f232053c;

        /* JADX WARN: Multi-variable type inference failed */
        public m(int i12) {
            super(false, null, 3, 0 == true ? 1 : 0);
            this.f232053c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.f232053c == ((m) obj).f232053c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f232053c);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("Publish(stepIndex="), this.f232053c, ')');
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/Q0$n;", "Lcom/avito/android/publish/Q0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        public final int f232054c;

        /* JADX WARN: Multi-variable type inference failed */
        public n(int i12) {
            super(false, null, 3, 0 == true ? 1 : 0);
            this.f232054c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f232054c == ((n) obj).f232054c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f232054c);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("Restriction(stepIndex="), this.f232054c, ')');
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/Q0$o;", "Lcom/avito/android/publish/Q0;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final o f232055c = new o();

        /* JADX WARN: Multi-variable type inference failed */
        public o() {
            super(false, null, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 1212381635;
        }

        @Y61.k
        public final String toString() {
            return "ShowLoading";
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/Q0$p;", "Lcom/avito/android/publish/Q0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f232056c;

        /* JADX WARN: Multi-variable type inference failed */
        public p(@Y61.k String str) {
            super(false, null, 3, 0 == true ? 1 : 0);
            this.f232056c = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && kotlin.jvm.internal.L.f(this.f232056c, ((p) obj).f232056c);
        }

        public final int hashCode() {
            return this.f232056c.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowMessage(text="), this.f232056c, ')');
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/Q0$q;", "Lcom/avito/android/publish/Q0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        public final int f232057c;

        /* JADX WARN: Multi-variable type inference failed */
        public q(int i12) {
            super(false, null, 3, 0 == true ? 1 : 0);
            this.f232057c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.f232057c == ((q) obj).f232057c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f232057c);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("SuggestParams(stepIndex="), this.f232057c, ')');
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/Q0$r;", "Lcom/avito/android/publish/Q0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class r extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        public final int f232058c;

        /* JADX WARN: Multi-variable type inference failed */
        public r(int i12) {
            super(true, null, 2, 0 == true ? 1 : 0);
            this.f232058c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f232058c == ((r) obj).f232058c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f232058c);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("ToCategoriesSuggestions(stepIndex="), this.f232058c, ')');
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/Q0$s;", "Lcom/avito/android/publish/Q0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class s extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        public final int f232059c;

        public s(int i12, @Y61.l ScreenTransfer screenTransfer) {
            super(true, screenTransfer, null);
            this.f232059c = i12;
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/Q0$t;", "Lcom/avito/android/publish/Q0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class t extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        public final int f232060c;

        /* JADX WARN: Multi-variable type inference failed */
        public t(int i12) {
            super(true, null, 2, 0 == true ? 1 : 0);
            this.f232060c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.f232060c == ((t) obj).f232060c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f232060c);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("ToFreeDelivery(stepIndex="), this.f232060c, ')');
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/Q0$u;", "Lcom/avito/android/publish/Q0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class u extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        public final int f232061c;

        /* JADX WARN: Multi-variable type inference failed */
        public u(int i12) {
            super(true, null, 2, 0 == true ? 1 : 0);
            this.f232061c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && this.f232061c == ((u) obj).f232061c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f232061c);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("ToInputImei(stepIndex="), this.f232061c, ')');
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/Q0$v;", "Lcom/avito/android/publish/Q0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class v extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        public final int f232062c;

        /* JADX WARN: Multi-variable type inference failed */
        public v(int i12) {
            super(true, null, 2, 0 == true ? 1 : 0);
            this.f232062c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && this.f232062c == ((v) obj).f232062c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f232062c);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("ToInputVin(stepIndex="), this.f232062c, ')');
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/Q0$w;", "Lcom/avito/android/publish/Q0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class w extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        public final int f232063c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f232064d;

        /* JADX WARN: Multi-variable type inference failed */
        public w(int i12, @Y61.k String str) {
            super(true, null, 2, 0 == true ? 1 : 0);
            this.f232063c = i12;
            this.f232064d = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            w wVar = (w) obj;
            return this.f232063c == wVar.f232063c && kotlin.jvm.internal.L.f(this.f232064d, wVar.f232064d);
        }

        public final int hashCode() {
            return this.f232064d.hashCode() + (Integer.hashCode(this.f232063c) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ToPriceList(stepIndex=");
            sb2.append(this.f232063c);
            sb2.append(", priceListId=");
            return C22026a.c(sb2, this.f232064d, ')');
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/Q0$x;", "Lcom/avito/android/publish/Q0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class x extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        public final int f232065c;

        /* JADX WARN: Multi-variable type inference failed */
        public x(int i12) {
            super(true, null, 2, 0 == true ? 1 : 0);
            this.f232065c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && this.f232065c == ((x) obj).f232065c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f232065c);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.t(new StringBuilder("ToSelect(stepIndex="), this.f232065c, ')');
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/Q0$y;", "Lcom/avito/android/publish/Q0;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class y extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        public final int f232066c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Navigation f232067d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final List<Navigation> f232068e;

        /* JADX WARN: Multi-variable type inference failed */
        public y(int i12, @Y61.k Navigation navigation2, @Y61.l List<Navigation> list) {
            super(true, null, 2, 0 == true ? 1 : 0);
            this.f232066c = i12;
            this.f232067d = navigation2;
            this.f232068e = list;
        }
    }

    /* compiled from: RoutingAction.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/Q0$z;", "Lcom/avito/android/publish/Q0;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class z extends Q0 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final z f232069c = new z();

        /* JADX WARN: Multi-variable type inference failed */
        public z() {
            super(false, null, 3, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ Q0(boolean z12, ScreenTransfer screenTransfer, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : screenTransfer, null);
    }

    public Q0(boolean z12, ScreenTransfer screenTransfer, C42822w c42822w) {
        this.f232038a = z12;
        this.f232039b = screenTransfer;
    }
}
