package com.avito.android.analytics.screens.compose;

import androidx.compose.runtime.InterfaceC22118l0;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Effects.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/m0", "Landroidx/compose/runtime/l0;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class t implements InterfaceC22118l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f90608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UUID f90609b;

    public t(r rVar, UUID uuid) {
        this.f90608a = rVar;
        this.f90609b = uuid;
    }

    @Override // androidx.compose.runtime.InterfaceC22118l0
    public final void dispose() {
        this.f90608a.b(false, this.f90609b);
    }
}
