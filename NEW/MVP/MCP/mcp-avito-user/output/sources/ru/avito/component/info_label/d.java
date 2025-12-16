package ru.avito.component.info_label;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.CycleInterpolator;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import hw.InterfaceC41178c;
import kotlin.Metadata;

/* compiled from: InfoLabelAnimatorStrategy.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/component/info_label/d;", "Lru/avito/component/animator/d;", "<init>", "()V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d extends ru.avito.component.animator.d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final d f430356a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final long f430357b = 350;

    /* renamed from: c, reason: collision with root package name */
    public static final long f430358c = 350;

    /* renamed from: d, reason: collision with root package name */
    public static final long f430359d = 600;

    public static ObjectAnimator g(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", 0.0f, view.getResources().getDimension(R.dimen.shake_animation_amplitude));
        objectAnimatorOfFloat.setDuration(350L);
        objectAnimatorOfFloat.setInterpolator(new CycleInterpolator(2.0f));
        return objectAnimatorOfFloat;
    }

    @Override // ru.avito.component.animator.d, ru.avito.component.animator.b
    public final long a() {
        return f430358c;
    }

    @Override // ru.avito.component.animator.d, ru.avito.component.animator.b
    @Y61.k
    public final ru.avito.component.animator.a b(@Y61.k RecyclerView.C c12, int i12, int i13, int i14, int i15) {
        A0 a0A = C22823h0.a(c12.itemView);
        a0A.c(350L);
        a0A.a(0.0f);
        return new ru.avito.component.animator.a(a0A, new c());
    }

    @Override // ru.avito.component.animator.d, ru.avito.component.animator.b
    @Y61.k
    public final ru.avito.component.animator.a c(@Y61.k RecyclerView.C c12) {
        if ((c12 instanceof k) && ((k) c12).f430366c == InfoLevel.f430350c) {
            ObjectAnimator objectAnimatorG = g(c12.itemView);
            objectAnimatorG.setStartDelay(250L);
            objectAnimatorG.start();
        }
        A0 a0A = C22823h0.a(c12.itemView);
        a0A.c(350L);
        View view = a0A.f44903a.get();
        if (view != null) {
            view.animate().setStartDelay(250L);
        }
        a0A.a(1.0f);
        return new ru.avito.component.animator.a(a0A, new b());
    }

    @Override // ru.avito.component.animator.d, ru.avito.component.animator.b
    @Y61.k
    public final ru.avito.component.animator.a d(@Y61.k RecyclerView.C c12) {
        if ((c12 instanceof k) && ((k) c12).f430366c == InfoLevel.f430350c) {
            g(c12.itemView).start();
        }
        return super.d(c12);
    }

    @Override // ru.avito.component.animator.d, ru.avito.component.animator.b
    public final long e() {
        return f430359d;
    }

    @Override // ru.avito.component.animator.d
    public final long f() {
        return f430357b;
    }
}
