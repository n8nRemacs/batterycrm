package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class sf implements Drawable.Callback {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ sf() {
        this.a = 2;
    }

    private final void a(Drawable drawable) {
    }

    private final void b(Drawable drawable, Runnable runnable, long j) {
    }

    private final void c(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((vf) this.b).invalidateSelf();
                break;
            case 1:
                Drawable.Callback callback = ((ok) this.b).getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                ((jg5) this.b).invalidateSelf();
                break;
            case 4:
                ((gxa) this.b).invalidateSelf();
                break;
            case 5:
                kdb kdbVar = (kdb) this.b;
                if (!Looper.getMainLooper().isCurrentThread()) {
                    Handler handler = kdbVar.getHandler();
                    if (handler == null) {
                        kdbVar.post(new jdb(kdbVar, 1));
                        break;
                    } else {
                        handler.postAtFrontOfQueue(new jdb(kdbVar, 0));
                        break;
                    }
                } else {
                    kdbVar.invalidate();
                    break;
                }
            case 6:
                uxa uxaVar = (uxa) ((WeakReference) this.b).get();
                if (uxaVar != null) {
                    uxaVar.invalidate();
                    break;
                }
                break;
            default:
                ((nwg) this.b).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.a) {
            case 0:
                ((vf) this.b).scheduleSelf(runnable, j);
                break;
            case 1:
                Drawable.Callback callback = ((ok) this.b).getCallback();
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    break;
                }
                break;
            case 2:
                Drawable.Callback callback2 = (Drawable.Callback) this.b;
                if (callback2 != null) {
                    callback2.scheduleDrawable(drawable, runnable, j);
                    break;
                }
                break;
            case 3:
                ((jg5) this.b).scheduleSelf(runnable, j);
                break;
            case 4:
                ((gxa) this.b).scheduleSelf(runnable, j);
                break;
            case 5:
                ((kdb) this.b).postDelayed(runnable, j);
                break;
            case 6:
                break;
            default:
                ((nwg) this.b).scheduleSelf(runnable, j);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                ((vf) this.b).unscheduleSelf(runnable);
                break;
            case 1:
                Drawable.Callback callback = ((ok) this.b).getCallback();
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 2:
                Drawable.Callback callback2 = (Drawable.Callback) this.b;
                if (callback2 != null) {
                    callback2.unscheduleDrawable(drawable, runnable);
                    break;
                }
                break;
            case 3:
                ((jg5) this.b).unscheduleSelf(runnable);
                break;
            case 4:
                ((gxa) this.b).unscheduleSelf(runnable);
                break;
            case 5:
                kdb kdbVar = (kdb) this.b;
                if (!Looper.getMainLooper().isCurrentThread()) {
                    Handler handler = kdbVar.getHandler();
                    if (handler == null) {
                        kdbVar.post(new yn6(kdbVar, 26, runnable));
                        break;
                    } else {
                        handler.postAtFrontOfQueue(new zn6(kdbVar, 21, runnable));
                        break;
                    }
                } else {
                    kdbVar.removeCallbacks(runnable);
                    break;
                }
            case 6:
                break;
            default:
                ((nwg) this.b).unscheduleSelf(runnable);
                break;
        }
    }

    public /* synthetic */ sf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
