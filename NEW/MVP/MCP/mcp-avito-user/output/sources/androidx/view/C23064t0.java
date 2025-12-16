package androidx.view;

import Y61.k;
import androidx.view.Lifecycle;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SavedStateHandleController.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/t0;", "Landroidx/lifecycle/L;", "Ljava/io/Closeable;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23064t0 implements InterfaceC22979L, Closeable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f46890b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C23060r0 f46891c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f46892d;

    public C23064t0(@k String str, @k C23060r0 c23060r0) {
        this.f46890b = str;
        this.f46891c = c23060r0;
    }

    @Override // androidx.view.InterfaceC22979L
    public final void HH(@k InterfaceC22983P interfaceC22983P, @k Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f46892d = false;
            interfaceC22983P.getLifecycle().c(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
