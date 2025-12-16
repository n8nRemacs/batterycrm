package com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout;

import Y41.p;
import Y41.r;
import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacUIAcceptTimeoutProgressBar.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final IacUIAcceptTimeoutProgressBarState f166924a = new IacUIAcceptTimeoutProgressBarState(40000, 100L);

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final Y41.a<Long> f166925b = c.f166932l;

    /* compiled from: IacUIAcceptTimeoutProgressBar.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "currentTime", "Landroidx/compose/ui/v;", "contentModifier", "Lkotlin/G0;", "invoke", "(JLandroidx/compose/ui/v;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements r<Long, v, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacUIAcceptTimeoutProgressBarState f166926l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(IacUIAcceptTimeoutProgressBarState iacUIAcceptTimeoutProgressBarState) {
            super(4);
            this.f166926l = iacUIAcceptTimeoutProgressBarState;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
        @Override // Y41.r
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(java.lang.Long r7, androidx.compose.ui.v r8, androidx.compose.runtime.A r9, java.lang.Integer r10) {
            /*
                r6 = this;
                java.lang.Number r7 = (java.lang.Number) r7
                long r0 = r7.longValue()
                androidx.compose.ui.v r8 = (androidx.compose.ui.v) r8
                androidx.compose.runtime.A r9 = (androidx.compose.runtime.A) r9
                java.lang.Number r10 = (java.lang.Number) r10
                int r7 = r10.intValue()
                r10 = r7 & 14
                if (r10 != 0) goto L1f
                boolean r10 = r9.n(r0)
                if (r10 == 0) goto L1c
                r10 = 4
                goto L1d
            L1c:
                r10 = 2
            L1d:
                r10 = r10 | r7
                goto L20
            L1f:
                r10 = r7
            L20:
                r7 = r7 & 112(0x70, float:1.57E-43)
                if (r7 != 0) goto L30
                boolean r7 = r9.B(r8)
                if (r7 == 0) goto L2d
                r7 = 32
                goto L2f
            L2d:
                r7 = 16
            L2f:
                r10 = r10 | r7
            L30:
                r7 = r10 & 731(0x2db, float:1.024E-42)
                r10 = 146(0x92, float:2.05E-43)
                if (r7 != r10) goto L41
                boolean r7 = r9.c()
                if (r7 != 0) goto L3d
                goto L41
            L3d:
                r9.f()
                goto Laa
            L41:
                com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.IacUIAcceptTimeoutProgressBarState r7 = r6.f166926l
                long r2 = r7.getOutgoingAcceptTimeout()
                r4 = 0
                int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r10 > 0) goto L4e
                goto Laa
            L4e:
                java.lang.Long r10 = r7.getCallTimeRingingAt()
                r2 = 0
                if (r10 == 0) goto L5c
                long r3 = r10.longValue()
                long r0 = r0 - r3
                float r10 = (float) r0
                goto L5d
            L5c:
                r10 = r2
            L5d:
                long r0 = r7.getOutgoingAcceptTimeout()
                float r7 = (float) r0
                float r10 = r10 / r7
                r7 = 1065353216(0x3f800000, float:1.0)
                float r10 = kotlin.ranges.s.f(r10, r2, r7)
                java.lang.String r0 = "IacUITestTags.AcceptTimeoutProgressBar.PROGRESS_BAR"
                androidx.compose.ui.v r8 = androidx.compose.ui.platform.C22501m2.a(r8, r0)
                androidx.compose.ui.v r7 = androidx.compose.foundation.layout.C20588k2.d(r8, r7)
                com.akita.compose.theme.re23.b r8 = com.akita.compose.theme.re23.b.f63983a
                r8.getClass()
                com.akita.compose.theme.re23.style.R2 r8 = com.akita.compose.theme.re23.b.o(r9)
                com.akita.compose.component.progress_bar.k r8 = r8.getF66618j()
                r0 = -947913055(0xffffffffc77ffea1, float:-65534.63)
                r9.C(r0)
                boolean r0 = r9.k(r10)
                java.lang.Object r1 = r9.t()
                if (r0 != 0) goto L99
                androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
                r0.getClass()
                androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
                if (r1 != r0) goto La1
            L99:
                com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.e r1 = new com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.e
                r1.<init>(r10)
                r9.H(r1)
            La1:
                Y41.a r1 = (Y41.a) r1
                r9.h()
                r10 = 0
                com.akita.compose.component.progress_bar.j.a(r1, r8, r7, r9, r10)
            Laa:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.f.a.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: IacUIAcceptTimeoutProgressBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacUIAcceptTimeoutProgressBarState f166927l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Object f166928m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ v f166929n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f166930o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f166931p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(IacUIAcceptTimeoutProgressBarState iacUIAcceptTimeoutProgressBarState, Y41.a<Long> aVar, v vVar, int i12, int i13) {
            super(2);
            this.f166927l = iacUIAcceptTimeoutProgressBarState;
            this.f166928m = aVar;
            this.f166929n = vVar;
            this.f166930o = i12;
            this.f166931p = i13;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, java.lang.Object] */
        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f166930o | 1);
            ?? r12 = this.f166928m;
            IacUIAcceptTimeoutProgressBarState iacUIAcceptTimeoutProgressBarState = this.f166927l;
            f.a(iacUIAcceptTimeoutProgressBarState, r12, this.f166929n, a12, iA2, this.f166931p);
            return G0.f406611a;
        }
    }

    /* compiled from: IacUIAcceptTimeoutProgressBar.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Long> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f166932l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Long invoke() {
            return 2100L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.IacUIAcceptTimeoutProgressBarState r13, @Y61.k Y41.a<java.lang.Long> r14, @Y61.l androidx.compose.ui.v r15, @Y61.l androidx.compose.runtime.A r16, int r17, int r18) {
        /*
            r1 = r13
            r4 = r17
            r0 = 483110571(0x1ccbaeab, float:1.3478564E-21)
            r2 = r16
            androidx.compose.runtime.B r0 = r2.E(r0)
            r2 = r4 & 14
            if (r2 != 0) goto L1b
            boolean r2 = r0.B(r13)
            if (r2 == 0) goto L18
            r2 = 4
            goto L19
        L18:
            r2 = 2
        L19:
            r2 = r2 | r4
            goto L1c
        L1b:
            r2 = r4
        L1c:
            r3 = r4 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L2e
            r3 = r14
            boolean r5 = r0.u(r14)
            if (r5 == 0) goto L2a
            r5 = 32
            goto L2c
        L2a:
            r5 = 16
        L2c:
            r2 = r2 | r5
            goto L2f
        L2e:
            r3 = r14
        L2f:
            r5 = r18 & 4
            if (r5 == 0) goto L37
            r2 = r2 | 384(0x180, float:5.38E-43)
        L35:
            r6 = r15
            goto L48
        L37:
            r6 = r4 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L35
            r6 = r15
            boolean r7 = r0.B(r15)
            if (r7 == 0) goto L45
            r7 = 256(0x100, float:3.59E-43)
            goto L47
        L45:
            r7 = 128(0x80, float:1.8E-43)
        L47:
            r2 = r2 | r7
        L48:
            r7 = r2 & 731(0x2db, float:1.024E-42)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L5a
            boolean r7 = r0.c()
            if (r7 != 0) goto L55
            goto L5a
        L55:
            r0.f()
            r12 = r6
            goto L80
        L5a:
            if (r5 == 0) goto L60
            androidx.compose.ui.v$a r5 = androidx.compose.ui.v.f42878y1
            r12 = r5
            goto L61
        L60:
            r12 = r6
        L61:
            java.lang.String r5 = "IacUITestTags.AcceptTimeoutProgressBar.ROOT"
            androidx.compose.ui.v r8 = androidx.compose.ui.platform.C22501m2.a(r12, r5)
            com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.f$a r5 = new com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.f$a
            r5.<init>(r13)
            r6 = 575995585(0x2254fec1, float:2.8866223E-18)
            androidx.compose.runtime.internal.n r9 = androidx.compose.runtime.internal.r.c(r6, r5, r0)
            int r2 = r2 >> 3
            r2 = r2 & 14
            r11 = r2 | 3120(0xc30, float:4.372E-42)
            r6 = 100
            r5 = r14
            r10 = r0
            com.avito.android.iac_dialer_ui.pub.util.i.a(r5, r6, r8, r9, r10, r11)
        L80:
            androidx.compose.runtime.c2 r6 = r0.Z()
            if (r6 == 0) goto L95
            com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.f$b r7 = new com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.f$b
            r0 = r7
            r1 = r13
            r2 = r14
            r3 = r12
            r4 = r17
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f38184d = r7
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.f.a(com.avito.android.iac_dialer_ui.pub.call_screen.accept_timeout.IacUIAcceptTimeoutProgressBarState, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int, int):void");
    }
}
