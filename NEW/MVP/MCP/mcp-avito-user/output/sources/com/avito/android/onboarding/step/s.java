package com.avito.android.onboarding.step;

import android.content.res.Resources;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.bxcontent.N1;
import com.avito.android.onboarding.model.BxOnboardingStep;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import ks0.InterfaceC43493a;
import t3.f0;
import zE0.C50449d;

/* compiled from: BxOnboardingPriceLoweredStepInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/onboarding/step/s;", "Lcom/avito/android/onboarding/E;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@com.avito.android.onboarding.C
/* loaded from: classes15.dex */
public final class s implements com.avito.android.onboarding.E {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f209228h = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43493a f209229a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final N1 f209230b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.timestamp_storage.domain.d f209231c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Resources f209232d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f209233e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final u3.g<SimpleTestGroupWithNone> f209234f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final BE0.a f209235g;

    /* compiled from: BxOnboardingPriceLoweredStepInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/onboarding/step/s$a;", "", "<init>", "()V", "", "PRICE_LOWERED_GROUP_ANALYTICS_TAG", "Ljava/lang/String;", "", "TOOLTIP_ANCHOR_OFFSET_DP", "I", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public s(@Y61.k InterfaceC43493a interfaceC43493a, @Y61.k N1 n12, @Y61.k com.avito.android.timestamp_storage.domain.d dVar, @Y61.k Resources resources, @Y61.k InterfaceC28373a interfaceC28373a, @f0 @Y61.k u3.g<SimpleTestGroupWithNone> gVar, @Y61.k BE0.a aVar) {
        this.f209229a = interfaceC43493a;
        this.f209230b = n12;
        this.f209231c = dVar;
        this.f209232d = resources;
        this.f209233e = interfaceC28373a;
        this.f209234f = gVar;
        this.f209235g = aVar;
    }

    @Override // com.avito.android.onboarding.E
    @Y61.l
    public final BxOnboardingStep a(@Y61.k BxOnboardingStep bxOnboardingStep) {
        StringBuilder sb2 = new StringBuilder("onboarding.favorites.price.tooltip.group.");
        u3.g<SimpleTestGroupWithNone> gVar = this.f209234f;
        sb2.append(gVar.f439742a.f439749b.name());
        this.f209233e.c(new y.a(sb2.toString(), 0L, 2, null));
        gVar.b();
        if (this.f209235g.v().invoke().booleanValue()) {
            C50449d.f443980a.getClass();
            this.f209231c.a(C50449d.f443981b);
        } else {
            this.f209230b.d("PRICE_LOWERED_TIMESTAMP_POSTFIX");
        }
        if (gVar.f439742a.f439749b.b()) {
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
            boolean r0 = r8 instanceof com.avito.android.onboarding.step.t
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.onboarding.step.t r0 = (com.avito.android.onboarding.step.t) r0
            int r1 = r0.f209239t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f209239t = r1
            goto L18
        L13:
            com.avito.android.onboarding.step.t r0 = new com.avito.android.onboarding.step.t
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f209237r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f209239t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.onboarding.step.s r0 = r0.f209236q
            kotlin.C42729a0.b(r8)
            goto L42
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            kotlin.C42729a0.b(r8)
            r0.f209236q = r7
            r0.f209239t = r3
            java.lang.Object r8 = r7.d(r0)
            if (r8 != r1) goto L41
            return r1
        L41:
            r0 = r7
        L42:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L6d
            r0.getClass()
            com.avito.android.onboarding.model.BxOnboardingStep$View$Tooltip r8 = new com.avito.android.onboarding.model.BxOnboardingStep$View$Tooltip
            com.avito.android.bottom_navigation.NavigationTab r2 = com.avito.android.bottom_navigation.NavigationTab.f106971g
            android.content.res.Resources r0 = r0.f209232d
            r1 = 2131957187(0x7f1315c3, float:1.955095E38)
            java.lang.String r3 = r0.getString(r1)
            r0 = 2132024537(0x7f141cd9, float:1.9687553E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r0 = 6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Class<com.avito.android.onboarding.step.s> r6 = com.avito.android.onboarding.step.s.class
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            goto L6e
        L6d:
            r8 = 0
        L6e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.onboarding.step.s.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.avito.android.onboarding.step.u
            if (r0 == 0) goto L13
            r0 = r7
            com.avito.android.onboarding.step.u r0 = (com.avito.android.onboarding.step.u) r0
            int r1 = r0.f209242s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f209242s = r1
            goto L18
        L13:
            com.avito.android.onboarding.step.u r0 = new com.avito.android.onboarding.step.u
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f209240q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f209242s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L40
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            kotlin.C42729a0.b(r7)
            r0.f209242s = r3
            ks0.a r7 = r6.f209229a
            r2 = 0
            java.lang.Object r7 = r7.b(r2, r0)
            if (r7 != r1) goto L40
            return r1
        L40:
            r0 = r7
            com.avito.android.remote.model.TypedResult r0 = (com.avito.android.remote.model.TypedResult) r0
            com.avito.android.onboarding.step.v r1 = com.avito.android.onboarding.step.v.f209243l
            com.avito.android.onboarding.step.w r2 = com.avito.android.onboarding.step.w.f209244l
            r3 = 0
            r4 = 0
            r5 = 60
            java.lang.Object r7 = com.avito.android.error.z.r(r0, r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.onboarding.step.s.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.avito.android.onboarding.step.x
            if (r0 == 0) goto L13
            r0 = r12
            com.avito.android.onboarding.step.x r0 = (com.avito.android.onboarding.step.x) r0
            int r1 = r0.f209248t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f209248t = r1
            goto L18
        L13:
            com.avito.android.onboarding.step.x r0 = new com.avito.android.onboarding.step.x
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f209246r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f209248t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.C42729a0.b(r12)
            goto La4
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L35:
            com.avito.android.onboarding.step.s r2 = r0.f209245q
            kotlin.C42729a0.b(r12)
            goto L90
        L3b:
            kotlin.C42729a0.b(r12)
            u3.g<com.avito.android.ab_tests.groups.SimpleTestGroupWithNone> r12 = r11.f209234f
            u3.m<T> r12 = r12.f439742a
            T r12 = r12.f439749b
            com.avito.android.ab_tests.groups.SimpleTestGroupWithNone r12 = (com.avito.android.ab_tests.groups.SimpleTestGroupWithNone) r12
            boolean r12 = r12.a()
            if (r12 != 0) goto L5d
            com.avito.android.analytics.statsd.y$a r2 = new com.avito.android.analytics.statsd.y$a
            r9 = 2
            r10 = 0
            java.lang.String r6 = "onboarding.favorites.price.tooltip.group.NONE"
            r7 = 0
            r5 = r2
            r5.<init>(r6, r7, r9, r10)
            com.avito.android.analytics.a r5 = r11.f209233e
            r5.c(r2)
        L5d:
            if (r12 == 0) goto La5
            r0.f209245q = r11
            r0.f209248t = r4
            BE0.a r12 = r11.f209235g
            DE0.a r12 = r12.v()
            java.lang.Object r12 = r12.invoke()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L7e
            com.avito.android.timestamp_storage.domain.d r12 = r11.f209231c
            zE0.d r2 = zE0.C50449d.f443980a
            java.lang.Object r12 = r12.b(r2, r0)
            goto L8c
        L7e:
            com.avito.android.bxcontent.N1 r12 = r11.f209230b
            java.lang.String r2 = "PRICE_LOWERED_TIMESTAMP_POSTFIX"
            r4 = 1
            boolean r12 = r12.b(r4, r2)
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r12)
        L8c:
            if (r12 != r1) goto L8f
            return r1
        L8f:
            r2 = r11
        L90:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto La5
            r12 = 0
            r0.f209245q = r12
            r0.f209248t = r3
            java.lang.Object r12 = r2.c(r0)
            if (r12 != r1) goto La4
            return r1
        La4:
            return r12
        La5:
            r12 = 0
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.onboarding.step.s.d(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
