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
/* renamed from: androidx.navigation.compose.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C23342h extends N implements l<C22128n0, InterfaceC22118l0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D<C23395u> f52959l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C23395u f52960m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C23348n f52961n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23342h(D<C23395u> d12, C23395u c23395u, C23348n c23348n) {
        super(1);
        this.f52959l = d12;
        this.f52960m = c23395u;
        this.f52961n = c23348n;
    }

    @Override // Y41.l
    public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
        C23395u c23395u = this.f52960m;
        D<C23395u> d12 = this.f52959l;
        d12.add(c23395u);
        return new C23341g(d12, c23395u, this.f52961n);
    }
}
