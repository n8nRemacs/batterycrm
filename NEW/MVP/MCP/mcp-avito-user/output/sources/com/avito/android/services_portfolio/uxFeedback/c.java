package com.avito.android.services_portfolio.uxFeedback;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.B2;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServicesPortfolioFeedbackHelperImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/services_portfolio/uxFeedback/c;", "Lcom/avito/android/services_portfolio/uxFeedback/b;", "a", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SK0.b f280397a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f280398b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final B2 f280399c;

    /* compiled from: ServicesPortfolioFeedbackHelperImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/services_portfolio/uxFeedback/c$a;", "", "<init>", "()V", "", "UX_FEEDBACK_DELAY", "J", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    public c(@k SK0.b bVar, @k h hVar, @k B2 b22) {
        this.f280397a = bVar;
        this.f280398b = hVar;
        this.f280399c = b22;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.services_portfolio.uxFeedback.b
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.avito.android.services_portfolio.uxFeedback.e
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.services_portfolio.uxFeedback.e r0 = (com.avito.android.services_portfolio.uxFeedback.e) r0
            int r1 = r0.f280404t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280404t = r1
            goto L18
        L13:
            com.avito.android.services_portfolio.uxFeedback.e r0 = new com.avito.android.services_portfolio.uxFeedback.e
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f280402r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f280404t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.avito.android.services_portfolio.uxFeedback.c r0 = r0.f280401q
            kotlin.C42729a0.b(r8)
            goto L7a
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            kotlin.C42729a0.b(r8)
            com.avito.android.B2 r8 = r7.f280399c
            DE0.a r8 = r8.x()
            java.lang.Object r8 = r8.invoke()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L92
            com.avito.android.services_portfolio.uxFeedback.h r8 = r7.f280398b
            AK0.l r8 = r8.f280405a
            java.lang.String r2 = "services_portfolio_widget_shown_key"
            java.util.Set r2 = r8.f(r2)
            if (r2 != 0) goto L56
            kotlin.collections.B0 r2 = kotlin.collections.B0.f406639b
        L56:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.LinkedHashSet r2 = kotlin.collections.C42745f0.O0(r2)
            int r2 = r2.size()
            r4 = 2
            if (r2 != r4) goto L92
            java.lang.String r2 = "services_portfolio_ux_feedback_shown_key"
            r4 = 0
            boolean r8 = r8.getBoolean(r2, r4)
            if (r8 != 0) goto L92
            r0.f280401q = r7
            r0.f280404t = r3
            r2 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r8 = kotlinx.coroutines.C43131e0.b(r2, r0)
            if (r8 != r1) goto L79
            return r1
        L79:
            r0 = r7
        L7a:
            r0.getClass()
            com.avito.android.services_portfolio.uxFeedback.d r5 = new com.avito.android.services_portfolio.uxFeedback.d
            r5.<init>(r0)
            com.avito.android.services_portfolio.uxFeedback.a r2 = new com.avito.android.services_portfolio.uxFeedback.a
            r2.<init>()
            SK0.b r1 = r0.f280397a
            r6 = 6
            r3 = 0
            r4 = 0
            SK0.b.a.a(r1, r2, r3, r4, r5, r6)
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        L92:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.services_portfolio.uxFeedback.c.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
