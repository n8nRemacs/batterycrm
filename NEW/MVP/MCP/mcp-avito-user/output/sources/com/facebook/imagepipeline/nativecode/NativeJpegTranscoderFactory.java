package com.facebook.imagepipeline.nativecode;

import cX0.InterfaceC27120c;
import cX0.InterfaceC27121d;
import com.facebook.infer.annotation.Nullsafe;

@com.facebook.common.internal.g
@Nullsafe
/* loaded from: classes13.dex */
public class NativeJpegTranscoderFactory implements InterfaceC27121d {

    /* renamed from: a, reason: collision with root package name */
    public final int f340499a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f340500b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f340501c;

    @com.facebook.common.internal.g
    public NativeJpegTranscoderFactory(int i12, boolean z12, boolean z13) {
        this.f340499a = i12;
        this.f340500b = z12;
        this.f340501c = z13;
    }

    @Override // cX0.InterfaceC27121d
    @I41.h
    @com.facebook.common.internal.g
    public InterfaceC27120c createImageTranscoder(RW0.c cVar, boolean z12) {
        if (cVar != RW0.b.f14495a) {
            return null;
        }
        NativeJpegTranscoder nativeJpegTranscoder = new NativeJpegTranscoder();
        nativeJpegTranscoder.f340496a = z12;
        nativeJpegTranscoder.f340497b = this.f340499a;
        nativeJpegTranscoder.f340498c = this.f340500b;
        if (this.f340501c) {
            e.a();
        }
        return nativeJpegTranscoder;
    }
}
