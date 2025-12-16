package androidx.compose.ui.platform;

import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: AndroidUiDispatcher.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/h0;", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC22479h0 implements Choreographer.FrameCallback, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C22475g0 f41464b;

    public ChoreographerFrameCallbackC22479h0(C22475g0 c22475g0) {
        this.f41464b = c22475g0;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j12) {
        this.f41464b.f41452d.removeCallbacks(this);
        C22475g0.y(this.f41464b);
        C22475g0 c22475g0 = this.f41464b;
        synchronized (c22475g0.f41453e) {
            if (c22475g0.f41458j) {
                c22475g0.f41458j = false;
                ArrayList arrayList = c22475g0.f41455g;
                c22475g0.f41455g = c22475g0.f41456h;
                c22475g0.f41456h = arrayList;
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    ((Choreographer.FrameCallback) arrayList.get(i12)).doFrame(j12);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C22475g0.y(this.f41464b);
        C22475g0 c22475g0 = this.f41464b;
        synchronized (c22475g0.f41453e) {
            try {
                if (c22475g0.f41455g.isEmpty()) {
                    c22475g0.f41451c.removeFrameCallback(this);
                    c22475g0.f41458j = false;
                }
                kotlin.G0 g02 = kotlin.G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
