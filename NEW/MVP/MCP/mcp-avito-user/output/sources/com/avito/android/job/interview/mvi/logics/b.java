package com.avito.android.job.interview.mvi.logics;

import com.avito.android.job.interview.mvi.entity.InternalAction;
import com.avito.android.job.interview.mvi.logics.a;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
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
import kotlinx.coroutines.flow.InterfaceC43172j;
import vQ.C49251c;
import vQ.InterfaceC49249a;

/* compiled from: JobInterviewInvitationActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/job/interview/mvi/entity/InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.job.interview.mvi.logics.JobInterviewInvitationActor$process$1", f = "JobInterviewInvitationActor.kt", i = {}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, AvailableCode.ERROR_ON_ACTIVITY_RESULT, AvailableCode.ERROR_NO_ACTIVITY, 33, 34, 35, 36, 45, 51, 59, 63}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f174597q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f174598r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC49249a f174599s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C49251c f174600t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a f174601u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC49249a interfaceC49249a, C49251c c49251c, a aVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f174599s = interfaceC49249a;
        this.f174600t = c49251c;
        this.f174601u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f174599s, this.f174600t, this.f174601u, continuation);
        bVar.f174598r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.f174597q) {
            case 0:
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f174598r;
                InterfaceC49249a interfaceC49249a = this.f174599s;
                if (interfaceC49249a instanceof InterfaceC49249a.g) {
                    InternalAction.OpenLocationPicker openLocationPicker = new InternalAction.OpenLocationPicker(((InterfaceC49249a.g) interfaceC49249a).f440736a);
                    this.f174597q = 1;
                    if (interfaceC43172j.emit(openLocationPicker, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (interfaceC49249a instanceof InterfaceC49249a.h) {
                    InternalAction.OpenTimePicker openTimePicker = new InternalAction.OpenTimePicker(((InterfaceC49249a.h) interfaceC49249a).f440737a);
                    this.f174597q = 2;
                    if (interfaceC43172j.emit(openTimePicker, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    boolean z12 = interfaceC49249a instanceof InterfaceC49249a.f;
                    C49251c c49251c = this.f174600t;
                    if (z12) {
                        int i12 = ((InterfaceC49249a.f) interfaceC49249a).f440735a;
                        InternalAction.OpenDatePicker openDatePicker = new InternalAction.OpenDatePicker(i12, c49251c.f440743b.f174560a.get(i12));
                        this.f174597q = 3;
                        if (interfaceC43172j.emit(openDatePicker, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (interfaceC49249a instanceof InterfaceC49249a.e) {
                        InternalAction.ChangeLocation changeLocation = new InternalAction.ChangeLocation(((InterfaceC49249a.e) interfaceC49249a).f440734a);
                        this.f174597q = 4;
                        if (interfaceC43172j.emit(changeLocation, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (interfaceC49249a instanceof InterfaceC49249a.C12768a) {
                        InternalAction.ChangePhone changePhone = new InternalAction.ChangePhone(((InterfaceC49249a.C12768a) interfaceC49249a).f440727a);
                        this.f174597q = 5;
                        if (interfaceC43172j.emit(changePhone, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (interfaceC49249a instanceof InterfaceC49249a.j) {
                        InterfaceC49249a.j jVar = (InterfaceC49249a.j) interfaceC49249a;
                        InternalAction.ChangeTime changeTime = new InternalAction.ChangeTime(jVar.f440739a, jVar.f440740b);
                        this.f174597q = 6;
                        if (interfaceC43172j.emit(changeTime, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (interfaceC49249a instanceof InterfaceC49249a.c) {
                        InterfaceC49249a.c cVar = (InterfaceC49249a.c) interfaceC49249a;
                        InternalAction.ChangeDate changeDate = new InternalAction.ChangeDate(cVar.f440729a, cVar.f440731c, cVar.f440730b, cVar.f440732d);
                        this.f174597q = 7;
                        if (interfaceC43172j.emit(changeDate, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        boolean z13 = interfaceC49249a instanceof InterfaceC49249a.i;
                        a aVar = this.f174601u;
                        if (z13) {
                            k kVar = k.f174629a;
                            com.avito.android.job.interview.domain.e eVar = aVar.f174593a;
                            this.f174597q = 8;
                            if (kVar.b(interfaceC43172j, eVar, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (interfaceC49249a instanceof InterfaceC49249a.d) {
                            com.avito.android.job.interview.domain.i iVar = c49251c.f440743b;
                            aVar.getClass();
                            List<com.avito.android.job.interview.domain.a> list = iVar.f174560a;
                            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                            boolean z14 = true;
                            for (com.avito.android.job.interview.domain.a aVarA : list) {
                                if (aVarA.f174543e == null) {
                                    aVarA = com.avito.android.job.interview.domain.a.a(aVarA, null, 0, 0, null, null, null, false, 63);
                                    z14 = false;
                                }
                                arrayList.add(aVarA);
                            }
                            boolean z15 = iVar.f174561b != null;
                            a.AbstractC5150a c5151a = (z14 && z15) ? a.AbstractC5150a.b.f174596a : new a.AbstractC5150a.C5151a(arrayList, z15);
                            if (c5151a instanceof a.AbstractC5150a.C5151a) {
                                a.AbstractC5150a.C5151a c5151a2 = (a.AbstractC5150a.C5151a) c5151a;
                                InternalAction.InvalidData invalidData = new InternalAction.InvalidData(c5151a2.f174594a, c5151a2.f174595b);
                                this.f174597q = 9;
                                if (interfaceC43172j.emit(invalidData, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (c5151a instanceof a.AbstractC5150a.b) {
                                k kVar2 = k.f174629a;
                                this.f174597q = 10;
                                if (kVar2.a(interfaceC43172j, aVar.f174593a, iVar, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else if (interfaceC49249a instanceof InterfaceC49249a.b) {
                            InternalAction.CloseFlow closeFlow = InternalAction.CloseFlow.f174575b;
                            this.f174597q = 11;
                            if (interfaceC43172j.emit(closeFlow, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                C42729a0.b(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return G0.f406611a;
    }
}
