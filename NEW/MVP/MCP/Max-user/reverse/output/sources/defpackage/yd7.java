package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class yd7 extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ zd7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd7(zd7 zd7Var, int i) {
        super(12, (Object) null);
        this.c = i;
        this.d = zd7Var;
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, k18] */
    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        Drawable downloadDrawable;
        switch (this.c) {
            case 0:
                pe7 pe7Var = (pe7) obj2;
                pe7 pe7Var2 = (pe7) obj;
                if (fni.a(pe7Var2 != null ? Integer.valueOf(pe7Var2.getWidth()) : null, pe7Var != null ? Integer.valueOf(pe7Var.getWidth()) : null)) {
                    if (fni.a(pe7Var2 != null ? Integer.valueOf(pe7Var2.getHeight()) : null, pe7Var != null ? Integer.valueOf(pe7Var.getHeight()) : null)) {
                        return;
                    }
                }
                zd7 zd7Var = this.d;
                zd7Var.post(new ud7(zd7Var, 0));
                return;
            case 1:
                if (fni.a(obj, obj2)) {
                    return;
                }
                Drawable drawable = (Drawable) obj2;
                boolean zIsCurrentThread = Looper.getMainLooper().isCurrentThread();
                zd7 zd7Var2 = this.d;
                if (zIsCurrentThread) {
                    ((gr6) zd7Var2.getHierarchy()).k(drawable);
                    return;
                }
                Handler handler = zd7Var2.getHandler();
                if (handler != null) {
                    handler.postAtFrontOfQueue(new yn6(zd7Var2, 14, drawable));
                    return;
                } else {
                    zd7Var2.post(new zn6(zd7Var2, 10, drawable));
                    return;
                }
            case 2:
                if (fni.a(obj, obj2)) {
                    return;
                }
                this.d.n((od7) obj2, false);
                return;
            default:
                if (fni.a(obj, obj2)) {
                    return;
                }
                td7 td7Var = (td7) obj2;
                if (td7Var != null) {
                    boolean zIsCurrentThread2 = Looper.getMainLooper().isCurrentThread();
                    zd7 zd7Var3 = this.d;
                    if (!zIsCurrentThread2) {
                        Handler handler2 = zd7Var3.getHandler();
                        if (handler2 != null) {
                            handler2.postAtFrontOfQueue(new yn6(zd7Var3, 15, td7Var));
                            return;
                        } else {
                            zd7Var3.post(new zn6(zd7Var3, 11, td7Var));
                            return;
                        }
                    }
                    gr6 gr6Var = (gr6) zd7Var3.getHierarchy();
                    if (td7Var instanceof rd7) {
                        downloadDrawable = (Drawable) zd7Var3.M0.getValue();
                    } else if (td7Var instanceof qd7) {
                        downloadDrawable = zd7Var3.getOverlayDrawable();
                    } else {
                        if (!(td7Var instanceof sd7)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        downloadDrawable = zd7Var3.getDownloadDrawable();
                    }
                    gr6Var.k(downloadDrawable);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd7(Object obj, zd7 zd7Var) {
        super(12, obj);
        this.c = 2;
        this.d = zd7Var;
    }
}
