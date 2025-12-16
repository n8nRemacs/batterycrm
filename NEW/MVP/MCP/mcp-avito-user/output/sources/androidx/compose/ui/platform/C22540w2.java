package androidx.compose.ui.platform;

import androidx.view.Lifecycle;
import kotlin.Metadata;

/* compiled from: ViewCompositionStrategy.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.w2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22540w2 {
    public static final Y41.a a(AbstractC22450a abstractC22450a, Lifecycle lifecycle) {
        if (lifecycle.getF46705d().compareTo(Lifecycle.State.f46679b) > 0) {
            M11.d dVar = new M11.d(abstractC22450a, 1);
            lifecycle.a(dVar);
            return new C22536v2(lifecycle, dVar);
        }
        throw new IllegalStateException(("Cannot configure " + abstractC22450a + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }
}
