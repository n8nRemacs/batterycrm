package androidx.compose.ui.modifier;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import s0.C47949a;

/* compiled from: ModifierLocalModifierNode.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/modifier/t;", "Landroidx/compose/ui/modifier/j;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t extends j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c<?> f40538a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f40539b;

    public t(@Y61.k c<?> cVar) {
        super(null);
        this.f40538a = cVar;
        this.f40539b = C22126m3.g(null);
    }

    @Override // androidx.compose.ui.modifier.j
    public final boolean a(@Y61.k c<?> cVar) {
        return cVar == this.f40538a;
    }

    @Override // androidx.compose.ui.modifier.j
    @Y61.l
    public final Object b(@Y61.k s sVar) {
        if (sVar != this.f40538a) {
            C47949a.b("Check failed.");
        }
        Object f42167b = ((C22082i3) this.f40539b).getF42167b();
        if (f42167b == null) {
            return null;
        }
        return f42167b;
    }

    @Override // androidx.compose.ui.modifier.j
    public final <T> void c(@Y61.k c<T> cVar, T t12) {
        if (!(cVar == this.f40538a)) {
            C47949a.b("Check failed.");
        }
        ((C22082i3) this.f40539b).setValue(t12);
    }
}
