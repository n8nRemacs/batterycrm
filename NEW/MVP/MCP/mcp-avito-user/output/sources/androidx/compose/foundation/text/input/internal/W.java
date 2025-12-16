package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.input.C22649o;
import androidx.compose.ui.text.input.InterfaceC22645k;
import kotlin.Metadata;

/* compiled from: HandwritingGesture.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/W;", "Landroidx/compose/ui/text/input/k;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class W implements InterfaceC22645k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22645k[] f31008a;

    public W(InterfaceC22645k[] interfaceC22645kArr) {
        this.f31008a = interfaceC22645kArr;
    }

    @Override // androidx.compose.ui.text.input.InterfaceC22645k
    public final void a(C22649o c22649o) {
        for (InterfaceC22645k interfaceC22645k : this.f31008a) {
            interfaceC22645k.a(c22649o);
        }
    }
}
