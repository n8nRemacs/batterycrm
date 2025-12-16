package androidx.compose.material.ripple;

import androidx.compose.foundation.InterfaceC20836r1;
import androidx.compose.foundation.interaction.o;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.internal.P;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: Ripple.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/ripple/v;", "Landroidx/compose/foundation/r1;", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes.dex */
public abstract class v implements InterfaceC20836r1 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f34143b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final B f34144c;

    /* compiled from: Ripple.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/material/ripple/l;", "invoke", "()Landroidx/compose/material/ripple/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<l> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I3<l> f34145l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(I3<l> i32) {
            super(0);
            this.f34145l = i32;
        }

        @Override // Y41.a
        public final l invoke() {
            return this.f34145l.getF42167b();
        }
    }

    public v(boolean z12, @Y61.k I3<l> i32) {
        this.f34143b = z12;
        this.f34144c = new B(new a(i32), z12);
    }

    public abstract void d(@Y61.k o.b bVar, @Y61.k T t12);

    public abstract void f(@Y61.k o.b bVar);
}
