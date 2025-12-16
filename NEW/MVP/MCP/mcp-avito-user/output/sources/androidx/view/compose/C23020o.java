package androidx.view.compose;

import androidx.compose.runtime.InterfaceC22118l0;
import androidx.view.InterfaceC22983P;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: Effects.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/m0", "Landroidx/compose/runtime/l0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.compose.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23020o implements InterfaceC22118l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22983P f46759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C23018m f46760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.h f46761c;

    public C23020o(InterfaceC22983P interfaceC22983P, C23018m c23018m, l0.h hVar) {
        this.f46759a = interfaceC22983P;
        this.f46760b = c23018m;
        this.f46761c = hVar;
    }

    @Override // androidx.compose.runtime.InterfaceC22118l0
    public final void dispose() {
        this.f46759a.getLifecycle().c(this.f46760b);
        InterfaceC22999A interfaceC22999A = (InterfaceC22999A) this.f46761c.f406842b;
        if (interfaceC22999A == null) {
            return;
        }
        interfaceC22999A.a();
        throw null;
    }
}
