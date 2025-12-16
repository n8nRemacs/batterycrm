package com.avito.android.realty_agency.checkerboard.ui;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.realty_agency.checkerboard.mvi.entity.MainContentTab;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MainContentSegmentedControl.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_realty-agency_checkerboard_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g {

    /* compiled from: MainContentSegmentedControl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "index", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l<MainContentTab, G0> f251409l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? super MainContentTab, G0> lVar) {
            super(1);
            this.f251409l = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(Integer num) {
            this.f251409l.invoke(MainContentTab.f251254e.get(num.intValue()));
            return G0.f406611a;
        }
    }

    /* compiled from: MainContentSegmentedControl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ MainContentTab f251410l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l<MainContentTab, G0> f251411m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f251412n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(MainContentTab mainContentTab, l<? super MainContentTab, G0> lVar, int i12) {
            super(2);
            this.f251410l = mainContentTab;
            this.f251411m = lVar;
            this.f251412n = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f251412n | 1);
            g.a(this.f251410l, this.f251411m, a12, iA2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.realty_agency.checkerboard.mvi.entity.MainContentTab r7, @Y61.k Y41.l<? super com.avito.android.realty_agency.checkerboard.mvi.entity.MainContentTab, kotlin.G0> r8, @Y61.l androidx.compose.runtime.A r9, int r10) {
        /*
            r0 = -287524105(0xffffffffeedcbaf7, float:-3.4156364E28)
            androidx.compose.runtime.B r9 = r9.E(r0)
            r0 = r10 & 112(0x70, float:1.57E-43)
            r1 = 16
            r2 = 32
            if (r0 != 0) goto L1a
            boolean r0 = r9.u(r8)
            if (r0 == 0) goto L17
            r0 = r2
            goto L18
        L17:
            r0 = r1
        L18:
            r0 = r0 | r10
            goto L1b
        L1a:
            r0 = r10
        L1b:
            r3 = r0 & 91
            r4 = 18
            if (r3 != r4) goto L2c
            boolean r3 = r9.c()
            if (r3 != 0) goto L28
            goto L2c
        L28:
            r9.f()
            goto L8c
        L2c:
            androidx.compose.ui.v$a r3 = androidx.compose.ui.v.f42878y1
            r4 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.v r3 = androidx.compose.foundation.layout.C20588k2.d(r3, r4)
            float r1 = (float) r1
            androidx.compose.ui.unit.h$a r4 = androidx.compose.ui.unit.h.f42849c
            r4 = 12
            float r4 = (float) r4
            androidx.compose.ui.v r1 = androidx.compose.foundation.layout.R1.j(r3, r1, r4)
            r3 = 36
            float r3 = (float) r3
            androidx.compose.ui.v r4 = androidx.compose.foundation.layout.C20588k2.f(r1, r3)
            android.content.res.Resources r1 = u0.h.a(r9)
            r3 = 2130903048(0x7f030008, float:1.7412903E38)
            java.lang.String[] r1 = r1.getStringArray(r3)
            java.util.List r1 = java.util.Arrays.asList(r1)
            int r3 = r7.ordinal()
            r5 = 2098383521(0x7d12caa1, float:1.2194962E37)
            r9.C(r5)
            r0 = r0 & 112(0x70, float:1.57E-43)
            r5 = 0
            if (r0 != r2) goto L65
            r0 = 1
            goto L66
        L65:
            r0 = r5
        L66:
            java.lang.Object r2 = r9.t()
            if (r0 != 0) goto L75
            androidx.compose.runtime.A$a r0 = androidx.compose.runtime.A.f37866a
            r0.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r0) goto L7d
        L75:
            com.avito.android.realty_agency.checkerboard.ui.g$a r2 = new com.avito.android.realty_agency.checkerboard.ui.g$a
            r2.<init>(r8)
            r9.H(r2)
        L7d:
            Y41.l r2 = (Y41.l) r2
            r9.X(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6 = 3080(0xc08, float:4.316E-42)
            r5 = r9
            com.avito.android.mnz_common.compose.B.a(r1, r2, r3, r4, r5, r6)
        L8c:
            androidx.compose.runtime.c2 r9 = r9.Z()
            if (r9 == 0) goto L99
            com.avito.android.realty_agency.checkerboard.ui.g$b r0 = new com.avito.android.realty_agency.checkerboard.ui.g$b
            r0.<init>(r7, r8, r10)
            r9.f38184d = r0
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.realty_agency.checkerboard.ui.g.a(com.avito.android.realty_agency.checkerboard.mvi.entity.MainContentTab, Y41.l, androidx.compose.runtime.A, int):void");
    }
}
