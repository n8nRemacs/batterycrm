package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;

/* loaded from: classes8.dex */
public class dc0 extends un {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final String f384579a;

    /* JADX WARN: Illegal instructions before constructor call */
    public dc0(IllegalStateException illegalStateException, @j.P ec0 ec0Var) {
        StringBuilder sbA = Cif.a("Decoder failed: ");
        sbA.append(ec0Var == null ? null : ec0Var.f384886a);
        super(sbA.toString(), illegalStateException);
        this.f384579a = pc1.f388768a >= 21 ? a(illegalStateException) : null;
    }

    @j.P
    @j.X
    private static String a(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        return null;
    }
}
