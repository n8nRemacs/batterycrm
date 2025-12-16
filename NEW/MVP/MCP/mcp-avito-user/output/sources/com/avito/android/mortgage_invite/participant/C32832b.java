package com.avito.android.mortgage_invite.participant;

import android.app.Activity;
import android.content.Context;
import com.avito.android.util.C35835l0;
import com.avito.android.util.H2;
import com.avito.android.util.K2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;

/* compiled from: ParticipantFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.participant.ParticipantFragment$keyboardFlow$2$1", f = "ParticipantFragment.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage_invite.participant.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32832b extends SuspendLambda implements Y41.p<I0<? super Boolean>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f206063q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f206064r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ParticipantFragment f206065s;

    /* compiled from: ParticipantFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mortgage_invite.participant.b$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ H2 f206066l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(H2 h22) {
            super(0);
            this.f206066l = h22;
        }

        @Override // Y41.a
        public final G0 invoke() {
            H2 h22 = this.f206066l;
            if (h22 != null) {
                h22.dispose();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ParticipantFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "keyboardShown", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.mortgage_invite.participant.b$b, reason: collision with other inner class name */
    public static final class C6140b extends kotlin.jvm.internal.N implements Y41.l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I0<Boolean> f206067l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6140b(I0<? super Boolean> i02) {
            super(1);
            this.f206067l = i02;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            Boolean bool2 = bool;
            bool2.getClass();
            kotlinx.coroutines.channels.D.c(this.f206067l, bool2);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32832b(ParticipantFragment participantFragment, Continuation<? super C32832b> continuation) {
        super(2, continuation);
        this.f206065s = participantFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32832b c32832b = new C32832b(this.f206065s, continuation);
        c32832b.f206064r = obj;
        return c32832b;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super Boolean> i02, Continuation<? super G0> continuation) {
        return ((C32832b) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Activity activityA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f206063q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f206064r;
            Context context = this.f206065s.getContext();
            a aVar = new a((context == null || (activityA = C35835l0.a(context)) == null) ? null : K2.a(activityA, new C6140b(i02)));
            this.f206063q = 1;
            if (F0.a(i02, aVar, this) == coroutine_suspended) {
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
