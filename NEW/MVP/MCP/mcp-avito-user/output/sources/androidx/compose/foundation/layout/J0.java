package androidx.compose.foundation.layout;

import androidx.compose.runtime.F3;
import j.InterfaceC42167x;
import kotlin.Metadata;

/* compiled from: FlowLayout.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/layout/J0;", "Landroidx/compose/foundation/layout/J;", "Landroidx/compose/foundation/layout/I0;", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class J0 implements J, I0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final J0 f28340b = new J0();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f28341a = K.f28344a;

    @Override // androidx.compose.foundation.layout.J
    @F3
    @Y61.k
    public final androidx.compose.ui.v a(@Y61.k androidx.compose.ui.v vVar, @InterfaceC42167x float f12, boolean z12) {
        return this.f28341a.a(vVar, f12, z12);
    }

    @Override // androidx.compose.foundation.layout.I0
    @Y61.k
    public final androidx.compose.ui.v b(@Y61.k androidx.compose.ui.v vVar) {
        return vVar.d0(new FillCrossAxisSizeElement());
    }
}
