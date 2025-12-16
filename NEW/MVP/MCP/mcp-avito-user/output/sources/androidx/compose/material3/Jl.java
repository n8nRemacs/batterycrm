package androidx.compose.material3;

import androidx.compose.runtime.InterfaceC22118l0;
import androidx.view.Lifecycle;
import kotlin.Metadata;

/* compiled from: Effects.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/m0", "Landroidx/compose/runtime/l0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Jl implements InterfaceC22118l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y41.a f34973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f34974b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Il f34975c;

    public Jl(Y41.a aVar, Lifecycle lifecycle, Il il2) {
        this.f34973a = aVar;
        this.f34974b = lifecycle;
        this.f34975c = il2;
    }

    @Override // androidx.compose.runtime.InterfaceC22118l0
    public final void dispose() {
        this.f34973a.invoke();
        this.f34974b.c(this.f34975c);
    }
}
