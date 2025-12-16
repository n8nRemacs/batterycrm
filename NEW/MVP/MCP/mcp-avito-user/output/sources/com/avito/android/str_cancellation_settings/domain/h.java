package com.avito.android.str_cancellation_settings.domain;

import Oy0.InterfaceC14756a;
import Py0.C14858b;
import Py0.C14859c;
import Py0.InterfaceC14857a;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrCancellationSettingsInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "LPy0/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_cancellation_settings.domain.StrCancellationSettingsInteractorImpl$applyStrCancellationSettings$1", f = "StrCancellationSettingsInteractor.kt", i = {}, l = {86, 85}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<InterfaceC14857a>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f288346q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f288347r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f288348s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f288349t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f288350u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Integer f288351v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Integer f288352w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Boolean f288353x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f288354y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f288355z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, String str, String str2, Integer num, Integer num2, Boolean bool, boolean z12, long j12, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f288348s = eVar;
        this.f288349t = str;
        this.f288350u = str2;
        this.f288351v = num;
        this.f288352w = num2;
        this.f288353x = bool;
        this.f288354y = z12;
        this.f288355z = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f288348s, this.f288349t, this.f288350u, this.f288351v, this.f288352w, this.f288353x, this.f288354y, this.f288355z, continuation);
        hVar.f288347r = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<InterfaceC14857a>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object objA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f288346q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f288347r;
            InterfaceC14756a interfaceC14756a = this.f288348s.f288335b;
            String str = this.f288350u;
            String str2 = this.f288349t;
            if (str2 == null) {
                str2 = str;
            }
            C14859c c14859c = new C14859c(str2, str);
            C14858b c14858b = new C14858b(this.f288353x, this.f288352w != null ? Boxing.boxLong(r7.intValue()) : null, this.f288354y, this.f288351v != null ? Boxing.boxLong(r7.intValue()) : null, this.f288355z, c14859c);
            this.f288347r = interfaceC43172j;
            this.f288346q = 1;
            objA = interfaceC14756a.a(c14858b, this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f288347r;
            C42729a0.b(obj);
            objA = obj;
        }
        this.f288347r = null;
        this.f288346q = 2;
        if (interfaceC43172j.emit(objA, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
