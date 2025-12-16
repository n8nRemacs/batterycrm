package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.N0;
import kotlin.Metadata;

/* compiled from: FocusOwner.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/B;", "Landroidx/compose/ui/focus/r;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface B extends r {
    boolean a(@Y61.k KeyEvent keyEvent);

    @Y61.l
    /* renamed from: b */
    FocusTargetNode getF39110l();

    @Y61.k
    /* renamed from: c */
    FocusOwnerImpl$modifier$1 getF39107i();

    boolean d();

    void f(@Y61.l FocusTargetNode focusTargetNode);

    boolean g(@Y61.k KeyEvent keyEvent, @Y61.k Y41.a<Boolean> aVar);

    @Y61.l
    l0.j getFocusRect();

    boolean i();

    void j(@Y61.k N n12);

    boolean k(int i12, boolean z12, boolean z13);

    @Y61.k
    N0<InterfaceC22232q> l();

    @Y61.k
    /* renamed from: m */
    k0 getF39106h();

    void n();

    void o(@Y61.k InterfaceC22224i interfaceC22224i);

    boolean p(@Y61.k androidx.compose.ui.input.rotary.d dVar, @Y61.k Y41.a<Boolean> aVar);

    void q(@Y61.k FocusTargetNode focusTargetNode);

    @Y61.k
    FocusStateImpl r();

    void s();

    @Y61.l
    Boolean t(int i12, @Y61.l l0.j jVar, @Y61.k Y41.l<? super FocusTargetNode, Boolean> lVar);
}
