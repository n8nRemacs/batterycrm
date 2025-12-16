package com.avito.beduin.v2.interaction.sequence.flow;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.interaction.sequence.flow.SequenceInteraction;
import com.huawei.hms.adapter.internal.AvailableCode;
import dU0.f;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SequenceInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LdU0/f;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.beduin.v2.interaction.sequence.flow.SequenceInteractionHandler$handle$1", f = "SequenceInteractionHandler.kt", i = {0, 0}, l = {23, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {"$this$transaction_u24default$iv", "key$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super f>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public String f337851q;

    /* renamed from: r, reason: collision with root package name */
    public int f337852r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f337853s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SequenceInteraction f337854t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36238a f337855u;

    /* compiled from: SequenceInteractionHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[SequenceInteraction.StateChangePolicy.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SequenceInteraction.StateChangePolicy stateChangePolicy = SequenceInteraction.StateChangePolicy.f337840b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SequenceInteraction sequenceInteraction, InterfaceC36238a interfaceC36238a, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f337854t = sequenceInteraction;
        this.f337855u = interfaceC36238a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        d dVar = new d(this.f337854t, this.f337855u, continuation);
        dVar.f337853s = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super f> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        String str;
        InterfaceC36238a interfaceC36238a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f337852r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f337853s;
            SequenceInteraction sequenceInteraction = this.f337854t;
            int iOrdinal = sequenceInteraction.f337839b.ordinal();
            ?? r12 = sequenceInteraction.f337838a;
            if (iOrdinal == 0) {
                e eVar = e.f337856c;
                this.f337852r = 2;
                if (eVar.q(interfaceC43172j, r12, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (iOrdinal == 1) {
                String strA = com.avito.beduin.v2.engine.utils.f.a();
                InterfaceC36238a interfaceC36238a2 = this.f337855u;
                interfaceC36238a2.h(strA);
                e eVar2 = e.f337856c;
                this.f337853s = interfaceC36238a2;
                this.f337851q = strA;
                this.f337852r = 1;
                if (eVar2.q(interfaceC43172j, r12, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = strA;
                interfaceC36238a = interfaceC36238a2;
                interfaceC36238a.i(str);
            }
        } else if (i12 == 1) {
            str = this.f337851q;
            interfaceC36238a = (InterfaceC36238a) this.f337853s;
            C42729a0.b(obj);
            interfaceC36238a.i(str);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
