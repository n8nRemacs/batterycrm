package Fc1;

import android.app.Activity;
import feedback.shared.sdk.api.network.entities.Campaign;
import feedback.shared.sdk.api.network.entities.CampaignInfo;
import feedback.shared.sdk.api.network.entities.TriggerTargeting;
import java.util.List;
import kotlin.C42729a0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@DebugMetadata(c = "feedback.shared.sdk.FeedbackSDK$startCampaign$1", f = "FeedbackSDK.kt", i = {1}, l = {110, 123, 128}, m = "invokeSuspend", n = {"currentCampaign"}, s = {"L$0"})
/* renamed from: Fc1.k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13650k extends SuspendLambda implements Y41.p<List<? extends Campaign>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f5610q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5611r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C13641j f5612s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f5613t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C13682n4 f5614u;

    @DebugMetadata(c = "feedback.shared.sdk.FeedbackSDK$startCampaign$1$1$1", f = "FeedbackSDK.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: Fc1.k$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C13641j f5615q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Campaign f5616r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f5617s;

        /* renamed from: Fc1.k$a$a, reason: collision with other inner class name */
        public static final class C0298a extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ C13641j f5618l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ String f5619m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ Campaign f5620n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0298a(C13641j c13641j, String str, Campaign campaign) {
                super(0);
                this.f5618l = c13641j;
                this.f5619m = str;
                this.f5620n = campaign;
            }

            @Override // Y41.a
            public final kotlin.G0 invoke() {
                C13641j c13641j = this.f5618l;
                C13611f5 c13611f5 = c13641j.f5585b;
                if (c13611f5 == null) {
                    c13611f5 = null;
                }
                xyz.n.a.j2 j2Var = xyz.n.a.j2.CAMPAIGN_STARTED;
                StringBuilder sb2 = new StringBuilder();
                String str = this.f5619m;
                sb2.append(str);
                sb2.append(" (campaignId = ");
                Campaign campaign = this.f5620n;
                sb2.append(campaign.getCampaignId());
                sb2.append(')');
                c13611f5.c(j2Var, sb2.toString());
                C13729s7 c13729s7 = c13641j.f5586c;
                C13729s7 c13729s72 = c13729s7 != null ? c13729s7 : null;
                int campaignId = campaign.getCampaignId();
                com.avito.android.ux.feedback.impl.q qVar = c13729s72.f5825a;
                if (qVar != null) {
                    qVar.a(campaignId, str);
                }
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C13641j c13641j, Campaign campaign, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f5615q = c13641j;
            this.f5616r = campaign;
            this.f5617s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f5615q, this.f5616r, this.f5617s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C13641j c13641j = this.f5615q;
            C13683n5 c13683n5 = c13641j.f5589f;
            if (c13683n5 == null) {
                c13683n5 = null;
            }
            Campaign campaign = this.f5616r;
            CampaignInfo campaignInfo = campaign.getCampaignInfo();
            Q q12 = c13641j.f5584a;
            C0298a c0298a = new C0298a(c13641j, this.f5617s, campaign);
            c13683n5.getClass();
            L3 l32 = c13683n5.f5701a;
            Activity activityD = l32.d();
            if (activityD != null ? activityD.getWindow().getDecorView().getRootView().isShown() : false) {
                TriggerTargeting trigger = campaignInfo.getTargeting().getTrigger();
                if (trigger == null || trigger.getValue() == null) {
                    kotlin.jvm.internal.u0 u0Var = kotlin.jvm.internal.u0.f406856a;
                }
                c13683n5.f5703c = new C13629h5(l32.c(), campaignInfo, q12);
                l32.a(c13683n5.f5702b);
                try {
                    c0298a.invoke();
                } catch (Exception unused) {
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13650k(C13641j c13641j, String str, C13682n4 c13682n4, Continuation continuation) {
        super(2, continuation);
        this.f5612s = c13641j;
        this.f5613t = str;
        this.f5614u = c13682n4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C13650k c13650k = new C13650k(this.f5612s, this.f5613t, this.f5614u, continuation);
        c13650k.f5611r = obj;
        return c13650k;
    }

    @Override // Y41.p
    public final Object invoke(List<? extends Campaign> list, Continuation<? super kotlin.G0> continuation) {
        return ((C13650k) create(list, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x022f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r21) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.C13650k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
