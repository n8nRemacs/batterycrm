package com.akita.compose.foundation.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.v;
import com.akita.compose.foundation.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TextIcon.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o {

    /* compiled from: TextIcon.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f63772l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ r f63773m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ v f63774n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.foundation.p f63775o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f63776p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f63777q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, r rVar, v vVar, com.akita.compose.foundation.p pVar, int i12, int i13) {
            super(2);
            this.f63772l = str;
            this.f63773m = rVar;
            this.f63774n = vVar;
            this.f63775o = pVar;
            this.f63776p = i12;
            this.f63777q = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f63776p | 1);
            r rVar = this.f63773m;
            o.a(this.f63772l, rVar, this.f63774n, this.f63775o, a12, iA2, this.f63777q);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k java.lang.String r21, @Y61.k com.akita.compose.foundation.r r22, @Y61.l androidx.compose.ui.v r23, @Y61.l com.akita.compose.foundation.p r24, @Y61.l androidx.compose.runtime.A r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.foundation.ui.o.a(java.lang.String, com.akita.compose.foundation.r, androidx.compose.ui.v, com.akita.compose.foundation.p, androidx.compose.runtime.A, int, int):void");
    }

    @Y61.k
    public static final C22602e b(@Y61.k String str, @Y61.k r rVar) {
        C22602e.b bVar = new C22602e.b(0, 1, null);
        d(bVar, str, rVar);
        return bVar.m();
    }

    public static final void c(@Y61.k C22602e.b bVar, @Y61.k String str, @Y61.k r rVar, long j12) {
        int iL2 = bVar.l(rVar.b(j12));
        try {
            bVar.f(str);
            G0 g02 = G0.f406611a;
        } finally {
            bVar.h(iL2);
        }
    }

    public static void d(C22602e.b bVar, String str, r rVar) {
        T.f39320b.getClass();
        c(bVar, str, rVar, T.f39330l);
    }
}
