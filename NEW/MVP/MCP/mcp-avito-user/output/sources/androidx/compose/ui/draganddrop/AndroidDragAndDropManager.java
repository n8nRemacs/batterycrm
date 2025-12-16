package androidx.compose.ui.draganddrop;

import android.view.DragEvent;
import android.view.View;
import androidx.collection.AbstractC20248z;
import androidx.collection.C20203c;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.Z0;
import androidx.compose.ui.v;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidDragAndDropManager.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draganddrop/AndroidDragAndDropManager;", "Landroid/view/View$OnDragListener;", "Landroidx/compose/ui/draganddrop/c;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidDragAndDropManager implements View.OnDragListener, c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.q<q, l0.n, Y41.l<? super androidx.compose.ui.graphics.drawscope.g, G0>, Boolean> f38988b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e f38989c = new e(null, null, 3, null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C20203c<o> f38990d = new C20203c<>(0, 1, null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final AndroidDragAndDropManager$modifier$1 f38991e = new AbstractC22430p0<e>() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        @Override // androidx.compose.ui.node.AbstractC22430p0
        public final v.d a() {
            return this.f38995b.f38989c;
        }

        @Override // androidx.compose.ui.node.AbstractC22430p0
        public final /* bridge */ /* synthetic */ void b(v.d dVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.f38995b.f38989c.hashCode();
        }
    };

    /* compiled from: AndroidDragAndDropManager.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.a f38992l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l0.a aVar) {
            super(0);
            this.f38992l = aVar;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f38992l.f406838b);
        }
    }

    /* compiled from: AndroidDragAndDropManager.android.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/draganddrop/AndroidDragAndDropManager$b", "Landroidx/compose/ui/draganddrop/n;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l0.a f38993a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AndroidDragAndDropManager f38994b;

        public b(l0.a aVar, AndroidDragAndDropManager androidDragAndDropManager) {
            this.f38993a = aVar;
            this.f38994b = androidDragAndDropManager;
        }

        @Override // androidx.compose.ui.draganddrop.n
        public final boolean a(q qVar, long j12, Y41.l<? super androidx.compose.ui.graphics.drawscope.g, G0> lVar) {
            boolean zBooleanValue = this.f38994b.f38988b.invoke(qVar, l0.n.a(j12), lVar).booleanValue();
            this.f38993a.f406838b = zBooleanValue;
            return zBooleanValue;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public AndroidDragAndDropManager(@Y61.k Y41.q<? super q, ? super l0.n, ? super Y41.l<? super androidx.compose.ui.graphics.drawscope.g, G0>, Boolean> qVar) {
        this.f38988b = qVar;
    }

    @Override // androidx.compose.ui.draganddrop.c
    public final void a(@Y61.k e eVar, long j12) {
        l0.a aVar = new l0.a();
        b bVar = new b(aVar, this);
        a aVar2 = new a(aVar);
        eVar.getClass();
        h hVar = new h(j12, C22421l.g(eVar).f40615I.f40875b, bVar, aVar2);
        if (hVar.invoke(eVar) != TraversableNode.Companion.TraverseDescendantsAction.f40695b) {
            return;
        }
        Z0.c(eVar, hVar);
    }

    @Override // androidx.compose.ui.draganddrop.c
    public final boolean b(@Y61.k e eVar) {
        return this.f38990d.contains(eVar);
    }

    @Override // androidx.compose.ui.draganddrop.c
    public final void c(@Y61.k e eVar) {
        this.f38990d.add(eVar);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(@Y61.k View view, @Y61.k DragEvent dragEvent) {
        androidx.compose.ui.draganddrop.b bVar = new androidx.compose.ui.draganddrop.b(dragEvent);
        int action = dragEvent.getAction();
        C20203c<o> c20203c = this.f38990d;
        e eVar = this.f38989c;
        switch (action) {
            case 1:
                eVar.getClass();
                l0.a aVar = new l0.a();
                f fVar = new f(bVar, eVar, aVar);
                if (fVar.invoke(eVar) == TraversableNode.Companion.TraverseDescendantsAction.f40695b) {
                    Z0.c(eVar, fVar);
                }
                boolean z12 = aVar.f406838b;
                Iterator<o> it = c20203c.iterator();
                while (true) {
                    AbstractC20248z abstractC20248z = (AbstractC20248z) it;
                    if (!abstractC20248z.hasNext()) {
                        break;
                    } else {
                        ((o) abstractC20248z.next()).R(bVar);
                    }
                }
            case 2:
                eVar.D1(bVar);
                break;
            case 4:
                eVar.m0(bVar);
                c20203c.clear();
                break;
            case 5:
                eVar.w0(bVar);
                break;
            case 6:
                eVar.T(bVar);
                break;
        }
        return false;
    }
}
