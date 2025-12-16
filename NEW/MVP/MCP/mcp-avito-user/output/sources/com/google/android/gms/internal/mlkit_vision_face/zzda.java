package com.google.android.gms.internal.mlkit_vision_face;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.g;
import j.N;
import j.P;

/* compiled from: com.google.android.gms:play-services-mlkit-face-detection@@17.1.0 */
/* loaded from: classes6.dex */
final class zzda implements g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f353047a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f353048b = false;

    /* renamed from: c, reason: collision with root package name */
    public c f353049c;

    /* renamed from: d, reason: collision with root package name */
    public final zzcw f353050d;

    public zzda(zzcw zzcwVar) {
        this.f353050d = zzcwVar;
    }

    public final void a() {
        if (this.f353047a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f353047a = true;
    }

    @N
    public final g add(double d12) {
        a();
        this.f353050d.a(this.f353049c, d12, this.f353048b);
        return this;
    }

    @N
    public final g add(float f12) {
        a();
        this.f353050d.b(this.f353049c, f12, this.f353048b);
        return this;
    }

    @N
    public final g add(int i12) {
        a();
        this.f353050d.d(this.f353049c, i12, this.f353048b);
        return this;
    }

    @N
    public final g add(long j12) {
        a();
        this.f353050d.e(this.f353049c, j12, this.f353048b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    public final g add(@P String str) {
        a();
        this.f353050d.c(this.f353049c, str, this.f353048b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    public final g add(boolean z12) {
        a();
        this.f353050d.d(this.f353049c, z12 ? 1 : 0, this.f353048b);
        return this;
    }

    @N
    public final g add(@N byte[] bArr) {
        a();
        this.f353050d.c(this.f353049c, bArr, this.f353048b);
        return this;
    }
}
