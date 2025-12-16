package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.source.ads.a;

/* loaded from: classes8.dex */
public final class ft0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final h4 f385503a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final t90 f385504b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final mt0 f385505c;

    public ft0(@j.N h4 h4Var, @j.N hu0 hu0Var, @j.N hh1 hh1Var, @j.N mt0 mt0Var) {
        this.f385503a = h4Var;
        this.f385505c = mt0Var;
        this.f385504b = new t90(hu0Var, hh1Var);
    }

    private boolean a(@j.N com.google.android.exoplayer2.d0 d0Var, int i12) {
        if (i12 == 2 && !d0Var.isPlayingAd()) {
            com.google.android.exoplayer2.source.ads.a aVarA = this.f385503a.a();
            int iA2 = this.f385504b.a(aVarA);
            if (iA2 == -1) {
                return false;
            }
            a.b bVarA = aVarA.a(iA2);
            int i13 = bVarA.f346190c;
            if (i13 != -1 && i13 != 0 && bVarA.f346192e[0] != 0) {
                return false;
            }
        }
        return true;
    }

    public final void b(@j.N com.google.android.exoplayer2.d0 d0Var, int i12) {
        if (a(d0Var, i12)) {
            this.f385505c.a(d0Var.getPlayWhenReady(), i12);
        }
    }
}
