package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.b1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC36847b1 extends C1 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f355035b;

    public AbstractC36847b1(I2 i22) {
        super(i22);
        this.f355183a.f354705E++;
    }

    public final void i() {
        if (!this.f355035b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (this.f355035b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (k()) {
            return;
        }
        this.f355183a.f354707G.incrementAndGet();
        this.f355035b = true;
    }

    public abstract boolean k();
}
