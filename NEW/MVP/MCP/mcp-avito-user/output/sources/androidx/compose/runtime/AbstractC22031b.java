package androidx.compose.runtime;

import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: Applier.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/b;", "T", "Landroidx/compose/runtime/i;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22031b<T> implements InterfaceC22078i<T> {

    /* renamed from: a, reason: collision with root package name */
    public final LayoutNode f38174a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList<T> f38175b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public T f38176c;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC22031b(LayoutNode layoutNode) {
        this.f38174a = layoutNode;
        this.f38176c = layoutNode;
    }

    @Override // androidx.compose.runtime.InterfaceC22078i
    public final void clear() {
        this.f38175b.clear();
        this.f38176c = (T) this.f38174a;
        k();
    }

    @Override // androidx.compose.runtime.InterfaceC22078i
    public final void e(T t12) {
        this.f38175b.add(this.f38176c);
        this.f38176c = t12;
    }

    @Override // androidx.compose.runtime.InterfaceC22078i
    public final T i() {
        return this.f38176c;
    }

    @Override // androidx.compose.runtime.InterfaceC22078i
    public final void j() {
        this.f38176c = (T) C22026a.b(1, this.f38175b);
    }

    public abstract void k();
}
