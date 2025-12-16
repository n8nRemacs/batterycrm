package com.avito.android.onboarding.step;

import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.bxcontent.N1;
import com.avito.android.onboarding.model.BxOnboardingStep;
import com.avito.android.user_viewed.feature.UserViewedTestGroup;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import ks0.InterfaceC43493a;
import zE0.C50451f;

/* compiled from: BxOnboardingUserViewedStepInteractorImpl.kt */
@s0
@com.avito.android.onboarding.J
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/onboarding/step/F;", "Lcom/avito/android/onboarding/E;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class F implements com.avito.android.onboarding.E {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f209154j = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f209155a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.E f209156b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final N1 f209157c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.timestamp_storage.domain.d f209158d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.persistance.b f209159e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43493a f209160f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f209161g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final u3.g<UserViewedTestGroup> f209162h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final BE0.a f209163i;

    /* compiled from: BxOnboardingUserViewedStepInteractorImpl.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/avito/android/onboarding/step/F$a;", "", "<init>", "()V", "", "TOOLTIP_ANCHOR_OFFSET_DP", "I", "", "USER_VIEWED_EXPIRATION_DAYS", "J", "", "USER_VIEWED_GROUP_ANALYTICS_TAG", "Ljava/lang/String;", "USER_VIEWED_TIMESTAMP_POSTFIX", "USER_VIEWED_TOOLTIP_EXPIRATION_DAYS", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public F(@Y61.k Context context, @Y61.k com.avito.android.account.E e12, @Y61.k N1 n12, @Y61.k com.avito.android.timestamp_storage.domain.d dVar, @Y61.k com.avito.android.advert.viewed.persistance.b bVar, @Y61.k InterfaceC43493a interfaceC43493a, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k u3.g<UserViewedTestGroup> gVar, @Y61.k BE0.a aVar) {
        this.f209155a = context;
        this.f209156b = e12;
        this.f209157c = n12;
        this.f209158d = dVar;
        this.f209159e = bVar;
        this.f209160f = interfaceC43493a;
        this.f209161g = interfaceC28373a;
        this.f209162h = gVar;
        this.f209163i = aVar;
    }

    @Override // com.avito.android.onboarding.E
    @Y61.l
    public final BxOnboardingStep a(@Y61.k BxOnboardingStep bxOnboardingStep) {
        StringBuilder sb2 = new StringBuilder("userViewedAbTest.group.tooltip.");
        u3.g<UserViewedTestGroup> gVar = this.f209162h;
        sb2.append(gVar.f439742a.f439749b.name());
        this.f209161g.c(new y.a(sb2.toString(), 0L, 2, null));
        gVar.b();
        if (this.f209163i.v().invoke().booleanValue()) {
            C50451f.f443984a.getClass();
            this.f209158d.a(C50451f.f443985b);
        } else {
            this.f209157c.d("USER_VIEWED_TIMESTAMP_POSTFIX");
        }
        UserViewedTestGroup userViewedTestGroup = gVar.f439742a.f439749b;
        userViewedTestGroup.getClass();
        if (userViewedTestGroup == UserViewedTestGroup.f318388d || userViewedTestGroup == UserViewedTestGroup.f318389e) {
            return bxOnboardingStep;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.onboarding.E
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.avito.android.onboarding.step.G
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.onboarding.step.G r0 = (com.avito.android.onboarding.step.G) r0
            int r1 = r0.f209167t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f209167t = r1
            goto L18
        L13:
            com.avito.android.onboarding.step.G r0 = new com.avito.android.onboarding.step.G
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f209165r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f209167t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.onboarding.step.F r0 = r0.f209164q
            kotlin.C42729a0.b(r8)
            goto L42
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            kotlin.C42729a0.b(r8)
            r0.f209164q = r7
            r0.f209167t = r3
            java.lang.Object r8 = r7.d(r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            r0 = r7
        L42:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L71
            r0.getClass()
            com.avito.android.onboarding.model.BxOnboardingStep$View$Tooltip r8 = new com.avito.android.onboarding.model.BxOnboardingStep$View$Tooltip
            com.avito.android.bottom_navigation.NavigationTab r2 = com.avito.android.bottom_navigation.NavigationTab.f106971g
            android.content.Context r0 = r0.f209155a
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131957188(0x7f1315c4, float:1.9550953E38)
            java.lang.String r3 = r0.getString(r1)
            r0 = 2132024537(0x7f141cd9, float:1.9687553E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r0 = 6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Class<com.avito.android.onboarding.step.F> r6 = com.avito.android.onboarding.step.F.class
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            goto L72
        L71:
            r8 = 0
        L72:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.onboarding.step.F.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.avito.android.onboarding.step.H
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.onboarding.step.H r0 = (com.avito.android.onboarding.step.H) r0
            int r1 = r0.f209170s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f209170s = r1
            goto L18
        L13:
            com.avito.android.onboarding.step.H r0 = new com.avito.android.onboarding.step.H
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f209168q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f209170s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.C42729a0.b(r7)
            ms0.b r7 = new ms0.b
            r2 = 0
            r7.<init>(r2)
            r0.f209170s = r3
            ks0.a r2 = r6.f209160f
            java.lang.Object r7 = r2.a(r7, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            r0 = r7
            com.avito.android.remote.model.TypedResult r0 = (com.avito.android.remote.model.TypedResult) r0
            com.avito.android.onboarding.step.I r1 = com.avito.android.onboarding.step.I.f209171l
            com.avito.android.onboarding.step.J r2 = com.avito.android.onboarding.step.J.f209172l
            r3 = 0
            r4 = 0
            r5 = 60
            java.lang.Object r7 = com.avito.android.error.z.r(r0, r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.onboarding.step.F.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.onboarding.step.F.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.avito.android.onboarding.step.L
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.onboarding.step.L r0 = (com.avito.android.onboarding.step.L) r0
            int r1 = r0.f209179s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f209179s = r1
            goto L18
        L13:
            com.avito.android.onboarding.step.L r0 = new com.avito.android.onboarding.step.L
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f209177q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f209179s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.C42729a0.b(r7)
            r0.f209179s = r3
            com.avito.android.advert.viewed.persistance.b r7 = r6.f209159e
            java.lang.Object r7 = r7.f(r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            java.lang.Number r7 = (java.lang.Number) r7
            long r0 = r7.longValue()
            org.threeten.bp.e r7 = org.threeten.bp.e.L()
            r4 = 30
            org.threeten.bp.e r7 = r7.K(r4)
            long r4 = r7.v()
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 < 0) goto L58
            goto L59
        L58:
            r3 = 0
        L59:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.onboarding.step.F.e(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
