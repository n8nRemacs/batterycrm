package androidx.view.compose;

import Y41.l;
import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.InterfaceC22118l0;
import androidx.compose.runtime.snapshots.D;
import androidx.view.C23395u;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DialogHost.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/l0;", "invoke", "(Landroidx/compose/runtime/n0;)Landroidx/compose/runtime/l0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.navigation.compose.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23346l extends N implements l<C22128n0, InterfaceC22118l0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C23395u f52969l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f52970m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ D f52971n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23346l(D d12, C23395u c23395u, boolean z12) {
        super(1);
        this.f52969l = c23395u;
        this.f52970m = z12;
        this.f52971n = d12;
    }

    @Override // Y41.l
    public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
        C23395u c23395u = this.f52969l;
        C23345k c23345k = new C23345k(this.f52971n, c23395u, this.f52970m);
        c23395u.f53188i.a(c23345k);
        return new C23344j(c23395u, c23345k);
    }
}
