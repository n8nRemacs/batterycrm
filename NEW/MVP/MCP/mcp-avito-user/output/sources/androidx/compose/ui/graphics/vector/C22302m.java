package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.AbstractC22031b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VectorCompose.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/m;", "Landroidx/compose/runtime/b;", "Landroidx/compose/ui/graphics/vector/l;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.vector.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22302m extends AbstractC22031b<AbstractC22301l> {
    public static C22292c l(AbstractC22301l abstractC22301l) {
        if (abstractC22301l instanceof C22292c) {
            return (C22292c) abstractC22301l;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.InterfaceC22078i
    public final void d(int i12, Object obj) {
        l((AbstractC22301l) this.f38176c).e(i12, (AbstractC22301l) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.InterfaceC22078i
    public final void f(int i12, int i13) {
        l((AbstractC22301l) this.f38176c).h(i12, i13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.InterfaceC22078i
    public final void g(int i12, int i13, int i14) {
        C22292c c22292cL = l((AbstractC22301l) this.f38176c);
        ArrayList arrayList = c22292cL.f39833c;
        int i15 = 0;
        if (i12 > i13) {
            while (i15 < i14) {
                AbstractC22301l abstractC22301l = (AbstractC22301l) arrayList.get(i12);
                arrayList.remove(i12);
                arrayList.add(i13, abstractC22301l);
                i13++;
                i15++;
            }
        } else {
            while (i15 < i14) {
                AbstractC22301l abstractC22301l2 = (AbstractC22301l) arrayList.get(i12);
                arrayList.remove(i12);
                arrayList.add(i13 - 1, abstractC22301l2);
                i15++;
            }
        }
        c22292cL.c();
    }

    @Override // androidx.compose.runtime.InterfaceC22078i
    public final /* bridge */ /* synthetic */ void h(int i12, Object obj) {
    }

    @Override // androidx.compose.runtime.AbstractC22031b
    public final void k() {
        C22292c c22292cL = l((AbstractC22301l) this.f38174a);
        c22292cL.h(0, c22292cL.f39833c.size());
    }
}
