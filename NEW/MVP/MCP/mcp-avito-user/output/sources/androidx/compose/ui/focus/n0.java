package androidx.compose.ui.focus;

import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

/* compiled from: FocusTraversal.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n0 {

    /* compiled from: FocusTraversal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutDirection layoutDirection = LayoutDirection.f42838b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                FocusStateImpl focusStateImpl = FocusStateImpl.f39118b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                FocusStateImpl focusStateImpl2 = FocusStateImpl.f39118b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                FocusStateImpl focusStateImpl3 = FocusStateImpl.f39118b;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0055, code lost:
    
        continue;
     */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetNode a(@Y61.k androidx.compose.ui.focus.FocusTargetNode r9) {
        /*
            boolean r0 = androidx.compose.ui.l.f40323d
            r1 = 0
            if (r0 == 0) goto L19
            androidx.compose.ui.node.J0 r9 = androidx.compose.ui.node.C22421l.h(r9)
            androidx.compose.ui.focus.B r9 = r9.getFocusOwner()
            androidx.compose.ui.focus.FocusTargetNode r9 = r9.getF39110l()
            if (r9 == 0) goto L18
            boolean r0 = r9.f42893o
            if (r0 == 0) goto L18
            r1 = r9
        L18:
            return r1
        L19:
            androidx.compose.ui.focus.FocusStateImpl r0 = r9.q0()
            int r0 = r0.ordinal()
            if (r0 == 0) goto Lc2
            r2 = 1
            if (r0 == r2) goto L33
            r2 = 2
            if (r0 == r2) goto Lc2
            r9 = 3
            if (r0 != r9) goto L2d
            return r1
        L2d:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L33:
            androidx.compose.ui.v$d r0 = r9.f42880b
            boolean r0 = r0.f42893o
            if (r0 != 0) goto L3e
            java.lang.String r0 = "visitChildren called on an unattached node"
            s0.C47949a.b(r0)
        L3e:
            androidx.compose.runtime.collection.e r0 = new androidx.compose.runtime.collection.e
            r3 = 16
            androidx.compose.ui.v$d[] r4 = new androidx.compose.ui.v.d[r3]
            r5 = 0
            r0.<init>(r4, r5)
            androidx.compose.ui.v$d r9 = r9.f42880b
            androidx.compose.ui.v$d r4 = r9.f42885g
            if (r4 != 0) goto L52
            androidx.compose.ui.node.C22421l.a(r0, r9)
            goto L55
        L52:
            r0.b(r4)
        L55:
            int r9 = r0.f38262d
            if (r9 == 0) goto Lc1
            int r9 = r9 + (-1)
            java.lang.Object r9 = r0.k(r9)
            androidx.compose.ui.v$d r9 = (androidx.compose.ui.v.d) r9
            int r4 = r9.f42883e
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L6b
            androidx.compose.ui.node.C22421l.a(r0, r9)
            goto L55
        L6b:
            if (r9 == 0) goto L55
            int r4 = r9.f42882d
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto Lbe
            r4 = r1
        L74:
            if (r9 == 0) goto L55
            boolean r6 = r9 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r6 == 0) goto L83
            androidx.compose.ui.focus.FocusTargetNode r9 = (androidx.compose.ui.focus.FocusTargetNode) r9
            androidx.compose.ui.focus.FocusTargetNode r9 = a(r9)
            if (r9 == 0) goto Lb9
            return r9
        L83:
            int r6 = r9.f42882d
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto Lb9
            boolean r6 = r9 instanceof androidx.compose.ui.node.AbstractC22425n
            if (r6 == 0) goto Lb9
            r6 = r9
            androidx.compose.ui.node.n r6 = (androidx.compose.ui.node.AbstractC22425n) r6
            androidx.compose.ui.v$d r6 = r6.f40861q
            r7 = r5
        L93:
            if (r6 == 0) goto Lb6
            int r8 = r6.f42882d
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto Lb3
            int r7 = r7 + 1
            if (r7 != r2) goto La1
            r9 = r6
            goto Lb3
        La1:
            if (r4 != 0) goto Laa
            androidx.compose.runtime.collection.e r4 = new androidx.compose.runtime.collection.e
            androidx.compose.ui.v$d[] r8 = new androidx.compose.ui.v.d[r3]
            r4.<init>(r8, r5)
        Laa:
            if (r9 == 0) goto Lb0
            r4.b(r9)
            r9 = r1
        Lb0:
            r4.b(r6)
        Lb3:
            androidx.compose.ui.v$d r6 = r6.f42885g
            goto L93
        Lb6:
            if (r7 != r2) goto Lb9
            goto L74
        Lb9:
            androidx.compose.ui.v$d r9 = androidx.compose.ui.node.C22421l.b(r4)
            goto L74
        Lbe:
            androidx.compose.ui.v$d r9 = r9.f42885g
            goto L6b
        Lc1:
            return r1
        Lc2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.n0.a(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    @Y61.k
    public static final l0.j b(@Y61.k FocusTargetNode focusTargetNode) {
        l0.j jVarP;
        AbstractC22443w0 abstractC22443w0 = focusTargetNode.f42887i;
        if (abstractC22443w0 != null && (jVarP = androidx.compose.ui.layout.B.c(abstractC22443w0).P(abstractC22443w0, false)) != null) {
            return jVarP;
        }
        l0.j.f413388e.getClass();
        return l0.j.f413389f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0026, code lost:
    
        continue;
     */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetNode c(@Y61.k androidx.compose.ui.focus.FocusTargetNode r9) {
        /*
            androidx.compose.ui.v$d r0 = r9.f42880b
            boolean r0 = r0.f42893o
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            if (r0 != 0) goto Lf
            java.lang.String r0 = "visitChildren called on an unattached node"
            s0.C47949a.b(r0)
        Lf:
            androidx.compose.runtime.collection.e r0 = new androidx.compose.runtime.collection.e
            r2 = 16
            androidx.compose.ui.v$d[] r3 = new androidx.compose.ui.v.d[r2]
            r4 = 0
            r0.<init>(r3, r4)
            androidx.compose.ui.v$d r9 = r9.f42880b
            androidx.compose.ui.v$d r3 = r9.f42885g
            if (r3 != 0) goto L23
            androidx.compose.ui.node.C22421l.a(r0, r9)
            goto L26
        L23:
            r0.b(r3)
        L26:
            int r9 = r0.f38262d
            if (r9 == 0) goto La3
            int r9 = r9 + (-1)
            java.lang.Object r9 = r0.k(r9)
            androidx.compose.ui.v$d r9 = (androidx.compose.ui.v.d) r9
            int r3 = r9.f42883e
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3c
            androidx.compose.ui.node.C22421l.a(r0, r9)
            goto L26
        L3c:
            if (r9 == 0) goto L26
            int r3 = r9.f42882d
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La0
            r3 = r1
        L45:
            if (r9 == 0) goto L26
            boolean r5 = r9 instanceof androidx.compose.ui.focus.FocusTargetNode
            r6 = 1
            if (r5 == 0) goto L65
            androidx.compose.ui.focus.FocusTargetNode r9 = (androidx.compose.ui.focus.FocusTargetNode) r9
            androidx.compose.ui.v$d r5 = r9.f42880b
            boolean r5 = r5.f42893o
            if (r5 == 0) goto L9b
            androidx.compose.ui.focus.FocusStateImpl r5 = r9.q0()
            int r5 = r5.ordinal()
            if (r5 == 0) goto L64
            if (r5 == r6) goto L64
            r6 = 2
            if (r5 == r6) goto L64
            goto L9b
        L64:
            return r9
        L65:
            int r5 = r9.f42882d
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L9b
            boolean r5 = r9 instanceof androidx.compose.ui.node.AbstractC22425n
            if (r5 == 0) goto L9b
            r5 = r9
            androidx.compose.ui.node.n r5 = (androidx.compose.ui.node.AbstractC22425n) r5
            androidx.compose.ui.v$d r5 = r5.f40861q
            r7 = r4
        L75:
            if (r5 == 0) goto L98
            int r8 = r5.f42882d
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L95
            int r7 = r7 + 1
            if (r7 != r6) goto L83
            r9 = r5
            goto L95
        L83:
            if (r3 != 0) goto L8c
            androidx.compose.runtime.collection.e r3 = new androidx.compose.runtime.collection.e
            androidx.compose.ui.v$d[] r8 = new androidx.compose.ui.v.d[r2]
            r3.<init>(r8, r4)
        L8c:
            if (r9 == 0) goto L92
            r3.b(r9)
            r9 = r1
        L92:
            r3.b(r5)
        L95:
            androidx.compose.ui.v$d r5 = r5.f42885g
            goto L75
        L98:
            if (r7 != r6) goto L9b
            goto L45
        L9b:
            androidx.compose.ui.v$d r9 = androidx.compose.ui.node.C22421l.b(r3)
            goto L45
        La0:
            androidx.compose.ui.v$d r9 = r9.f42885g
            goto L3c
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.n0.c(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean d(@Y61.k FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        AbstractC22443w0 abstractC22443w0;
        LayoutNode layoutNode2;
        AbstractC22443w0 abstractC22443w02 = focusTargetNode.f42887i;
        return (abstractC22443w02 == null || (layoutNode = abstractC22443w02.f40909n) == null || !layoutNode.r() || (abstractC22443w0 = focusTargetNode.f42887i) == null || (layoutNode2 = abstractC22443w0.f40909n) == null || !layoutNode2.m()) ? false : true;
    }
}
