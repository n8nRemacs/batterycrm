package com.avito.android.mortgage_invite.participant.interactor;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId;
import g20.C40521b;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.T;
import o20.C44572a;

/* compiled from: ParticipantsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.participant.interactor.ParticipantsInteractorImpl$updateContactInfo$2", f = "ParticipantsInteractor.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f206156q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C44572a f206157r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f206158s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f206159t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C44572a c44572a, String str, e eVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f206157r = c44572a;
        this.f206158s = str;
        this.f206159t = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new f(this.f206157r, this.f206158s, this.f206159t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        String str;
        Object next;
        Object next2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f206156q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C44572a c44572a = this.f206157r;
            if (!c44572a.f419316c || (str = this.f206158s) == null) {
                return G0.f406611a;
            }
            List<o20.d> list = c44572a.f419315b;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((o20.d) next).f419328a == ParticipantFieldId.f206107j) {
                    break;
                }
            }
            o20.d dVar = (o20.d) next;
            if (dVar == null || dVar.f419336i) {
                dVar = null;
            }
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((o20.d) next2).f419328a == ParticipantFieldId.f206108k) {
                    break;
                }
            }
            o20.d dVar2 = (o20.d) next2;
            if (dVar2 == null || dVar2.f419336i) {
                dVar2 = null;
            }
            e eVar = this.f206159t;
            String str2 = dVar != null ? dVar.f419334g : null;
            String strConcat = dVar2 != null ? dVar2.f419334g : null;
            if (strConcat == null) {
                strConcat = null;
            } else if (!C43066x.h0(strConcat, "7", false) || strConcat.length() != 11) {
                strConcat = "7".concat(strConcat);
            }
            C40521b c40521b = new C40521b(null, str2, strConcat);
            this.f206156q = 1;
            if (eVar.f206144d.d(str, c40521b, this) == coroutine_suspended) {
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
