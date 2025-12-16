package com.avito.android.mortgage.document_upload;

import androidx.compose.foundation.lazy.InterfaceC20793y;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LazyDsl.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "androidx/compose/foundation/lazy/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class N extends kotlin.jvm.internal.N implements Y41.r<InterfaceC20793y, Integer, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f199069l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l f199070m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l f199071n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(ArrayList arrayList, Y41.l lVar, Y41.l lVar2) {
        super(4);
        this.f199069l = arrayList;
        this.f199070m = lVar;
        this.f199071n = lVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    @Override // Y41.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.foundation.lazy.InterfaceC20793y r10, java.lang.Integer r11, androidx.compose.runtime.A r12, java.lang.Integer r13) {
        /*
            r9 = this;
            androidx.compose.foundation.lazy.y r10 = (androidx.compose.foundation.lazy.InterfaceC20793y) r10
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            androidx.compose.runtime.A r12 = (androidx.compose.runtime.A) r12
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            r0 = r13 & 6
            if (r0 != 0) goto L1f
            boolean r10 = r12.B(r10)
            if (r10 == 0) goto L1c
            r10 = 4
            goto L1d
        L1c:
            r10 = 2
        L1d:
            r10 = r10 | r13
            goto L20
        L1f:
            r10 = r13
        L20:
            r13 = r13 & 48
            r0 = 16
            if (r13 != 0) goto L31
            boolean r13 = r12.m(r11)
            if (r13 == 0) goto L2f
            r13 = 32
            goto L30
        L2f:
            r13 = r0
        L30:
            r10 = r10 | r13
        L31:
            r13 = r10 & 147(0x93, float:2.06E-43)
            r1 = 146(0x92, float:2.05E-43)
            r2 = 1
            if (r13 == r1) goto L3a
            r13 = r2
            goto L3b
        L3a:
            r13 = 0
        L3b:
            r10 = r10 & r2
            boolean r10 = r12.p(r10, r13)
            if (r10 == 0) goto Lc7
            java.util.ArrayList r10 = r9.f199069l
            java.lang.Object r10 = r10.get(r11)
            e00.a r10 = (e00.C39840a) r10
            r11 = -800649429(0xffffffffd0470f2b, float:-1.335864E10)
            r12.C(r11)
            r11 = 1082553852(0x408675fc, float:4.2019024)
            r12.C(r11)
            Y41.l r11 = r9.f199070m
            boolean r13 = r12.B(r11)
            boolean r1 = r12.B(r10)
            r13 = r13 | r1
            java.lang.Object r1 = r12.t()
            androidx.compose.runtime.A$a r2 = androidx.compose.runtime.A.f37866a
            if (r13 != 0) goto L70
            r2.getClass()
            androidx.compose.runtime.A$a$a r13 = androidx.compose.runtime.A.a.f37868b
            if (r1 != r13) goto L78
        L70:
            com.avito.android.mortgage.document_upload.I r1 = new com.avito.android.mortgage.document_upload.I
            r1.<init>(r11, r10)
            r12.H(r1)
        L78:
            Y41.a r1 = (Y41.a) r1
            r12.h()
            r11 = 1082555835(0x40867dbb, float:4.202848)
            r12.C(r11)
            Y41.l r11 = r9.f199071n
            boolean r13 = r12.B(r11)
            boolean r3 = r12.B(r10)
            r13 = r13 | r3
            java.lang.Object r3 = r12.t()
            if (r13 != 0) goto L9b
            r2.getClass()
            androidx.compose.runtime.A$a$a r13 = androidx.compose.runtime.A.a.f37868b
            if (r3 != r13) goto La3
        L9b:
            com.avito.android.mortgage.document_upload.J r3 = new com.avito.android.mortgage.document_upload.J
            r3.<init>(r11, r10)
            r12.H(r3)
        La3:
            r2 = r3
            Y41.a r2 = (Y41.a) r2
            r12.h()
            androidx.compose.ui.v$a r11 = androidx.compose.ui.v.f42878y1
            r13 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.v r3 = androidx.compose.foundation.layout.C20588k2.d(r11, r13)
            float r7 = (float) r0
            androidx.compose.ui.unit.h$a r11 = androidx.compose.ui.unit.h.f42849c
            r4 = 0
            r8 = 7
            r5 = 0
            r6 = 0
            androidx.compose.ui.v r3 = androidx.compose.foundation.layout.R1.m(r3, r4, r5, r6, r7, r8)
            r5 = 3072(0xc00, float:4.305E-42)
            r0 = r10
            r4 = r12
            com.avito.android.mortgage.document_upload.f0.d(r0, r1, r2, r3, r4, r5)
            r12.h()
            goto Lca
        Lc7:
            r12.f()
        Lca:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.document_upload.N.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
