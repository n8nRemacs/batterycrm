package androidx.view.compose;

import androidx.compose.runtime.InterfaceC22118l0;
import androidx.view.InterfaceC22983P;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: Effects.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/m0", "Landroidx/compose/runtime/l0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.compose.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23028w implements InterfaceC22118l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22983P f46770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C23018m f46771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.h f46772c;

    public C23028w(InterfaceC22983P interfaceC22983P, C23018m c23018m, l0.h hVar) {
        this.f46770a = interfaceC22983P;
        this.f46771b = c23018m;
        this.f46772c = hVar;
    }

    @Override // androidx.compose.runtime.InterfaceC22118l0
    public final void dispose() {
        this.f46770a.getLifecycle().c(this.f46771b);
        InterfaceC23004F interfaceC23004F = (InterfaceC23004F) this.f46772c.f406842b;
        if (interfaceC23004F == null) {
            return;
        }
        interfaceC23004F.a();
        throw null;
    }
}
