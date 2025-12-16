package androidx.compose.ui.tooling;

import android.os.Bundle;
import androidx.view.C22985S;
import androidx.view.C23485c;
import androidx.view.C23486d;
import androidx.view.InterfaceC23487e;
import androidx.view.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ComposeViewAdapter.android.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/tooling/f;", "Landroidx/savedstate/e;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.tooling.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22691f implements InterfaceC23487e {

    /* renamed from: b, reason: collision with root package name */
    public final C22985S f42818b;

    /* renamed from: c, reason: collision with root package name */
    public final C23486d f42819c;

    public C22691f() {
        C22985S.f46702k.getClass();
        C22985S c22985s = new C22985S(this, false, null);
        this.f42818b = c22985s;
        C23486d.f54432d.getClass();
        C23486d c23486dA = C23486d.a.a(this);
        c23486dA.b(new Bundle());
        this.f42819c = c23486dA;
        c22985s.h(Lifecycle.State.f46683f);
    }

    @Override // androidx.view.InterfaceC22983P
    public final Lifecycle getLifecycle() {
        return this.f42818b;
    }

    @Override // androidx.view.InterfaceC23487e
    public final C23485c getSavedStateRegistry() {
        return this.f42819c.f54434b;
    }
}
