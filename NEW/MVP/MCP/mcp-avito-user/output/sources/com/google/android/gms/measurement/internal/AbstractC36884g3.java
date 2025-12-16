package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: com.google.android.gms.measurement.internal.g3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC36884g3 extends C36891h3 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f355168b;

    public AbstractC36884g3(I2 i22) {
        super(i22);
        this.f355183a.f354705E++;
    }

    public final void f() {
        if (!this.f355168b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void g() {
        if (this.f355168b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (h()) {
            return;
        }
        this.f355183a.f354707G.incrementAndGet();
        this.f355168b = true;
    }

    public abstract boolean h();
}
