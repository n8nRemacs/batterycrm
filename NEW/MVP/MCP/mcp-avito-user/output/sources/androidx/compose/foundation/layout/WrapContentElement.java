package androidx.compose.foundation.layout;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/layout/E3;", "a", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class WrapContentElement extends AbstractC22430p0<E3> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f28526f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Direction f28527b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28528c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f28529d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Object f28530e;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement$a;", "", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(@Y61.k Direction direction, boolean z12, @Y61.k Y41.p pVar, @Y61.k Object obj) {
        this.f28527b = direction;
        this.f28528c = z12;
        this.f28529d = (kotlin.jvm.internal.N) pVar;
        this.f28530e = obj;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        E3 e32 = new E3();
        e32.f28242p = this.f28527b;
        e32.f28243q = this.f28528c;
        e32.f28244r = this.f28529d;
        return e32;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        E3 e32 = (E3) dVar;
        e32.f28242p = this.f28527b;
        e32.f28243q = this.f28528c;
        e32.f28244r = this.f28529d;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f28527b == wrapContentElement.f28527b && this.f28528c == wrapContentElement.f28528c && kotlin.jvm.internal.L.f(this.f28530e, wrapContentElement.f28530e);
    }

    public final int hashCode() {
        return this.f28530e.hashCode() + androidx.appcompat.app.r.i(this.f28527b.hashCode() * 31, 31, this.f28528c);
    }
}
