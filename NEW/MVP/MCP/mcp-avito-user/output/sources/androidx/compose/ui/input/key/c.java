package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: KeyEvent.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/input/key/c;", "", "nativeKeyEvent", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final KeyEvent f40068a;

    private /* synthetic */ c(KeyEvent keyEvent) {
        this.f40068a = keyEvent;
    }

    public static final /* synthetic */ c a(KeyEvent keyEvent) {
        return new c(keyEvent);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return L.f(this.f40068a, ((c) obj).f40068a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40068a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f40068a + ')';
    }
}
