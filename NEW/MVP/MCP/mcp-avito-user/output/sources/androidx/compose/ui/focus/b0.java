package androidx.compose.ui.focus;

import kotlin.Metadata;

/* compiled from: FocusRestorer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b0 {

    /* compiled from: FocusRestorer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Object> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ FocusTargetNode f39158l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FocusTargetNode focusTargetNode) {
            super(0);
            this.f39158l = focusTargetNode;
        }

        @Override // Y41.a
        public final Object invoke() {
            return Integer.valueOf(this.f39158l.f39130v);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0045, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(@Y61.k androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            int r0 = r10.f39130v
            if (r0 != 0) goto L1e
            androidx.compose.runtime.J3 r0 = androidx.compose.runtime.saveable.t.f38604a
            java.lang.Object r0 = androidx.compose.ui.node.C22417j.a(r10, r0)
            androidx.compose.runtime.saveable.r r0 = (androidx.compose.runtime.saveable.r) r0
            if (r0 == 0) goto L1e
            java.lang.String r1 = "previouslyFocusedChildHash"
            java.lang.Object r0 = r0.f(r1)
            if (r0 == 0) goto L1e
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r10.f39130v = r0
        L1e:
            int r0 = r10.f39130v
            r1 = 0
            if (r0 != 0) goto L24
            return r1
        L24:
            androidx.compose.ui.v$d r0 = r10.f42880b
            boolean r0 = r0.f42893o
            if (r0 != 0) goto L2f
            java.lang.String r0 = "visitChildren called on an unattached node"
            s0.C47949a.b(r0)
        L2f:
            androidx.compose.runtime.collection.e r0 = new androidx.compose.runtime.collection.e
            r2 = 16
            androidx.compose.ui.v$d[] r3 = new androidx.compose.ui.v.d[r2]
            r0.<init>(r3, r1)
            androidx.compose.ui.v$d r3 = r10.f42880b
            androidx.compose.ui.v$d r4 = r3.f42885g
            if (r4 != 0) goto L42
            androidx.compose.ui.node.C22421l.a(r0, r3)
            goto L45
        L42:
            r0.b(r4)
        L45:
            int r3 = r0.f38262d
            if (r3 == 0) goto Lc8
            int r3 = r3 + (-1)
            java.lang.Object r3 = r0.k(r3)
            androidx.compose.ui.v$d r3 = (androidx.compose.ui.v.d) r3
            int r4 = r3.f42883e
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L5b
            androidx.compose.ui.node.C22421l.a(r0, r3)
            goto L45
        L5b:
            if (r3 == 0) goto L45
            int r4 = r3.f42882d
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto Lc5
            r4 = 0
            r5 = r4
        L65:
            if (r3 == 0) goto L45
            boolean r6 = r3 instanceof androidx.compose.ui.focus.FocusTargetNode
            r7 = 1
            if (r6 == 0) goto L8a
            androidx.compose.ui.focus.FocusTargetNode r3 = (androidx.compose.ui.focus.FocusTargetNode) r3
            boolean r6 = r3.f42893o
            if (r6 == 0) goto Lc0
            androidx.compose.ui.node.LayoutNode r6 = androidx.compose.ui.node.C22421l.g(r3)
            int r6 = r6.f40633i
            int r8 = r10.f39130v
            if (r6 != r8) goto Lc0
            boolean r10 = a(r3)
            if (r10 != 0) goto L88
            boolean r10 = androidx.compose.ui.focus.g0.u0(r3)
            if (r10 == 0) goto L89
        L88:
            r1 = r7
        L89:
            return r1
        L8a:
            int r6 = r3.f42882d
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto Lc0
            boolean r6 = r3 instanceof androidx.compose.ui.node.AbstractC22425n
            if (r6 == 0) goto Lc0
            r6 = r3
            androidx.compose.ui.node.n r6 = (androidx.compose.ui.node.AbstractC22425n) r6
            androidx.compose.ui.v$d r6 = r6.f40861q
            r8 = r1
        L9a:
            if (r6 == 0) goto Lbd
            int r9 = r6.f42882d
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto Lba
            int r8 = r8 + 1
            if (r8 != r7) goto La8
            r3 = r6
            goto Lba
        La8:
            if (r5 != 0) goto Lb1
            androidx.compose.runtime.collection.e r5 = new androidx.compose.runtime.collection.e
            androidx.compose.ui.v$d[] r9 = new androidx.compose.ui.v.d[r2]
            r5.<init>(r9, r1)
        Lb1:
            if (r3 == 0) goto Lb7
            r5.b(r3)
            r3 = r4
        Lb7:
            r5.b(r6)
        Lba:
            androidx.compose.ui.v$d r6 = r6.f42885g
            goto L9a
        Lbd:
            if (r8 != r7) goto Lc0
            goto L65
        Lc0:
            androidx.compose.ui.v$d r3 = androidx.compose.ui.node.C22421l.b(r5)
            goto L65
        Lc5:
            androidx.compose.ui.v$d r3 = r3.f42885g
            goto L5b
        Lc8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.b0.a(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x002d, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(@Y61.k androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            androidx.compose.ui.focus.FocusStateImpl r0 = r10.q0()
            boolean r0 = r0.b()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            androidx.compose.ui.v$d r0 = r10.f42880b
            boolean r0 = r0.f42893o
            if (r0 != 0) goto L17
            java.lang.String r0 = "visitChildren called on an unattached node"
            s0.C47949a.b(r0)
        L17:
            androidx.compose.runtime.collection.e r0 = new androidx.compose.runtime.collection.e
            r2 = 16
            androidx.compose.ui.v$d[] r3 = new androidx.compose.ui.v.d[r2]
            r0.<init>(r3, r1)
            androidx.compose.ui.v$d r3 = r10.f42880b
            androidx.compose.ui.v$d r4 = r3.f42885g
            if (r4 != 0) goto L2a
            androidx.compose.ui.node.C22421l.a(r0, r3)
            goto L2d
        L2a:
            r0.b(r4)
        L2d:
            int r3 = r0.f38262d
            if (r3 == 0) goto Lbb
            int r3 = r3 + (-1)
            java.lang.Object r3 = r0.k(r3)
            androidx.compose.ui.v$d r3 = (androidx.compose.ui.v.d) r3
            int r4 = r3.f42883e
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L43
            androidx.compose.ui.node.C22421l.a(r0, r3)
            goto L2d
        L43:
            if (r3 == 0) goto L2d
            int r4 = r3.f42882d
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto Lb8
            r4 = 0
            r5 = r4
        L4d:
            if (r3 == 0) goto L2d
            boolean r6 = r3 instanceof androidx.compose.ui.focus.FocusTargetNode
            r7 = 1
            if (r6 == 0) goto L7d
            androidx.compose.ui.focus.FocusTargetNode r3 = (androidx.compose.ui.focus.FocusTargetNode) r3
            androidx.compose.ui.focus.FocusStateImpl r6 = r3.q0()
            boolean r6 = r6.b()
            if (r6 == 0) goto Lb3
            androidx.compose.ui.node.LayoutNode r0 = androidx.compose.ui.node.C22421l.g(r3)
            int r0 = r0.f40633i
            r10.f39130v = r0
            androidx.compose.runtime.J3 r0 = androidx.compose.runtime.saveable.t.f38604a
            java.lang.Object r0 = androidx.compose.ui.node.C22417j.a(r10, r0)
            androidx.compose.runtime.saveable.r r0 = (androidx.compose.runtime.saveable.r) r0
            if (r0 == 0) goto L7c
            androidx.compose.ui.focus.b0$a r1 = new androidx.compose.ui.focus.b0$a
            r1.<init>(r10)
            java.lang.String r10 = "previouslyFocusedChildHash"
            r0.d(r10, r1)
        L7c:
            return r7
        L7d:
            int r6 = r3.f42882d
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto Lb3
            boolean r6 = r3 instanceof androidx.compose.ui.node.AbstractC22425n
            if (r6 == 0) goto Lb3
            r6 = r3
            androidx.compose.ui.node.n r6 = (androidx.compose.ui.node.AbstractC22425n) r6
            androidx.compose.ui.v$d r6 = r6.f40861q
            r8 = r1
        L8d:
            if (r6 == 0) goto Lb0
            int r9 = r6.f42882d
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto Lad
            int r8 = r8 + 1
            if (r8 != r7) goto L9b
            r3 = r6
            goto Lad
        L9b:
            if (r5 != 0) goto La4
            androidx.compose.runtime.collection.e r5 = new androidx.compose.runtime.collection.e
            androidx.compose.ui.v$d[] r9 = new androidx.compose.ui.v.d[r2]
            r5.<init>(r9, r1)
        La4:
            if (r3 == 0) goto Laa
            r5.b(r3)
            r3 = r4
        Laa:
            r5.b(r6)
        Lad:
            androidx.compose.ui.v$d r6 = r6.f42885g
            goto L8d
        Lb0:
            if (r8 != r7) goto Lb3
            goto L4d
        Lb3:
            androidx.compose.ui.v$d r3 = androidx.compose.ui.node.C22421l.b(r5)
            goto L4d
        Lb8:
            androidx.compose.ui.v$d r3 = r3.f42885g
            goto L43
        Lbb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.b0.b(androidx.compose.ui.focus.FocusTargetNode):boolean");
    }
}
