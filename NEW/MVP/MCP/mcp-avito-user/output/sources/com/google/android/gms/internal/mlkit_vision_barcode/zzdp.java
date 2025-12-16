package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.g;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
final class zzdp implements g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f351861a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f351862b = false;

    /* renamed from: c, reason: collision with root package name */
    public c f351863c;

    /* renamed from: d, reason: collision with root package name */
    public final zzdl f351864d;

    public zzdp(zzdl zzdlVar) {
        this.f351864d = zzdlVar;
    }

    public final void a() {
        if (this.f351861a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f351861a = true;
    }

    @N
    public final g add(double d12) {
        a();
        this.f351864d.a(this.f351863c, d12, this.f351862b);
        return this;
    }

    @N
    public final g add(float f12) {
        a();
        this.f351864d.b(this.f351863c, f12, this.f351862b);
        return this;
    }

    @N
    public final g add(int i12) {
        a();
        this.f351864d.d(this.f351863c, i12, this.f351862b);
        return this;
    }

    @N
    public final g add(long j12) {
        a();
        this.f351864d.e(this.f351863c, j12, this.f351862b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    public final g add(@P String str) {
        a();
        this.f351864d.c(this.f351863c, str, this.f351862b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    public final g add(boolean z12) {
        a();
        this.f351864d.d(this.f351863c, z12 ? 1 : 0, this.f351862b);
        return this;
    }

    @N
    public final g add(@N byte[] bArr) {
        a();
        this.f351864d.c(this.f351863c, bArr, this.f351862b);
        return this;
    }
}
