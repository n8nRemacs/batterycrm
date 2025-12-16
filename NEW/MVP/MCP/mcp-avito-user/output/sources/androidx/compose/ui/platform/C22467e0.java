package androidx.compose.ui.platform;

import android.view.ActionMode;
import kotlin.Metadata;
import okhttp3.internal.ws.WebSocketProtocol;
import t0.C48451a;
import t0.C48453c;

/* compiled from: AndroidTextToolbar.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/e0;", "Landroidx/compose/ui/platform/o2;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22467e0 implements InterfaceC22509o2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AndroidComposeView f41432a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public ActionMode f41433b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C48453c f41434c = new C48453c(new C22463d0(this), null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public TextToolbarStatus f41435d = TextToolbarStatus.f41280c;

    public C22467e0(@Y61.k AndroidComposeView androidComposeView) {
        this.f41432a = androidComposeView;
    }

    @Override // androidx.compose.ui.platform.InterfaceC22509o2
    public final void a(@Y61.k l0.j jVar, @Y61.l Y41.a<kotlin.G0> aVar, @Y61.l Y41.a<kotlin.G0> aVar2, @Y61.l Y41.a<kotlin.G0> aVar3, @Y61.l Y41.a<kotlin.G0> aVar4) {
        b(jVar, aVar, aVar2, aVar3, aVar4, null);
    }

    @Override // androidx.compose.ui.platform.InterfaceC22509o2
    public final void b(@Y61.k l0.j jVar, @Y61.l Y41.a<kotlin.G0> aVar, @Y61.l Y41.a<kotlin.G0> aVar2, @Y61.l Y41.a<kotlin.G0> aVar3, @Y61.l Y41.a<kotlin.G0> aVar4, @Y61.l Y41.a<kotlin.G0> aVar5) {
        C48453c c48453c = this.f41434c;
        c48453c.f439011b = jVar;
        c48453c.f439012c = aVar;
        c48453c.f439014e = aVar3;
        c48453c.f439013d = aVar2;
        c48453c.f439015f = aVar4;
        c48453c.f439016g = aVar5;
        ActionMode actionMode = this.f41433b;
        if (actionMode != null) {
            actionMode.invalidate();
            return;
        }
        this.f41435d = TextToolbarStatus.f41279b;
        C22513p2 c22513p2 = C22513p2.f41527a;
        C48451a c48451a = new C48451a(c48453c);
        c22513p2.getClass();
        this.f41433b = this.f41432a.startActionMode(c48451a, 1);
    }

    @Override // androidx.compose.ui.platform.InterfaceC22509o2
    @Y61.k
    /* renamed from: getStatus, reason: from getter */
    public final TextToolbarStatus getF41435d() {
        return this.f41435d;
    }

    @Override // androidx.compose.ui.platform.InterfaceC22509o2
    public final void hide() {
        this.f41435d = TextToolbarStatus.f41280c;
        ActionMode actionMode = this.f41433b;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.f41433b = null;
    }
}
