package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.EncodingException;
import j.N;
import j.P;
import java.io.IOException;

/* compiled from: ProtobufValueEncoderContext.java */
/* loaded from: classes6.dex */
class g implements com.google.firebase.encoders.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f361588a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f361589b = false;

    /* renamed from: c, reason: collision with root package name */
    public com.google.firebase.encoders.c f361590c;

    /* renamed from: d, reason: collision with root package name */
    public final e f361591d;

    public g(e eVar) {
        this.f361591d = eVar;
    }

    @Override // com.google.firebase.encoders.g
    @N
    public final com.google.firebase.encoders.g add(@P String str) throws IOException {
        if (this.f361588a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f361588a = true;
        this.f361591d.c(this.f361590c, str, this.f361589b);
        return this;
    }

    @Override // com.google.firebase.encoders.g
    @N
    public final com.google.firebase.encoders.g add(boolean z12) throws IOException {
        if (!this.f361588a) {
            this.f361588a = true;
            this.f361591d.a(this.f361590c, z12 ? 1 : 0, this.f361589b);
            return this;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }
}
