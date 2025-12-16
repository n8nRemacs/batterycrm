package androidx.compose.ui.text;

import androidx.compose.runtime.C22026a;
import androidx.compose.ui.text.C22602e;
import kotlin.Metadata;

/* compiled from: StringAnnotation.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/h0;", "Landroidx/compose/ui/text/e$a;", "value", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h0 implements C22602e.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f42337a;

    private /* synthetic */ h0(String str) {
        this.f42337a = str;
    }

    public static final /* synthetic */ h0 a(String str) {
        return new h0(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h0) {
            return kotlin.jvm.internal.L.f(this.f42337a, ((h0) obj).f42337a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42337a.hashCode();
    }

    public final String toString() {
        return C22026a.c(new StringBuilder("StringAnnotation(value="), this.f42337a, ')');
    }
}
