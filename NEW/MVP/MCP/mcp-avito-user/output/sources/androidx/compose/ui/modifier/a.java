package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import s0.C47949a;

/* compiled from: ModifierLocalModifierNode.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/modifier/a;", "Landroidx/compose/ui/modifier/j;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a extends j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public m<?> f40528a;

    public a() {
        throw null;
    }

    @Override // androidx.compose.ui.modifier.j
    public final boolean a(@Y61.k c<?> cVar) {
        return cVar == this.f40528a.getKey();
    }

    @Override // androidx.compose.ui.modifier.j
    @Y61.l
    public final Object b(@Y61.k s sVar) {
        if (sVar != this.f40528a.getKey()) {
            C47949a.b("Check failed.");
        }
        return this.f40528a.getValue();
    }

    @Override // androidx.compose.ui.modifier.j
    public final <T> void c(@Y61.k c<T> cVar, T t12) {
        throw new IllegalStateException("Set is not allowed on a backwards compat provider");
    }
}
