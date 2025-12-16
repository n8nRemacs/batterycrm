package com.facebook.imagepipeline.nativecode;

import defpackage.fz4;
import defpackage.jca;
import defpackage.me7;
import defpackage.mn4;
import defpackage.tf7;
import defpackage.uf7;

@fz4
/* loaded from: classes.dex */
public class NativeJpegTranscoderFactory implements uf7 {
    public final int a;
    public final boolean b;
    public final boolean c;

    @fz4
    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.uf7
    @fz4
    public tf7 createImageTranscoder(me7 me7Var, boolean z) {
        if (me7Var != mn4.a) {
            return null;
        }
        NativeJpegTranscoder nativeJpegTranscoder = new NativeJpegTranscoder();
        nativeJpegTranscoder.a = z;
        nativeJpegTranscoder.b = this.a;
        nativeJpegTranscoder.c = this.b;
        if (this.c) {
            jca.e();
        }
        return nativeJpegTranscoder;
    }
}
