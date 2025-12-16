package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.extractor.A;
import com.google.android.exoplayer2.util.C36585a;
import j.P;

/* compiled from: TrackEncryptionBox.java */
/* loaded from: classes6.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f344879a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final String f344880b;

    /* renamed from: c, reason: collision with root package name */
    public final A.a f344881c;

    /* renamed from: d, reason: collision with root package name */
    public final int f344882d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final byte[] f344883e;

    public l(boolean z12, @P String str, int i12, byte[] bArr, int i13, int i14, @P byte[] bArr2) {
        int i15 = 1;
        C36585a.b((bArr2 == null) ^ (i12 == 0));
        this.f344879a = z12;
        this.f344880b = str;
        this.f344882d = i12;
        this.f344883e = bArr2;
        if (str != null && (str.equals("cbc1") || str.equals("cbcs"))) {
            i15 = 2;
        }
        this.f344881c = new A.a(i15, i13, i14, bArr);
    }
}
