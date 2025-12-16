package com.yandex.mobile.ads.impl;

import com.avito.android.beduin.common.component.input.BeduinInputModel;

/* loaded from: classes8.dex */
public abstract class og {

    /* renamed from: a, reason: collision with root package name */
    private int f388508a;

    public void b() {
        this.f388508a = 0;
    }

    public final void c() {
        this.f388508a &= Integer.MAX_VALUE;
    }

    public final boolean d() {
        return c(268435456);
    }

    public final boolean e() {
        return c(BeduinInputModel.MIN_TEXT_VERSION);
    }

    public final boolean f() {
        return c(4);
    }

    public final boolean g() {
        return c(1);
    }

    public final void b(int i12) {
        this.f388508a = i12 | this.f388508a;
    }

    public final boolean c(int i12) {
        return (this.f388508a & i12) == i12;
    }

    public final void d(int i12) {
        this.f388508a = i12;
    }
}
