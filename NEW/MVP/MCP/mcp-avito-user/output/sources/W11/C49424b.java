package w11;

import j.N;

/* compiled from: AtMostResizer.java */
/* renamed from: w11.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C49424b implements g {
    @Override // w11.g
    @N
    public final com.otaliastudios.transcoder.common.b a(@N com.otaliastudios.transcoder.common.b bVar) {
        int i12 = bVar.f365980b;
        int i13 = 1280;
        int i14 = bVar.f365979a;
        int i15 = 720;
        if (i12 <= 720 && i14 <= 1280) {
            return bVar;
        }
        float f12 = i12;
        float f13 = 720;
        float f14 = f12 / f13;
        float f15 = i14;
        float f16 = 1280;
        float f17 = f12 / f15;
        if (f15 / f16 >= f14) {
            i15 = (int) (f16 * f17);
        } else {
            i13 = (int) (f13 / f17);
        }
        if (i15 % 2 != 0) {
            i15--;
        }
        if (i13 % 2 != 0) {
            i13--;
        }
        return new com.otaliastudios.transcoder.common.b(i15, i13);
    }
}
