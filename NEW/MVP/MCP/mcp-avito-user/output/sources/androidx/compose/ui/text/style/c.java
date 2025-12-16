package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.J;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.d1;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TextForegroundStyle.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/style/c;", "Landroidx/compose/ui/text/style/m;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class c implements m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d1 f42631b;

    /* renamed from: c, reason: collision with root package name */
    public final float f42632c;

    public c(@Y61.k d1 d1Var, float f12) {
        this.f42631b = d1Var;
        this.f42632c = f12;
    }

    @Override // androidx.compose.ui.text.style.m
    /* renamed from: a */
    public final long getF42633b() {
        T.f39320b.getClass();
        return T.f39330l;
    }

    @Override // androidx.compose.ui.text.style.m
    @Y61.k
    public final J c() {
        return this.f42631b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f42631b, cVar.f42631b) && Float.compare(this.f42632c, cVar.f42632c) == 0;
    }

    @Override // androidx.compose.ui.text.style.m
    /* renamed from: getAlpha, reason: from getter */
    public final float getF42632c() {
        return this.f42632c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f42632c) + (this.f42631b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f42631b);
        sb2.append(", alpha=");
        return androidx.appcompat.app.r.k(')', this.f42632c, sb2);
    }
}
