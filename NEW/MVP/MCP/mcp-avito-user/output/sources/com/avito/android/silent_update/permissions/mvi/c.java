package com.avito.android.silent_update.permissions.mvi;

import Ew0.C13539a;
import Fw0.InterfaceC13846a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.silent_update.permissions.mvi.entity.PermissionsInternalAction;
import com.avito.android.silent_update.permissions.mvi.entity.RequestState;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PermissionsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/silent_update/permissions/mvi/entity/PermissionsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.silent_update.permissions.mvi.PermissionsActor$process$1", f = "PermissionsActor.kt", i = {}, l = {AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 32, 39, 44, 63, 76, 89}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super PermissionsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f283722q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f283723r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13846a f283724s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Fw0.c f283725t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f283726u;

    /* compiled from: PermissionsActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[RequestState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RequestState requestState = RequestState.f283737b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RequestState requestState2 = RequestState.f283737b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                RequestState requestState3 = RequestState.f283737b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                RequestState requestState4 = RequestState.f283737b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC13846a interfaceC13846a, Fw0.c cVar, d dVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f283724s = interfaceC13846a;
        this.f283725t = cVar;
        this.f283726u = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        c cVar = new c(this.f283724s, this.f283725t, this.f283726u, continuation);
        cVar.f283723r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PermissionsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.f283722q) {
            case 0:
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f283723r;
                InterfaceC13846a.C0308a c0308a = InterfaceC13846a.C0308a.f6027a;
                InterfaceC13846a interfaceC13846a = this.f283724s;
                boolean zF2 = L.f(interfaceC13846a, c0308a);
                d dVar = this.f283726u;
                if (zF2) {
                    int iOrdinal = this.f283725t.f6040b.ordinal();
                    if (iOrdinal == 0) {
                        PermissionsInternalAction permissionsInternalActionC = !dVar.f283727a.c() ? PermissionsInternalAction.RequestStoragePermission.f283735b : dVar.c();
                        this.f283722q = 1;
                        if (interfaceC43172j.emit(permissionsInternalActionC, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            PermissionsInternalAction permissionsInternalActionC2 = dVar.c();
                            this.f283722q = 3;
                            if (interfaceC43172j.emit(permissionsInternalActionC2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (iOrdinal == 3 && dVar.f283727a.b()) {
                            PermissionsInternalAction.SendPermissionsResultAndFinish sendPermissionsResultAndFinishD = dVar.d();
                            this.f283722q = 4;
                            if (interfaceC43172j.emit(sendPermissionsResultAndFinishD, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else if (dVar.f283727a.c()) {
                        PermissionsInternalAction permissionsInternalActionC3 = dVar.c();
                        this.f283722q = 2;
                        if (interfaceC43172j.emit(permissionsInternalActionC3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (L.f(interfaceC13846a, InterfaceC13846a.g.f6033a)) {
                    Ew0.c cVar = dVar.f283728b;
                    if (!cVar.f4415b) {
                        cVar.f4415b = true;
                        cVar.f4414a.c(new Ew0.g(dVar.f283729c));
                        break;
                    }
                } else if (interfaceC13846a instanceof InterfaceC13846a.f) {
                    Ew0.c cVar2 = dVar.f283728b;
                    boolean z12 = ((InterfaceC13846a.f) interfaceC13846a).f6032a;
                    if (cVar2.f4415b && !cVar2.f4416c) {
                        cVar2.f4416c = true;
                        cVar2.f4414a.c(new Ew0.f(String.valueOf(z12), dVar.f283729c));
                    }
                    PermissionsInternalAction permissionsInternalActionC4 = dVar.c();
                    this.f283722q = 5;
                    if (interfaceC43172j.emit(permissionsInternalActionC4, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (L.f(interfaceC13846a, InterfaceC13846a.c.f6029a)) {
                    Ew0.c cVar3 = dVar.f283728b;
                    if (!cVar3.f4417d) {
                        cVar3.f4417d = true;
                        cVar3.f4414a.c(new Ew0.b(dVar.f283729c));
                        break;
                    }
                } else if (L.f(interfaceC13846a, InterfaceC13846a.b.f6028a)) {
                    Ew0.c cVar4 = dVar.f283728b;
                    com.avito.android.silent_update.permissions.i iVar = dVar.f283727a;
                    boolean zA2 = iVar.a();
                    if (cVar4.f4417d && !cVar4.f4418e) {
                        cVar4.f4418e = true;
                        cVar4.f4414a.c(new C13539a(String.valueOf(zA2), dVar.f283729c));
                    }
                    n nVarD = !iVar.b() ? PermissionsInternalAction.RequestInstallPermission.f283734b : dVar.d();
                    this.f283722q = 6;
                    if (interfaceC43172j.emit(nVarD, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (L.f(interfaceC13846a, InterfaceC13846a.e.f6031a)) {
                    Ew0.c cVar5 = dVar.f283728b;
                    if (!cVar5.f4419f) {
                        cVar5.f4419f = true;
                        cVar5.f4414a.c(new Ew0.i(dVar.f283729c));
                        break;
                    }
                } else if (L.f(interfaceC13846a, InterfaceC13846a.d.f6030a)) {
                    Ew0.c cVar6 = dVar.f283728b;
                    boolean zB2 = dVar.f283727a.b();
                    if (cVar6.f4419f && !cVar6.f4420g) {
                        cVar6.f4420g = true;
                        cVar6.f4414a.c(new Ew0.h(String.valueOf(zB2), dVar.f283729c));
                    }
                    PermissionsInternalAction.SendPermissionsResultAndFinish sendPermissionsResultAndFinishD2 = dVar.d();
                    this.f283722q = 7;
                    if (interfaceC43172j.emit(sendPermissionsResultAndFinishD2, this) == coroutine_suspended) {
                        return coroutine_suspended;
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
                C42729a0.b(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return G0.f406611a;
    }
}
