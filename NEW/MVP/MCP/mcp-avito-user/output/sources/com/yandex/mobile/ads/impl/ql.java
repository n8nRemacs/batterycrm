package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes8.dex */
public final class ql<V extends ViewGroup> implements up<V> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final AdResponse<?> f389210a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final om0 f389211b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C39362s0 f389212c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final k2 f389213d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final f91 f389214e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final rl f389215f = new rl();

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private hx f389216g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private InterfaceC39365t0 f389217h;

    public class a implements InterfaceC39365t0 {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39365t0
        public final void a() {
            if (ql.this.f389216g != null) {
                ql.this.f389216g.resume();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC39365t0
        public final void b() {
            if (ql.this.f389216g != null) {
                ql.this.f389216g.pause();
            }
        }

        public /* synthetic */ a(ql qlVar, int i12) {
            this();
        }
    }

    public ql(@j.N AdResponse<?> adResponse, @j.N C39362s0 c39362s0, @j.N k2 k2Var, @j.N om0 om0Var, @j.N f91 f91Var) {
        this.f389210a = adResponse;
        this.f389211b = om0Var;
        this.f389212c = c39362s0;
        this.f389213d = k2Var;
        this.f389214e = f91Var;
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void c() {
        InterfaceC39365t0 interfaceC39365t0 = this.f389217h;
        if (interfaceC39365t0 != null) {
            this.f389212c.b(interfaceC39365t0);
        }
        hx hxVar = this.f389216g;
        if (hxVar != null) {
            hxVar.invalidate();
        }
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void a(@j.N V v12) {
        a aVar = new a(this, 0);
        this.f389217h = aVar;
        this.f389212c.a(aVar);
        rl rlVar = this.f389215f;
        AdResponse<?> adResponse = this.f389210a;
        k2 k2Var = this.f389213d;
        om0 om0Var = this.f389211b;
        f91 f91Var = this.f389214e;
        rlVar.getClass();
        hx hxVarA = rl.a(adResponse, k2Var, om0Var, f91Var);
        this.f389216g = hxVarA;
        hxVarA.start();
    }
}
