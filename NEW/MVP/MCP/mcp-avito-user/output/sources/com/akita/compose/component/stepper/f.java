package com.akita.compose.component.stepper;

import androidx.compose.runtime.InterfaceC22118l0;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Effects.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/m0", "Landroidx/compose/runtime/l0;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements InterfaceC22118l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f62856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f62857c;

    public f(int i12, InterfaceC22196w1 interfaceC22196w1, InterfaceC22204y1 interfaceC22204y1) {
        this.f62855a = i12;
        this.f62856b = interfaceC22196w1;
        this.f62857c = interfaceC22204y1;
    }

    @Override // androidx.compose.runtime.InterfaceC22118l0
    public final void dispose() {
        this.f62856b.L3(this.f62855a);
        this.f62857c.setValue(null);
    }
}
