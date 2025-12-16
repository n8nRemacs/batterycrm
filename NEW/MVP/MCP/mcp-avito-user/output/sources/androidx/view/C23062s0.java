package androidx.view;

import Y61.k;
import androidx.view.Lifecycle;
import kotlin.Metadata;

/* compiled from: SavedStateHandleSupport.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/s0;", "Landroidx/lifecycle/L;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23062s0 implements InterfaceC22979L {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C23070w0 f46885b;

    public C23062s0(@k C23070w0 c23070w0) {
        this.f46885b = c23070w0;
    }

    @Override // androidx.view.InterfaceC22979L
    public final void HH(@k InterfaceC22983P interfaceC22983P, @k Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            interfaceC22983P.getLifecycle().c(this);
            this.f46885b.a();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
