package androidx.compose.foundation.text;

import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.ui.graphics.InterfaceC22242a0;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.unit.C22712b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: BasicText.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/text/e;", "displayedText", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class L {

    /* compiled from: BasicText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f30451l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f30452m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.text.x0 f30453n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<androidx.compose.ui.text.o0, kotlin.G0> f30454o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f30455p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f30456q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f30457r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f30458s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22242a0 f30459t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f30460u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f30461v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, androidx.compose.ui.v vVar, androidx.compose.ui.text.x0 x0Var, Y41.l<? super androidx.compose.ui.text.o0, kotlin.G0> lVar, int i12, boolean z12, int i13, int i14, InterfaceC22242a0 interfaceC22242a0, int i15, int i16) {
            super(2);
            this.f30451l = str;
            this.f30452m = vVar;
            this.f30453n = x0Var;
            this.f30454o = lVar;
            this.f30455p = i12;
            this.f30456q = z12;
            this.f30457r = i13;
            this.f30458s = i14;
            this.f30459t = interfaceC22242a0;
            this.f30460u = i15;
            this.f30461v = i16;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f30460u | 1);
            int i12 = this.f30457r;
            L.d(this.f30451l, this.f30452m, this.f30453n, this.f30454o, this.f30455p, this.f30456q, i12, this.f30458s, this.f30459t, a12, iA2, this.f30461v);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BasicText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C22602e f30462l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f30463m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.text.x0 f30464n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<androidx.compose.ui.text.o0, kotlin.G0> f30465o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f30466p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f30467q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f30468r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f30469s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Map<String, C20857d1> f30470t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22242a0 f30471u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f30472v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int f30473w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(C22602e c22602e, androidx.compose.ui.v vVar, androidx.compose.ui.text.x0 x0Var, Y41.l<? super androidx.compose.ui.text.o0, kotlin.G0> lVar, int i12, boolean z12, int i13, int i14, Map<String, C20857d1> map, InterfaceC22242a0 interfaceC22242a0, int i15, int i16) {
            super(2);
            this.f30462l = c22602e;
            this.f30463m = vVar;
            this.f30464n = x0Var;
            this.f30465o = lVar;
            this.f30466p = i12;
            this.f30467q = z12;
            this.f30468r = i13;
            this.f30469s = i14;
            this.f30470t = map;
            this.f30471u = interfaceC22242a0;
            this.f30472v = i15;
            this.f30473w = i16;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f30472v | 1);
            C22602e c22602e = this.f30462l;
            int i12 = this.f30469s;
            L.b(c22602e, this.f30463m, this.f30464n, this.f30465o, this.f30466p, this.f30467q, this.f30468r, i12, this.f30470t, this.f30471u, a12, iA2, this.f30473w);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k androidx.compose.ui.text.C22602e r37, @Y61.l androidx.compose.ui.v r38, @Y61.l androidx.compose.ui.text.x0 r39, @Y61.l Y41.l r40, int r41, boolean r42, int r43, int r44, @Y61.l java.util.Map r45, @Y61.l androidx.compose.ui.graphics.InterfaceC22242a0 r46, @Y61.l androidx.compose.runtime.A r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.L.a(androidx.compose.ui.text.e, androidx.compose.ui.v, androidx.compose.ui.text.x0, Y41.l, int, boolean, int, int, java.util.Map, androidx.compose.ui.graphics.a0, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    @kotlin.InterfaceC42830m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.text.C22602e r25, androidx.compose.ui.v r26, androidx.compose.ui.text.x0 r27, Y41.l r28, int r29, boolean r30, int r31, int r32, java.util.Map r33, androidx.compose.ui.graphics.InterfaceC22242a0 r34, androidx.compose.runtime.A r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.L.b(androidx.compose.ui.text.e, androidx.compose.ui.v, androidx.compose.ui.text.x0, Y41.l, int, boolean, int, int, java.util.Map, androidx.compose.ui.graphics.a0, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@Y61.k java.lang.String r39, @Y61.l androidx.compose.ui.v r40, @Y61.l androidx.compose.ui.text.x0 r41, @Y61.l Y41.l r42, int r43, boolean r44, int r45, int r46, @Y61.l androidx.compose.ui.graphics.InterfaceC22242a0 r47, @Y61.l androidx.compose.runtime.A r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.L.c(java.lang.String, androidx.compose.ui.v, androidx.compose.ui.text.x0, Y41.l, int, boolean, int, int, androidx.compose.ui.graphics.a0, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0125  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    @kotlin.InterfaceC42830m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(java.lang.String r24, androidx.compose.ui.v r25, androidx.compose.ui.text.x0 r26, Y41.l r27, int r28, boolean r29, int r30, int r31, androidx.compose.ui.graphics.InterfaceC22242a0 r32, androidx.compose.runtime.A r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.L.d(java.lang.String, androidx.compose.ui.v, androidx.compose.ui.text.x0, Y41.l, int, boolean, int, int, androidx.compose.ui.graphics.a0, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x038e  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(androidx.compose.ui.v r32, androidx.compose.ui.text.C22602e r33, Y41.l r34, boolean r35, java.util.Map r36, androidx.compose.ui.text.x0 r37, int r38, boolean r39, int r40, int r41, androidx.compose.ui.text.font.E.b r42, androidx.compose.foundation.text.modifiers.k r43, androidx.compose.ui.graphics.InterfaceC22242a0 r44, Y41.l r45, androidx.compose.runtime.A r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.L.e(androidx.compose.ui.v, androidx.compose.ui.text.e, Y41.l, boolean, java.util.Map, androidx.compose.ui.text.x0, int, boolean, int, int, androidx.compose.ui.text.font.E$b, androidx.compose.foundation.text.modifiers.k, androidx.compose.ui.graphics.a0, Y41.l, androidx.compose.runtime.A, int, int):void");
    }

    public static final ArrayList f(Y41.a aVar, List list) {
        d3 d3Var;
        if (!((Boolean) aVar.invoke()).booleanValue()) {
            return null;
        }
        new e3();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            InterfaceC22363h0 interfaceC22363h0 = (InterfaceC22363h0) list.get(i12);
            Ba1.B b12 = ((f3) interfaceC22363h0.getF40763y()).f30709b;
            androidx.compose.ui.text.o0 o0Var = (androidx.compose.ui.text.o0) ((C22082i3) ((S2) b12.f1488c).f30522a).getF42167b();
            if (o0Var == null) {
                d3Var = new d3(0, 0, Y2.f30625l);
            } else {
                C22602e.C1684e c1684eC = S2.c((C22602e.C1684e) b12.f1489d, o0Var);
                if (c1684eC == null) {
                    d3Var = new d3(0, 0, Z2.f30632l);
                } else {
                    androidx.compose.ui.unit.s sVarB = androidx.compose.ui.unit.t.b(o0Var.k(c1684eC.f42139b, c1684eC.f42140c).w());
                    d3Var = new d3(sVarB.d(), sVarB.b(), new X2(sVarB));
                }
            }
            C22712b.f42842b.getClass();
            int i13 = d3Var.f30692a;
            int i14 = d3Var.f30693b;
            arrayList.add(new kotlin.Q(interfaceC22363h0.I(C22712b.a.b(i13, i13, i14, i14)), d3Var.f30694c));
        }
        return arrayList;
    }

    public static final androidx.compose.ui.v g(androidx.compose.ui.v vVar, C22602e c22602e, androidx.compose.ui.text.x0 x0Var, Y41.l lVar, int i12, boolean z12, int i13, int i14, E.b bVar, List list, Y41.l lVar2, androidx.compose.foundation.text.modifiers.k kVar, InterfaceC22242a0 interfaceC22242a0, Y41.l lVar3) {
        if (kVar == null) {
            return vVar.d0(androidx.compose.ui.v.f42878y1).d0(new TextAnnotatedStringElement(c22602e, x0Var, bVar, lVar, i12, z12, i13, i14, list, lVar2, null, interfaceC22242a0, null, lVar3, null));
        }
        return vVar.d0(kVar.f31674g).d0(new SelectableTextAnnotatedStringElement(c22602e, x0Var, bVar, lVar, i12, z12, i13, i14, list, lVar2, kVar, interfaceC22242a0, null, null));
    }
}
