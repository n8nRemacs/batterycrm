package androidx.compose.ui.text;

import androidx.compose.runtime.C22026a;
import androidx.compose.ui.text.C22602e;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: UrlAnnotation.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/A0;", "Landroidx/compose/ui/text/e$a;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC22675w
@InterfaceC42830m
/* loaded from: classes.dex */
public final class A0 implements C22602e.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f41901a;

    public A0(@Y61.k String str) {
        this.f41901a = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof A0) {
            return kotlin.jvm.internal.L.f(this.f41901a, ((A0) obj).f41901a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41901a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("UrlAnnotation(url="), this.f41901a, ')');
    }
}
