package Fc1;

import feedback.shared.sdk.api.network.entities.CampaignInfo;
import feedback.shared.sdk.api.network.entities.CampaignPagesResult;
import feedback.shared.sdk.api.network.entities.RequestType;
import feedback.shared.sdk.api.network.entities.TriggerTargeting;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.collections.C42756l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class V0 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    @Inject
    public C13611f5 f5244a;

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public U3 f5245b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public U1 f5246c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public I4 f5247d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public N1 f5248e;

    /* renamed from: f, reason: collision with root package name */
    @Inject
    public J2 f5249f;

    /* renamed from: g, reason: collision with root package name */
    @Inject
    public InterfaceC13753v4 f5250g;

    /* renamed from: h, reason: collision with root package name */
    @Inject
    public kotlinx.coroutines.T f5251h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f5252i = new LinkedHashMap();

    @DebugMetadata(c = "feedback.shared.sdk.ui.campaign.base.CampaignResultListenerImpl$onDone$1$1", f = "CampaignResultListenerImpl.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f5253q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ kotlin.Q<String, String> f5255s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.Q<String, String> q12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f5255s = q12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return V0.this.new a(this.f5255s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f5253q;
            if (i12 == 0) {
                C42729a0.b(obj);
                U3 u32 = V0.this.f5245b;
                if (u32 == null) {
                    u32 = null;
                }
                RequestType requestType = RequestType.POST_SCREENSHOT;
                this.f5253q = 1;
                if (u32.a(requestType, this.f5255s) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    @DebugMetadata(c = "feedback.shared.sdk.ui.campaign.base.CampaignResultListenerImpl$onDone$3", f = "CampaignResultListenerImpl.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f5256q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ CampaignPagesResult f5258s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CampaignPagesResult campaignPagesResult, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f5258s = campaignPagesResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return V0.this.new b(this.f5258s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f5256q;
            if (i12 == 0) {
                C42729a0.b(obj);
                U3 u32 = V0.this.f5245b;
                if (u32 == null) {
                    u32 = null;
                }
                RequestType requestType = RequestType.POST_ANSWERS;
                this.f5256q = 1;
                if (u32.a(requestType, this.f5258s) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    @DebugMetadata(c = "feedback.shared.sdk.ui.campaign.base.CampaignResultListenerImpl$onStart$1", f = "CampaignResultListenerImpl.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f5259q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ CampaignInfo f5261s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CampaignInfo campaignInfo, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f5261s = campaignInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return V0.this.new c(this.f5261s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f5259q;
            if (i12 == 0) {
                C42729a0.b(obj);
                U3 u32 = V0.this.f5245b;
                if (u32 == null) {
                    u32 = null;
                }
                RequestType requestType = RequestType.POST_VISITS;
                Integer numBoxInt = Boxing.boxInt(this.f5261s.getCampaignId());
                this.f5259q = 1;
                if (u32.a(requestType, numBoxInt) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    @Inject
    public V0() {
    }

    @Override // Fc1.G0
    public final void a(@Y61.k AbstractC13717r4 abstractC13717r4) {
        InterfaceC13753v4 interfaceC13753v4 = this.f5250g;
        if (interfaceC13753v4 == null) {
            interfaceC13753v4 = null;
        }
        if (interfaceC13753v4.o()) {
            this.f5252i.put(abstractC13717r4.f5783a.getId(), abstractC13717r4.f5784b.f5779d.toArray(new String[0]));
        }
    }

    @Override // Fc1.G0
    public final void b(@Y61.k CampaignPagesResult campaignPagesResult, @Y61.k CampaignInfo campaignInfo, boolean z12) {
        campaignPagesResult.getProperties().clear();
        Map<String, String> properties = campaignPagesResult.getProperties();
        J2 j22 = this.f5249f;
        if (j22 == null) {
            j22 = null;
        }
        properties.putAll(j22.f5034a);
        Iterator<T> it = campaignPagesResult.getScreenshots().iterator();
        while (it.hasNext()) {
            kotlin.Q q12 = (kotlin.Q) it.next();
            kotlinx.coroutines.T t12 = this.f5251h;
            if (t12 == null) {
                t12 = null;
            }
            C43259k.d(t12, null, null, new a(q12, null), 3);
        }
        String str = "";
        if (z12) {
            try {
                I4 i42 = this.f5247d;
                if (i42 == null) {
                    i42 = null;
                }
                int campaignId = campaignInfo.getCampaignId();
                TriggerTargeting trigger = campaignInfo.getTargeting().getTrigger();
                String value = trigger != null ? trigger.getValue() : null;
                if (value == null) {
                    value = "";
                }
                i42.a(campaignId, value);
            } catch (Exception unused) {
            }
            C13611f5 c13611f5 = this.f5244a;
            if (c13611f5 == null) {
                c13611f5 = null;
            }
            c13611f5.c(xyz.n.a.j2.CAMPAIGN_FINISH, "(campaignId = " + campaignPagesResult.getCampaignId() + ')');
        } else {
            try {
                I4 i43 = this.f5247d;
                if (i43 == null) {
                    i43 = null;
                }
                int campaignId2 = campaignInfo.getCampaignId();
                TriggerTargeting trigger2 = campaignInfo.getTargeting().getTrigger();
                String value2 = trigger2 != null ? trigger2.getValue() : null;
                if (value2 == null) {
                    value2 = "";
                }
                i43.b(campaignId2, campaignPagesResult.getPages().size(), value2, campaignInfo.getPages().size());
            } catch (Exception unused2) {
            }
            C13611f5 c13611f52 = this.f5244a;
            if (c13611f52 == null) {
                c13611f52 = null;
            }
            c13611f52.c(xyz.n.a.j2.CAMPAIGN_TERMINATED, "(campaignId = " + campaignPagesResult.getCampaignId() + ')', String.valueOf(campaignPagesResult.getPages().size()), String.valueOf(campaignInfo.getPages().size()));
        }
        LinkedHashMap linkedHashMap = this.f5252i;
        if (!linkedHashMap.isEmpty()) {
            C13611f5 c13611f53 = this.f5244a;
            if (c13611f53 == null) {
                c13611f53 = null;
            }
            xyz.n.a.j2 j2Var = xyz.n.a.j2.EVENT_FIELDS;
            String strValueOf = String.valueOf(campaignInfo.getCampaignId());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.P0.f(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), C42756l.P((Object[]) entry.getValue(), ",", null, null, null, 62));
            }
            c13611f53.c(j2Var, strValueOf, linkedHashMap2.toString());
            try {
                I4 i44 = this.f5247d;
                if (i44 == null) {
                    i44 = null;
                }
                int campaignId3 = campaignInfo.getCampaignId();
                TriggerTargeting trigger3 = campaignInfo.getTargeting().getTrigger();
                String value3 = trigger3 != null ? trigger3.getValue() : null;
                if (value3 != null) {
                    str = value3;
                }
                i44.a(linkedHashMap, str, campaignId3);
            } catch (Exception unused3) {
            }
            linkedHashMap.clear();
        }
        kotlinx.coroutines.T t13 = this.f5251h;
        if (t13 == null) {
            t13 = null;
        }
        C43259k.d(t13, null, null, new b(campaignPagesResult, null), 3);
        N1 n12 = this.f5248e;
        (n12 != null ? n12 : null).a();
    }

    @Override // Fc1.G0
    public final void c(@Y61.k CampaignInfo campaignInfo) {
        kotlinx.coroutines.T t12 = this.f5251h;
        if (t12 == null) {
            t12 = null;
        }
        C43259k.d(t12, null, null, new c(campaignInfo, null), 3);
        TriggerTargeting trigger = campaignInfo.getTargeting().getTrigger();
        if (trigger == null || !trigger.isMultiVisited()) {
            U1 u12 = this.f5246c;
            if (u12 == null) {
                u12 = null;
            }
            int campaignId = campaignInfo.getCampaignId();
            u12.f5209a.getWritableDatabase().delete("CAMPAIGNS_LIST", "CAMPAIGN_ID=" + campaignId, null);
        }
    }
}
