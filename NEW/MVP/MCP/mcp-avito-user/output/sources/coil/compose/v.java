package coil.compose;

import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.drawscope.g;
import androidx.compose.ui.layout.InterfaceC22374n;
import coil.compose.C27242f;
import coil.compose.p;
import kotlin.Metadata;

/* compiled from: SingletonAsyncImage.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-compose-singleton_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class v {
    @InterfaceC22132o
    public static final void a(@Y61.l Object obj, @Y61.l String str, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.ui.graphics.painter.e eVar, @Y61.l androidx.compose.ui.graphics.painter.e eVar2, @Y61.l androidx.compose.ui.graphics.painter.e eVar3, @Y61.l Y41.l lVar, @Y61.l Y41.l lVar2, @Y61.l Y41.l lVar3, @Y61.l InterfaceC22215f interfaceC22215f, @Y61.l InterfaceC22374n interfaceC22374n, @Y61.l androidx.compose.ui.graphics.F f12, @Y61.l androidx.compose.runtime.A a12, int i12, int i13, int i14) {
        InterfaceC22215f interfaceC22215f2;
        InterfaceC22374n interfaceC22374n2;
        a12.I(1693837359);
        androidx.compose.ui.graphics.painter.e eVar4 = (i14 & 8) != 0 ? null : eVar;
        androidx.compose.ui.graphics.painter.e eVar5 = (i14 & 16) != 0 ? null : eVar2;
        androidx.compose.ui.graphics.painter.e eVar6 = (i14 & 32) != 0 ? eVar5 : eVar3;
        Y41.l lVar4 = (i14 & 64) != 0 ? null : lVar;
        Y41.l lVar5 = (i14 & 128) != 0 ? null : lVar2;
        Y41.l lVar6 = (i14 & 256) != 0 ? null : lVar3;
        if ((i14 & 512) != 0) {
            InterfaceC22215f.f39074a.getClass();
            interfaceC22215f2 = InterfaceC22215f.a.f39080f;
        } else {
            interfaceC22215f2 = interfaceC22215f;
        }
        if ((i14 & 1024) != 0) {
            InterfaceC22374n.f40491a.getClass();
            interfaceC22374n2 = InterfaceC22374n.a.f40494c;
        } else {
            interfaceC22374n2 = interfaceC22374n;
        }
        androidx.compose.ui.graphics.F f13 = (i14 & 4096) != 0 ? null : f12;
        androidx.compose.ui.graphics.drawscope.g.f39490B1.getClass();
        int i15 = g.a.f39493c;
        p.a aVar = p.f58261a;
        coil.j jVarA = r.a(t.f58264a, a12);
        int i16 = i12 << 3;
        int i17 = (i12 & 112) | 2392584 | (i16 & 7168) | (i16 & 29360128) | (i16 & 234881024) | (i16 & 1879048192);
        int i18 = i13 << 3;
        int i19 = (i18 & 896) | ((i12 >> 27) & 14) | (i18 & 112) | (i18 & 7168) | (57344 & i18) | (i18 & 458752) | (i18 & 3670016);
        a12.I(-1481548872);
        int i22 = i19 << 15;
        C27241e.a(new j(obj, aVar, jVarA), str, vVar, G.b(eVar4, eVar5, eVar6), G.a(lVar4, lVar5, lVar6), interfaceC22215f2, interfaceC22374n2, 1.0f, f13, i15, a12, (i17 & 112) | ((i17 >> 3) & 896) | (458752 & i22) | (i22 & 3670016) | (29360128 & i22) | (i22 & 234881024) | (i22 & 1879048192), (i19 >> 15) & 14);
        a12.O();
        a12.O();
    }

    @InterfaceC22132o
    public static final void b(@Y61.l Object obj, @Y61.l String str, @Y61.l androidx.compose.ui.v vVar, @Y61.l androidx.compose.ui.i iVar, @Y61.l InterfaceC22374n interfaceC22374n, @Y61.l androidx.compose.ui.graphics.F f12, @Y61.l androidx.compose.runtime.A a12, int i12, int i13) {
        androidx.compose.ui.i iVar2;
        InterfaceC22374n interfaceC22374n2;
        a12.I(1451072229);
        androidx.compose.ui.v vVar2 = (i13 & 4) != 0 ? androidx.compose.ui.v.f42878y1 : vVar;
        C27242f.f58194v.getClass();
        Y41.l<C27242f.c, C27242f.c> lVar = C27242f.f58195w;
        if ((i13 & 32) != 0) {
            InterfaceC22215f.f39074a.getClass();
            iVar2 = InterfaceC22215f.a.f39080f;
        } else {
            iVar2 = iVar;
        }
        if ((i13 & 64) != 0) {
            InterfaceC22374n.f40491a.getClass();
            interfaceC22374n2 = InterfaceC22374n.a.f40494c;
        } else {
            interfaceC22374n2 = interfaceC22374n;
        }
        androidx.compose.ui.graphics.F f13 = (i13 & 256) != 0 ? null : f12;
        androidx.compose.ui.graphics.drawscope.g.f39490B1.getClass();
        int i14 = g.a.f39493c;
        p.a aVar = p.f58261a;
        coil.j jVarA = r.a(t.f58264a, a12);
        int i15 = i12 << 3;
        int i16 = (i12 & 112) | 520 | (i15 & 7168) | (i15 & 57344) | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128) | (i15 & 234881024) | (i15 & 1879048192);
        a12.I(2032051394);
        j jVar = new j(obj, aVar, jVarA);
        int i17 = i16 >> 3;
        C27241e.a(jVar, str, vVar2, lVar, null, iVar2, interfaceC22374n2, 1.0f, f13, i14, a12, (i16 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752) | (i17 & 3670016) | (29360128 & i17) | (i17 & 234881024) | ((((i12 >> 27) & 14) << 27) & 1879048192), 0);
        a12.O();
        a12.O();
    }
}
