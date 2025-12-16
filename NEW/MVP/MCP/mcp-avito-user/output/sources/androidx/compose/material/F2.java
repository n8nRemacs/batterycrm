package androidx.compose.material;

import androidx.compose.animation.core.C20310q;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;

/* compiled from: Checkbox.kt */
@androidx.compose.runtime.F3
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/material/F2;", "Landroidx/compose/material/X1;", "Landroidx/compose/ui/graphics/T;", "checkedCheckmarkColor", "uncheckedCheckmarkColor", "checkedBoxColor", "uncheckedBoxColor", "disabledCheckedBoxColor", "disabledUncheckedBoxColor", "disabledIndeterminateBoxColor", "checkedBorderColor", "uncheckedBorderColor", "disabledBorderColor", "disabledIndeterminateBorderColor", "<init>", "(JJJJJJJJJJJLkotlin/jvm/internal/w;)V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class F2 implements X1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f32609a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32610b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32611c;

    /* renamed from: d, reason: collision with root package name */
    public final long f32612d;

    /* renamed from: e, reason: collision with root package name */
    public final long f32613e;

    /* renamed from: f, reason: collision with root package name */
    public final long f32614f;

    /* renamed from: g, reason: collision with root package name */
    public final long f32615g;

    /* renamed from: h, reason: collision with root package name */
    public final long f32616h;

    /* renamed from: i, reason: collision with root package name */
    public final long f32617i;

    /* renamed from: j, reason: collision with root package name */
    public final long f32618j;

    /* renamed from: k, reason: collision with root package name */
    public final long f32619k;

    /* compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ToggleableState toggleableState = ToggleableState.f41896b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ToggleableState toggleableState2 = ToggleableState.f41896b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public F2(long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j22, long j23, long j24, C42822w c42822w) {
        this.f32609a = j12;
        this.f32610b = j13;
        this.f32611c = j14;
        this.f32612d = j15;
        this.f32613e = j16;
        this.f32614f = j17;
        this.f32615g = j18;
        this.f32616h = j19;
        this.f32617i = j22;
        this.f32618j = j23;
        this.f32619k = j24;
    }

    @Override // androidx.compose.material.X1
    @InterfaceC22132o
    @Y61.k
    public final androidx.compose.runtime.I3 a(boolean z12, @Y61.k ToggleableState toggleableState, @Y61.l androidx.compose.runtime.A a12) {
        long j12;
        androidx.compose.runtime.I3 i3M;
        a12.C(840901029);
        if (z12) {
            int iOrdinal = toggleableState.ordinal();
            if (iOrdinal == 0) {
                j12 = this.f32611c;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                j12 = this.f32611c;
            } else {
                j12 = this.f32612d;
            }
        } else {
            int iOrdinal2 = toggleableState.ordinal();
            if (iOrdinal2 == 0) {
                j12 = this.f32613e;
            } else if (iOrdinal2 == 1) {
                j12 = this.f32614f;
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                j12 = this.f32615g;
            }
        }
        long j13 = j12;
        if (z12) {
            a12.C(507535414);
            i3M = androidx.compose.animation.l2.b(j13, C20310q.e(toggleableState == ToggleableState.f41897c ? 100 : 50, 0, null, 6), a12, 0, 12);
            a12.h();
        } else {
            a12.C(507715958);
            i3M = C22126m3.m(androidx.compose.ui.graphics.T.a(j13), a12);
            a12.h();
        }
        a12.h();
        return i3M;
    }

    @Override // androidx.compose.material.X1
    @InterfaceC22132o
    @Y61.k
    public final androidx.compose.runtime.I3 b(@Y61.k ToggleableState toggleableState, @Y61.l androidx.compose.runtime.A a12) {
        a12.C(544656267);
        ToggleableState toggleableState2 = ToggleableState.f41897c;
        androidx.compose.runtime.I3 i3B = androidx.compose.animation.l2.b(toggleableState == toggleableState2 ? this.f32610b : this.f32609a, C20310q.e(toggleableState == toggleableState2 ? 100 : 50, 0, null, 6), a12, 0, 12);
        a12.h();
        return i3B;
    }

    @Override // androidx.compose.material.X1
    @InterfaceC22132o
    @Y61.k
    public final androidx.compose.runtime.I3 c(boolean z12, @Y61.k ToggleableState toggleableState, @Y61.l androidx.compose.runtime.A a12) {
        long j12;
        androidx.compose.runtime.I3 i3M;
        a12.C(-1568341342);
        if (z12) {
            int iOrdinal = toggleableState.ordinal();
            if (iOrdinal == 0) {
                j12 = this.f32616h;
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                j12 = this.f32616h;
            } else {
                j12 = this.f32617i;
            }
        } else {
            int iOrdinal2 = toggleableState.ordinal();
            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                j12 = this.f32618j;
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                j12 = this.f32619k;
            }
        }
        long j13 = j12;
        if (z12) {
            a12.C(-840498473);
            i3M = androidx.compose.animation.l2.b(j13, C20310q.e(toggleableState == ToggleableState.f41897c ? 100 : 50, 0, null, 6), a12, 0, 12);
            a12.h();
        } else {
            a12.C(-840317929);
            i3M = C22126m3.m(androidx.compose.ui.graphics.T.a(j13), a12);
            a12.h();
        }
        a12.h();
        return i3M;
    }
}
