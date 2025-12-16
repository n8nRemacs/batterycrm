package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import MY.k;
import NY.f;
import com.avito.android.arch.mvi.utils.o;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import java.util.List;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadWriteAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/q"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.channel_feature.message_list.MessageListActorDelegateImpl$process$$inlined$flowWithAccessToMutableStateFrom$9", f = "MessageListActorDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.w, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31983w extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MY.d>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f190110q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f190111r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k.b f190112s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J f190113t;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.w$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<MY.d, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(MY.d dVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(dVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31983w(com.avito.android.arch.mvi.utils.o oVar, k.b bVar, Continuation continuation, J j12) {
        super(2, continuation);
        this.f190111r = oVar;
        this.f190112s = bVar;
        this.f190113t = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31983w c31983w = new C31983w(this.f190111r, this.f190112s, continuation, this.f190113t);
        c31983w.f190110q = obj;
        return c31983w;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MY.d> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C31983w) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        List<kotlin.Q<LocalMessage, Q1>> listB;
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f190110q;
        o.a aVar = this.f190111r.f92114c;
        new a(2, interfaceC43172j, InterfaceC43172j.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        J j12 = this.f190113t;
        j12.f189838u.s();
        Object obj2 = ((NY.h) aVar.getValue()).f11577b;
        if (!(obj2 instanceof NY.b)) {
            obj2 = null;
        }
        NY.b bVar = (NY.b) obj2;
        MessengerUserHashInfo f11554a = bVar != null ? bVar.getF11554a() : null;
        if (f11554a == null || (str = f11554a.f430682d) == null || C43066x.K(str)) {
            f11554a = null;
        }
        String str2 = j12.f189819b;
        Integer numBoxInt = str2 != null ? Boxing.boxInt(com.avito.android.messenger.conversation.mvi.messages.e0.d(str2)) : null;
        if (((NY.h) aVar.getValue()).f11577b instanceof f.a.d) {
            j12.f189836s.Hd(true);
        }
        if ((((NY.h) aVar.getValue()).f11579d instanceof f.b.AbstractC0740b.C0741b) && f11554a != null) {
            j12.f189838u.j();
            j12.f189822e.get().o9(f11554a, numBoxInt);
        }
        NY.h hVar = (NY.h) aVar.getValue();
        f.b.d.a aVar2 = new f.b.d.a(false);
        f.b.AbstractC0740b abstractC0740b = ((NY.h) aVar.getValue()).f11579d;
        NY.a aVar3 = (NY.a) (abstractC0740b instanceof NY.a ? abstractC0740b : null);
        if (aVar3 == null || (listB = aVar3.b()) == null) {
            listB = C42784z0.f406748b;
        }
        aVar.setValue(NY.h.a(hVar, null, null, aVar2, new f.b.AbstractC0740b.c(listB), f.b.a.C0738a.f11555a, null, 35));
        return kotlin.G0.f406611a;
    }
}
