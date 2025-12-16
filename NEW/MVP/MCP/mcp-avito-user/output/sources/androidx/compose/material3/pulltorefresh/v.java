package androidx.compose.material3.pulltorefresh;

import androidx.compose.material3.InterfaceC21537e7;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22192v1;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.Q1;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PullToRefresh.kt */
@InterfaceC21537e7
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/pulltorefresh/v;", "Landroidx/compose/material3/pulltorefresh/s;", "a", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v implements s {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f37108d = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f37109a = Q1.a(0.0f);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f37110b = Q1.a(0.0f);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f37111c;

    /* compiled from: PullToRefresh.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/pulltorefresh/v$a;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public v(boolean z12) {
        this.f37111c = C22126m3.g(Boolean.valueOf(z12));
    }

    @Override // androidx.compose.material3.pulltorefresh.s
    public final float c() {
        return (((C22040c3) this.f37109a).f() * 0.5f) / 0.0f;
    }

    @Override // androidx.compose.material3.pulltorefresh.s
    public final boolean d() {
        return ((Boolean) ((C22082i3) this.f37111c).getF42167b()).booleanValue();
    }
}
