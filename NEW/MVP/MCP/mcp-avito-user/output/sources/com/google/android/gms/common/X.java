package com.google.android.gms.common;

import com.google.android.gms.internal.common.zzag;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
final class X {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public String f348890a = null;

    /* renamed from: b, reason: collision with root package name */
    public long f348891b = -1;

    /* renamed from: c, reason: collision with root package name */
    public zzag f348892c = zzag.zzl();

    /* renamed from: d, reason: collision with root package name */
    public zzag f348893d = zzag.zzl();

    public final void a() {
        if (this.f348890a == null) {
            throw new IllegalStateException("packageName must be defined");
        }
        if (this.f348891b < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (this.f348892c.isEmpty() && this.f348893d.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        new y(this.f348890a, this.f348891b, this.f348892c, this.f348893d, null);
    }
}
