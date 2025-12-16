package androidx.compose.foundation.pager;

import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.InterfaceC22196w1;
import androidx.compose.runtime.Q1;
import androidx.compose.runtime.U2;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PagerScrollPosition.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/c0;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final m0 f29895a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22196w1 f29896b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f29897c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f29898d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Object f29899e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.lazy.layout.W f29900f;

    public c0(int i12, float f12, @Y61.k m0 m0Var) {
        this.f29895a = m0Var;
        this.f29896b = U2.a(i12);
        this.f29897c = Q1.a(f12);
        this.f29900f = new androidx.compose.foundation.lazy.layout.W(i12, 30, 100);
    }

    public /* synthetic */ c0(int i12, float f12, m0 m0Var, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0 : i12, (i13 & 2) != 0 ? 0.0f : f12, m0Var);
    }
}
