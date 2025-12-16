package androidx.compose.material.pullrefresh;

import androidx.compose.foundation.G1;
import androidx.compose.material.InterfaceC21154e4;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.Q1;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: PullRefreshState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/pullrefresh/t;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC21154e4
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final T f33968a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f33969b;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f33974g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f33975h;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final I3 f33970c = C22126m3.d(new r(this));

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f33971d = C22126m3.g(Boolean.FALSE);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f33972e = Q1.a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f33973f = Q1.a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final G1 f33976i = new G1();

    public t(@Y61.k T t12, @Y61.k InterfaceC22204y1 interfaceC22204y1, float f12, float f13) {
        this.f33968a = t12;
        this.f33969b = interfaceC22204y1;
        this.f33974g = Q1.a(f13);
        this.f33975h = Q1.a(f12);
    }

    public final float a() {
        return ((C22040c3) this.f33974g).f();
    }

    public final boolean b() {
        return ((Boolean) ((C22082i3) this.f33971d).getF42167b()).booleanValue();
    }
}
