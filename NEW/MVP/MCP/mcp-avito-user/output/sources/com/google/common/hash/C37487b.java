package com.google.common.hash;

import java.nio.charset.Charset;

/* compiled from: AbstractCompositeHashFunction.java */
/* renamed from: com.google.common.hash.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37487b implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s[] f360243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC37488c f360244b;

    public C37487b(AbstractC37488c abstractC37488c, s[] sVarArr) {
        this.f360244b = abstractC37488c;
        this.f360243a = sVarArr;
    }

    @Override // com.google.common.hash.s, com.google.common.hash.J
    public final /* bridge */ /* synthetic */ J a(int i12) {
        a(i12);
        return this;
    }

    @Override // com.google.common.hash.s, com.google.common.hash.J
    public final /* bridge */ /* synthetic */ J b(long j12) {
        b(j12);
        return this;
    }

    @Override // com.google.common.hash.s, com.google.common.hash.J
    public final /* bridge */ /* synthetic */ J c(byte[] bArr) {
        c(bArr);
        return this;
    }

    @Override // com.google.common.hash.s, com.google.common.hash.J
    public final /* bridge */ /* synthetic */ J d(CharSequence charSequence, Charset charset) {
        d(charSequence, charset);
        return this;
    }

    @Override // com.google.common.hash.s
    public final q e() {
        return this.f360244b.c(this.f360243a);
    }

    @Override // com.google.common.hash.s
    public final s f(byte b12) {
        throw null;
    }

    @Override // com.google.common.hash.s
    public final <T> s g(@I T t12, o<? super T> oVar) {
        for (s sVar : this.f360243a) {
            sVar.g(t12, oVar);
        }
        return this;
    }

    @Override // com.google.common.hash.s, com.google.common.hash.J
    public final s a(int i12) {
        for (s sVar : this.f360243a) {
            sVar.a(i12);
        }
        return this;
    }

    @Override // com.google.common.hash.s, com.google.common.hash.J
    public final s b(long j12) {
        for (s sVar : this.f360243a) {
            sVar.b(j12);
        }
        return this;
    }

    @Override // com.google.common.hash.s, com.google.common.hash.J
    public final s c(byte[] bArr) {
        for (s sVar : this.f360243a) {
            sVar.c(bArr);
        }
        return this;
    }

    @Override // com.google.common.hash.s, com.google.common.hash.J
    public final s d(CharSequence charSequence, Charset charset) {
        for (s sVar : this.f360243a) {
            sVar.d(charSequence, charset);
        }
        return this;
    }
}
