package com.yandex.mobile.ads.impl;

import java.io.IOException;
import okio.C44802l;

/* loaded from: classes8.dex */
public final class y00 extends k81 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ u00 f391870e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f391871f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C44802l f391872g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f391873h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y00(String str, u00 u00Var, int i12, C44802l c44802l, int i13, boolean z12) {
        super(str, true);
        this.f391870e = u00Var;
        this.f391871f = i12;
        this.f391872g = c44802l;
        this.f391873h = i13;
    }

    @Override // com.yandex.mobile.ads.impl.k81
    public final long e() {
        try {
            iw0 iw0Var = this.f391870e.f390364l;
            hw0 hw0Var = (hw0) iw0Var;
            hw0Var.a(this.f391873h, this.f391872g);
            this.f391870e.k().a(this.f391871f, xs.f391804g);
            synchronized (this.f391870e) {
                this.f391870e.f390352B.remove(Integer.valueOf(this.f391871f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
