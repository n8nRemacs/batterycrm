package com.avito.android.bxcontent.business360;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BxContentReplaceMainExitOnboardingInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/business360/d;", "", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.replace_main.exit_onboarding.b f109627a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.onboarding_manager.f f109628b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.bxcontent.analytics.a f109629c;

    /* compiled from: BxContentReplaceMainExitOnboardingInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/bxcontent/business360/d$a;", "", "<init>", "()V", "", "FROM_PAGE", "Ljava/lang/String;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public d(@k com.avito.android.replace_main.exit_onboarding.b bVar, @k com.avito.android.onboarding_manager.f fVar, @k com.avito.android.bxcontent.analytics.a aVar) {
        this.f109627a = bVar;
        this.f109628b = fVar;
        this.f109629c = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.avito.android.bxcontent.business360.e
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.bxcontent.business360.e r0 = (com.avito.android.bxcontent.business360.e) r0
            int r1 = r0.f109633t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109633t = r1
            goto L18
        L13:
            com.avito.android.bxcontent.business360.e r0 = new com.avito.android.bxcontent.business360.e
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f109631r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f109633t
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r0 = r0.f109630q
            com.avito.android.replace_main.exit_onboarding.ReplaceMainExitOnboarding r0 = (com.avito.android.replace_main.exit_onboarding.ReplaceMainExitOnboarding) r0
            kotlin.C42729a0.b(r8)
            goto L6d
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            java.lang.Object r2 = r0.f109630q
            com.avito.android.bxcontent.business360.d r2 = (com.avito.android.bxcontent.business360.d) r2
            kotlin.C42729a0.b(r8)
            goto L52
        L41:
            kotlin.C42729a0.b(r8)
            r0.f109630q = r7
            r0.f109633t = r5
            com.avito.android.replace_main.exit_onboarding.b r8 = r7.f109627a
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            r2 = r7
        L52:
            com.avito.android.replace_main.exit_onboarding.ReplaceMainExitOnboarding r8 = (com.avito.android.replace_main.exit_onboarding.ReplaceMainExitOnboarding) r8
            if (r8 != 0) goto L57
            return r3
        L57:
            com.avito.android.onboarding_manager.f r2 = r2.f109628b
            java.lang.String r5 = r8.f254500b
            kotlinx.coroutines.a0 r2 = r2.d(r5)
            r0.f109630q = r8
            r0.f109633t = r4
            java.lang.Object r0 = r2.F(r0)
            if (r0 != r1) goto L6a
            return r1
        L6a:
            r6 = r0
            r0 = r8
            r8 = r6
        L6d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L76
            return r3
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.business360.d.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
