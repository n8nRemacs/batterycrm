package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;

/* compiled from: StubTypes.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42973e extends Y {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f410130c;

    /* compiled from: StubTypes.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.e$a */
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

    public AbstractC42973e(boolean z12) {
        this.f410130c = z12;
        ErrorScopeKind errorScopeKind = ErrorScopeKind.f410136c;
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @Y61.k
    public final List<x0> F0() {
        return C42784z0.f406748b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @Y61.k
    public final n0 G0() {
        n0.f410236c.getClass();
        return n0.f410237d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    public final boolean I0() {
        return this.f410130c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    @Y61.k
    /* renamed from: O0 */
    public final Y L0(boolean z12) {
        return z12 == this.f410130c ? this : Q0(z12);
    }

    @Y61.k
    public abstract C42980h0 Q0(boolean z12);

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @Y61.k
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.j n() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    public final O J0(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.J0
    public final J0 M0(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y, kotlin.reflect.jvm.internal.impl.types.J0
    public final J0 N0(n0 n0Var) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    @Y61.k
    /* renamed from: P0 */
    public final Y N0(@Y61.k n0 n0Var) {
        return this;
    }
}
