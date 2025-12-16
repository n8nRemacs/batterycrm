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
import t3.InterfaceC48487s;
import zE0.C50447b;

/* compiled from: BxOnboardingFavoritesStepInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/onboarding/step/f;", "Lcom/avito/android/onboarding/E;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.onboarding.step.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32933f implements com.avito.android.onboarding.E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final N1 f209201a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.timestamp_storage.domain.d f209202b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Resources f209203c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f209204d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final u3.g<SimpleTestGroupWithNone> f209205e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final BE0.a f209206f;

    /* compiled from: BxOnboardingFavoritesStepInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/onboarding/step/f$a;", "", "<init>", "()V", "", "FAVORITES_GROUP_ANALYTICS_TAG", "Ljava/lang/String;", "FAVORITES_TIMESTAMP_POSTFIX", "", "TOOLTIP_ANCHOR_OFFSET_DP", "I", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.onboarding.step.f$a */
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
    public C32933f(@Y61.k N1 n12, @Y61.k com.avito.android.timestamp_storage.domain.d dVar, @Y61.k Resources resources, @Y61.k InterfaceC28373a interfaceC28373a, @InterfaceC48487s @Y61.k u3.g<SimpleTestGroupWithNone> gVar, @Y61.k BE0.a aVar) {
        this.f209201a = n12;
        this.f209202b = dVar;
        this.f209203c = resources;
        this.f209204d = interfaceC28373a;
        this.f209205e = gVar;
        this.f209206f = aVar;
    }

    @Override // com.avito.android.onboarding.E
    @Y61.l
    public final BxOnboardingStep a(@Y61.k BxOnboardingStep bxOnboardingStep) {
        StringBuilder sb2 = new StringBuilder("onboarding.favorites.unviewed.tooltip.group.");
        u3.g<SimpleTestGroupWithNone> gVar = this.f209205e;
        sb2.append(gVar.f439742a.f439749b.name());
        this.f209204d.c(new y.a(sb2.toString(), 0L, 2, null));
        gVar.b();
        if (this.f209206f.v().invoke().booleanValue()) {
            C50447b.f443974a.getClass();
            this.f209202b.a(C50447b.f443975b);
        } else {
            this.f209201a.d("FAVORITES_TIMESTAMP_POSTFIX");
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
    public final java.lang.Object b(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.avito.android.onboarding.step.C32934g
            if (r0 == 0) goto L13
            r0 = r11
            com.avito.android.onboarding.step.g r0 = (com.avito.android.onboarding.step.C32934g) r0
            int r1 = r0.f209210t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f209210t = r1
            goto L18
        L13:
            com.avito.android.onboarding.step.g r0 = new com.avito.android.onboarding.step.g
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f209208r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f209210t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.onboarding.step.f r0 = r0.f209207q
            kotlin.C42729a0.b(r11)
            goto L92
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L33:
            kotlin.C42729a0.b(r11)
            u3.g<com.avito.android.ab_tests.groups.SimpleTestGroupWithNone> r11 = r10.f209205e
            u3.m<T> r11 = r11.f439742a
            T r11 = r11.f439749b
            com.avito.android.ab_tests.groups.SimpleTestGroupWithNone r11 = (com.avito.android.ab_tests.groups.SimpleTestGroupWithNone) r11
            boolean r11 = r11.a()
            if (r11 != 0) goto L55
            com.avito.android.analytics.statsd.y$a r2 = new com.avito.android.analytics.statsd.y$a
            r8 = 2
            r9 = 0
            java.lang.String r5 = "onboarding.favorites.unviewed.tooltip.group.NONE"
            r6 = 0
            r4 = r2
            r4.<init>(r5, r6, r8, r9)
            com.avito.android.analytics.a r4 = r10.f209204d
            r4.c(r2)
        L55:
            if (r11 == 0) goto Lbd
            r0.f209207q = r10
            r0.f209210t = r3
            BE0.a r11 = r10.f209206f
            DE0.a r11 = r11.v()
            java.lang.Object r11 = r11.invoke()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L76
            com.avito.android.timestamp_storage.domain.d r11 = r10.f209202b
            zE0.b r2 = zE0.C50447b.f443974a
            java.lang.Object r11 = r11.c(r2, r0)
            goto L8e
        L76:
            java.lang.String r11 = "FAVORITES_TIMESTAMP_POSTFIX"
            r4 = 31
            com.avito.android.bxcontent.N1 r0 = r10.f209201a
            boolean r11 = r0.b(r4, r11)
            if (r11 == 0) goto L89
            boolean r11 = r0.e()
            if (r11 == 0) goto L89
            goto L8a
        L89:
            r3 = 0
        L8a:
            java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
        L8e:
            if (r11 != r1) goto L91
            return r1
        L91:
            r0 = r10
        L92:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lbd
            r0.getClass()
            com.avito.android.onboarding.model.BxOnboardingStep$View$Tooltip r11 = new com.avito.android.onboarding.model.BxOnboardingStep$View$Tooltip
            com.avito.android.bottom_navigation.NavigationTab r2 = com.avito.android.bottom_navigation.NavigationTab.f106971g
            android.content.res.Resources r0 = r0.f209203c
            r1 = 2131957186(0x7f1315c2, float:1.9550949E38)
            java.lang.String r3 = r0.getString(r1)
            r0 = 2132024537(0x7f141cd9, float:1.9687553E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r0 = 6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Class<com.avito.android.onboarding.step.f> r6 = com.avito.android.onboarding.step.C32933f.class
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            goto Lbe
        Lbd:
            r11 = 0
        Lbe:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.onboarding.step.C32933f.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
