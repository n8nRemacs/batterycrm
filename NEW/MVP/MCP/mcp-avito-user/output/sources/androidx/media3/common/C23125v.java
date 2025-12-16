package androidx.media3.common;

import androidx.media3.common.util.C23110a;

/* compiled from: FrameInfo.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.common.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C23125v {

    /* compiled from: FrameInfo.java */
    /* renamed from: androidx.media3.common.v$b */
    public static final class b {
    }

    public C23125v(int i12, int i13, float f12, long j12, a aVar) {
        C23110a.a("width must be positive, but is: " + i12, i12 > 0);
        C23110a.a("height must be positive, but is: " + i13, i13 > 0);
    }
}
