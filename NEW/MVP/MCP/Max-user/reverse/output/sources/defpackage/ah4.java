package defpackage;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class ah4 {
    public static final LinkedHashMap a;

    static {
        lk6 lk6Var = new lk6(4);
        lk6Var.T("TransformerInternal", wg7.m("Start"));
        lk6Var.T("AssetLoader", wg7.n("InputFormat", "OutputFormat"));
        lk6Var.T("AudioDecoder", wg7.q("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        lk6Var.T("AudioGraph", wg7.n("RegisterNewInputStream", "OutputEnded"));
        Object[] objArr = {"RegisterNewInputStream", "OutputFormat", "ProducedOutput"};
        pyi.a(3, objArr);
        lk6Var.T("AudioMixer", wg7.h(3, objArr));
        lk6Var.T("AudioEncoder", wg7.q("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        lk6Var.T("VideoDecoder", wg7.q("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        Object[] objArr2 = {"RegisterNewInputStream", "SurfaceTextureInput", "QueueFrame", "QueueBitmap", "QueueTexture", "RenderedToOutputSurface", "OutputTextureRendered", "ReceiveEndOfAllInput", "SignalEnded"};
        pyi.a(9, objArr2);
        lk6Var.T("VideoFrameProcessor", wg7.h(9, objArr2));
        lk6Var.T("ExternalTextureManager", wg7.n("SignalEOS", "SurfaceTextureTransformFix"));
        lk6Var.T("BitmapTextureManager", wg7.m("SignalEOS"));
        lk6Var.T("TexIdTextureManager", wg7.m("SignalEOS"));
        lk6Var.T("Compositor", wg7.m("OutputTextureRendered"));
        lk6Var.T("VideoEncoder", wg7.q("InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"));
        lk6Var.T("Muxer", wg7.o("InputFormat", "CanWriteSample", "AcceptedInput", "InputEnded", "OutputEnded"));
        lk6Var.u();
        a = new LinkedHashMap();
        SystemClock.elapsedRealtime();
    }

    public static synchronized void a() {
        synchronized (ah4.class) {
        }
    }
}
