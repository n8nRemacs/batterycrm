package com.avito.avcalls.android.call;

import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.avcalls.android.logger.g;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import xQ0.f;
import xQ0.k;

/* compiled from: CallSession.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.call.CallSession$1", f = "CallSession.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.avcalls.android.call.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36184l extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f331527q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC36187o f331528r;

    /* compiled from: CallSession.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LxQ0/b;", VoiceInfo.STATE, "", "isConnected", "Lkotlin/Q;", "LxQ0/f;", "<anonymous>", "(LxQ0/b;Z)Lkotlin/Q;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.avcalls.android.call.CallSession$1$1", f = "CallSession.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.avcalls.android.call.l$a */
    public static final class a extends SuspendLambda implements Y41.q<xQ0.b, Boolean, Continuation<? super kotlin.Q<? extends xQ0.f, ? extends Boolean>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ xQ0.b f331529q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ boolean f331530r;

        public a() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(xQ0.b bVar, Boolean bool, Continuation<? super kotlin.Q<? extends xQ0.f, ? extends Boolean>> continuation) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = new a(3, continuation);
            aVar.f331529q = bVar;
            aVar.f331530r = zBooleanValue;
            return aVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return new kotlin.Q(this.f331529q.f442471d, Boxing.boxBoolean(this.f331530r));
        }
    }

    /* compiled from: CallSession.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "LxQ0/f;", "", "<name for destructuring parameter 0>", "Lkotlin/G0;", "emit", "(Lkotlin/Q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.avcalls.android.call.l$b */
    public static final class b<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC36187o f331531b;

        public b(AbstractC36187o abstractC36187o) {
            this.f331531b = abstractC36187o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            kotlin.Q q12 = (kotlin.Q) obj;
            xQ0.f fVar = (xQ0.f) q12.f406619b;
            boolean zBooleanValue = ((Boolean) q12.f406620c).booleanValue();
            com.avito.avcalls.android.logger.g.INSTANCE.getClass();
            g.Companion.c("CallSession", "state: invitingState=" + fVar + ", isConnected=" + zBooleanValue);
            if (fVar instanceof f.a) {
                AbstractC36187o abstractC36187o = this.f331531b;
                if (abstractC36187o.f331588k == null) {
                    abstractC36187o.f331588k = Long.valueOf(System.currentTimeMillis());
                }
                if (zBooleanValue) {
                    abstractC36187o.f331586i.b();
                } else {
                    abstractC36187o.g(abstractC36187o.f331582e.getF331660h(), k.d.f442498b);
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36184l(AbstractC36187o abstractC36187o, Continuation<? super C36184l> continuation) {
        super(2, continuation);
        this.f331528r = abstractC36187o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C36184l(this.f331528r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C36184l) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f331527q;
        if (i12 == 0) {
            C42729a0.b(obj);
            AbstractC36187o abstractC36187o = this.f331528r;
            InterfaceC43160i interfaceC43160iR = C43175k.r(new C1(abstractC36187o.f331590m, abstractC36187o.f331585h.f331937t, new a(3, null)));
            b bVar = new b(abstractC36187o);
            this.f331527q = 1;
            if (interfaceC43160iR.collect(bVar, this) == coroutine_suspended) {
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
