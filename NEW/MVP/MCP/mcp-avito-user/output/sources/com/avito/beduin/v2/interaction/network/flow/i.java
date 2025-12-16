package com.avito.beduin.v2.interaction.network.flow;

import SU0.m;
import androidx.camera.camera2.internal.G;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.interaction.network.flow.g;
import com.avito.beduin.v2.interaction.network.flow.h;
import com.avito.beduin.v2.logger.LogLevel;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;

/* compiled from: NetworkRequestInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/beduin/v2/interaction/network/flow/h$b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.interaction.network.flow.NetworkRequestInteractionHandler$call$1", f = "NetworkRequestInteractionHandler.kt", i = {}, l = {248}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class i extends SuspendLambda implements Y41.p<I0<? super h.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f337655q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f337656r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f337657s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f337658t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C36272i f337659u;

    /* compiled from: NetworkRequestInteractionHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/beduin/v2/interaction/network/flow/i$a", "LSU0/h;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements SU0.h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f337660a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C36272i f337661b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f337662c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ I0<h.b> f337663d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(h hVar, C36272i c36272i, g gVar, I0<? super h.b> i02) {
            this.f337660a = hVar;
            this.f337661b = c36272i;
            this.f337662c = gVar;
            this.f337663d = i02;
        }

        /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Map] */
        @Override // SU0.h
        public final void a(int i12, @Y61.k String str, @Y61.l String str2) {
            Object bVar;
            boolean zA2;
            String str3;
            C36272i c36272i = this.f337661b;
            h hVar = this.f337660a;
            RU0.b bVar2 = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar2.getClass();
            if (1 >= RU0.b.f14469c) {
                RU0.b.f14468b.d(RU0.b.f14470d + ":NetworkRequest", "request completed");
            }
            try {
                int i13 = Z.f406624c;
                CU0.b bVar3 = hVar.f337642d;
                if (str2 != null) {
                    bVar3.getClass();
                    str3 = (String) C42745f0.E(C43066x.f0(str2, new String[]{";"}, 0, 6));
                } else {
                    str3 = null;
                }
                m.b bVar4 = (m.b) bVar3.f2184a.get(str3);
                if (bVar4 == null) {
                    bVar4 = CU0.f.f2192a;
                }
                bVar = bVar4.b(c36272i, str);
            } catch (Throwable th2) {
                int i14 = Z.f406624c;
                bVar = new Z.b(th2);
            }
            boolean z12 = bVar instanceof Z.b;
            I0<h.b> i02 = this.f337663d;
            g gVar = this.f337662c;
            if (!z12) {
                com.avito.beduin.v2.engine.field.d dVar = (com.avito.beduin.v2.engine.field.d) bVar;
                h.b.d.a aVar = new h.b.d.a(i12, dVar);
                Y41.p<Integer, com.avito.beduin.v2.engine.field.d, Boolean> pVar = gVar.f337629k;
                if (pVar != null) {
                    zA2 = ((Boolean) ((g.a.d) pVar).invoke(Integer.valueOf(i12), aVar.a(c36272i))).booleanValue();
                } else {
                    zA2 = hVar.f337646h.a(i12, dVar);
                }
                SU0.e eVar = gVar.f337628j;
                if (zA2) {
                    hVar.f337645g.c(eVar);
                } else {
                    hVar.f337645g.b(eVar, new Exception(G.e(i12, "network call completed (status=", "), predicate marked it as a failure")));
                }
                i02.w(new h.b.d(aVar, zA2));
                i02.h(null);
            }
            Throwable thB = Z.b(bVar);
            if (thB != null) {
                i02.w(new h.b.InterfaceC10464b.C10465b(i12, thB));
                hVar.f337645g.b(gVar.f337628j, new Exception("Parsing error", thB));
                i02.h(null);
            }
        }

        @Override // SU0.h
        public final void b(int i12) {
            RU0.b bVar = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (1 >= RU0.b.f14469c) {
                RU0.b.f14468b.d(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":NetworkRequest"), "call... [" + i12 + "%]");
            }
            I0<h.b> i02 = this.f337663d;
            if (i02.l()) {
                return;
            }
            i02.w(new h.b.c(i12));
        }

        @Override // SU0.h
        public final void onFailure(@Y61.k Exception exc) {
            RU0.b bVar = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (1 >= RU0.b.f14469c) {
                RU0.b.f14468b.d(RU0.b.f14470d + ":NetworkRequest", "request failed");
            }
            h.b.InterfaceC10464b.c cVar = new h.b.InterfaceC10464b.c(exc);
            I0<h.b> i02 = this.f337663d;
            i02.w(cVar);
            this.f337660a.f337645g.b(this.f337662c.f337628j, new Exception("Transport error", exc));
            i02.h(null);
        }
    }

    /* compiled from: NetworkRequestInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.h<HV0.b> f337664l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0.h<HV0.b> hVar) {
            super(0);
            this.f337664l = hVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            HV0.b bVar = this.f337664l.f406842b;
            if (bVar != null) {
                bVar.close();
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, h hVar, C36272i c36272i, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f337657s = gVar;
        this.f337658t = hVar;
        this.f337659u = c36272i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f337657s, this.f337658t, this.f337659u, continuation);
        iVar.f337656r = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super h.b> i02, Continuation<? super G0> continuation) {
        return ((i) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [HV0.b, T] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object bVar;
        h hVar = this.f337658t;
        g gVar = this.f337657s;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f337655q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f337656r;
            l0.h hVar2 = new l0.h();
            try {
                int i13 = Z.f406624c;
                A a12 = gVar.f337624f;
                bVar = a12 != null ? hVar.f337643e.b(a12) : null;
            } catch (Throwable th2) {
                int i14 = Z.f406624c;
                bVar = new Z.b(th2);
            }
            if (!(bVar instanceof Z.b)) {
                SU0.j jVar = (SU0.j) bVar;
                RU0.b bVar2 = RU0.b.f14467a;
                LogLevel[] logLevelArr = LogLevel.f337864b;
                bVar2.getClass();
                if (1 >= RU0.b.f14469c) {
                    RU0.b.f14468b.d(RU0.b.f14470d + ":NetworkRequest", "request started...");
                }
                hVar2.f406842b = hVar.f337641c.a(gVar.f337619a, gVar.f337620b, gVar.f337621c, gVar.f337622d, gVar.f337623e, jVar, new a(hVar, this.f337659u, gVar, i02));
            }
            Throwable thB = Z.b(bVar);
            if (thB != null) {
                RU0.b bVar3 = RU0.b.f14467a;
                LogLevel[] logLevelArr2 = LogLevel.f337864b;
                bVar3.getClass();
                if (4 >= RU0.b.f14469c) {
                    RU0.b.f14468b.e(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":NetworkRequest"), "request serialization failed", thB);
                }
                i02.h(thB);
            }
            b bVar4 = new b(hVar2);
            this.f337655q = 1;
            if (F0.a(i02, bVar4, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
