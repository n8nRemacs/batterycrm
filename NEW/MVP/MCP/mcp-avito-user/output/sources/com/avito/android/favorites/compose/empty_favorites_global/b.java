package com.avito.android.favorites.compose.empty_favorites_global;

import X2.h;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.text.style.i;
import androidx.compose.ui.v;
import com.akita.compose.foundation.r;
import com.avito.android.favorites.InterfaceC30683q0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: EmptyFavoritesGlobal.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_favorites_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b {

    /* compiled from: EmptyFavoritesGlobal.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f156811l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f156812m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f156813n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f156814o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, int i13, Y41.a aVar, v vVar) {
            super(2);
            this.f156811l = aVar;
            this.f156812m = vVar;
            this.f156813n = i12;
            this.f156814o = i13;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, java.lang.Object] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f156813n | 1);
            ?? r02 = this.f156811l;
            v vVar = this.f156812m;
            b.b(iA2, this.f156814o, r02, a12, vVar);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(String str, r rVar, v.a aVar, A a12, int i12) {
        B b12;
        v.a aVar2;
        B bE2 = a12.E(1810160772);
        int i13 = i12 | (bE2.B(str) ? 4 : 2) | (bE2.B(rVar) ? 32 : 16) | 384;
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
            aVar2 = aVar;
            b12 = bE2;
        } else {
            v.a aVar3 = v.f42878y1;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63987e.getClass();
            com.akita.compose.theme.re23.semantic.b.f65954b.getText().getClass();
            long jC2 = h.f18556d.c(bE2);
            i.f42675b.getClass();
            b12 = bE2;
            com.akita.compose.foundation.ui.p.b(str, rVar, aVar3, false, jC2, i.a(i.f42678e), 0, 0, false, null, bE2, i13 & 1022, 968);
            aVar2 = aVar3;
        }
        C22039c2 c22039c2Z = b12.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new com.avito.android.favorites.compose.empty_favorites_global.a(str, rVar, aVar2, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(int r19, int r20, Y41.a r21, androidx.compose.runtime.A r22, androidx.compose.ui.v r23) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorites.compose.empty_favorites_global.b.b(int, int, Y41.a, androidx.compose.runtime.A, androidx.compose.ui.v):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(@k InterfaceC30683q0 interfaceC30683q0, @l v.a aVar, @l A a12, int i12) {
        B bE2 = a12.E(591080341);
        if ((((bE2.B(interfaceC30683q0) ? 4 : 2) | i12 | 48) & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            aVar = v.f42878y1;
            b(48, 0, new c(0, interfaceC30683q0, g.class, "onSearchItemsClick", "onSearchItemsClick()V", 0), bE2, aVar);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(interfaceC30683q0, aVar, i12);
        }
    }
}
