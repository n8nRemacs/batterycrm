package androidx.compose.material3;

import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.InterfaceC22192v1;
import kotlin.Metadata;

/* compiled from: AppBar.kt */
@InterfaceC21537e7
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/n1;", "Landroidx/compose/material3/m1;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.compose.runtime.F3
/* renamed from: androidx.compose.material3.n1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21737n1 implements InterfaceC21714m1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f36871a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f36872b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22192v1 f36873c;

    public C21737n1(float f12, float f13, float f14) {
        this.f36871a = androidx.compose.runtime.Q1.a(f12);
        this.f36872b = androidx.compose.runtime.Q1.a(f14);
        this.f36873c = androidx.compose.runtime.Q1.a(f13);
    }

    @Override // androidx.compose.material3.InterfaceC21714m1
    public final float a() {
        InterfaceC22192v1 interfaceC22192v1 = this.f36871a;
        if (((C22040c3) interfaceC22192v1).f() == 0.0f) {
            return 0.0f;
        }
        return d() / ((C22040c3) interfaceC22192v1).f();
    }

    @Override // androidx.compose.material3.InterfaceC21714m1
    public final float b() {
        return this.f36871a.f();
    }

    @Override // androidx.compose.material3.InterfaceC21714m1
    public final void c(float f12) {
        ((C22040c3) this.f36873c).S6(kotlin.ranges.s.f(f12, ((C22040c3) this.f36871a).f(), 0.0f));
    }

    @Override // androidx.compose.material3.InterfaceC21714m1
    public final float d() {
        return ((C22040c3) this.f36873c).f();
    }

    @Override // androidx.compose.material3.InterfaceC21714m1
    public final float e() {
        return this.f36872b.f();
    }
}
