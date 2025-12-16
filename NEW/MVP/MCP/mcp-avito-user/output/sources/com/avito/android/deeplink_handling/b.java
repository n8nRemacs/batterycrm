package com.avito.android.deeplink_handling;

import Ju.AbstractC14250d;
import Y41.l;
import Y41.p;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink.JobApplyCreateLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.error.z;
import com.avito.android.remote.model.TypedResult;
import gd.C40662b;
import gd.InterfaceC40661a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;
import tv.InterfaceC48726a;
import uv.C49116a;

/* compiled from: JobApplyCreateDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.deeplink_handling.JobApplyCreateDeeplinkHandler$doHandle$1$1", f = "JobApplyCreateDeeplinkHandler.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f134712q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f134713r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Bundle f134714s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ JobApplyCreateLink f134715t;

    /* compiled from: JobApplyCreateDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltv/a;", "action", "Lkotlin/G0;", "invoke", "(Ltv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<InterfaceC48726a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f134716l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ JobApplyCreateLink f134717m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, JobApplyCreateLink jobApplyCreateLink) {
            super(1);
            this.f134716l = dVar;
            this.f134717m = jobApplyCreateLink;
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC48726a interfaceC48726a) {
            InterfaceC48726a interfaceC48726a2 = interfaceC48726a;
            d dVar = this.f134716l;
            if (interfaceC48726a2 != null) {
                dVar.f134724h.g(null, false);
                if (interfaceC48726a2 instanceof InterfaceC48726a.b) {
                    CreateChannelLink createChannelLink = this.f134717m.f134080c;
                    dVar.b();
                    dVar.j(new JobApplyCreateLink.b.a(createChannelLink));
                } else if (interfaceC48726a2 instanceof InterfaceC48726a.c) {
                    dVar.j(new JobApplyCreateLink.b.C4032b(((InterfaceC48726a.c) interfaceC48726a2).f439662a));
                } else if (interfaceC48726a2 instanceof InterfaceC48726a.C12693a) {
                    DeepLink deepLink = ((InterfaceC48726a.C12693a) interfaceC48726a2).f439660a;
                    if (deepLink != null) {
                        b.a.a(dVar.f134723g, deepLink, null, null, 6);
                    }
                    dVar.j(AbstractC14250d.c.f9171c);
                }
            } else {
                d.k(dVar);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: JobApplyCreateDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.deeplink_handling.b$b, reason: collision with other inner class name */
    public static final class C4064b extends N implements l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f134718l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4064b(d dVar) {
            super(1);
            this.f134718l = dVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            d.k(this.f134718l);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Bundle bundle, JobApplyCreateLink jobApplyCreateLink, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f134713r = dVar;
        this.f134714s = bundle;
        this.f134715t = jobApplyCreateLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
        return new b(this.f134713r, this.f134714s, this.f134715t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f134712q;
        d dVar = this.f134713r;
        JobApplyCreateLink jobApplyCreateLink = this.f134715t;
        if (i12 == 0) {
            C42729a0.b(obj);
            C40662b c40662b = dVar.f134726j.get();
            Bundle bundle = this.f134714s;
            InterfaceC40661a interfaceC40661aA = com.avito.android.api.converter.c.a(c40662b, new C49116a(bundle));
            String str = jobApplyCreateLink.f134079b;
            boolean z12 = false;
            if (bundle != null && bundle.getBoolean("key_disclaimer_pd")) {
                z12 = true;
            }
            Boolean boolBoxBoolean = Boxing.boxBoolean(z12);
            this.f134712q = 1;
            obj = interfaceC40661aA.a(str, boolBoxBoolean, jobApplyCreateLink.f134081d, jobApplyCreateLink.f134082e, jobApplyCreateLink.f134083f, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        z.o((TypedResult) obj, new a(dVar, jobApplyCreateLink), new C4064b(dVar), null, 60);
        return G0.f406611a;
    }
}
