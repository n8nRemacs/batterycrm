package com.google.common.hash;

import aZ0.InterfaceC19845a;
import java.nio.charset.Charset;

/* compiled from: AbstractHasher.java */
@InterfaceC37497l
/* renamed from: com.google.common.hash.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC37490e implements s {
    @Override // com.google.common.hash.s
    @InterfaceC19845a
    public final <T> s g(@I T t12, o<? super T> oVar) {
        oVar.F3(t12, this);
        return this;
    }

    @InterfaceC19845a
    public s h(int i12, byte[] bArr) {
        com.google.common.base.M.l(0, i12, bArr.length);
        for (int i13 = 0; i13 < i12; i13++) {
            f(bArr[i13]);
        }
        return this;
    }

    @InterfaceC19845a
    public void i(char c12) {
        f((byte) c12);
        f((byte) (c12 >>> '\b'));
    }

    @Override // com.google.common.hash.s, com.google.common.hash.J
    @InterfaceC19845a
    public s a(int i12) {
        f((byte) i12);
        f((byte) (i12 >>> 8));
        f((byte) (i12 >>> 16));
        f((byte) (i12 >>> 24));
        return this;
    }

    @Override // com.google.common.hash.s, com.google.common.hash.J
    @InterfaceC19845a
    public s b(long j12) {
        for (int i12 = 0; i12 < 64; i12 += 8) {
            f((byte) (j12 >>> i12));
        }
        return this;
    }

    @Override // com.google.common.hash.s, com.google.common.hash.J
    @InterfaceC19845a
    public s c(byte[] bArr) {
        return h(bArr.length, bArr);
    }

    @Override // com.google.common.hash.s, com.google.common.hash.J
    @InterfaceC19845a
    public s d(CharSequence charSequence, Charset charset) {
        return c(charSequence.toString().getBytes(charset));
    }
}
