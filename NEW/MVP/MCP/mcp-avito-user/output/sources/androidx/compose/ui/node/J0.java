package androidx.compose.ui.node;

import androidx.annotation.RestrictTo;
import androidx.compose.ui.graphics.InterfaceC22264l0;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.input.pointer.InterfaceC22347z;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.platform.F2;
import androidx.compose.ui.platform.InterfaceC22458c;
import androidx.compose.ui.platform.InterfaceC22489j2;
import androidx.compose.ui.platform.InterfaceC22509o2;
import androidx.compose.ui.platform.InterfaceC22544x2;
import androidx.compose.ui.text.font.D;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p0.InterfaceC44967a;
import q0.InterfaceC47176b;

/* compiled from: Owner.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/J0;", "Landroidx/compose/ui/input/pointer/V;", "a", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface J0 extends androidx.compose.ui.input.pointer.V {

    /* renamed from: D1, reason: collision with root package name */
    @Y61.k
    public static final a f40575D1 = a.f40576a;

    /* compiled from: Owner.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/J0$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f40576a = new a();
    }

    /* compiled from: Owner.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/J0$b;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {
        void g();
    }

    static /* synthetic */ I0 e(J0 j02, Y41.p pVar, Y41.a aVar, C22267c c22267c, boolean z12, int i12) {
        if ((i12 & 4) != 0) {
            c22267c = null;
        }
        if ((i12 & 8) != 0) {
            z12 = false;
        }
        return j02.c(pVar, aVar, c22267c, z12);
    }

    @androidx.compose.ui.q
    void b();

    @Y61.k
    I0 c(@Y61.k Y41.p<? super androidx.compose.ui.graphics.M, ? super C22267c, kotlin.G0> pVar, @Y61.k Y41.a<kotlin.G0> aVar, @Y61.l C22267c c22267c, boolean z12);

    @Y61.l
    Object d(@Y61.k Y41.p pVar, @Y61.k ContinuationImpl continuationImpl);

    @Y61.k
    InterfaceC22458c getAccessibilityManager();

    @Y61.l
    androidx.compose.ui.autofill.k getAutofill();

    @Y61.l
    androidx.compose.ui.autofill.p getAutofillManager();

    @Y61.k
    androidx.compose.ui.autofill.s getAutofillTree();

    @Y61.k
    androidx.compose.ui.platform.M0 getClipboard();

    @Y61.k
    androidx.compose.ui.platform.O0 getClipboardManager();

    @Y61.k
    CoroutineContext getCoroutineContext();

    @Y61.k
    androidx.compose.ui.unit.d getDensity();

    @Y61.k
    androidx.compose.ui.draganddrop.c getDragAndDropManager();

    @Y61.k
    androidx.compose.ui.focus.B getFocusOwner();

    @Y61.k
    E.b getFontFamilyResolver();

    @Y61.k
    D.b getFontLoader();

    @Y61.k
    InterfaceC22264l0 getGraphicsContext();

    @Y61.k
    InterfaceC44967a getHapticFeedBack();

    @Y61.k
    InterfaceC47176b getInputModeManager();

    @Y61.k
    LayoutDirection getLayoutDirection();

    @Y61.k
    androidx.compose.ui.modifier.i getModifierLocalManager();

    @Y61.k
    default K0.a getPlacementScope() {
        return androidx.compose.ui.layout.L0.b(this);
    }

    @Y61.k
    InterfaceC22347z getPointerIconService();

    @Y61.k
    androidx.compose.ui.spatial.i getRectManager();

    @Y61.k
    LayoutNode getRoot();

    @Y61.k
    androidx.compose.ui.semantics.w getSemanticsOwner();

    @Y61.k
    P getSharedDrawScope();

    boolean getShowLayoutBounds();

    @Y61.k
    L0 getSnapshotObserver();

    @Y61.k
    InterfaceC22489j2 getSoftwareKeyboardController();

    @Y61.k
    androidx.compose.ui.text.input.Y getTextInputService();

    @Y61.k
    InterfaceC22509o2 getTextToolbar();

    @Y61.k
    InterfaceC22544x2 getViewConfiguration();

    @Y61.k
    F2 getWindowInfo();

    @B
    @RestrictTo
    void setShowLayoutBounds(boolean z12);
}
