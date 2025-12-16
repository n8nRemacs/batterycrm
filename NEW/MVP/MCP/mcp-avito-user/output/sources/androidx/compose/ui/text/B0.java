package androidx.compose.ui.text;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: TtsAnnotation.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/B0;", "Landroidx/compose/ui/text/z0;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class B0 extends z0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f41902a;

    public B0(@Y61.k String str) {
        super(null);
        this.f41902a = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof B0) {
            return kotlin.jvm.internal.L.f(this.f41902a, ((B0) obj).f41902a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41902a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f41902a, ')');
    }
}
