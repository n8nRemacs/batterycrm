package androidx.compose.ui.semantics;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: SemanticsProperties.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/semantics/e;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.semantics.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22557e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f41734a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N f41735b;

    /* JADX WARN: Multi-variable type inference failed */
    public C22557e(@Y61.k String str, @Y61.k Y41.a<Boolean> aVar) {
        this.f41734a = str;
        this.f41735b = (N) aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22557e)) {
            return false;
        }
        C22557e c22557e = (C22557e) obj;
        return L.f(this.f41734a, c22557e.f41734a) && this.f41735b == c22557e.f41735b;
    }

    public final int hashCode() {
        return this.f41735b.hashCode() + (this.f41734a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAccessibilityAction(label=");
        sb2.append(this.f41734a);
        sb2.append(", action=");
        return C22026a.d(sb2, this.f41735b, ')');
    }
}
