package com.avito.android.authorization.auth.auth_socials;

import com.avito.android.remote.InterfaceC34258d;
import hD.C40806a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AuthSocialsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auth/auth_socials/o;", "Lcom/avito/android/authorization/auth/auth_socials/k;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34258d f92912a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C40806a f92913b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h f92914c;

    @Inject
    public o(@Y61.k InterfaceC34258d interfaceC34258d, @Y61.k C40806a c40806a, @Y61.k h hVar) {
        this.f92912a = interfaceC34258d;
        this.f92913b = c40806a;
        this.f92914c = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7 A[EDGE_INSN: B:46:0x00a7->B:36:0x00a7 BREAK  A[LOOP:0: B:31:0x008e->B:48:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.authorization.auth.auth_socials.k
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.avito.android.authorization.auth.auth_socials.l
            if (r0 == 0) goto L13
            r0 = r10
            com.avito.android.authorization.auth.auth_socials.l r0 = (com.avito.android.authorization.auth.auth_socials.l) r0
            int r1 = r0.f92908t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f92908t = r1
            goto L18
        L13:
            com.avito.android.authorization.auth.auth_socials.l r0 = new com.avito.android.authorization.auth.auth_socials.l
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f92906r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f92908t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.authorization.auth.auth_socials.o r0 = r0.f92905q
            kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L5a
            goto L56
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            kotlin.C42729a0.b(r10)
            kotlin.time.e$a r10 = kotlin.time.e.f410651c     // Catch: java.lang.Throwable -> L59
            kotlin.time.DurationUnit r10 = kotlin.time.DurationUnit.f410633e     // Catch: java.lang.Throwable -> L59
            r2 = 500(0x1f4, float:7.0E-43)
            long r4 = kotlin.time.g.g(r2, r10)     // Catch: java.lang.Throwable -> L59
            com.avito.android.authorization.auth.auth_socials.m r10 = new com.avito.android.authorization.auth.auth_socials.m     // Catch: java.lang.Throwable -> L59
            r2 = 0
            r10.<init>(r9, r2)     // Catch: java.lang.Throwable -> L59
            r0.f92905q = r9     // Catch: java.lang.Throwable -> L59
            r0.f92908t = r3     // Catch: java.lang.Throwable -> L59
            long r2 = kotlinx.coroutines.C43131e0.e(r4)     // Catch: java.lang.Throwable -> L59
            java.lang.Object r10 = kotlinx.coroutines.D1.b(r2, r10, r0)     // Catch: java.lang.Throwable -> L59
            if (r10 != r1) goto L55
            return r1
        L55:
            r0 = r9
        L56:
            com.avito.android.authorization.auth.auth_socials.entity.AuthSocialsInternalAction$AuthSocialsLoaded r10 = (com.avito.android.authorization.auth.auth_socials.entity.AuthSocialsInternalAction.AuthSocialsLoaded) r10     // Catch: java.lang.Throwable -> L5a
            goto L66
        L59:
            r0 = r9
        L5a:
            com.avito.android.authorization.auth.auth_socials.entity.AuthSocialsInternalAction$AuthSocialsLoaded r10 = new com.avito.android.authorization.auth.auth_socials.entity.AuthSocialsInternalAction$AuthSocialsLoaded
            com.avito.android.authorization.auth.auth_socials.h r1 = r0.f92914c
            java.util.List r1 = r1.a()
            r2 = 0
            r10.<init>(r1, r2)
        L66:
            java.util.List<com.avito.android.remote.model.AuthSocialStatus> r1 = r10.f92895b
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            com.avito.android.authorization.auth.auth_socials.n r1 = com.avito.android.authorization.auth.auth_socials.n.f92911l
            hD.a r3 = r0.f92913b
            DE0.a r3 = r3.w()
            java.lang.Object r3 = r3.invoke()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto La7
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L8a
            goto La7
        L8a:
            java.util.Iterator r3 = r2.iterator()
        L8e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La7
            java.lang.Object r4 = r3.next()
            java.lang.Object r4 = r1.invoke(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L8e
            kotlin.collections.C42745f0.l0(r1, r2)
        La7:
            hD.a r0 = r0.f92913b
            DE0.a r0 = r0.v()
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc9
            com.avito.android.remote.model.AuthSocialStatus r0 = new com.avito.android.remote.model.AuthSocialStatus
            com.avito.android.remote.model.AuthSocialInteractionStatus r5 = com.avito.android.remote.model.AuthSocialInteractionStatus.VISIBLE
            java.lang.String r4 = "avitofake"
            r6 = 0
            r7 = 4
            r8 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            r2.add(r0)
        Lc9:
            com.avito.android.authorization.auth.auth_socials.entity.AuthSocialsInternalAction$AuthSocialsLoaded r0 = new com.avito.android.authorization.auth.auth_socials.entity.AuthSocialsInternalAction$AuthSocialsLoaded
            boolean r10 = r10.f92896c
            r0.<init>(r2, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.authorization.auth.auth_socials.o.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
