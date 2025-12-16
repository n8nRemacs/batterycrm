package ru.avito.component.animator;

import android.view.View;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.recyclerview.widget.RecyclerView;
import hw.InterfaceC41178c;
import kotlin.Metadata;

/* compiled from: DefaultAnimatorStrategy.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/avito/component/animator/d;", "Lru/avito/component/animator/b;", "<init>", "()V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public class d implements b {

    /* compiled from: DefaultAnimatorStrategy.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ru/avito/component/animator/d$a", "Lru/avito/component/animator/s;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends s {
        @Override // ru.avito.component.animator.s, androidx.core.view.B0
        public final void c(@Y61.k View view) {
            view.setAlpha(1.0f);
        }
    }

    @Override // ru.avito.component.animator.b
    public long a() {
        return 120L;
    }

    @Override // ru.avito.component.animator.b
    @Y61.k
    public ru.avito.component.animator.a b(@Y61.k RecyclerView.C c12, int i12, int i13, int i14, int i15) {
        A0 a0A = C22823h0.a(c12.itemView);
        a0A.c(e());
        float f12 = i14 - i12;
        View view = a0A.f44903a.get();
        if (view != null) {
            view.animate().translationX(f12);
        }
        a0A.g(i15 - i13);
        a0A.a(0.0f);
        return new ru.avito.component.animator.a(a0A, new f());
    }

    @Override // ru.avito.component.animator.b
    @Y61.k
    public ru.avito.component.animator.a c(@Y61.k RecyclerView.C c12) {
        A0 a0A = C22823h0.a(c12.itemView);
        a0A.c(e());
        View view = a0A.f44903a.get();
        if (view != null) {
            view.animate().translationX(0.0f);
        }
        a0A.g(0.0f);
        a0A.a(1.0f);
        return new ru.avito.component.animator.a(a0A, new e());
    }

    @Override // ru.avito.component.animator.b
    @Y61.k
    public ru.avito.component.animator.a d(@Y61.k RecyclerView.C c12) {
        A0 a0A = C22823h0.a(c12.itemView);
        a0A.c(f());
        a0A.a(1.0f);
        return new ru.avito.component.animator.a(a0A, new a());
    }

    @Override // ru.avito.component.animator.b
    public long e() {
        return 250L;
    }

    public long f() {
        return 120L;
    }
}
