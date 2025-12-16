package com.google.common.hash;

import aZ0.InterfaceC19845a;
import java.nio.charset.Charset;

/* compiled from: Hasher.java */
@InterfaceC37497l
@XY0.a
/* loaded from: classes6.dex */
public interface s extends J {
    @Override // com.google.common.hash.J
    @InterfaceC19845a
    s a(int i12);

    @Override // com.google.common.hash.J
    @InterfaceC19845a
    s b(long j12);

    @Override // com.google.common.hash.J
    @InterfaceC19845a
    s c(byte[] bArr);

    @Override // com.google.common.hash.J
    @InterfaceC19845a
    s d(CharSequence charSequence, Charset charset);

    q e();

    @InterfaceC19845a
    s f(byte b12);

    @InterfaceC19845a
    <T> s g(@I T t12, o<? super T> oVar);
}
