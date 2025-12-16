package androidx.view.viewmodel.compose;

import X41.i;
import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22143q0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.S;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.T0;
import androidx.view.X0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: LocalViewModelStoreOwner.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/viewmodel/compose/a;", "", "<init>", "()V", "lifecycle-viewmodel-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f46897a = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C22143q0 f46898b = S.c(C1800a.f46899l);

    /* compiled from: LocalViewModelStoreOwner.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.viewmodel.compose.a$a, reason: collision with other inner class name */
    public static final class C1800a extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C1800a f46899l = new C1800a();

        public C1800a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ T0 invoke() {
            return null;
        }
    }

    @InterfaceC22132o
    @l
    @i
    public static T0 a(@l A a12) {
        a12.I(-584162872);
        T0 t0A = (T0) a12.o(f46898b);
        if (t0A == null) {
            a12.I(1382572291);
            t0A = X0.a((View) a12.o(AndroidCompositionLocals_androidKt.f41073f));
            a12.O();
        }
        a12.O();
        return t0A;
    }
}
