package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class t50 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f390081a;

    /* renamed from: b, reason: collision with root package name */
    private final float f390082b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f390083c;

    /* renamed from: d, reason: collision with root package name */
    private final float f390084d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f390085a;

        /* renamed from: b, reason: collision with root package name */
        private float f390086b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f390087c;

        /* renamed from: d, reason: collision with root package name */
        private float f390088d;

        @j.N
        public final a a(float f12) {
            this.f390086b = f12;
            return this;
        }

        @j.N
        public final a b(boolean z12) {
            this.f390085a = z12;
            return this;
        }

        @j.N
        public final void a(boolean z12) {
            this.f390087c = z12;
        }

        @j.N
        public final void b(float f12) {
            this.f390088d = f12;
        }

        @j.N
        public final t50 a() {
            return new t50(this, 0);
        }
    }

    public /* synthetic */ t50(a aVar, int i12) {
        this(aVar);
    }

    public final float a() {
        return this.f390082b;
    }

    public final float b() {
        return this.f390084d;
    }

    public final boolean c() {
        return this.f390083c;
    }

    public final boolean d() {
        return this.f390081a;
    }

    private t50(@j.N a aVar) {
        this.f390081a = aVar.f390085a;
        this.f390082b = aVar.f390086b;
        this.f390083c = aVar.f390087c;
        this.f390084d = aVar.f390088d;
    }
}
