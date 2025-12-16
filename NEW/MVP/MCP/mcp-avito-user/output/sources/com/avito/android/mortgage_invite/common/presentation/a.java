package com.avito.android.mortgage_invite.common.presentation;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.H;
import androidx.compose.foundation.layout.I;
import androidx.compose.foundation.layout.K;
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
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.focus.C22218c;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.n;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.adjust.sdk.network.ErrorCodes;
import com.akita.compose.component.input.InputState;
import com.akita.compose.component.input.transformation.k;
import com.akita.compose.component.input.u;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFormItemType;
import com.avito.android.printable_text.PrintableText;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ApplicationContactInfoFormBlock.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_mortgage-invite_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: ApplicationContactInfoFormBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage_invite.common.presentation.a$a, reason: collision with other inner class name */
    public static final class C6124a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y10.a f205541l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ p<ContactInfoFieldId, Boolean, G0> f205542m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ p<ContactInfoFieldId, String, G0> f205543n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f205544o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f205545p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f205546q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6124a(Y10.a aVar, p<? super ContactInfoFieldId, ? super Boolean, G0> pVar, p<? super ContactInfoFieldId, ? super String, G0> pVar2, v vVar, int i12, int i13) {
            super(2);
            this.f205541l = aVar;
            this.f205542m = pVar;
            this.f205543n = pVar2;
            this.f205544o = vVar;
            this.f205545p = i12;
            this.f205546q = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f205545p | 1);
            p<ContactInfoFieldId, Boolean, G0> pVar = this.f205542m;
            a.a(this.f205541l, pVar, this.f205543n, this.f205544o, a12, iA2, this.f205546q);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@k Y10.a aVar, @k p<? super ContactInfoFieldId, ? super Boolean, G0> pVar, @k p<? super ContactInfoFieldId, ? super String, G0> pVar2, @l v vVar, @l A a12, int i12, int i13) {
        B bE2 = a12.E(686521176);
        v vVar2 = (i13 & 8) != 0 ? v.f42878y1 : vVar;
        C20585k.f28659a.getClass();
        C20585k.l lVar = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        i.a aVar2 = InterfaceC22215f.a.f39088n;
        I iA2 = H.a(lVar, aVar2, bE2, 0);
        int i14 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = n.c(bE2, vVar2);
        InterfaceC22413h.f40789C1.getClass();
        Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
        InterfaceC22078i<?> interfaceC22078i = bE2.f37890b;
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar3);
        } else {
            bE2.d();
        }
        p<InterfaceC22413h, InterfaceC22365i0, G0> pVar3 = InterfaceC22413h.a.f40796g;
        R3.b(pVar3, bE2, iA2);
        p<InterfaceC22413h, U, G0> pVar4 = InterfaceC22413h.a.f40795f;
        R3.b(pVar4, bE2, o1S);
        p<InterfaceC22413h, Integer, G0> pVar5 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
            AK.c.y(i14, bE2, i14, pVar5);
        }
        p<InterfaceC22413h, v, G0> pVar6 = InterfaceC22413h.a.f40793d;
        R3.b(pVar6, bE2, vVarC);
        K k12 = K.f28344a;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        v vVar3 = vVar2;
        com.akita.compose.foundation.ui.p.b(aVar.f19258a, com.akita.compose.theme.re23.b.f63988f.f65234e, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
        h.a aVar4 = h.f42849c;
        com.akita.compose.foundation.ui.g.a(16, null, bE2, 6);
        C20585k.j jVarG = C20585k.g(20);
        v.a aVar5 = v.f42878y1;
        I iA3 = H.a(jVarG, aVar2, bE2, 6);
        int i15 = bE2.f37888Q;
        O1 o1S2 = bE2.S();
        v vVarC2 = n.c(bE2, aVar5);
        if (interfaceC22078i == null) {
            C22190v.b();
            throw null;
        }
        bE2.A();
        if (bE2.f37887P) {
            bE2.b(aVar3);
        } else {
            bE2.d();
        }
        R3.b(pVar3, bE2, iA3);
        R3.b(pVar4, bE2, o1S2);
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i15))) {
            AK.c.y(i15, bE2, i15, pVar5);
        }
        R3.b(pVar6, bE2, vVarC2);
        bE2.C(-676059186);
        Iterator<T> it = aVar.f19259b.iterator();
        while (it.hasNext()) {
            b((Y10.b) it.next(), pVar, pVar2, bE2, (i12 & 112) | 8);
        }
        bE2.X(false);
        bE2.X(true);
        bE2.X(true);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C6124a(aVar, pVar, pVar2, vVar3, i12, i13);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(Y10.b bVar, p pVar, p pVar2, A a12, int i12) {
        C22096n c22096n;
        B bE2 = a12.E(-1081129113);
        v.a aVar = v.f42878y1;
        C20585k.f28659a.getClass();
        C20585k.l lVar = C20585k.f28662d;
        InterfaceC22215f.f39074a.getClass();
        I iA2 = H.a(lVar, InterfaceC22215f.a.f39088n, bE2, 0);
        int i13 = bE2.f37888Q;
        O1 o1S = bE2.S();
        v vVarC = n.c(bE2, aVar);
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
        p<InterfaceC22413h, Integer, G0> pVar3 = InterfaceC22413h.a.f40799j;
        if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i13))) {
            AK.c.y(i13, bE2, i13, pVar3);
        }
        R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
        K k12 = K.f28344a;
        String str = bVar.f19264d;
        com.akita.compose.theme.re23.b.f63983a.getClass();
        com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
        com.akita.compose.foundation.ui.p.b(str, iVar.f65239j, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
        h.a aVar3 = h.f42849c;
        com.akita.compose.foundation.ui.g.a(12, null, bE2, 6);
        boolean z12 = bVar.f19271k;
        String str2 = bVar.f19269i;
        String str3 = !z12 ? str2 : null;
        if (str3 == null) {
            str3 = "";
        }
        com.akita.compose.component.input.v f66388c = com.akita.compose.theme.re23.b.l(bE2).getF66388c();
        ContactInfoFormItemType contactInfoFormItemType = ContactInfoFormItemType.f205536b;
        ContactInfoFormItemType contactInfoFormItemType2 = bVar.f19262b;
        if (contactInfoFormItemType2 == contactInfoFormItemType && str2.length() == 0) {
            g.f205560a.getClass();
            c22096n = g.f205561b;
        } else {
            c22096n = null;
        }
        ContactInfoFormItemType contactInfoFormItemType3 = ContactInfoFormItemType.f205538d;
        com.akita.compose.component.input.transformation.k iVar2 = (contactInfoFormItemType2 == contactInfoFormItemType3 && bVar.f19263c) ? new k.i() : contactInfoFormItemType2 == contactInfoFormItemType3 ? k.h.f61825d : k.d.f61820d;
        PrintableText printableText = bVar.f19270j;
        u.b(str3, f66388c, new c(bVar, pVar2), C22218c.a(aVar, new b(bVar, pVar)), bVar.f19265e, false, printableText == null ? InputState.f61668b : InputState.f61669c, false, null, null, iVar2, 0, false, 0, null, c22096n, r.c(1312149016, new e(bVar, pVar2), bE2), null, bE2, 0, 1572864, 162720);
        bE2.C(-1048592119);
        if (printableText != null) {
            com.akita.compose.foundation.ui.g.a(8, null, bE2, 6);
            com.akita.compose.foundation.ui.p.b(printableText.k0((Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b)), iVar.f65244o, null, false, com.akita.compose.theme.re23.b.f63984b.f63880R0.c(bE2), null, 0, 0, false, null, bE2, 0, ErrorCodes.PROTOCOL_EXCEPTION);
        }
        C22039c2 c22039c2N = com.avito.android.actions_sheet.a.n(bE2, false, true);
        if (c22039c2N != null) {
            c22039c2N.f38184d = new f(bVar, pVar, pVar2, aVar, i12);
        }
    }
}
