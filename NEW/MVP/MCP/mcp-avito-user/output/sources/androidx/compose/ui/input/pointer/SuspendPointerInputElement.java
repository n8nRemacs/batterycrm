package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SuspendingPointerInputFilter.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/input/pointer/g0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends AbstractC22430p0<g0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Object f40184b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Object f40185c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Object[] f40186d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final PointerInputEventHandler f40187e;

    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i12, C42822w c42822w) {
        obj = (i12 & 1) != 0 ? null : obj;
        obj2 = (i12 & 2) != 0 ? null : obj2;
        objArr = (i12 & 4) != 0 ? null : objArr;
        this.f40184b = obj;
        this.f40185c = obj2;
        this.f40186d = objArr;
        this.f40187e = pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        return new g0(this.f40184b, this.f40185c, this.f40186d, this.f40187e);
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        g0 g0Var = (g0) dVar;
        Object obj = g0Var.f40230p;
        Object obj2 = this.f40184b;
        boolean z12 = !kotlin.jvm.internal.L.f(obj, obj2);
        g0Var.f40230p = obj2;
        Object obj3 = g0Var.f40231q;
        Object obj4 = this.f40185c;
        if (!kotlin.jvm.internal.L.f(obj3, obj4)) {
            z12 = true;
        }
        g0Var.f40231q = obj4;
        Object[] objArr = g0Var.f40232r;
        Object[] objArr2 = this.f40186d;
        if (objArr != null && objArr2 == null) {
            z12 = true;
        }
        if (objArr == null && objArr2 != null) {
            z12 = true;
        }
        if (objArr != null && objArr2 != null && !Arrays.equals(objArr2, objArr)) {
            z12 = true;
        }
        g0Var.f40232r = objArr2;
        Class<?> cls = g0Var.f40234t.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f40187e;
        if (cls == pointerInputEventHandler.getClass() ? z12 : true) {
            g0Var.B0();
        }
        g0Var.f40234t = pointerInputEventHandler;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!kotlin.jvm.internal.L.f(this.f40184b, suspendPointerInputElement.f40184b) || !kotlin.jvm.internal.L.f(this.f40185c, suspendPointerInputElement.f40185c)) {
            return false;
        }
        Object[] objArr = this.f40186d;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.f40186d;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.f40186d != null) {
            return false;
        }
        return this.f40187e == suspendPointerInputElement.f40187e;
    }

    public final int hashCode() {
        Object obj = this.f40184b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f40185c;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f40186d;
        return this.f40187e.hashCode() + ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }
}
