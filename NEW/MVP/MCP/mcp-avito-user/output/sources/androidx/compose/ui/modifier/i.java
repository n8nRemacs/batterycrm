package androidx.compose.ui.modifier;

import androidx.compose.runtime.internal.P;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.node.C22403c;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.v;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import s0.C47949a;

/* compiled from: ModifierLocalManager.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/modifier/i;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AndroidComposeView f40531a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<C22403c> f40532b = new androidx.compose.runtime.collection.e<>(new C22403c[16], 0);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<c<?>> f40533c = new androidx.compose.runtime.collection.e<>(new c[16], 0);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<LayoutNode> f40534d = new androidx.compose.runtime.collection.e<>(new LayoutNode[16], 0);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<c<?>> f40535e = new androidx.compose.runtime.collection.e<>(new c[16], 0);

    /* renamed from: f, reason: collision with root package name */
    public boolean f40536f;

    /* compiled from: ModifierLocalManager.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            androidx.compose.runtime.collection.e<c<?>> eVar;
            androidx.compose.runtime.collection.e<c<?>> eVar2;
            i iVar = i.this;
            int i12 = 0;
            iVar.f40536f = false;
            HashSet hashSet = new HashSet();
            androidx.compose.runtime.collection.e<LayoutNode> eVar3 = iVar.f40534d;
            LayoutNode[] layoutNodeArr = eVar3.f38260b;
            int i13 = eVar3.f38262d;
            int i14 = 0;
            while (true) {
                eVar = iVar.f40535e;
                if (i14 >= i13) {
                    break;
                }
                LayoutNode layoutNode = layoutNodeArr[i14];
                c<?> cVar = eVar.f38260b[i14];
                v.d dVar = layoutNode.f40615I.f40878e;
                if (dVar.f42893o) {
                    i.b(dVar, cVar, hashSet);
                }
                i14++;
            }
            eVar3.g();
            eVar.g();
            androidx.compose.runtime.collection.e<C22403c> eVar4 = iVar.f40532b;
            C22403c[] c22403cArr = eVar4.f38260b;
            int i15 = eVar4.f38262d;
            while (true) {
                eVar2 = iVar.f40533c;
                if (i12 >= i15) {
                    break;
                }
                C22403c c22403c = c22403cArr[i12];
                c<?> cVar2 = eVar2.f38260b[i12];
                if (c22403c.f42893o) {
                    i.b(c22403c, cVar2, hashSet);
                }
                i12++;
            }
            eVar4.g();
            eVar2.g();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((C22403c) it.next()).m2();
            }
            return G0.f406611a;
        }
    }

    public i(@Y61.k AndroidComposeView androidComposeView) {
        this.f40531a = androidComposeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void b(v.d dVar, c cVar, HashSet hashSet) {
        if (!dVar.f42880b.f42893o) {
            C47949a.b("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.e eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
        v.d dVar2 = dVar.f42880b;
        v.d dVar3 = dVar2.f42885g;
        if (dVar3 == null) {
            C22421l.a(eVar, dVar2);
        } else {
            eVar.b(dVar3);
        }
        while (true) {
            int i12 = eVar.f38262d;
            if (i12 == 0) {
                return;
            }
            v.d dVar4 = (v.d) eVar.k(i12 - 1);
            if ((dVar4.f42883e & 32) != 0) {
                for (v.d dVar5 = dVar4; dVar5 != null; dVar5 = dVar5.f42885g) {
                    if ((dVar5.f42882d & 32) != 0) {
                        AbstractC22425n abstractC22425nB = dVar5;
                        ?? eVar2 = 0;
                        while (abstractC22425nB != 0) {
                            if (abstractC22425nB instanceof k) {
                                k kVar = (k) abstractC22425nB;
                                if (kVar instanceof C22403c) {
                                    C22403c c22403c = (C22403c) kVar;
                                    if ((c22403c.f40737p instanceof d) && c22403c.f40740s.contains(cVar)) {
                                        hashSet.add(kVar);
                                    }
                                }
                                if (kVar.c1().a(cVar)) {
                                    break;
                                }
                            } else if ((abstractC22425nB.f42882d & 32) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                                v.d dVar6 = abstractC22425nB.f40861q;
                                int i13 = 0;
                                abstractC22425nB = abstractC22425nB;
                                eVar2 = eVar2;
                                while (dVar6 != null) {
                                    if ((dVar6.f42882d & 32) != 0) {
                                        i13++;
                                        eVar2 = eVar2;
                                        if (i13 == 1) {
                                            abstractC22425nB = dVar6;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                            }
                                            if (abstractC22425nB != 0) {
                                                eVar2.b(abstractC22425nB);
                                                abstractC22425nB = 0;
                                            }
                                            eVar2.b(dVar6);
                                        }
                                    }
                                    dVar6 = dVar6.f42885g;
                                    abstractC22425nB = abstractC22425nB;
                                    eVar2 = eVar2;
                                }
                                if (i13 == 1) {
                                }
                            }
                            abstractC22425nB = C22421l.b(eVar2);
                        }
                    }
                }
            }
            C22421l.a(eVar, dVar4);
        }
    }

    public final void a() {
        if (this.f40536f) {
            return;
        }
        this.f40536f = true;
        this.f40531a.I(new a());
    }
}
