package androidx.compose.ui;

import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SensitiveContent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/A;", "Landroidx/compose/ui/v$d;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class A extends v.d {

    /* renamed from: p, reason: collision with root package name */
    public boolean f38809p;

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        if (this.f38809p) {
            ((AndroidComposeView) C22421l.h(this)).m();
            this.f38809p = false;
        }
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        ((A) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false);
    }

    @Y61.k
    public final String toString() {
        return "SensitiveContentNode(_isContentSensitive=false)";
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
    }
}
