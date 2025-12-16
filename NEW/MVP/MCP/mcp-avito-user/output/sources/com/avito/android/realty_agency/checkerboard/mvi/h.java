package com.avito.android.realty_agency.checkerboard.mvi;

import Ju.InterfaceC14249c;
import Zh0.InterfaceC19559a;
import Zh0.InterfaceC19561c;
import android.os.Bundle;
import com.avito.android.beduin.v2.page.m;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CheckerboardActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LZh0/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.realty_agency.checkerboard.mvi.CheckerboardActor$process$7", f = "CheckerboardActor.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC19561c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f251265q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f251266r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC19559a f251267s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34225a f251268t;

    /* compiled from: CheckerboardActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "it", "Lkotlinx/coroutines/flow/i;", "LZh0/c;", "<anonymous>", "(V)Lkotlinx/coroutines/flow/Flow;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.realty_agency.checkerboard.mvi.CheckerboardActor$process$7$1", f = "CheckerboardActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<G0, Continuation<? super InterfaceC43160i<? extends InterfaceC19561c>>, Object> {
        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(2, continuation);
        }

        @Override // Y41.p
        public final Object invoke(G0 g02, Continuation<? super InterfaceC43160i<? extends InterfaceC19561c>> continuation) {
            return ((a) create(g02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return C43175k.w();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InterfaceC19559a interfaceC19559a, C34225a c34225a, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f251267s = interfaceC19559a;
        this.f251268t = c34225a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f251267s, this.f251268t, continuation);
        hVar.f251266r = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC19561c> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f251265q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f251266r;
            InterfaceC14249c interfaceC14249c = ((InterfaceC19559a.g) this.f251267s).f20410b;
            if (interfaceC14249c instanceof m.c) {
                Bundle bundle = ((m.c) interfaceC14249c).f105170b;
                if (bundle == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                C0 c0B = C43175k.B(new a(2, null), this.f251268t.f251229c.a(Long.parseLong(bundle.getString("lotId", "")), bundle.getString("clientId", ""), bundle.getString("selectionName", "")));
                this.f251265q = 1;
                if (C43175k.u(this, c0B, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
