package androidx.compose.ui.platform;

import androidx.compose.ui.node.LayoutNode;
import androidx.core.view.C22808a;
import kotlin.Metadata;

/* compiled from: AndroidComposeView.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/j;", "Landroidx/core/view/a;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22486j extends C22808a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f41468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LayoutNode f41469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f41470f;

    public C22486j(AndroidComposeView androidComposeView, LayoutNode layoutNode, AndroidComposeView androidComposeView2) {
        this.f41468d = androidComposeView;
        this.f41469e = layoutNode;
        this.f41470f = androidComposeView2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    @Override // androidx.core.view.C22808a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r8, androidx.core.view.accessibility.f r9) {
        /*
            r7 = this;
            android.view.View$AccessibilityDelegate r0 = r7.f44991a
            android.view.accessibility.AccessibilityNodeInfo r1 = r9.f44999a
            r0.onInitializeAccessibilityNodeInfo(r8, r1)
            androidx.compose.ui.platform.AndroidComposeView r8 = r7.f41468d
            androidx.compose.ui.platform.r r0 = r8.f41031s
            boolean r2 = r0.v()
            if (r2 == 0) goto L15
            r2 = 0
            r1.setVisibleToUser(r2)
        L15:
            androidx.compose.ui.node.LayoutNode r2 = r7.f41469e
            androidx.compose.ui.node.LayoutNode r3 = r2.K()
        L1b:
            r4 = 0
            if (r3 == 0) goto L2e
            androidx.compose.ui.node.t0 r5 = r3.f40615I
            r6 = 8
            boolean r5 = r5.d(r6)
            if (r5 == 0) goto L29
            goto L2f
        L29:
            androidx.compose.ui.node.LayoutNode r3 = r3.K()
            goto L1b
        L2e:
            r3 = r4
        L2f:
            if (r3 == 0) goto L37
            int r3 = r3.f40627c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
        L37:
            r3 = -1
            if (r4 == 0) goto L4a
            androidx.compose.ui.semantics.w r5 = r8.getSemanticsOwner()
            androidx.compose.ui.semantics.u r5 = r5.a()
            int r6 = r4.intValue()
            int r5 = r5.f41800g
            if (r6 != r5) goto L4e
        L4a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
        L4e:
            int r4 = r4.intValue()
            androidx.compose.ui.platform.AndroidComposeView r5 = r7.f41470f
            r9.f45000b = r4
            r1.setParent(r5, r4)
            int r9 = r2.f40627c
            androidx.collection.x0 r2 = r0.f41537E
            int r2 = r2.b(r9)
            if (r2 == r3) goto L79
            androidx.compose.ui.platform.p0 r4 = r8.getAndroidViewsHandler$ui_release()
            androidx.compose.ui.viewinterop.a r4 = androidx.compose.ui.platform.C22481h2.g(r4, r2)
            if (r4 == 0) goto L71
            r1.setTraversalBefore(r4)
            goto L74
        L71:
            r1.setTraversalBefore(r5, r2)
        L74:
            java.lang.String r2 = r0.f41539G
            androidx.compose.ui.platform.AndroidComposeView.f(r8, r9, r1, r2)
        L79:
            androidx.collection.x0 r2 = r0.f41538F
            int r2 = r2.b(r9)
            if (r2 == r3) goto L97
            androidx.compose.ui.platform.p0 r3 = r8.getAndroidViewsHandler$ui_release()
            androidx.compose.ui.viewinterop.a r3 = androidx.compose.ui.platform.C22481h2.g(r3, r2)
            if (r3 == 0) goto L8f
            r1.setTraversalAfter(r3)
            goto L92
        L8f:
            r1.setTraversalAfter(r5, r2)
        L92:
            java.lang.String r0 = r0.f41540H
            androidx.compose.ui.platform.AndroidComposeView.f(r8, r9, r1, r0)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C22486j.d(android.view.View, androidx.core.view.accessibility.f):void");
    }
}
