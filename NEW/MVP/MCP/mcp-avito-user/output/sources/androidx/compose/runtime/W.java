package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Composition.kt */
@androidx.compose.runtime.internal.P
@InterfaceC22195w0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/W;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public androidx.compose.runtime.tooling.e f38159a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f38160b;

    public W() {
        this(null, false, 3, null);
    }

    public W(androidx.compose.runtime.tooling.e eVar, boolean z12, int i12, C42822w c42822w) {
        eVar = (i12 & 1) != 0 ? null : eVar;
        z12 = (i12 & 2) != 0 ? false : z12;
        this.f38159a = eVar;
        this.f38160b = z12;
    }
}
