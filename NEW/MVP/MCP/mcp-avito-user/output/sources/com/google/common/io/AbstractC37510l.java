package com.google.common.io;

import java.nio.charset.Charset;

/* compiled from: ByteSink.java */
@XY0.c
@InterfaceC37521x
@XY0.d
/* renamed from: com.google.common.io.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37510l {

    /* compiled from: ByteSink.java */
    /* renamed from: com.google.common.io.l$b */
    public final class b extends AbstractC37514p {

        /* renamed from: a, reason: collision with root package name */
        public final Charset f360327a;

        public b(Charset charset, a aVar) {
            charset.getClass();
            this.f360327a = charset;
        }

        public final String toString() {
            return AbstractC37510l.this.toString() + ".asCharSink(" + this.f360327a + ")";
        }
    }
}
