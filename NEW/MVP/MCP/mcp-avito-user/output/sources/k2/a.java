package K2;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import kotlin.Metadata;

/* compiled from: GenericViewTarget.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LK2/a;", "Landroid/view/View;", "T", "LK2/d;", "LM2/d;", "Landroidx/lifecycle/q;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class a<T extends View> implements d<T>, M2.d, InterfaceC23057q {

    /* renamed from: b, reason: collision with root package name */
    public boolean f9216b;

    @Override // M2.d
    @l
    public abstract Drawable a();

    @Override // K2.c
    public final void b(@k Drawable drawable) {
        g(drawable);
    }

    @Override // K2.c
    public final void c(@l Drawable drawable) {
        g(drawable);
    }

    @Override // K2.c
    public final void d(@l Drawable drawable) {
        g(drawable);
    }

    public abstract void e(@l Drawable drawable);

    public final void f() {
        Object objA = a();
        Animatable animatable = objA instanceof Animatable ? (Animatable) objA : null;
        if (animatable == null) {
            return;
        }
        if (this.f9216b) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void g(@l Drawable drawable) {
        Object objA = a();
        Animatable animatable = objA instanceof Animatable ? (Animatable) objA : null;
        if (animatable != null) {
            animatable.stop();
        }
        e(drawable);
        f();
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onStart(@k InterfaceC22983P interfaceC22983P) {
        this.f9216b = true;
        f();
    }

    @Override // androidx.view.InterfaceC23057q
    public final void onStop(@k InterfaceC22983P interfaceC22983P) {
        this.f9216b = false;
        f();
    }
}
