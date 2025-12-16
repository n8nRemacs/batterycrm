package com.avito.android.messenger.conversation.mvi.channel_feature;

import Y41.p;
import com.avito.android.messenger.conversation.mvi.channel_feature.a;
import com.avito.android.util.X2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ChannelActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/messenger/conversation/mvi/channel_feature/a$a;", "Lkotlinx/coroutines/flow/i;", "LMY/a;", "<name for destructuring parameter 0>", "LMY/d;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.ChannelActor$process$4", f = "ChannelActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class e extends SuspendLambda implements p<Q<? extends a.InterfaceC5598a, ? extends InterfaceC43160i<? extends MY.a>>, Continuation<? super InterfaceC43160i<? extends MY.d>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f189702q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.messenger.conversation.mvi.channel_feature.a f189703r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<MY.g> f189704s;

    /* compiled from: ChannelActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LMY/a;", "action", "Lkotlinx/coroutines/flow/i;", "LMY/d;", "<anonymous>", "(LMY/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.ChannelActor$process$4$1", f = "ChannelActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<MY.a, Continuation<? super InterfaceC43160i<? extends MY.d>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f189705q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.messenger.conversation.mvi.channel_feature.a f189706r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<MY.g> f189707s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC5598a f189708t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.messenger.conversation.mvi.channel_feature.a aVar, Y41.a<MY.g> aVar2, a.InterfaceC5598a interfaceC5598a, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f189706r = aVar;
            this.f189707s = aVar2;
            this.f189708t = interfaceC5598a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f189706r, this.f189707s, this.f189708t, continuation);
            aVar.f189705q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(MY.a aVar, Continuation<? super InterfaceC43160i<? extends MY.d>> continuation) {
            return ((a) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            MY.a aVar = (MY.a) this.f189705q;
            boolean z12 = aVar instanceof MY.l;
            com.avito.android.messenger.conversation.mvi.channel_feature.a aVar2 = this.f189706r;
            if (z12) {
                MY.f fVar = (MY.f) aVar;
                aVar2.getClass();
                if (!(fVar instanceof MY.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                return aVar2.f189690b.b((MY.l) fVar, aVar2.f189693e);
            }
            if (aVar instanceof MY.b) {
                this.f189707s.invoke();
                return aVar2.c((MY.b) aVar);
            }
            InterfaceC43160i interfaceC43160iW = C43175k.w();
            X2.f318778a.d(aVar2.f189692d, aVar + " can't be passed through and shouldn't be in group " + this.f189708t);
            return interfaceC43160iW;
        }
    }

    /* compiled from: ChannelActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LMY/a;", "action", "Lkotlinx/coroutines/flow/i;", "LMY/d;", "<anonymous>", "(LMY/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.ChannelActor$process$4$2", f = "ChannelActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<MY.a, Continuation<? super InterfaceC43160i<? extends MY.d>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f189709q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.messenger.conversation.mvi.channel_feature.a f189710r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<MY.g> f189711s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC5598a f189712t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.messenger.conversation.mvi.channel_feature.a aVar, Y41.a<MY.g> aVar2, a.InterfaceC5598a interfaceC5598a, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f189710r = aVar;
            this.f189711s = aVar2;
            this.f189712t = interfaceC5598a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f189710r, this.f189711s, this.f189712t, continuation);
            bVar.f189709q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(MY.a aVar, Continuation<? super InterfaceC43160i<? extends MY.d>> continuation) {
            return ((b) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            MY.a aVar = (MY.a) this.f189709q;
            boolean z12 = aVar instanceof MY.l;
            com.avito.android.messenger.conversation.mvi.channel_feature.a aVar2 = this.f189710r;
            if (z12) {
                MY.f fVar = (MY.f) aVar;
                aVar2.getClass();
                if (!(fVar instanceof MY.l)) {
                    throw new NoWhenBranchMatchedException();
                }
                return aVar2.f189690b.b((MY.l) fVar, aVar2.f189693e);
            }
            if (aVar instanceof MY.b) {
                this.f189711s.invoke();
                return aVar2.c((MY.b) aVar);
            }
            InterfaceC43160i interfaceC43160iW = C43175k.w();
            X2.f318778a.d(aVar2.f189692d, aVar + " can't be passed through and shouldn't be in group " + this.f189712t);
            return interfaceC43160iW;
        }
    }

    /* compiled from: ChannelActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LMY/a;", "action", "Lkotlinx/coroutines/flow/i;", "LMY/d;", "<anonymous>", "(LMY/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.ChannelActor$process$4$3", f = "ChannelActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<MY.a, Continuation<? super InterfaceC43160i<? extends MY.d>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f189713q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.messenger.conversation.mvi.channel_feature.a f189714r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC5598a f189715s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.messenger.conversation.mvi.channel_feature.a aVar, a.InterfaceC5598a interfaceC5598a, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f189714r = aVar;
            this.f189715s = interfaceC5598a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f189714r, this.f189715s, continuation);
            cVar.f189713q = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(MY.a aVar, Continuation<? super InterfaceC43160i<? extends MY.d>> continuation) {
            return ((c) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            MY.a aVar = (MY.a) this.f189713q;
            if (aVar instanceof MY.d) {
                return new C43210w(aVar);
            }
            InterfaceC43160i interfaceC43160iW = C43175k.w();
            X2.f318778a.d(this.f189714r.f189692d, aVar + " can't be passed through and shouldn't be in group " + this.f189715s);
            return interfaceC43160iW;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.avito.android.messenger.conversation.mvi.channel_feature.a aVar, Y41.a<MY.g> aVar2, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f189703r = aVar;
        this.f189704s = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f189703r, this.f189704s, continuation);
        eVar.f189702q = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends a.InterfaceC5598a, ? extends InterfaceC43160i<? extends MY.a>> q12, Continuation<? super InterfaceC43160i<? extends MY.d>> continuation) {
        return ((e) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f189702q;
        a.InterfaceC5598a interfaceC5598a = (a.InterfaceC5598a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean zF2 = L.f(interfaceC5598a, a.InterfaceC5598a.b.f189695a);
        Y41.a<MY.g> aVar = this.f189704s;
        com.avito.android.messenger.conversation.mvi.channel_feature.a aVar2 = this.f189703r;
        if (zF2) {
            return C43175k.B(new a(aVar2, aVar, interfaceC5598a, null), interfaceC43160i);
        }
        if (L.f(interfaceC5598a, a.InterfaceC5598a.c.f189696a)) {
            return C43175k.B(new b(aVar2, aVar, interfaceC5598a, null), interfaceC43160i);
        }
        if (L.f(interfaceC5598a, a.InterfaceC5598a.C5599a.f189694a)) {
            return C43175k.B(new c(aVar2, interfaceC5598a, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
