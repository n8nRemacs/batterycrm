package androidx.compose.material.pullrefresh;

import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.InterfaceC22192v1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: PullRefreshState.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class u extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f33977l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f33978m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.e f33979n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l0.e f33980o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t tVar, boolean z12, l0.e eVar, l0.e eVar2) {
        super(0);
        this.f33977l = tVar;
        this.f33978m = z12;
        this.f33979n = eVar;
        this.f33980o = eVar2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        t tVar = this.f33977l;
        boolean zB2 = tVar.b();
        InterfaceC22192v1 interfaceC22192v1 = tVar.f33975h;
        T t12 = tVar.f33968a;
        boolean z12 = this.f33978m;
        if (zB2 != z12) {
            ((C22082i3) tVar.f33971d).setValue(Boolean.valueOf(z12));
            ((C22040c3) tVar.f33973f).S6(0.0f);
            C43259k.d(t12, null, null, new s(tVar, z12 ? ((C22040c3) interfaceC22192v1).f() : 0.0f, null), 3);
        }
        ((C22040c3) tVar.f33974g).S6(this.f33979n.f406839b);
        float f12 = this.f33980o.f406839b;
        C22040c3 c22040c3 = (C22040c3) interfaceC22192v1;
        if (c22040c3.f() != f12) {
            c22040c3.S6(f12);
            if (tVar.b()) {
                C43259k.d(t12, null, null, new s(tVar, f12, null), 3);
            }
        }
        return G0.f406611a;
    }
}
