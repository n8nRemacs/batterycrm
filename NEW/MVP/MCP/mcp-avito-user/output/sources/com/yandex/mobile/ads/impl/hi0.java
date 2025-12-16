package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import com.yandex.mobile.ads.impl.nb0;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public final class hi0 extends nr0 {

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private final wh0 f386139k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    private final li0 f386140l;

    /* renamed from: m, reason: collision with root package name */
    @j.N
    private nb0 f386141m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    private a f386142n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f386143o;

    public interface a {
        void a();

        void b();
    }

    public hi0(@j.N Context context) {
        super(context);
        this.f386143o = false;
        this.f386141m = new a41();
        wh0 wh0Var = new wh0();
        this.f386139k = wh0Var;
        this.f386140l = new li0(this, wh0Var);
    }

    @Override // com.yandex.mobile.ads.impl.nr0, com.yandex.mobile.ads.impl.o00
    public final void a() {
        super.a();
        a aVar = this.f386142n;
        if (aVar != null) {
            this.f386143o = true;
            aVar.b();
            this.f386142n = null;
        }
    }

    public final void b(@j.N String str) {
        if (this.f386143o) {
            return;
        }
        this.f386140l.b(str);
    }

    @Override // com.yandex.mobile.ads.impl.nr0
    public final void h() {
        this.f386140l.a();
    }

    @j.N
    public final wh0 i() {
        return this.f386139k;
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        nb0.a aVarA = this.f386141m.a(i12, i13);
        super.onMeasure(aVarA.f388198a, aVarA.f388199b);
    }

    public void setAspectRatio(float f12) {
        this.f386141m = new rv0(f12);
    }

    public void setClickListener(@j.N aj ajVar) {
        this.f386140l.a(ajVar);
    }

    public void setPreloadListener(@j.N a aVar) {
        this.f386142n = aVar;
    }

    @Override // com.yandex.mobile.ads.impl.nr0, com.yandex.mobile.ads.impl.o00
    public final void a(int i12) {
        super.a(i12);
        if (this.f386142n != null) {
            stopLoading();
            this.f386142n.a();
            this.f386142n = null;
        }
    }
}
