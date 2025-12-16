package androidx.compose.ui.layout;

import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.spatial.l;
import androidx.compose.ui.spatial.l.a;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: OnLayoutRectChangedModifier.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/z0;", "Landroidx/compose/ui/v$d;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22398z0 extends v.d {

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public l.a f40526p;

    public C22398z0() {
        throw null;
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        k2();
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        l.a aVar = this.f40526p;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void k2() {
        l.a aVar = this.f40526p;
        if (aVar != null) {
            aVar.a();
        }
        LayoutNode layoutNodeG = C22421l.g(this);
        int i12 = layoutNodeG.f40627c;
        androidx.compose.ui.spatial.l lVar = androidx.compose.ui.node.S.a(layoutNodeG).getRectManager().f41871b;
        lVar.getClass();
        l.a aVar2 = lVar.new a(i12, 0L, this);
        androidx.collection.A0<l.a> a02 = lVar.f41881a;
        l.a aVarB = a02.b(i12);
        if (aVarB == null) {
            a02.h(i12, aVar2);
            aVarB = aVar2;
        }
        l.a aVar3 = aVarB;
        if (aVar3 != aVar2) {
            while (true) {
                l.a aVar4 = aVar3.f41890d;
                if (aVar4 == null) {
                    break;
                } else {
                    aVar3 = aVar4;
                }
            }
            aVar3.f41890d = aVar2;
        }
        this.f40526p = aVar2;
    }
}
