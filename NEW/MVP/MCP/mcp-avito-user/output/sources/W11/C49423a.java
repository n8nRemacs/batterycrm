package w11;

import j.N;

/* compiled from: AspectRatioResizer.java */
/* renamed from: w11.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C49423a implements g {
    @Override // w11.g
    @N
    public final com.otaliastudios.transcoder.common.b a(@N com.otaliastudios.transcoder.common.b bVar) {
        int i12 = bVar.f365979a;
        int i13 = bVar.f365980b;
        float f12 = i12 / i13;
        float f13 = 1.0f / 0.0f;
        return f12 > f13 ? new com.otaliastudios.transcoder.common.b(i13, (int) (f13 * i13)) : f12 < f13 ? new com.otaliastudios.transcoder.common.b(i12, (int) (i12 / f13)) : bVar;
    }
}
