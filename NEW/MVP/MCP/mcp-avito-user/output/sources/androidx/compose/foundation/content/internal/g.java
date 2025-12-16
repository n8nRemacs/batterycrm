package androidx.compose.foundation.content.internal;

import Y41.l;
import android.view.DragEvent;
import androidx.compose.foundation.content.g;
import androidx.compose.foundation.content.internal.b;
import androidx.compose.ui.draganddrop.o;
import androidx.compose.ui.platform.K0;
import androidx.compose.ui.platform.L0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ReceiveContentDragAndDropNode.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/content/internal/g;", "Landroidx/compose/ui/draganddrop/o;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f26991b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l<androidx.compose.ui.draganddrop.b, G0> f26992c;

    public g(b bVar, l lVar) {
        this.f26991b = bVar;
        this.f26992c = lVar;
    }

    @Override // androidx.compose.ui.draganddrop.o
    public final void R(androidx.compose.ui.draganddrop.b bVar) {
        b.a aVar = this.f26991b.f26985b;
        aVar.f26986a = 0;
        b.this.f26984a.getClass();
        throw null;
    }

    @Override // androidx.compose.ui.draganddrop.o
    public final void T(androidx.compose.ui.draganddrop.b bVar) {
        this.f26991b.f26985b.b();
    }

    @Override // androidx.compose.ui.draganddrop.o
    public final boolean a0(androidx.compose.ui.draganddrop.b bVar) {
        this.f26992c.invoke(bVar);
        DragEvent dragEvent = bVar.f38999a;
        K0 k02 = new K0(dragEvent.getClipData());
        dragEvent.getClipDescription();
        L0 l02 = new L0();
        g.a.f26980b.getClass();
        this.f26991b.f26985b.c(new androidx.compose.foundation.content.g(k02, l02, g.a.f26981c, null, 8, null));
        throw null;
    }

    @Override // androidx.compose.ui.draganddrop.o
    public final void m0(androidx.compose.ui.draganddrop.b bVar) {
        b.this.f26984a.getClass();
        throw null;
    }

    @Override // androidx.compose.ui.draganddrop.o
    public final void w0(androidx.compose.ui.draganddrop.b bVar) {
        this.f26991b.f26985b.a();
    }
}
