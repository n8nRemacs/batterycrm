package androidx.compose.material3;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import java.util.Arrays;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Slider.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/Uf;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC42830m
@androidx.compose.runtime.F3
/* loaded from: classes.dex */
public final class Uf {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f35561a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f35562b;

    public Uf() {
        this(null, null, 3, null);
    }

    @Y61.k
    public final kotlin.ranges.f<Float> a() {
        return (kotlin.ranges.f) ((C22082i3) this.f35561a).getF42167b();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uf)) {
            return false;
        }
        Uf uf2 = (Uf) obj;
        return kotlin.jvm.internal.L.f(a(), uf2.a()) && Arrays.equals((float[]) ((C22082i3) this.f35562b).getF42167b(), (float[]) ((C22082i3) uf2.f35562b).getF42167b());
    }

    public final int hashCode() {
        return Arrays.hashCode((float[]) ((C22082i3) this.f35562b).getF42167b()) + (a().hashCode() * 31);
    }

    public Uf(kotlin.ranges.f fVar, float[] fArr, int i12, C42822w c42822w) {
        fVar = (i12 & 1) != 0 ? kotlin.ranges.s.m(0.0f, 1.0f) : fVar;
        fArr = (i12 & 2) != 0 ? new float[0] : fArr;
        this.f35561a = C22126m3.g(fVar);
        this.f35562b = C22126m3.g(fArr);
    }
}
