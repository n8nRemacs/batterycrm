package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class r7 {
    public static final List d = ve3.j("", "null", "libvpx", "unknown");
    public final n81 a;
    public final t7 b;
    public final xo8 c;

    public r7(n81 n81Var, y8g y8gVar) {
        this.a = n81Var;
        int i = 0;
        ir9 ir9Var = new ir9(2, this, r7.class, "onVideoCodec", "onVideoCodec(Lru/ok/android/webrtc/stat/codec/ActiveEncodersStats$NamedCodecInfo;J)V", i, 18);
        t7 t7Var = new t7();
        t7Var.c = y8gVar;
        t7Var.d = ir9Var;
        this.b = t7Var;
        this.c = new xo8(2, new ts9(1, this, r7.class, "onAudioCodec", "onAudioCodec(Lru/ok/android/webrtc/stat/codec/ActiveEncodersStats$NamedCodecInfo;)V", i, 22));
    }
}
