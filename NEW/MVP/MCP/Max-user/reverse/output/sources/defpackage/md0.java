package defpackage;

import android.graphics.drawable.Animatable;
import android.os.Handler;
import android.os.Looper;
import one.me.mediapicker.crop.AvatarEditScreen;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes2.dex */
public final class md0 extends kj0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ md0(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.kj0, defpackage.n54
    public final void b(String str, Object obj, Animatable animatable) {
        switch (this.b) {
            case 0:
                pe7 pe7Var = (pe7) obj;
                if (pe7Var != null) {
                    AvatarEditScreen avatarEditScreen = (AvatarEditScreen) this.c;
                    yy7[] yy7VarArr = AvatarEditScreen.u0;
                    vd0 vd0VarZ0 = avatarEditScreen.z0();
                    int width = pe7Var.getWidth();
                    int height = pe7Var.getHeight();
                    vd0VarZ0.getClass();
                    vd0VarZ0.o = m26.a(width, height);
                    break;
                }
                break;
            case 1:
                ((gxa) this.c).invalidateSelf();
                break;
            case 2:
                uxa uxaVar = (uxa) this.c;
                if (!Looper.getMainLooper().isCurrentThread()) {
                    Handler handler = uxaVar.getHandler();
                    if (handler == null) {
                        uxaVar.post(new oxa(uxaVar, 1));
                        break;
                    } else {
                        handler.postAtFrontOfQueue(new oxa(uxaVar, 0));
                        break;
                    }
                } else {
                    cm6 cm6Var = uxaVar.C0;
                    if (cm6Var != null) {
                        cm6Var.invoke();
                    }
                    uxaVar.invalidate();
                    break;
                }
            case 3:
                pe7 pe7Var2 = (pe7) obj;
                OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) this.c;
                if (!Looper.getMainLooper().isCurrentThread()) {
                    Handler handler2 = oneMeDraweeView.getHandler();
                    if (handler2 == null) {
                        oneMeDraweeView.post(new s3b(oneMeDraweeView, str, pe7Var2, animatable, 1));
                        break;
                    } else {
                        handler2.postAtFrontOfQueue(new s3b(oneMeDraweeView, str, pe7Var2, animatable, 0));
                        break;
                    }
                } else {
                    oneMeDraweeView.j(pe7Var2, animatable);
                    oneMeDraweeView.requestLayout();
                    oneMeDraweeView.invalidate();
                    break;
                }
            case 4:
                ((nwg) this.c).invalidateSelf();
                break;
            default:
                dqi.s((w7i) this.c, new n1h(this, 18, obj));
                break;
        }
    }

    @Override // defpackage.kj0, defpackage.n54
    public void d(String str, Throwable th) {
        switch (this.b) {
            case 1:
                wqi.q(((gxa) this.c).c, "Failed to load image. ID: " + str + ". Exception: " + th, new Object[0]);
                break;
            case 2:
                uxa uxaVar = (uxa) this.c;
                wqi.p(uxaVar.a, "Failed to load image. ID: " + str, th);
                uxaVar.postInvalidate();
                break;
            case 3:
                OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) this.c;
                wqi.q(oneMeDraweeView.w0, "Failed to load image. ID: " + str + ". Exception: " + th, new Object[0]);
                if (!Looper.getMainLooper().isCurrentThread()) {
                    Handler handler = oneMeDraweeView.getHandler();
                    if (handler == null) {
                        oneMeDraweeView.post(new r3b(oneMeDraweeView, 1));
                        break;
                    } else {
                        handler.postAtFrontOfQueue(new r3b(oneMeDraweeView, 0));
                        break;
                    }
                } else {
                    oneMeDraweeView.requestLayout();
                    oneMeDraweeView.invalidate();
                    break;
                }
            case 4:
                ia iaVar = ((nwg) this.c).c;
                if (iaVar != null) {
                    iaVar.invoke(th);
                    break;
                }
                break;
            case 5:
                dqi.s((w7i) this.c, new n1h(this, 19, th));
                break;
        }
    }

    @Override // defpackage.kj0, defpackage.n54
    public void e(String str) {
        switch (this.b) {
            case 5:
                w7i w7iVar = (w7i) this.c;
                dqi.s(w7iVar, new u7i(w7iVar, 1));
                break;
        }
    }

    @Override // defpackage.kj0, defpackage.n54
    public void onIntermediateImageSet(String str, Object obj) {
        switch (this.b) {
            case 1:
                ((gxa) this.c).invalidateSelf();
                break;
            case 2:
                ((uxa) this.c).postInvalidate();
                break;
            case 3:
                OneMeDraweeView oneMeDraweeView = (OneMeDraweeView) this.c;
                if (!Looper.getMainLooper().isCurrentThread()) {
                    Handler handler = oneMeDraweeView.getHandler();
                    if (handler == null) {
                        oneMeDraweeView.post(new r3b(oneMeDraweeView, 3));
                        break;
                    } else {
                        handler.postAtFrontOfQueue(new r3b(oneMeDraweeView, 2));
                        break;
                    }
                } else {
                    oneMeDraweeView.requestLayout();
                    oneMeDraweeView.invalidate();
                    break;
                }
            case 5:
                w7i w7iVar = (w7i) this.c;
                w7iVar.removeCallbacks(w7iVar.z0);
                dqi.s(w7iVar, w7iVar.z0);
                break;
        }
    }
}
