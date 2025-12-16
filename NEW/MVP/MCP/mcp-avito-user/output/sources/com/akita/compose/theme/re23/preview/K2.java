package com.akita.compose.theme.re23.preview;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import com.akita.compose.theme.re23.preview.AbstractC27462u0;
import java.util.Collections;
import kotlin.Metadata;

/* compiled from: ProgressBarPreview.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"re23_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class K2 {

    /* compiled from: ProgressBarPreview.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/J;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/J;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.foundation.layout.J, androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AbstractC27462u0.c f65400l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.progress_bar.k> f65401m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC27462u0.c cVar, kotlin.Q<String, com.akita.compose.component.progress_bar.k> q12) {
            super(3);
            this.f65400l = cVar;
            this.f65401m = q12;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
        @Override // Y41.q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.foundation.layout.J r13, androidx.compose.runtime.A r14, java.lang.Integer r15) {
            /*
                r12 = this;
                androidx.compose.foundation.layout.J r13 = (androidx.compose.foundation.layout.J) r13
                androidx.compose.runtime.A r14 = (androidx.compose.runtime.A) r14
                java.lang.Number r15 = (java.lang.Number) r15
                int r13 = r15.intValue()
                r13 = r13 & 81
                r15 = 16
                if (r13 != r15) goto L1c
                boolean r13 = r14.c()
                if (r13 != 0) goto L17
                goto L1c
            L17:
                r14.f()
                goto Lbe
            L1c:
                com.akita.compose.theme.re23.preview.u0$c r13 = r12.f65400l
                androidx.compose.runtime.w1 r13 = r13.f65868e
                androidx.compose.runtime.e3 r13 = (androidx.compose.runtime.C22061e3) r13
                int r13 = r13.e()
                float r13 = (float) r13
                r0 = 1120403456(0x42c80000, float:100.0)
                float r13 = r13 / r0
                r0 = -1862800003(0xffffffff90f7ed7d, float:-9.779023E-29)
                r14.C(r0)
                boolean r0 = r14.k(r13)
                java.lang.Object r1 = r14.t()
                if (r0 != 0) goto L43
                androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
                r0.getClass()
                androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
                if (r1 != r0) goto L4b
            L43:
                com.akita.compose.theme.re23.preview.J2 r1 = new com.akita.compose.theme.re23.preview.J2
                r1.<init>(r13)
                r14.H(r1)
            L4b:
                Y41.a r1 = (Y41.a) r1
                r14.h()
                kotlin.Q<java.lang.String, com.akita.compose.component.progress_bar.k> r0 = r12.f65401m
                B r2 = r0.f406620c
                com.akita.compose.component.progress_bar.k r2 = (com.akita.compose.component.progress_bar.k) r2
                androidx.compose.ui.v$a r3 = androidx.compose.ui.v.f42878y1
                r4 = 1065353216(0x3f800000, float:1.0)
                androidx.compose.ui.v r5 = androidx.compose.foundation.layout.C20588k2.d(r3, r4)
                r6 = 0
                r7 = 3
                androidx.compose.ui.v r5 = androidx.compose.foundation.layout.C20588k2.w(r5, r6, r7)
                r8 = 384(0x180, float:5.38E-43)
                com.akita.compose.component.progress_bar.j.a(r1, r2, r5, r14, r8)
                float r15 = (float) r15
                androidx.compose.ui.unit.h$a r1 = androidx.compose.ui.unit.h.f42849c
                r1 = 6
                com.akita.compose.foundation.ui.g.a(r15, r6, r14, r1)
                float r15 = r4 - r13
                float r1 = (float) r7
                float r15 = r15 / r1
                com.akita.compose.component.progress_bar.m r1 = new com.akita.compose.component.progress_bar.m
                com.akita.compose.theme.re23.b r2 = com.akita.compose.theme.re23.b.f63983a
                r2.getClass()
                com.akita.compose.theme.re23.a r2 = com.akita.compose.theme.re23.b.f63984b
                com.akita.compose.foundation.p r5 = r2.f63945n0
                long r9 = r5.c(r14)
                r1.<init>(r15, r9, r6)
                com.akita.compose.component.progress_bar.m r5 = new com.akita.compose.component.progress_bar.m
                com.akita.compose.foundation.p r9 = r2.f63862L0
                long r9 = r9.c(r14)
                r5.<init>(r15, r9, r6)
                com.akita.compose.component.progress_bar.m r9 = new com.akita.compose.component.progress_bar.m
                com.akita.compose.foundation.p r10 = r2.f63913c1
                long r10 = r10.c(r14)
                r9.<init>(r13, r10, r6)
                com.akita.compose.component.progress_bar.m r13 = new com.akita.compose.component.progress_bar.m
                com.akita.compose.foundation.p r2 = r2.f63971w
                long r10 = r2.c(r14)
                r13.<init>(r15, r10, r6)
                com.akita.compose.component.progress_bar.m[] r13 = new com.akita.compose.component.progress_bar.m[]{r1, r5, r9, r13}
                java.util.List r13 = kotlin.collections.C42745f0.U(r13)
                B r15 = r0.f406620c
                com.akita.compose.component.progress_bar.k r15 = (com.akita.compose.component.progress_bar.k) r15
                androidx.compose.ui.v r0 = androidx.compose.foundation.layout.C20588k2.d(r3, r4)
                androidx.compose.ui.v r0 = androidx.compose.foundation.layout.C20588k2.w(r0, r6, r7)
                com.akita.compose.component.progress_bar.j.b(r13, r15, r0, r14, r8)
            Lbe:
                kotlin.G0 r13 = kotlin.G0.f406611a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.theme.re23.preview.K2.a.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ProgressBarPreview.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, com.akita.compose.component.progress_bar.k> f65402l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f65403m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, kotlin.Q q12) {
            super(2);
            this.f65402l = q12;
            this.f65403m = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f65403m | 1);
            K2.a(this.f65402l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k kotlin.Q<String, com.akita.compose.component.progress_bar.k> q12, @Y61.l androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(1690989408);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(q12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            AbstractC27462u0.c cVar = new AbstractC27462u0.c("progress", 50, 10, 0, 100);
            C27452s0.a(q12.f406619b, null, null, 0.0f, Collections.singleton(cVar), androidx.compose.runtime.internal.r.c(-874425910, new a(cVar, q12), bE2), bE2, 196608, 14);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12, q12);
        }
    }
}
