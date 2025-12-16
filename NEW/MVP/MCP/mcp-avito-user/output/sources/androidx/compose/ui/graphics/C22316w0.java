package androidx.compose.ui.graphics;

import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: IntervalTree.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/w0;", "", "Landroidx/compose/ui/graphics/u0;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22316w0 implements Iterator<C22287u0<Object>>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    public C22289v0<Object>.a f40034b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public final C22287u0<Object> next() {
        C22289v0<Object>.a aVar;
        C22289v0<Object>.a aVar2 = this.f40034b;
        C22289v0<Object>.a aVar3 = aVar2.f39767e;
        C22289v0<Object> c22289v0 = C22289v0.this;
        if (aVar3 != c22289v0.f39765a) {
            aVar3.getClass();
            aVar = aVar3;
            while (true) {
                C22289v0<Object>.a aVar4 = aVar.f39766d;
                if (aVar4 == C22289v0.this.f39765a) {
                    break;
                }
                aVar = aVar4;
            }
        } else {
            C22289v0<Object>.a aVar5 = aVar2.f39768f;
            C22289v0<Object>.a aVar6 = aVar2;
            while (aVar5 != c22289v0.f39765a && aVar6 == aVar5.f39767e) {
                aVar6 = aVar5;
                aVar5 = aVar5.f39768f;
            }
            aVar = aVar5;
        }
        this.f40034b = aVar;
        return aVar2;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
