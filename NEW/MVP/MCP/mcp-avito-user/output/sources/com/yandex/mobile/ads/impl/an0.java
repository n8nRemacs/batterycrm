package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public final class an0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final d01 f383600a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final hx f383601b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private View f383602c;

    public class a implements hv0 {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.hv0
        public final void a() {
            if (an0.this.f383602c != null) {
                an0.this.f383602c.setVisibility(8);
            }
        }

        public /* synthetic */ a(an0 an0Var, int i12) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.hv0
        public final void a(long j12, long j13) {
            if (an0.this.f383602c != null) {
                an0.this.f383600a.a(an0.this.f383602c, j12, j13);
            }
        }
    }

    public an0(@j.N n91 n91Var, @j.N om0 om0Var, @j.N f91 f91Var) {
        this.f383601b = e01.a(new a(this, 0), om0Var, f91Var);
        this.f383600a = new d01(n91Var);
    }

    public final void c() {
        hx hxVar = this.f383601b;
        if (hxVar != null) {
            hxVar.resume();
        }
    }

    public final void a(@j.P View view) {
        this.f383602c = view;
        hx hxVar = this.f383601b;
        if (hxVar != null) {
            hxVar.start();
        }
    }

    public final void b() {
        hx hxVar = this.f383601b;
        if (hxVar != null) {
            hxVar.pause();
        }
    }

    public final void a() {
        this.f383602c = null;
        hx hxVar = this.f383601b;
        if (hxVar != null) {
            hxVar.invalidate();
        }
    }
}
