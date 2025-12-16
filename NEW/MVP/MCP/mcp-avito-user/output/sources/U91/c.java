package U91;

import ru.mts.biometry.api.dataSource.j;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final j f16240a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.mts.biometry.api.d f16241b;

    public c(j jVar, ru.mts.biometry.api.d dVar) {
        this.f16240a = jVar;
        this.f16241b = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        if (r5.equals("IdentificationSucceeded") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
    
        if (r5.equals("IdentificationInProgress") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        throw new ru.mts.biometry.api.FlowException(new ru.mts.biometry.api.entity.FlowStatus(ru.mts.biometry.api.entity.FlowStatus.DATA_ACCEPTED));
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r5) throws ru.mts.biometry.api.FlowException {
        /*
            r4 = this;
            boolean r0 = r5 instanceof U91.a
            if (r0 == 0) goto L13
            r0 = r5
            U91.a r0 = (U91.a) r0
            int r1 = r0.f16235s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16235s = r1
            goto L18
        L13:
            U91.a r0 = new U91.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f16233q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f16235s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.C42729a0.b(r5)
            r0.f16235s = r3
            ru.mts.biometry.api.d r5 = r4.f16241b
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            ru.mts.biometry.api.entity.state.ApiIdentificationState r5 = (ru.mts.biometry.api.entity.state.ApiIdentificationState) r5
            if (r5 == 0) goto L48
            java.lang.String r5 = r5.getStatus()
            goto L49
        L48:
            r5 = 0
        L49:
            if (r5 == 0) goto Laf
            int r0 = r5.hashCode()
            r1 = -1515066261(0xffffffffa5b1ec6b, float:-3.0864809E-16)
            if (r0 == r1) goto L99
            r1 = -152186976(0xfffffffff6edcfa0, float:-2.4116904E33)
            if (r0 == r1) goto L83
            r1 = 108666105(0x67a1cf9, float:4.704106E-35)
            if (r0 == r1) goto L6d
            r1 = 1954108275(0x74795373, float:7.9014555E31)
            if (r0 == r1) goto L64
            goto Laf
        L64:
            java.lang.String r0 = "IdentificationSucceeded"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L8c
            goto Laf
        L6d:
            java.lang.String r0 = "SystemError"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L76
            goto Laf
        L76:
            ru.mts.biometry.api.FlowException r5 = new ru.mts.biometry.api.FlowException
            ru.mts.biometry.api.entity.FlowStatus r0 = new ru.mts.biometry.api.entity.FlowStatus
            java.lang.String r1 = "systemError"
            r0.<init>(r1)
            r5.<init>(r0)
            goto Lae
        L83:
            java.lang.String r0 = "IdentificationInProgress"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L8c
            goto Laf
        L8c:
            ru.mts.biometry.api.FlowException r5 = new ru.mts.biometry.api.FlowException
            ru.mts.biometry.api.entity.FlowStatus r0 = new ru.mts.biometry.api.entity.FlowStatus
            java.lang.String r1 = "dataAccepted"
            r0.<init>(r1)
            r5.<init>(r0)
            goto Lae
        L99:
            java.lang.String r0 = "IdentificationFailed"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto La2
            goto Laf
        La2:
            ru.mts.biometry.api.FlowException r5 = new ru.mts.biometry.api.FlowException
            ru.mts.biometry.api.entity.FlowStatus r0 = new ru.mts.biometry.api.entity.FlowStatus
            java.lang.String r1 = "identificationFailed"
            r0.<init>(r1)
            r5.<init>(r0)
        Lae:
            throw r5
        Laf:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: U91.c.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r12) throws ru.mts.biometry.api.ApiException {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U91.c.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
