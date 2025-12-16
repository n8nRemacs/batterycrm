package com.avito.android.mortgage_invite.participant.mvi;

import com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId;
import com.avito.android.mortgage_invite.participant.domain.model.ParticipantType;
import com.avito.android.mortgage_invite.participant.mvi.entity.ParticipantInternalAction;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import p20.C46879d;

/* compiled from: ParticipantActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.participant.mvi.ParticipantActor$process$8", f = "ParticipantActor.kt", i = {}, l = {102, 104}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ParticipantInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f206217q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f206218r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C46879d f206219s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f206220t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C46879d c46879d, i iVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f206219s = c46879d;
        this.f206220t = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f206219s, this.f206220t, continuation);
        hVar.f206218r = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ParticipantInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        PrintableText printableTextA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f206217q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f206218r;
            C46879d c46879d = this.f206219s;
            o20.c cVar = c46879d.f428146b;
            if (cVar == null) {
                return G0.f406611a;
            }
            i iVar = this.f206220t;
            iVar.f206223c.c();
            com.avito.android.mortgage_invite.participant.domain.validation.n nVar = iVar.f206221a;
            nVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            o20.c cVar2 = c46879d.f428146b;
            ArrayList arrayListH0 = C42745f0.h0(cVar2.f419326f.f419315b, cVar2.f419325e.f419315b);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : arrayListH0) {
                o20.d dVar = (o20.d) obj2;
                if (dVar.f419333f && dVar.f419332e) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o20.d dVar2 = (o20.d) it.next();
                ParticipantFieldId participantFieldId = dVar2.f419328a;
                ParticipantFieldId participantFieldId2 = ParticipantFieldId.f206099b;
                String str = dVar2.f419334g;
                if (participantFieldId == participantFieldId2) {
                    printableTextA = nVar.f206128f.a(str);
                } else if (!dVar2.f419336i) {
                    if (participantFieldId == ParticipantFieldId.f206107j) {
                        printableTextA = nVar.f206125c.a(str);
                    } else {
                        ParticipantType participantType = ParticipantType.f206113d;
                        ParticipantType participantType2 = dVar2.f419329b;
                        printableTextA = (participantType2 != participantType || participantFieldId == ParticipantFieldId.f206100c) ? C42756l.l0(new ParticipantFieldId[]{ParticipantFieldId.f206102e, ParticipantFieldId.f206104g, ParticipantFieldId.f206103f}).contains(participantFieldId) ? nVar.f206126d.a(str) : participantType2 == ParticipantType.f206114e ? nVar.f206127e.a(str) : nVar.f206124b.a(str) : nVar.f206123a.a(str);
                    }
                }
                if (printableTextA != null) {
                    linkedHashMap.put(participantFieldId, printableTextA);
                }
            }
            if (linkedHashMap.isEmpty()) {
                InterfaceC43160i<ParticipantInternalAction> interfaceC43160iA = iVar.f206222b.a(cVar, c46879d.f428147c);
                this.f206217q = 1;
                if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                ParticipantInternalAction.UpdateValidationResult updateValidationResult = new ParticipantInternalAction.UpdateValidationResult(linkedHashMap);
                this.f206217q = 2;
                if (interfaceC43172j.emit(updateValidationResult, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
