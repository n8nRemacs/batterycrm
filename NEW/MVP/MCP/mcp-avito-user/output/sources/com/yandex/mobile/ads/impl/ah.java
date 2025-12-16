package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class ah {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f383553n = 0;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f383554a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f383555b;

    /* renamed from: c, reason: collision with root package name */
    private final int f383556c;

    /* renamed from: d, reason: collision with root package name */
    private final int f383557d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f383558e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f383559f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f383560g;

    /* renamed from: h, reason: collision with root package name */
    private final int f383561h;

    /* renamed from: i, reason: collision with root package name */
    private final int f383562i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f383563j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f383564k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f383565l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    private String f383566m;

    public static final class a {
        @Y61.k
        public final a a() {
            return this;
        }

        @Y61.k
        public final a a(@Y61.k TimeUnit timeUnit) {
            timeUnit.toSeconds(Integer.MAX_VALUE);
            return this;
        }

        @Y61.k
        public final a b() {
            return this;
        }
    }

    public static final class b {
        /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
        @X41.n
        @Y61.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.yandex.mobile.ads.impl.ah a(@Y61.k com.yandex.mobile.ads.impl.gz r25) throws java.lang.NumberFormatException {
            /*
                Method dump skipped, instructions count: 445
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ah.b.a(com.yandex.mobile.ads.impl.gz):com.yandex.mobile.ads.impl.ah");
        }
    }

    static {
        new a().a();
        new a().b().a(TimeUnit.SECONDS);
    }

    public /* synthetic */ ah(boolean z12, boolean z13, int i12, int i13, boolean z14, boolean z15, boolean z16, int i14, int i15, boolean z17, boolean z18, boolean z19, String str, int i16) {
        this(z12, z13, i12, i13, z14, z15, z16, i14, i15, z17, z18, z19, str);
    }

    public final boolean a() {
        return this.f383558e;
    }

    public final boolean b() {
        return this.f383559f;
    }

    @X41.i
    public final int c() {
        return this.f383556c;
    }

    @X41.i
    public final int d() {
        return this.f383561h;
    }

    @X41.i
    public final int e() {
        return this.f383562i;
    }

    @X41.i
    public final boolean f() {
        return this.f383560g;
    }

    @X41.i
    public final boolean g() {
        return this.f383554a;
    }

    @X41.i
    public final boolean h() {
        return this.f383555b;
    }

    @X41.i
    public final boolean i() {
        return this.f383563j;
    }

    @Y61.k
    public final String toString() {
        String str = this.f383566m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f383554a) {
            sb2.append("no-cache, ");
        }
        if (this.f383555b) {
            sb2.append("no-store, ");
        }
        if (this.f383556c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f383556c);
            sb2.append(", ");
        }
        if (this.f383557d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f383557d);
            sb2.append(", ");
        }
        if (this.f383558e) {
            sb2.append("private, ");
        }
        if (this.f383559f) {
            sb2.append("public, ");
        }
        if (this.f383560g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f383561h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f383561h);
            sb2.append(", ");
        }
        if (this.f383562i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f383562i);
            sb2.append(", ");
        }
        if (this.f383563j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f383564k) {
            sb2.append("no-transform, ");
        }
        if (this.f383565l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        this.f383566m = string;
        return string;
    }

    private ah(boolean z12, boolean z13, int i12, int i13, boolean z14, boolean z15, boolean z16, int i14, int i15, boolean z17, boolean z18, boolean z19, String str) {
        this.f383554a = z12;
        this.f383555b = z13;
        this.f383556c = i12;
        this.f383557d = i13;
        this.f383558e = z14;
        this.f383559f = z15;
        this.f383560g = z16;
        this.f383561h = i14;
        this.f383562i = i15;
        this.f383563j = z17;
        this.f383564k = z18;
        this.f383565l = z19;
        this.f383566m = str;
    }
}
