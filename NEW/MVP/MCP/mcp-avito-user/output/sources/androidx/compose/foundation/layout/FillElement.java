package androidx.compose.foundation.layout;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/layout/w0;", "a", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FillElement extends AbstractC22430p0<C20633w0> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f28255d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Direction f28256b;

    /* renamed from: c, reason: collision with root package name */
    public final float f28257c;

    /* compiled from: Size.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/layout/FillElement$a;", "", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public FillElement(@Y61.k Direction direction, float f12) {
        this.f28256b = direction;
        this.f28257c = f12;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        C20633w0 c20633w0 = new C20633w0();
        c20633w0.f28771p = this.f28256b;
        c20633w0.f28772q = this.f28257c;
        return c20633w0;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        C20633w0 c20633w0 = (C20633w0) dVar;
        c20633w0.f28771p = this.f28256b;
        c20633w0.f28772q = this.f28257c;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f28256b == fillElement.f28256b && this.f28257c == fillElement.f28257c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f28257c) + (this.f28256b.hashCode() * 31);
    }
}
