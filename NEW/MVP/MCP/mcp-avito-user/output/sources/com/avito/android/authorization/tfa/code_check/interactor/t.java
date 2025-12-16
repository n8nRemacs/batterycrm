package com.avito.android.authorization.tfa.code_check.interactor;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.screen.g;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TfaCodeCheckPreRequestInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/tfa/code_check/interactor/t;", "Lcom/avito/android/code_check_public/screen/g$a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class t extends g.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.r f94703a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC3494a.d f94704b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC3494a.d f94705c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC3494a.d f94706d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f94707e;

    public t(@Y61.k com.avito.android.remote.r rVar, @Y61.k a.InterfaceC3494a.d dVar, @Y61.k a.InterfaceC3494a.d dVar2, @Y61.k a.InterfaceC3494a.d dVar3, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f94703a = rVar;
        this.f94704b = dVar;
        this.f94705c = dVar2;
        this.f94706d = dVar3;
        this.f94707e = interfaceC28373a;
    }

    @Override // com.avito.android.code_check_public.screen.g.a
    @Y61.k
    public final InterfaceC43160i b(@Y61.l String str, @Y61.l ArrayList arrayList) {
        return C43175k.G(new q(arrayList, str, this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.avito.android.code_check_public.a] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k java.lang.String r5, @Y61.k com.avito.android.code_check_public.a.InterfaceC3494a.d r6, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.avito.android.authorization.tfa.code_check.interactor.r
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.authorization.tfa.code_check.interactor.r r0 = (com.avito.android.authorization.tfa.code_check.interactor.r) r0
            int r1 = r0.f94699w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94699w = r1
            goto L18
        L13:
            com.avito.android.authorization.tfa.code_check.interactor.r r0 = new com.avito.android.authorization.tfa.code_check.interactor.r
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f94697u
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f94699w
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            com.avito.android.authorization.tfa.code_check.interactor.t r5 = r0.f94696t
            com.avito.android.code_check_public.a r6 = r0.f94695s
            java.lang.String r1 = r0.f94694r
            com.avito.android.authorization.tfa.code_check.interactor.t r0 = r0.f94693q
            kotlin.C42729a0.b(r7)
            goto L52
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.C42729a0.b(r7)
            r0.f94693q = r4
            r0.f94694r = r5
            r0.f94695s = r6
            r0.f94696t = r4
            r0.f94699w = r3
            com.avito.android.remote.r r7 = r4.f94703a
            java.lang.Object r7 = r7.n(r5, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r0 = r4
            r1 = r5
            r5 = r0
        L52:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            com.avito.android.authorization.tfa.code_check.interactor.s r2 = new com.avito.android.authorization.tfa.code_check.interactor.s
            r2.<init>(r0, r1, r6)
            r5.getClass()
            To.d r5 = com.avito.android.code_check_public.screen.f.a(r7, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.authorization.tfa.code_check.interactor.t.c(java.lang.String, com.avito.android.code_check_public.a$a$d, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
