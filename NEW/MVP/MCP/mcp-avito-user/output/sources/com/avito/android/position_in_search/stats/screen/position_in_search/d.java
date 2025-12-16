package com.avito.android.position_in_search.stats.screen.position_in_search;

import Y41.p;
import androidx.compose.runtime.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PositionInSearchActivity.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class d extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PositionInSearchActivity f221330l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PositionInSearchActivity positionInSearchActivity) {
        super(2);
        this.f221330l = positionInSearchActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    @Override // Y41.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.runtime.A r14, java.lang.Integer r15) {
        /*
            r13 = this;
            r5 = r14
            androidx.compose.runtime.A r5 = (androidx.compose.runtime.A) r5
            java.lang.Number r15 = (java.lang.Number) r15
            int r14 = r15.intValue()
            r14 = r14 & 11
            r15 = 2
            if (r14 != r15) goto L1a
            boolean r14 = r5.c()
            if (r14 != 0) goto L15
            goto L1a
        L15:
            r5.f()
            goto Lb5
        L1a:
            com.avito.android.position_in_search.stats.screen.position_in_search.PositionInSearchActivity r14 = r13.f221330l
            androidx.lifecycle.O0 r15 = r14.f221317p
            java.lang.Object r0 = r15.getValue()
            com.avito.android.position_in_search.stats.screen.position_in_search.m r0 = (com.avito.android.position_in_search.stats.screen.position_in_search.m) r0
            kotlinx.coroutines.flow.n2 r0 = r0.getState()
            androidx.compose.runtime.y1 r0 = androidx.compose.runtime.C22126m3.b(r0, r5)
            java.lang.Object r0 = r0.getF42167b()
            c90.c r0 = (c90.c) r0
            java.lang.Object r1 = r15.getValue()
            r8 = r1
            com.avito.android.position_in_search.stats.screen.position_in_search.m r8 = (com.avito.android.position_in_search.stats.screen.position_in_search.m) r8
            r1 = -1299768436(0xffffffffb2871b8c, float:-1.5728595E-8)
            r5.C(r1)
            boolean r1 = r5.B(r8)
            java.lang.Object r2 = r5.t()
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            if (r1 != 0) goto L52
            r3.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r2 != r1) goto L63
        L52:
            com.avito.android.position_in_search.stats.screen.position_in_search.a r2 = new com.avito.android.position_in_search.stats.screen.position_in_search.a
            java.lang.String r11 = "accept(Ljava/lang/Object;)V"
            r12 = 0
            r7 = 1
            java.lang.Class<com.avito.android.position_in_search.stats.screen.position_in_search.m> r9 = com.avito.android.position_in_search.stats.screen.position_in_search.m.class
            java.lang.String r10 = "accept"
            r6 = r2
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r5.H(r2)
        L63:
            kotlin.reflect.i r2 = (kotlin.reflect.i) r2
            r5.h()
            r1 = r2
            Y41.l r1 = (Y41.l) r1
            com.avito.android.position_in_search.stats.screen.position_in_search.b r2 = new com.avito.android.position_in_search.stats.screen.position_in_search.b
            java.lang.Class<com.avito.android.position_in_search.stats.screen.position_in_search.PositionInSearchActivity> r9 = com.avito.android.position_in_search.stats.screen.position_in_search.PositionInSearchActivity.class
            java.lang.String r10 = "finish"
            r7 = 0
            java.lang.String r11 = "finish()V"
            r12 = 0
            r6 = r2
            r8 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12)
            java.lang.Object r15 = r15.getValue()
            com.avito.android.position_in_search.stats.screen.position_in_search.m r15 = (com.avito.android.position_in_search.stats.screen.position_in_search.m) r15
            kotlinx.coroutines.flow.i r15 = r15.getEvents()
            com.avito.android.deeplink_handler.handler.composite.a r4 = r14.f221316o
            if (r4 == 0) goto L89
            goto L8a
        L89:
            r4 = 0
        L8a:
            r6 = -1299763433(0xffffffffb2872f17, float:-1.5737482E-8)
            r5.C(r6)
            boolean r4 = r5.B(r4)
            java.lang.Object r6 = r5.t()
            if (r4 != 0) goto La1
            r3.getClass()
            androidx.compose.runtime.A$a$a r3 = androidx.compose.runtime.A.a.f37868b
            if (r6 != r3) goto La9
        La1:
            com.avito.android.position_in_search.stats.screen.position_in_search.c r6 = new com.avito.android.position_in_search.stats.screen.position_in_search.c
            r6.<init>(r14)
            r5.H(r6)
        La9:
            r4 = r6
            Y41.l r4 = (Y41.l) r4
            r5.h()
            r6 = 4104(0x1008, float:5.751E-42)
            r3 = r15
            com.avito.android.position_in_search.stats.screen.position_in_search.ui.i0.a(r0, r1, r2, r3, r4, r5, r6)
        Lb5:
            kotlin.G0 r14 = kotlin.G0.f406611a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.position_in_search.d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
