package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.view.ViewGroup;
import androidx.transition.L;
import androidx.transition.P;
import androidx.transition.V;
import androidx.transition.o0;
import com.yandex.div.internal.widget.s;
import kotlin.Metadata;

/* compiled from: OutlineAwareVisibility.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/animations/e;", "Landroidx/transition/o0;", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class e extends o0 {

    /* compiled from: Transitions.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/yandex/div/core/view2/animations/h", "Landroidx/transition/P;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a extends P {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f367932b;

        public a(s sVar) {
            this.f367932b = sVar;
        }

        @Override // androidx.transition.P, androidx.transition.L.f
        public final void e(@Y61.k L l12) {
            s sVar = this.f367932b;
            if (sVar != null) {
                sVar.setTransient(false);
            }
            e.this.A(this);
        }
    }

    /* compiled from: Transitions.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/yandex/div/core/view2/animations/h", "Landroidx/transition/P;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b extends P {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f367934b;

        public b(s sVar) {
            this.f367934b = sVar;
        }

        @Override // androidx.transition.P, androidx.transition.L.f
        public final void e(@Y61.k L l12) {
            s sVar = this.f367934b;
            if (sVar != null) {
                sVar.setTransient(false);
            }
            e.this.A(this);
        }
    }

    @Override // androidx.transition.o0
    @Y61.l
    public final Animator P(@Y61.k ViewGroup viewGroup, @Y61.l V v12, int i12, @Y61.l V v13, int i13) {
        Object obj = v13 == null ? null : v13.f54717b;
        s sVar = obj instanceof s ? (s) obj : null;
        if (sVar != null) {
            sVar.setTransient(true);
        }
        a(new a(sVar));
        return super.P(viewGroup, v12, i12, v13, i13);
    }

    @Override // androidx.transition.o0
    @Y61.l
    public final Animator R(@Y61.k ViewGroup viewGroup, @Y61.l V v12, int i12, @Y61.l V v13, int i13) {
        Object obj = v12 == null ? null : v12.f54717b;
        s sVar = obj instanceof s ? (s) obj : null;
        if (sVar != null) {
            sVar.setTransient(true);
        }
        a(new b(sVar));
        return super.R(viewGroup, v12, i12, v13, i13);
    }
}
