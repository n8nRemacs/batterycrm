package com.avito.android.interior_photos_block.compose;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import android.content.res.Configuration;
import android.net.Uri;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.C20563e2;
import androidx.compose.foundation.layout.C20568f2;
import androidx.compose.foundation.layout.C20576h2;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
import androidx.compose.foundation.shape.o;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22078i;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.O1;
import androidx.compose.runtime.R3;
import androidx.compose.runtime.U;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35829k2;
import iO.C41325d;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: InteriorPhotos.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002*L\b\u0002\u0010\u0006\"\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00002\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0000¨\u0006\u0007"}, d2 = {"Lkotlin/Function3;", "", "Lcom/avito/android/remote/model/Image;", "", "", "Lkotlin/G0;", "ClickListener", "_avito_interior-photos-block_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {

    /* compiled from: InteriorPhotos.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C41325d f173025l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ q<List<Image>, Integer, String, G0> f173026m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C41325d c41325d, q<? super List<Image>, ? super Integer, ? super String, G0> qVar, int i12) {
            super(2);
            this.f173025l = c41325d;
            this.f173026m = qVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            e.c(this.f173025l, this.f173026m, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k List list, @k q qVar, @l v vVar, @l A a12, int i12) {
        B bE2 = a12.E(1899939262);
        int i13 = (((Configuration) bE2.o(AndroidCompositionLocals_androidKt.f41068a)).screenWidthDp - 38) / 2;
        v vVarW = C20588k2.w(C20588k2.d(vVar, 1.0f), null, 3);
        C20585k.f28659a.getClass();
        C20585k.C1589k c1589k = C20585k.f28660b;
        InterfaceC22215f.f39074a.getClass();
        C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
        int i14 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = n.c(bE2, vVarW);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
        if (bE2.f37890b == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar);
        } else {
            bE2.d();
        }
        R3.b(InterfaceC22413h.a.f40796g, bE2, c20568f2A);
        R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
        p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        v.a aVar2 = v.f42878y1;
        float f12 = 16;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        float f13 = 6;
        b(i13, 140, list, 0, qVar, androidx.compose.ui.draw.k.a(aVar2, o.b(f12, f13, f13, f12)), bE2, 3632);
        com.akita.compose.foundation.ui.g.b(f13, null, bE2, 6, 2);
        b(i13, 140, list, 1, qVar, androidx.compose.ui.draw.k.a(aVar2, o.b(f13, f12, f12, f13)), bE2, 3632);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new com.avito.android.interior_photos_block.compose.a(list, qVar, vVar, i12);
        }
    }

    @InterfaceC22132o
    public static final void b(int i12, int i13, List list, int i14, q qVar, v vVar, A a12, int i15) {
        B bE2 = a12.E(-159383915);
        Uri uriC = C35829k2.b((Image) list.get(i14), i12, i13, 0.0f, 1, 44).c(d.f173024b);
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        v vVarC = C21086w0.c(C20588k2.f(C20588k2.t(vVar, i12), i13), false, null, null, new c(qVar, list, i14, uriC), 7);
        if (uriC != null) {
            InterfaceC22374n.f40491a.getClass();
            coil.compose.v.b(uriC, "Фото интерьера салона", vVarC, null, InterfaceC22374n.a.f40493b, null, bE2, 1572920, 4024);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12, i13, list, i14, qVar, vVar, i15);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(@k C41325d c41325d, @k q<? super List<Image>, ? super Integer, ? super String, G0> qVar, @l A a12, int i12) {
        B bE2 = a12.E(-382156163);
        int i13 = (bE2.B(c41325d) ? 4 : 2) | i12 | (bE2.u(qVar) ? 32 : 16);
        if ((i13 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            v vVarW = C20588k2.w(C20588k2.d(v.f42878y1, 1.0f), null, 3);
            C20585k.f28659a.getClass();
            C20585k.l lVar = C20585k.f28662d;
            InterfaceC22215f.f39074a.getClass();
            I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            v vVarC = n.c(bE2, vVarW);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            f(c41325d.f398514b, bE2, 8);
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.foundation.ui.g.a(12, null, bE2, 6);
            bE2.C(1583871078);
            List<Image> list = c41325d.f398513a;
            if (!list.isEmpty()) {
                d(list, qVar, bE2, (i13 & 112) | 8);
            }
            bE2.X(false);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(c41325d, qVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void d(List list, q qVar, A a12, int i12) {
        B bE2 = a12.E(-1347982841);
        v.a aVar = v.f42878y1;
        if (list.size() == 1) {
            bE2.C(1579987531);
            e(list, qVar, aVar, bE2, 8);
            bE2.X(false);
        } else if (list.size() == 2) {
            bE2.C(1580085770);
            a(list, qVar, aVar, bE2, 8);
            bE2.X(false);
        } else if (list.size() >= 3) {
            bE2.C(1580185001);
            g(list, qVar, aVar, bE2, 8);
            bE2.X(false);
        } else {
            bE2.C(1580259184);
            bE2.X(false);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(list, qVar, aVar, i12);
        }
    }

    @InterfaceC22132o
    public static final void e(@k List list, @k q qVar, @l v vVar, @l A a12, int i12) {
        B bE2 = a12.E(-626110534);
        int i13 = ((Configuration) bE2.o(AndroidCompositionLocals_androidKt.f41068a)).screenWidthDp - 32;
        float f12 = 16;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        b(i13, 188, list, 0, qVar, androidx.compose.ui.draw.k.a(vVar, o.b(f12, f12, f12, f12)), bE2, 3632);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new g(list, qVar, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void f(AttributedText attributedText, A a12, int i12) {
        B bE2 = a12.E(-125801248);
        v.a aVar = v.f42878y1;
        if (attributedText != null) {
            com.avito.android.lib.compose.design.component.attributedtext.a.b(attributedText, aVar, R.attr.textH25, null, h.f173033l, 0, bE2, 24584, 40);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new i(attributedText, aVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void g(@k List list, @k q qVar, @l v vVar, @l A a12, int i12) {
        B bE2 = a12.E(-196763801);
        int i13 = ((Configuration) bE2.o(AndroidCompositionLocals_androidKt.f41068a)).screenWidthDp - 264;
        v vVarW = C20588k2.w(C20588k2.d(vVar, 1.0f), null, 3);
        C20585k.f28659a.getClass();
        C20585k.C1589k c1589k = C20585k.f28660b;
        InterfaceC22215f.f39074a.getClass();
        C20568f2 c20568f2A = C20563e2.a(c1589k, InterfaceC22215f.a.f39085k, bE2, 0);
        int i14 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = n.c(bE2, vVarW);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar);
        } else {
            bE2.d();
        }
        p<InterfaceC22413h, InterfaceC22365i0, G0> pVar = InterfaceC22413h.a.f40796g;
        R3.b(pVar, bE2, c20568f2A);
        p<InterfaceC22413h, U, G0> pVar2 = InterfaceC22413h.a.f40795f;
        R3.b(pVar2, bE2, o1S);
        p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar3);
        }
        p<InterfaceC22413h, v, G0> pVar4 = InterfaceC22413h.a.f40793d;
        R3.b(pVar4, bE2, vVarC);
        C20576h2 c20576h2 = C20576h2.f28641a;
        v.a aVar2 = v.f42878y1;
        float f12 = 16;
        h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
        float f13 = 6;
        b(226, 188, list, 0, qVar, androidx.compose.ui.draw.k.a(aVar2, o.b(f12, f13, f13, f12)), bE2, 3638);
        com.akita.compose.foundation.ui.g.b(f13, null, bE2, 6, 2);
        v vVarD = C20588k2.d(C20588k2.f(aVar2, 188), 1.0f);
        I iA2 = H.a(C20585k.f28662d, InterfaceC22215f.a.f39088n, bE2, 0);
        int i15 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        v vVarC2 = n.c(bE2, vVarD);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar);
        } else {
            bE2.d();
        }
        R3.b(pVar, bE2, iA2);
        R3.b(pVar2, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
            AK.c.y(i15, bE2, i15, pVar3);
        }
        R3.b(pVar4, bE2, vVarC2);
        K k12 = K.f28344a;
        b(i13, 91, list, 1, qVar, androidx.compose.ui.draw.k.a(aVar2, o.b(f13, f12, f13, f13)), bE2, 3632);
        com.akita.compose.foundation.ui.g.a(f13, null, bE2, 6);
        b(i13, 91, list, 2, qVar, androidx.compose.ui.draw.k.a(aVar2, o.b(f13, f13, f12, f13)), bE2, 3632);
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, true, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new j(list, qVar, vVar, i12);
        }
    }
}
