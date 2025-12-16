package com.avito.android.hotel_booking.enter_data.mvi;

import QI.a;
import com.avito.android.hotel_booking.Group;
import com.avito.android.hotel_booking.Input;
import com.avito.android.hotel_booking.enter_data.mvi.entity.EnterDataInternalAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EnterDataActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.hotel_booking.enter_data.mvi.EnterDataActor$process$1", f = "EnterDataActor.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super EnterDataInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f163556q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f163557r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ QI.c f163558s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ QI.a f163559t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(QI.c cVar, QI.a aVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f163558s = cVar;
        this.f163559t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f163558s, this.f163559t, continuation);
        bVar.f163557r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super EnterDataInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        ArrayList arrayList;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f163556q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f163557r;
            List<Group> list = this.f163558s.f13665b;
            ArrayList arrayList2 = null;
            if (list != null) {
                List<Group> list2 = list;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
                for (Group groupA : list2) {
                    String str = groupA.f163212b;
                    a.c cVar = (a.c) this.f163559t;
                    if (L.f(str, cVar.f13657b)) {
                        List<Input> listC = groupA.c();
                        if (listC != null) {
                            List<Input> list3 = listC;
                            arrayList = new ArrayList(C42745f0.q(list3, 10));
                            for (Input inputA : list3) {
                                if (L.f(inputA.getId(), cVar.f13656a)) {
                                    String str2 = cVar.f13658c;
                                    inputA = Input.a(inputA, str2 != null ? C43066x.A0(str2).toString() : null, null, 29);
                                }
                                arrayList.add(inputA);
                            }
                        } else {
                            arrayList = null;
                        }
                        groupA = Group.a(groupA, null, arrayList, 3);
                    }
                    arrayList3.add(groupA);
                }
                arrayList2 = arrayList3;
            }
            EnterDataInternalAction.UpdateGroups updateGroups = new EnterDataInternalAction.UpdateGroups(arrayList2);
            this.f163556q = 1;
            if (interfaceC43172j.emit(updateGroups, this) == coroutine_suspended) {
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
