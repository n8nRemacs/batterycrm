package com.avito.android.safety.tfa_enable_confirm.code_check.interactor;

import androidx.compose.runtime.internal.P;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.screen.g;
import io0.InterfaceC42082a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TfaEnableCodeCheckPreRequestInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/tfa_enable_confirm/code_check/interactor/y;", "Lcom/avito/android/code_check_public/screen/g$a;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class y extends g.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42082a f258203a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC3494a.d f258204b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC3494a.d f258205c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC3494a.d f258206d;

    public y(@Y61.k InterfaceC42082a interfaceC42082a, @Y61.k a.InterfaceC3494a.d dVar, @Y61.k a.InterfaceC3494a.d dVar2, @Y61.k a.InterfaceC3494a.d dVar3) {
        this.f258203a = interfaceC42082a;
        this.f258204b = dVar;
        this.f258205c = dVar2;
        this.f258206d = dVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.safety.tfa_enable_confirm.code_check.interactor.y r4, java.lang.String r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof com.avito.android.safety.tfa_enable_confirm.code_check.interactor.w
            if (r0 == 0) goto L16
            r0 = r6
            com.avito.android.safety.tfa_enable_confirm.code_check.interactor.w r0 = (com.avito.android.safety.tfa_enable_confirm.code_check.interactor.w) r0
            int r1 = r0.f258200v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f258200v = r1
            goto L1b
        L16:
            com.avito.android.safety.tfa_enable_confirm.code_check.interactor.w r0 = new com.avito.android.safety.tfa_enable_confirm.code_check.interactor.w
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f258198t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f258200v
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            com.avito.android.safety.tfa_enable_confirm.code_check.interactor.y r4 = r0.f258197s
            java.lang.String r5 = r0.f258196r
            com.avito.android.safety.tfa_enable_confirm.code_check.interactor.y r0 = r0.f258195q
            kotlin.C42729a0.b(r6)
            goto L4f
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.C42729a0.b(r6)
            r0.f258195q = r4
            r0.f258196r = r5
            r0.f258197s = r4
            r0.f258200v = r3
            io0.a r6 = r4.f258203a
            java.lang.Object r6 = r6.d(r5, r0)
            if (r6 != r1) goto L4e
            goto L5d
        L4e:
            r0 = r4
        L4f:
            com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
            com.avito.android.safety.tfa_enable_confirm.code_check.interactor.x r1 = new com.avito.android.safety.tfa_enable_confirm.code_check.interactor.x
            r1.<init>(r5, r0)
            r4.getClass()
            To.d r1 = com.avito.android.code_check_public.screen.f.a(r6, r1)
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safety.tfa_enable_confirm.code_check.interactor.y.c(com.avito.android.safety.tfa_enable_confirm.code_check.interactor.y, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.code_check_public.screen.g.a
    @Y61.k
    public final InterfaceC43160i b(@Y61.l String str, @Y61.l ArrayList arrayList) {
        return C43175k.G(new v(arrayList, this, null));
    }
}
