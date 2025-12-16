package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import Y61.k;
import java.util.List;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.checker.i;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.error.h;
import kotlin.reflect.jvm.internal.impl.types.n0;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.x0;
import u51.InterfaceC48801c;

/* compiled from: CapturedTypeConstructor.kt */
/* loaded from: classes8.dex */
public final class a extends Y implements InterfaceC48801c {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final x0 f409576c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final b f409577d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f409578e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final n0 f409579f;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(x0 x0Var, b bVar, boolean z12, n0 n0Var, int i12, C42822w c42822w) {
        bVar = (i12 & 2) != 0 ? new c(x0Var) : bVar;
        z12 = (i12 & 4) != 0 ? false : z12;
        if ((i12 & 8) != 0) {
            n0.f410236c.getClass();
            n0Var = n0.f410237d;
        }
        this(x0Var, bVar, z12, n0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @k
    public final List<x0> F0() {
        return C42784z0.f406748b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @k
    public final n0 G0() {
        return this.f409579f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    public final q0 H0() {
        return this.f409577d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    public final boolean I0() {
        return this.f409578e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    public final O J0(i iVar) {
        return new a(this.f409576c.b(iVar), this.f409577d, this.f409578e, this.f409579f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y, kotlin.reflect.jvm.internal.impl.types.J0
    public final J0 L0(boolean z12) {
        if (z12 == this.f409578e) {
            return this;
        }
        return new a(this.f409576c, this.f409577d, z12, this.f409579f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.J0
    /* renamed from: M0 */
    public final J0 J0(i iVar) {
        return new a(this.f409576c.b(iVar), this.f409577d, this.f409578e, this.f409579f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    /* renamed from: O0 */
    public final Y L0(boolean z12) {
        if (z12 == this.f409578e) {
            return this;
        }
        return new a(this.f409576c, this.f409577d, z12, this.f409579f);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    @k
    /* renamed from: P0 */
    public final Y N0(@k n0 n0Var) {
        return new a(this.f409576c, this.f409577d, this.f409578e, n0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @k
    public final j n() {
        return h.a(ErrorScopeKind.f410136c, true, new String[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Captured(");
        sb2.append(this.f409576c);
        sb2.append(')');
        sb2.append(this.f409578e ? "?" : "");
        return sb2.toString();
    }

    public a(@k x0 x0Var, @k b bVar, boolean z12, @k n0 n0Var) {
        this.f409576c = x0Var;
        this.f409577d = bVar;
        this.f409578e = z12;
        this.f409579f = n0Var;
    }
}
