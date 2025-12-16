package com.avito.android.bxcontent.business360;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Business360ToastInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/business360/a;", "", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.onboarding_manager.f f109616a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f109617b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.bxcontent.analytics.a f109618c;

    /* compiled from: Business360ToastInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/bxcontent/business360/a$a;", "", "<init>", "()V", "", "FROM_PAGE_SERP", "Ljava/lang/String;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.business360.a$a, reason: collision with other inner class name */
    public static final class C3270a {
        public /* synthetic */ C3270a(C42822w c42822w) {
            this();
        }

        public C3270a() {
        }
    }

    static {
        new C3270a(null);
    }

    @Inject
    public a(@k com.avito.android.onboarding_manager.f fVar, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k com.avito.android.bxcontent.analytics.a aVar2) {
        this.f109616a = fVar;
        this.f109617b = aVar;
        this.f109618c = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k com.avito.android.remote.model.BxContentBusiness360.Toast r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.avito.android.bxcontent.business360.b
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.bxcontent.business360.b r0 = (com.avito.android.bxcontent.business360.b) r0
            int r1 = r0.f109623u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109623u = r1
            goto L18
        L13:
            com.avito.android.bxcontent.business360.b r0 = new com.avito.android.bxcontent.business360.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f109621s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f109623u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f109619q
            com.avito.android.remote.model.BxContentBusiness360$Toast r7 = (com.avito.android.remote.model.BxContentBusiness360.Toast) r7
            kotlin.C42729a0.b(r8)
            goto L99
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            com.avito.android.remote.model.BxContentBusiness360$Toast r7 = r0.f109620r
            java.lang.Object r2 = r0.f109619q
            com.avito.android.bxcontent.business360.a r2 = (com.avito.android.bxcontent.business360.a) r2
            kotlin.C42729a0.b(r8)
            goto L6b
        L42:
            kotlin.C42729a0.b(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "business360BxContentToastClicked_"
            r8.<init>(r2)
            java.lang.String r2 = r7.getShowId()
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            com.avito.android.onboarding_manager.f r2 = r6.f109616a
            kotlinx.coroutines.a0 r8 = r2.d(r8)
            r0.f109619q = r6
            r0.f109620r = r7
            r0.f109623u = r4
            java.lang.Object r8 = r8.F(r0)
            if (r8 != r1) goto L6a
            return r1
        L6a:
            r2 = r6
        L6b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto La6
            com.avito.android.onboarding_manager.f r8 = r2.f109616a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "business360BxContentToastShownCount_"
            r2.<init>(r5)
            java.lang.String r5 = r7.getShowId()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            kotlinx.coroutines.a0 r8 = r8.c(r2)
            r0.f109619q = r7
            r2 = 0
            r0.f109620r = r2
            r0.f109623u = r3
            java.lang.Object r8 = r8.F(r0)
            if (r8 != r1) goto L99
            return r1
        L99:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            int r7 = r7.getShowCount()
            if (r8 >= r7) goto La6
            goto La7
        La6:
            r4 = 0
        La7:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.business360.a.a(com.avito.android.remote.model.BxContentBusiness360$Toast, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
