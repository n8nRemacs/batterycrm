package coil.compose;

import android.content.Context;
import androidx.compose.runtime.InterfaceC22029a2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.J3;
import androidx.compose.runtime.X1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: LocalImageLoader.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcoil/compose/r;", "", "delegate", "Landroidx/compose/runtime/X1;", "Lcoil/j;", "coil-compose-singleton_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
@X41.g
/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final X1<coil.j> f58263a;

    @InterfaceC22029a2
    @InterfaceC22132o
    @X41.i
    @Y61.k
    public static final coil.j a(J3 j32, @Y61.l androidx.compose.runtime.A a12) {
        coil.j jVar = (coil.j) a12.o(j32);
        return jVar == null ? coil.d.a((Context) a12.o(AndroidCompositionLocals_androidKt.f41069b)) : jVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return L.f(this.f58263a, ((r) obj).f58263a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f58263a.hashCode();
    }

    public final String toString() {
        return "ImageLoaderProvidableCompositionLocal(delegate=" + this.f58263a + ')';
    }
}
