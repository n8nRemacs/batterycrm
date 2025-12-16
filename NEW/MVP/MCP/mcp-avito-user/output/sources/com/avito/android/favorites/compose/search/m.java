package com.avito.android.favorites.compose.search;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FavoritesSearch.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/favorites/compose/search/f;", VoiceInfo.STATE, "_avito_favorites_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m {

    /* compiled from: FavoritesSearch.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f156896l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f156897m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ boolean f156898n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f156899o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f156900p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f156901q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f156902r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f156903s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f156904t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, String str2, boolean z12, Y41.l<? super String, G0> lVar, Y41.a<G0> aVar, Y41.a<G0> aVar2, androidx.compose.ui.v vVar, int i12, int i13) {
            super(2);
            this.f156896l = str;
            this.f156897m = str2;
            this.f156898n = z12;
            this.f156899o = lVar;
            this.f156900p = aVar;
            this.f156901q = aVar2;
            this.f156902r = vVar;
            this.f156903s = i12;
            this.f156904t = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f156903s | 1);
            Y41.a<G0> aVar = this.f156900p;
            Y41.a<G0> aVar2 = this.f156901q;
            m.b(this.f156896l, this.f156897m, this.f156898n, this.f156899o, aVar, aVar2, this.f156902r, a12, iA2, this.f156904t);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r24, Y41.a r25, androidx.compose.runtime.A r26, androidx.compose.ui.v r27, boolean r28) {
        /*
            r0 = r24
            r1 = r25
            r8 = r27
            r9 = r28
            r2 = -2057062560(0xffffffff8563b760, float:-1.07071694E-35)
            r3 = r26
            androidx.compose.runtime.B r14 = r3.E(r2)
            r2 = r0 & 14
            if (r2 != 0) goto L20
            boolean r2 = r14.j(r9)
            if (r2 == 0) goto L1d
            r2 = 4
            goto L1e
        L1d:
            r2 = 2
        L1e:
            r2 = r2 | r0
            goto L21
        L20:
            r2 = r0
        L21:
            r3 = r0 & 112(0x70, float:1.57E-43)
            r4 = 32
            if (r3 != 0) goto L32
            boolean r3 = r14.u(r1)
            if (r3 == 0) goto L2f
            r3 = r4
            goto L31
        L2f:
            r3 = 16
        L31:
            r2 = r2 | r3
        L32:
            r3 = r0 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L42
            boolean r3 = r14.B(r8)
            if (r3 == 0) goto L3f
            r3 = 256(0x100, float:3.59E-43)
            goto L41
        L3f:
            r3 = 128(0x80, float:1.8E-43)
        L41:
            r2 = r2 | r3
        L42:
            r3 = r2 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r3 != r5) goto L54
            boolean r3 = r14.c()
            if (r3 != 0) goto L4f
            goto L54
        L4f:
            r14.f()
        L52:
            r3 = r14
            goto Lba
        L54:
            if (r9 == 0) goto L52
            r3 = 2131956997(0x7f131505, float:1.9550566E38)
            java.lang.String r10 = u0.i.c(r14, r3)
            com.akita.compose.theme.re23.b r3 = com.akita.compose.theme.re23.b.f63983a
            r3.getClass()
            com.akita.compose.theme.re23.i r3 = com.akita.compose.theme.re23.b.f63988f
            com.akita.compose.foundation.r r11 = r3.f65241l
            com.akita.compose.theme.re23.a r3 = com.akita.compose.theme.re23.b.f63984b
            com.akita.compose.foundation.p r3 = r3.f63837D
            long r15 = r3.c(r14)
            r3 = 2124667585(0x7ea3dac1, float:1.089E38)
            r14.C(r3)
            r2 = r2 & 112(0x70, float:1.57E-43)
            r3 = 0
            if (r2 != r4) goto L7b
            r2 = 1
            goto L7c
        L7b:
            r2 = r3
        L7c:
            java.lang.Object r4 = r14.t()
            if (r2 != 0) goto L8b
            androidx.compose.runtime.A$a r2 = androidx.compose.runtime.A.f37866a
            r2.getClass()
            androidx.compose.runtime.A$a$a r2 = androidx.compose.runtime.A.a.f37868b
            if (r4 != r2) goto L93
        L8b:
            com.avito.android.favorites.compose.search.k r4 = new com.avito.android.favorites.compose.search.k
            r4.<init>(r1)
            r14.H(r4)
        L93:
            r6 = r4
            Y41.a r6 = (Y41.a) r6
            r14.X(r3)
            r4 = 0
            r5 = 0
            r3 = 0
            r7 = 7
            r2 = r27
            androidx.compose.ui.v r12 = androidx.compose.foundation.C21086w0.c(r2, r3, r4, r5, r6, r7)
            r19 = 0
            r20 = 0
            r13 = 0
            r2 = 0
            r17 = 0
            r18 = 0
            r22 = 0
            r23 = 1000(0x3e8, float:1.401E-42)
            r3 = r14
            r14 = r15
            r16 = r2
            r21 = r3
            com.akita.compose.foundation.ui.p.b(r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23)
        Lba:
            androidx.compose.runtime.c2 r2 = r3.Z()
            if (r2 == 0) goto Lc7
            com.avito.android.favorites.compose.search.l r3 = new com.avito.android.favorites.compose.search.l
            r3.<init>(r0, r1, r8, r9)
            r2.f38184d = r3
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorites.compose.search.m.a(int, Y41.a, androidx.compose.runtime.A, androidx.compose.ui.v, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r24, java.lang.String r25, boolean r26, Y41.l<? super java.lang.String, kotlin.G0> r27, Y41.a<kotlin.G0> r28, Y41.a<kotlin.G0> r29, androidx.compose.ui.v r30, androidx.compose.runtime.A r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorites.compose.search.m.b(java.lang.String, java.lang.String, boolean, Y41.l, Y41.a, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@Y61.k com.avito.android.favorites.InterfaceC30683q0 r21, @Y61.l androidx.compose.ui.v.a r22, @Y61.l androidx.compose.runtime.A r23, int r24) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorites.compose.search.m.c(com.avito.android.favorites.q0, androidx.compose.ui.v$a, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00fe  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(java.lang.String r32, java.lang.String r33, boolean r34, Y41.l r35, Y41.a r36, androidx.compose.ui.v r37, androidx.compose.runtime.A r38, int r39) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.favorites.compose.search.m.d(java.lang.String, java.lang.String, boolean, Y41.l, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int):void");
    }
}
