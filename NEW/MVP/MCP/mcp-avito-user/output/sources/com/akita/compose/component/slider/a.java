package com.akita.compose.component.slider;

import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Slider.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/akita/compose/component/slider/q;", "it", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/slider/q;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.component.slider.a$a, reason: collision with other inner class name */
    public static final class C2099a extends N implements Y41.q<q, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C2099a f62689l = new C2099a();

        public C2099a() {
            super(3);
        }

        @Override // Y41.q
        public final G0 invoke(q qVar, A a12, Integer num) {
            q qVar2 = qVar;
            A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(qVar2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else {
                y.a(qVar2, null, 0.0f, 0L, 0L, a13, iIntValue & 14, 30);
            }
            return G0.f406611a;
        }
    }

    static {
        new a();
        new C22096n(-2043594636, C2099a.f62689l, false);
    }
}
