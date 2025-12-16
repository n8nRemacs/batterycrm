package com.avito.android.oauth.repository;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.X;
import f40.InterfaceC40231a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OAuthRepository.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/oauth/repository/c;", "", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC40231a f208462a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final X f208463b;

    @Inject
    public c(@k InterfaceC40231a interfaceC40231a, @k X x12) {
        this.f208462a = interfaceC40231a;
        this.f208463b = x12;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.avito.android.oauth.repository.b
            if (r0 == 0) goto L13
            r0 = r5
            com.avito.android.oauth.repository.b r0 = (com.avito.android.oauth.repository.b) r0
            int r1 = r0.f208461s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f208461s = r1
            goto L18
        L13:
            com.avito.android.oauth.repository.b r0 = new com.avito.android.oauth.repository.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f208459q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f208461s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r5)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.C42729a0.b(r5)
            com.avito.android.remote.X r5 = r4.f208463b
            io.reactivex.rxjava3.core.z r5 = r5.a()
            kotlinx.coroutines.flow.i r5 = kotlinx.coroutines.rx3.y.a(r5)
            r0.f208461s = r3
            java.lang.Object r5 = kotlinx.coroutines.flow.C43175k.A(r5, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            com.avito.android.remote.model.Profile r5 = (com.avito.android.remote.model.Profile) r5
            com.avito.android.oauth.repository.a r0 = new com.avito.android.oauth.repository.a
            if (r5 == 0) goto L53
            java.lang.String r1 = r5.getName()
            if (r1 != 0) goto L55
        L53:
            java.lang.String r1 = ""
        L55:
            if (r5 == 0) goto L5c
            com.avito.android.remote.model.Image r5 = r5.getAvatar()
            goto L5d
        L5c:
            r5 = 0
        L5d:
            r0.<init>(r1, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.oauth.repository.c.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
