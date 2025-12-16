package com.google.android.gms.internal.mlkit_vision_common;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.g;
import j.N;
import j.P;

/* compiled from: com.google.mlkit:vision-common@@17.2.0 */
/* loaded from: classes6.dex */
final class zzao implements g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f352601a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f352602b = false;

    /* renamed from: c, reason: collision with root package name */
    public c f352603c;

    /* renamed from: d, reason: collision with root package name */
    public final zzak f352604d;

    public zzao(zzak zzakVar) {
        this.f352604d = zzakVar;
    }

    public final void a() {
        if (this.f352601a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f352601a = true;
    }

    @N
    public final g add(double d12) {
        a();
        this.f352604d.a(this.f352603c, d12, this.f352602b);
        return this;
    }

    @N
    public final g add(float f12) {
        a();
        this.f352604d.b(this.f352603c, f12, this.f352602b);
        return this;
    }

    @N
    public final g add(int i12) {
        a();
        this.f352604d.d(this.f352603c, i12, this.f352602b);
        return this;
    }

    @N
    public final g add(long j12) {
        a();
        this.f352604d.e(this.f352603c, j12, this.f352602b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    public final g add(@P String str) {
        a();
        this.f352604d.c(this.f352603c, str, this.f352602b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    public final g add(boolean z12) {
        a();
        this.f352604d.d(this.f352603c, z12 ? 1 : 0, this.f352602b);
        return this;
    }

    @N
    public final g add(@N byte[] bArr) {
        a();
        this.f352604d.c(this.f352603c, bArr, this.f352602b);
        return this;
    }
}
