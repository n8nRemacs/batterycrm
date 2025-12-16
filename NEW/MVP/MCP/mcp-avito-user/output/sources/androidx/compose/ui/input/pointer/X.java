package androidx.compose.ui.input.pointer;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PointerInteropFilter.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/X;", "Lkotlin/Function1;", "", "Lkotlin/G0;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class X implements Y41.l<Boolean, G0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public M f40196b;

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        M m12 = this.f40196b;
        if (m12 != null) {
            m12.f40157d = zBooleanValue;
        }
        return G0.f406611a;
    }
}
