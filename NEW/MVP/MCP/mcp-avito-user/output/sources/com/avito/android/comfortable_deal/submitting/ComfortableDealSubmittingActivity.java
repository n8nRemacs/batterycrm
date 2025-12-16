package com.avito.android.comfortable_deal.submitting;

import Y61.k;
import android.os.Build;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import iq.C42088a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ComfortableDealSubmittingActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/ComfortableDealSubmittingActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComfortableDealSubmittingActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final a f122992n = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @k
    public final C42088a f122993m = new C42088a();

    /* compiled from: ComfortableDealSubmittingActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/comfortable_deal/submitting/ComfortableDealSubmittingActivity$a;", "", "<init>", "()V", "", "DEEPLINK", "Ljava/lang/String;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int L1() {
        return R.id.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(1, 0, 0);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(@Y61.l android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            if (r5 != 0) goto L84
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "linkBody"
            android.os.Parcelable r5 = r5.getParcelableExtra(r0)
            if (r5 == 0) goto L7c
            com.avito.android.deep_linking.links.DeepLink r5 = (com.avito.android.deep_linking.links.DeepLink) r5
            android.content.Intent r0 = r4.getIntent()
            android.os.Bundle r0 = r0.getExtras()
            iq.a r1 = r4.f122993m
            r1.getClass()
            boolean r1 = r5 instanceof com.avito.android.comfortable_deal.deeplink.PromoDeeplink
            r2 = 0
            if (r1 == 0) goto L30
            com.avito.android.comfortable_deal.submitting.promo.PromoFragment$a r5 = com.avito.android.comfortable_deal.submitting.promo.PromoFragment.f123100u0
            r5.getClass()
            com.avito.android.comfortable_deal.submitting.promo.PromoFragment r5 = new com.avito.android.comfortable_deal.submitting.promo.PromoFragment
            r5.<init>()
            goto L67
        L30:
            boolean r1 = r5 instanceof com.avito.android.comfortable_deal.deeplink.SubmittingSuccessLink
            if (r1 == 0) goto L3f
            com.avito.android.comfortable_deal.submitting.success.SubmittingSuccessFragment$a r5 = com.avito.android.comfortable_deal.submitting.success.SubmittingSuccessFragment.f123365t0
            r5.getClass()
            com.avito.android.comfortable_deal.submitting.success.SubmittingSuccessFragment r5 = new com.avito.android.comfortable_deal.submitting.success.SubmittingSuccessFragment
            r5.<init>()
            goto L67
        L3f:
            boolean r1 = r5 instanceof com.avito.android.comfortable_deal.deeplink.SubmittingSelectDeeplink
            if (r1 == 0) goto L57
            if (r0 == 0) goto L66
            java.lang.String r5 = "attrIdValue"
            java.lang.String r5 = r0.getString(r5)
            if (r5 == 0) goto L66
            com.avito.android.comfortable_deal.submitting.select.SubmittingSelectFragment$a r0 = com.avito.android.comfortable_deal.submitting.select.SubmittingSelectFragment.f123264w0
            r0.getClass()
            com.avito.android.comfortable_deal.submitting.select.SubmittingSelectFragment r5 = com.avito.android.comfortable_deal.submitting.select.SubmittingSelectFragment.a.a(r5)
            goto L67
        L57:
            boolean r5 = r5 instanceof com.avito.android.comfortable_deal.deeplink.OrderCallDeeplink
            if (r5 == 0) goto L66
            com.avito.android.comfortable_deal.submitting.ordercall.OrderCallFragment$a r5 = com.avito.android.comfortable_deal.submitting.ordercall.OrderCallFragment.f122994s0
            r5.getClass()
            com.avito.android.comfortable_deal.submitting.ordercall.OrderCallFragment r5 = new com.avito.android.comfortable_deal.submitting.ordercall.OrderCallFragment
            r5.<init>()
            goto L67
        L66:
            r5 = r2
        L67:
            if (r5 == 0) goto L84
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.H r0 = r0.e()
            r1 = 1
            r3 = 2131366445(0x7f0a122d, float:1.8352784E38)
            r0.j(r3, r5, r2, r1)
            r0.e()
            goto L84
        L7c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r5.<init>(r0)
            throw r5
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.submitting.ComfortableDealSubmittingActivity.onCreate(android.os.Bundle):void");
    }
}
