package com.avito.android.favorites.compose.search;

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
import androidx.compose.ui.i;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.R;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: EmptyFavoritesSearch.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/favorites/compose/search/f;", VoiceInfo.STATE, "_avito_favorites_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a {

    /* compiled from: EmptyFavoritesSearch.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.favorites.compose.search.a$a, reason: collision with other inner class name */
    public static final class C4596a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f156873l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f156874m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f156875n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f156876o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f156877p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4596a(String str, String str2, String str3, Y41.a<G0> aVar, int i12) {
            super(2);
            this.f156873l = str;
            this.f156874m = str2;
            this.f156875n = str3;
            this.f156876o = aVar;
            this.f156877p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            a.a(this.f156873l, this.f156874m, this.f156875n, this.f156876o, a12, C22066f2.a(this.f156877p | 1));
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(String str, String str2, String str3, Y41.a<G0> aVar, A a12, int i12) {
        int i13;
        B bE2 = a12.E(1343346752);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(str) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(str2) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(str3) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(aVar) ? 2048 : 1024;
        }
        if ((i13 & 5851) == 1170 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar2 = androidx.compose.ui.v.f42878y1;
            float f12 = 16;
            h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
            androidx.compose.ui.v vVarM = R1.m(aVar2, f12, 70, f12, 0.0f, 8);
            InterfaceC22215f.f39074a.getClass();
            i.a aVar4 = InterfaceC22215f.a.f39089o;
            C20585k.f28659a.getClass();
            I iA2 = H.a(C20585k.f28664f, aVar4, bE2, 54);
            int i14 = bE2.f37888Q;
            O1 o1S = bE2.S();
            androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, vVarM);
            InterfaceC22413h.f40789C1.getClass();
            Y41.a<InterfaceC22413h> aVar5 = InterfaceC22413h.a.f40791b;
            if (bE2.f37890b == null) {
                C22190v.b();
                throw null;
            }
            bE2.A();
            if (bE2.f37887P) {
                bE2.b(aVar5);
            } else {
                bE2.d();
            }
            R3.b(InterfaceC22413h.a.f40796g, bE2, iA2);
            R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
            Y41.p<InterfaceC22413h, Integer, G0> pVar = InterfaceC22413h.a.f40799j;
            if (bE2.f37887P || !L.f(bE2.t(), Integer.valueOf(i14))) {
                AK.c.y(i14, bE2, i14, pVar);
            }
            R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
            K k12 = K.f28344a;
            bE2.C(1598440130);
            String strC = str == null ? u0.i.c(bE2, R.string.search_not_found) : str;
            bE2.X(false);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.i iVar = com.akita.compose.theme.re23.b.f63988f;
            com.akita.compose.foundation.ui.p.b(strC, iVar.f65233d, null, false, 0L, null, 0, 0, false, null, bE2, 0, 1020);
            bE2.C(1598444231);
            if (!(str2 == null || C43066x.K(str2))) {
                String str4 = str2 == null ? "" : str2;
                androidx.compose.ui.text.style.i.f42675b.getClass();
                com.akita.compose.foundation.ui.p.b(str4, iVar.f65240k, C20588k2.v(0.0f, 228, 1, R1.m(aVar2, 0.0f, 4, 0.0f, 0.0f, 13)), false, 0L, androidx.compose.ui.text.style.i.a(androidx.compose.ui.text.style.i.f42678e), 0, 0, false, null, bE2, 384, 984);
            }
            bE2.X(false);
            bE2.C(1598455442);
            if (str3 != null && !C43066x.K(str3)) {
                com.akita.compose.component.button.m.c(str3 == null ? "" : str3, aVar, com.akita.compose.theme.re23.b.c(bE2).X1(), R1.m(aVar2, 0.0f, f12, 0.0f, 0.0f, 13), null, null, null, false, false, null, bE2, ((i13 >> 6) & 112) | 3584, 1008);
            }
            bE2.X(false);
            bE2.X(true);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C4596a(str, str2, str3, aVar, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k com.avito.android.favorites.InterfaceC30683q0 r13, @Y61.l androidx.compose.runtime.A r14, int r15) {
        /*
            r0 = 165438889(0x9dc65a9, float:5.3058674E-33)
            androidx.compose.runtime.B r14 = r14.E(r0)
            boolean r0 = r14.B(r13)
            r1 = 2
            r2 = 4
            if (r0 == 0) goto L11
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            r0 = r0 | r15
            r3 = r0 & 11
            if (r3 != r1) goto L22
            boolean r1 = r14.c()
            if (r1 != 0) goto L1e
            goto L22
        L1e:
            r14.f()
            goto L82
        L22:
            kotlinx.coroutines.flow.n2 r1 = r13.v()
            androidx.compose.runtime.y1 r1 = androidx.compose.runtime.C22126m3.b(r1, r14)
            java.lang.Object r3 = r1.getF42167b()
            com.avito.android.favorites.compose.search.f r3 = (com.avito.android.favorites.compose.search.f) r3
            java.lang.String r3 = r3.f156884d
            java.lang.Object r4 = r1.getF42167b()
            com.avito.android.favorites.compose.search.f r4 = (com.avito.android.favorites.compose.search.f) r4
            java.lang.String r4 = r4.f156885e
            java.lang.Object r1 = r1.getF42167b()
            com.avito.android.favorites.compose.search.f r1 = (com.avito.android.favorites.compose.search.f) r1
            java.lang.String r5 = r1.f156886f
            r1 = 1560161629(0x5cfe2d5d, float:5.7235617E17)
            r14.C(r1)
            r0 = r0 & 14
            r1 = 0
            if (r0 != r2) goto L4f
            r0 = 1
            goto L50
        L4f:
            r0 = r1
        L50:
            java.lang.Object r2 = r14.t()
            if (r0 != 0) goto L5f
            androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
            r0.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r0) goto L71
        L5f:
            com.avito.android.favorites.compose.search.b r2 = new com.avito.android.favorites.compose.search.b
            java.lang.String r11 = "onEmptySearchButtonClick()V"
            r12 = 0
            r7 = 0
            java.lang.Class<com.avito.android.favorites.compose.search.y> r9 = com.avito.android.favorites.compose.search.y.class
            java.lang.String r10 = "onEmptySearchButtonClick"
            r6 = r2
            r8 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r14.H(r2)
        L71:
            kotlin.reflect.i r2 = (kotlin.reflect.i) r2
            r14.X(r1)
            r0 = r2
            Y41.a r0 = (Y41.a) r0
            r6 = 0
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r0
            r5 = r14
            a(r1, r2, r3, r4, r5, r6)
        L82:
            androidx.compose.runtime.c2 r14 = r14.Z()
            if (r14 == 0) goto L8f
            com.avito.android.favorites.compose.search.c r0 = new com.avito.android.favorites.compose.search.c
            r0.<init>(r13, r15)
            r14.f38184d = r0
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorites.compose.search.a.b(com.avito.android.favorites.q0, androidx.compose.runtime.A, int):void");
    }
}
