package ru.ok.android.externcalls.sdk.ui.internal;

import android.view.Surface;
import defpackage.ah1;
import defpackage.bjh;
import defpackage.cm6;
import defpackage.cwd;
import defpackage.dq0;
import defpackage.epg;
import defpackage.i0;
import defpackage.jt1;
import defpackage.kt1;
import defpackage.r84;
import defpackage.xg1;
import defpackage.yg1;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import org.webrtc.RendererCommon;
import org.webrtc.VideoFrame;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface;
import ru.ok.android.onelog.impl.BuildConfig;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0016H\u0016¢\u0006\u0004\b#\u0010\u0019J\u0017\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020\n2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\n0(H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010\u001bR\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\r008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ok/android/externcalls/sdk/ui/internal/VoipVideoRenderer;", "Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface;", "", SdkMetricStatEvent.NAME_KEY, "<init>", "(Ljava/lang/String;)V", "Lah1;", "renderer", "Lorg/webrtc/RendererCommon$GlDrawer;", "drawer", "Lqqg;", "init", "(Lah1;Lorg/webrtc/RendererCommon$GlDrawer;)V", "Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface$FrameSizeListener;", "listener", "addFrameSizeListener", "(Lru/ok/android/externcalls/sdk/ui/internal/VideoRendererInterface$FrameSizeListener;)V", "removeFrameSizeListener", "", "mirror", "setMirror", "(Z)V", "", "fps", "setFpsReduction", "(F)V", "disableFpsReduction", "()V", "pauseVideo", "clearImage", "Lorg/webrtc/VideoFrame;", "frame", "onFrame", "(Lorg/webrtc/VideoFrame;)V", "layoutAspectRatio", "setLayoutAspectRatio", "Landroid/view/Surface;", "surface", "createEglSurface", "(Landroid/view/Surface;)V", "Lkotlin/Function0;", "onDone", "releaseEglSurface", "(Lcm6;)V", "release", "Lkt1;", "callVideoDrawer", "Lkt1;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljt1;", "drawerListener", "Ljt1;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VoipVideoRenderer implements VideoRendererInterface {
    private final kt1 callVideoDrawer;
    private final CopyOnWriteArrayList<VideoRendererInterface.FrameSizeListener> listeners = new CopyOnWriteArrayList<>();
    private final jt1 drawerListener = new bjh(this);

    public VoipVideoRenderer(String str) {
        this.callVideoDrawer = new kt1(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void drawerListener$lambda$1(VoipVideoRenderer voipVideoRenderer, int i, int i2) {
        Iterator<T> it = voipVideoRenderer.listeners.iterator();
        while (it.hasNext()) {
            ((VideoRendererInterface.FrameSizeListener) it.next()).onFrame(i, i2);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void addFrameSizeListener(VideoRendererInterface.FrameSizeListener listener) {
        this.listeners.add(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void clearImage() {
        kt1 kt1Var = this.callVideoDrawer;
        synchronized (kt1Var.h) {
            ah1 ah1Var = kt1Var.g;
            if (ah1Var != null) {
                ah1Var.e.c(new i0(4, kt1Var));
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void createEglSurface(Surface surface) {
        kt1 kt1Var = this.callVideoDrawer;
        synchronized (kt1Var.h) {
            try {
                ah1 ah1Var = kt1Var.g;
                if (ah1Var != null) {
                    ah1Var.a.log(kt1Var.j, "External request for surface creation");
                    ah1Var.e.c(new r84(kt1Var, 1, surface));
                } else {
                    kt1Var.i = surface;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void init(ah1 renderer, RendererCommon.GlDrawer drawer) {
        kt1 kt1Var = this.callVideoDrawer;
        synchronized (kt1Var.h) {
            try {
                if (kt1Var.g == null) {
                    kt1Var.g = renderer;
                    renderer.e.c(new cwd(kt1Var, drawer, renderer));
                    Surface surface = kt1Var.i;
                    if (surface != null) {
                        renderer.a.log(kt1Var.j, "Got postponed surface request, process and reset reference");
                        renderer.e.c(new r84(kt1Var, 1, surface));
                    }
                    kt1Var.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        kt1 kt1Var2 = this.callVideoDrawer;
        kt1Var2.c.add(this.drawerListener);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void onFrame(VideoFrame frame) {
        kt1 kt1Var = this.callVideoDrawer;
        kt1Var.l.c.incrementAndGet();
        synchronized (kt1Var.h) {
            ah1 ah1Var = kt1Var.g;
            if (ah1Var == null) {
                return;
            }
            AtomicReference atomicReference = kt1Var.d;
            frame.retain();
            Object andSet = atomicReference.getAndSet(frame);
            if (andSet == null) {
                yg1 yg1Var = ah1Var.e;
                epg epgVar = new epg(kt1Var, ah1Var);
                yg1Var.getClass();
                try {
                    yg1Var.k.post(new xg1(epgVar, yg1Var, 0));
                } catch (IllegalStateException e) {
                    yg1Var.a.reportException(yg1Var.j, "OpenGL tread died, is it fine?", e);
                }
            }
            VideoFrame videoFrame = (VideoFrame) andSet;
            if (videoFrame != null) {
                videoFrame.release();
                kt1Var.l.d.incrementAndGet();
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void release() {
        kt1 kt1Var = this.callVideoDrawer;
        kt1Var.c.remove(this.drawerListener);
        kt1 kt1Var2 = this.callVideoDrawer;
        synchronized (kt1Var2.h) {
            ah1 ah1Var = kt1Var2.g;
            if (ah1Var == null) {
                return;
            }
            ah1Var.e.c(new epg(ah1Var, kt1Var2));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void releaseEglSurface(cm6 onDone) {
        kt1 kt1Var = this.callVideoDrawer;
        synchronized (kt1Var.h) {
            kt1Var.i = null;
            ah1 ah1Var = kt1Var.g;
            if (ah1Var == null) {
                onDone.invoke();
                return;
            }
            ah1Var.a.log(kt1Var.j, "External request for surface release");
            if (!ah1Var.e.c(new cwd(ah1Var, kt1Var, onDone))) {
                onDone.invoke();
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void removeFrameSizeListener(VideoRendererInterface.FrameSizeListener listener) {
        this.listeners.remove(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void setFpsReduction(float fps) {
        dq0 dq0Var = this.callVideoDrawer.e;
        synchronized (dq0Var) {
            try {
                long j = dq0Var.c;
                if (fps <= 0.0f) {
                    dq0Var.c = BuildConfig.MAX_TIME_TO_UPLOAD;
                } else {
                    dq0Var.c = (long) (TimeUnit.SECONDS.toNanos(1L) / fps);
                }
                if (dq0Var.c != j) {
                    dq0Var.b = System.nanoTime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void setLayoutAspectRatio(float layoutAspectRatio) {
        ((AtomicReference) this.callVideoDrawer.f.a).set(Float.valueOf(layoutAspectRatio));
    }

    @Override // ru.ok.android.externcalls.sdk.ui.internal.VideoRendererInterface
    public void setMirror(boolean mirror) {
        ((AtomicBoolean) this.callVideoDrawer.f.b).set(mirror);
    }
}
