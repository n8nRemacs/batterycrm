package androidx.compose.ui.input.key;

import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SoftwareKeyboardInterceptionModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/SoftKeyboardInterceptionElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/ui/input/key/a;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class SoftKeyboardInterceptionElement extends AbstractC22430p0<a> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Y41.l<c, Boolean> f40050b;

    public SoftKeyboardInterceptionElement(@l Y41.l lVar) {
        this.f40050b = lVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        a aVar = new a();
        aVar.f40051p = this.f40050b;
        return aVar;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        a aVar = (a) dVar;
        aVar.getClass();
        aVar.f40051p = this.f40050b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoftKeyboardInterceptionElement)) {
            return false;
        }
        SoftKeyboardInterceptionElement softKeyboardInterceptionElement = (SoftKeyboardInterceptionElement) obj;
        softKeyboardInterceptionElement.getClass();
        return L.f(null, null) && L.f(this.f40050b, softKeyboardInterceptionElement.f40050b);
    }

    public final int hashCode() {
        Y41.l<c, Boolean> lVar = this.f40050b;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Y61.k
    public final String toString() {
        return H.l(new StringBuilder("SoftKeyboardInterceptionElement(onKeyEvent=null, onPreKeyEvent="), this.f40050b, ')');
    }
}
