package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gt0;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
final class vt {

    /* renamed from: c, reason: collision with root package name */
    private static final long f391004c = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final as0 f391005a = new as0(false);

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final gt0.b f391006b;

    public class a implements bs0 {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.bs0
        /* renamed from: a */
        public final void mo126a() {
            vt.this.f391006b.b(lt.a());
        }

        public /* synthetic */ a(vt vtVar, int i12) {
            this();
        }
    }

    public vt(@j.N gt0.b bVar) {
        this.f391006b = bVar;
    }

    public final void b() {
        this.f391005a.a();
    }

    public final void a() {
        this.f391005a.a(f391004c, new a(this, 0));
    }
}
