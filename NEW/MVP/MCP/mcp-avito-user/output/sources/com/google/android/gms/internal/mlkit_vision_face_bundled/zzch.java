package com.google.android.gms.internal.mlkit_vision_face_bundled;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.g;
import j.N;
import j.P;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzch implements g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f353541a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f353542b = false;

    /* renamed from: c, reason: collision with root package name */
    public c f353543c;

    /* renamed from: d, reason: collision with root package name */
    public final zzcd f353544d;

    public zzch(zzcd zzcdVar) {
        this.f353544d = zzcdVar;
    }

    public final void a() {
        if (this.f353541a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f353541a = true;
    }

    @N
    public final g add(double d12) {
        a();
        this.f353544d.a(this.f353543c, d12, this.f353542b);
        return this;
    }

    @N
    public final g add(float f12) {
        a();
        this.f353544d.b(this.f353543c, f12, this.f353542b);
        return this;
    }

    @N
    public final g add(int i12) {
        a();
        this.f353544d.d(this.f353543c, i12, this.f353542b);
        return this;
    }

    @N
    public final g add(long j12) {
        a();
        this.f353544d.e(this.f353543c, j12, this.f353542b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    public final g add(@P String str) {
        a();
        this.f353544d.c(this.f353543c, str, this.f353542b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    public final g add(boolean z12) {
        a();
        this.f353544d.d(this.f353543c, z12 ? 1 : 0, this.f353542b);
        return this;
    }

    @N
    public final g add(@N byte[] bArr) {
        a();
        this.f353544d.c(this.f353543c, bArr, this.f353542b);
        return this;
    }
}
