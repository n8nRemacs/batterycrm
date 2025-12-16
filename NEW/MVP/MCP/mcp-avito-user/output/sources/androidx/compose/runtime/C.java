package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Composer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/C;", "Landroidx/compose/runtime/i0;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class C implements InterfaceC22079i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f37936a;

    public C(B b12) {
        this.f37936a = b12;
    }

    @Override // androidx.compose.runtime.InterfaceC22079i0
    public final void a() {
        B b12 = this.f37936a;
        b12.f37872A--;
    }

    @Override // androidx.compose.runtime.InterfaceC22079i0
    public final void start() {
        this.f37936a.f37872A++;
    }
}
