package androidx.compose.material3;

import androidx.compose.ui.graphics.T;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Checkbox.kt */
@androidx.compose.runtime.H0
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/material3/H2;", "", "Landroidx/compose/ui/graphics/T;", "checkedCheckmarkColor", "uncheckedCheckmarkColor", "checkedBoxColor", "uncheckedBoxColor", "disabledCheckedBoxColor", "disabledUncheckedBoxColor", "disabledIndeterminateBoxColor", "checkedBorderColor", "uncheckedBorderColor", "disabledBorderColor", "disabledUncheckedBorderColor", "disabledIndeterminateBorderColor", "<init>", "(JJJJJJJJJJJJLkotlin/jvm/internal/w;)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f34812a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34813b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34814c;

    /* renamed from: d, reason: collision with root package name */
    public final long f34815d;

    /* renamed from: e, reason: collision with root package name */
    public final long f34816e;

    /* renamed from: f, reason: collision with root package name */
    public final long f34817f;

    /* renamed from: g, reason: collision with root package name */
    public final long f34818g;

    /* renamed from: h, reason: collision with root package name */
    public final long f34819h;

    /* renamed from: i, reason: collision with root package name */
    public final long f34820i;

    /* renamed from: j, reason: collision with root package name */
    public final long f34821j;

    /* renamed from: k, reason: collision with root package name */
    public final long f34822k;

    /* renamed from: l, reason: collision with root package name */
    public final long f34823l;

    /* compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
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

    public H2(long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j22, long j23, long j24, long j25, C42822w c42822w) {
        this.f34812a = j12;
        this.f34813b = j13;
        this.f34814c = j14;
        this.f34815d = j15;
        this.f34816e = j16;
        this.f34817f = j17;
        this.f34818g = j18;
        this.f34819h = j19;
        this.f34820i = j22;
        this.f34821j = j23;
        this.f34822k = j24;
        this.f34823l = j25;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof H2)) {
            return false;
        }
        H2 h22 = (H2) obj;
        return androidx.compose.ui.graphics.T.d(this.f34812a, h22.f34812a) && androidx.compose.ui.graphics.T.d(this.f34813b, h22.f34813b) && androidx.compose.ui.graphics.T.d(this.f34814c, h22.f34814c) && androidx.compose.ui.graphics.T.d(this.f34815d, h22.f34815d) && androidx.compose.ui.graphics.T.d(this.f34816e, h22.f34816e) && androidx.compose.ui.graphics.T.d(this.f34817f, h22.f34817f) && androidx.compose.ui.graphics.T.d(this.f34818g, h22.f34818g) && androidx.compose.ui.graphics.T.d(this.f34819h, h22.f34819h) && androidx.compose.ui.graphics.T.d(this.f34820i, h22.f34820i) && androidx.compose.ui.graphics.T.d(this.f34821j, h22.f34821j) && androidx.compose.ui.graphics.T.d(this.f34822k, h22.f34822k) && androidx.compose.ui.graphics.T.d(this.f34823l, h22.f34823l);
    }

    public final int hashCode() {
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return Long.hashCode(this.f34823l) + androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(Long.hashCode(this.f34812a) * 31, 31, this.f34813b), 31, this.f34814c), 31, this.f34815d), 31, this.f34816e), 31, this.f34817f), 31, this.f34818g), 31, this.f34819h), 31, this.f34820i), 31, this.f34821j), 31, this.f34822k);
    }
}
