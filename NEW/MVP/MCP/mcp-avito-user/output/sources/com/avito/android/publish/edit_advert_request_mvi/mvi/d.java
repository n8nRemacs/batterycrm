package com.avito.android.publish.edit_advert_request_mvi.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.publish.C0;
import ee0.C40097d;
import ee0.InterfaceC40094a;
import ee0.InterfaceC40095b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EditRequestActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/edit_advert_request_mvi/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "Lee0/a;", "Lee0/b;", "Lee0/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC40094a, InterfaceC40095b, C40097d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C0 f235619a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.publish.edit_advert_request_mvi.f f235620b;

    @Inject
    public d(@Y61.k C0 c02, @Y61.k com.avito.android.publish.edit_advert_request_mvi.f fVar) {
        this.f235619a = c02;
        this.f235620b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.publish.edit_advert_request_mvi.mvi.d r4, java.lang.String r5, kotlinx.coroutines.flow.InterfaceC43172j r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof com.avito.android.publish.edit_advert_request_mvi.mvi.a
            if (r0 == 0) goto L16
            r0 = r7
            com.avito.android.publish.edit_advert_request_mvi.mvi.a r0 = (com.avito.android.publish.edit_advert_request_mvi.mvi.a) r0
            int r1 = r0.f235612u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f235612u = r1
            goto L1b
        L16:
            com.avito.android.publish.edit_advert_request_mvi.mvi.a r0 = new com.avito.android.publish.edit_advert_request_mvi.mvi.a
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r4 = r0.f235610s
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f235612u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            kotlin.C42729a0.b(r4)
            goto L69
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlinx.coroutines.flow.j r6 = r0.f235609r
            java.lang.String r5 = r0.f235608q
            kotlin.C42729a0.b(r4)
            goto L56
        L3f:
            kotlin.C42729a0.b(r4)
            ee0.b$f r4 = new ee0.b$f
            java.lang.String r1 = ""
            r4.<init>(r1)
            r0.f235608q = r5
            r0.f235609r = r6
            r0.f235612u = r3
            java.lang.Object r4 = r6.emit(r4, r0)
            if (r4 != r7) goto L56
            goto L6b
        L56:
            ee0.b$a r4 = new ee0.b$a
            r4.<init>(r5)
            r5 = 0
            r0.f235608q = r5
            r0.f235609r = r5
            r0.f235612u = r2
            java.lang.Object r4 = r6.emit(r4, r0)
            if (r4 != r7) goto L69
            goto L6b
        L69:
            kotlin.G0 r7 = kotlin.G0.f406611a
        L6b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.edit_advert_request_mvi.mvi.d.c(com.avito.android.publish.edit_advert_request_mvi.mvi.d, java.lang.String, kotlinx.coroutines.flow.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<InterfaceC40095b> b(InterfaceC40094a interfaceC40094a, C40097d c40097d) {
        InterfaceC40094a interfaceC40094a2 = interfaceC40094a;
        C40097d c40097d2 = c40097d;
        if (interfaceC40094a2 instanceof InterfaceC40094a.b) {
            return C43175k.G(new b(this, null));
        }
        if (interfaceC40094a2 instanceof InterfaceC40094a.C11096a) {
            return new C43210w(new InterfaceC40095b.C11097b(((InterfaceC40094a.C11096a) interfaceC40094a2).f395287a, null, null, 6, null));
        }
        if (interfaceC40094a2 instanceof InterfaceC40094a.c) {
            return C43175k.G(new c(((InterfaceC40094a.c) interfaceC40094a2).f395289a, this, c40097d2.f395306c, null));
        }
        if (interfaceC40094a2.equals(InterfaceC40094a.d.f395290a)) {
            return this.f235620b.edit();
        }
        throw new NoWhenBranchMatchedException();
    }
}
