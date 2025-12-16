package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import androidx.collection.B0;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.InterfaceC22232q;
import androidx.compose.ui.focus.g0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import j.X;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidAutofillManager.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/autofill/e;", "Landroidx/compose/ui/autofill/p;", "Landroidx/compose/ui/semantics/p;", "Landroidx/compose/ui/focus/q;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes.dex */
public final class e extends p implements androidx.compose.ui.semantics.p, InterfaceC22232q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final y f38876a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.semantics.w f38877b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AndroidComposeView f38878c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.spatial.i f38879d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f38880e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Rect f38881f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AutofillId f38882g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final B0 f38883h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f38884i;

    public e(@Y61.k y yVar, @Y61.k androidx.compose.ui.semantics.w wVar, @Y61.k AndroidComposeView androidComposeView, @Y61.k androidx.compose.ui.spatial.i iVar, @Y61.k String str) {
        this.f38876a = yVar;
        this.f38877b = wVar;
        this.f38878c = androidComposeView;
        this.f38879d = iVar;
        this.f38880e = str;
        androidComposeView.setImportantForAutofill(1);
        AutofillId autofillId = androidComposeView.getAutofillId();
        if (autofillId == null) {
            throw H.s("Required value was null.");
        }
        this.f38882g = autofillId;
        this.f38883h = new B0(0, 1, null);
    }

    @Override // androidx.compose.ui.focus.InterfaceC22232q
    public final void a(@Y61.l g0 g0Var, @Y61.l FocusTargetNode focusTargetNode) {
        LayoutNode layoutNodeG;
        androidx.compose.ui.semantics.l lVarQ;
        LayoutNode layoutNodeG2;
        androidx.compose.ui.semantics.l lVarQ2;
        if (g0Var != null && (layoutNodeG2 = C22421l.g(g0Var)) != null && (lVarQ2 = layoutNodeG2.Q()) != null && f.a(lVarQ2)) {
            this.f38876a.b(this.f38878c, layoutNodeG2.f40627c);
        }
        if (focusTargetNode == null || (layoutNodeG = C22421l.g(focusTargetNode)) == null || (lVarQ = layoutNodeG.Q()) == null || !f.a(lVarQ)) {
            return;
        }
        int i12 = layoutNodeG.f40627c;
        this.f38879d.f41870a.b(i12, new b(this, i12));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // androidx.compose.ui.semantics.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@Y61.k androidx.compose.ui.node.LayoutNode r11, @Y61.l androidx.compose.ui.semantics.l r12) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.autofill.e.b(androidx.compose.ui.node.LayoutNode, androidx.compose.ui.semantics.l):void");
    }

    public final void c(@Y61.k LayoutNode layoutNode) {
        this.f38879d.f41870a.b(layoutNode.f40627c, new d(this, layoutNode));
    }
}
