package com.avito.android.oauth.presentation.ui;

import android.net.Uri;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.InterfaceC21084v1;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.deep_linking.links.PassportProfilesListLink;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l40.InterfaceC43542a;

/* compiled from: Common.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_oauth_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: Common.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.oauth.presentation.ui.a$a, reason: collision with other inner class name */
    public static final class C6218a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f208389l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6218a(Y41.l<? super InterfaceC43542a, G0> lVar) {
            super(0);
            this.f208389l = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f208389l.invoke(InterfaceC43542a.d.f413452a);
            return G0.f406611a;
        }
    }

    /* compiled from: Common.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f208390l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f208391m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(int i12, Y41.l lVar) {
            super(2);
            this.f208390l = (N) lVar;
            this.f208391m = i12;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f208391m | 1);
            a.a(this.f208390l, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: Common.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f208392l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super InterfaceC43542a, G0> lVar) {
            super(0);
            this.f208392l = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f208392l.invoke(new InterfaceC43542a.i(new PassportProfilesListLink(false, 1, null)));
            return G0.f406611a;
        }
    }

    /* compiled from: Common.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.oauth.repository.a f208393l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ N f208394m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f208395n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(com.avito.android.oauth.repository.a aVar, Y41.l<? super InterfaceC43542a, G0> lVar, int i12) {
            super(2);
            this.f208393l = aVar;
            this.f208394m = (N) lVar;
            this.f208395n = i12;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f208395n | 1);
            ?? r02 = this.f208394m;
            a.b(this.f208393l, r02, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: Common.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f208396l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List<String> f208397m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, List<String> list, int i12) {
            super(2);
            this.f208396l = str;
            this.f208397m = list;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(65);
            a.c(this.f208396l, this.f208397m, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k Y41.l<? super l40.InterfaceC43542a, kotlin.G0> r10, @Y61.l androidx.compose.runtime.A r11, int r12) {
        /*
            r0 = -382843021(0xffffffffe92e4773, float:-1.3168156E25)
            androidx.compose.runtime.B r11 = r11.E(r0)
            r0 = r12 & 14
            r1 = 2
            r2 = 4
            if (r0 != 0) goto L18
            boolean r0 = r11.u(r10)
            if (r0 == 0) goto L15
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            r0 = r0 | r12
            goto L19
        L18:
            r0 = r12
        L19:
            r3 = r0 & 11
            if (r3 != r1) goto L28
            boolean r1 = r11.c()
            if (r1 != 0) goto L24
            goto L28
        L24:
            r11.f()
            goto L71
        L28:
            r1 = 983265985(0x3a9b72c1, float:0.0011859761)
            r11.C(r1)
            r0 = r0 & 14
            r1 = 0
            if (r0 != r2) goto L35
            r0 = 1
            goto L36
        L35:
            r0 = r1
        L36:
            java.lang.Object r2 = r11.t()
            if (r0 != 0) goto L45
            androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
            r0.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r0) goto L4d
        L45:
            com.avito.android.oauth.presentation.ui.a$a r2 = new com.avito.android.oauth.presentation.ui.a$a
            r2.<init>(r10)
            r11.H(r2)
        L4d:
            r3 = r2
            Y41.a r3 = (Y41.a) r3
            r11.X(r1)
            com.akita.compose.theme.re23.b r0 = com.akita.compose.theme.re23.b.f63983a
            r0.getClass()
            com.akita.compose.theme.re23.e r0 = com.akita.compose.theme.re23.b.f63985c
            r0.getClass()
            int r4 = com.akita.compose.theme.re23.e.f64237O3
            com.avito.android.oauth.presentation.ui.b r0 = com.avito.android.oauth.presentation.ui.b.f208398a
            r0.getClass()
            androidx.compose.runtime.internal.n r6 = com.avito.android.oauth.presentation.ui.b.f208399b
            r2 = 0
            r5 = 0
            r1 = 0
            r8 = 196608(0x30000, float:2.75506E-40)
            r9 = 19
            r7 = r11
            com.akita.compose.component.navbar.t.c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L71:
            androidx.compose.runtime.c2 r11 = r11.Z()
            if (r11 == 0) goto L7e
            com.avito.android.oauth.presentation.ui.a$b r0 = new com.avito.android.oauth.presentation.ui.a$b
            r0.<init>(r12, r10)
            r11.f38184d = r0
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.oauth.presentation.ui.a.a(Y41.l, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k com.avito.android.oauth.repository.a aVar, @Y61.k Y41.l<? super InterfaceC43542a, G0> lVar, @Y61.l A a12, int i12) {
        float f12;
        com.akita.compose.theme.re23.a aVar2;
        boolean z12;
        B bE2 = a12.E(-331761774);
        v.a aVar3 = v.f42878y1;
        h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
        float f13 = 32;
        v vVarA = androidx.compose.ui.draw.k.a(C20588k2.f(aVar3, 48), androidx.compose.foundation.shape.o.a(f13));
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.a aVar5 = com.akita.compose.theme.re23.b.f63984b;
        v vVarB = androidx.compose.foundation.A.b(vVarA, aVar5.f63973w1.c(bE2), Y0.f39346a);
        bE2.C(436711132);
        Object objT = bE2.t();
        A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = androidx.compose.foundation.interaction.l.a();
            bE2.H(objT);
        }
        androidx.compose.foundation.interaction.m mVar = (androidx.compose.foundation.interaction.m) objT;
        bE2.X(false);
        InterfaceC21084v1 interfaceC21084v1D = com.akita.compose.foundation.n.d(0.0f, 3, aVar5.f63936k0.c(bE2), false);
        bE2.C(436716531);
        boolean z13 = (((i12 & 112) ^ 48) > 32 && bE2.B(lVar)) || (i12 & 48) == 32;
        Object objT2 = bE2.t();
        if (z13 || objT2 == c1651a) {
            objT2 = new c(lVar);
            bE2.H(objT2);
        }
        bE2.X(false);
        float f14 = 8;
        v vVarI = R1.i(C21086w0.b(vVarB, mVar, interfaceC21084v1D, false, null, (Y41.a) objT2, 28), f14);
        InterfaceC22215f.f39074a.getClass();
        i.b bVar = InterfaceC22215f.a.f39086l;
        C20585k.f28659a.getClass();
        C20568f2 c20568f2A = C20563e2.a(C20585k.f28660b, bVar, bE2, 48);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = androidx.compose.ui.n.c(bE2, vVarI);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar6 = InterfaceC22413h.a.f40791b;
        if (bE2.f37890b == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar6);
        } else {
            bE2.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        bE2.C(-1970755333);
        Object objT3 = bE2.t();
        if (objT3 == c1651a) {
            Image image = aVar.f208458b;
            objT3 = image != null ? image.findUri(32, 32) : null;
            bE2.H(objT3);
        }
        Uri uri = (Uri) objT3;
        bE2.X(false);
        bE2.C(-1970752155);
        if (uri == null) {
            aVar2 = aVar5;
            z12 = false;
            f12 = f14;
        } else {
            f12 = f14;
            aVar2 = aVar5;
            z12 = false;
            coil.compose.v.b(uri, "", androidx.compose.ui.draw.k.a(C20588k2.o(aVar3, f13), androidx.compose.foundation.shape.o.a(f13)), null, null, null, bE2, 8, 4088);
        }
        bE2.X(z12);
        v vVarK = R1.k(f12, 0.0f, 2, aVar3);
        com.akita.compose.foundation.r rVar = com.akita.compose.theme.re23.b.f63988f.f65240k;
        androidx.compose.ui.text.style.i.f42675b.getClass();
        com.akita.compose.foundation.ui.p.b(aVar.f208457a, rVar, vVarK, false, 0L, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), 0, 0, false, null, bE2, 384, 984);
        com.akita.compose.theme.re23.b.f63985c.getClass();
        com.akita.compose.foundation.ui.e.a(u0.e.a(com.akita.compose.theme.re23.e.f64509e0, 0, bE2), "", null, aVar2.f63938l, bE2, 8, 4);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(aVar, lVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(@Y61.k String str, @Y61.k List<String> list, @Y61.l A a12, int i12) {
        B bE2 = a12.E(688541901);
        v.a aVar = v.f42878y1;
        C20585k.f28659a.getClass();
        C20585k.l lVar = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = androidx.compose.ui.n.c(bE2, aVar);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar2 = InterfaceC22413h.a.f40791b;
        if (bE2.f37890b == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar2);
        } else {
            bE2.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        K k12 = K.f28344a;
        String strC = u0.i.c(bE2, R.string.oauth_scope_dialog_title);
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
        com.akita.compose.foundation.ui.p.b(strC, iVar.f65233d, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
        float f12 = 8;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        com.akita.compose.foundation.ui.g.a(f12, null, bE2, 6);
        com.akita.compose.foundation.ui.p.b(u0.i.b(R.string.oauth_scope_dialog_subtitle_pattern, new Object[]{str}, bE2), iVar.f65240k, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
        bE2.C(1919943496);
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            String strB = u0.i.b(R.string.oauth_scope_dialog_element_marker, new Object[]{(String) it.next()}, bE2);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            ArrayList arrayList2 = arrayList;
            com.akita.compose.foundation.ui.p.b(strB, com.akita.compose.theme.re23.b.f63988f.f65240k, R1.m(v.f42878y1, 0.0f, f12, 0.0f, 0.0f, 13), false, com.akita.compose.theme.re23.b.f63984b.f63918e0.c(bE2), null, 0, 0, false, null, bE2, 384, 1000);
            arrayList2.add(G0.f406611a);
            arrayList = arrayList2;
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new e(str, list, i12);
        }
    }
}
