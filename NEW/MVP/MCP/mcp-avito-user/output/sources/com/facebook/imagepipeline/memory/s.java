package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.Nullsafe;
import j.k0;
import java.util.LinkedList;

/* compiled from: FlexByteArrayPool.java */
@J41.d
@Nullsafe
/* loaded from: classes13.dex */
public class s {

    /* compiled from: FlexByteArrayPool.java */
    @k0
    public static class a extends t {
        @Override // com.facebook.imagepipeline.memory.BasePool
        public final C36390h<byte[]> p(int i12) {
            C c12 = new C(i12, this.f340415c.f340446d, 0);
            c12.f340424e = new LinkedList<>();
            return c12;
        }
    }
}
