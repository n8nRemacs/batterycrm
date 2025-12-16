package com.avito.android.mandatory_verification.data;

import Y61.k;
import com.avito.android.remote.H0;
import com.avito.android.remote.model.file_uploader.FileDeleteResult;
import com.avito.android.remote.model.file_uploader.FileUploadResult;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;
import okhttp3.MultipartBody;

/* compiled from: MandatoryVerificationRepositoryImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/data/g;", "Lcom/avito/android/mandatory_verification/data/d;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final QX.a f184422a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final H0 f184423b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f184424c;

    @Inject
    public g(@k QX.a aVar, @k H0 h02, @k a aVar2) {
        this.f184422a = aVar;
        this.f184423b = h02;
        this.f184424c = aVar2;
    }

    @Override // com.avito.android.mandatory_verification.data.d
    @k
    public final InterfaceC43160i<FileUploadResult> b(@k String str, @k MultipartBody.Part part) {
        return y.a(this.f184423b.b(str, part));
    }

    @Override // com.avito.android.mandatory_verification.data.d
    @k
    public final InterfaceC43160i<FileDeleteResult> c(@k String str, @k String str2) {
        return y.a(this.f184423b.c(str, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.mandatory_verification.data.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r5, @Y61.k java.lang.String r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.avito.android.mandatory_verification.data.f
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.mandatory_verification.data.f r0 = (com.avito.android.mandatory_verification.data.f) r0
            int r1 = r0.f184421t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184421t = r1
            goto L18
        L13:
            com.avito.android.mandatory_verification.data.f r0 = new com.avito.android.mandatory_verification.data.f
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f184419r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f184421t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.mandatory_verification.data.g r5 = r0.f184418q
            kotlin.C42729a0.b(r8)
            goto L4d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r8)
            SX.b r8 = new SX.b
            java.util.List r7 = java.util.Collections.singletonList(r7)
            r8.<init>(r5, r7)
            r0.f184418q = r4
            r0.f184421t = r3
            QX.a r5 = r4.f184422a
            java.lang.Object r8 = r5.a(r8, r0)
            if (r8 != r1) goto L4c
            return r1
        L4c:
            r5 = r4
        L4d:
            com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
            com.avito.android.mandatory_verification.data.a r5 = r5.f184424c
            boolean r6 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r6 == 0) goto L67
            com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
            java.lang.Object r6 = r8.getResult()
            SX.a r6 = (SX.a) r6
            OX.a r5 = r5.b(r6)
            com.avito.android.remote.model.TypedResult$Success r8 = new com.avito.android.remote.model.TypedResult$Success
            r8.<init>(r5)
            goto L6b
        L67:
            boolean r5 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L6c
        L6b:
            return r8
        L6c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mandatory_verification.data.g.d(long, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.mandatory_verification.data.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.avito.android.mandatory_verification.data.e
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.mandatory_verification.data.e r0 = (com.avito.android.mandatory_verification.data.e) r0
            int r1 = r0.f184417t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184417t = r1
            goto L18
        L13:
            com.avito.android.mandatory_verification.data.e r0 = new com.avito.android.mandatory_verification.data.e
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f184415r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f184417t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.mandatory_verification.data.g r5 = r0.f184414q
            kotlin.C42729a0.b(r7)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r7)
            RX.h r7 = new RX.h
            r7.<init>(r5)
            r0.f184414q = r4
            r0.f184417t = r3
            QX.a r5 = r4.f184422a
            java.lang.Object r7 = r5.b(r7, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            r5 = r4
        L49:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            com.avito.android.mandatory_verification.data.a r5 = r5.f184424c
            boolean r6 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r6 == 0) goto L63
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r6 = r7.getResult()
            RX.b r6 = (RX.b) r6
            com.avito.android.mandatory_verification.data.model.MandatoryVerificationData r5 = r5.a(r6)
            com.avito.android.remote.model.TypedResult$Success r7 = new com.avito.android.remote.model.TypedResult$Success
            r7.<init>(r5)
            goto L67
        L63:
            boolean r5 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r5 == 0) goto L68
        L67:
            return r7
        L68:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mandatory_verification.data.g.e(long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
