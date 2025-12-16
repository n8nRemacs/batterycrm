package androidx.media3.session;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class K implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52103b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f52104c;

    public /* synthetic */ K(Object obj, int i12) {
        this.f52103b = i12;
        this.f52104c = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f52103b) {
            case 0:
                androidx.media3.common.util.M.I(((L) this.f52104c).f52119i, runnable);
                break;
            default:
                androidx.media3.common.util.M.I((Handler) this.f52104c, runnable);
                break;
        }
    }
}
