package jL0;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.button.t;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Image;
import hL0.C40846a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import wZ.j;

/* compiled from: AutoprolongState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"LjL0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jL0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C42282c extends q {

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final b f405563l = new b(null);

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final C42282c f405564m = new C42282c(null, true, false, null, null, "", null, null, null, null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ApiError f405565b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f405566c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f405567d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C40846a f405568e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final j f405569f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f405570g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final C11561c f405571h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final d f405572i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final a f405573j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f405574k;

    /* compiled from: AutoprolongState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjL0/c$a;", "", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jL0.c$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f405575a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final p<A, Integer, t> f405576b;

        public a(@k p pVar, @k String str) {
            this.f405575a = str;
            this.f405576b = pVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f405575a, aVar.f405575a) && L.f(this.f405576b, aVar.f405576b);
        }

        public final int hashCode() {
            return this.f405576b.hashCode() + (this.f405575a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Button(text=" + this.f405575a + ", style=" + this.f405576b + ')';
        }
    }

    /* compiled from: AutoprolongState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LjL0/c$b;", "", "<init>", "()V", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jL0.c$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: AutoprolongState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjL0/c$c;", "", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jL0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C11561c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Image f405577a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f405578b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f405579c;

        public C11561c(@k Image image, @k String str, @k String str2) {
            this.f405577a = image;
            this.f405578b = str;
            this.f405579c = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11561c)) {
                return false;
            }
            C11561c c11561c = (C11561c) obj;
            return L.f(this.f405577a, c11561c.f405577a) && L.f(this.f405578b, c11561c.f405578b) && L.f(this.f405579c, c11561c.f405579c);
        }

        public final int hashCode() {
            return this.f405579c.hashCode() + H.d(this.f405577a.hashCode() * 31, 31, this.f405578b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ServiceSection(icon=");
            sb2.append(this.f405577a);
            sb2.append(", title=");
            sb2.append(this.f405578b);
            sb2.append(", description=");
            return C22026a.c(sb2, this.f405579c, ')');
        }
    }

    /* compiled from: AutoprolongState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjL0/c$d;", "", "_avito_vas-autoprolong_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jL0.c$d */
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f405580a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f405581b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f405582c;

        public d(@k String str, @k String str2, boolean z12) {
            this.f405580a = str;
            this.f405581b = str2;
            this.f405582c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f405580a, dVar.f405580a) && L.f(this.f405581b, dVar.f405581b) && this.f405582c == dVar.f405582c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f405582c) + H.d(this.f405580a.hashCode() * 31, 31, this.f405581b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ToggleSection(title=");
            sb2.append(this.f405580a);
            sb2.append(", description=");
            sb2.append(this.f405581b);
            sb2.append(", isAutoprolongEnabled=");
            return r.x(sb2, this.f405582c, ')');
        }
    }

    public C42282c(@l ApiError apiError, boolean z12, boolean z13, @l C40846a c40846a, @l j jVar, @k String str, @l C11561c c11561c, @l d dVar, @l a aVar, @l String str2) {
        this.f405565b = apiError;
        this.f405566c = z12;
        this.f405567d = z13;
        this.f405568e = c40846a;
        this.f405569f = jVar;
        this.f405570g = str;
        this.f405571h = c11561c;
        this.f405572i = dVar;
        this.f405573j = aVar;
        this.f405574k = str2;
    }

    public static C42282c a(C42282c c42282c, ApiError apiError, boolean z12, boolean z13, C40846a c40846a, j jVar, String str, C11561c c11561c, d dVar, a aVar, String str2, int i12) {
        ApiError apiError2 = (i12 & 1) != 0 ? c42282c.f405565b : apiError;
        boolean z14 = (i12 & 2) != 0 ? c42282c.f405566c : z12;
        boolean z15 = (i12 & 4) != 0 ? c42282c.f405567d : z13;
        C40846a c40846a2 = (i12 & 8) != 0 ? c42282c.f405568e : c40846a;
        j jVar2 = (i12 & 16) != 0 ? c42282c.f405569f : jVar;
        String str3 = (i12 & 32) != 0 ? c42282c.f405570g : str;
        C11561c c11561c2 = (i12 & 64) != 0 ? c42282c.f405571h : c11561c;
        d dVar2 = (i12 & 128) != 0 ? c42282c.f405572i : dVar;
        a aVar2 = (i12 & 256) != 0 ? c42282c.f405573j : aVar;
        String str4 = (i12 & 512) != 0 ? c42282c.f405574k : str2;
        c42282c.getClass();
        return new C42282c(apiError2, z14, z15, c40846a2, jVar2, str3, c11561c2, dVar2, aVar2, str4);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42282c)) {
            return false;
        }
        C42282c c42282c = (C42282c) obj;
        return L.f(this.f405565b, c42282c.f405565b) && this.f405566c == c42282c.f405566c && this.f405567d == c42282c.f405567d && L.f(this.f405568e, c42282c.f405568e) && L.f(this.f405569f, c42282c.f405569f) && L.f(this.f405570g, c42282c.f405570g) && L.f(this.f405571h, c42282c.f405571h) && L.f(this.f405572i, c42282c.f405572i) && L.f(this.f405573j, c42282c.f405573j) && L.f(this.f405574k, c42282c.f405574k);
    }

    public final int hashCode() {
        ApiError apiError = this.f405565b;
        int i12 = r.i(r.i((apiError == null ? 0 : apiError.hashCode()) * 31, 31, this.f405566c), 31, this.f405567d);
        C40846a c40846a = this.f405568e;
        int iHashCode = (i12 + (c40846a == null ? 0 : c40846a.hashCode())) * 31;
        j jVar = this.f405569f;
        int iD2 = H.d((iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31, 31, this.f405570g);
        C11561c c11561c = this.f405571h;
        int iHashCode2 = (iD2 + (c11561c == null ? 0 : c11561c.hashCode())) * 31;
        d dVar = this.f405572i;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        a aVar = this.f405573j;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.f405574k;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoprolongState(error=");
        sb2.append(this.f405565b);
        sb2.append(", isMainLoading=");
        sb2.append(this.f405566c);
        sb2.append(", isPostLoading=");
        sb2.append(this.f405567d);
        sb2.append(", result=");
        sb2.append(this.f405568e);
        sb2.append(", navBar=");
        sb2.append(this.f405569f);
        sb2.append(", title=");
        sb2.append(this.f405570g);
        sb2.append(", serviceSection=");
        sb2.append(this.f405571h);
        sb2.append(", toggleSection=");
        sb2.append(this.f405572i);
        sb2.append(", button=");
        sb2.append(this.f405573j);
        sb2.append(", planningInfo=");
        return C22026a.c(sb2, this.f405574k, ')');
    }
}
