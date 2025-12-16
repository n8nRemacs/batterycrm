package defpackage;

import android.util.Size;
import one.me.sdk.gl.effects.VideoMessageStencilHolder;
import one.me.sdk.gl.effects.objects.FrameBuffer;

/* loaded from: classes2.dex */
public final class hef {
    public final Size a;
    public final int b;
    public final int c;
    public final String d;
    public final VideoMessageStencilHolder e;
    public final FrameBuffer f;

    public hef(Size size) {
        this.a = size;
        this.b = size.getWidth();
        this.c = size.getHeight();
        String name = hef.class.getName();
        this.d = name;
        VideoMessageStencilHolder videoMessageStencilHolder = new VideoMessageStencilHolder(size.getWidth(), size.getHeight());
        this.e = videoMessageStencilHolder;
        this.f = new FrameBuffer(size.getWidth(), size.getHeight());
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "init, previewSize=" + size, null);
            }
        }
        videoMessageStencilHolder.notifyRecording(true);
    }
}
