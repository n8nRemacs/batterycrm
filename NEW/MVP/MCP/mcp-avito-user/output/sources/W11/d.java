package w11;

import j.N;

/* compiled from: FractionResizer.java */
/* loaded from: classes7.dex */
public class d implements g {
    @Override // w11.g
    @N
    public final com.otaliastudios.transcoder.common.b a(@N com.otaliastudios.transcoder.common.b bVar) {
        int i12 = (int) (bVar.f365980b * 0.0f);
        int i13 = (int) (0.0f * bVar.f365979a);
        if (i12 % 2 != 0) {
            i12--;
        }
        if (i13 % 2 != 0) {
            i13--;
        }
        return new com.otaliastudios.transcoder.common.b(i12, i13);
    }
}
