package defpackage;

import androidx.recyclerview.widget.b;

/* loaded from: classes2.dex */
public final class t5c extends b {
    @Override // androidx.recyclerview.widget.b
    public final void clear() {
    }

    @Override // androidx.recyclerview.widget.b
    public final void putRecycledView(mid midVar) {
        if (midVar == null) {
            return;
        }
        getScrapDataForType(midVar.X).a.size();
        super.putRecycledView(midVar);
    }
}
