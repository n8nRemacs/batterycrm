package com.avito.beduin.v2.interaction.network.flow;

import SU0.m;
import androidx.camera.camera2.internal.G;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.interaction.network.flow.a;
import com.avito.beduin.v2.interaction.network.flow.b;
import com.avito.beduin.v2.logger.LogLevel;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
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

/* compiled from: HttpRequestInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/beduin/v2/interaction/network/flow/b$b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.interaction.network.flow.HttpRequestInteractionHandler$call$1", f = "HttpRequestInteractionHandler.kt", i = {}, l = {191}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements Y41.p<I0<? super b.AbstractC10460b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f337598q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f337599r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.interaction.network.flow.b f337600s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.interaction.network.flow.a f337601t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C36272i f337602u;

    /* compiled from: HttpRequestInteractionHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/beduin/v2/interaction/network/flow/c$a", "LSU0/h;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements SU0.h {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.interaction.network.flow.b f337603a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C36272i f337604b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.interaction.network.flow.a f337605c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ I0<b.AbstractC10460b> f337606d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(com.avito.beduin.v2.interaction.network.flow.b bVar, C36272i c36272i, com.avito.beduin.v2.interaction.network.flow.a aVar, I0<? super b.AbstractC10460b> i02) {
            this.f337603a = bVar;
            this.f337604b = c36272i;
            this.f337605c = aVar;
            this.f337606d = i02;
        }

        /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Map] */
        @Override // SU0.h
        public final void a(int i12, @Y61.k String str, @Y61.l String str2) {
            Object bVar;
            com.avito.beduin.v2.interaction.network.flow.b bVar2 = this.f337603a;
            RU0.b bVar3 = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar3.getClass();
            if (1 >= RU0.b.f14469c) {
                RU0.b.f14468b.d(RU0.b.f14470d + ":HttpRequest", "request completed");
            }
            C36272i c36272i = this.f337604b;
            try {
                int i13 = Z.f406624c;
                m.b bVar4 = (m.b) bVar2.f337592d.f2188a.get(str2 != null ? (String) C42745f0.E(C43066x.f0(str2, new String[]{";"}, 0, 6)) : null);
                if (bVar4 == null) {
                    bVar4 = CU0.e.f2191a;
                }
                bVar = bVar4.a(i12, str, c36272i);
            } catch (Throwable th2) {
                int i14 = Z.f406624c;
                bVar = new Z.b(th2);
            }
            boolean z12 = bVar instanceof Z.b;
            I0<b.AbstractC10460b> i02 = this.f337606d;
            com.avito.beduin.v2.interaction.network.flow.a aVar = this.f337605c;
            if (!z12) {
                com.avito.beduin.v2.engine.field.d dVar = (com.avito.beduin.v2.engine.field.d) bVar;
                Y41.p<Integer, com.avito.beduin.v2.engine.field.d, Boolean> pVar = aVar.f337580k;
                boolean zBooleanValue = pVar != null ? ((Boolean) ((a.C10458a.d) pVar).invoke(Integer.valueOf(i12), dVar)).booleanValue() : bVar2.f337596h.a(i12, dVar);
                SU0.e eVar = aVar.f337579j;
                if (zBooleanValue) {
                    bVar2.f337595g.c(eVar);
                } else {
                    bVar2.f337595g.b(eVar, new Exception(G.e(i12, "network call completed (status=", "), predicate marked it as a failure")));
                }
                i02.w(new b.AbstractC10460b.C10461b(dVar, null));
                i02.h(null);
            }
            Throwable thB = Z.b(bVar);
            if (thB != null) {
                bVar2.f337595g.b(aVar.f337579j, new Exception("Parsing error", thB));
                i02.h(thB);
            }
        }

        @Override // SU0.h
        public final void b(int i12) {
            RU0.b bVar = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar.getClass();
            if (1 >= RU0.b.f14469c) {
                RU0.b.f14468b.d(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":HttpRequest"), "request call... [" + i12 + "%]");
            }
            b.AbstractC10460b.a aVar = new b.AbstractC10460b.a(new A(new Q("percent", this.f337604b.c(i12))), null);
            I0<b.AbstractC10460b> i02 = this.f337606d;
            if (i02.l()) {
                return;
            }
            i02.w(aVar);
        }

        @Override // SU0.h
        public final void onFailure(@Y61.k Exception exc) {
            Object bVar;
            com.avito.beduin.v2.interaction.network.flow.b bVar2 = this.f337603a;
            RU0.b bVar3 = RU0.b.f14467a;
            LogLevel[] logLevelArr = LogLevel.f337864b;
            bVar3.getClass();
            if (1 >= RU0.b.f14469c) {
                RU0.b.f14468b.d(RU0.b.f14470d + ":HttpRequest", "request failed");
            }
            C36272i c36272i = this.f337604b;
            try {
                int i12 = Z.f406624c;
                bVar = bVar2.f337592d.a(exc, c36272i);
            } catch (Throwable th2) {
                int i13 = Z.f406624c;
                bVar = new Z.b(th2);
            }
            boolean z12 = bVar instanceof Z.b;
            I0<b.AbstractC10460b> i02 = this.f337606d;
            if (!z12) {
                i02.w(new b.AbstractC10460b.C10461b((com.avito.beduin.v2.engine.field.d) bVar, null));
                i02.h(null);
            }
            Throwable thB = Z.b(bVar);
            if (thB != null) {
                i02.h(thB);
            }
            bVar2.f337595g.b(this.f337605c.f337579j, new Exception("Transport error", exc));
        }
    }

    /* compiled from: HttpRequestInteractionHandler.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.h<HV0.b> f337607l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0.h<HV0.b> hVar) {
            super(0);
            this.f337607l = hVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            HV0.b bVar = this.f337607l.f406842b;
            if (bVar != null) {
                bVar.close();
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.avito.beduin.v2.interaction.network.flow.b bVar, com.avito.beduin.v2.interaction.network.flow.a aVar, C36272i c36272i, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f337600s = bVar;
        this.f337601t = aVar;
        this.f337602u = c36272i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f337600s, this.f337601t, this.f337602u, continuation);
        cVar.f337599r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super b.AbstractC10460b> i02, Continuation<? super G0> continuation) {
        return ((c) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r8v9, types: [HV0.b, T] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object bVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f337598q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f337599r;
            com.avito.beduin.v2.interaction.network.flow.b bVar2 = this.f337600s;
            SU0.k kVar = bVar2.f337595g;
            com.avito.beduin.v2.interaction.network.flow.a aVar = this.f337601t;
            kVar.a(aVar.f337579j);
            l0.h hVar = new l0.h();
            try {
                int i13 = Z.f406624c;
                A a12 = aVar.f337575f;
                bVar = a12 != null ? bVar2.f337593e.b(a12) : null;
            } catch (Throwable th2) {
                int i14 = Z.f406624c;
                bVar = new Z.b(th2);
            }
            if (!(bVar instanceof Z.b)) {
                SU0.j jVar = (SU0.j) bVar;
                RU0.b bVar3 = RU0.b.f14467a;
                LogLevel[] logLevelArr = LogLevel.f337864b;
                bVar3.getClass();
                if (1 >= RU0.b.f14469c) {
                    RU0.b.f14468b.d(RU0.b.f14470d + ":HttpRequest", "request started...");
                }
                hVar.f406842b = bVar2.f337591c.a(aVar.f337570a, aVar.f337571b, aVar.f337572c, aVar.f337573d, aVar.f337574e, jVar, new a(bVar2, this.f337602u, aVar, i02));
            }
            Throwable thB = Z.b(bVar);
            if (thB != null) {
                RU0.b bVar4 = RU0.b.f14467a;
                LogLevel[] logLevelArr2 = LogLevel.f337864b;
                bVar4.getClass();
                if (4 >= RU0.b.f14469c) {
                    RU0.b.f14468b.e(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":HttpRequest"), "request serialization failed", thB);
                }
                bVar2.f337595g.b(aVar.f337579j, thB);
                i02.h(thB);
            }
            b bVar5 = new b(hVar);
            this.f337598q = 1;
            if (F0.a(i02, bVar5, this) == coroutine_suspended) {
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
