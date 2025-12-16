package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.c;
import com.google.firebase.encoders.g;
import j.N;
import j.P;

/* compiled from: com.google.mlkit:common@@18.10.0 */
/* loaded from: classes6.dex */
final class zzbt implements g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f351237a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f351238b = false;

    /* renamed from: c, reason: collision with root package name */
    public c f351239c;

    /* renamed from: d, reason: collision with root package name */
    public final zzbp f351240d;

    public zzbt(zzbp zzbpVar) {
        this.f351240d = zzbpVar;
    }

    public final void a() {
        if (this.f351237a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f351237a = true;
    }

    @N
    public final g add(double d12) {
        a();
        this.f351240d.a(this.f351239c, d12, this.f351238b);
        return this;
    }

    @N
    public final g add(float f12) {
        a();
        this.f351240d.b(this.f351239c, f12, this.f351238b);
        return this;
    }

    @N
    public final g add(int i12) {
        a();
        this.f351240d.d(this.f351239c, i12, this.f351238b);
        return this;
    }

    @N
    public final g add(long j12) {
        a();
        this.f351240d.e(this.f351239c, j12, this.f351238b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    public final g add(@P String str) {
        a();
        this.f351240d.c(this.f351239c, str, this.f351238b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    public final g add(boolean z12) {
        a();
        this.f351240d.d(this.f351239c, z12 ? 1 : 0, this.f351238b);
        return this;
    }

    @N
    public final g add(@N byte[] bArr) {
        a();
        this.f351240d.c(this.f351239c, bArr, this.f351238b);
        return this;
    }
}
