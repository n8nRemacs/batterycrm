package androidx.compose.foundation;

import androidx.compose.runtime.InterfaceC22118l0;
import kotlin.Metadata;

/* compiled from: Effects.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/m0", "Landroidx/compose/runtime/l0;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class I implements InterfaceC22118l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y f26725a;

    public I(Y y12) {
        this.f26725a = y12;
    }

    @Override // androidx.compose.runtime.InterfaceC22118l0
    public final void dispose() {
        kotlinx.coroutines.r rVar = ((C20411b0) this.f26725a).f26951c;
        if (rVar != null) {
            rVar.f(null);
        }
    }
}
