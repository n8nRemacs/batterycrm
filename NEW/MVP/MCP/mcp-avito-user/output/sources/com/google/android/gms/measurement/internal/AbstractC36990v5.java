package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.v5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC36990v5 extends C36969s5 {

    /* renamed from: c, reason: collision with root package name */
    public boolean f355411c;

    public AbstractC36990v5(C36997w5 c36997w5) {
        super(c36997w5);
        this.f355380b.f355455r++;
    }

    public final void i() {
        if (!this.f355411c) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (this.f355411c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        k();
        this.f355380b.f355456s++;
        this.f355411c = true;
    }

    public abstract boolean k();
}
