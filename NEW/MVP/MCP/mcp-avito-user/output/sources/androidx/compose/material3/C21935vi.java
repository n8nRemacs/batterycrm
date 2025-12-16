package androidx.compose.material3;

import androidx.compose.animation.core.C20310q;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextFieldDefaults.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bß\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002¢\u0006\u0004\b/\u00100¨\u00063²\u0006\f\u00102\u001a\u0002018\nX\u008a\u0084\u0002²\u0006\f\u00102\u001a\u0002018\nX\u008a\u0084\u0002²\u0006\f\u00102\u001a\u0002018\nX\u008a\u0084\u0002²\u0006\f\u00102\u001a\u0002018\nX\u008a\u0084\u0002²\u0006\f\u00102\u001a\u0002018\nX\u008a\u0084\u0002²\u0006\f\u00102\u001a\u0002018\nX\u008a\u0084\u0002²\u0006\f\u00102\u001a\u0002018\nX\u008a\u0084\u0002²\u0006\f\u00102\u001a\u0002018\nX\u008a\u0084\u0002²\u0006\f\u00102\u001a\u0002018\nX\u008a\u0084\u0002²\u0006\f\u00102\u001a\u0002018\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/vi;", "", "Landroidx/compose/ui/graphics/T;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/D1;", "textSelectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "<init>", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/D1;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "", "focused", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.vi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21935vi {

    /* renamed from: A, reason: collision with root package name */
    public final long f37584A;

    /* renamed from: B, reason: collision with root package name */
    public final long f37585B;

    /* renamed from: C, reason: collision with root package name */
    public final long f37586C;

    /* renamed from: D, reason: collision with root package name */
    public final long f37587D;

    /* renamed from: E, reason: collision with root package name */
    public final long f37588E;

    /* renamed from: F, reason: collision with root package name */
    public final long f37589F;

    /* renamed from: G, reason: collision with root package name */
    public final long f37590G;

    /* renamed from: H, reason: collision with root package name */
    public final long f37591H;

    /* renamed from: I, reason: collision with root package name */
    public final long f37592I;

    /* renamed from: J, reason: collision with root package name */
    public final long f37593J;

    /* renamed from: K, reason: collision with root package name */
    public final long f37594K;

    /* renamed from: L, reason: collision with root package name */
    public final long f37595L;

    /* renamed from: M, reason: collision with root package name */
    public final long f37596M;

    /* renamed from: N, reason: collision with root package name */
    public final long f37597N;

    /* renamed from: O, reason: collision with root package name */
    public final long f37598O;

    /* renamed from: P, reason: collision with root package name */
    public final long f37599P;

    /* renamed from: Q, reason: collision with root package name */
    public final long f37600Q;

    /* renamed from: a, reason: collision with root package name */
    public final long f37601a;

    /* renamed from: b, reason: collision with root package name */
    public final long f37602b;

    /* renamed from: c, reason: collision with root package name */
    public final long f37603c;

    /* renamed from: d, reason: collision with root package name */
    public final long f37604d;

    /* renamed from: e, reason: collision with root package name */
    public final long f37605e;

    /* renamed from: f, reason: collision with root package name */
    public final long f37606f;

    /* renamed from: g, reason: collision with root package name */
    public final long f37607g;

    /* renamed from: h, reason: collision with root package name */
    public final long f37608h;

    /* renamed from: i, reason: collision with root package name */
    public final long f37609i;

    /* renamed from: j, reason: collision with root package name */
    public final long f37610j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.text.selection.D1 f37611k;

    /* renamed from: l, reason: collision with root package name */
    public final long f37612l;

    /* renamed from: m, reason: collision with root package name */
    public final long f37613m;

    /* renamed from: n, reason: collision with root package name */
    public final long f37614n;

    /* renamed from: o, reason: collision with root package name */
    public final long f37615o;

    /* renamed from: p, reason: collision with root package name */
    public final long f37616p;

    /* renamed from: q, reason: collision with root package name */
    public final long f37617q;

    /* renamed from: r, reason: collision with root package name */
    public final long f37618r;

    /* renamed from: s, reason: collision with root package name */
    public final long f37619s;

    /* renamed from: t, reason: collision with root package name */
    public final long f37620t;

    /* renamed from: u, reason: collision with root package name */
    public final long f37621u;

    /* renamed from: v, reason: collision with root package name */
    public final long f37622v;

    /* renamed from: w, reason: collision with root package name */
    public final long f37623w;

    /* renamed from: x, reason: collision with root package name */
    public final long f37624x;

    /* renamed from: y, reason: collision with root package name */
    public final long f37625y;

    /* renamed from: z, reason: collision with root package name */
    public final long f37626z;

    /* compiled from: TextFieldDefaults.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/D1;", "invoke", "()Landroidx/compose/foundation/text/selection/D1;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.vi$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<androidx.compose.foundation.text.selection.D1> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final androidx.compose.foundation.text.selection.D1 invoke() {
            return C21935vi.this.f37611k;
        }
    }

    public C21935vi(long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j22, long j23, androidx.compose.foundation.text.selection.D1 d12, long j24, long j25, long j26, long j27, long j28, long j29, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j62, long j63, C42822w c42822w) {
        this.f37601a = j12;
        this.f37602b = j13;
        this.f37603c = j14;
        this.f37604d = j15;
        this.f37605e = j16;
        this.f37606f = j17;
        this.f37607g = j18;
        this.f37608h = j19;
        this.f37609i = j22;
        this.f37610j = j23;
        this.f37611k = d12;
        this.f37612l = j24;
        this.f37613m = j25;
        this.f37614n = j26;
        this.f37615o = j27;
        this.f37616p = j28;
        this.f37617q = j29;
        this.f37618r = j32;
        this.f37619s = j33;
        this.f37620t = j34;
        this.f37621u = j35;
        this.f37622v = j36;
        this.f37623w = j37;
        this.f37624x = j38;
        this.f37625y = j39;
        this.f37626z = j42;
        this.f37584A = j43;
        this.f37585B = j44;
        this.f37586C = j45;
        this.f37587D = j46;
        this.f37588E = j47;
        this.f37589F = j48;
        this.f37590G = j49;
        this.f37591H = j52;
        this.f37592I = j53;
        this.f37593J = j54;
        this.f37594K = j55;
        this.f37595L = j56;
        this.f37596M = j57;
        this.f37597N = j58;
        this.f37598O = j59;
        this.f37599P = j62;
        this.f37600Q = j63;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @Y61.k
    public final androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> a(boolean z12, boolean z13, @Y61.k androidx.compose.foundation.interaction.k kVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        a12.I(-1921164569);
        androidx.compose.runtime.I3<androidx.compose.ui.graphics.T> i3B = androidx.compose.animation.l2.b(!z12 ? this.f37607g : z13 ? this.f37608h : ((Boolean) androidx.compose.foundation.interaction.f.a(kVar, a12, (i12 >> 6) & 14).getF42167b()).booleanValue() ? this.f37605e : this.f37606f, C20310q.e(150, 0, null, 6), a12, 48, 12);
        a12.O();
        return i3B;
    }

    @Y61.k
    public final C21935vi b(long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j22, long j23, @Y61.l androidx.compose.foundation.text.selection.D1 d12, long j24, long j25, long j26, long j27, long j28, long j29, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j62, long j63) {
        androidx.compose.ui.graphics.T.f39320b.getClass();
        long j64 = androidx.compose.ui.graphics.T.f39330l;
        long j65 = j12 != j64 ? j12 : this.f37601a;
        long j66 = j13 != j64 ? j13 : this.f37602b;
        long j67 = j14 != j64 ? j14 : this.f37603c;
        long j68 = j15 != j64 ? j15 : this.f37604d;
        long j69 = j16 != j64 ? j16 : this.f37605e;
        long j72 = j17 != j64 ? j17 : this.f37606f;
        long j73 = j18 != j64 ? j18 : this.f37607g;
        long j74 = j19 != j64 ? j19 : this.f37608h;
        long j75 = j22 != j64 ? j22 : this.f37609i;
        long j76 = j23 != j64 ? j23 : this.f37610j;
        new a();
        return new C21935vi(j65, j66, j67, j68, j69, j72, j73, j74, j75, j76, d12 == null ? this.f37611k : d12, j24 != j64 ? j24 : this.f37612l, j25 != j64 ? j25 : this.f37613m, j26 != j64 ? j26 : this.f37614n, j27 != j64 ? j27 : this.f37615o, j28 != j64 ? j28 : this.f37616p, j29 != j64 ? j29 : this.f37617q, j32 != j64 ? j32 : this.f37618r, j33 != j64 ? j33 : this.f37619s, j34 != j64 ? j34 : this.f37620t, j35 != j64 ? j35 : this.f37621u, j36 != j64 ? j36 : this.f37622v, j37 != j64 ? j37 : this.f37623w, j38 != j64 ? j38 : this.f37624x, j39 != j64 ? j39 : this.f37625y, j42 != j64 ? j42 : this.f37626z, j43 != j64 ? j43 : this.f37584A, j44 != j64 ? j44 : this.f37585B, j45 != j64 ? j45 : this.f37586C, j46 != j64 ? j46 : this.f37587D, j47 != j64 ? j47 : this.f37588E, j48 != j64 ? j48 : this.f37589F, j49 != j64 ? j49 : this.f37590G, j52 != j64 ? j52 : this.f37591H, j53 != j64 ? j53 : this.f37592I, j54 != j64 ? j54 : this.f37593J, j55 != j64 ? j55 : this.f37594K, j56 != j64 ? j56 : this.f37595L, j57 != j64 ? j57 : this.f37596M, j58 != j64 ? j58 : this.f37597N, j59 != j64 ? j59 : this.f37598O, j62 != j64 ? j62 : this.f37599P, j63 != j64 ? j63 : this.f37600Q, null);
    }

    @InterfaceC22132o
    @Y61.k
    public final InterfaceC22204y1 c(boolean z12, @Y61.l androidx.compose.runtime.A a12) {
        a12.I(-1885422187);
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(androidx.compose.ui.graphics.T.a(z12 ? this.f37610j : this.f37609i), a12);
        a12.O();
        return interfaceC22204y1M;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @Y61.k
    public final InterfaceC22204y1 d(boolean z12, boolean z13, @Y61.k androidx.compose.foundation.interaction.m mVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        a12.I(68412911);
        InterfaceC22204y1 interfaceC22204y1M = C22126m3.m(androidx.compose.ui.graphics.T.a(!z12 ? this.f37603c : z13 ? this.f37604d : ((Boolean) androidx.compose.foundation.interaction.f.a(mVar, a12, (i12 >> 6) & 14).getF42167b()).booleanValue() ? this.f37601a : this.f37602b), a12);
        a12.O();
        return interfaceC22204y1M;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C21935vi)) {
            return false;
        }
        C21935vi c21935vi = (C21935vi) obj;
        return androidx.compose.ui.graphics.T.d(this.f37601a, c21935vi.f37601a) && androidx.compose.ui.graphics.T.d(this.f37602b, c21935vi.f37602b) && androidx.compose.ui.graphics.T.d(this.f37603c, c21935vi.f37603c) && androidx.compose.ui.graphics.T.d(this.f37604d, c21935vi.f37604d) && androidx.compose.ui.graphics.T.d(this.f37605e, c21935vi.f37605e) && androidx.compose.ui.graphics.T.d(this.f37606f, c21935vi.f37606f) && androidx.compose.ui.graphics.T.d(this.f37607g, c21935vi.f37607g) && androidx.compose.ui.graphics.T.d(this.f37608h, c21935vi.f37608h) && androidx.compose.ui.graphics.T.d(this.f37609i, c21935vi.f37609i) && androidx.compose.ui.graphics.T.d(this.f37610j, c21935vi.f37610j) && kotlin.jvm.internal.L.f(this.f37611k, c21935vi.f37611k) && androidx.compose.ui.graphics.T.d(this.f37612l, c21935vi.f37612l) && androidx.compose.ui.graphics.T.d(this.f37613m, c21935vi.f37613m) && androidx.compose.ui.graphics.T.d(this.f37614n, c21935vi.f37614n) && androidx.compose.ui.graphics.T.d(this.f37615o, c21935vi.f37615o) && androidx.compose.ui.graphics.T.d(this.f37616p, c21935vi.f37616p) && androidx.compose.ui.graphics.T.d(this.f37617q, c21935vi.f37617q) && androidx.compose.ui.graphics.T.d(this.f37618r, c21935vi.f37618r) && androidx.compose.ui.graphics.T.d(this.f37619s, c21935vi.f37619s) && androidx.compose.ui.graphics.T.d(this.f37620t, c21935vi.f37620t) && androidx.compose.ui.graphics.T.d(this.f37621u, c21935vi.f37621u) && androidx.compose.ui.graphics.T.d(this.f37622v, c21935vi.f37622v) && androidx.compose.ui.graphics.T.d(this.f37623w, c21935vi.f37623w) && androidx.compose.ui.graphics.T.d(this.f37624x, c21935vi.f37624x) && androidx.compose.ui.graphics.T.d(this.f37625y, c21935vi.f37625y) && androidx.compose.ui.graphics.T.d(this.f37626z, c21935vi.f37626z) && androidx.compose.ui.graphics.T.d(this.f37584A, c21935vi.f37584A) && androidx.compose.ui.graphics.T.d(this.f37585B, c21935vi.f37585B) && androidx.compose.ui.graphics.T.d(this.f37586C, c21935vi.f37586C) && androidx.compose.ui.graphics.T.d(this.f37587D, c21935vi.f37587D) && androidx.compose.ui.graphics.T.d(this.f37588E, c21935vi.f37588E) && androidx.compose.ui.graphics.T.d(this.f37589F, c21935vi.f37589F) && androidx.compose.ui.graphics.T.d(this.f37590G, c21935vi.f37590G) && androidx.compose.ui.graphics.T.d(this.f37591H, c21935vi.f37591H) && androidx.compose.ui.graphics.T.d(this.f37592I, c21935vi.f37592I) && androidx.compose.ui.graphics.T.d(this.f37593J, c21935vi.f37593J) && androidx.compose.ui.graphics.T.d(this.f37594K, c21935vi.f37594K) && androidx.compose.ui.graphics.T.d(this.f37595L, c21935vi.f37595L) && androidx.compose.ui.graphics.T.d(this.f37596M, c21935vi.f37596M) && androidx.compose.ui.graphics.T.d(this.f37597N, c21935vi.f37597N) && androidx.compose.ui.graphics.T.d(this.f37598O, c21935vi.f37598O) && androidx.compose.ui.graphics.T.d(this.f37599P, c21935vi.f37599P) && androidx.compose.ui.graphics.T.d(this.f37600Q, c21935vi.f37600Q);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f37600Q) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g((Long.hashCode(this.f37625y) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g((this.f37611k.hashCode() + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f37601a) * 31, 31, this.f37602b), 31, this.f37603c), 31, this.f37604d), 31, this.f37605e), 31, this.f37606f), 31, this.f37607g), 31, this.f37608h), 31, this.f37609i), 31, this.f37610j)) * 31, 31, this.f37612l), 31, this.f37613m), 31, this.f37614n), 31, this.f37615o), 31, this.f37616p), 31, this.f37617q), 31, this.f37618r), 31, this.f37619s), 31, this.f37620t), 31, this.f37621u), 31, this.f37622v), 31, this.f37623w), 31, this.f37624x)) * 31, 31, this.f37626z), 31, this.f37584A), 31, this.f37585B), 31, this.f37586C), 31, this.f37587D), 31, this.f37588E), 31, this.f37589F), 31, this.f37590G), 31, this.f37591H), 31, this.f37592I), 31, this.f37593J), 31, this.f37594K), 31, this.f37595L), 31, this.f37596M), 31, this.f37597N), 31, this.f37598O), 31, this.f37599P);
    }
}
