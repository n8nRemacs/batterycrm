package androidx.compose.ui.node;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.v;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OnPositionedDispatcher.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/G0;", "", "<init>", "()V", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<LayoutNode> f40572a = new androidx.compose.runtime.collection.e<>(new LayoutNode[16], 0);

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public LayoutNode[] f40573b;

    /* compiled from: OnPositionedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/node/G0$a;", "", "<init>", "()V", "", "MinArraySize", "I", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: OnPositionedDispatcher.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/G0$a$a;", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.node.G0$a$a, reason: collision with other inner class name */
        public static final class C1668a implements Comparator<LayoutNode> {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C1668a f40574b = new C1668a();

            @Override // java.util.Comparator
            public final int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
                LayoutNode layoutNode3 = layoutNode;
                LayoutNode layoutNode4 = layoutNode2;
                int iG2 = kotlin.jvm.internal.L.g(layoutNode4.f40643s, layoutNode3.f40643s);
                return iG2 != 0 ? iG2 : kotlin.jvm.internal.L.g(layoutNode3.hashCode(), layoutNode4.hashCode());
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.v$d] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void a(LayoutNode layoutNode) {
        if (layoutNode.f40616J.f40681d == LayoutNode.LayoutState.f40655f && !layoutNode.F() && !layoutNode.G() && !layoutNode.f40625S && layoutNode.r()) {
            v.d dVar = layoutNode.f40615I.f40878e;
            if ((dVar.f42883e & 256) != 0) {
                while (dVar != null) {
                    if ((dVar.f42882d & 256) != 0) {
                        AbstractC22425n abstractC22425nB = dVar;
                        ?? eVar = 0;
                        while (abstractC22425nB != 0) {
                            if (abstractC22425nB instanceof InterfaceC22442w) {
                                InterfaceC22442w interfaceC22442w = (InterfaceC22442w) abstractC22425nB;
                                interfaceC22442w.P(C22421l.e(interfaceC22442w, 256));
                            } else if ((abstractC22425nB.f42882d & 256) != 0 && (abstractC22425nB instanceof AbstractC22425n)) {
                                v.d dVar2 = abstractC22425nB.f40861q;
                                int i12 = 0;
                                abstractC22425nB = abstractC22425nB;
                                eVar = eVar;
                                while (dVar2 != null) {
                                    if ((dVar2.f42882d & 256) != 0) {
                                        i12++;
                                        eVar = eVar;
                                        if (i12 == 1) {
                                            abstractC22425nB = dVar2;
                                        } else {
                                            if (eVar == 0) {
                                                eVar = new androidx.compose.runtime.collection.e(new v.d[16], 0);
                                            }
                                            if (abstractC22425nB != 0) {
                                                eVar.b(abstractC22425nB);
                                                abstractC22425nB = 0;
                                            }
                                            eVar.b(dVar2);
                                        }
                                    }
                                    dVar2 = dVar2.f42885g;
                                    abstractC22425nB = abstractC22425nB;
                                    eVar = eVar;
                                }
                                if (i12 == 1) {
                                }
                            }
                            abstractC22425nB = C22421l.b(eVar);
                        }
                    }
                    if ((dVar.f42883e & 256) == 0) {
                        break;
                    } else {
                        dVar = dVar.f42885g;
                    }
                }
            }
        }
        layoutNode.f40624R = false;
        androidx.compose.runtime.collection.e<LayoutNode> eVarO = layoutNode.O();
        LayoutNode[] layoutNodeArr = eVarO.f38260b;
        int i13 = eVarO.f38262d;
        for (int i14 = 0; i14 < i13; i14++) {
            a(layoutNodeArr[i14]);
        }
    }
}
